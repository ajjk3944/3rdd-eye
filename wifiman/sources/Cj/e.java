package cj;

import Vi.InterfaceC3627a;
import Vi.o;
import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class e {
    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ Vi.b c(e eVar, th.d dVar, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i10 & 2) != 0) {
            list = AbstractC3689v.l();
        }
        return eVar.b(dVar, list);
    }

    public abstract void a(i iVar);

    public abstract Vi.b b(th.d dVar, List list);

    public abstract boolean d();

    public abstract InterfaceC3627a e(th.d dVar, String str);

    public abstract o f(th.d dVar, Object obj);

    private e() {
    }
}
