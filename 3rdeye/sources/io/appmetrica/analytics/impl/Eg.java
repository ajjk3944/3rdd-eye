package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes3.dex */
public final class Eg extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4900qg f39367a;

    public Eg(Handler handler, InterfaceC4900qg interfaceC4900qg) {
        super(handler);
        this.f39367a = interfaceC4900qg;
    }

    public static void a(ResultReceiver resultReceiver, C5102yg c5102yg) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", c5102yg == null ? null : c5102yg.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            C5102yg c5102yg = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c5102yg = new C5102yg(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f39367a.a(c5102yg);
        }
    }
}
