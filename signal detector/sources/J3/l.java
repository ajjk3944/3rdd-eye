package J3;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class l implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2133b;

    public /* synthetic */ l(int i, Object obj) {
        this.f2132a = i;
        this.f2133b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f2132a) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                c1.g gVar = (c1.g) this.f2133b;
                m mVar = (m) message.obj;
                synchronized (gVar.f5896b) {
                    if (((m) gVar.f5898d) == mVar || ((m) gVar.f5899e) == mVar) {
                        gVar.g(mVar, 2);
                    }
                }
                return true;
            default:
                y1.f fVar = (y1.f) this.f2133b;
                int i = message.what;
                if (i == 1) {
                    fVar.b((y1.d) message.obj);
                    return true;
                }
                if (i == 2) {
                    fVar.f24233d.k((y1.d) message.obj);
                }
                return false;
        }
    }
}
