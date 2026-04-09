package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.jw0;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class wt0 implements dw0, dw0.a {

    /* renamed from: b, reason: collision with root package name */
    public final jw0.b f35050b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35051c;

    /* renamed from: d, reason: collision with root package name */
    private final vc f35052d;

    /* renamed from: e, reason: collision with root package name */
    private jw0 f35053e;

    /* renamed from: f, reason: collision with root package name */
    private dw0 f35054f;

    /* renamed from: g, reason: collision with root package name */
    private dw0.a f35055g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f35056h;
    private long i = -9223372036854775807L;

    public interface a {
        void a(jw0.b bVar);

        void a(jw0.b bVar, IOException iOException);
    }

    public wt0(jw0.b bVar, vc vcVar, long j4) {
        this.f35050b = bVar;
        this.f35052d = vcVar;
        this.f35051c = j4;
    }

    public final void a(jw0.b bVar) {
        long j4 = this.f35051c;
        long j10 = this.i;
        if (j10 != -9223372036854775807L) {
            j4 = j10;
        }
        jw0 jw0Var = this.f35053e;
        jw0Var.getClass();
        dw0 dw0VarA = jw0Var.a(bVar, this.f35052d, j4);
        this.f35054f = dw0VarA;
        if (this.f35055g != null) {
            dw0VarA.a(this, j4);
        }
    }

    public final long b() {
        return this.f35051c;
    }

    public final void c() {
        if (this.f35054f != null) {
            jw0 jw0Var = this.f35053e;
            jw0Var.getClass();
            jw0Var.a(this.f35054f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final boolean continueLoading(long j4) {
        dw0 dw0Var = this.f35054f;
        return dw0Var != null && dw0Var.continueLoading(j4);
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void discardBuffer(long j4, boolean z10) {
        dw0 dw0Var = this.f35054f;
        int i = s82.f32899a;
        dw0Var.discardBuffer(j4, z10);
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final long getBufferedPositionUs() {
        dw0 dw0Var = this.f35054f;
        int i = s82.f32899a;
        return dw0Var.getBufferedPositionUs();
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final long getNextLoadPositionUs() {
        dw0 dw0Var = this.f35054f;
        int i = s82.f32899a;
        return dw0Var.getNextLoadPositionUs();
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final m52 getTrackGroups() {
        dw0 dw0Var = this.f35054f;
        int i = s82.f32899a;
        return dw0Var.getTrackGroups();
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final boolean isLoading() {
        dw0 dw0Var = this.f35054f;
        return dw0Var != null && dw0Var.isLoading();
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void maybeThrowPrepareError() throws IOException {
        dw0 dw0Var = this.f35054f;
        if (dw0Var != null) {
            dw0Var.maybeThrowPrepareError();
            return;
        }
        jw0 jw0Var = this.f35053e;
        if (jw0Var != null) {
            jw0Var.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final long readDiscontinuity() {
        dw0 dw0Var = this.f35054f;
        int i = s82.f32899a;
        return dw0Var.readDiscontinuity();
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final void reevaluateBuffer(long j4) {
        dw0 dw0Var = this.f35054f;
        int i = s82.f32899a;
        dw0Var.reevaluateBuffer(j4);
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final long seekToUs(long j4) {
        dw0 dw0Var = this.f35054f;
        int i = s82.f32899a;
        return dw0Var.seekToUs(j4);
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final long a(long j4, uw1 uw1Var) {
        dw0 dw0Var = this.f35054f;
        int i = s82.f32899a;
        return dw0Var.a(j4, uw1Var);
    }

    public final long a() {
        return this.i;
    }

    @Override // com.yandex.mobile.ads.impl.bx1.a
    public final void a(bx1 bx1Var) {
        dw0.a aVar = this.f35055g;
        int i = s82.f32899a;
        aVar.a((dw0.a) this);
    }

    @Override // com.yandex.mobile.ads.impl.dw0.a
    public final void a(dw0 dw0Var) {
        dw0.a aVar = this.f35055g;
        int i = s82.f32899a;
        aVar.a((dw0) this);
    }

    public final void a(long j4) {
        this.i = j4;
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void a(dw0.a aVar, long j4) {
        this.f35055g = aVar;
        dw0 dw0Var = this.f35054f;
        if (dw0Var != null) {
            long j10 = this.f35051c;
            long j11 = this.i;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            dw0Var.a(this, j10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final long a(c70[] c70VarArr, boolean[] zArr, ft1[] ft1VarArr, boolean[] zArr2, long j4) {
        long j10;
        long j11 = this.i;
        if (j11 == -9223372036854775807L || j4 != this.f35051c) {
            j10 = j4;
        } else {
            this.i = -9223372036854775807L;
            j10 = j11;
        }
        dw0 dw0Var = this.f35054f;
        int i = s82.f32899a;
        return dw0Var.a(c70VarArr, zArr, ft1VarArr, zArr2, j10);
    }

    public final void a(jw0 jw0Var) {
        if (this.f35053e == null) {
            this.f35053e = jw0Var;
            return;
        }
        throw new IllegalStateException();
    }
}
