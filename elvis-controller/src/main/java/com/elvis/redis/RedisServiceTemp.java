package com.elvis.redis;

import com.elvis.entity.user.AccessAuthEntity;
import com.elvis.entity.user.UserEntity;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author JackRen
 * @date 2017/11/14 下午2:57
 * @description
 */
public class RedisServiceTemp {

    public static Map<String, AccessAuthEntity> accessAuthMap = Maps.newHashMap();

    public static Map<String, UserEntity> userMap = Maps.newHashMap();
}
