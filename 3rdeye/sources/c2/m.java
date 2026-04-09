package c2;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: NetworkApi23.kt */
/* loaded from: classes.dex */
public final class m {
    public static final Network a(ConnectivityManager connectivityManager) {
        kotlin.jvm.internal.l.f(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
