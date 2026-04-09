package ji;

import pi.S;

/* renamed from: ji.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6340a implements InterfaceC6346g {

    /* renamed from: a, reason: collision with root package name */
    protected final S f50870a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6346g f50871b;

    public AbstractC6340a(S s10, InterfaceC6346g interfaceC6346g) {
        if (s10 == null) {
            b(0);
        }
        this.f50870a = s10;
        this.f50871b = interfaceC6346g == null ? this : interfaceC6346g;
    }

    private static /* synthetic */ void b(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // ji.InterfaceC6346g
    public S getType() {
        S s10 = this.f50870a;
        if (s10 == null) {
            b(1);
        }
        return s10;
    }
}
