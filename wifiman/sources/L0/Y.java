package L0;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class Y extends W {

    /* renamed from: a, reason: collision with root package name */
    private final String f11113a;

    public Y(String str) {
        super(null);
        this.f11113a = str;
    }

    public final String a() {
        return this.f11113a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y) && AbstractC6492s.d(this.f11113a, ((Y) obj).f11113a);
    }

    public int hashCode() {
        return this.f11113a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f11113a + ')';
    }
}
