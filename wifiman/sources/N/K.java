package N;

import r.InterfaceC7533i;
import y.C8547b;
import y.C8549d;
import y.C8552g;
import y.InterfaceC8555j;
import y.InterfaceC8560o;

/* loaded from: classes.dex */
final class K {

    /* renamed from: a, reason: collision with root package name */
    public static final K f13782a = new K();

    private K() {
    }

    public final InterfaceC7533i a(InterfaceC8555j interfaceC8555j) {
        if ((interfaceC8555j instanceof InterfaceC8560o.b) || (interfaceC8555j instanceof C8547b) || (interfaceC8555j instanceof C8552g) || (interfaceC8555j instanceof C8549d)) {
            return L.f13785a;
        }
        return null;
    }

    public final InterfaceC7533i b(InterfaceC8555j interfaceC8555j) {
        if (!(interfaceC8555j instanceof InterfaceC8560o.b) && !(interfaceC8555j instanceof C8547b)) {
            if (interfaceC8555j instanceof C8552g) {
                return L.f13787c;
            }
            if (interfaceC8555j instanceof C8549d) {
                return L.f13786b;
            }
            return null;
        }
        return L.f13786b;
    }
}
