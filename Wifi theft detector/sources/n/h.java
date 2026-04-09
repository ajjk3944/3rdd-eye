package n;

import android.os.IBinder;
import android.support.customtabs.IEngagementSignalsCallback;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final IEngagementSignalsCallback f23506a;

    public h(IEngagementSignalsCallback iEngagementSignalsCallback) {
        this.f23506a = iEngagementSignalsCallback;
    }

    public static h a(IBinder iBinder) {
        return new h(IEngagementSignalsCallback.Stub.asInterface(iBinder));
    }
}
