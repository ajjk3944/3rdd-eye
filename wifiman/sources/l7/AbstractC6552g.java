package l7;

import Yg.J;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: l7.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6552g implements InterfaceC6553h {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f52446a = new HashMap();

    @Override // l7.InterfaceC6553h
    public InterfaceC6554i a(W7.d point) {
        AbstractC6492s.i(point, "point");
        return (InterfaceC6554i) this.f52446a.get(point);
    }

    @Override // l7.InterfaceC6553h
    public void b(W7.d point, InterfaceC6835l updater) {
        AbstractC6492s.i(point, "point");
        AbstractC6492s.i(updater, "updater");
        synchronized (this.f52446a) {
            try {
                HashMap map = this.f52446a;
                InterfaceC6554i interfaceC6554iC = (InterfaceC6554i) map.get(point);
                if (interfaceC6554iC == null) {
                    interfaceC6554iC = c(point);
                }
                updater.invoke(interfaceC6554iC);
                map.put(point, interfaceC6554iC);
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract InterfaceC6554i c(W7.d dVar);

    public void d(InterfaceC6835l updater) {
        AbstractC6492s.i(updater, "updater");
        synchronized (this.f52446a) {
            try {
                Iterator it = this.f52446a.entrySet().iterator();
                while (it.hasNext()) {
                    updater.invoke(((Map.Entry) it.next()).getValue());
                }
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
