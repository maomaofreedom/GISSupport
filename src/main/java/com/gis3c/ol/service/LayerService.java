package com.gis3c.ol.service;


import com.gis3c.ol.entity.Layer;
import com.gis3c.ol.entity.LayerSource;
import com.gis3c.ol.entity.MapLayer;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by hukekuan on 2017/12/15.
 */
public interface LayerService {
    public List<LayerSource> findLayerList();

    /**
     * 获取地图中需要设置的图层列表
     * @return
     */
    public List<Layer> findSimpleLayerList();
    public List<java.util.Map<String,Object>> findLayersByPage(Integer pageSize,Integer currentPage);

    public Layer findeLayerById(String layerId);
    public Layer findeLayerByName(String layerName);
    public List<LayerSource> findLayerByIds(String[] layerIds);
    public Integer findLayerCount();
    public Integer insertLayer(Layer layer);
    public Integer bindSource(String layerId,String sourceId,java.util.Map<String,Object> options);
    public Integer deleteLayersById(Set<String> layerIds);
}
