package ji;

import pi.S;

/* renamed from: ji.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6348i extends AbstractC6340a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6348i(S s10) {
        this(s10, null);
        if (s10 == null) {
            b(0);
        }
    }

    private static /* synthetic */ void b(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i10 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C6348i(S s10, InterfaceC6346g interfaceC6346g) {
        super(s10, interfaceC6346g);
        if (s10 == null) {
            b(1);
        }
    }
}
