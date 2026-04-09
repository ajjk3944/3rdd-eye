package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ke0 implements de0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f13142a;

    /* renamed from: b, reason: collision with root package name */
    public final mx0 f13143b;

    /* renamed from: c, reason: collision with root package name */
    public final sp0 f13144c;

    public ke0(long j, Context context, mx0 mx0Var, k10 k10Var, String str) {
        this.f13142a = j;
        this.f13143b = mx0Var;
        this.f13144c = (sp0) ((es1) new l90(k10Var.f12924b, context, str).f13427c).a();
    }

    @Override // com.google.android.gms.internal.ads.de0
    public final void a() {
        try {
            sp0 sp0Var = this.f13144c;
            sp0Var.Y2(new je0(this));
            sp0Var.I2(new vb.b(null));
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.de0
    public final void b(va.z2 z2Var) {
        try {
            this.f13144c.v2(z2Var, new ie0(this));
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.de0
    public final void zzc() {
    }
}
