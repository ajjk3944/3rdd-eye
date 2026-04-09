package io.appmetrica.analytics.network.internal;

import io.appmetrica.analytics.network.impl.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class Response {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f42371a;

    /* renamed from: b, reason: collision with root package name */
    private final int f42372b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f42373c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f42374d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f42375e;

    /* renamed from: f, reason: collision with root package name */
    private final Throwable f42376f;

    public Response(Throwable th) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th);
    }

    public int getCode() {
        return this.f42372b;
    }

    public byte[] getErrorData() {
        return this.f42374d;
    }

    public Throwable getException() {
        return this.f42376f;
    }

    public Map<String, List<String>> getHeaders() {
        return this.f42375e;
    }

    public byte[] getResponseData() {
        return this.f42373c;
    }

    public boolean isCompleted() {
        return this.f42371a;
    }

    public String toString() {
        return "Response{completed=" + this.f42371a + ", code=" + this.f42372b + ", responseDataLength=" + this.f42373c.length + ", errorDataLength=" + this.f42374d.length + ", headers=" + this.f42375e + ", exception=" + this.f42376f + '}';
    }

    public Response(boolean z10, int i, byte[] bArr, byte[] bArr2, Map<String, List<String>> map, Throwable th) {
        this.f42371a = z10;
        this.f42372b = i;
        this.f42373c = bArr;
        this.f42374d = bArr2;
        this.f42375e = map == null ? Collections.EMPTY_MAP : e.a(map);
        this.f42376f = th;
    }
}
