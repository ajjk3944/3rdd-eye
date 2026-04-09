package hd;

import android.os.Handler;
import android.os.Message;
import k8.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25063b;

    public /* synthetic */ e(int i4, Object obj) {
        this.f25062a = i4;
        this.f25063b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f25062a) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                jf.c cVar = (jf.c) this.f25063b;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (cVar.f27642b) {
                    throw null;
                }
            default:
                f fVar = (f) this.f25063b;
                int i4 = message.what;
                if (i4 == 1) {
                    fVar.b((k8.d) message.obj);
                    return true;
                }
                if (i4 == 2) {
                    fVar.f28093d.j((k8.d) message.obj);
                }
                return false;
        }
    }
}
