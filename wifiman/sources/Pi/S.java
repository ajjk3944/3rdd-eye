package pi;

import ii.InterfaceC6164k;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ri.InterfaceC7618i;

/* loaded from: classes4.dex */
public abstract class S implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.a, InterfaceC7618i {

    /* renamed from: a, reason: collision with root package name */
    private int f58087a;

    public /* synthetic */ S(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int K0() {
        return W.a(this) ? super.hashCode() : (((N0().hashCode() * 31) + L0().hashCode()) * 31) + (O0() ? 1 : 0);
    }

    public abstract List L0();

    public abstract r0 M0();

    public abstract v0 N0();

    public abstract boolean O0();

    public abstract S P0(kotlin.reflect.jvm.internal.impl.types.checker.g gVar);

    public abstract M0 Q0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return O0() == s10.O0() && kotlin.reflect.jvm.internal.impl.types.checker.t.f52172a.a(Q0(), s10.Q0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.h getAnnotations() {
        return AbstractC7372t.a(M0());
    }

    public final int hashCode() {
        int i10 = this.f58087a;
        if (i10 != 0) {
            return i10;
        }
        int iK0 = K0();
        this.f58087a = iK0;
        return iK0;
    }

    public abstract InterfaceC6164k r();

    private S() {
    }
}
