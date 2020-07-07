package com.wongwill.scoredataanalysis.controller;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

public class QiutanPageProcessor implements PageProcessor {
    @Override
    public void process(Page page) {
        System.out.println(page.getHtml());

    }

    @Override
    public Site getSite() {
        return Site.me();
    }

    public static void main(String[] args) {
        Spider.create(new QiutanPageProcessor())
                .addUrl("http://live.win007.com/")
                .run();
    }

}
