package L0;

import Zg.AbstractC3689v;
import c0.InterfaceC4182k;
import ch.AbstractC4260a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.mp.PduHandle;

/* renamed from: L0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3174d implements CharSequence {

    /* renamed from: e, reason: collision with root package name */
    public static final b f11123e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final InterfaceC4182k f11124f = C.h();

    /* renamed from: a, reason: collision with root package name */
    private final String f11125a;

    /* renamed from: b, reason: collision with root package name */
    private final List f11126b;

    /* renamed from: c, reason: collision with root package name */
    private final List f11127c;

    /* renamed from: d, reason: collision with root package name */
    private final List f11128d;

    /* renamed from: L0.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: L0.d$d, reason: collision with other inner class name */
    public static final class C0441d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(Integer.valueOf(((c) obj).h()), Integer.valueOf(((c) obj2).h()));
        }
    }

    public C3174d(String str, List list, List list2, List list3) {
        List listX0;
        this.f11125a = str;
        this.f11126b = list;
        this.f11127c = list2;
        this.f11128d = list3;
        if (list2 == null || (listX0 = AbstractC3689v.X0(list2, new C0441d())) == null) {
            return;
        }
        int size = listX0.size();
        int iF = -1;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) listX0.get(i10);
            if (cVar.h() < iF) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }
            if (cVar.f() > this.f11125a.length()) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + cVar.h() + ", " + cVar.f() + ") is out of boundary").toString());
            }
            iF = cVar.f();
        }
    }

    public char a(int i10) {
        return this.f11125a.charAt(i10);
    }

    public final List b() {
        return this.f11128d;
    }

    public int c() {
        return this.f11125a.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    public final List d(int i10, int i11) {
        List listL;
        List list = this.f11128d;
        if (list != null) {
            listL = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                c cVar = (c) obj;
                if ((cVar.g() instanceof AbstractC3179i) && AbstractC3175e.n(i10, i11, cVar.h(), cVar.f())) {
                    listL.add(obj);
                }
            }
        } else {
            listL = AbstractC3689v.l();
        }
        AbstractC6492s.g(listL, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return listL;
    }

    public final List e() {
        List list = this.f11127c;
        return list == null ? AbstractC3689v.l() : list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3174d)) {
            return false;
        }
        C3174d c3174d = (C3174d) obj;
        return AbstractC6492s.d(this.f11125a, c3174d.f11125a) && AbstractC6492s.d(this.f11126b, c3174d.f11126b) && AbstractC6492s.d(this.f11127c, c3174d.f11127c) && AbstractC6492s.d(this.f11128d, c3174d.f11128d);
    }

    public final List f() {
        return this.f11127c;
    }

    public final List g() {
        List list = this.f11126b;
        return list == null ? AbstractC3689v.l() : list;
    }

    public final List h() {
        return this.f11126b;
    }

    public int hashCode() {
        int iHashCode = this.f11125a.hashCode() * 31;
        List list = this.f11126b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f11127c;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.f11128d;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final List i(int i10, int i11) {
        List listL;
        List list = this.f11128d;
        if (list != null) {
            listL = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                c cVar = (c) obj;
                if ((cVar.g() instanceof String) && AbstractC3175e.n(i10, i11, cVar.h(), cVar.f())) {
                    listL.add(obj);
                }
            }
        } else {
            listL = AbstractC3689v.l();
        }
        AbstractC6492s.g(listL, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return listL;
    }

    public final List j(String str, int i10, int i11) {
        List listL;
        List list = this.f11128d;
        if (list != null) {
            listL = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                c cVar = (c) obj;
                if ((cVar.g() instanceof String) && AbstractC6492s.d(str, cVar.i()) && AbstractC3175e.n(i10, i11, cVar.h(), cVar.f())) {
                    listL.add(obj);
                }
            }
        } else {
            listL = AbstractC3689v.l();
        }
        AbstractC6492s.g(listL, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return listL;
    }

    public final String k() {
        return this.f11125a;
    }

    public final List l(int i10, int i11) {
        List listL;
        List list = this.f11128d;
        if (list != null) {
            listL = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                c cVar = (c) obj;
                if ((cVar.g() instanceof W) && AbstractC3175e.n(i10, i11, cVar.h(), cVar.f())) {
                    listL.add(obj);
                }
            }
        } else {
            listL = AbstractC3689v.l();
        }
        AbstractC6492s.g(listL, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listL;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    public final List m(int i10, int i11) {
        List listL;
        List list = this.f11128d;
        if (list != null) {
            listL = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                c cVar = (c) obj;
                if ((cVar.g() instanceof X) && AbstractC3175e.n(i10, i11, cVar.h(), cVar.f())) {
                    listL.add(obj);
                }
            }
        } else {
            listL = AbstractC3689v.l();
        }
        AbstractC6492s.g(listL, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listL;
    }

    public final boolean n(C3174d c3174d) {
        return AbstractC6492s.d(this.f11128d, c3174d.f11128d);
    }

    public final boolean o(int i10, int i11) {
        List list = this.f11128d;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            c cVar = (c) list.get(i12);
            if ((cVar.g() instanceof AbstractC3179i) && AbstractC3175e.n(i10, i11, cVar.h(), cVar.f())) {
                return true;
            }
        }
        return false;
    }

    public final boolean p(String str, int i10, int i11) {
        List list = this.f11128d;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            c cVar = (c) list.get(i12);
            if ((cVar.g() instanceof String) && AbstractC6492s.d(str, cVar.i()) && AbstractC3175e.n(i10, i11, cVar.h(), cVar.f())) {
                return true;
            }
        }
        return false;
    }

    public final C3174d q(C3174d c3174d) {
        a aVar = new a(this);
        aVar.g(c3174d);
        return aVar.p();
    }

    @Override // java.lang.CharSequence
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C3174d subSequence(int i10, int i11) {
        if (i10 <= i11) {
            if (i10 == 0 && i11 == this.f11125a.length()) {
                return this;
            }
            String strSubstring = this.f11125a.substring(i10, i11);
            AbstractC6492s.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new C3174d(strSubstring, AbstractC3175e.j(this.f11126b, i10, i11), AbstractC3175e.j(this.f11127c, i10, i11), AbstractC3175e.j(this.f11128d, i10, i11));
        }
        throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
    }

    public final C3174d s(long j10) {
        return subSequence(S.l(j10), S.k(j10));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f11125a;
    }

    /* renamed from: L0.d$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Object f11138a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11139b;

        /* renamed from: c, reason: collision with root package name */
        private final int f11140c;

        /* renamed from: d, reason: collision with root package name */
        private final String f11141d;

        public c(Object obj, int i10, int i11, String str) {
            this.f11138a = obj;
            this.f11139b = i10;
            this.f11140c = i11;
            this.f11141d = str;
            if (i10 > i11) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public static /* synthetic */ c e(c cVar, Object obj, int i10, int i11, String str, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = cVar.f11138a;
            }
            if ((i12 & 2) != 0) {
                i10 = cVar.f11139b;
            }
            if ((i12 & 4) != 0) {
                i11 = cVar.f11140c;
            }
            if ((i12 & 8) != 0) {
                str = cVar.f11141d;
            }
            return cVar.d(obj, i10, i11, str);
        }

        public final Object a() {
            return this.f11138a;
        }

        public final int b() {
            return this.f11139b;
        }

        public final int c() {
            return this.f11140c;
        }

        public final c d(Object obj, int i10, int i11, String str) {
            return new c(obj, i10, i11, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC6492s.d(this.f11138a, cVar.f11138a) && this.f11139b == cVar.f11139b && this.f11140c == cVar.f11140c && AbstractC6492s.d(this.f11141d, cVar.f11141d);
        }

        public final int f() {
            return this.f11140c;
        }

        public final Object g() {
            return this.f11138a;
        }

        public final int h() {
            return this.f11139b;
        }

        public int hashCode() {
            Object obj = this.f11138a;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.f11139b)) * 31) + Integer.hashCode(this.f11140c)) * 31) + this.f11141d.hashCode();
        }

        public final String i() {
            return this.f11141d;
        }

        public String toString() {
            return "Range(item=" + this.f11138a + ", start=" + this.f11139b + ", end=" + this.f11140c + ", tag=" + this.f11141d + ')';
        }

        public c(Object obj, int i10, int i11) {
            this(obj, i10, i11, "");
        }
    }

    /* renamed from: L0.d$a */
    public static final class a implements Appendable {

        /* renamed from: a, reason: collision with root package name */
        private final StringBuilder f11129a;

        /* renamed from: b, reason: collision with root package name */
        private final List f11130b;

        /* renamed from: c, reason: collision with root package name */
        private final List f11131c;

        /* renamed from: d, reason: collision with root package name */
        private final List f11132d;

        /* renamed from: e, reason: collision with root package name */
        private final List f11133e;

        public a(int i10) {
            this.f11129a = new StringBuilder(i10);
            this.f11130b = new ArrayList();
            this.f11131c = new ArrayList();
            this.f11132d = new ArrayList();
            this.f11133e = new ArrayList();
        }

        public final void a(String str, String str2, int i10, int i11) {
            this.f11132d.add(new C0440a(str2, i10, i11, str));
        }

        public final void b(C3191v c3191v, int i10, int i11) {
            this.f11131c.add(new C0440a(c3191v, i10, i11, null, 8, null));
        }

        public final void c(D d10, int i10, int i11) {
            this.f11130b.add(new C0440a(d10, i10, i11, null, 8, null));
        }

        @Override // java.lang.Appendable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a append(char c10) {
            this.f11129a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a append(CharSequence charSequence) {
            if (charSequence instanceof C3174d) {
                g((C3174d) charSequence);
            } else {
                this.f11129a.append(charSequence);
            }
            return this;
        }

        @Override // java.lang.Appendable
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a append(CharSequence charSequence, int i10, int i11) {
            if (charSequence instanceof C3174d) {
                h((C3174d) charSequence, i10, i11);
            } else {
                this.f11129a.append(charSequence, i10, i11);
            }
            return this;
        }

        public final void g(C3174d c3174d) {
            int length = this.f11129a.length();
            this.f11129a.append(c3174d.k());
            List listH = c3174d.h();
            if (listH != null) {
                int size = listH.size();
                for (int i10 = 0; i10 < size; i10++) {
                    c cVar = (c) listH.get(i10);
                    c((D) cVar.g(), cVar.h() + length, cVar.f() + length);
                }
            }
            List listF = c3174d.f();
            if (listF != null) {
                int size2 = listF.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar2 = (c) listF.get(i11);
                    b((C3191v) cVar2.g(), cVar2.h() + length, cVar2.f() + length);
                }
            }
            List listB = c3174d.b();
            if (listB != null) {
                int size3 = listB.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    c cVar3 = (c) listB.get(i12);
                    this.f11132d.add(new C0440a(cVar3.g(), cVar3.h() + length, cVar3.f() + length, cVar3.i()));
                }
            }
        }

        public final void h(C3174d c3174d, int i10, int i11) {
            int length = this.f11129a.length();
            this.f11129a.append((CharSequence) c3174d.k(), i10, i11);
            List listM = AbstractC3175e.m(c3174d, i10, i11);
            if (listM != null) {
                int size = listM.size();
                for (int i12 = 0; i12 < size; i12++) {
                    c cVar = (c) listM.get(i12);
                    c((D) cVar.g(), cVar.h() + length, cVar.f() + length);
                }
            }
            List listL = AbstractC3175e.l(c3174d, i10, i11);
            if (listL != null) {
                int size2 = listL.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    c cVar2 = (c) listL.get(i13);
                    b((C3191v) cVar2.g(), cVar2.h() + length, cVar2.f() + length);
                }
            }
            List listK = AbstractC3175e.k(c3174d, i10, i11);
            if (listK != null) {
                int size3 = listK.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    c cVar3 = (c) listK.get(i14);
                    this.f11132d.add(new C0440a(cVar3.g(), cVar3.h() + length, cVar3.f() + length, cVar3.i()));
                }
            }
        }

        public final void i(String str) {
            this.f11129a.append(str);
        }

        public final int j() {
            return this.f11129a.length();
        }

        public final void k() {
            if (this.f11133e.isEmpty()) {
                throw new IllegalStateException("Nothing to pop.");
            }
            ((C0440a) this.f11133e.remove(r0.size() - 1)).a(this.f11129a.length());
        }

        public final void l(int i10) {
            if (i10 < this.f11133e.size()) {
                while (this.f11133e.size() - 1 >= i10) {
                    k();
                }
            } else {
                throw new IllegalStateException((i10 + " should be less than " + this.f11133e.size()).toString());
            }
        }

        public final int m(String str, String str2) {
            C0440a c0440a = new C0440a(str2, this.f11129a.length(), 0, str, 4, null);
            this.f11133e.add(c0440a);
            this.f11132d.add(c0440a);
            return this.f11133e.size() - 1;
        }

        public final int n(D d10) {
            C0440a c0440a = new C0440a(d10, this.f11129a.length(), 0, null, 12, null);
            this.f11133e.add(c0440a);
            this.f11130b.add(c0440a);
            return this.f11133e.size() - 1;
        }

        public final int o(X x10) {
            C0440a c0440a = new C0440a(x10, this.f11129a.length(), 0, null, 12, null);
            this.f11133e.add(c0440a);
            this.f11132d.add(c0440a);
            return this.f11133e.size() - 1;
        }

        public final C3174d p() {
            String string = this.f11129a.toString();
            List list = this.f11130b;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((C0440a) list.get(i10)).b(this.f11129a.length()));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            List list2 = this.f11131c;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList2.add(((C0440a) list2.get(i11)).b(this.f11129a.length()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            List list3 = this.f11132d;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                arrayList3.add(((C0440a) list3.get(i12)).b(this.f11129a.length()));
            }
            return new C3174d(string, arrayList, arrayList2, arrayList3.isEmpty() ? null : arrayList3);
        }

        /* renamed from: L0.d$a$a, reason: collision with other inner class name */
        private static final class C0440a {

            /* renamed from: a, reason: collision with root package name */
            private final Object f11134a;

            /* renamed from: b, reason: collision with root package name */
            private final int f11135b;

            /* renamed from: c, reason: collision with root package name */
            private int f11136c;

            /* renamed from: d, reason: collision with root package name */
            private final String f11137d;

            public C0440a(Object obj, int i10, int i11, String str) {
                this.f11134a = obj;
                this.f11135b = i10;
                this.f11136c = i11;
                this.f11137d = str;
            }

            public final void a(int i10) {
                this.f11136c = i10;
            }

            public final c b(int i10) {
                int i11 = this.f11136c;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                if (i10 != Integer.MIN_VALUE) {
                    return new c(this.f11134a, this.f11135b, i10, this.f11137d);
                }
                throw new IllegalStateException("Item.end should be set first");
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0440a)) {
                    return false;
                }
                C0440a c0440a = (C0440a) obj;
                return AbstractC6492s.d(this.f11134a, c0440a.f11134a) && this.f11135b == c0440a.f11135b && this.f11136c == c0440a.f11136c && AbstractC6492s.d(this.f11137d, c0440a.f11137d);
            }

            public int hashCode() {
                Object obj = this.f11134a;
                return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.f11135b)) * 31) + Integer.hashCode(this.f11136c)) * 31) + this.f11137d.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.f11134a + ", start=" + this.f11135b + ", end=" + this.f11136c + ", tag=" + this.f11137d + ')';
            }

            public /* synthetic */ C0440a(Object obj, int i10, int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i10, (i12 & 4) != 0 ? PduHandle.NONE : i11, (i12 & 8) != 0 ? "" : str);
            }
        }

        public /* synthetic */ a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 16 : i10);
        }

        public a(C3174d c3174d) {
            this(0, 1, null);
            g(c3174d);
        }
    }

    public /* synthetic */ C3174d(String str, List list, List list2, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : list2, (i10 & 8) != 0 ? null : list3);
    }

    public /* synthetic */ C3174d(String str, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? AbstractC3689v.l() : list, (i10 & 4) != 0 ? AbstractC3689v.l() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3174d(String str, List list, List list2) {
        List list3 = list;
        List list4 = list2;
        this(str, list3.isEmpty() ? null : list3, list4.isEmpty() ? null : list4, null);
    }
}
