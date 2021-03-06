package com.gis3c.ol.service;

import com.gis3c.ol.entity.Source;
import com.gis3c.ol.entity.TestStation;

import java.security.PublicKey;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by hukekuan on 2017/12/15.
 */
public interface SourceService {
    public List<Source> findAllList();
    public List<java.util.Map<String,Object>> findSourcesByPage(Integer pageSize,Integer currentPage);
    public Source findSourceById(String sourceId);
    public Source findSourceByName(String sourceName);
    public List<Source> findSourceByType(String[] sourceTypes,String projection);
    public Integer findSourceCount();

    public Integer insertSource(Source source);
    public Integer updateSource(Source source);
    public Integer deleteSourcesById(Set<String> sourceIds);

    public Integer insertTestStation(TestStation testStation);
    public List<TestStation> findTestStationList();
}
