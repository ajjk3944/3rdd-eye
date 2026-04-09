package aj;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: aj.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3871e {

    /* renamed from: a, reason: collision with root package name */
    private boolean f26338a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f26339b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26340c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26341d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f26342e;

    /* renamed from: f, reason: collision with root package name */
    private String f26343f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f26344g;

    /* renamed from: h, reason: collision with root package name */
    private String f26345h;

    /* renamed from: i, reason: collision with root package name */
    private EnumC3867a f26346i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f26347j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26348k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f26349l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f26350m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f26351n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f26352o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f26353p;

    /* renamed from: q, reason: collision with root package name */
    private cj.e f26354q;

    public C3871e(AbstractC3868b json) {
        AbstractC6492s.i(json, "json");
        this.f26338a = json.e().i();
        this.f26339b = json.e().j();
        this.f26340c = json.e().k();
        this.f26341d = json.e().q();
        this.f26342e = json.e().m();
        this.f26343f = json.e().n();
        this.f26344g = json.e().g();
        this.f26345h = json.e().e();
        this.f26346i = json.e().f();
        this.f26347j = json.e().o();
        json.e().l();
        this.f26348k = json.e().h();
        this.f26349l = json.e().d();
        this.f26350m = json.e().a();
        this.f26351n = json.e().b();
        this.f26352o = json.e().c();
        this.f26353p = json.e().p();
        this.f26354q = json.a();
    }

    public final C3873g a() {
        if (this.f26353p) {
            if (!AbstractC6492s.d(this.f26345h, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (this.f26346i != EnumC3867a.POLYMORPHIC) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (this.f26342e) {
            if (!AbstractC6492s.d(this.f26343f, "    ")) {
                String str = this.f26343f;
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f26343f).toString());
                    }
                }
            }
        } else if (!AbstractC6492s.d(this.f26343f, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new C3873g(this.f26338a, this.f26340c, this.f26341d, this.f26352o, this.f26342e, this.f26339b, this.f26343f, this.f26344g, this.f26353p, this.f26345h, this.f26351n, this.f26347j, null, this.f26348k, this.f26349l, this.f26350m, this.f26346i);
    }

    public final cj.e b() {
        return this.f26354q;
    }

    public final void c(String str) {
        AbstractC6492s.i(str, "<set-?>");
        this.f26345h = str;
    }

    public final void d(boolean z10) {
        this.f26338a = z10;
    }

    public final void e(boolean z10) {
        this.f26339b = z10;
    }

    public final void f(boolean z10) {
        this.f26340c = z10;
    }

    public final void g(boolean z10) {
        this.f26341d = z10;
    }

    public final void h(cj.e eVar) {
        AbstractC6492s.i(eVar, "<set-?>");
        this.f26354q = eVar;
    }
}
