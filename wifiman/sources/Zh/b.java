package Zh;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final a f25401d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final c f25402a;

    /* renamed from: b, reason: collision with root package name */
    private final c f25403b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25404c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b b(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(str, z10);
        }

        public final b a(String string, boolean z10) {
            String strL;
            String str;
            AbstractC6492s.i(string, "string");
            int iJ0 = t.j0(string, '`', 0, false, 6, null);
            if (iJ0 == -1) {
                iJ0 = string.length();
            }
            int iQ0 = t.q0(string, MqttTopic.TOPIC_LEVEL_SEPARATOR, iJ0, false, 4, null);
            if (iQ0 == -1) {
                strL = t.L(string, "`", "", false, 4, null);
                str = "";
            } else {
                String strSubstring = string.substring(0, iQ0);
                AbstractC6492s.h(strSubstring, "substring(...)");
                String strK = t.K(strSubstring, '/', '.', false, 4, null);
                String strSubstring2 = string.substring(iQ0 + 1);
                AbstractC6492s.h(strSubstring2, "substring(...)");
                strL = t.L(strSubstring2, "`", "", false, 4, null);
                str = strK;
            }
            return new b(new c(str), new c(strL), z10);
        }

        public final b c(c topLevelFqName) {
            AbstractC6492s.i(topLevelFqName, "topLevelFqName");
            c cVarE = topLevelFqName.e();
            AbstractC6492s.h(cVarE, "parent(...)");
            f fVarG = topLevelFqName.g();
            AbstractC6492s.h(fVarG, "shortName(...)");
            return new b(cVarE, fVarG);
        }

        private a() {
        }
    }

    public b(c packageFqName, c relativeClassName, boolean z10) {
        AbstractC6492s.i(packageFqName, "packageFqName");
        AbstractC6492s.i(relativeClassName, "relativeClassName");
        this.f25402a = packageFqName;
        this.f25403b = relativeClassName;
        this.f25404c = z10;
        relativeClassName.d();
    }

    private static final String c(c cVar) {
        String strB = cVar.b();
        AbstractC6492s.h(strB, "asString(...)");
        if (!t.V(strB, '/', false, 2, null)) {
            return strB;
        }
        return '`' + strB + '`';
    }

    public static final b k(c cVar) {
        return f25401d.c(cVar);
    }

    public final c a() {
        if (this.f25402a.d()) {
            return this.f25403b;
        }
        return new c(this.f25402a.b() + '.' + this.f25403b.b());
    }

    public final String b() {
        if (this.f25402a.d()) {
            return c(this.f25403b);
        }
        StringBuilder sb2 = new StringBuilder();
        String strB = this.f25402a.b();
        AbstractC6492s.h(strB, "asString(...)");
        sb2.append(t.K(strB, '.', '/', false, 4, null));
        sb2.append(MqttTopic.TOPIC_LEVEL_SEPARATOR);
        sb2.append(c(this.f25403b));
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    public final b d(f name) {
        AbstractC6492s.i(name, "name");
        c cVar = this.f25402a;
        c cVarC = this.f25403b.c(name);
        AbstractC6492s.h(cVarC, "child(...)");
        return new b(cVar, cVarC, this.f25404c);
    }

    public final b e() {
        c cVarE = this.f25403b.e();
        AbstractC6492s.h(cVarE, "parent(...)");
        if (cVarE.d()) {
            return null;
        }
        return new b(this.f25402a, cVarE, this.f25404c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC6492s.d(this.f25402a, bVar.f25402a) && AbstractC6492s.d(this.f25403b, bVar.f25403b) && this.f25404c == bVar.f25404c;
    }

    public final c f() {
        return this.f25402a;
    }

    public final c g() {
        return this.f25403b;
    }

    public final f h() {
        f fVarG = this.f25403b.g();
        AbstractC6492s.h(fVarG, "shortName(...)");
        return fVarG;
    }

    public int hashCode() {
        return (((this.f25402a.hashCode() * 31) + this.f25403b.hashCode()) * 31) + Boolean.hashCode(this.f25404c);
    }

    public final boolean i() {
        return this.f25404c;
    }

    public final boolean j() {
        return !this.f25403b.e().d();
    }

    public String toString() {
        if (!this.f25402a.d()) {
            return b();
        }
        return '/' + b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(c packageFqName, f topLevelName) {
        AbstractC6492s.i(packageFqName, "packageFqName");
        AbstractC6492s.i(topLevelName, "topLevelName");
        c cVarK = c.k(topLevelName);
        AbstractC6492s.h(cVarK, "topLevel(...)");
        this(packageFqName, cVarK, false);
    }
}
