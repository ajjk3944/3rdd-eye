package T;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class Z0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3540l f20998a;

    private /* synthetic */ Z0(InterfaceC3540l interfaceC3540l) {
        this.f20998a = interfaceC3540l;
    }

    public static final /* synthetic */ Z0 a(InterfaceC3540l interfaceC3540l) {
        return new Z0(interfaceC3540l);
    }

    public static InterfaceC3540l b(InterfaceC3540l interfaceC3540l) {
        return interfaceC3540l;
    }

    public static boolean c(InterfaceC3540l interfaceC3540l, Object obj) {
        return (obj instanceof Z0) && AbstractC6492s.d(interfaceC3540l, ((Z0) obj).f());
    }

    public static int d(InterfaceC3540l interfaceC3540l) {
        return interfaceC3540l.hashCode();
    }

    public static String e(InterfaceC3540l interfaceC3540l) {
        return "SkippableUpdater(composer=" + interfaceC3540l + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f20998a, obj);
    }

    public final /* synthetic */ InterfaceC3540l f() {
        return this.f20998a;
    }

    public int hashCode() {
        return d(this.f20998a);
    }

    public String toString() {
        return e(this.f20998a);
    }
}
