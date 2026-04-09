package zf;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: zf.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8743f {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC8738a f67264a;

    /* renamed from: b, reason: collision with root package name */
    private final List f67265b;

    public C8743f(EnumC8738a selected, List filters) {
        AbstractC6492s.i(selected, "selected");
        AbstractC6492s.i(filters, "filters");
        this.f67264a = selected;
        this.f67265b = filters;
    }

    public final List a() {
        return this.f67265b;
    }

    public final EnumC8738a b() {
        return this.f67264a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8743f)) {
            return false;
        }
        C8743f c8743f = (C8743f) obj;
        return this.f67264a == c8743f.f67264a && AbstractC6492s.d(this.f67265b, c8743f.f67265b);
    }

    public int hashCode() {
        return (this.f67264a.hashCode() * 31) + this.f67265b.hashCode();
    }

    public String toString() {
        return "Model(selected=" + this.f67264a + ", filters=" + this.f67265b + ")";
    }
}
