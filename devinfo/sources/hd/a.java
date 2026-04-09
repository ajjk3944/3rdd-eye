package hd;

import a0.g;
import android.os.Handler;
import android.os.Message;
import z7.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25051a;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f25051a) {
            case 0:
                int i4 = message.what;
                if (i4 == 0) {
                    throw g.h(message.obj);
                }
                if (i4 != 1) {
                    return false;
                }
                throw g.h(message.obj);
            default:
                if (message.what != 1) {
                    return false;
                }
                ((y) message.obj).a();
                return true;
        }
    }
}
