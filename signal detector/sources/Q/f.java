package q;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public C2785c f22901a;

    /* renamed from: b, reason: collision with root package name */
    public C2785c f22902b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f22903c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f22904d = 0;

    public C2785c a(Object obj) {
        C2785c c2785c = this.f22901a;
        while (c2785c != null && !c2785c.f22894a.equals(obj)) {
            c2785c = c2785c.f22896c;
        }
        return c2785c;
    }

    public Object b(Object obj) {
        C2785c c2785cA = a(obj);
        if (c2785cA == null) {
            return null;
        }
        this.f22904d--;
        WeakHashMap weakHashMap = this.f22903c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(c2785cA);
            }
        }
        C2785c c2785c = c2785cA.f22897d;
        if (c2785c != null) {
            c2785c.f22896c = c2785cA.f22896c;
        } else {
            this.f22901a = c2785cA.f22896c;
        }
        C2785c c2785c2 = c2785cA.f22896c;
        if (c2785c2 != null) {
            c2785c2.f22897d = c2785c;
        } else {
            this.f22902b = c2785c;
        }
        c2785cA.f22896c = null;
        c2785cA.f22897d = null;
        return c2785cA.f22895b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((q.C2784b) r7).hasNext() != false) goto L28;
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
            boolean r1 = r7 instanceof q.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            q.f r7 = (q.f) r7
            int r1 = r6.f22904d
            int r3 = r7.f22904d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            q.b r3 = (q.C2784b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            q.b r4 = (q.C2784b) r4
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
            q.b r7 = (q.C2784b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C2784b c2784b = (C2784b) it;
            if (!c2784b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c2784b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2784b c2784b = new C2784b(this.f22901a, this.f22902b, 0);
        this.f22903c.put(c2784b, Boolean.FALSE);
        return c2784b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C2784b c2784b = (C2784b) it;
            if (!c2784b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c2784b.next()).toString());
            if (c2784b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
