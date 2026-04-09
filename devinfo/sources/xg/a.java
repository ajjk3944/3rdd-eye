package xg;

import android.content.Context;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f37091b;

    public /* synthetic */ a(g gVar, int i4) {
        this.f37090a = i4;
        this.f37091b = gVar;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f37090a) {
            case 0:
                break;
            case 1:
                g gVar = this.f37091b;
                h hVarK0 = gVar.k0();
                Context contextW = gVar.W();
                hVarK0.getClass();
                hVarK0.i(contextW, 0, -2);
                break;
            case 2:
                g gVar2 = this.f37091b;
                h hVarK02 = gVar2.k0();
                Context contextW2 = gVar2.W();
                hVarK02.getClass();
                hVarK02.i(contextW2, 0, 2);
                break;
            case 3:
                g gVar3 = this.f37091b;
                h hVarK03 = gVar3.k0();
                Context contextW3 = gVar3.W();
                hVarK03.getClass();
                hVarK03.i(contextW3, -2, 0);
                break;
            default:
                g gVar4 = this.f37091b;
                h hVarK04 = gVar4.k0();
                Context contextW4 = gVar4.W();
                hVarK04.getClass();
                hVarK04.i(contextW4, 2, 0);
                break;
        }
        return u.f37649a;
    }
}
