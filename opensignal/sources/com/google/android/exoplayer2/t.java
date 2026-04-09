package com.google.android.exoplayer2;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4551a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f4552d;

    public /* synthetic */ t(y yVar, int i10) {
        this.f4551a = i10;
        this.f4552d = yVar;
    }

    @Override // qb.h, a5.j
    public void a(Object obj) {
        d1 d1Var = (d1) obj;
        switch (this.f4551a) {
            case 1:
                d1Var.onMediaMetadataChanged(this.f4552d.X);
                break;
            default:
                d1Var.onAvailableCommandsChanged(this.f4552d.W);
                break;
        }
    }
}
