package vf;

import L0.C3174d;
import L0.D;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.InterfaceC6518l;
import kotlin.text.p;
import la.C6562a;
import mh.InterfaceC6839p;

/* renamed from: vf.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8224d {

    /* renamed from: a, reason: collision with root package name */
    public static final C8224d f63596a = new C8224d();

    /* renamed from: b, reason: collision with root package name */
    public static final int f63597b = 0;

    /* renamed from: vf.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f63598a;

        /* renamed from: b, reason: collision with root package name */
        private final String f63599b;

        public a(String tag, String annotation) {
            AbstractC6492s.i(tag, "tag");
            AbstractC6492s.i(annotation, "annotation");
            this.f63598a = tag;
            this.f63599b = annotation;
        }

        public final String a() {
            return this.f63599b;
        }

        public final String b() {
            return this.f63598a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f63598a, aVar.f63598a) && AbstractC6492s.d(this.f63599b, aVar.f63599b);
        }

        public int hashCode() {
            return (this.f63598a.hashCode() * 31) + this.f63599b.hashCode();
        }

        public String toString() {
            return "AnnotationSpec(tag=" + this.f63598a + ", annotation=" + this.f63599b + ")";
        }
    }

    private C8224d() {
    }

    public static /* synthetic */ C3174d d(C8224d c8224d, String str, long j10, String str2, InterfaceC6839p interfaceC6839p, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "\\[([^\\[\\]]+)\\]";
        }
        return c8224d.c(str, j10, str2, interfaceC6839p);
    }

    public final long a(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-993743231);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-993743231, i10, -1, "com.ui.wifiman.ui.util.HyperlinkText.hyperlinkColorDefault (HyperlinkText.kt:20)");
        }
        long jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jF;
    }

    public final C3174d b(C3174d text, long j10, String url) {
        AbstractC6492s.i(text, "text");
        AbstractC6492s.i(url, "url");
        C3174d.a aVar = new C3174d.a(0, 1, null);
        aVar.m("hostAddress", url);
        int iN = aVar.n(new D(j10, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
        try {
            aVar.g(text);
            J j11 = J.f24997a;
            aVar.l(iN);
            aVar.k();
            return aVar.p();
        } catch (Throwable th2) {
            aVar.l(iN);
            throw th2;
        }
    }

    public final C3174d c(String text, long j10, String hyperlinkPattern, InterfaceC6839p hyperlinkCreator) {
        AbstractC6492s.i(text, "text");
        AbstractC6492s.i(hyperlinkPattern, "hyperlinkPattern");
        AbstractC6492s.i(hyperlinkCreator, "hyperlinkCreator");
        int iJ = 0;
        C3174d.a aVar = new C3174d.a(0, 1, null);
        Iterator it = p.h(new p(hyperlinkPattern), text, 0, 2, null).iterator();
        if (it.hasNext()) {
            int i10 = 0;
            while (it.hasNext()) {
                InterfaceC6518l interfaceC6518l = (InterfaceC6518l) it.next();
                String strSubstring = text.substring(iJ, interfaceC6518l.d().i());
                AbstractC6492s.h(strSubstring, "substring(...)");
                aVar.i(strSubstring);
                String str = (String) interfaceC6518l.b().get(1);
                a aVar2 = (a) hyperlinkCreator.invoke(Integer.valueOf(i10), str);
                aVar.m(aVar2.b(), aVar2.a());
                int iN = aVar.n(new D(j10, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                try {
                    aVar.i(str);
                    J j11 = J.f24997a;
                    aVar.l(iN);
                    aVar.k();
                    iJ = interfaceC6518l.d().j() + 1;
                    i10++;
                    if (!it.hasNext()) {
                        String strSubstring2 = text.substring(iJ, text.length());
                        AbstractC6492s.h(strSubstring2, "substring(...)");
                        aVar.i(strSubstring2);
                    }
                } catch (Throwable th2) {
                    aVar.l(iN);
                    throw th2;
                }
            }
        } else {
            aVar.i(text);
        }
        return aVar.p();
    }
}
