package ji;

import Bh.InterfaceC2491a;
import pi.S;

/* renamed from: ji.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6343d extends AbstractC6340a implements InterfaceC6346g {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2491a f50876c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6343d(InterfaceC2491a interfaceC2491a, S s10, InterfaceC6346g interfaceC6346g) {
        super(s10, interfaceC6346g);
        if (interfaceC2491a == null) {
            b(0);
        }
        if (s10 == null) {
            b(1);
        }
        this.f50876c = interfaceC2491a;
    }

    private static /* synthetic */ void b(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "receiverType";
        } else if (i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i10 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    public String toString() {
        return getType() + ": Ext {" + this.f50876c + "}";
    }
}
