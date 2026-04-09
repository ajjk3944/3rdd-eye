package androidx.compose.animation;

import Zg.U;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q.C7380A;
import q.C7388g;
import q.C7394m;
import q.C7401t;
import q.C7404w;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f27648a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final k f27649b = new l(new C7380A(null, null, null, null, false, null, 63, null));

    /* renamed from: c, reason: collision with root package name */
    private static final k f27650c = new l(new C7380A(null, null, null, null, true, null, 47, null));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a() {
            return k.f27649b;
        }

        private a() {
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C7380A b();

    public final k c(k kVar) {
        C7394m c7394mC = kVar.b().c();
        if (c7394mC == null) {
            c7394mC = b().c();
        }
        C7394m c7394m = c7394mC;
        C7404w c7404wF = kVar.b().f();
        if (c7404wF == null) {
            c7404wF = b().f();
        }
        C7404w c7404w = c7404wF;
        C7388g c7388gA = kVar.b().a();
        if (c7388gA == null) {
            c7388gA = b().a();
        }
        C7388g c7388g = c7388gA;
        C7401t c7401tE = kVar.b().e();
        if (c7401tE == null) {
            c7401tE = b().e();
        }
        return new l(new C7380A(c7394m, c7404w, c7388g, c7401tE, kVar.b().d() || b().d(), U.n(b().b(), kVar.b().b())));
    }

    public boolean equals(Object obj) {
        return (obj instanceof k) && AbstractC6492s.d(((k) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        if (AbstractC6492s.d(this, f27649b)) {
            return "ExitTransition.None";
        }
        if (AbstractC6492s.d(this, f27650c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        C7380A c7380aB = b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExitTransition: \nFade - ");
        C7394m c7394mC = c7380aB.c();
        sb2.append(c7394mC != null ? c7394mC.toString() : null);
        sb2.append(",\nSlide - ");
        C7404w c7404wF = c7380aB.f();
        sb2.append(c7404wF != null ? c7404wF.toString() : null);
        sb2.append(",\nShrink - ");
        C7388g c7388gA = c7380aB.a();
        sb2.append(c7388gA != null ? c7388gA.toString() : null);
        sb2.append(",\nScale - ");
        C7401t c7401tE = c7380aB.e();
        sb2.append(c7401tE != null ? c7401tE.toString() : null);
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(c7380aB.d());
        return sb2.toString();
    }

    private k() {
    }
}
