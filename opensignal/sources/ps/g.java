package ps;

import br.l;
import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import mq.a0;
import mq.b0;
import mq.o;
import mq.p;
import mq.y;
import mq.z;
import os.j;

/* loaded from: classes.dex */
public final class g implements ns.f {

    /* renamed from: r, reason: collision with root package name */
    public static final List f20637r;

    /* renamed from: a, reason: collision with root package name */
    public final String[] f20638a;

    /* renamed from: d, reason: collision with root package name */
    public final Set f20639d;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f20640g;

    static {
        String strX0 = o.x0(e5.I('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listI = e5.I(w.g.f(strX0, "/Any"), w.g.f(strX0, "/Nothing"), w.g.f(strX0, "/Unit"), w.g.f(strX0, "/Throwable"), w.g.f(strX0, "/Number"), w.g.f(strX0, "/Byte"), w.g.f(strX0, "/Double"), w.g.f(strX0, "/Float"), w.g.f(strX0, "/Int"), w.g.f(strX0, "/Long"), w.g.f(strX0, "/Short"), w.g.f(strX0, "/Boolean"), w.g.f(strX0, "/Char"), w.g.f(strX0, "/CharSequence"), w.g.f(strX0, "/String"), w.g.f(strX0, "/Comparable"), w.g.f(strX0, "/Enum"), w.g.f(strX0, "/Array"), w.g.f(strX0, "/ByteArray"), w.g.f(strX0, "/DoubleArray"), w.g.f(strX0, "/FloatArray"), w.g.f(strX0, "/IntArray"), w.g.f(strX0, "/LongArray"), w.g.f(strX0, "/ShortArray"), w.g.f(strX0, "/BooleanArray"), w.g.f(strX0, "/CharArray"), w.g.f(strX0, "/Cloneable"), w.g.f(strX0, "/Annotation"), w.g.f(strX0, "/collections/Iterable"), w.g.f(strX0, "/collections/MutableIterable"), w.g.f(strX0, "/collections/Collection"), w.g.f(strX0, "/collections/MutableCollection"), w.g.f(strX0, "/collections/List"), w.g.f(strX0, "/collections/MutableList"), w.g.f(strX0, "/collections/Set"), w.g.f(strX0, "/collections/MutableSet"), w.g.f(strX0, "/collections/Map"), w.g.f(strX0, "/collections/MutableMap"), w.g.f(strX0, "/collections/Map.Entry"), w.g.f(strX0, "/collections/MutableMap.MutableEntry"), w.g.f(strX0, "/collections/Iterator"), w.g.f(strX0, "/collections/MutableIterator"), w.g.f(strX0, "/collections/ListIterator"), w.g.f(strX0, "/collections/MutableListIterator"));
        f20637r = listI;
        iu.g gVarV0 = o.V0(listI);
        int iP = b0.P(p.a0(gVarV0, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        Iterator it = gVarV0.iterator();
        while (true) {
            a0 a0Var = (a0) it;
            if (!a0Var.f16922d.hasNext()) {
                return;
            }
            z zVar = (z) a0Var.next();
            linkedHashMap.put((String) zVar.f16949b, Integer.valueOf(zVar.f16948a));
        }
    }

    public g(j jVar, String[] strArr) {
        l.e(strArr, "strings");
        List list = jVar.f19774g;
        Set setU0 = list.isEmpty() ? y.f16947a : o.U0(list);
        List<os.i> list2 = jVar.f19773d;
        l.d(list2, "types.recordList");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (os.i iVar : list2) {
            int i10 = iVar.f19768g;
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(iVar);
            }
        }
        arrayList.trimToSize();
        this.f20638a = strArr;
        this.f20639d = setU0;
        this.f20640g = arrayList;
    }

    @Override // ns.f
    public final boolean A(int i10) {
        return this.f20639d.contains(Integer.valueOf(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // ns.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getString(int r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ps.g.getString(int):java.lang.String");
    }

    @Override // ns.f
    public final String n(int i10) {
        return getString(i10);
    }
}
