package com.pattern.creational.builder;

public class VisitCartWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("VisitCart");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.Joomla);
    }

    @Override
    void buildPrice() {
        website.setPrice(100);
    }
}
