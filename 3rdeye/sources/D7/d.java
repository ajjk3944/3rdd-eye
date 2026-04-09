package D7;

import java.util.ArrayList;
import kotlin.jvm.internal.l;

/* compiled from: ParsingContext.kt */
/* loaded from: classes.dex */
public final class d implements f, g {

    /* renamed from: b, reason: collision with root package name */
    public final f f1076b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1077c;

    /* renamed from: d, reason: collision with root package name */
    public final c f1078d;

    public d(f baseContext) {
        l.f(baseContext, "baseContext");
        this.f1076b = baseContext;
        this.f1077c = new ArrayList();
        this.f1078d = new c(this, 0);
    }

    @Override // D7.f
    public final z7.c a() {
        return this.f1078d;
    }

    @Override // D7.f
    public final B7.f<Z6.b<?>> c() {
        return this.f1076b.c();
    }

    @Override // D7.g
    public final f d() {
        return this.f1076b;
    }

    @Override // D7.f
    public final boolean e() {
        return this.f1076b.e();
    }
}
