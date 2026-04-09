package F7;

import F7.o;
import H6.I;
import H6.y;
import android.database.SQLException;
import c9.C2092m;
import c9.C2097r;
import c9.C2099t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: RawJsonRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class q implements o {

    /* renamed from: a, reason: collision with root package name */
    public final g f1704a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1705b = new LinkedHashMap();

    public q(g gVar) {
        this.f1704a = gVar;
    }

    public static ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            H7.i storageException = (H7.i) it.next();
            kotlin.jvm.internal.l.f(storageException, "storageException");
            arrayList2.add(new p(storageException.getMessage(), storageException));
        }
        return arrayList2;
    }

    @Override // F7.o
    public final r a(C9.r rVar) throws Throwable {
        g gVar = this.f1704a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        H7.j[] jVarArr = {new H7.n(new i(gVar, rVar, linkedHashSet))};
        H7.k kVar = gVar.f1681b;
        kVar.getClass();
        kVar.a(a.ABORT_TRANSACTION, (H7.j[]) Arrays.copyOf(jVarArr, 1));
        ArrayList arrayListD = d((ArrayList) kVar.a(a.SKIP_ELEMENT, new H7.l(linkedHashSet)).f2291b);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            this.f1705b.remove((String) it.next());
        }
        return new r(linkedHashSet, arrayListD);
    }

    @Override // F7.o
    public final s b(List<String> list) {
        LinkedHashMap linkedHashMap;
        if (list.isEmpty()) {
            return s.f1708c;
        }
        List<String> list2 = list;
        Set setK0 = C2097r.K0(list2);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<T> it = list2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.f1705b;
            if (!zHasNext) {
                break;
            }
            String str = (String) it.next();
            J7.a aVar = (J7.a) linkedHashMap.get(str);
            if (aVar != null) {
                arrayList.add(aVar);
                setK0.remove(str);
            }
        }
        boolean zIsEmpty = setK0.isEmpty();
        List<J7.a> listB = C2099t.f18581b;
        if (zIsEmpty) {
            return new s(arrayList, listB);
        }
        ArrayList arrayList2 = new ArrayList();
        g gVar = this.f1704a;
        String str2 = "Read raw jsons with ids: " + setK0;
        ArrayList arrayList3 = new ArrayList();
        try {
            listB = gVar.b(setK0);
        } catch (SQLException e4) {
            arrayList3.add(g.d(gVar, e4, str2));
        } catch (IllegalStateException e10) {
            arrayList3.add(g.d(gVar, e10, str2));
        }
        arrayList2.addAll(d(arrayList3));
        s sVar = new s(listB, arrayList2);
        for (J7.a aVar2 : listB) {
            linkedHashMap.put(aVar2.getId(), aVar2);
        }
        return new s(C2097r.y0(arrayList, sVar.f1709a), sVar.f1710b);
    }

    @Override // F7.o
    public final s c(o.a aVar) {
        List<J7.a> rawJsons = aVar.f1702a;
        for (J7.a aVar2 : rawJsons) {
            this.f1705b.put(aVar2.getId(), aVar2);
        }
        g gVar = this.f1704a;
        kotlin.jvm.internal.l.f(rawJsons, "rawJsons");
        a actionOnError = aVar.f1703b;
        kotlin.jvm.internal.l.f(actionOnError, "actionOnError");
        I i = gVar.f1682c;
        i.getClass();
        y yVar = new y(1, i, rawJsons);
        ArrayList arrayList = new ArrayList();
        yVar.invoke(arrayList);
        H7.j[] jVarArr = (H7.j[]) arrayList.toArray(new H7.j[0]);
        ArrayList arrayList2 = (ArrayList) ((H7.k) i.f2053c).a(actionOnError, (H7.j[]) Arrays.copyOf(jVarArr, jVarArr.length)).f2291b;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(d(arrayList2));
        return new s(rawJsons, arrayList3);
    }
}
