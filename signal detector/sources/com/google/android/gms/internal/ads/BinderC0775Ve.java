package com.google.android.gms.internal.ads;

import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.Ve, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0775Ve extends AbstractBinderC0707Re {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12037a;

    /* renamed from: b, reason: collision with root package name */
    public final j2.u f12038b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12039c;

    public /* synthetic */ BinderC0775Ve(j2.u uVar, Object obj, int i) {
        this.f12037a = i;
        this.f12038b = uVar;
        this.f12039c = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0724Se
    public final void a(C2852x0 c2852x0) {
        switch (this.f12037a) {
            case 0:
                E2.b bVar = (E2.b) this.f12038b;
                if (bVar != null) {
                    bVar.c(c2852x0.b());
                    break;
                }
                break;
            default:
                C0700Qo c0700Qo = (C0700Qo) this.f12038b;
                if (c0700Qo != null) {
                    c0700Qo.c(c2852x0.b());
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0724Se
    public final void b() {
        C0890af c0890af;
        switch (this.f12037a) {
            case 0:
                E2.b bVar = (E2.b) this.f12038b;
                if (bVar != null) {
                    bVar.f((C0758Ue) this.f12039c);
                    break;
                }
                break;
            default:
                C0700Qo c0700Qo = (C0700Qo) this.f12038b;
                if (c0700Qo != null && (c0890af = (C0890af) this.f12039c) != null) {
                    c0700Qo.f(c0890af);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0724Se
    public final void t(int i) {
        int i3 = this.f12037a;
    }

    private final void K3(int i) {
    }

    private final void L3(int i) {
    }
}
