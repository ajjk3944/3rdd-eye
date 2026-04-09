package Lg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class a extends ConcurrentHashMap {

    /* renamed from: a, reason: collision with root package name */
    private static Ej.b f11654a = Ej.c.i(a.class);

    public a(a aVar) {
        this(aVar != null ? aVar.size() : 1024);
        if (aVar != null) {
            putAll(aVar);
        }
    }

    private Collection d(String str) {
        return (Collection) get(str != null ? str.toLowerCase() : null);
    }

    @Override // java.util.AbstractMap
    protected Object clone() {
        return new a(this);
    }

    public boolean g(b bVar) {
        if (bVar == null) {
            return false;
        }
        List list = (List) get(bVar.c());
        if (list == null) {
            putIfAbsent(bVar.c(), new ArrayList(3));
            list = (List) get(bVar.c());
        }
        synchronized (list) {
            list.add(bVar);
        }
        return true;
    }

    public Collection h() {
        ArrayList arrayList = new ArrayList();
        for (V v10 : values()) {
            if (v10 != null) {
                arrayList.addAll(v10);
            }
        }
        return arrayList;
    }

    public b j(b bVar) {
        Collection collectionD;
        b bVar2 = null;
        if (bVar != null && (collectionD = d(bVar.c())) != null) {
            synchronized (collectionD) {
                try {
                    Iterator it = collectionD.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        b bVar3 = (b) it.next();
                        if (bVar3.m(bVar)) {
                            bVar2 = bVar3;
                            break;
                        }
                    }
                } finally {
                }
            }
        }
        return bVar2;
    }

    public b l(String str, javax.jmdns.impl.constants.e eVar, javax.jmdns.impl.constants.d dVar) {
        Collection collectionD = d(str);
        b bVar = null;
        if (collectionD != null) {
            synchronized (collectionD) {
                try {
                    Iterator it = collectionD.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        b bVar2 = (b) it.next();
                        if (bVar2.u(eVar) && bVar2.t(dVar)) {
                            bVar = bVar2;
                            break;
                        }
                    }
                } finally {
                }
            }
        }
        return bVar;
    }

    public Collection n(String str) {
        ArrayList arrayList;
        Collection collectionD = d(str);
        if (collectionD == null) {
            return Collections.emptyList();
        }
        synchronized (collectionD) {
            arrayList = new ArrayList(collectionD);
        }
        return arrayList;
    }

    public Collection p(String str, javax.jmdns.impl.constants.e eVar, javax.jmdns.impl.constants.d dVar) {
        ArrayList arrayList;
        Collection collectionD = d(str);
        if (collectionD == null) {
            return Collections.emptyList();
        }
        synchronized (collectionD) {
            try {
                arrayList = new ArrayList(collectionD);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (!bVar.u(eVar) || !bVar.t(dVar)) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
        return arrayList;
    }

    public void r() {
        if (f11654a.m()) {
            f11654a.d("Cached DNSEntries: {}", toString());
        }
    }

    public boolean s(b bVar) {
        boolean zRemove = false;
        if (bVar != null) {
            List list = (List) get(bVar.c());
            if (list != null) {
                synchronized (list) {
                    zRemove = list.remove(bVar);
                }
            }
            if (zRemove && list.isEmpty()) {
                remove(bVar.c());
            }
        }
        return zRemove;
    }

    public boolean t(b bVar, b bVar2) {
        if (bVar == null || bVar2 == null || !bVar.c().equals(bVar2.c())) {
            return false;
        }
        List list = (List) get(bVar.c());
        if (list == null) {
            putIfAbsent(bVar.c(), new ArrayList(3));
            list = (List) get(bVar.c());
        }
        synchronized (list) {
            list.remove(bVar2);
            list.add(bVar);
        }
        return true;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap
    public synchronized String toString() {
        StringBuilder sb2;
        try {
            sb2 = new StringBuilder(2000);
            sb2.append("\n\t---- cache ----");
            Iterator it = entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb2.append("\n\n\t\tname '");
                sb2.append((String) entry.getKey());
                sb2.append('\'');
                List<b> list = (List) entry.getValue();
                if (list == null || list.isEmpty()) {
                    sb2.append(" : no entries");
                } else {
                    synchronized (list) {
                        try {
                            for (b bVar : list) {
                                sb2.append("\n\t\t\t");
                                sb2.append(bVar.toString());
                            }
                        } finally {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sb2.toString();
    }

    public a(int i10) {
        super(i10);
    }
}
