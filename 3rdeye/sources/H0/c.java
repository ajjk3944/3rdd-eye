package H0;

import C0.h;
import H0.k;
import android.os.Handler;

/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final h.a f1976a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f1977b;

    public c(h.a aVar, Handler handler) {
        this.f1976a = aVar;
        this.f1977b = handler;
    }

    public final void a(k.a aVar) {
        int i = aVar.f2003b;
        h.a aVar2 = this.f1976a;
        Handler handler = this.f1977b;
        if (i == 0) {
            handler.post(new a(aVar2, aVar.f2002a));
        } else {
            handler.post(new b(i, 0, aVar2));
        }
    }
}
