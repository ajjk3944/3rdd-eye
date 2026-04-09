package di;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: di.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5397f {

    /* renamed from: a, reason: collision with root package name */
    private final Zh.b f46093a;

    /* renamed from: b, reason: collision with root package name */
    private final int f46094b;

    public C5397f(Zh.b classId, int i10) {
        AbstractC6492s.i(classId, "classId");
        this.f46093a = classId;
        this.f46094b = i10;
    }

    public final Zh.b a() {
        return this.f46093a;
    }

    public final int b() {
        return this.f46094b;
    }

    public final int c() {
        return this.f46094b;
    }

    public final Zh.b d() {
        return this.f46093a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5397f)) {
            return false;
        }
        C5397f c5397f = (C5397f) obj;
        return AbstractC6492s.d(this.f46093a, c5397f.f46093a) && this.f46094b == c5397f.f46094b;
    }

    public int hashCode() {
        return (this.f46093a.hashCode() * 31) + Integer.hashCode(this.f46094b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f46094b;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f46093a);
        int i12 = this.f46094b;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(">");
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }
}
