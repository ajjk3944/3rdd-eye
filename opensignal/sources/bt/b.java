package bt;

import androidx.lifecycle.o;
import ht.x;

/* loaded from: classes.dex */
public final class b extends o {

    /* renamed from: g, reason: collision with root package name */
    public final ur.o f2949g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(rr.b bVar, x xVar) {
        super(xVar);
        if (xVar == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.f2949g = (ur.o) bVar;
    }

    @Override // androidx.lifecycle.o
    public final String toString() {
        return getType() + ": Ext {" + this.f2949g + "}";
    }
}
