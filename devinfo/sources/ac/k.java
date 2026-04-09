package ac;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class k extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Looper looper, Handler.Callback callback, int i4) {
        super(looper, callback);
        this.f320a = i4;
    }

    public void a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        switch (this.f320a) {
            case 1:
                a(message);
                break;
            default:
                super.dispatchMessage(message);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Looper looper, int i4) {
        super(looper);
        this.f320a = i4;
        switch (i4) {
            case 1:
                super(looper);
                Looper.getMainLooper();
                break;
            case 2:
                super(looper);
                Looper.getMainLooper();
                break;
            case 3:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
