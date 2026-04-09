package y1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.google.android.gms.internal.measurement.z3;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class f2 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f25683a = new LinkedHashMap();

    public static final zt.m0 a(Context context) {
        zt.m0 m0Var;
        LinkedHashMap linkedHashMap = f25683a;
        synchronized (linkedHashMap) {
            try {
                Object objK = linkedHashMap.get(context);
                if (objK == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    yt.c cVarB = a.a.b(-1, 6, null);
                    z7.j jVar = new z7.j(new g8.d(contentResolver, uriFor, new z3(cVarB, dr.a.h(Looper.getMainLooper())), cVarB, context, null));
                    wt.i1 i1VarC = wt.w.c();
                    du.f fVar = wt.d0.f24610a;
                    objK = zt.f0.k(jVar, new bu.c(se.b.M(i1VarC, bu.n.f2983a)), new zt.l0(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objK);
                }
                m0Var = (zt.m0) objK;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m0Var;
    }

    public static final n0.s b(View view) {
        Object tag = view.getTag(z0.n.androidx_compose_ui_view_composition_context);
        if (tag instanceof n0.s) {
            return (n0.s) tag;
        }
        return null;
    }
}
