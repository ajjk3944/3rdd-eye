package com.applovin.impl;

import com.applovin.impl.s3;
import com.applovin.impl.s4;
import com.applovin.impl.u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class x8 implements s4.b, s.a, u0.c, s3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6197b;

    public /* synthetic */ x8(int i4, Object obj) {
        this.f6196a = i4;
        this.f6197b = obj;
    }

    @Override // com.applovin.impl.s3.b
    public Object a(Object obj) {
        return u3.a((Long) this.f6197b, (Long) obj);
    }

    @Override // s.a
    public Object apply(Object obj) {
        switch (this.f6196a) {
            case 1:
                return ((o7) this.f6197b).s((h5) obj);
            default:
                return ((y2) this.f6197b).c((h5) obj);
        }
    }

    @Override // com.applovin.impl.u0.c
    public void a(u0.b bVar) {
        ((u0) this.f6197b).a(bVar);
    }

    @Override // com.applovin.impl.s4.b
    public void a(boolean z3, Object obj, Object obj2) {
        switch (this.f6196a) {
            case 0:
                ((c6) this.f6197b).a(z3, (p2) obj, (Exception) obj2);
                break;
            case 1:
            default:
                ((w1) this.f6197b).a(z3, (Void) obj, (Void) obj2);
                break;
            case 2:
                s4.a((s4.a) this.f6197b, z3, obj, obj2);
                break;
            case 3:
                s4.a((Runnable) this.f6197b, z3, obj, obj2);
                break;
        }
    }
}
