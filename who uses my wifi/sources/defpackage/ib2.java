package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ib2 {
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();
    public final Context c;

    public ib2(Context context) {
        this.c = context;
    }

    public final void a() {
        iz1 iz1Var = mz1.ib;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            lf4 lf4Var = hg4.C.c;
            HashMap mapP = lf4.P((String) tw1Var.c.a(mz1.nb));
            for (String str : mapP.keySet()) {
                synchronized (this) {
                    try {
                        HashMap map = this.a;
                        if (!map.containsKey(str)) {
                            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.c) : this.c.getSharedPreferences(str, 0);
                            m92 m92Var = new m92(this, str);
                            map.put(str, m92Var);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(m92Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            na2 na2Var = new na2(mapP);
            synchronized (this) {
                this.b.add(na2Var);
            }
        }
    }
}
