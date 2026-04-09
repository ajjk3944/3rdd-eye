package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zw0 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19207b;

    /* renamed from: c, reason: collision with root package name */
    public int f19208c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf0 f19209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw0(yf0 yf0Var, ck.c cVar, int i4) {
        super(2, cVar);
        this.f19207b = i4;
        this.f19209d = yf0Var;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f19207b) {
            case 0:
                return new zw0(this.f19209d, cVar, 0);
            case 1:
                return new zw0(this.f19209d, cVar, 1);
            case 2:
                return new zw0(this.f19209d, cVar, 2);
            case 3:
                return new zw0(this.f19209d, cVar, 3);
            case 4:
                return new zw0(this.f19209d, cVar, 4);
            default:
                return new zw0(this.f19209d, cVar, 5);
        }
    }

    @Override // mk.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f19207b) {
        }
        return ((zw0) create(vVar, cVar)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19207b) {
            case 0:
                int i4 = this.f19208c;
                ci.b.D(obj);
                if (i4 == 0) {
                    this.f19208c = 1;
                    Object objI = this.f19209d.i(this);
                    dk.a aVar = dk.a.f22275a;
                    if (objI == aVar) {
                    }
                }
                break;
            case 1:
                int i10 = this.f19208c;
                ci.b.D(obj);
                if (i10 == 0) {
                    this.f19208c = 1;
                    Object objM = this.f19209d.m(this);
                    dk.a aVar2 = dk.a.f22275a;
                    if (objM == aVar2) {
                    }
                }
                break;
            case 2:
                int i11 = this.f19208c;
                ci.b.D(obj);
                if (i11 == 0) {
                    this.f19208c = 1;
                    Object objK = this.f19209d.k(this);
                    dk.a aVar3 = dk.a.f22275a;
                    if (objK == aVar3) {
                    }
                }
                break;
            case 3:
                int i12 = this.f19208c;
                ci.b.D(obj);
                if (i12 == 0) {
                    this.f19208c = 1;
                    Object objF = this.f19209d.f(this);
                    dk.a aVar4 = dk.a.f22275a;
                    if (objF == aVar4) {
                    }
                }
                break;
            case 4:
                int i13 = this.f19208c;
                ci.b.D(obj);
                if (i13 == 0) {
                    this.f19208c = 1;
                    Object objL = this.f19209d.l(this);
                    dk.a aVar5 = dk.a.f22275a;
                    if (objL == aVar5) {
                    }
                }
                break;
            default:
                int i14 = this.f19208c;
                ci.b.D(obj);
                if (i14 == 0) {
                    this.f19208c = 1;
                    Object objJ = this.f19209d.j(this);
                    dk.a aVar6 = dk.a.f22275a;
                    if (objJ == aVar6) {
                    }
                }
                break;
        }
        return yj.u.f37649a;
    }
}
