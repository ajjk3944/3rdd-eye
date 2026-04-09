package com.mbridge.msdk.tracker.network.toolbox;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final int f18381a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.mbridge.msdk.tracker.network.g> f18382b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18383c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f18384d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f18385e;

    public g(int i10, List<com.mbridge.msdk.tracker.network.g> list) {
        this(i10, list, -1, null);
    }

    public final InputStream a() {
        InputStream inputStream = this.f18384d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f18385e != null) {
            return new ByteArrayInputStream(this.f18385e);
        }
        return null;
    }

    public final int b() {
        return this.f18383c;
    }

    public final List<com.mbridge.msdk.tracker.network.g> c() {
        return Collections.unmodifiableList(this.f18382b);
    }

    public final int d() {
        return this.f18381a;
    }

    public g(int i10, List<com.mbridge.msdk.tracker.network.g> list, int i11, InputStream inputStream) {
        this.f18381a = i10;
        this.f18382b = list;
        this.f18383c = i11;
        this.f18384d = inputStream;
        this.f18385e = null;
    }
}
