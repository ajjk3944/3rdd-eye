package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class kv2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ lv2 g;

    public /* synthetic */ kv2(lv2 lv2Var, int i) {
        this.f = i;
        this.g = lv2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                lv2 lv2Var = this.g;
                pv2 pv2Var = ((mv2) lv2Var.h).a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) lv2Var.g;
                pv2Var.getClass();
                if (!concurrentHashMap.isEmpty()) {
                    pv2Var.b(concurrentHashMap);
                    String strA = pv2Var.f.a(concurrentHashMap);
                    gi2.G(strA);
                    if (((Boolean) tw1.e.c.a(mz1.Wd)).booleanValue() || pv2Var.e) {
                        pv2Var.c.execute(new qv2(pv2Var, strA, 1));
                        break;
                    }
                } else {
                    gi2.U("Empty paramMap.");
                    break;
                }
                break;
            case 1:
                lv2 lv2Var2 = this.g;
                ((mv2) lv2Var2.h).a.a((ConcurrentHashMap) lv2Var2.g, true);
                break;
            default:
                lv2 lv2Var3 = this.g;
                ((mv2) lv2Var3.h).a.a((ConcurrentHashMap) lv2Var3.g, false);
                break;
        }
    }
}
