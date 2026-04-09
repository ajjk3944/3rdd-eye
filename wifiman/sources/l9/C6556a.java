package l9;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: l9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6556a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f52457a;

    public C6556a(Object obj) {
        this.f52457a = obj;
    }

    public final Object a() {
        return this.f52457a;
    }

    public final Object b() {
        return this.f52457a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6556a) && AbstractC6492s.d(this.f52457a, ((C6556a) obj).f52457a);
    }

    public int hashCode() {
        Object obj = this.f52457a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "NullableValue(value=" + this.f52457a + ')';
    }
}
