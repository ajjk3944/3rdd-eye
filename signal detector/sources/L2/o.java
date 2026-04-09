package L2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import h0.C2351a;

/* loaded from: classes.dex */
public final class o extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f2542a;

    /* renamed from: b, reason: collision with root package name */
    public final C2351a f2543b;

    public o(C2351a c2351a) {
        this.f2543b = c2351a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            Object obj = this.f2543b.f20442c;
            throw null;
        }
    }
}
