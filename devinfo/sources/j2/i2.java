package j2;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.google.android.gms.internal.measurement.a4;
import com.liuzh.deviceinfo.R;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class i2 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f27186a = new LinkedHashMap();

    public static final al.g1 a(Context context) {
        al.g1 g1Var;
        LinkedHashMap linkedHashMap = f27186a;
        synchronized (linkedHashMap) {
            try {
                Object objN = linkedHashMap.get(context);
                if (objN == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    zk.h hVarF = com.bumptech.glide.e.f(-1, 6, null);
                    al.f0 f0Var = new al.f0(new h2(contentResolver, uriFor, new a4(hVarF, com.bumptech.glide.e.r(Looper.getMainLooper())), hVarF, context, null));
                    xk.m1 m1VarD = xk.x.d();
                    el.e eVar = xk.g0.f37189a;
                    objN = al.z0.n(f0Var, new cl.d(wd.b.O(m1VarD, cl.o.f2935a)), new al.f1(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objN);
                }
                g1Var = (al.g1) objN;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g1Var;
    }

    public static final u0.t b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof u0.t) {
            return (u0.t) tag;
        }
        return null;
    }
}
