package S5;

import android.os.Handler;
import android.os.Looper;
import p9.InterfaceC5480a;

/* compiled from: Balloon.kt */
/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.m implements InterfaceC5480a<Handler> {

    /* renamed from: g, reason: collision with root package name */
    public static final i f11983g = new i(0);

    @Override // p9.InterfaceC5480a
    public final Handler invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
