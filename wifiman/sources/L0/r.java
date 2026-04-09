package L0;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3188s f11182a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11183b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11184c;

    public r(InterfaceC3188s interfaceC3188s, int i10, int i11) {
        this.f11182a = interfaceC3188s;
        this.f11183b = i10;
        this.f11184c = i11;
    }

    public final int a() {
        return this.f11184c;
    }

    public final InterfaceC3188s b() {
        return this.f11182a;
    }

    public final int c() {
        return this.f11183b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return AbstractC6492s.d(this.f11182a, rVar.f11182a) && this.f11183b == rVar.f11183b && this.f11184c == rVar.f11184c;
    }

    public int hashCode() {
        return (((this.f11182a.hashCode() * 31) + Integer.hashCode(this.f11183b)) * 31) + Integer.hashCode(this.f11184c);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f11182a + ", startIndex=" + this.f11183b + ", endIndex=" + this.f11184c + ')';
    }
}
