package r;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public c f32482a;

    /* renamed from: b, reason: collision with root package name */
    public c f32483b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f32484c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f32485d = 0;

    public c a(Object obj) {
        c cVar = this.f32482a;
        while (cVar != null && !cVar.f32475a.equals(obj)) {
            cVar = cVar.f32477c;
        }
        return cVar;
    }

    public Object c(Object obj) {
        c cVarA = a(obj);
        if (cVarA == null) {
            return null;
        }
        this.f32485d--;
        WeakHashMap weakHashMap = this.f32484c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarA);
            }
        }
        c cVar = cVarA.f32478d;
        if (cVar != null) {
            cVar.f32477c = cVarA.f32477c;
        } else {
            this.f32482a = cVarA.f32477c;
        }
        c cVar2 = cVarA.f32477c;
        if (cVar2 != null) {
            cVar2.f32478d = cVar;
        } else {
            this.f32483b = cVar;
        }
        cVarA.f32477c = null;
        cVarA.f32478d = null;
        return cVarA.f32476b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((r.b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof r.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r.f r7 = (r.f) r7
            int r1 = r6.f32485d
            int r3 = r7.f32485d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            r.b r3 = (r.b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            r.b r4 = (r.b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            r.b r7 = (r.b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f32482a, this.f32483b, 0);
        this.f32484c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
