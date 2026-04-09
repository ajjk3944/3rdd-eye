package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import q2.C2841s;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.ug, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1971ug extends G.m {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0828Yg f17143b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0454Cg f17144c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17145d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f17146e;

    public C1971ug(InterfaceC0828Yg interfaceC0828Yg, AbstractC0454Cg abstractC0454Cg, String str, String[] strArr) {
        super(4);
        this.f17143b = interfaceC0828Yg;
        this.f17144c = abstractC0454Cg;
        this.f17145d = str;
        this.f17146e = strArr;
        p2.j.f22785C.f22786A.f17315a.add(this);
    }

    @Override // G.m
    public final void j() {
        try {
            this.f17144c.c(this.f17145d, this.f17146e);
        } finally {
            C2911G.f23576l.post(new RunnableC1883t(21, this));
        }
    }

    @Override // G.m
    public final InterfaceFutureC2326a k() {
        return (((Boolean) C2841s.f23267e.f23270c.a(H9.f8831t2)).booleanValue() && (this.f17144c instanceof C0522Gg)) ? AbstractC0640Nf.f10010f.b(new J6(2, this)) : super.k();
    }
}
