package Gf;

import ic.EnumC6141b;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC6141b f7380a;

    /* renamed from: b, reason: collision with root package name */
    private final List f7381b;

    public h(EnumC6141b selected, List features) {
        AbstractC6492s.i(selected, "selected");
        AbstractC6492s.i(features, "features");
        this.f7380a = selected;
        this.f7381b = features;
    }

    public final List a() {
        return this.f7381b;
    }

    public final EnumC6141b b() {
        return this.f7380a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f7380a == hVar.f7380a && AbstractC6492s.d(this.f7381b, hVar.f7381b);
    }

    public int hashCode() {
        return (this.f7380a.hashCode() * 31) + this.f7381b.hashCode();
    }

    public String toString() {
        return "Model(selected=" + this.f7380a + ", features=" + this.f7381b + ")";
    }
}
