package kotlin.reflect.jvm.internal.impl.builtins;

import Bh.InterfaceC2495e;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class e {
    public static final boolean a(d dVar, InterfaceC2495e classDescriptor) {
        AbstractC6492s.i(dVar, "<this>");
        AbstractC6492s.i(classDescriptor, "classDescriptor");
        if (bi.i.x(classDescriptor)) {
            Set setB = dVar.b();
            Zh.b bVarN = AbstractC5833e.n(classDescriptor);
            if (AbstractC3689v.f0(setB, bVarN != null ? bVarN.e() : null)) {
                return true;
            }
        }
        return false;
    }
}
