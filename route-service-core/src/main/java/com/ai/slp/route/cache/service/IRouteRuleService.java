package com.ai.slp.route.cache.service;

import com.ai.slp.route.cache.dto.RouteRule;

import java.sql.SQLException;

/**
 * Created by xin on 16-5-3.
 */
public interface IRouteRuleService {
    RouteRule queryRouteRuleById(String ruleId) throws SQLException;
}