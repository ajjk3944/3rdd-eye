package a4;

import b4.C0351p;
import com.lefan.base.activity.LanguageActivity;

/* loaded from: classes.dex */
public final class o implements b {

    /* renamed from: a, reason: collision with root package name */
    public final C0351p f4711a;

    /* renamed from: b, reason: collision with root package name */
    public final C0351p f4712b;

    /* renamed from: c, reason: collision with root package name */
    public final C0351p f4713c;

    public o(C0351p c0351p, C0351p c0351p2, C0351p c0351p3) {
        this.f4711a = c0351p;
        this.f4712b = c0351p2;
        this.f4713c = c0351p3;
    }

    @Override // a4.b
    public final c3.j a(V2.h hVar) {
        return d().a(hVar);
    }

    @Override // a4.b
    public final void b(LanguageActivity languageActivity) {
        d().b(languageActivity);
    }

    @Override // a4.b
    public final void c(LanguageActivity languageActivity) {
        d().c(languageActivity);
    }

    public final b d() {
        return this.f4713c.a() != null ? (b) this.f4712b.a() : (b) this.f4711a.a();
    }
}
