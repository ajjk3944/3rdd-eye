package D7;

import kotlin.jvm.internal.l;

/* compiled from: ParsingContext.kt */
/* loaded from: classes.dex */
public final class e implements f, g {

    /* renamed from: b, reason: collision with root package name */
    public final f f1079b;

    public e(f baseContext) {
        l.f(baseContext, "baseContext");
        this.f1079b = baseContext;
    }

    @Override // D7.f
    public final z7.c a() {
        return this.f1079b.a();
    }

    @Override // D7.f
    public final B7.f<Z6.b<?>> c() {
        return this.f1079b.c();
    }

    @Override // D7.g
    public final f d() {
        return this.f1079b;
    }

    @Override // D7.f
    public final boolean e() {
        return false;
    }
}
