package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import q2.C2841s;
import t2.C2909E;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Nj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644Nj implements InterfaceC0730Sk, InterfaceC0425Al {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10043a;

    /* renamed from: b, reason: collision with root package name */
    public final C0960bu f10044b;

    /* renamed from: c, reason: collision with root package name */
    public final C2951a f10045c;

    /* renamed from: d, reason: collision with root package name */
    public final C2909E f10046d;

    /* renamed from: e, reason: collision with root package name */
    public final C2087wo f10047e;

    /* renamed from: f, reason: collision with root package name */
    public final Yu f10048f;

    /* renamed from: g, reason: collision with root package name */
    public final C0581Jo f10049g;

    public C0644Nj(Context context, C0960bu c0960bu, C2951a c2951a, C2909E c2909e, C2087wo c2087wo, Yu yu, C0581Jo c0581Jo) {
        this.f10043a = context;
        this.f10044b = c0960bu;
        this.f10045c = c2951a;
        this.f10046d = c2909e;
        this.f10047e = c2087wo;
        this.f10048f = yu;
        this.f10049g = c0581Jo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0730Sk
    public final void E(C1807re c1807re) throws JSONException {
        b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0425Al
    public final void a(A2.w wVar) throws JSONException {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8625K4)).booleanValue()) {
            b();
        }
    }

    public final void b() throws JSONException {
        String str;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8619J4)).booleanValue()) {
            String str2 = this.f10044b.f13485g;
            C0487Ef c0487EfS = this.f10046d.s();
            U1.b bVar = p2.j.f22785C.f22798l;
            boolean zG = this.f10049g.g();
            if (c0487EfS != null) {
                bVar.getClass();
                str = c0487EfS.f7975d;
            } else {
                str = null;
            }
            bVar.D(this.f10043a, this.f10045c, false, c0487EfS, str, str2, null, this.f10048f, null, null, zG);
        }
        this.f10047e.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0730Sk
    public final void w(Xt xt) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0425Al
    public final void x(String str) {
    }
}
