package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class br2 implements y32 {
    public final /* synthetic */ int f;
    public final WeakReference g;

    public /* synthetic */ br2(dr2 dr2Var, int i) {
        this.f = i;
        switch (i) {
            case 1:
                this.g = new WeakReference(dr2Var);
                break;
            default:
                this.g = new WeakReference(dr2Var);
                break;
        }
    }

    @Override // defpackage.y32
    public final void c(Object obj, Map map) {
        switch (this.f) {
            case 0:
                dr2 dr2Var = (dr2) this.g.get();
                if (dr2Var != null) {
                    wp2 wp2Var = dr2Var.n;
                    if ("_ac".equals((String) map.get("eventName"))) {
                        dr2Var.m.C();
                        if (((Boolean) tw1.e.c.a(mz1.Ab)).booleanValue()) {
                            wp2Var.s0();
                            if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                                wp2Var.U0();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                dr2 dr2Var2 = (dr2) this.g.get();
                if (dr2Var2 != null) {
                    wp2 wp2Var2 = dr2Var2.n;
                    dr2Var2.m.C();
                    if (((Boolean) tw1.e.c.a(mz1.Ab)).booleanValue()) {
                        wp2Var2.s0();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            wp2Var2.U0();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
