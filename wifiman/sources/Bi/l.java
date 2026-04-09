package bi;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2502l;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Bh.Y;
import Bh.k0;
import java.util.Comparator;

/* loaded from: classes4.dex */
public class l implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final l f33358a = new l();

    private l() {
    }

    private static Integer b(InterfaceC2503m interfaceC2503m, InterfaceC2503m interfaceC2503m2) {
        int iC = c(interfaceC2503m2) - c(interfaceC2503m);
        if (iC != 0) {
            return Integer.valueOf(iC);
        }
        if (i.B(interfaceC2503m) && i.B(interfaceC2503m2)) {
            return 0;
        }
        int iCompareTo = interfaceC2503m.getName().compareTo(interfaceC2503m2.getName());
        if (iCompareTo != 0) {
            return Integer.valueOf(iCompareTo);
        }
        return null;
    }

    private static int c(InterfaceC2503m interfaceC2503m) {
        if (i.B(interfaceC2503m)) {
            return 8;
        }
        if (interfaceC2503m instanceof InterfaceC2502l) {
            return 7;
        }
        if (interfaceC2503m instanceof Y) {
            return ((Y) interfaceC2503m).k0() == null ? 6 : 5;
        }
        if (interfaceC2503m instanceof InterfaceC2515z) {
            return ((InterfaceC2515z) interfaceC2503m).k0() == null ? 4 : 3;
        }
        if (interfaceC2503m instanceof InterfaceC2495e) {
            return 2;
        }
        return interfaceC2503m instanceof k0 ? 1 : 0;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(InterfaceC2503m interfaceC2503m, InterfaceC2503m interfaceC2503m2) {
        Integer numB = b(interfaceC2503m, interfaceC2503m2);
        if (numB != null) {
            return numB.intValue();
        }
        return 0;
    }
}
