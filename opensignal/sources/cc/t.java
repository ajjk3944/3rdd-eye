package cc;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class t extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectionResult f3673a;

    public t(ConnectionResult connectionResult) {
        s.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (connectionResult.f4807d == 0 || connectionResult.f4808g == null) ? false : true);
        this.f3673a = connectionResult;
    }
}
