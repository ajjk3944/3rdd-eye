package wg;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.y3;
import lq.b0;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f24487a;

    public a(Context context) {
        br.l.e(context, "appContext");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f24487a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // wg.p
    public final Boolean a() {
        Bundle bundle = this.f24487a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // wg.p
    public final ut.a b() {
        Bundle bundle = this.f24487a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new ut.a(y3.P(bundle.getInt("firebase_sessions_sessions_restart_timeout"), ut.c.SECONDS));
        }
        return null;
    }

    @Override // wg.p
    public final Object c(pq.c cVar) {
        return b0.f15562a;
    }

    @Override // wg.p
    public final Double d() {
        Bundle bundle = this.f24487a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
