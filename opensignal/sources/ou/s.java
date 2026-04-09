package ou;

import com.google.android.gms.internal.measurement.y3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class s implements Iterable, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f19966a;

    public s(String[] strArr) {
        this.f19966a = strArr;
    }

    public final String a(String str) {
        br.l.e(str, "name");
        String[] strArr = this.f19966a;
        int length = strArr.length - 2;
        int iV = y3.v(length, 0, -2);
        if (iV > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iV) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i10) {
        return this.f19966a[i10 * 2];
    }

    public final fh.f c() {
        fh.f fVar = new fh.f(2);
        ArrayList arrayList = fVar.f8871a;
        br.l.e(arrayList, "<this>");
        String[] strArr = this.f19966a;
        br.l.e(strArr, "elements");
        arrayList.addAll(mq.l.X(strArr));
        return fVar;
    }

    public final String d(int i10) {
        return this.f19966a[(i10 * 2) + 1];
    }

    public final List e(String str) {
        br.l.e(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (str.equalsIgnoreCase(b(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(d(i10));
            }
        }
        if (arrayList == null) {
            return mq.w.f16945a;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        br.l.d(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return Arrays.equals(this.f19966a, ((s) obj).f19966a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19966a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        lq.l[] lVarArr = new lq.l[size];
        for (int i10 = 0; i10 < size; i10++) {
            lVarArr[i10] = new lq.l(b(i10), d(i10));
        }
        return br.b0.e(lVarArr);
    }

    public final int size() {
        return this.f19966a.length / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strB = b(i10);
            String strD = d(i10);
            sb2.append(strB);
            sb2.append(": ");
            if (pu.b.p(strB)) {
                strD = "██";
            }
            sb2.append(strD);
            sb2.append("\n");
        }
        String string = sb2.toString();
        br.l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
