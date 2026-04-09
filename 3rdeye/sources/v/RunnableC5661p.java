package v;

import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import v.C5664t;

/* compiled from: R8$$SyntheticClass */
/* renamed from: v.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5661p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5664t f46824c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f46825d;

    public /* synthetic */ RunnableC5661p(C5664t c5664t, ArrayList arrayList, int i) {
        this.f46823b = i;
        this.f46824c = c5664t;
        this.f46825d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C5664t.e.a aVar;
        switch (this.f46823b) {
            case 0:
                C5664t c5664t = this.f46824c;
                ArrayList arrayList = this.f46825d;
                c5664t.getClass();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                boolean z10 = false;
                while (it.hasNext()) {
                    C5664t.h hVar = (C5664t.h) it.next();
                    if (c5664t.f46872b.d(hVar.f())) {
                        c5664t.f46872b.f14957b.remove(hVar.f());
                        arrayList2.add(hVar.f());
                        if (hVar.g() == C.W.class) {
                            z10 = true;
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    return;
                }
                c5664t.u("Use cases [" + TextUtils.join(", ", arrayList2) + "] now DETACHED for camera", null);
                if (z10) {
                    c5664t.i.f46758h.getClass();
                }
                c5664t.q();
                if (c5664t.f46872b.c().isEmpty()) {
                    c5664t.i.f46761l.f47001c = false;
                } else {
                    c5664t.M();
                }
                if (!c5664t.f46872b.b().isEmpty()) {
                    c5664t.L();
                    c5664t.E();
                    if (c5664t.f46876f == C5664t.f.OPENED) {
                        c5664t.C();
                        return;
                    }
                    return;
                }
                c5664t.i.m();
                c5664t.E();
                c5664t.i.t(false);
                c5664t.f46883n = c5664t.A();
                c5664t.u("Closing camera.", null);
                switch (c5664t.f46876f.ordinal()) {
                    case 3:
                        A2.l.q(null, c5664t.f46881l == null);
                        c5664t.F(C5664t.f.INITIALIZED);
                        return;
                    case 4:
                    default:
                        c5664t.u("close() ignored due to being in state: " + c5664t.f46876f, null);
                        return;
                    case 5:
                    case 6:
                    case 7:
                        if (c5664t.f46879j.a() || ((aVar = c5664t.f46871J.f46903a) != null && !aVar.f46906b.get())) {
                            z = true;
                        }
                        c5664t.f46871J.a();
                        c5664t.F(C5664t.f.CLOSING);
                        if (z) {
                            A2.l.q(null, c5664t.f46884o.isEmpty());
                            c5664t.s();
                            return;
                        }
                        return;
                    case 8:
                    case 9:
                        c5664t.F(C5664t.f.CLOSING);
                        c5664t.r();
                        return;
                }
            default:
                ArrayList arrayList3 = this.f46825d;
                C5664t c5664t2 = this.f46824c;
                C5658m c5658m = c5664t2.i;
                try {
                    c5664t2.I(arrayList3);
                    return;
                } finally {
                    c5658m.m();
                }
        }
    }
}
