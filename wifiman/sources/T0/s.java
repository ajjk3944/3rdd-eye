package T0;

import T.z1;
import android.graphics.Typeface;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final z1 f21334a;

    /* renamed from: b, reason: collision with root package name */
    private final s f21335b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f21336c;

    public s(z1 z1Var, s sVar) {
        this.f21334a = z1Var;
        this.f21335b = sVar;
        this.f21336c = z1Var.getValue();
    }

    public final Typeface a() {
        Object obj = this.f21336c;
        AbstractC6492s.g(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean b() {
        s sVar;
        return this.f21334a.getValue() != this.f21336c || ((sVar = this.f21335b) != null && sVar.b());
    }
}
