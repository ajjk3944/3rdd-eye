package i7;

import android.content.Context;
import com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import mq.x;
import tt.s;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11264a;

    /* renamed from: e, reason: collision with root package name */
    public e7.d f11268e;

    /* renamed from: f, reason: collision with root package name */
    public e7.d f11269f;

    /* renamed from: l, reason: collision with root package name */
    public HashSet f11273l;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11265b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f11266c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11267d = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final l f11270g = l.AUTOMATIC;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11271h = true;

    /* renamed from: i, reason: collision with root package name */
    public final long f11272i = -1;
    public final m j = new m(0);
    public final LinkedHashSet k = new LinkedHashSet();

    public k(Context context) {
        this.f11264a = context;
    }

    public final void a(bm.a... aVarArr) {
        if (this.f11273l == null) {
            this.f11273l = new HashSet();
        }
        for (bm.a aVar : aVarArr) {
            HashSet hashSet = this.f11273l;
            br.l.b(hashSet);
            hashSet.add(Integer.valueOf(aVar.f2820a));
            HashSet hashSet2 = this.f11273l;
            br.l.b(hashSet2);
            hashSet2.add(Integer.valueOf(aVar.f2821b));
        }
        this.j.a((bm.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }

    public final OpensignalDatabase b() throws ClassNotFoundException {
        e7.d dVar = this.f11268e;
        if (dVar == null && this.f11269f == null) {
            e7.d dVar2 = q.a.k;
            this.f11269f = dVar2;
            this.f11268e = dVar2;
        } else if (dVar != null && this.f11269f == null) {
            this.f11269f = dVar;
        } else if (dVar == null) {
            this.f11268e = this.f11269f;
        }
        HashSet hashSet = this.f11273l;
        LinkedHashSet linkedHashSet = this.k;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(h0.b.h(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        sm.f fVar = new sm.f(20);
        if (this.f11272i > 0) {
            throw new IllegalArgumentException("Required value was null.");
        }
        l lVar = this.f11270g;
        Context context = this.f11264a;
        l lVarResolve$room_runtime_release = lVar.resolve$room_runtime_release(context);
        e7.d dVar3 = this.f11268e;
        if (dVar3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        e7.d dVar4 = this.f11269f;
        if (dVar4 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        m mVar = this.j;
        ArrayList arrayList = this.f11265b;
        boolean z10 = this.f11271h;
        ArrayList arrayList2 = this.f11266c;
        ArrayList arrayList3 = this.f11267d;
        f7.a aVar = new f7.a(context, fVar, mVar, arrayList, lVarResolve$room_runtime_release, dVar3, dVar4, z10, linkedHashSet, arrayList2, arrayList3);
        Package r22 = OpensignalDatabase.class.getPackage();
        br.l.b(r22);
        String name = r22.getName();
        String canonicalName = OpensignalDatabase.class.getCanonicalName();
        br.l.b(canonicalName);
        br.l.d(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            br.l.d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String strConcat = s.k0(canonicalName, '.', '_').concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, OpensignalDatabase.class.getClassLoader());
            br.l.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            OpensignalDatabase opensignalDatabase = (OpensignalDatabase) cls.getDeclaredConstructor(null).newInstance(null);
            h hVar = opensignalDatabase.f6078d;
            LinkedHashMap linkedHashMap = opensignalDatabase.f6080f;
            opensignalDatabase.f6077c = opensignalDatabase.e(aVar);
            Set setH = opensignalDatabase.h();
            BitSet bitSet = new BitSet();
            Iterator it2 = setH.iterator();
            while (true) {
                int i10 = -1;
                if (!it2.hasNext()) {
                    int size = arrayList3.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i11 = size - 1;
                            if (!bitSet.get(size)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                            if (i11 < 0) {
                                break;
                            }
                            size = i11;
                        }
                    }
                    Iterator it3 = opensignalDatabase.f(linkedHashMap).iterator();
                    while (true) {
                        boolean zContainsKey = false;
                        if (!it3.hasNext()) {
                            break;
                        }
                        bm.a aVar2 = (bm.a) it3.next();
                        int i12 = aVar2.f2820a;
                        int i13 = aVar2.f2821b;
                        LinkedHashMap linkedHashMap2 = mVar.f11274a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i12))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i12));
                            if (map == null) {
                                map = x.f16946a;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(i13));
                        }
                        if (!zContainsKey) {
                            mVar.a(aVar2);
                        }
                    }
                    opensignalDatabase.g().setWriteAheadLoggingEnabled(((l) aVar.f8641f) == l.WRITE_AHEAD_LOGGING);
                    opensignalDatabase.f6079e = (List) aVar.f8640e;
                    opensignalDatabase.f6076b = aVar.f8636a;
                    br.l.e((Executor) aVar.f8642g, "executor");
                    new ArrayDeque();
                    Map mapI = opensignalDatabase.i();
                    BitSet bitSet2 = new BitSet();
                    for (Map.Entry entry : mapI.entrySet()) {
                        Class cls2 = (Class) entry.getKey();
                        for (Class cls3 : (List) entry.getValue()) {
                            int size2 = arrayList2.size() - 1;
                            if (size2 >= 0) {
                                while (true) {
                                    int i14 = size2 - 1;
                                    if (cls3.isAssignableFrom(arrayList2.get(size2).getClass())) {
                                        bitSet2.set(size2);
                                        break;
                                    }
                                    if (i14 < 0) {
                                        break;
                                    }
                                    size2 = i14;
                                }
                                size2 = -1;
                            } else {
                                size2 = -1;
                            }
                            if (!(size2 >= 0)) {
                                throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            opensignalDatabase.f6083i.put(cls3, arrayList2.get(size2));
                        }
                    }
                    int size3 = arrayList2.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i15 = size3 - 1;
                            if (!bitSet2.get(size3)) {
                                throw new IllegalArgumentException("Unexpected type converter " + arrayList2.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i15 < 0) {
                                break;
                            }
                            size3 = i15;
                        }
                    }
                    return opensignalDatabase;
                }
                Class cls4 = (Class) it2.next();
                int size4 = arrayList3.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i16 = size4 - 1;
                        if (cls4.isAssignableFrom(arrayList3.get(size4).getClass())) {
                            bitSet.set(size4);
                            i10 = size4;
                            break;
                        }
                        if (i16 < 0) {
                            break;
                        }
                        size4 = i16;
                    }
                }
                if (i10 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls4.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                linkedHashMap.put(cls4, arrayList3.get(i10));
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + OpensignalDatabase.class.getCanonicalName() + ". " + strConcat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + OpensignalDatabase.class.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + OpensignalDatabase.class.getCanonicalName());
        }
    }
}
