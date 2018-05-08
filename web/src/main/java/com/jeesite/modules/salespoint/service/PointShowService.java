package com.jeesite.modules.salespoint.service;

import com.jeesite.common.service.CrudService;
import com.jeesite.modules.salespoint.dao.SalesPointsDao;
import com.jeesite.modules.salespoint.entity.SalesPoints;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointShowService extends CrudService<SalesPointsDao,SalesPoints> implements IPointShowService{
    @Override
    public List<SalesPoints> getInfoSalePointList() {
        SalesPoints sp = new SalesPoints();

        return this.dao.findList(sp);
    }
}
