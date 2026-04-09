package com.google.android.exoplayer2;

import android.os.Handler;

/* loaded from: classes.dex */
public final class l implements qb.l, d5.f0 {
    public Object B;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4222a = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4223d = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4224g;

    /* renamed from: r, reason: collision with root package name */
    public final Object f4225r;

    /* renamed from: x, reason: collision with root package name */
    public final Handler.Callback f4226x;

    /* renamed from: y, reason: collision with root package name */
    public Object f4227y;

    public l(d5.e0 e0Var, a5.b bVar) {
        this.f4226x = e0Var;
        this.f4225r = new d5.y0(bVar);
    }

    @Override // qb.l, d5.f0
    public final long a() {
        switch (this.f4222a) {
            case 0:
                if (this.f4223d) {
                    return ((d5.y0) this.f4225r).a();
                }
                qb.l lVar = (qb.l) this.B;
                lVar.getClass();
                return lVar.a();
            default:
                if (this.f4223d) {
                    return ((d5.y0) this.f4225r).a();
                }
                d5.f0 f0Var = (d5.f0) this.B;
                f0Var.getClass();
                return f0Var.a();
        }
    }

    @Override // qb.l
    public void b(b1 b1Var) {
        qb.l lVar = (qb.l) this.B;
        if (lVar != null) {
            lVar.b(b1Var);
            b1Var = ((qb.l) this.B).mo6getPlaybackParameters();
        }
        ((d5.y0) this.f4225r).b(b1Var);
    }

    @Override // d5.f0
    public androidx.media3.common.n0 getPlaybackParameters() {
        d5.f0 f0Var = (d5.f0) this.B;
        return f0Var != null ? f0Var.getPlaybackParameters() : (androidx.media3.common.n0) ((d5.y0) this.f4225r).f7110y;
    }

    @Override // d5.f0
    public void setPlaybackParameters(androidx.media3.common.n0 n0Var) {
        d5.f0 f0Var = (d5.f0) this.B;
        if (f0Var != null) {
            f0Var.setPlaybackParameters(n0Var);
            n0Var = ((d5.f0) this.B).getPlaybackParameters();
        }
        ((d5.y0) this.f4225r).setPlaybackParameters(n0Var);
    }

    public l(f0 f0Var, qb.a aVar) {
        this.f4226x = f0Var;
        this.f4225r = new d5.y0(aVar);
    }

    @Override // qb.l
    /* renamed from: getPlaybackParameters, reason: collision with other method in class */
    public b1 mo6getPlaybackParameters() {
        qb.l lVar = (qb.l) this.B;
        if (lVar != null) {
            return lVar.mo6getPlaybackParameters();
        }
        return (b1) ((d5.y0) this.f4225r).f7110y;
    }
}
