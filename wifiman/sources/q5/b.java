package q5;

import android.content.Context;
import android.os.Bundle;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q5.h;

/* loaded from: classes3.dex */
public final class b implements h {

    /* renamed from: b, reason: collision with root package name */
    private static final a f58392b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f58393a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(Context context) {
        AbstractC6492s.i(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f58393a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // q5.h
    public Boolean a() {
        if (this.f58393a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f58393a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // q5.h
    public Ai.a b() {
        if (this.f58393a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return Ai.a.g(Ai.c.s(this.f58393a.getInt("firebase_sessions_sessions_restart_timeout"), Ai.d.SECONDS));
        }
        return null;
    }

    @Override // q5.h
    public Double c() {
        if (this.f58393a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f58393a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // q5.h
    public Object d(InterfaceC5380e interfaceC5380e) {
        return h.a.a(this, interfaceC5380e);
    }
}
