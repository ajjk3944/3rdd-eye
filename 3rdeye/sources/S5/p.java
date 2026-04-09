package S5;

import android.view.View;
import c9.C2099t;
import java.util.List;

/* compiled from: BalloonPlacement.kt */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final View f11988a;

    /* renamed from: b, reason: collision with root package name */
    public final List<View> f11989b;

    /* renamed from: c, reason: collision with root package name */
    public final k f11990c;

    /* renamed from: d, reason: collision with root package name */
    public final r f11991d;

    public p() {
        throw null;
    }

    public p(View anchor, k align) {
        C2099t c2099t = C2099t.f18581b;
        r type = r.ALIGNMENT;
        kotlin.jvm.internal.l.f(anchor, "anchor");
        kotlin.jvm.internal.l.f(align, "align");
        kotlin.jvm.internal.l.f(type, "type");
        this.f11988a = anchor;
        this.f11989b = c2099t;
        this.f11990c = align;
        this.f11991d = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.l.b(this.f11988a, pVar.f11988a) && kotlin.jvm.internal.l.b(this.f11989b, pVar.f11989b) && this.f11990c == pVar.f11990c && this.f11991d == pVar.f11991d;
    }

    public final int hashCode() {
        return this.f11991d.hashCode() + ((this.f11990c.hashCode() + ((this.f11989b.hashCode() + (this.f11988a.hashCode() * 31)) * 31)) * 29791);
    }

    public final String toString() {
        return "BalloonPlacement(anchor=" + this.f11988a + ", subAnchors=" + this.f11989b + ", align=" + this.f11990c + ", xOff=0, yOff=0, type=" + this.f11991d + ")";
    }
}
