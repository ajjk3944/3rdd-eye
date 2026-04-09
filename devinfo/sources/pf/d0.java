package pf;

import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31795a;

    /* renamed from: b, reason: collision with root package name */
    public final yj.n f31796b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31797c;

    /* renamed from: d, reason: collision with root package name */
    public final yj.n f31798d;

    /* renamed from: e, reason: collision with root package name */
    public final yj.n f31799e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31800f;

    public d0(Context context, h1 h1Var) {
        nk.k.e(context, "appContext");
        nk.k.e(h1Var, "uuidGenerator");
        this.f31795a = context;
        final int i4 = 0;
        this.f31796b = a.a.u(new mk.a(this) { // from class: pf.c0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f31780b;

            {
                this.f31780b = this;
            }

            @Override // mk.a
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return ((f0) this.f31780b.f31799e.getValue()).f31814a;
                    default:
                        return g0.b(this.f31780b.f31795a);
                }
            }
        });
        this.f31797c = Process.myPid();
        this.f31798d = a.a.u(new a6.e(17, h1Var));
        final int i10 = 1;
        this.f31799e = a.a.u(new mk.a(this) { // from class: pf.c0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f31780b;

            {
                this.f31780b = this;
            }

            @Override // mk.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ((f0) this.f31780b.f31799e.getValue()).f31814a;
                    default:
                        return g0.b(this.f31780b.f31795a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.f31796b.getValue();
    }

    public final Map b(Map map) {
        yj.n nVar = this.f31798d;
        if (map == null) {
            return zj.w.I(new yj.i(a(), new b0(Process.myPid(), (String) nVar.getValue())));
        }
        LinkedHashMap linkedHashMapM = zj.w.M(map);
        linkedHashMapM.put(a(), new b0(Process.myPid(), (String) nVar.getValue()));
        return zj.w.L(linkedHashMapM);
    }
}
