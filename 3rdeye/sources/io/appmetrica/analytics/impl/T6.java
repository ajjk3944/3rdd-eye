package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes3.dex */
public final class T6 extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final S6 f40157a;

    public T6(Handler handler, S6 s62) {
        super(handler);
        this.f40157a = s62;
    }

    public static void a(ResultReceiver resultReceiver, C4836o4 c4836o4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            c4836o4.b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f40157a.a(i, bundle);
    }

    public static void a(ResultReceiver resultReceiver, Gl gl, C4836o4 c4836o4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", gl.f39549a);
            c4836o4.b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}
