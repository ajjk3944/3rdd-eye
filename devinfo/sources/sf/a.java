package sf;

import android.content.Context;
import android.os.Bundle;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f33560a;

    public a(Context context) {
        nk.k.e(context, "appContext");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f33560a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // sf.o
    public final Boolean a() {
        Bundle bundle = this.f33560a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // sf.o
    public final Object b(ck.c cVar) {
        return u.f37649a;
    }

    @Override // sf.o
    public final wk.a c() {
        Bundle bundle = this.f33560a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new wk.a(com.bumptech.glide.d.D(bundle.getInt("firebase_sessions_sessions_restart_timeout"), wk.c.SECONDS));
        }
        return null;
    }

    @Override // sf.o
    public final Double d() {
        Bundle bundle = this.f33560a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
