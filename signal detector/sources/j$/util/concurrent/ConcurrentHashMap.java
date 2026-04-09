package j$.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/* loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, u {

    /* renamed from: g, reason: collision with root package name */
    public static final int f20707g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h, reason: collision with root package name */
    public static final j$.sun.misc.a f20708h;
    public static final long i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f20709j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f20710k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f20711l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f20712m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f20713n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f20714o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a, reason: collision with root package name */
    public volatile transient l[] f20715a;

    /* renamed from: b, reason: collision with root package name */
    public volatile transient l[] f20716b;
    private volatile transient long baseCount;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient c[] f20717c;
    private volatile transient int cellsBusy;

    /* renamed from: d, reason: collision with root package name */
    public transient i f20718d;

    /* renamed from: e, reason: collision with root package name */
    public transient s f20719e;

    /* renamed from: f, reason: collision with root package name */
    public transient e f20720f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    public static final int i(int i3) {
        return (i3 ^ (i3 >>> 16)) & Integer.MAX_VALUE;
    }

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", n[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a aVar = j$.sun.misc.a.f20637b;
        f20708h = aVar;
        i = aVar.h(ConcurrentHashMap.class, "sizeCtl");
        f20709j = aVar.h(ConcurrentHashMap.class, "transferIndex");
        f20710k = aVar.h(ConcurrentHashMap.class, "baseCount");
        f20711l = aVar.h(ConcurrentHashMap.class, "cellsBusy");
        f20712m = aVar.h(c.class, "value");
        f20713n = aVar.a(l[].class);
        int iB = aVar.b(l[].class);
        if (((iB - 1) & iB) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        f20714o = 31 - Integer.numberOfLeadingZeros(iB);
    }

    public static final int l(int i3) {
        int iNumberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i3 - 1);
        if (iNumberOfLeadingZeros < 0) {
            return 1;
        }
        if (iNumberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return iNumberOfLeadingZeros + 1;
    }

    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls != String.class) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces == null) {
                return null;
            }
            for (Type type : genericInterfaces) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    if (parameterizedType.getRawType() != Comparable.class || (actualTypeArguments = parameterizedType.getActualTypeArguments()) == null || actualTypeArguments.length != 1 || actualTypeArguments[0] != cls) {
                    }
                }
            }
            return null;
        }
        return cls;
    }

    public static final l k(l[] lVarArr, int i3) {
        return (l) f20708h.f(lVarArr, (i3 << f20714o) + f20713n);
    }

    public static final boolean b(l[] lVarArr, int i3, l lVar) {
        return j$.com.android.tools.r8.a.f(f20708h.f20638a, lVarArr, (i3 << f20714o) + f20713n, lVar);
    }

    public static final void h(l[] lVarArr, int i3, l lVar) {
        f20708h.j(lVarArr, (i3 << f20714o) + f20713n, lVar);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i3) {
        this(i3, 0.75f, 1);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    public ConcurrentHashMap(int i3, float f2, int i6) {
        if (f2 <= 0.0f || i3 < 0 || i6 <= 0) {
            throw new IllegalArgumentException();
        }
        long j6 = (long) (((i3 < i6 ? i6 : i3) / f2) + 1.0d);
        this.sizeCtl = j6 >= 1073741824 ? 1073741824 : l((int) j6);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j6 = j();
        if (j6 < 0) {
            return 0;
        }
        if (j6 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return j() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int length;
        l lVarK;
        Object obj2;
        int i3 = i(obj.hashCode());
        l[] lVarArr = this.f20715a;
        if (lVarArr == null || (length = lVarArr.length) <= 0 || (lVarK = k(lVarArr, (length - 1) & i3)) == null) {
            return null;
        }
        int i6 = lVarK.f20737a;
        if (i6 == i3) {
            Object obj3 = lVarK.f20738b;
            if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                return (V) lVarK.f20739c;
            }
        } else if (i6 < 0) {
            l lVarA = lVarK.a(obj, i3);
            if (lVarA != null) {
                return (V) lVarA.f20739c;
            }
            return null;
        }
        while (true) {
            lVarK = lVarK.f20740d;
            if (lVarK == null) {
                return null;
            }
            if (lVarK.f20737a == i3 && ((obj2 = lVarK.f20738b) == obj || (obj2 != null && obj.equals(obj2)))) {
                break;
            }
        }
        return (V) lVarK.f20739c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        l[] lVarArr = this.f20715a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                Object obj2 = lVarA.f20739c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k6, V v6) {
        return (V) f(k6, v6, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
    
        r7 = r6.f20739c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
    
        if (r11 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        r6.f20739c = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a5, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.f(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        o(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) g(obj, null, null);
    }

    public final Object g(Object obj, Object obj2, Object obj3) {
        int length;
        int i3;
        l lVarK;
        boolean z6;
        Object obj4;
        r rVarB;
        Object obj5;
        int i6 = i(obj.hashCode());
        l[] lVarArrD = this.f20715a;
        while (true) {
            if (lVarArrD == null || (length = lVarArrD.length) == 0 || (lVarK = k(lVarArrD, (i3 = (length - 1) & i6))) == null) {
                break;
            }
            int i7 = lVarK.f20737a;
            if (i7 == -1) {
                lVarArrD = d(lVarArrD, lVarK);
            } else {
                synchronized (lVarK) {
                    try {
                        if (k(lVarArrD, i3) == lVarK) {
                            z6 = true;
                            if (i7 >= 0) {
                                l lVar = null;
                                l lVar2 = lVarK;
                                while (true) {
                                    if (lVar2.f20737a != i6 || ((obj5 = lVar2.f20738b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                        l lVar3 = lVar2.f20740d;
                                        if (lVar3 == null) {
                                            break;
                                        }
                                        lVar = lVar2;
                                        lVar2 = lVar3;
                                    }
                                }
                                obj4 = lVar2.f20739c;
                                if (obj3 != null && obj3 != obj4 && (obj4 == null || !obj3.equals(obj4))) {
                                    obj4 = null;
                                } else if (obj2 != null) {
                                    lVar2.f20739c = obj2;
                                } else if (lVar != null) {
                                    lVar.f20740d = lVar2.f20740d;
                                } else {
                                    h(lVarArrD, i3, lVar2.f20740d);
                                }
                            } else if (lVarK instanceof q) {
                                q qVar = (q) lVarK;
                                r rVar = qVar.f20754e;
                                if (rVar != null && (rVarB = rVar.b(i6, obj, null)) != null) {
                                    obj4 = rVarB.f20739c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            rVarB.f20739c = obj2;
                                        } else if (qVar.f(rVarB)) {
                                            h(lVarArrD, i3, p(qVar.f20755f));
                                        }
                                    }
                                }
                                obj4 = null;
                            } else if (lVarK instanceof m) {
                                throw new IllegalStateException("Recursive update");
                            }
                        }
                        z6 = false;
                        obj4 = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z6) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            a(-1L, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        l lVarK;
        l lVar;
        l[] lVarArrD = this.f20715a;
        long j6 = 0;
        loop0: while (true) {
            int i3 = 0;
            while (lVarArrD != null && i3 < lVarArrD.length) {
                lVarK = k(lVarArrD, i3);
                if (lVarK == null) {
                    i3++;
                } else {
                    int i6 = lVarK.f20737a;
                    if (i6 == -1) {
                        break;
                    }
                    synchronized (lVarK) {
                        try {
                            if (k(lVarArrD, i3) == lVarK) {
                                if (i6 >= 0) {
                                    lVar = lVarK;
                                } else {
                                    lVar = lVarK instanceof q ? ((q) lVarK).f20755f : null;
                                }
                                while (lVar != null) {
                                    j6--;
                                    lVar = lVar.f20740d;
                                }
                                h(lVarArrD, i3, null);
                                i3++;
                            }
                        } finally {
                        }
                    }
                }
            }
            lVarArrD = d(lVarArrD, lVarK);
        }
        if (j6 != 0) {
            a(j6, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        i iVar = this.f20718d;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this);
        this.f20718d = iVar2;
        return iVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        s sVar = this.f20719e;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this);
        this.f20719e = sVar2;
        return sVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        e eVar = this.f20720f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f20720f = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        l[] lVarArr = this.f20715a;
        int iHashCode = 0;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                iHashCode += lVarA.f20739c.hashCode() ^ lVarA.f20738b.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        l[] lVarArr = this.f20715a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        l lVarA = pVar.a();
        if (lVarA != null) {
            while (true) {
                Object obj = lVarA.f20738b;
                Object obj2 = lVarA.f20739c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v6;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        l[] lVarArr = this.f20715a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA != null) {
                Object obj2 = lVarA.f20739c;
                Object obj3 = map.get(lVarA.f20738b);
                if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                    break;
                }
            } else {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v6 = get(key)) == null || (value != v6 && !value.equals(v6))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i3 = 0;
        int i6 = 1;
        while (i6 < 16) {
            i3++;
            i6 <<= 1;
        }
        int i7 = 32 - i3;
        int i8 = i6 - 1;
        n[] nVarArr = new n[16];
        for (int i9 = 0; i9 < 16; i9++) {
            nVarArr[i9] = new n();
        }
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("segments", nVarArr);
        putFieldPutFields.put("segmentShift", i7);
        putFieldPutFields.put("segmentMask", i8);
        objectOutputStream.writeFields();
        l[] lVarArr = this.f20715a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                objectOutputStream.writeObject(lVarA.f20738b);
                objectOutputStream.writeObject(lVarA.f20739c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        long j6;
        long j7;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j8 = 0;
        long j9 = 0;
        l lVar = null;
        while (true) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            j6 = 1;
            if (object == null || object2 == null) {
                break;
            }
            j9++;
            lVar = new l(i(object.hashCode()), object, object2, lVar);
        }
        if (j9 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j10 = (long) ((j9 / 0.75f) + 1.0d);
        int iL = j10 >= 1073741824 ? 1073741824 : l((int) j10);
        l[] lVarArr = new l[iL];
        int i3 = iL - 1;
        while (lVar != null) {
            l lVar2 = lVar.f20740d;
            int i6 = lVar.f20737a;
            int i7 = i6 & i3;
            l lVarK = k(lVarArr, i7);
            boolean z6 = true;
            if (lVarK == null) {
                j7 = j6;
            } else {
                Object obj2 = lVar.f20738b;
                if (lVarK.f20737a < 0) {
                    if (((q) lVarK).e(i6, obj2, lVar.f20739c) == null) {
                        j8 += j6;
                    }
                    j7 = j6;
                } else {
                    j7 = j6;
                    int i8 = 0;
                    for (l lVar3 = lVarK; lVar3 != null; lVar3 = lVar3.f20740d) {
                        if (lVar3.f20737a == i6 && ((obj = lVar3.f20738b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z6 = false;
                            break;
                        }
                        i8++;
                    }
                    if (z6 && i8 >= 8) {
                        j8 += j7;
                        lVar.f20740d = lVarK;
                        l lVar4 = lVar;
                        r rVar = null;
                        r rVar2 = null;
                        while (lVar4 != null) {
                            r rVar3 = new r(lVar4.f20737a, lVar4.f20738b, lVar4.f20739c, null, null);
                            rVar3.f20760h = rVar2;
                            if (rVar2 == null) {
                                rVar = rVar3;
                            } else {
                                rVar2.f20740d = rVar3;
                            }
                            lVar4 = lVar4.f20740d;
                            rVar2 = rVar3;
                        }
                        h(lVarArr, i7, new q(rVar));
                    }
                }
                z6 = false;
            }
            if (z6) {
                j8 += j7;
                lVar.f20740d = lVarK;
                h(lVarArr, i7, lVar);
            }
            lVar = lVar2;
            j6 = j7;
        }
        this.f20715a = lVarArr;
        this.sizeCtl = iL - (iL >>> 2);
        this.baseCount = j8;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k6, V v6) {
        return (V) f(k6, v6, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v6 = get(obj);
        return v6 == null ? obj2 : v6;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        l[] lVarArr = this.f20715a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            } else {
                biConsumer.accept(lVarA.f20738b, lVarA.f20739c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        l[] lVarArr = this.f20715a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            }
            Object obj = lVarA.f20739c;
            Object obj2 = lVarA.f20738b;
            do {
                Object objApply = biFunction.apply(obj2, obj);
                objApply.getClass();
                if (g(obj2, objApply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x008c, code lost:
    
        r5 = r5.f20739c;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00aa, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto Lbd
            if (r15 == 0) goto Lbd
            int r1 = r14.hashCode()
            int r1 = i(r1)
            j$.util.concurrent.l[] r2 = r13.f20715a
            r3 = 0
            r5 = r0
            r4 = r3
        L12:
            if (r2 == 0) goto Lb7
            int r6 = r2.length
            if (r6 != 0) goto L19
            goto Lb7
        L19:
            int r6 = r6 + (-1)
            r6 = r6 & r1
            j$.util.concurrent.l r7 = k(r2, r6)
            if (r7 != 0) goto L24
            goto Lae
        L24:
            int r8 = r7.f20737a
            r9 = -1
            if (r8 != r9) goto L2e
            j$.util.concurrent.l[] r2 = r13.d(r2, r7)
            goto L12
        L2e:
            monitor-enter(r7)
            j$.util.concurrent.l r10 = k(r2, r6)     // Catch: java.lang.Throwable -> L4b
            if (r10 != r7) goto Lab
            if (r8 < 0) goto L70
            r4 = 1
            r10 = r0
            r8 = r7
        L3a:
            int r11 = r8.f20737a     // Catch: java.lang.Throwable -> L4b
            if (r11 != r1) goto L65
            java.lang.Object r11 = r8.f20738b     // Catch: java.lang.Throwable -> L4b
            if (r11 == r14) goto L4e
            if (r11 == 0) goto L65
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L65
            goto L4e
        L4b:
            r14 = move-exception
            goto Lb5
        L4e:
            java.lang.Object r5 = r8.f20739c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L59
            r8.f20739c = r5     // Catch: java.lang.Throwable -> L4b
            goto Lab
        L59:
            j$.util.concurrent.l r3 = r8.f20740d     // Catch: java.lang.Throwable -> L4b
            if (r10 == 0) goto L60
            r10.f20740d = r3     // Catch: java.lang.Throwable -> L4b
            goto L63
        L60:
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L63:
            r3 = r9
            goto Lab
        L65:
            j$.util.concurrent.l r10 = r8.f20740d     // Catch: java.lang.Throwable -> L4b
            if (r10 != 0) goto L6a
            goto Lab
        L6a:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L3a
        L70:
            boolean r8 = r7 instanceof j$.util.concurrent.q     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9e
            r4 = r7
            j$.util.concurrent.q r4 = (j$.util.concurrent.q) r4     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.r r8 = r4.f20754e     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            j$.util.concurrent.r r8 = r8.b(r1, r14, r0)     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            java.lang.Object r5 = r8.f20739c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L8c
            r8.f20739c = r5     // Catch: java.lang.Throwable -> L4b
            goto L9c
        L8c:
            boolean r3 = r4.f(r8)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9b
            j$.util.concurrent.r r3 = r4.f20755f     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.l r3 = p(r3)     // Catch: java.lang.Throwable -> L4b
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L9b:
            r3 = r9
        L9c:
            r4 = 2
            goto Lab
        L9e:
            boolean r6 = r7 instanceof j$.util.concurrent.m     // Catch: java.lang.Throwable -> L4b
            if (r6 != 0) goto La3
            goto Lab
        La3:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r15 = "Recursive update"
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L4b
            throw r14     // Catch: java.lang.Throwable -> L4b
        Lab:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L12
        Lae:
            if (r3 == 0) goto Lb4
            long r14 = (long) r3
            r13.a(r14, r4)
        Lb4:
            return r5
        Lb5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            throw r14
        Lb7:
            j$.util.concurrent.l[] r2 = r13.e()
            goto L12
        Lbd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        l lVar;
        Object objApply;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int i3 = i(obj.hashCode());
        l[] lVarArrE = this.f20715a;
        int i6 = 0;
        Object objApply2 = null;
        int i7 = 0;
        while (true) {
            if (lVarArrE != null) {
                int length = lVarArrE.length;
                if (length != 0) {
                    int i8 = (length - 1) & i3;
                    l lVarK = k(lVarArrE, i8);
                    if (lVarK == null) {
                        m mVar = new m();
                        synchronized (mVar) {
                            try {
                                if (b(lVarArrE, i8, mVar)) {
                                    try {
                                        objApply2 = biFunction.apply(obj, null);
                                        if (objApply2 != null) {
                                            lVar = new l(i3, obj, objApply2);
                                            i7 = 1;
                                        } else {
                                            lVar = null;
                                        }
                                        h(lVarArrE, i8, lVar);
                                        i6 = 1;
                                    } catch (Throwable th) {
                                        h(lVarArrE, i8, null);
                                        throw th;
                                    }
                                }
                            } finally {
                            }
                        }
                        if (i6 != 0) {
                        }
                    } else {
                        int i9 = lVarK.f20737a;
                        if (i9 == -1) {
                            lVarArrE = d(lVarArrE, lVarK);
                        } else {
                            synchronized (lVarK) {
                                try {
                                    if (k(lVarArrE, i8) == lVarK) {
                                        if (i9 >= 0) {
                                            l lVar2 = null;
                                            l lVar3 = lVarK;
                                            i6 = 1;
                                            while (true) {
                                                if (lVar3.f20737a == i3 && ((obj2 = lVar3.f20738b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                    break;
                                                }
                                                l lVar4 = lVar3.f20740d;
                                                if (lVar4 == null) {
                                                    objApply = biFunction.apply(obj, null);
                                                    if (objApply != null) {
                                                        if (lVar3.f20740d != null) {
                                                            throw new IllegalStateException("Recursive update");
                                                        }
                                                        lVar3.f20740d = new l(i3, obj, objApply);
                                                        i7 = 1;
                                                    }
                                                } else {
                                                    i6++;
                                                    lVar2 = lVar3;
                                                    lVar3 = lVar4;
                                                }
                                            }
                                            Object objApply3 = biFunction.apply(obj, lVar3.f20739c);
                                            if (objApply3 != null) {
                                                lVar3.f20739c = objApply3;
                                                objApply2 = objApply3;
                                            } else {
                                                l lVar5 = lVar3.f20740d;
                                                if (lVar2 != null) {
                                                    lVar2.f20740d = lVar5;
                                                } else {
                                                    h(lVarArrE, i8, lVar5);
                                                }
                                                objApply2 = objApply3;
                                                i7 = -1;
                                            }
                                        } else if (lVarK instanceof q) {
                                            q qVar = (q) lVarK;
                                            r rVar = qVar.f20754e;
                                            r rVarB = rVar != null ? rVar.b(i3, obj, null) : null;
                                            objApply = biFunction.apply(obj, rVarB == null ? null : rVarB.f20739c);
                                            if (objApply != null) {
                                                if (rVarB != null) {
                                                    rVarB.f20739c = objApply;
                                                } else {
                                                    qVar.e(i3, obj, objApply);
                                                    i7 = 1;
                                                }
                                            } else if (rVarB != null) {
                                                if (qVar.f(rVarB)) {
                                                    h(lVarArrE, i8, p(qVar.f20755f));
                                                }
                                                i7 = -1;
                                            }
                                            i6 = 1;
                                            objApply2 = objApply;
                                        } else if (lVarK instanceof m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i6 != 0) {
                                if (i6 >= 8) {
                                    n(lVarArrE, i8);
                                }
                            }
                        }
                    }
                }
            }
            lVarArrE = e();
        }
        if (i7 != 0) {
            a(i7, i6);
        }
        return objApply2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00dd, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object merge(java.lang.Object r18, java.lang.Object r19, java.util.function.BiFunction r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.merge(java.lang.Object, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    public final l[] e() {
        while (true) {
            l[] lVarArr = this.f20715a;
            if (lVarArr != null && lVarArr.length != 0) {
                return lVarArr;
            }
            int i3 = this.sizeCtl;
            if (i3 < 0) {
                Thread.yield();
            } else if (f20708h.c(this, i, i3, -1)) {
                try {
                    l[] lVarArr2 = this.f20715a;
                    if (lVarArr2 == null || lVarArr2.length == 0) {
                        int i6 = i3 > 0 ? i3 : 16;
                        l[] lVarArr3 = new l[i6];
                        this.f20715a = lVarArr3;
                        i3 = i6 - (i6 >>> 2);
                        lVarArr2 = lVarArr3;
                    }
                    this.sizeCtl = i3;
                    return lVarArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i3;
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0140, code lost:
    
        if (r1.f20717c != r6) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0142, code lost:
    
        r1.f20717c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r6, r7 << 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r25, int r27) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    public final l[] d(l[] lVarArr, l lVar) {
        int i3;
        if (lVar instanceof g) {
            l[] lVarArr2 = ((g) lVar).f20731e;
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(lVarArr.length) | 32768;
            while (lVarArr2 == this.f20716b && this.f20715a == lVarArr && (i3 = this.sizeCtl) < 0 && (i3 >>> 16) == iNumberOfLeadingZeros && i3 != iNumberOfLeadingZeros + 1 && i3 != 65535 + iNumberOfLeadingZeros && this.transferIndex > 0) {
                if (f20708h.c(this, i, i3, i3 + 1)) {
                    m(lVarArr, lVarArr2);
                    break;
                }
            }
            return lVarArr2;
        }
        return this.f20715a;
    }

    public final void o(int i3) {
        int length;
        int iL = i3 >= 536870912 ? 1073741824 : l(i3 + (i3 >>> 1) + 1);
        while (true) {
            int i6 = this.sizeCtl;
            if (i6 < 0) {
                break;
            }
            l[] lVarArr = this.f20715a;
            if (lVarArr == null || (length = lVarArr.length) == 0) {
                int i7 = i6 > iL ? i6 : iL;
                if (f20708h.c(this, i, i6, -1)) {
                    try {
                        if (this.f20715a == lVarArr) {
                            this.f20715a = new l[i7];
                            i6 = i7 - (i7 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i6;
                    }
                } else {
                    continue;
                }
            } else if (iL <= i6 || length >= 1073741824) {
                break;
            } else if (lVarArr == this.f20715a) {
                if (f20708h.c(this, i, i6, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                    m(lVarArr, null);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r10v9, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r5v5, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r8v10, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r8v15, types: [j$.util.concurrent.l] */
    public final void m(l[] lVarArr, l[] lVarArr2) {
        l[] lVarArr3;
        int i3;
        int i6;
        int i7;
        int i8;
        boolean z6;
        char c6;
        int i9;
        int i10;
        l qVar;
        l qVar2;
        r lVar;
        int i11;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        int length = lVarArr.length;
        int i12 = f20707g;
        boolean z7 = true;
        int i13 = i12 > 1 ? (length >>> 3) / i12 : length;
        char c7 = 16;
        int i14 = i13 < 16 ? 16 : i13;
        if (lVarArr2 == null) {
            try {
                l[] lVarArr4 = new l[length << 1];
                concurrentHashMap.f20716b = lVarArr4;
                concurrentHashMap.transferIndex = length;
                lVarArr3 = lVarArr4;
            } catch (Throwable unused) {
                concurrentHashMap.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        g gVar = new g(lVarArr3);
        boolean zB = true;
        int i15 = 0;
        int i16 = 0;
        boolean z8 = false;
        while (true) {
            if (zB) {
                int i17 = i15 - 1;
                if (i17 >= i16 || z8) {
                    i16 = i16;
                    i15 = i17;
                    zB = false;
                } else {
                    int i18 = concurrentHashMap.transferIndex;
                    if (i18 <= 0) {
                        i15 = -1;
                    } else {
                        j$.sun.misc.a aVar = f20708h;
                        int i19 = i16;
                        long j6 = f20709j;
                        if (i18 > i14) {
                            i6 = i19;
                            i7 = i18 - i14;
                            i3 = i17;
                        } else {
                            i3 = i17;
                            i6 = i19;
                            i7 = 0;
                        }
                        boolean zC = aVar.c(concurrentHashMap, j6, i18, i7);
                        i16 = i7;
                        if (zC) {
                            i15 = i18 - 1;
                        } else {
                            i16 = i6;
                            i15 = i3;
                        }
                    }
                    zB = false;
                }
            } else {
                int i20 = i16;
                r lVar2 = null;
                if (i15 < 0 || i15 >= length || (i10 = i15 + length) >= length2) {
                    i8 = length;
                    z6 = z7;
                    c6 = c7;
                    i9 = i14;
                    if (z8) {
                        concurrentHashMap.f20716b = null;
                        concurrentHashMap.f20715a = lVarArr3;
                        concurrentHashMap.sizeCtl = (i8 << 1) - (i8 >>> 1);
                        return;
                    }
                    int i21 = i15;
                    j$.sun.misc.a aVar2 = f20708h;
                    long j7 = i;
                    int i22 = concurrentHashMap.sizeCtl;
                    if (!aVar2.c(concurrentHashMap, j7, i22, i22 - 1)) {
                        i15 = i21;
                    } else {
                        if (i22 - 2 != ((Integer.numberOfLeadingZeros(i8) | 32768) << 16)) {
                            return;
                        }
                        zB = z6;
                        z8 = zB;
                        i15 = i8;
                    }
                } else {
                    ?? K5 = k(lVarArr, i15);
                    if (K5 == 0) {
                        zB = b(lVarArr, i15, gVar);
                        i8 = length;
                        z6 = z7;
                        c6 = c7;
                        i9 = i14;
                    } else {
                        z6 = z7;
                        int i23 = K5.f20737a;
                        if (i23 == -1) {
                            i8 = length;
                            c6 = c7;
                            i9 = i14;
                            zB = z6;
                        } else {
                            synchronized (K5) {
                                try {
                                    if (k(lVarArr, i15) == K5) {
                                        if (i23 >= 0) {
                                            int i24 = i23 & length;
                                            r rVar = K5;
                                            for (r rVar2 = K5.f20740d; rVar2 != null; rVar2 = rVar2.f20740d) {
                                                char c8 = c7;
                                                int i25 = rVar2.f20737a & length;
                                                if (i25 != i24) {
                                                    rVar = rVar2;
                                                    i24 = i25;
                                                }
                                                c7 = c8;
                                            }
                                            c6 = c7;
                                            if (i24 == 0) {
                                                lVar = null;
                                                lVar2 = rVar;
                                            } else {
                                                lVar = rVar;
                                            }
                                            l lVar3 = K5;
                                            while (lVar3 != rVar) {
                                                int i26 = lVar3.f20737a;
                                                Object obj = lVar3.f20738b;
                                                int i27 = length;
                                                Object obj2 = lVar3.f20739c;
                                                if ((i26 & i27) == 0) {
                                                    i11 = i14;
                                                    lVar2 = new l(i26, obj, obj2, lVar2);
                                                } else {
                                                    i11 = i14;
                                                    lVar = new l(i26, obj, obj2, lVar);
                                                }
                                                lVar3 = lVar3.f20740d;
                                                length = i27;
                                                i14 = i11;
                                            }
                                            i8 = length;
                                            i9 = i14;
                                            h(lVarArr3, i15, lVar2);
                                            h(lVarArr3, i10, lVar);
                                            h(lVarArr, i15, gVar);
                                        } else {
                                            i8 = length;
                                            c6 = c7;
                                            i9 = i14;
                                            if (K5 instanceof q) {
                                                q qVar3 = (q) K5;
                                                r rVar3 = null;
                                                r rVar4 = null;
                                                l lVar4 = qVar3.f20755f;
                                                int i28 = 0;
                                                int i29 = 0;
                                                r rVar5 = null;
                                                while (lVar4 != null) {
                                                    q qVar4 = qVar3;
                                                    int i30 = lVar4.f20737a;
                                                    r rVar6 = new r(i30, lVar4.f20738b, lVar4.f20739c, null, null);
                                                    if ((i30 & i8) == 0) {
                                                        rVar6.f20760h = rVar4;
                                                        if (rVar4 == null) {
                                                            lVar2 = rVar6;
                                                        } else {
                                                            rVar4.f20740d = rVar6;
                                                        }
                                                        i28++;
                                                        rVar4 = rVar6;
                                                    } else {
                                                        rVar6.f20760h = rVar3;
                                                        if (rVar3 == null) {
                                                            rVar5 = rVar6;
                                                        } else {
                                                            rVar3.f20740d = rVar6;
                                                        }
                                                        i29++;
                                                        rVar3 = rVar6;
                                                    }
                                                    lVar4 = lVar4.f20740d;
                                                    qVar3 = qVar4;
                                                }
                                                q qVar5 = qVar3;
                                                if (i28 <= 6) {
                                                    qVar = p(lVar2);
                                                } else {
                                                    qVar = i29 != 0 ? new q(lVar2) : qVar5;
                                                }
                                                if (i29 <= 6) {
                                                    qVar2 = p(rVar5);
                                                } else {
                                                    qVar2 = i28 != 0 ? new q(rVar5) : qVar5;
                                                }
                                                h(lVarArr3, i15, qVar);
                                                h(lVarArr3, i10, qVar2);
                                                h(lVarArr, i15, gVar);
                                            }
                                        }
                                        zB = z6;
                                    } else {
                                        i8 = length;
                                        c6 = c7;
                                        i9 = i14;
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                }
                concurrentHashMap = this;
                i16 = i20;
                z7 = z6;
                c7 = c6;
                length = i8;
                i14 = i9;
            }
        }
    }

    public final long j() {
        c[] cVarArr = this.f20717c;
        long j6 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j6 += cVar.value;
                }
            }
        }
        return j6;
    }

    public final void n(l[] lVarArr, int i3) {
        int length = lVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        l lVarK = k(lVarArr, i3);
        if (lVarK == null || lVarK.f20737a < 0) {
            return;
        }
        synchronized (lVarK) {
            try {
                if (k(lVarArr, i3) == lVarK) {
                    r rVar = null;
                    r rVar2 = null;
                    l lVar = lVarK;
                    while (lVar != null) {
                        r rVar3 = new r(lVar.f20737a, lVar.f20738b, lVar.f20739c, null, null);
                        rVar3.f20760h = rVar2;
                        if (rVar2 == null) {
                            rVar = rVar3;
                        } else {
                            rVar2.f20740d = rVar3;
                        }
                        lVar = lVar.f20740d;
                        rVar2 = rVar3;
                    }
                    h(lVarArr, i3, new q(rVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.util.concurrent.l] */
    public static l p(r rVar) {
        l lVar = null;
        l lVar2 = null;
        for (r rVar2 = rVar; rVar2 != null; rVar2 = rVar2.f20740d) {
            l lVar3 = new l(rVar2.f20737a, rVar2.f20738b, rVar2.f20739c);
            if (lVar2 == null) {
                lVar = lVar3;
            } else {
                lVar2.f20740d = lVar3;
            }
            lVar2 = lVar3;
        }
        return lVar;
    }
}
