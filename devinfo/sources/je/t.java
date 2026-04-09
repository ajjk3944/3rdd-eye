package je;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f27615a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f27616b;

    /* renamed from: c, reason: collision with root package name */
    public Object f27617c;

    /* renamed from: d, reason: collision with root package name */
    public Object f27618d;

    /* renamed from: e, reason: collision with root package name */
    public Object f27619e;

    /* renamed from: f, reason: collision with root package name */
    public Object f27620f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public Serializable f27621h;

    public t(wd.f fVar) {
        Boolean boolValueOf;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = new Object();
        this.f27619e = obj;
        this.f27620f = new TaskCompletionSource();
        this.f27615a = false;
        this.f27616b = false;
        this.g = new TaskCompletionSource();
        fVar.a();
        Context context = fVar.f36614a;
        this.f27618d = fVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f27617c = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f27616b = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e2);
            }
            Boolean boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            if (boolValueOf2 == null) {
                this.f27616b = false;
                boolValueOf = null;
            } else {
                this.f27616b = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f27621h = boolValueOf;
        synchronized (obj) {
            try {
                if (f()) {
                    ((TaskCompletionSource) this.f27620f).trySetResult(null);
                    this.f27615a = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(l3.e eVar, int i4, ArrayList arrayList, l3.k kVar) {
        l3.n nVar = eVar.f28560d;
        l3.k kVar2 = nVar.f28582c;
        l3.e eVar2 = nVar.f28587i;
        l3.e eVar3 = nVar.f28586h;
        if (kVar2 == null) {
            k3.e eVar4 = (k3.e) this.f27617c;
            if (nVar == eVar4.f27845d || nVar == eVar4.f27847e) {
                return;
            }
            if (kVar == null) {
                kVar = new l3.k();
                kVar.f28570a = null;
                kVar.f28571b = new ArrayList();
                kVar.f28570a = nVar;
                arrayList.add(kVar);
            }
            nVar.f28582c = kVar;
            kVar.f28571b.add(nVar);
            ArrayList arrayList2 = eVar3.f28565k;
            int size = arrayList2.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                l3.d dVar = (l3.d) obj;
                if (dVar instanceof l3.e) {
                    a((l3.e) dVar, i4, arrayList, kVar);
                }
            }
            ArrayList arrayList3 = eVar2.f28565k;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                l3.d dVar2 = (l3.d) obj2;
                if (dVar2 instanceof l3.e) {
                    a((l3.e) dVar2, i4, arrayList, kVar);
                }
            }
            if (i4 == 1 && (nVar instanceof l3.l)) {
                ArrayList arrayList4 = ((l3.l) nVar).f28572k.f28565k;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (i13 < size3) {
                    Object obj3 = arrayList4.get(i13);
                    i13++;
                    l3.d dVar3 = (l3.d) obj3;
                    if (dVar3 instanceof l3.e) {
                        a((l3.e) dVar3, i4, arrayList, kVar);
                    }
                }
            }
            ArrayList arrayList5 = eVar3.f28566l;
            int size4 = arrayList5.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj4 = arrayList5.get(i14);
                i14++;
                a((l3.e) obj4, i4, arrayList, kVar);
            }
            ArrayList arrayList6 = eVar2.f28566l;
            int size5 = arrayList6.size();
            int i15 = 0;
            while (i15 < size5) {
                Object obj5 = arrayList6.get(i15);
                i15++;
                a((l3.e) obj5, i4, arrayList, kVar);
            }
            if (i4 == 1 && (nVar instanceof l3.l)) {
                ArrayList arrayList7 = ((l3.l) nVar).f28572k.f28566l;
                int size6 = arrayList7.size();
                while (i10 < size6) {
                    Object obj6 = arrayList7.get(i10);
                    i10++;
                    a((l3.e) obj6, i4, arrayList, kVar);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c9, code lost:
    
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(k3.e r25) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: je.t.b(k3.e):void");
    }

    public void c() {
        k3.e eVar = (k3.e) this.f27617c;
        ArrayList arrayList = (ArrayList) this.f27621h;
        ArrayList arrayList2 = (ArrayList) this.f27619e;
        arrayList2.clear();
        k3.e eVar2 = (k3.e) this.f27618d;
        eVar2.f27845d.f();
        eVar2.f27847e.f();
        arrayList2.add(eVar2.f27845d);
        arrayList2.add(eVar2.f27847e);
        ArrayList arrayList3 = eVar2.f27879q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList3.get(i4);
            i4++;
            k3.d dVar = (k3.d) obj;
            if (dVar instanceof k3.h) {
                l3.h hVar = new l3.h(dVar);
                dVar.f27845d.f();
                dVar.f27847e.f();
                hVar.f28585f = ((k3.h) dVar).f27919u0;
                arrayList2.add(hVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f27841b == null) {
                        dVar.f27841b = new l3.c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f27841b);
                } else {
                    arrayList2.add(dVar.f27845d);
                }
                if (dVar.y()) {
                    if (dVar.f27843c == null) {
                        dVar.f27843c = new l3.c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f27843c);
                } else {
                    arrayList2.add(dVar.f27847e);
                }
                if (dVar instanceof k3.i) {
                    arrayList2.add(new l3.i(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((l3.n) obj2).f();
        }
        int size3 = arrayList2.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            l3.n nVar = (l3.n) obj3;
            if (nVar.f28581b != eVar2) {
                nVar.d();
            }
        }
        arrayList.clear();
        e(eVar.f27845d, 0, arrayList);
        e(eVar.f27847e, 1, arrayList);
        this.f27615a = false;
    }

    public int d(k3.e eVar, int i4) {
        ArrayList arrayList;
        int i10;
        long jMax;
        float f10;
        k3.e eVar2 = eVar;
        ArrayList arrayList2 = (ArrayList) this.f27621h;
        int size = arrayList2.size();
        long j = 0;
        int i11 = 0;
        long jMax2 = 0;
        while (i11 < size) {
            l3.n nVar = ((l3.k) arrayList2.get(i11)).f28570a;
            if (!(nVar instanceof l3.c) ? !(i4 != 0 ? (nVar instanceof l3.l) : (nVar instanceof l3.j)) : ((l3.c) nVar).f28585f != i4) {
                l3.e eVar3 = (i4 == 0 ? eVar2.f27845d : eVar2.f27847e).f28586h;
                l3.e eVar4 = (i4 == 0 ? eVar2.f27845d : eVar2.f27847e).f28587i;
                l3.e eVar5 = nVar.f28586h;
                l3.e eVar6 = nVar.f28587i;
                boolean zContains = eVar5.f28566l.contains(eVar3);
                boolean zContains2 = eVar6.f28566l.contains(eVar4);
                long j8 = nVar.j();
                if (zContains && zContains2) {
                    long jB = l3.k.b(eVar5, j);
                    long jA = l3.k.a(eVar6, j);
                    long j9 = jB - j8;
                    int i12 = eVar6.f28562f;
                    arrayList = arrayList2;
                    i10 = size;
                    if (j9 >= (-i12)) {
                        j9 += i12;
                    }
                    long j10 = eVar5.f28562f;
                    long j11 = ((-jA) - j8) - j10;
                    if (j11 >= j10) {
                        j11 -= j10;
                    }
                    k3.d dVar = nVar.f28581b;
                    if (i4 == 0) {
                        f10 = dVar.f27846d0;
                    } else if (i4 == 1) {
                        f10 = dVar.f27848e0;
                    } else {
                        dVar.getClass();
                        f10 = -1.0f;
                    }
                    float f11 = f10 > 0.0f ? (long) ((j9 / (1.0f - f10)) + (j11 / f10)) : 0L;
                    jMax = (eVar5.f28562f + ((((long) ((f11 * f10) + 0.5f)) + j8) + ((long) r5.c.c(1.0f, f10, f11, 0.5f)))) - eVar6.f28562f;
                } else {
                    arrayList = arrayList2;
                    i10 = size;
                    jMax = zContains ? Math.max(l3.k.b(eVar5, eVar5.f28562f), eVar5.f28562f + j8) : zContains2 ? Math.max(-l3.k.a(eVar6, eVar6.f28562f), (-eVar6.f28562f) + j8) : (nVar.j() + eVar5.f28562f) - eVar6.f28562f;
                }
            } else {
                arrayList = arrayList2;
                i10 = size;
                jMax = j;
            }
            jMax2 = Math.max(jMax2, jMax);
            i11++;
            eVar2 = eVar;
            arrayList2 = arrayList;
            size = i10;
            j = 0;
        }
        return (int) jMax2;
    }

    public void e(l3.n nVar, int i4, ArrayList arrayList) {
        l3.e eVar = nVar.f28586h;
        l3.e eVar2 = nVar.f28587i;
        ArrayList arrayList2 = eVar.f28565k;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            l3.d dVar = (l3.d) obj;
            if (dVar instanceof l3.e) {
                a((l3.e) dVar, i4, arrayList, null);
            } else if (dVar instanceof l3.n) {
                a(((l3.n) dVar).f28586h, i4, arrayList, null);
            }
        }
        ArrayList arrayList3 = eVar2.f28565k;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            l3.d dVar2 = (l3.d) obj2;
            if (dVar2 instanceof l3.e) {
                a((l3.e) dVar2, i4, arrayList, null);
            } else if (dVar2 instanceof l3.n) {
                a(((l3.n) dVar2).f28587i, i4, arrayList, null);
            }
        }
        if (i4 == 1) {
            ArrayList arrayList4 = ((l3.l) nVar).f28572k.f28565k;
            int size3 = arrayList4.size();
            while (i10 < size3) {
                Object obj3 = arrayList4.get(i10);
                i10++;
                l3.d dVar3 = (l3.d) obj3;
                if (dVar3 instanceof l3.e) {
                    a((l3.e) dVar3, i4, arrayList, null);
                }
            }
        }
    }

    public synchronized boolean f() {
        boolean zG;
        Boolean bool = (Boolean) this.f27621h;
        if (bool != null) {
            zG = bool.booleanValue();
        } else {
            try {
                zG = ((wd.f) this.f27618d).g();
            } catch (IllegalStateException unused) {
                zG = false;
            }
        }
        g(zG);
        return zG;
    }

    public void g(boolean z3) {
        String strN = a0.g.n("Crashlytics automatic data collection ", z3 ? "ENABLED" : "DISABLED", " by ", ((Boolean) this.f27621h) == null ? "global Firebase setting" : this.f27616b ? "firebase_crashlytics_collection_enabled manifest flag" : "API", ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strN, null);
        }
    }

    public void h(int i4, int i10, int i11, int i12, k3.d dVar) {
        l3.b bVar = (l3.b) this.g;
        bVar.f28547a = i4;
        bVar.f28548b = i11;
        bVar.f28549c = i10;
        bVar.f28550d = i12;
        ((n3.e) this.f27620f).b(dVar, bVar);
        dVar.O(bVar.f28551e);
        dVar.L(bVar.f28552f);
        dVar.E = bVar.f28553h;
        dVar.I(bVar.g);
    }

    public void i() {
        l3.a aVar;
        t tVar = this;
        ArrayList arrayList = ((k3.e) tVar.f27617c).f27879q0;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            int i10 = i4 + 1;
            k3.d dVar = (k3.d) arrayList.get(i4);
            if (!dVar.f27839a) {
                int[] iArr = dVar.f27868p0;
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = dVar.f27870r;
                int i14 = dVar.f27871s;
                boolean z3 = i11 == 2 || (i11 == 3 && i13 == 1);
                boolean z10 = i12 == 2 || (i12 == 3 && i14 == 1);
                l3.f fVar = dVar.f27845d.f28584e;
                boolean z11 = fVar.j;
                l3.f fVar2 = dVar.f27847e.f28584e;
                boolean z12 = fVar2.j;
                boolean z13 = z3;
                if (z11 && z12) {
                    tVar.h(1, fVar.g, 1, fVar2.g, dVar);
                    dVar.f27839a = true;
                } else if (z11 && z10) {
                    h(1, fVar.g, 2, fVar2.g, dVar);
                    if (i12 == 3) {
                        dVar.f27847e.f28584e.f28567m = dVar.k();
                    } else {
                        dVar.f27847e.f28584e.d(dVar.k());
                        dVar.f27839a = true;
                    }
                } else if (z12 && z13) {
                    h(2, fVar.g, 1, fVar2.g, dVar);
                    if (i11 == 3) {
                        dVar.f27845d.f28584e.f28567m = dVar.q();
                    } else {
                        dVar.f27845d.f28584e.d(dVar.q());
                        dVar.f27839a = true;
                    }
                }
                if (dVar.f27839a && (aVar = dVar.f27847e.f28573l) != null) {
                    aVar.d(dVar.f27840a0);
                }
                tVar = this;
            }
            i4 = i10;
        }
    }
}
