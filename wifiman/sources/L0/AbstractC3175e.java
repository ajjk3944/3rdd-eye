package L0;

import L0.C3174d;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* renamed from: L0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3175e {

    /* renamed from: a, reason: collision with root package name */
    private static final C3174d f11142a = new C3174d("", null, null, 6, null);

    public static final C3174d a(String str, D d10, C3191v c3191v) {
        return new C3174d(str, AbstractC3689v.e(new C3174d.c(d10, 0, str.length())), c3191v == null ? AbstractC3689v.l() : AbstractC3689v.e(new C3174d.c(c3191v, 0, str.length())));
    }

    public static /* synthetic */ C3174d b(String str, D d10, C3191v c3191v, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            c3191v = null;
        }
        return a(str, d10, c3191v);
    }

    public static final boolean h(int i10, int i11, int i12, int i13) {
        if (i10 > i12 || i13 > i11) {
            return false;
        }
        if (i11 == i13) {
            if ((i12 == i13) != (i10 == i11)) {
                return false;
            }
        }
        return true;
    }

    public static final C3174d i() {
        return f11142a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(List list, int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less than or equal to end (" + i11 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            C3174d.c cVar = (C3174d.c) obj;
            if (n(i10, i11, cVar.h(), cVar.f())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C3174d.c cVar2 = (C3174d.c) arrayList.get(i13);
            arrayList2.add(new C3174d.c(cVar2.g(), Math.max(i10, cVar2.h()) - i10, Math.min(i11, cVar2.f()) - i10, cVar2.i()));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(C3174d c3174d, int i10, int i11) {
        List listB;
        if (i10 == i11 || (listB = c3174d.b()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= c3174d.k().length()) {
            return listB;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        int size = listB.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = listB.get(i12);
            C3174d.c cVar = (C3174d.c) obj;
            if (n(i10, i11, cVar.h(), cVar.f())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C3174d.c cVar2 = (C3174d.c) arrayList.get(i13);
            arrayList2.add(new C3174d.c(cVar2.g(), AbstractC7978m.k(cVar2.h(), i10, i11) - i10, AbstractC7978m.k(cVar2.f(), i10, i11) - i10, cVar2.i()));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List l(C3174d c3174d, int i10, int i11) {
        List listF;
        if (i10 == i11 || (listF = c3174d.f()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= c3174d.k().length()) {
            return listF;
        }
        ArrayList arrayList = new ArrayList(listF.size());
        int size = listF.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = listF.get(i12);
            C3174d.c cVar = (C3174d.c) obj;
            if (n(i10, i11, cVar.h(), cVar.f())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C3174d.c cVar2 = (C3174d.c) arrayList.get(i13);
            arrayList2.add(new C3174d.c(cVar2.g(), AbstractC7978m.k(cVar2.h(), i10, i11) - i10, AbstractC7978m.k(cVar2.f(), i10, i11) - i10));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List m(C3174d c3174d, int i10, int i11) {
        List listH;
        if (i10 == i11 || (listH = c3174d.h()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= c3174d.k().length()) {
            return listH;
        }
        ArrayList arrayList = new ArrayList(listH.size());
        int size = listH.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = listH.get(i12);
            C3174d.c cVar = (C3174d.c) obj;
            if (n(i10, i11, cVar.h(), cVar.f())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C3174d.c cVar2 = (C3174d.c) arrayList.get(i13);
            arrayList2.add(new C3174d.c(cVar2.g(), AbstractC7978m.k(cVar2.h(), i10, i11) - i10, AbstractC7978m.k(cVar2.f(), i10, i11) - i10));
        }
        return arrayList2;
    }

    public static final boolean n(int i10, int i11, int i12, int i13) {
        return Math.max(i10, i12) < Math.min(i11, i13) || h(i10, i11, i12, i13) || h(i12, i13, i10, i11);
    }

    public static final List o(C3174d c3174d, C3191v c3191v) {
        int length = c3174d.k().length();
        List listF = c3174d.f();
        if (listF == null) {
            listF = AbstractC3689v.l();
        }
        ArrayList arrayList = new ArrayList();
        int size = listF.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            C3174d.c cVar = (C3174d.c) listF.get(i10);
            C3191v c3191v2 = (C3191v) cVar.a();
            int iB = cVar.b();
            int iC = cVar.c();
            if (iB != i11) {
                arrayList.add(new C3174d.c(c3191v, i11, iB));
            }
            arrayList.add(new C3174d.c(c3191v.l(c3191v2), iB, iC));
            i10++;
            i11 = iC;
        }
        if (i11 != length) {
            arrayList.add(new C3174d.c(c3191v, i11, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C3174d.c(c3191v, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3174d p(C3174d c3174d, int i10, int i11) {
        String strSubstring;
        if (i10 != i11) {
            strSubstring = c3174d.k().substring(i10, i11);
            AbstractC6492s.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        return new C3174d(strSubstring, m(c3174d, i10, i11), null, null, 12, null);
    }
}
