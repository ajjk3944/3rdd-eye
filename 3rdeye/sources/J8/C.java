package J8;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.regex.Pattern;

/* compiled from: NetworkUtils.kt */
/* loaded from: classes3.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2809a = 0;

    static {
        kotlin.jvm.internal.l.e(Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$"), "compile(...)");
    }

    public static String a(Context context) {
        LinkProperties linkProperties;
        kotlin.jvm.internal.l.f(context, "context");
        if (Build.VERSION.SDK_INT < 28) {
            return "not supported";
        }
        Object systemService = context.getSystemService("connectivity");
        kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        String privateDnsServerName = null;
        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
            privateDnsServerName = linkProperties.getPrivateDnsServerName();
        }
        return privateDnsServerName == null ? "" : privateDnsServerName;
    }

    public static boolean b(String host) throws IOException {
        kotlin.jvm.internal.l.f(host, "host");
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(host, 443), 1000);
            socket.close();
            return true;
        } catch (Exception unused) {
            socket.close();
            return false;
        } catch (Throwable th) {
            socket.close();
            throw th;
        }
    }

    public static boolean c(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        Object systemService = context.getSystemService("connectivity");
        kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            return networkCapabilities.hasTransport(4);
        }
        return false;
    }
}
