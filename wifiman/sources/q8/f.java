package q8;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import q8.d;
import q8.e;
import wc.C8321a;

/* loaded from: classes3.dex */
public abstract class f {
    public static final List a(C8321a c8321a, boolean z10, boolean z11) {
        AbstractC6492s.i(c8321a, "<this>");
        ArrayList arrayList = new ArrayList();
        if (z11 && c8321a.e()) {
            arrayList.add(new d.a(z10));
        }
        if (c8321a.m().contains(U7.b.BLE)) {
            arrayList.add(new d.b(z10));
        }
        return arrayList;
    }

    public static /* synthetic */ List b(C8321a c8321a, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return a(c8321a, z10, z11);
    }

    public static final List c(C8321a c8321a, boolean z10) {
        AbstractC6492s.i(c8321a, "<this>");
        ArrayList arrayList = new ArrayList();
        if (c8321a.l() == C8321a.EnumC2293a.BOOTING) {
            arrayList.add(new e.a(z10));
        }
        if (c8321a.l() == C8321a.EnumC2293a.FACTORY) {
            arrayList.add(new e.b(z10));
        }
        return arrayList;
    }
}
