package p4;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements xk.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31307c;

    public /* synthetic */ s0(int i4, Object obj, Object obj2) {
        this.f31305a = i4;
        this.f31306b = obj;
        this.f31307c = obj2;
    }

    @Override // xk.i0
    public final void a() {
        switch (this.f31305a) {
            case 0:
                String str = (String) this.f31306b;
                c2.w wVar = (c2.w) this.f31307c;
                synchronized (t0.f31314b) {
                    LinkedHashMap linkedHashMap = t0.f31315c;
                    t0 t0Var = (t0) linkedHashMap.get(str);
                    if (t0Var != null) {
                        t0Var.f31316a.remove(wVar);
                        if (t0Var.f31316a.isEmpty()) {
                            linkedHashMap.remove(str);
                            t0Var.stopWatching();
                        }
                    }
                }
                return;
            default:
                yk.d dVar = (yk.d) this.f31306b;
                dVar.f37655c.removeCallbacks((Runnable) this.f31307c);
                return;
        }
    }
}
