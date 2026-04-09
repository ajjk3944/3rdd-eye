package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w20 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17848a;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f17849b;

    /* renamed from: c, reason: collision with root package name */
    public final v40 f17850c;

    public /* synthetic */ w20(v40 v40Var, js1 js1Var, int i4) {
        this.f17848a = i4;
        this.f17850c = v40Var;
        this.f17849b = js1Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f17848a) {
            case 0:
                return new v20(this.f17850c.b(), ((h10) this.f17849b).a());
            case 1:
                return new r50(this.f17850c.b());
            case 2:
                return new v80(this.f17850c.b(), (ct0) this.f17849b.a());
            default:
                return new r80((Context) this.f17849b.a(), new HashSet(), this.f17850c.b());
        }
    }

    public /* synthetic */ w20(es1 es1Var, v40 v40Var, int i4) {
        this.f17848a = i4;
        this.f17849b = es1Var;
        this.f17850c = v40Var;
    }
}
