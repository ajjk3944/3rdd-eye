package j$.util.concurrent;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
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
    public static final int g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h, reason: collision with root package name */
    public static final j$.sun.misc.a f26296h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f26297i;
    public static final long j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f26298k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f26299l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f26300m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f26301n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f26302o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a, reason: collision with root package name */
    public volatile transient l[] f26303a;

    /* renamed from: b, reason: collision with root package name */
    public volatile transient l[] f26304b;
    private volatile transient long baseCount;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient c[] f26305c;
    private volatile transient int cellsBusy;

    /* renamed from: d, reason: collision with root package name */
    public transient i f26306d;

    /* renamed from: e, reason: collision with root package name */
    public transient s f26307e;

    /* renamed from: f, reason: collision with root package name */
    public transient e f26308f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    public static final int i(int i4) {
        return (i4 ^ (i4 >>> 16)) & Integer.MAX_VALUE;
    }

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", n[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a aVar = j$.sun.misc.a.f26027b;
        f26296h = aVar;
        f26297i = aVar.h(ConcurrentHashMap.class, "sizeCtl");
        j = aVar.h(ConcurrentHashMap.class, "transferIndex");
        f26298k = aVar.h(ConcurrentHashMap.class, "baseCount");
        f26299l = aVar.h(ConcurrentHashMap.class, "cellsBusy");
        f26300m = aVar.h(c.class, "value");
        f26301n = aVar.a(l[].class);
        int iB = aVar.b(l[].class);
        if (((iB - 1) & iB) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        f26302o = 31 - Integer.numberOfLeadingZeros(iB);
    }

    public static final int l(int i4) {
        int iNumberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i4 - 1);
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

    public static final l k(l[] lVarArr, int i4) {
        return (l) f26296h.f(lVarArr, (i4 << f26302o) + f26301n);
    }

    public static final boolean b(l[] lVarArr, int i4, l lVar) {
        return j$.com.android.tools.r8.a.z(f26296h.f26028a, lVarArr, (i4 << f26302o) + f26301n, lVar);
    }

    public static final void h(l[] lVarArr, int i4, l lVar) {
        f26296h.j(lVarArr, (i4 << f26302o) + f26301n, lVar);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i4) {
        this(i4, 0.75f, 1);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    public ConcurrentHashMap(int i4, float f10, int i10) {
        if (f10 <= 0.0f || i4 < 0 || i10 <= 0) {
            throw new IllegalArgumentException();
        }
        long j8 = (long) (((i4 < i10 ? i10 : i4) / f10) + 1.0d);
        this.sizeCtl = j8 >= 1073741824 ? 1073741824 : l((int) j8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j8 = j();
        if (j8 < 0) {
            return 0;
        }
        if (j8 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j8;
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
        int i4 = i(obj.hashCode());
        l[] lVarArr = this.f26303a;
        if (lVarArr == null || (length = lVarArr.length) <= 0 || (lVarK = k(lVarArr, (length - 1) & i4)) == null) {
            return null;
        }
        int i10 = lVarK.f26324a;
        if (i10 == i4) {
            Object obj3 = lVarK.f26325b;
            if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                return (V) lVarK.f26326c;
            }
        } else if (i10 < 0) {
            l lVarA = lVarK.a(i4, obj);
            if (lVarA != null) {
                return (V) lVarA.f26326c;
            }
            return null;
        }
        while (true) {
            lVarK = lVarK.f26327d;
            if (lVarK == null) {
                return null;
            }
            if (lVarK.f26324a == i4 && ((obj2 = lVarK.f26325b) == obj || (obj2 != null && obj.equals(obj2)))) {
                break;
            }
        }
        return (V) lVarK.f26326c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        l[] lVarArr = this.f26303a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                Object obj2 = lVarA.f26326c;
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
    public V put(K k2, V v10) {
        return (V) f(k2, v10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
    
        r7 = r6.f26326c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
    
        if (r11 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        r6.f26326c = r10;
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
        int i4;
        l lVarK;
        boolean z3;
        Object obj4;
        r rVarB;
        Object obj5;
        int i10 = i(obj.hashCode());
        l[] lVarArrD = this.f26303a;
        while (true) {
            if (lVarArrD == null || (length = lVarArrD.length) == 0 || (lVarK = k(lVarArrD, (i4 = (length - 1) & i10))) == null) {
                break;
            }
            int i11 = lVarK.f26324a;
            if (i11 == -1) {
                lVarArrD = d(lVarArrD, lVarK);
            } else {
                synchronized (lVarK) {
                    try {
                        if (k(lVarArrD, i4) == lVarK) {
                            z3 = true;
                            if (i11 >= 0) {
                                l lVar = null;
                                l lVar2 = lVarK;
                                while (true) {
                                    if (lVar2.f26324a != i10 || ((obj5 = lVar2.f26325b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                        l lVar3 = lVar2.f26327d;
                                        if (lVar3 == null) {
                                            break;
                                        }
                                        lVar = lVar2;
                                        lVar2 = lVar3;
                                    }
                                }
                                obj4 = lVar2.f26326c;
                                if (obj3 != null && obj3 != obj4 && (obj4 == null || !obj3.equals(obj4))) {
                                    obj4 = null;
                                } else if (obj2 != null) {
                                    lVar2.f26326c = obj2;
                                } else if (lVar != null) {
                                    lVar.f26327d = lVar2.f26327d;
                                } else {
                                    h(lVarArrD, i4, lVar2.f26327d);
                                }
                            } else if (lVarK instanceof q) {
                                q qVar = (q) lVarK;
                                r rVar = qVar.f26341e;
                                if (rVar != null && (rVarB = rVar.b(i10, obj, null)) != null) {
                                    obj4 = rVarB.f26326c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            rVarB.f26326c = obj2;
                                        } else if (qVar.f(rVarB)) {
                                            h(lVarArrD, i4, p(qVar.f26342f));
                                        }
                                    }
                                }
                                obj4 = null;
                            } else if (lVarK instanceof m) {
                                throw new IllegalStateException("Recursive update");
                            }
                        }
                        z3 = false;
                        obj4 = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z3) {
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
        l[] lVarArrD = this.f26303a;
        long j8 = 0;
        loop0: while (true) {
            int i4 = 0;
            while (lVarArrD != null && i4 < lVarArrD.length) {
                lVarK = k(lVarArrD, i4);
                if (lVarK == null) {
                    i4++;
                } else {
                    int i10 = lVarK.f26324a;
                    if (i10 == -1) {
                        break;
                    }
                    synchronized (lVarK) {
                        try {
                            if (k(lVarArrD, i4) == lVarK) {
                                if (i10 >= 0) {
                                    lVar = lVarK;
                                } else {
                                    lVar = lVarK instanceof q ? ((q) lVarK).f26342f : null;
                                }
                                while (lVar != null) {
                                    j8--;
                                    lVar = lVar.f26327d;
                                }
                                h(lVarArrD, i4, null);
                                i4++;
                            }
                        } finally {
                        }
                    }
                }
            }
            lVarArrD = d(lVarArrD, lVarK);
        }
        if (j8 != 0) {
            a(j8, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        i iVar = this.f26306d;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this);
        this.f26306d = iVar2;
        return iVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        s sVar = this.f26307e;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this);
        this.f26307e = sVar2;
        return sVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        e eVar = this.f26308f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f26308f = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        l[] lVarArr = this.f26303a;
        int iHashCode = 0;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                iHashCode += lVarA.f26326c.hashCode() ^ lVarA.f26325b.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        l[] lVarArr = this.f26303a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        StringBuilder sb2 = new StringBuilder("{");
        l lVarA = pVar.a();
        if (lVarA != null) {
            while (true) {
                Object obj = lVarA.f26325b;
                Object obj2 = lVarA.f26326c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb2.append(obj);
                sb2.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb2.append(obj2);
                lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                sb2.append(", ");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        l[] lVarArr = this.f26303a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA != null) {
                Object obj2 = lVarA.f26326c;
                Object obj3 = map.get(lVarA.f26325b);
                if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                    break;
                }
            } else {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v10 = get(key)) == null || (value != v10 && !value.equals(v10))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i4 = 0;
        int i10 = 1;
        while (i10 < 16) {
            i4++;
            i10 <<= 1;
        }
        int i11 = 32 - i4;
        int i12 = i10 - 1;
        n[] nVarArr = new n[16];
        for (int i13 = 0; i13 < 16; i13++) {
            nVarArr[i13] = new n();
        }
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("segments", nVarArr);
        putFieldPutFields.put("segmentShift", i11);
        putFieldPutFields.put("segmentMask", i12);
        objectOutputStream.writeFields();
        l[] lVarArr = this.f26303a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                objectOutputStream.writeObject(lVarA.f26325b);
                objectOutputStream.writeObject(lVarA.f26326c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        long j8;
        long j9;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j10 = 0;
        long j11 = 0;
        l lVar = null;
        while (true) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            j8 = 1;
            if (object == null || object2 == null) {
                break;
            }
            j11++;
            lVar = new l(i(object.hashCode()), object, object2, lVar);
        }
        if (j11 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j12 = (long) ((j11 / 0.75f) + 1.0d);
        int iL = j12 >= 1073741824 ? 1073741824 : l((int) j12);
        l[] lVarArr = new l[iL];
        int i4 = iL - 1;
        while (lVar != null) {
            l lVar2 = lVar.f26327d;
            int i10 = lVar.f26324a;
            int i11 = i10 & i4;
            l lVarK = k(lVarArr, i11);
            boolean z3 = true;
            if (lVarK == null) {
                j9 = j8;
            } else {
                Object obj2 = lVar.f26325b;
                if (lVarK.f26324a < 0) {
                    if (((q) lVarK).e(i10, obj2, lVar.f26326c) == null) {
                        j10 += j8;
                    }
                    j9 = j8;
                } else {
                    j9 = j8;
                    int i12 = 0;
                    for (l lVar3 = lVarK; lVar3 != null; lVar3 = lVar3.f26327d) {
                        if (lVar3.f26324a == i10 && ((obj = lVar3.f26325b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z3 = false;
                            break;
                        }
                        i12++;
                    }
                    if (z3 && i12 >= 8) {
                        j10 += j9;
                        lVar.f26327d = lVarK;
                        l lVar4 = lVar;
                        r rVar = null;
                        r rVar2 = null;
                        while (lVar4 != null) {
                            r rVar3 = new r(lVar4.f26324a, lVar4.f26325b, lVar4.f26326c, null, null);
                            rVar3.f26345h = rVar2;
                            if (rVar2 == null) {
                                rVar = rVar3;
                            } else {
                                rVar2.f26327d = rVar3;
                            }
                            lVar4 = lVar4.f26327d;
                            rVar2 = rVar3;
                        }
                        h(lVarArr, i11, new q(rVar));
                    }
                }
                z3 = false;
            }
            if (z3) {
                j10 += j9;
                lVar.f26327d = lVarK;
                h(lVarArr, i11, lVar);
            }
            lVar = lVar2;
            j8 = j9;
        }
        this.f26303a = lVarArr;
        this.sizeCtl = iL - (iL >>> 2);
        this.baseCount = j10;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k2, V v10) {
        return (V) f(k2, v10, true);
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
        V v10 = get(obj);
        return v10 == null ? obj2 : v10;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        l[] lVarArr = this.f26303a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            } else {
                biConsumer.accept(lVarA.f26325b, lVarA.f26326c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        l[] lVarArr = this.f26303a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            }
            Object obj = lVarA.f26326c;
            Object obj2 = lVarA.f26325b;
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
    
        r5 = r5.f26326c;
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
            j$.util.concurrent.l[] r2 = r13.f26303a
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
            int r8 = r7.f26324a
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
            int r11 = r8.f26324a     // Catch: java.lang.Throwable -> L4b
            if (r11 != r1) goto L65
            java.lang.Object r11 = r8.f26325b     // Catch: java.lang.Throwable -> L4b
            if (r11 == r14) goto L4e
            if (r11 == 0) goto L65
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L65
            goto L4e
        L4b:
            r14 = move-exception
            goto Lb5
        L4e:
            java.lang.Object r5 = r8.f26326c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L59
            r8.f26326c = r5     // Catch: java.lang.Throwable -> L4b
            goto Lab
        L59:
            j$.util.concurrent.l r3 = r8.f26327d     // Catch: java.lang.Throwable -> L4b
            if (r10 == 0) goto L60
            r10.f26327d = r3     // Catch: java.lang.Throwable -> L4b
            goto L63
        L60:
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L63:
            r3 = r9
            goto Lab
        L65:
            j$.util.concurrent.l r10 = r8.f26327d     // Catch: java.lang.Throwable -> L4b
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
            j$.util.concurrent.r r8 = r4.f26341e     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            j$.util.concurrent.r r8 = r8.b(r1, r14, r0)     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            java.lang.Object r5 = r8.f26326c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L8c
            r8.f26326c = r5     // Catch: java.lang.Throwable -> L4b
            goto L9c
        L8c:
            boolean r3 = r4.f(r8)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9b
            j$.util.concurrent.r r3 = r4.f26342f     // Catch: java.lang.Throwable -> L4b
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
        int i4 = i(obj.hashCode());
        l[] lVarArrE = this.f26303a;
        int i10 = 0;
        Object objApply2 = null;
        int i11 = 0;
        while (true) {
            if (lVarArrE != null) {
                int length = lVarArrE.length;
                if (length != 0) {
                    int i12 = (length - 1) & i4;
                    l lVarK = k(lVarArrE, i12);
                    if (lVarK == null) {
                        m mVar = new m();
                        synchronized (mVar) {
                            try {
                                if (b(lVarArrE, i12, mVar)) {
                                    try {
                                        objApply2 = biFunction.apply(obj, null);
                                        if (objApply2 != null) {
                                            lVar = new l(i4, obj, objApply2);
                                            i11 = 1;
                                        } else {
                                            lVar = null;
                                        }
                                        h(lVarArrE, i12, lVar);
                                        i10 = 1;
                                    } catch (Throwable th2) {
                                        h(lVarArrE, i12, null);
                                        throw th2;
                                    }
                                }
                            } finally {
                            }
                        }
                        if (i10 != 0) {
                        }
                    } else {
                        int i13 = lVarK.f26324a;
                        if (i13 == -1) {
                            lVarArrE = d(lVarArrE, lVarK);
                        } else {
                            synchronized (lVarK) {
                                try {
                                    if (k(lVarArrE, i12) == lVarK) {
                                        if (i13 >= 0) {
                                            l lVar2 = null;
                                            l lVar3 = lVarK;
                                            i10 = 1;
                                            while (true) {
                                                if (lVar3.f26324a == i4 && ((obj2 = lVar3.f26325b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                    break;
                                                }
                                                l lVar4 = lVar3.f26327d;
                                                if (lVar4 == null) {
                                                    objApply = biFunction.apply(obj, null);
                                                    if (objApply != null) {
                                                        if (lVar3.f26327d != null) {
                                                            throw new IllegalStateException("Recursive update");
                                                        }
                                                        lVar3.f26327d = new l(i4, obj, objApply);
                                                        i11 = 1;
                                                    }
                                                } else {
                                                    i10++;
                                                    lVar2 = lVar3;
                                                    lVar3 = lVar4;
                                                }
                                            }
                                            Object objApply3 = biFunction.apply(obj, lVar3.f26326c);
                                            if (objApply3 != null) {
                                                lVar3.f26326c = objApply3;
                                                objApply2 = objApply3;
                                            } else {
                                                l lVar5 = lVar3.f26327d;
                                                if (lVar2 != null) {
                                                    lVar2.f26327d = lVar5;
                                                } else {
                                                    h(lVarArrE, i12, lVar5);
                                                }
                                                objApply2 = objApply3;
                                                i11 = -1;
                                            }
                                        } else if (lVarK instanceof q) {
                                            q qVar = (q) lVarK;
                                            r rVar = qVar.f26341e;
                                            r rVarB = rVar != null ? rVar.b(i4, obj, null) : null;
                                            objApply = biFunction.apply(obj, rVarB == null ? null : rVarB.f26326c);
                                            if (objApply != null) {
                                                if (rVarB != null) {
                                                    rVarB.f26326c = objApply;
                                                } else {
                                                    qVar.e(i4, obj, objApply);
                                                    i11 = 1;
                                                }
                                            } else if (rVarB != null) {
                                                if (qVar.f(rVarB)) {
                                                    h(lVarArrE, i12, p(qVar.f26342f));
                                                }
                                                i11 = -1;
                                            }
                                            i10 = 1;
                                            objApply2 = objApply;
                                        } else if (lVarK instanceof m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    n(lVarArrE, i12);
                                }
                            }
                        }
                    }
                }
            }
            lVarArrE = e();
        }
        if (i11 != 0) {
            a(i11, i10);
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
            l[] lVarArr = this.f26303a;
            if (lVarArr != null && lVarArr.length != 0) {
                return lVarArr;
            }
            int i4 = this.sizeCtl;
            if (i4 < 0) {
                Thread.yield();
            } else if (f26296h.c(this, f26297i, i4, -1)) {
                try {
                    l[] lVarArr2 = this.f26303a;
                    if (lVarArr2 == null || lVarArr2.length == 0) {
                        int i10 = i4 > 0 ? i4 : 16;
                        l[] lVarArr3 = new l[i10];
                        this.f26303a = lVarArr3;
                        i4 = i10 - (i10 >>> 2);
                        lVarArr2 = lVarArr3;
                    }
                    this.sizeCtl = i4;
                    return lVarArr2;
                } catch (Throwable th2) {
                    this.sizeCtl = i4;
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0140, code lost:
    
        if (r1.f26305c != r6) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0142, code lost:
    
        r1.f26305c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r6, r7 << 1);
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
        int i4;
        if (lVar instanceof g) {
            l[] lVarArr2 = ((g) lVar).f26318e;
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(lVarArr.length) | 32768;
            while (lVarArr2 == this.f26304b && this.f26303a == lVarArr && (i4 = this.sizeCtl) < 0 && (i4 >>> 16) == iNumberOfLeadingZeros && i4 != iNumberOfLeadingZeros + 1 && i4 != Settings.DEFAULT_INITIAL_WINDOW_SIZE + iNumberOfLeadingZeros && this.transferIndex > 0) {
                if (f26296h.c(this, f26297i, i4, i4 + 1)) {
                    m(lVarArr, lVarArr2);
                    break;
                }
            }
            return lVarArr2;
        }
        return this.f26303a;
    }

    public final void o(int i4) {
        int length;
        int iL = i4 >= 536870912 ? 1073741824 : l(i4 + (i4 >>> 1) + 1);
        while (true) {
            int i10 = this.sizeCtl;
            if (i10 < 0) {
                break;
            }
            l[] lVarArr = this.f26303a;
            if (lVarArr == null || (length = lVarArr.length) == 0) {
                int i11 = i10 > iL ? i10 : iL;
                if (f26296h.c(this, f26297i, i10, -1)) {
                    try {
                        if (this.f26303a == lVarArr) {
                            this.f26303a = new l[i11];
                            i10 = i11 - (i11 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i10;
                    }
                } else {
                    continue;
                }
            } else if (iL <= i10 || length >= 1073741824) {
                break;
            } else if (lVarArr == this.f26303a) {
                if (f26296h.c(this, f26297i, i10, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
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
        int i4;
        int i10;
        int i11;
        int i12;
        boolean z3;
        char c9;
        int i13;
        int i14;
        l qVar;
        l qVar2;
        r lVar;
        int i15;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        int length = lVarArr.length;
        int i16 = g;
        boolean z10 = true;
        int i17 = i16 > 1 ? (length >>> 3) / i16 : length;
        char c10 = 16;
        int i18 = i17 < 16 ? 16 : i17;
        if (lVarArr2 == null) {
            try {
                l[] lVarArr4 = new l[length << 1];
                concurrentHashMap.f26304b = lVarArr4;
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
        int i19 = 0;
        int i20 = 0;
        boolean z11 = false;
        while (true) {
            if (zB) {
                int i21 = i19 - 1;
                if (i21 >= i20 || z11) {
                    i20 = i20;
                    i19 = i21;
                    zB = false;
                } else {
                    int i22 = concurrentHashMap.transferIndex;
                    if (i22 <= 0) {
                        i19 = -1;
                    } else {
                        j$.sun.misc.a aVar = f26296h;
                        int i23 = i20;
                        long j8 = j;
                        if (i22 > i18) {
                            i10 = i23;
                            i11 = i22 - i18;
                            i4 = i21;
                        } else {
                            i4 = i21;
                            i10 = i23;
                            i11 = 0;
                        }
                        boolean zC = aVar.c(concurrentHashMap, j8, i22, i11);
                        i20 = i11;
                        if (zC) {
                            i19 = i22 - 1;
                        } else {
                            i20 = i10;
                            i19 = i4;
                        }
                    }
                    zB = false;
                }
            } else {
                int i24 = i20;
                r lVar2 = null;
                if (i19 < 0 || i19 >= length || (i14 = i19 + length) >= length2) {
                    i12 = length;
                    z3 = z10;
                    c9 = c10;
                    i13 = i18;
                    if (z11) {
                        concurrentHashMap.f26304b = null;
                        concurrentHashMap.f26303a = lVarArr3;
                        concurrentHashMap.sizeCtl = (i12 << 1) - (i12 >>> 1);
                        return;
                    }
                    int i25 = i19;
                    j$.sun.misc.a aVar2 = f26296h;
                    long j9 = f26297i;
                    int i26 = concurrentHashMap.sizeCtl;
                    if (!aVar2.c(concurrentHashMap, j9, i26, i26 - 1)) {
                        i19 = i25;
                    } else {
                        if (i26 - 2 != ((Integer.numberOfLeadingZeros(i12) | 32768) << 16)) {
                            return;
                        }
                        zB = z3;
                        z11 = zB;
                        i19 = i12;
                    }
                } else {
                    ?? K = k(lVarArr, i19);
                    if (K == 0) {
                        zB = b(lVarArr, i19, gVar);
                        i12 = length;
                        z3 = z10;
                        c9 = c10;
                        i13 = i18;
                    } else {
                        z3 = z10;
                        int i27 = K.f26324a;
                        if (i27 == -1) {
                            i12 = length;
                            c9 = c10;
                            i13 = i18;
                            zB = z3;
                        } else {
                            synchronized (K) {
                                try {
                                    if (k(lVarArr, i19) == K) {
                                        if (i27 >= 0) {
                                            int i28 = i27 & length;
                                            r rVar = K;
                                            for (r rVar2 = K.f26327d; rVar2 != null; rVar2 = rVar2.f26327d) {
                                                char c11 = c10;
                                                int i29 = rVar2.f26324a & length;
                                                if (i29 != i28) {
                                                    rVar = rVar2;
                                                    i28 = i29;
                                                }
                                                c10 = c11;
                                            }
                                            c9 = c10;
                                            if (i28 == 0) {
                                                lVar = null;
                                                lVar2 = rVar;
                                            } else {
                                                lVar = rVar;
                                            }
                                            l lVar3 = K;
                                            while (lVar3 != rVar) {
                                                int i30 = lVar3.f26324a;
                                                Object obj = lVar3.f26325b;
                                                int i31 = length;
                                                Object obj2 = lVar3.f26326c;
                                                if ((i30 & i31) == 0) {
                                                    i15 = i18;
                                                    lVar2 = new l(i30, obj, obj2, lVar2);
                                                } else {
                                                    i15 = i18;
                                                    lVar = new l(i30, obj, obj2, lVar);
                                                }
                                                lVar3 = lVar3.f26327d;
                                                length = i31;
                                                i18 = i15;
                                            }
                                            i12 = length;
                                            i13 = i18;
                                            h(lVarArr3, i19, lVar2);
                                            h(lVarArr3, i14, lVar);
                                            h(lVarArr, i19, gVar);
                                        } else {
                                            i12 = length;
                                            c9 = c10;
                                            i13 = i18;
                                            if (K instanceof q) {
                                                q qVar3 = (q) K;
                                                r rVar3 = null;
                                                r rVar4 = null;
                                                l lVar4 = qVar3.f26342f;
                                                int i32 = 0;
                                                int i33 = 0;
                                                r rVar5 = null;
                                                while (lVar4 != null) {
                                                    q qVar4 = qVar3;
                                                    int i34 = lVar4.f26324a;
                                                    r rVar6 = new r(i34, lVar4.f26325b, lVar4.f26326c, null, null);
                                                    if ((i34 & i12) == 0) {
                                                        rVar6.f26345h = rVar4;
                                                        if (rVar4 == null) {
                                                            lVar2 = rVar6;
                                                        } else {
                                                            rVar4.f26327d = rVar6;
                                                        }
                                                        i32++;
                                                        rVar4 = rVar6;
                                                    } else {
                                                        rVar6.f26345h = rVar3;
                                                        if (rVar3 == null) {
                                                            rVar5 = rVar6;
                                                        } else {
                                                            rVar3.f26327d = rVar6;
                                                        }
                                                        i33++;
                                                        rVar3 = rVar6;
                                                    }
                                                    lVar4 = lVar4.f26327d;
                                                    qVar3 = qVar4;
                                                }
                                                q qVar5 = qVar3;
                                                if (i32 <= 6) {
                                                    qVar = p(lVar2);
                                                } else {
                                                    qVar = i33 != 0 ? new q(lVar2) : qVar5;
                                                }
                                                if (i33 <= 6) {
                                                    qVar2 = p(rVar5);
                                                } else {
                                                    qVar2 = i32 != 0 ? new q(rVar5) : qVar5;
                                                }
                                                h(lVarArr3, i19, qVar);
                                                h(lVarArr3, i14, qVar2);
                                                h(lVarArr, i19, gVar);
                                            }
                                        }
                                        zB = z3;
                                    } else {
                                        i12 = length;
                                        c9 = c10;
                                        i13 = i18;
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                }
                concurrentHashMap = this;
                i20 = i24;
                z10 = z3;
                c10 = c9;
                length = i12;
                i18 = i13;
            }
        }
    }

    public final long j() {
        c[] cVarArr = this.f26305c;
        long j8 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j8 += cVar.value;
                }
            }
        }
        return j8;
    }

    public final void n(l[] lVarArr, int i4) {
        int length = lVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        l lVarK = k(lVarArr, i4);
        if (lVarK == null || lVarK.f26324a < 0) {
            return;
        }
        synchronized (lVarK) {
            try {
                if (k(lVarArr, i4) == lVarK) {
                    r rVar = null;
                    r rVar2 = null;
                    l lVar = lVarK;
                    while (lVar != null) {
                        r rVar3 = new r(lVar.f26324a, lVar.f26325b, lVar.f26326c, null, null);
                        rVar3.f26345h = rVar2;
                        if (rVar2 == null) {
                            rVar = rVar3;
                        } else {
                            rVar2.f26327d = rVar3;
                        }
                        lVar = lVar.f26327d;
                        rVar2 = rVar3;
                    }
                    h(lVarArr, i4, new q(rVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.util.concurrent.l] */
    public static l p(r rVar) {
        l lVar = null;
        l lVar2 = null;
        for (r rVar2 = rVar; rVar2 != null; rVar2 = rVar2.f26327d) {
            l lVar3 = new l(rVar2.f26324a, rVar2.f26325b, rVar2.f26326c);
            if (lVar2 == null) {
                lVar = lVar3;
            } else {
                lVar2.f26327d = lVar3;
            }
            lVar2 = lVar3;
        }
        return lVar;
    }
}
