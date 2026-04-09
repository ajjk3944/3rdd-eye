package gf;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: gf.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5901b {

    /* renamed from: a, reason: collision with root package name */
    private final List f47881a;

    public C5901b(List list) {
        AbstractC6492s.i(list, "list");
        this.f47881a = list;
    }

    public final List a() {
        return this.f47881a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5901b) && AbstractC6492s.d(this.f47881a, ((C5901b) obj).f47881a);
    }

    public int hashCode() {
        return this.f47881a.hashCode();
    }

    public String toString() {
        return "Devices(list=" + this.f47881a + ")";
    }
}
