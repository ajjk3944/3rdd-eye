package com.bytedance.sdk.component.fkw.vt;

import com.bytedance.sdk.component.fkw.le;
import com.bytedance.sdk.component.fkw.ra;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh<T> implements le {
    private String fkw;

    /* renamed from: lh, reason: collision with root package name */
    private int f7488lh;
    Map<String, String> ouw;
    public ra vt;
    private T yu;

    public lh(int i4, T t10, String str) {
        this.f7488lh = i4;
        this.yu = t10;
        this.fkw = str;
    }

    @Override // com.bytedance.sdk.component.fkw.le
    public final Map<String, String> fkw() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.fkw.le
    public final T lh() {
        return this.yu;
    }

    @Override // com.bytedance.sdk.component.fkw.le
    public final ra ouw() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.fkw.le
    public final int vt() {
        return this.f7488lh;
    }

    @Override // com.bytedance.sdk.component.fkw.le
    public final String yu() {
        return this.fkw;
    }

    public lh(int i4, T t10, String str, Map<String, String> map) {
        this(i4, t10, str);
        this.ouw = map;
    }
}
