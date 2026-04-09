package o7;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: o7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC7096b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f55508a = a.f55509a;

    /* renamed from: o7.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f55509a = new a();

        private a() {
        }

        public final InterfaceC7096b a(Context context, q systemInfo) {
            AbstractC6492s.i(context, "context");
            AbstractC6492s.i(systemInfo, "systemInfo");
            return new C7099e(context, systemInfo);
        }
    }

    gg.i a();

    ConnectivityManager b();

    WifiManager c();
}
