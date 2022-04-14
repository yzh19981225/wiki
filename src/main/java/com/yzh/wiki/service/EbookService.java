package com.yzh.wiki.service;

import com.yzh.wiki.domain.Ebook;
import com.yzh.wiki.domain.EbookExample;
import com.yzh.wiki.mapper.EbookMapper;
import com.yzh.wiki.req.EbookReq;
import com.yzh.wiki.resp.EbookResp;
import com.yzh.wiki.util.CopyUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if (!ObjectUtils.isEmpty(req.getName())){
            criteria.andNameLike("%"+req.getName()+"%");
        }
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        List<EbookResp> respList = CopyUtil.copyList(ebookList, EbookResp.class);
        return respList;

    }

}
