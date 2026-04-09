package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class th0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vt0 f16821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f16822c;

    public /* synthetic */ th0(vt0 vt0Var, View view, int i4) {
        this.f16820a = i4;
        this.f16821b = vt0Var;
        this.f16822c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16820a) {
            case 0:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16040a6)).booleanValue() && jz.f12903z.f15871b) {
                    vt0 vt0Var = this.f16821b;
                    if (!vt0Var.f17704f) {
                        vt0Var.f17700b.a(this.f16822c, xt0.f18491a);
                        break;
                    }
                }
                break;
            default:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16040a6)).booleanValue() && jz.f12903z.f15871b) {
                    this.f16821b.b(this.f16822c);
                    break;
                }
                break;
        }
    }
}
