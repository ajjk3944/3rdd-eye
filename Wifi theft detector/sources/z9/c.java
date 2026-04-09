package z9;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f25424a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25425b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25426c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25427d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25428e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25429f;

    /* renamed from: g, reason: collision with root package name */
    public String f25430g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25431h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25432i;

    /* renamed from: j, reason: collision with root package name */
    public String f25433j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25434k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25435l;

    /* renamed from: m, reason: collision with root package name */
    public aa.c f25436m;

    public c(a json) {
        kotlin.jvm.internal.p.e(json, "json");
        this.f25424a = json.e().e();
        this.f25425b = json.e().f();
        this.f25426c = json.e().g();
        this.f25427d = json.e().l();
        this.f25428e = json.e().b();
        this.f25429f = json.e().h();
        this.f25430g = json.e().i();
        this.f25431h = json.e().d();
        this.f25432i = json.e().k();
        this.f25433j = json.e().c();
        this.f25434k = json.e().a();
        this.f25435l = json.e().j();
        this.f25436m = json.a();
    }

    public final d a() {
        if (this.f25432i && !kotlin.jvm.internal.p.a(this.f25433j, HandleInvocationsFromAdViewer.KEY_AD_TYPE)) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
        }
        if (this.f25429f) {
            if (!kotlin.jvm.internal.p.a(this.f25430g, "    ")) {
                String str = this.f25430g;
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f25430g).toString());
                    }
                }
            }
        } else if (!kotlin.jvm.internal.p.a(this.f25430g, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new d(this.f25424a, this.f25426c, this.f25427d, this.f25428e, this.f25429f, this.f25425b, this.f25430g, this.f25431h, this.f25432i, this.f25433j, this.f25434k, this.f25435l);
    }

    public final aa.c b() {
        return this.f25436m;
    }

    public final void c(boolean z10) {
        this.f25428e = z10;
    }

    public final void d(boolean z10) {
        this.f25424a = z10;
    }

    public final void e(boolean z10) {
        this.f25425b = z10;
    }

    public final void f(boolean z10) {
        this.f25426c = z10;
    }

    public final void g(boolean z10) {
        this.f25429f = z10;
    }
}
