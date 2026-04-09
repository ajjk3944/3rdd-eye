package p000if;

import ff.EnumC5821b;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: if.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6148a {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC5821b f49168a;

    public C6148a(EnumC5821b type) {
        AbstractC6492s.i(type, "type");
        this.f49168a = type;
    }

    public final EnumC5821b a() {
        return this.f49168a;
    }

    public final EnumC5821b b() {
        return this.f49168a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6148a) && this.f49168a == ((C6148a) obj).f49168a;
    }

    public int hashCode() {
        return this.f49168a.hashCode();
    }

    public String toString() {
        return "Params(type=" + this.f49168a + ")";
    }
}
