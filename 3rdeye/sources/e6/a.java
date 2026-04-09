package E6;

import E6.f;
import N7.C1154e9;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import p9.InterfaceC5480a;
import y9.C5826h;
import y9.r;

/* compiled from: BaseInputMask.kt */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public b f1446a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1447b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f1448c;

    /* renamed from: d, reason: collision with root package name */
    public int f1449d;

    /* compiled from: BaseInputMask.kt */
    /* renamed from: E6.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0017a {

        /* compiled from: BaseInputMask.kt */
        /* renamed from: E6.a$a$a, reason: collision with other inner class name */
        public static final class C0018a extends AbstractC0017a {

            /* renamed from: a, reason: collision with root package name */
            public Character f1450a = null;

            /* renamed from: b, reason: collision with root package name */
            public final C5826h f1451b;

            /* renamed from: c, reason: collision with root package name */
            public final char f1452c;

            public C0018a(C5826h c5826h, char c10) {
                this.f1451b = c5826h;
                this.f1452c = c10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0018a)) {
                    return false;
                }
                C0018a c0018a = (C0018a) obj;
                return l.b(this.f1450a, c0018a.f1450a) && l.b(this.f1451b, c0018a.f1451b) && this.f1452c == c0018a.f1452c;
            }

            public final int hashCode() {
                Character ch = this.f1450a;
                int iHashCode = (ch == null ? 0 : ch.hashCode()) * 31;
                C5826h c5826h = this.f1451b;
                return ((iHashCode + (c5826h != null ? c5826h.hashCode() : 0)) * 31) + this.f1452c;
            }

            public final String toString() {
                return "Dynamic(char=" + this.f1450a + ", filter=" + this.f1451b + ", placeholder=" + this.f1452c + ')';
            }
        }

        /* compiled from: BaseInputMask.kt */
        /* renamed from: E6.a$a$b */
        public static final class b extends AbstractC0017a {

            /* renamed from: a, reason: collision with root package name */
            public final char f1453a;

            public b(char c10) {
                this.f1453a = c10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f1453a == ((b) obj).f1453a;
            }

            public final int hashCode() {
                return this.f1453a;
            }

            public final String toString() {
                return "Static(char=" + this.f1453a + ')';
            }
        }
    }

    /* compiled from: BaseInputMask.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f1454a;

        /* renamed from: b, reason: collision with root package name */
        public final List<c> f1455b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f1456c;

        public b(String pattern, List<c> decoding, boolean z10) {
            l.f(pattern, "pattern");
            l.f(decoding, "decoding");
            this.f1454a = pattern;
            this.f1455b = decoding;
            this.f1456c = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.b(this.f1454a, bVar.f1454a) && l.b(this.f1455b, bVar.f1455b) && this.f1456c == bVar.f1456c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int iHashCode = (this.f1455b.hashCode() + (this.f1454a.hashCode() * 31)) * 31;
            boolean z10 = this.f1456c;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            return iHashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MaskData(pattern=");
            sb.append(this.f1454a);
            sb.append(", decoding=");
            sb.append(this.f1455b);
            sb.append(", alwaysVisible=");
            return C1154e9.k(sb, this.f1456c, ')');
        }
    }

    /* compiled from: BaseInputMask.kt */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final char f1457a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1458b;

        /* renamed from: c, reason: collision with root package name */
        public final char f1459c;

        public c(char c10, char c11, String str) {
            this.f1457a = c10;
            this.f1458b = str;
            this.f1459c = c11;
        }
    }

    /* compiled from: BaseInputMask.kt */
    public static final class d extends m implements InterfaceC5480a<C5826h> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ u f1460g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ a f1461h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(u uVar, a aVar) {
            super(0);
            this.f1460g = uVar;
            this.f1461h = aVar;
        }

        @Override // p9.InterfaceC5480a
        public final C5826h invoke() {
            u uVar;
            a aVar;
            while (true) {
                uVar = this.f1460g;
                int i = uVar.f43658b;
                aVar = this.f1461h;
                if (i >= ((ArrayList) aVar.g()).size()) {
                    break;
                }
                if (((ArrayList) aVar.g()).get(uVar.f43658b) instanceof AbstractC0017a.C0018a) {
                    break;
                }
                uVar.f43658b++;
            }
            Object objR0 = C2097r.r0(uVar.f43658b, aVar.g());
            AbstractC0017a.C0018a c0018a = objR0 instanceof AbstractC0017a.C0018a ? (AbstractC0017a.C0018a) objR0 : null;
            if (c0018a != null) {
                return c0018a.f1451b;
            }
            return null;
        }
    }

    public a(b initialMaskData) {
        l.f(initialMaskData, "initialMaskData");
        this.f1446a = initialMaskData;
        this.f1447b = new LinkedHashMap();
        o(initialMaskData, true);
    }

    public void a(String str, Integer num) {
        f fVarA = f.a.a(j(), str);
        int iIntValue = num.intValue();
        int i = fVarA.f1471b;
        int i10 = iIntValue - i;
        if (i10 < 0) {
            i10 = 0;
        }
        f fVar = new f(i10, i, fVarA.f1472c);
        b(fVar, m(fVar, str));
    }

    public final void b(f fVar, int i) {
        int iH = h();
        if (fVar.f1470a < iH) {
            while (i < ((ArrayList) g()).size() && !(((AbstractC0017a) ((ArrayList) g()).get(i)) instanceof AbstractC0017a.C0018a)) {
                i++;
            }
            iH = Math.min(i, j().length());
        }
        this.f1449d = iH;
    }

    public final String c(int i, String str) {
        StringBuilder sb = new StringBuilder();
        u uVar = new u();
        uVar.f43658b = i;
        d dVar = new d(uVar, this);
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            C5826h c5826h = (C5826h) dVar.invoke();
            if (c5826h != null && c5826h.a(String.valueOf(cCharAt))) {
                sb.append(cCharAt);
                uVar.f43658b++;
            }
        }
        String string = sb.toString();
        l.e(string, "charsCanBeInsertedStringBuilder.toString()");
        return string;
    }

    public final void d(f fVar) {
        int i = fVar.f1471b;
        int i10 = fVar.f1470a;
        if (i == 0 && fVar.f1472c == 1) {
            int i11 = i10;
            while (true) {
                if (i11 < 0) {
                    break;
                }
                AbstractC0017a abstractC0017a = (AbstractC0017a) ((ArrayList) g()).get(i11);
                if (abstractC0017a instanceof AbstractC0017a.C0018a) {
                    AbstractC0017a.C0018a c0018a = (AbstractC0017a.C0018a) abstractC0017a;
                    if (c0018a.f1450a != null) {
                        c0018a.f1450a = null;
                        break;
                    }
                }
                i11--;
            }
        }
        e(i10, ((ArrayList) g()).size());
    }

    public final void e(int i, int i10) {
        while (i < i10 && i < ((ArrayList) g()).size()) {
            AbstractC0017a abstractC0017a = (AbstractC0017a) ((ArrayList) g()).get(i);
            if (abstractC0017a instanceof AbstractC0017a.C0018a) {
                ((AbstractC0017a.C0018a) abstractC0017a).f1450a = null;
            }
            i++;
        }
    }

    public final String f(int i, int i10) {
        Character ch;
        StringBuilder sb = new StringBuilder();
        while (i <= i10) {
            AbstractC0017a abstractC0017a = (AbstractC0017a) ((ArrayList) g()).get(i);
            if ((abstractC0017a instanceof AbstractC0017a.C0018a) && (ch = ((AbstractC0017a.C0018a) abstractC0017a).f1450a) != null) {
                sb.append(ch);
            }
            i++;
        }
        String string = sb.toString();
        l.e(string, "tailStringBuilder.toString()");
        return string;
    }

    public final List<AbstractC0017a> g() {
        ArrayList arrayList = this.f1448c;
        if (arrayList != null) {
            return arrayList;
        }
        l.l("destructedValue");
        throw null;
    }

    public final int h() {
        Iterator it = ((ArrayList) g()).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            AbstractC0017a abstractC0017a = (AbstractC0017a) it.next();
            if ((abstractC0017a instanceof AbstractC0017a.C0018a) && ((AbstractC0017a.C0018a) abstractC0017a).f1450a == null) {
                break;
            }
            i++;
        }
        return i != -1 ? i : ((ArrayList) g()).size();
    }

    public final String i() {
        return f(0, ((ArrayList) g()).size() - 1);
    }

    public final String j() {
        Character ch;
        StringBuilder sb = new StringBuilder();
        List<AbstractC0017a> listG = g();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            AbstractC0017a abstractC0017a = (AbstractC0017a) obj;
            if (abstractC0017a instanceof AbstractC0017a.b) {
                sb.append(((AbstractC0017a.b) abstractC0017a).f1453a);
            } else if ((abstractC0017a instanceof AbstractC0017a.C0018a) && (ch = ((AbstractC0017a.C0018a) abstractC0017a).f1450a) != null) {
                sb.append(ch);
            } else {
                if (!this.f1446a.f1456c) {
                    break;
                }
                l.d(abstractC0017a, "null cannot be cast to non-null type com.yandex.div.core.util.mask.BaseInputMask.MaskChar.Dynamic");
                sb.append(((AbstractC0017a.C0018a) abstractC0017a).f1452c);
            }
            arrayList.add(obj);
        }
        String string = sb.toString();
        l.e(string, "stringBuilder.toString()");
        return string;
    }

    public abstract void k(PatternSyntaxException patternSyntaxException);

    public void l(String str) {
        e(0, ((ArrayList) g()).size());
        n(str, 0, null);
        this.f1449d = Math.min(this.f1449d, j().length());
    }

    public final int m(f fVar, String str) {
        int length;
        Integer numValueOf;
        int i = fVar.f1470a;
        String strSubstring = str.substring(i, fVar.f1471b + i);
        l.e(strSubstring, "substring(...)");
        String strF = f(i + fVar.f1472c, ((ArrayList) g()).size() - 1);
        d(fVar);
        int iH = h();
        if (strF.length() == 0) {
            numValueOf = null;
        } else {
            if (this.f1447b.size() <= 1) {
                int i10 = 0;
                for (int i11 = iH; i11 < ((ArrayList) g()).size(); i11++) {
                    if (((ArrayList) g()).get(i11) instanceof AbstractC0017a.C0018a) {
                        i10++;
                    }
                }
                length = i10 - strF.length();
            } else {
                String strC = c(iH, strF);
                int i12 = 0;
                while (i12 < ((ArrayList) g()).size() && strC.equals(c(iH + i12, strF))) {
                    i12++;
                }
                length = i12 - 1;
            }
            numValueOf = Integer.valueOf(length >= 0 ? length : 0);
        }
        n(strSubstring, iH, numValueOf);
        int iH2 = h();
        n(strF, iH2, null);
        return iH2;
    }

    public final void n(String str, int i, Integer num) {
        String strC = c(i, str);
        if (num != null) {
            strC = r.z0(num.intValue(), strC);
        }
        int i10 = 0;
        while (i < ((ArrayList) g()).size() && i10 < strC.length()) {
            AbstractC0017a abstractC0017a = (AbstractC0017a) ((ArrayList) g()).get(i);
            char cCharAt = strC.charAt(i10);
            if (abstractC0017a instanceof AbstractC0017a.C0018a) {
                ((AbstractC0017a.C0018a) abstractC0017a).f1450a = Character.valueOf(cCharAt);
                i10++;
            }
            i++;
        }
    }

    public final void o(b newMaskData, boolean z10) {
        Object next;
        l.f(newMaskData, "newMaskData");
        String strI = (l.b(this.f1446a, newMaskData) || !z10) ? null : i();
        this.f1446a = newMaskData;
        LinkedHashMap linkedHashMap = this.f1447b;
        linkedHashMap.clear();
        for (c cVar : this.f1446a.f1455b) {
            try {
                String str = cVar.f1458b;
                if (str != null) {
                    linkedHashMap.put(Character.valueOf(cVar.f1457a), new C5826h(str));
                }
            } catch (PatternSyntaxException e4) {
                k(e4);
            }
        }
        String str2 = this.f1446a.f1454a;
        ArrayList arrayList = new ArrayList(str2.length());
        for (int i = 0; i < str2.length(); i++) {
            char cCharAt = str2.charAt(i);
            Iterator<T> it = this.f1446a.f1455b.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((c) next).f1457a == cCharAt) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            c cVar2 = (c) next;
            arrayList.add(cVar2 != null ? new AbstractC0017a.C0018a((C5826h) linkedHashMap.get(Character.valueOf(cVar2.f1457a)), cVar2.f1459c) : new AbstractC0017a.b(cCharAt));
        }
        this.f1448c = arrayList;
        if (strI != null) {
            l(strI);
        }
    }
}
