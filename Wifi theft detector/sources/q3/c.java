package q3;

import android.content.Context;
import com.vungle.ads.b0;
import com.vungle.ads.h;
import com.vungle.ads.l;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f24016a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static q3.a f24017b = new a();

    public static final class a implements q3.a {
        @Override // q3.a
        public void a(Context context, String appId, l initializationListener) throws Throwable {
            p.e(context, "context");
            p.e(appId, "appId");
            p.e(initializationListener, "initializationListener");
            b0.Companion.init(context, appId, initializationListener);
        }

        @Override // q3.a
        public void b(Context context, h callback) {
            p.e(context, "context");
            p.e(callback, "callback");
            b0.Companion.getBiddingToken(context, callback);
        }

        @Override // q3.a
        public String getSdkVersion() {
            return b0.Companion.getSdkVersion();
        }

        @Override // q3.a
        public boolean isInitialized() {
            return b0.Companion.isInitialized();
        }
    }
}
