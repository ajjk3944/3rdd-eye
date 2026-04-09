package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rq1;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public final class s22 extends op1<String> {

    /* renamed from: s, reason: collision with root package name */
    private final Object f32852s;

    /* renamed from: t, reason: collision with root package name */
    private rq1.b<String> f32853t;

    public s22(String str, rq1.b bVar, rq1.a aVar) {
        super(0, str, aVar);
        this.f32852s = new Object();
        this.f32853t = bVar;
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final void a() {
        super.a();
        synchronized (this.f32852s) {
            this.f32853t = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final void a(String str) {
        rq1.b<String> bVar;
        String str2 = str;
        synchronized (this.f32852s) {
            bVar = this.f32853t;
        }
        if (bVar != null) {
            bVar.a(str2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final rq1<String> a(nc1 nc1Var) {
        String str;
        try {
            str = new String(nc1Var.f30836b, hh0.a(nc1Var.f30837c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(nc1Var.f30836b);
        }
        return rq1.a(str, hh0.a(nc1Var));
    }
}
