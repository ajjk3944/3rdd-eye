package S6;

import C0.InterfaceC2528h;
import Y0.s;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6735w0;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: h, reason: collision with root package name */
    private static final a f20336h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final f0.c f20337a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20338b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2528h f20339c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC6735w0 f20340d;

    /* renamed from: e, reason: collision with root package name */
    private final float f20341e;

    /* renamed from: f, reason: collision with root package name */
    private final long f20342f;

    /* renamed from: g, reason: collision with root package name */
    private final String f20343g;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ k(f0.c cVar, String str, InterfaceC2528h interfaceC2528h, AbstractC6735w0 abstractC6735w0, float f10, long j10, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, str, interfaceC2528h, abstractC6735w0, f10, j10, str2);
    }

    public final k a(f0.c alignment, String str, InterfaceC2528h contentScale, AbstractC6735w0 abstractC6735w0, float f10, long j10, String tag) {
        AbstractC6492s.i(alignment, "alignment");
        AbstractC6492s.i(contentScale, "contentScale");
        AbstractC6492s.i(tag, "tag");
        return new k(alignment, str, contentScale, abstractC6735w0, f10, j10, tag, null);
    }

    public final f0.c c() {
        return this.f20337a;
    }

    public final float d() {
        return this.f20341e;
    }

    public final AbstractC6735w0 e() {
        return this.f20340d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return AbstractC6492s.d(this.f20337a, kVar.f20337a) && AbstractC6492s.d(this.f20338b, kVar.f20338b) && AbstractC6492s.d(this.f20339c, kVar.f20339c) && AbstractC6492s.d(this.f20340d, kVar.f20340d) && Float.compare(this.f20341e, kVar.f20341e) == 0 && Y0.r.e(this.f20342f, kVar.f20342f) && AbstractC6492s.d(this.f20343g, kVar.f20343g);
    }

    public final String f() {
        return this.f20338b;
    }

    public final InterfaceC2528h g() {
        return this.f20339c;
    }

    public final long h() {
        return this.f20342f;
    }

    public int hashCode() {
        int iHashCode = this.f20337a.hashCode() * 31;
        String str = this.f20338b;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f20339c.hashCode()) * 31;
        AbstractC6735w0 abstractC6735w0 = this.f20340d;
        return ((((((iHashCode2 + (abstractC6735w0 != null ? abstractC6735w0.hashCode() : 0)) * 31) + Float.hashCode(this.f20341e)) * 31) + Y0.r.h(this.f20342f)) * 31) + this.f20343g.hashCode();
    }

    public final String i() {
        return this.f20343g;
    }

    public String toString() {
        return "ImageOptions(alignment=" + this.f20337a + ", contentDescription=" + this.f20338b + ", contentScale=" + this.f20339c + ", colorFilter=" + this.f20340d + ", alpha=" + this.f20341e + ", requestSize=" + ((Object) Y0.r.i(this.f20342f)) + ", tag=" + this.f20343g + ')';
    }

    private k(f0.c alignment, String str, InterfaceC2528h contentScale, AbstractC6735w0 abstractC6735w0, float f10, long j10, String tag) {
        AbstractC6492s.i(alignment, "alignment");
        AbstractC6492s.i(contentScale, "contentScale");
        AbstractC6492s.i(tag, "tag");
        this.f20337a = alignment;
        this.f20338b = str;
        this.f20339c = contentScale;
        this.f20340d = abstractC6735w0;
        this.f20341e = f10;
        this.f20342f = j10;
        this.f20343g = tag;
    }

    public /* synthetic */ k(f0.c cVar, String str, InterfaceC2528h interfaceC2528h, AbstractC6735w0 abstractC6735w0, float f10, long j10, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? f0.c.f46573a.e() : cVar, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? InterfaceC2528h.f2145a.a() : interfaceC2528h, (i10 & 8) == 0 ? abstractC6735w0 : null, (i10 & 16) != 0 ? 1.0f : f10, (i10 & 32) != 0 ? s.a(-1, -1) : j10, (i10 & 64) != 0 ? "" : str2, null);
    }
}
