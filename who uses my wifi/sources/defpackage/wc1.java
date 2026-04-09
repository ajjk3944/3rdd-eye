package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class wc1 extends Handler {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wc1(Looper looper, int i, boolean z) {
        super(looper);
        this.a = i;
    }

    public void a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        switch (this.a) {
            case 2:
                a(message);
                break;
            default:
                super.dispatchMessage(message);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wc1(Looper looper, Handler.Callback callback, int i) {
        super(looper, callback);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc1(Looper looper, int i) {
        super(looper);
        this.a = i;
        switch (i) {
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
