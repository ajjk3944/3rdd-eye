package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class e<T> implements p<T> {

    /* renamed from: a, reason: collision with root package name */
    long f13427a;

    /* renamed from: b, reason: collision with root package name */
    com.mbridge.msdk.config.component.load.downloader.b<T> f13428b;

    /* renamed from: c, reason: collision with root package name */
    com.mbridge.msdk.config.component.load.downloader.c f13429c = com.mbridge.msdk.config.component.load.downloader.c.MEDIUM;

    /* renamed from: d, reason: collision with root package name */
    com.mbridge.msdk.config.component.load.downloader.h f13430d;

    /* renamed from: e, reason: collision with root package name */
    Map<String, String> f13431e;

    /* renamed from: f, reason: collision with root package name */
    HashMap<String, List<String>> f13432f;

    /* renamed from: g, reason: collision with root package name */
    long f13433g;

    /* renamed from: h, reason: collision with root package name */
    int f13434h;

    /* renamed from: i, reason: collision with root package name */
    long f13435i;

    /* renamed from: j, reason: collision with root package name */
    String f13436j;

    /* renamed from: k, reason: collision with root package name */
    long f13437k;

    public e(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        this.f13428b = bVar;
    }

    public e<T> a(long j10) {
        this.f13427a = j10;
        return this;
    }

    public e<T> b(long j10) {
        this.f13433g = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public d<T> build() {
        return d.a(this);
    }

    public p<T> c(long j10) {
        this.f13437k = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p<T> withTimeout(long j10) {
        this.f13435i = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e<T> withHttpRetryCounter(int i10) {
        this.f13434h = i10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p<T> a(com.mbridge.msdk.config.component.load.downloader.h hVar) {
        this.f13430d = hVar;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p<T> a(com.mbridge.msdk.config.component.load.downloader.c cVar) {
        this.f13429c = cVar;
        return this;
    }
}
