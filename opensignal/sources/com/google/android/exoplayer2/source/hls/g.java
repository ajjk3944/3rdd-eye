package com.google.android.exoplayer2.source.hls;

import java.util.List;

/* loaded from: classes.dex */
public final class g extends ab.b {

    /* renamed from: x, reason: collision with root package name */
    public final List f4482x;

    /* renamed from: y, reason: collision with root package name */
    public final long f4483y;

    public g(long j, List list) {
        super(0, 0L, list.size() - 1);
        this.f4483y = j;
        this.f4482x = list;
    }

    @Override // ab.n, p5.m
    public final long a() {
        c();
        return this.f4483y + ((db.j) this.f4482x.get((int) this.f287r)).f7233x;
    }

    @Override // ab.n, p5.m
    public final long b() {
        c();
        db.j jVar = (db.j) this.f4482x.get((int) this.f287r);
        return this.f4483y + jVar.f7233x + jVar.f7231g;
    }
}
