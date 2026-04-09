package Z9;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f25203a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.b f25204b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25205c;

    /* renamed from: d, reason: collision with root package name */
    private final s9.d f25206d;

    /* renamed from: e, reason: collision with root package name */
    private final s9.d f25207e;

    public a(String id2, s9.b image, boolean z10, s9.d title, s9.d subtitle) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(image, "image");
        AbstractC6492s.i(title, "title");
        AbstractC6492s.i(subtitle, "subtitle");
        this.f25203a = id2;
        this.f25204b = image;
        this.f25205c = z10;
        this.f25206d = title;
        this.f25207e = subtitle;
    }

    public final boolean a() {
        return this.f25205c;
    }

    public final String b() {
        return this.f25203a;
    }

    public final s9.b c() {
        return this.f25204b;
    }

    public final s9.d d() {
        return this.f25207e;
    }

    public final s9.d e() {
        return this.f25206d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC6492s.d(this.f25203a, aVar.f25203a) && AbstractC6492s.d(this.f25204b, aVar.f25204b) && this.f25205c == aVar.f25205c && AbstractC6492s.d(this.f25206d, aVar.f25206d) && AbstractC6492s.d(this.f25207e, aVar.f25207e);
    }

    public int hashCode() {
        return (((((((this.f25203a.hashCode() * 31) + this.f25204b.hashCode()) * 31) + Boolean.hashCode(this.f25205c)) * 31) + this.f25206d.hashCode()) * 31) + this.f25207e.hashCode();
    }

    public String toString() {
        return "UiMFAMethod(id=" + this.f25203a + ", image=" + this.f25204b + ", drawAsIconWithBorder=" + this.f25205c + ", title=" + this.f25206d + ", subtitle=" + this.f25207e + ")";
    }
}
