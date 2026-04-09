package W3;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public final class c extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c3.f f4025a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Handler handler, c3.f fVar) {
        super(handler);
        this.f4025a = fVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f4025a.b(null);
    }
}
