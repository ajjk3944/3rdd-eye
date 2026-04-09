package j3;

import N7.C1094a9;
import N7.H7;
import android.util.Log;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import j3.f;
import j3.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: CSSParser.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public f f42678a;

    /* renamed from: b, reason: collision with root package name */
    public t f42679b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f42680c;

    /* compiled from: CSSParser.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42681a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f42682b;

        static {
            int[] iArr = new int[j.values().length];
            f42682b = iArr;
            try {
                iArr[j.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42682b[j.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42682b[j.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42682b[j.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42682b[j.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42682b[j.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42682b[j.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f42682b[j.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f42682b[j.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f42682b[j.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f42682b[j.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f42682b[j.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f42682b[j.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f42682b[j.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f42682b[j.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f42682b[j.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f42682b[j.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f42682b[j.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f42682b[j.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f42682b[j.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f42682b[j.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f42682b[j.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f42682b[j.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f42682b[j.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[c.values().length];
            f42681a = iArr2;
            try {
                iArr2[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f42681a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f42681a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: CSSParser.java */
    /* renamed from: j3.b$b, reason: collision with other inner class name */
    public static class C0472b {

        /* renamed from: a, reason: collision with root package name */
        public final String f42683a;

        /* renamed from: b, reason: collision with root package name */
        public final c f42684b;

        /* renamed from: c, reason: collision with root package name */
        public final String f42685c;

        public C0472b(String str, c cVar, String str2) {
            this.f42683a = str;
            this.f42684b = cVar;
            this.f42685c = str2;
        }
    }

    /* compiled from: CSSParser.java */
    public enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    /* compiled from: CSSParser.java */
    public static class d extends i.C0476i {

        /* compiled from: CSSParser.java */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final int f42686a;

            /* renamed from: b, reason: collision with root package name */
            public final int f42687b;

            public a(int i, int i10) {
                this.f42686a = i;
                this.f42687b = i10;
            }
        }

        public d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        public static int r(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            if (i >= 65 && i <= 70) {
                return i - 55;
            }
            if (i < 97 || i > 102) {
                return -1;
            }
            return i - 87;
        }

        public final String s() {
            int iR;
            if (f()) {
                return null;
            }
            char cCharAt = this.f42951a.charAt(this.f42952b);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            this.f42952b++;
            int iIntValue = h().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = h().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = h().intValue();
                        } else {
                            int iR2 = r(iIntValue);
                            if (iR2 != -1) {
                                for (int i = 1; i <= 5 && (iR = r((iIntValue = h().intValue()))) != -1; i++) {
                                    iR2 = (iR2 * 16) + iR;
                                }
                                sb.append((char) iR2);
                            }
                        }
                    }
                }
                sb.append((char) iIntValue);
                iIntValue = h().intValue();
            }
            return sb.toString();
        }

        public final String t() {
            int i;
            int i10;
            boolean zF = f();
            String str = this.f42951a;
            if (zF) {
                i10 = this.f42952b;
            } else {
                int i11 = this.f42952b;
                int iCharAt = str.charAt(i11);
                if (iCharAt == 45) {
                    iCharAt = a();
                }
                if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                    i = i11;
                } else {
                    int iA = a();
                    while (true) {
                        if ((iA < 65 || iA > 90) && ((iA < 97 || iA > 122) && !((iA >= 48 && iA <= 57) || iA == 45 || iA == 95))) {
                            break;
                        }
                        iA = a();
                    }
                    i = this.f42952b;
                }
                this.f42952b = i11;
                i10 = i;
            }
            int i12 = this.f42952b;
            if (i10 == i12) {
                return null;
            }
            String strSubstring = str.substring(i12, i10);
            this.f42952b = i10;
            return strSubstring;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01e5  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x024e  */
        /* JADX WARN: Removed duplicated region for block: B:182:0x029f  */
        /* JADX WARN: Removed duplicated region for block: B:236:0x0370  */
        /* JADX WARN: Removed duplicated region for block: B:238:0x0376  */
        /* JADX WARN: Removed duplicated region for block: B:254:0x0429  */
        /* JADX WARN: Removed duplicated region for block: B:259:0x0442  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:283:0x0273 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:284:0x0393 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:285:0x0464 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
        /* JADX WARN: Type inference failed for: r11v11, types: [j3.b$m] */
        /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v42, types: [j3.b$k, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v43, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v45, types: [j3.b$l] */
        /* JADX WARN: Type inference failed for: r11v49, types: [j3.b$l] */
        /* JADX WARN: Type inference failed for: r11v7, types: [j3.b$m] */
        /* JADX WARN: Type inference failed for: r12v12, types: [j3.b$c] */
        /* JADX WARN: Type inference failed for: r12v34 */
        /* JADX WARN: Type inference failed for: r12v35 */
        /* JADX WARN: Type inference failed for: r12v36, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r12v39 */
        /* JADX WARN: Type inference failed for: r12v40 */
        /* JADX WARN: Type inference failed for: r12v44 */
        /* JADX WARN: Type inference failed for: r12v45 */
        /* JADX WARN: Type inference failed for: r22v1 */
        /* JADX WARN: Type inference failed for: r22v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r22v3 */
        /* JADX WARN: Type inference failed for: r23v1 */
        /* JADX WARN: Type inference failed for: r23v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r23v3 */
        /* JADX WARN: Type inference failed for: r6v12 */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4, types: [j3.b$e] */
        /* JADX WARN: Type inference failed for: r9v10, types: [j3.b$s] */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v12, types: [j3.b$s] */
        /* JADX WARN: Type inference failed for: r9v13, types: [j3.b$s] */
        /* JADX WARN: Type inference failed for: r9v14, types: [j3.b$s] */
        /* JADX WARN: Type inference failed for: r9v15, types: [j3.b$s] */
        /* JADX WARN: Type inference failed for: r9v20, types: [j3.b$s] */
        /* JADX WARN: Type inference failed for: r9v23 */
        /* JADX WARN: Type inference failed for: r9v26 */
        /* JADX WARN: Type inference failed for: r9v27 */
        /* JADX WARN: Type inference failed for: r9v28 */
        /* JADX WARN: Type inference failed for: r9v29 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v30 */
        /* JADX WARN: Type inference failed for: r9v31 */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v9, types: [j3.b$s] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.ArrayList u() throws j3.C5168a {
            /*
                Method dump skipped, instructions count: 1194
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j3.b.d.u():java.util.ArrayList");
        }
    }

    /* compiled from: CSSParser.java */
    public enum e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    /* compiled from: CSSParser.java */
    public enum f {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    /* compiled from: CSSParser.java */
    public interface g {
        boolean a(f.L l5);
    }

    /* compiled from: CSSParser.java */
    public static class h implements g {

        /* renamed from: a, reason: collision with root package name */
        public final int f42688a;

        /* renamed from: b, reason: collision with root package name */
        public final int f42689b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f42690c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f42691d;

        /* renamed from: e, reason: collision with root package name */
        public final String f42692e;

        public h(String str, int i, int i10, boolean z10, boolean z11) {
            this.f42688a = i;
            this.f42689b = i10;
            this.f42690c = z10;
            this.f42691d = z11;
            this.f42692e = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0065 A[RETURN] */
        @Override // j3.b.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(j3.f.L r8) {
            /*
                r7 = this;
                boolean r0 = r7.f42691d
                java.lang.String r1 = r7.f42692e
                if (r0 == 0) goto Lc
                if (r1 != 0) goto Lc
                java.lang.String r1 = r8.n()
            Lc:
                j3.f$J r0 = r8.f42787b
                r2 = 1
                r3 = 0
                if (r0 == 0) goto L3c
                java.util.List r0 = r0.a()
                java.util.Iterator r0 = r0.iterator()
                r4 = r3
                r5 = r4
            L1c:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L3e
                java.lang.Object r6 = r0.next()
                j3.f$N r6 = (j3.f.N) r6
                j3.f$L r6 = (j3.f.L) r6
                if (r6 != r8) goto L2d
                r4 = r5
            L2d:
                if (r1 == 0) goto L39
                java.lang.String r6 = r6.n()
                boolean r6 = r6.equals(r1)
                if (r6 == 0) goto L1c
            L39:
                int r5 = r5 + 1
                goto L1c
            L3c:
                r5 = r2
                r4 = r3
            L3e:
                boolean r8 = r7.f42690c
                if (r8 == 0) goto L44
                int r4 = r4 + r2
                goto L46
            L44:
                int r4 = r5 - r4
            L46:
                int r8 = r7.f42688a
                int r0 = r7.f42689b
                if (r8 != 0) goto L4f
                if (r4 != r0) goto L65
                goto L64
            L4f:
                int r4 = r4 - r0
                int r0 = r4 % r8
                if (r0 != 0) goto L65
                int r0 = java.lang.Integer.signum(r4)
                if (r0 == 0) goto L64
                int r0 = java.lang.Integer.signum(r4)
                int r8 = java.lang.Integer.signum(r8)
                if (r0 != r8) goto L65
            L64:
                return r2
            L65:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: j3.b.h.a(j3.f$L):boolean");
        }

        public final String toString() {
            String str = this.f42690c ? "" : "last-";
            boolean z10 = this.f42691d;
            int i = this.f42689b;
            int i10 = this.f42688a;
            return z10 ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i10), Integer.valueOf(i), this.f42692e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i10), Integer.valueOf(i));
        }
    }

    /* compiled from: CSSParser.java */
    public static class i implements g {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // j3.b.g
        public final boolean a(f.L l5) {
            return !(l5 instanceof f.J) || ((f.J) l5).a().size() == 0;
        }

        public final String toString() {
            return "empty";
        }
    }

    /* compiled from: CSSParser.java */
    public enum j {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;

        private static final Map<String, j> cache = new HashMap();

        static {
            for (j jVar : values()) {
                if (jVar != UNSUPPORTED) {
                    cache.put(jVar.name().replace('_', '-'), jVar);
                }
            }
        }

        public static j fromString(String str) {
            j jVar = cache.get(str);
            return jVar != null ? jVar : UNSUPPORTED;
        }
    }

    /* compiled from: CSSParser.java */
    public static class k implements g {

        /* renamed from: a, reason: collision with root package name */
        public List<r> f42693a;

        @Override // j3.b.g
        public final boolean a(f.L l5) {
            Iterator<r> it = this.f42693a.iterator();
            while (it.hasNext()) {
                if (b.g(it.next(), l5)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return C1094a9.h(new StringBuilder("not("), this.f42693a, ")");
        }
    }

    /* compiled from: CSSParser.java */
    public static class l implements g {

        /* renamed from: a, reason: collision with root package name */
        public final String f42694a;

        public l(String str) {
            this.f42694a = str;
        }

        @Override // j3.b.g
        public final boolean a(f.L l5) {
            return false;
        }

        public final String toString() {
            return this.f42694a;
        }
    }

    /* compiled from: CSSParser.java */
    public static class m implements g {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f42695a;

        /* renamed from: b, reason: collision with root package name */
        public final String f42696b;

        public m(boolean z10, String str) {
            this.f42695a = z10;
            this.f42696b = str;
        }

        @Override // j3.b.g
        public final boolean a(f.L l5) {
            int i;
            boolean z10 = this.f42695a;
            String strN = this.f42696b;
            if (z10 && strN == null) {
                strN = l5.n();
            }
            f.J j4 = l5.f42787b;
            if (j4 != null) {
                Iterator<f.N> it = j4.a().iterator();
                i = 0;
                while (it.hasNext()) {
                    f.L l10 = (f.L) it.next();
                    if (strN == null || l10.n().equals(strN)) {
                        i++;
                    }
                }
            } else {
                i = 1;
            }
            return i == 1;
        }

        public final String toString() {
            return this.f42695a ? B4.f.c(new StringBuilder("only-of-type <"), this.f42696b, ">") : "only-child";
        }
    }

    /* compiled from: CSSParser.java */
    public static class n implements g {
        @Override // j3.b.g
        public final boolean a(f.L l5) {
            return l5.f42787b == null;
        }

        public final String toString() {
            return "root";
        }
    }

    /* compiled from: CSSParser.java */
    public static class o implements g {
        @Override // j3.b.g
        public final boolean a(f.L l5) {
            return false;
        }

        public final String toString() {
            return "target";
        }
    }

    /* compiled from: CSSParser.java */
    public static class p {

        /* renamed from: a, reason: collision with root package name */
        public r f42697a;

        /* renamed from: b, reason: collision with root package name */
        public f.E f42698b;

        /* renamed from: c, reason: collision with root package name */
        public t f42699c;

        public final String toString() {
            return String.valueOf(this.f42697a) + " {...} (src=" + this.f42699c + ")";
        }
    }

    /* compiled from: CSSParser.java */
    public static class q {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f42700a = null;

        public final void a(p pVar) {
            if (this.f42700a == null) {
                this.f42700a = new ArrayList();
            }
            for (int i = 0; i < this.f42700a.size(); i++) {
                if (((p) this.f42700a.get(i)).f42697a.f42702b > pVar.f42697a.f42702b) {
                    this.f42700a.add(i, pVar);
                    return;
                }
            }
            this.f42700a.add(pVar);
        }

        public final void b(q qVar) {
            if (qVar.f42700a == null) {
                return;
            }
            if (this.f42700a == null) {
                this.f42700a = new ArrayList(qVar.f42700a.size());
            }
            Iterator it = qVar.f42700a.iterator();
            while (it.hasNext()) {
                a((p) it.next());
            }
        }

        public final String toString() {
            if (this.f42700a == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f42700a.iterator();
            while (it.hasNext()) {
                sb.append(((p) it.next()).toString());
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    /* compiled from: CSSParser.java */
    public static class r {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f42701a = null;

        /* renamed from: b, reason: collision with root package name */
        public int f42702b = 0;

        public final void a() {
            this.f42702b += 1000;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f42701a.iterator();
            while (it.hasNext()) {
                sb.append((s) it.next());
                sb.append(' ');
            }
            sb.append('[');
            return H7.p(sb, this.f42702b, ']');
        }
    }

    /* compiled from: CSSParser.java */
    public static class s {

        /* renamed from: a, reason: collision with root package name */
        public final e f42703a;

        /* renamed from: b, reason: collision with root package name */
        public final String f42704b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f42705c = null;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList f42706d = null;

        public s(e eVar, String str) {
            this.f42703a = null;
            this.f42704b = null;
            this.f42703a = eVar == null ? e.DESCENDANT : eVar;
            this.f42704b = str;
        }

        public final void a(String str, c cVar, String str2) {
            if (this.f42705c == null) {
                this.f42705c = new ArrayList();
            }
            this.f42705c.add(new C0472b(str, cVar, str2));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            e eVar = e.CHILD;
            e eVar2 = this.f42703a;
            if (eVar2 == eVar) {
                sb.append("> ");
            } else if (eVar2 == e.FOLLOWS) {
                sb.append("+ ");
            }
            String str = this.f42704b;
            if (str == null) {
                str = "*";
            }
            sb.append(str);
            ArrayList arrayList = this.f42705c;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0472b c0472b = (C0472b) it.next();
                    sb.append('[');
                    sb.append(c0472b.f42683a);
                    int i = a.f42681a[c0472b.f42684b.ordinal()];
                    String str2 = c0472b.f42685c;
                    if (i == 1) {
                        sb.append('=');
                        sb.append(str2);
                    } else if (i == 2) {
                        sb.append("~=");
                        sb.append(str2);
                    } else if (i == 3) {
                        sb.append("|=");
                        sb.append(str2);
                    }
                    sb.append(']');
                }
            }
            ArrayList arrayList2 = this.f42706d;
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    g gVar = (g) it2.next();
                    sb.append(':');
                    sb.append(gVar);
                }
            }
            return sb.toString();
        }
    }

    /* compiled from: CSSParser.java */
    public enum t {
        Document,
        RenderOptions
    }

    public static int a(ArrayList arrayList, int i10, f.L l5) {
        int i11 = 0;
        if (i10 < 0) {
            return 0;
        }
        Object obj = arrayList.get(i10);
        f.J j4 = l5.f42787b;
        if (obj != j4) {
            return -1;
        }
        Iterator<f.N> it = j4.a().iterator();
        while (it.hasNext()) {
            if (it.next() == l5) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static ArrayList c(d dVar) {
        ArrayList arrayList = new ArrayList();
        while (!dVar.f()) {
            String strSubstring = null;
            if (!dVar.f()) {
                int i10 = dVar.f42952b;
                String str = dVar.f42951a;
                char cCharAt = str.charAt(i10);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    dVar.f42952b = i10;
                } else {
                    int iA = dVar.a();
                    while (true) {
                        if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                            break;
                        }
                        iA = dVar.a();
                    }
                    strSubstring = str.substring(i10, dVar.f42952b);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(f.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!dVar.p()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean f(r rVar, int i10, ArrayList arrayList, int i11, f.L l5) {
        s sVar = (s) rVar.f42701a.get(i10);
        if (!i(sVar, l5)) {
            return false;
        }
        e eVar = e.DESCENDANT;
        e eVar2 = sVar.f42703a;
        if (eVar2 == eVar) {
            if (i10 != 0) {
                while (i11 >= 0) {
                    if (!h(rVar, i10 - 1, arrayList, i11)) {
                        i11--;
                    }
                }
                return false;
            }
            return true;
        }
        if (eVar2 == e.CHILD) {
            return h(rVar, i10 - 1, arrayList, i11);
        }
        int iA = a(arrayList, i11, l5);
        if (iA <= 0) {
            return false;
        }
        return f(rVar, i10 - 1, arrayList, i11, (f.L) l5.f42787b.a().get(iA - 1));
    }

    public static boolean g(r rVar, f.L l5) {
        ArrayList arrayList = new ArrayList();
        Object obj = l5.f42787b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((f.N) obj).f42787b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = rVar.f42701a;
        if ((arrayList2 == null ? 0 : arrayList2.size()) == 1) {
            return i((s) rVar.f42701a.get(0), l5);
        }
        ArrayList arrayList3 = rVar.f42701a;
        return f(rVar, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, l5);
    }

    public static boolean h(r rVar, int i10, ArrayList arrayList, int i11) {
        s sVar = (s) rVar.f42701a.get(i10);
        f.L l5 = (f.L) arrayList.get(i11);
        if (!i(sVar, l5)) {
            return false;
        }
        e eVar = e.DESCENDANT;
        e eVar2 = sVar.f42703a;
        if (eVar2 == eVar) {
            if (i10 != 0) {
                while (i11 > 0) {
                    i11--;
                    if (h(rVar, i10 - 1, arrayList, i11)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (eVar2 == e.CHILD) {
            return h(rVar, i10 - 1, arrayList, i11 - 1);
        }
        int iA = a(arrayList, i11, l5);
        if (iA <= 0) {
            return false;
        }
        return f(rVar, i10 - 1, arrayList, i11, (f.L) l5.f42787b.a().get(iA - 1));
    }

    public static boolean i(s sVar, f.L l5) {
        ArrayList arrayList;
        String str = sVar.f42704b;
        if (str != null && !str.equals(l5.n().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList arrayList2 = sVar.f42705c;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C0472b c0472b = (C0472b) it.next();
                String str2 = c0472b.f42683a;
                String str3 = c0472b.f42685c;
                if (str2.equals(FacebookMediationAdapter.KEY_ID)) {
                    if (!str3.equals(l5.f42777c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = l5.f42781g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = sVar.f42706d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            if (!((g) it2.next()).a(l5)) {
                return false;
            }
        }
        return true;
    }

    public final void b(q qVar, d dVar) throws C5168a {
        int iIntValue;
        int iR;
        String strT = dVar.t();
        dVar.q();
        if (strT == null) {
            throw new C5168a("Invalid '@' rule");
        }
        int i10 = 0;
        if (!this.f42680c && strT.equals("media")) {
            ArrayList arrayListC = c(dVar);
            if (!dVar.d('{')) {
                throw new C5168a("Invalid @media rule: missing rule set");
            }
            dVar.q();
            f fVar = this.f42678a;
            Iterator it = arrayListC.iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (fVar2 == f.all || fVar2 == fVar) {
                    this.f42680c = true;
                    qVar.b(e(dVar));
                    this.f42680c = false;
                    break;
                }
            }
            e(dVar);
            if (!dVar.f() && !dVar.d('}')) {
                throw new C5168a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f42680c || !strT.equals("import")) {
            Log.w("CSSParser", "Ignoring @" + strT + " rule");
            while (!dVar.f() && ((iIntValue = dVar.h().intValue()) != 59 || i10 != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i10 > 0 && i10 - 1 == 0) {
                        break;
                    }
                } else {
                    i10++;
                }
            }
        } else {
            String strS = null;
            if (!dVar.f()) {
                int i11 = dVar.f42952b;
                if (dVar.e("url(")) {
                    dVar.q();
                    String strS2 = dVar.s();
                    if (strS2 == null) {
                        StringBuilder sb = new StringBuilder();
                        while (!dVar.f()) {
                            int i12 = dVar.f42952b;
                            String str = dVar.f42951a;
                            char cCharAt = str.charAt(i12);
                            if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '(' || cCharAt == ')' || i.C0476i.g(cCharAt) || Character.isISOControl((int) cCharAt)) {
                                break;
                            }
                            dVar.f42952b++;
                            if (cCharAt == '\\') {
                                if (!dVar.f()) {
                                    int i13 = dVar.f42952b;
                                    dVar.f42952b = i13 + 1;
                                    cCharAt = str.charAt(i13);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iR2 = d.r(cCharAt);
                                        if (iR2 != -1) {
                                            for (int i14 = 1; i14 <= 5 && !dVar.f() && (iR = d.r(str.charAt(dVar.f42952b))) != -1; i14++) {
                                                dVar.f42952b++;
                                                iR2 = (iR2 * 16) + iR;
                                            }
                                            sb.append((char) iR2);
                                        }
                                    }
                                }
                            }
                            sb.append(cCharAt);
                        }
                        strS2 = sb.length() == 0 ? null : sb.toString();
                    }
                    if (strS2 == null) {
                        dVar.f42952b = i11;
                    } else {
                        dVar.q();
                        if (dVar.f() || dVar.e(")")) {
                            strS = strS2;
                        } else {
                            dVar.f42952b = i11;
                        }
                    }
                }
            }
            if (strS == null) {
                strS = dVar.s();
            }
            if (strS == null) {
                throw new C5168a("Invalid @import rule: expected string or url()");
            }
            dVar.q();
            c(dVar);
            if (!dVar.f() && !dVar.d(';')) {
                throw new C5168a("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        dVar.q();
    }

    public final boolean d(q qVar, d dVar) throws C5168a {
        ArrayList arrayListU = dVar.u();
        if (arrayListU == null || arrayListU.isEmpty()) {
            return false;
        }
        if (!dVar.d('{')) {
            throw new C5168a("Malformed rule block: expected '{'");
        }
        dVar.q();
        f.E e4 = new f.E();
        do {
            String strT = dVar.t();
            dVar.q();
            if (!dVar.d(':')) {
                throw new C5168a("Expected ':'");
            }
            dVar.q();
            String strSubstring = null;
            if (!dVar.f()) {
                int i10 = dVar.f42952b;
                String str = dVar.f42951a;
                int iCharAt = str.charAt(i10);
                int i11 = i10;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!i.C0476i.g(iCharAt)) {
                        i11 = dVar.f42952b + 1;
                    }
                    iCharAt = dVar.a();
                }
                if (dVar.f42952b > i10) {
                    strSubstring = str.substring(i10, i11);
                } else {
                    dVar.f42952b = i10;
                }
            }
            if (strSubstring == null) {
                throw new C5168a("Expected property value");
            }
            dVar.q();
            if (dVar.d('!')) {
                dVar.q();
                if (!dVar.e("important")) {
                    throw new C5168a("Malformed rule set: found unexpected '!'");
                }
                dVar.q();
            }
            dVar.d(';');
            j3.i.D(e4, strT, strSubstring);
            dVar.q();
            if (dVar.f()) {
                break;
            }
        } while (!dVar.d('}'));
        dVar.q();
        Iterator it = arrayListU.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            p pVar = new p();
            pVar.f42697a = rVar;
            pVar.f42698b = e4;
            pVar.f42699c = this.f42679b;
            qVar.a(pVar);
        }
        return true;
    }

    public final q e(d dVar) {
        q qVar = new q();
        while (!dVar.f()) {
            try {
                if (!dVar.e("<!--") && !dVar.e("-->")) {
                    if (!dVar.d('@')) {
                        if (!d(qVar, dVar)) {
                            break;
                        }
                    } else {
                        b(qVar, dVar);
                    }
                }
            } catch (C5168a e4) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e4.getMessage());
            }
        }
        return qVar;
    }
}
