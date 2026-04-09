package A2;

import android.net.Uri;
import j1.C2544c;
import java.util.concurrent.Callable;
import t2.C2911G;
import t2.HandlerC2908D;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f144b;

    public /* synthetic */ A(int i, Object obj) {
        this.f143a = i;
        this.f144b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f143a) {
            case 0:
                return ((C0113a) this.f144b).getViewSignals();
            case 1:
                synchronized (((C2544c) this.f144b)) {
                    try {
                        C2544c c2544c = (C2544c) this.f144b;
                        if (c2544c.i == null) {
                            return null;
                        }
                        c2544c.t();
                        if (((C2544c) this.f144b).m()) {
                            ((C2544c) this.f144b).r();
                            ((C2544c) this.f144b).f21310k = 0;
                        }
                        return null;
                    } finally {
                    }
                }
            default:
                HandlerC2908D handlerC2908D = C2911G.f23576l;
                C2911G c2911g = p2.j.f22785C.f22790c;
                return C2911G.p((Uri) this.f144b);
        }
    }
}
