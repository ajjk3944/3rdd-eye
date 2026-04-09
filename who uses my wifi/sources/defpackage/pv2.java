package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pv2 {
    public final HashMap a;
    public final Context b;
    public final Executor c;
    public final ug4 d;
    public final boolean e;
    public final gs3 f;
    public final boolean g;
    public final boolean h;
    public final AtomicBoolean i;
    public final AtomicReference j;

    public pv2(ld2 ld2Var, ug4 ug4Var, t83 t83Var, gs3 gs3Var, Context context) {
        HashMap map = new HashMap();
        this.a = map;
        this.i = new AtomicBoolean();
        this.j = new AtomicReference(new Bundle());
        this.c = ld2Var;
        this.d = ug4Var;
        iz1 iz1Var = mz1.f2;
        tw1 tw1Var = tw1.e;
        this.e = ((Boolean) tw1Var.c.a(iz1Var)).booleanValue();
        this.f = gs3Var;
        iz1 iz1Var2 = mz1.k2;
        kz1 kz1Var = tw1Var.c;
        this.g = ((Boolean) kz1Var.a(iz1Var2)).booleanValue();
        this.h = ((Boolean) kz1Var.a(mz1.o7)).booleanValue();
        this.b = context;
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        hg4 hg4Var = hg4.C;
        lf4 lf4Var = hg4Var.c;
        gd2 gd2Var = hg4Var.h;
        map.put("device", lf4.O());
        map.put("app", (String) t83Var.h);
        Context context2 = (Context) t83Var.g;
        map.put("is_lite_sdk", true != lf4.f(context2) ? "0" : "1");
        ArrayList arrayListJ = tw1Var.a.J();
        if (((Boolean) kz1Var.a(mz1.j7)).booleanValue()) {
            arrayListJ.addAll(gd2Var.g().m().i);
        }
        map.put("e", TextUtils.join(",", arrayListJ));
        map.put("sdkVersion", (String) t83Var.i);
        if (((Boolean) kz1Var.a(mz1.ec)).booleanValue()) {
            map.put("is_bstar", true != lf4.d(context2) ? "0" : "1");
        }
        if (((Boolean) kz1Var.a(mz1.ja)).booleanValue() && ((Boolean) kz1Var.a(mz1.z2)).booleanValue()) {
            String str = gd2Var.g;
            map.put("plugin", str == null ? "" : str);
        }
    }

    public final void a(Map map, boolean z) {
        if (map.isEmpty()) {
            gi2.U("Empty paramMap.");
            return;
        }
        b(map);
        String strA = this.f.a(map);
        gi2.G(strA);
        boolean z2 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.e) {
            if (!z || this.g) {
                if (!z2 || this.h) {
                    this.c.execute(new qv2(this, strA, 0));
                }
            }
        }
    }

    public final void b(Map map) {
        Bundle bundleU;
        if (map == null || map.isEmpty()) {
            gi2.U("Empty or null paramMap.");
            return;
        }
        boolean andSet = this.i.getAndSet(true);
        AtomicReference atomicReference = this.j;
        if (!andSet) {
            String str = (String) tw1.e.c.a(mz1.ob);
            m92 m92Var = new m92(str, this);
            if (TextUtils.isEmpty(str)) {
                bundleU = Bundle.EMPTY;
            } else {
                Context context = this.b;
                PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(m92Var);
                bundleU = yc0.u(context, str);
            }
            atomicReference.set(bundleU);
        }
        Bundle bundle = (Bundle) atomicReference.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }
}
