package com.yandex.mobile.ads.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class mh0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f30387a;

    /* renamed from: b, reason: collision with root package name */
    private final List<ef0> f30388b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30389c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f30390d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f30391e;

    public mh0(int i, ArrayList arrayList, int i10, InputStream inputStream) {
        this.f30387a = i;
        this.f30388b = arrayList;
        this.f30389c = i10;
        this.f30390d = inputStream;
        this.f30391e = null;
    }

    public final InputStream a() {
        InputStream inputStream = this.f30390d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f30391e != null) {
            return new ByteArrayInputStream(this.f30391e);
        }
        return null;
    }

    public final byte[] b() {
        return this.f30391e;
    }

    public final int c() {
        return this.f30389c;
    }

    public final List<ef0> d() {
        return Collections.unmodifiableList(this.f30388b);
    }

    public final int e() {
        return this.f30387a;
    }

    public mh0(int i, List<ef0> list, byte[] bArr) {
        this.f30387a = i;
        this.f30388b = list;
        this.f30389c = bArr.length;
        this.f30391e = bArr;
        this.f30390d = null;
    }
}
