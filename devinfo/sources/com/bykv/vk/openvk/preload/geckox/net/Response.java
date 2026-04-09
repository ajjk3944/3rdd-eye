package com.bykv.vk.openvk.preload.geckox.net;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class Response {
    public final String body;
    public final int code;
    public final Map<String, String> headers;
    public final String msg;

    public Response(Map<String, String> map, String str, int i4, String str2) {
        this.headers = map;
        this.body = str;
        this.code = i4;
        this.msg = str2;
    }
}
