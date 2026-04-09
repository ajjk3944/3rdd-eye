package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class J5 implements InterfaceC4741kd {

    /* renamed from: a, reason: collision with root package name */
    public final String f39682a;

    public J5(String str) {
        this.f39682a = str;
    }

    public final J5 a(String str) {
        return new J5(str);
    }

    public final String b() {
        return this.f39682a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J5) && kotlin.jvm.internal.l.b(this.f39682a, ((J5) obj).f39682a);
    }

    public final int hashCode() {
        return this.f39682a.hashCode();
    }

    public final String toString() {
        return N7.B8.j(new StringBuilder("ConstantModuleEntryPointProvider(className="), this.f39682a, ')');
    }

    public static J5 a(J5 j52, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = j52.f39682a;
        }
        j52.getClass();
        return new J5(str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4741kd
    public final String a() {
        return this.f39682a;
    }
}
