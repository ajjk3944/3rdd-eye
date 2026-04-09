package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zh implements eh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19085a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19086b;

    public zh(ai aiVar) {
        Objects.requireNonNull(aiVar);
        this.f19086b = aiVar;
    }

    @Override // com.google.android.gms.internal.ads.eh
    public final void S(boolean z3) {
        switch (this.f19085a) {
            case 0:
                ai aiVar = (ai) this.f19086b;
                if (!z3) {
                    aiVar.r();
                    break;
                } else {
                    aiVar.x();
                    break;
                }
            case 1:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16427z)).booleanValue()) {
                    ((gt0) this.f19086b).c(z3);
                    break;
                }
                break;
            default:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16427z)).booleanValue()) {
                    ((mt0) this.f19086b).d(z3);
                    break;
                }
                break;
        }
    }

    public zh(gt0 gt0Var) {
        Objects.requireNonNull(gt0Var);
        this.f19086b = gt0Var;
    }

    public zh(mt0 mt0Var) {
        Objects.requireNonNull(mt0Var);
        this.f19086b = mt0Var;
    }
}
