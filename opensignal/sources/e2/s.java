package e2;

import androidx.compose.ui.semantics.SemanticsConfiguration;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f7760a;

    /* renamed from: b, reason: collision with root package name */
    public final ar.n f7761b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7762c;

    public s(String str, ar.n nVar) {
        this.f7760a = str;
        this.f7761b = nVar;
    }

    public final void a(SemanticsConfiguration semanticsConfiguration, Object obj) {
        semanticsConfiguration.d(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f7760a;
    }

    public /* synthetic */ s(String str) {
        this(str, o.N);
    }

    public s(String str, int i10) {
        this(str);
        this.f7762c = true;
    }

    public s(String str, boolean z10, ar.n nVar) {
        this(str, nVar);
        this.f7762c = z10;
    }
}
