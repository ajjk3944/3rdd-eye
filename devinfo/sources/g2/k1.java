package g2;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final x.u f24368a;

    /* renamed from: b, reason: collision with root package name */
    public static final i1[] f24369b;

    static {
        x.u uVar = new x.u(8);
        i1.f24359a.getClass();
        j1 j1Var = h1.g;
        uVar.h(1, j1Var);
        j1 j1Var2 = h1.f24355f;
        uVar.h(2, j1Var2);
        j1 j1Var3 = h1.f24351b;
        uVar.h(4, j1Var3);
        j1 j1Var4 = h1.f24353d;
        uVar.h(8, j1Var4);
        j1 j1Var5 = h1.f24356h;
        uVar.h(16, j1Var5);
        j1 j1Var6 = h1.f24354e;
        uVar.h(32, j1Var6);
        j1 j1Var7 = h1.f24357i;
        uVar.h(64, j1Var7);
        j1 j1Var8 = h1.f24352c;
        uVar.h(128, j1Var8);
        f24368a = uVar;
        f24369b = new i1[]{j1Var, j1Var2, j1Var3, j1Var7, j1Var5, j1Var6, j1Var4, h1.j, j1Var8};
    }

    public static final void a(i2.j0 j0Var, o oVar, long j, int i4, int i10) {
        if (n0.e(j, -1L)) {
            return;
        }
        float f10 = (int) ((j >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        float f11 = (int) ((j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        float f12 = i4 - ((int) ((j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        float f13 = i10 - ((int) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        j0Var.b(oVar.b(), f10);
        j0Var.b(oVar.d(), f11);
        j0Var.b(oVar.c(), f12);
        j0Var.b(oVar.a(), f13);
    }
}
