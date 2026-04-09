package S4;

import A2.C0115c;
import Y2.A;
import Y2.C0199a;
import Y2.N;
import Y2.P;
import Y2.y;
import Y2.z;
import a.AbstractC0241a;
import a4.t;
import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import b4.InterfaceC0341f;
import b4.InterfaceC0342g;
import com.lefan.signal.ui.noise.NoiseZoom;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class r implements T2.c, K1.b, L2.g, N, e4.c, InterfaceC0342g, InterfaceC0341f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3550a;

    public /* synthetic */ r(int i) {
        this.f3550a = i;
    }

    public static void l(ClassLoader classLoader, HashSet hashSet, r rVar) {
        Object[] objArr;
        if (hashSet.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            hashSet2.add(((File) it.next()).getParentFile());
        }
        Field fieldE = R3.b.E(classLoader, "pathList");
        try {
            Object objCast = Object.class.cast(fieldE.get(classLoader));
            V2.e eVar = new V2.e(objCast, R3.b.E(objCast, "nativeLibraryDirectories"), List.class, 21);
            synchronized (a4.p.class) {
                ArrayList arrayList = new ArrayList((Collection) eVar.B());
                hashSet2.removeAll(arrayList);
                arrayList.addAll(hashSet2);
                eVar.C(arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(hashSet2);
            switch (rVar.f3550a) {
                case 22:
                    objArr = (Object[]) R3.b.D(objCast, "makePathElements", List.class, arrayList3, null, List.class, arrayList2);
                    break;
                default:
                    objArr = (Object[]) R3.b.C(objCast, "makePathElements", Object[].class, List.class, arrayList3);
                    break;
            }
            if (arrayList2.isEmpty()) {
                synchronized (a4.p.class) {
                    R3.b.B(objCast, "nativeLibraryPathElements", Object.class).G(Arrays.asList(objArr));
                }
                return;
            }
            J0.c cVar = new J0.c("Error in makePathElements");
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(cVar, (IOException) arrayList2.get(i));
                } catch (Exception unused) {
                }
            }
            throw cVar;
        } catch (Exception e6) {
            throw new J0.c("Failed to get value of field " + fieldE.getName() + " of type " + classLoader.getClass().getName() + " on object of type " + Object.class.getName(), e6);
        }
    }

    @Override // Y2.O
    public Object a() {
        switch (this.f3550a) {
            case 11:
                return new C0199a();
            default:
                y yVar = z.f4386b;
                A.c(yVar);
                return new P(yVar);
        }
    }

    @Override // L2.g
    public void accept(Object obj, Object obj2) {
        V2.c cVar = (V2.c) ((V2.b) obj).t();
        V2.f fVar = new V2.f((c3.f) obj2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = V2.a.f3863a;
        parcelObtain.writeInt(1);
        AbstractC0241a.H(parcelObtain, AbstractC0241a.E(parcelObtain, 20293));
        parcelObtain.writeStrongBinder(fVar);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            cVar.f3864a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // b4.InterfaceC0342g
    public boolean b(Object obj, File file, File file2) throws ClassNotFoundException {
        Class<?> cls;
        switch (this.f3550a) {
            case 20:
                Class<?> cls2 = obj.getClass();
                try {
                    return new File((String) String.class.cast(R3.b.F(cls2, "optimizedPathFor", File.class, File.class).invoke(null, file, file2))).exists();
                } catch (Exception e6) {
                    throw new J0.c("Failed to invoke static method optimizedPathFor on type " + cls2, e6);
                }
            default:
                try {
                    cls = Class.forName("dalvik.system.DexFile");
                } catch (ClassNotFoundException unused) {
                    Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
                }
                try {
                    if (!((Boolean) Boolean.class.cast(R3.b.F(cls, "isDexOptNeeded", String.class).invoke(null, file.getPath()))).booleanValue()) {
                        return true;
                    }
                    return false;
                } catch (Exception e7) {
                    throw new J0.c("Failed to invoke static method isDexOptNeeded on type " + cls, e7);
                }
        }
    }

    @Override // T2.c
    public int c(Context context) {
        return T2.e.a(context);
    }

    @Override // T2.c
    public int d(Context context, boolean z6) {
        return T2.e.d(context, z6);
    }

    public Y.i e(Y.h hVar, ReferenceQueue referenceQueue) {
        return new Y.g(hVar, referenceQueue).f4204a;
    }

    @Override // b4.InterfaceC0341f
    public boolean f(ClassLoader classLoader, File file, File file2, boolean z6) {
        switch (this.f3550a) {
        }
        return R2.a.J(classLoader, file, file2, z6, new r(21), "path", new r(27));
    }

    public void g(Context context, com.bykv.vk.openvk.emc.emc.emc.xq.b bVar, K1.a aVar) {
        ConcurrentHashMap concurrentHashMap = U1.a.f3688a;
        synchronized (U1.a.class) {
            if (bVar != null) {
                try {
                    ConcurrentHashMap concurrentHashMap2 = U1.a.f3688a;
                    U1.c cVar = (U1.c) concurrentHashMap2.get(bVar.aa());
                    if (cVar == null) {
                        cVar = new U1.c(context, bVar);
                        concurrentHashMap2.put(bVar.aa(), cVar);
                        bVar.ycc();
                        bVar.aa();
                    }
                    cVar.b(aVar);
                    bVar.ycc();
                    bVar.aa();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        M1.b bVar2 = d5.y.f19834e;
        if (bVar2 != null) {
            ((C0115c) bVar2).a();
        }
    }

    public NoiseZoom h(Context context) {
        NoiseZoom noiseZoom;
        NoiseZoom noiseZoom2 = NoiseZoom.f19046l;
        if (noiseZoom2 != null) {
            return noiseZoom2;
        }
        synchronized (this) {
            noiseZoom = NoiseZoom.f19046l;
            if (noiseZoom == null) {
                Context applicationContext = context.getApplicationContext();
                q5.i.d(applicationContext, "getApplicationContext(...)");
                C0.o oVarH = t.h(applicationContext, NoiseZoom.class, "noise.db");
                oVarH.c();
                oVarH.f1078j = true;
                noiseZoom = (NoiseZoom) oVarH.b();
                NoiseZoom.f19046l = noiseZoom;
            }
        }
        return noiseZoom;
    }

    public T2.d i(Context context, T2.c cVar) {
        T2.d dVar = new T2.d();
        dVar.f3569a = 0;
        dVar.f3570b = 0;
        dVar.f3571c = 0;
        int iD = cVar.d(context, true);
        dVar.f3570b = iD;
        if (iD != 0) {
            dVar.f3571c = 1;
            return dVar;
        }
        int iC = cVar.c(context);
        dVar.f3569a = iC;
        if (iC != 0) {
            dVar.f3571c = -1;
        }
        return dVar;
    }

    @Override // b4.InterfaceC0341f
    public void j(ClassLoader classLoader, HashSet hashSet) {
        switch (this.f3550a) {
            case 23:
                l(classLoader, hashSet, new r(22));
                break;
            case 24:
                l(classLoader, hashSet, new r(22));
                break;
            case 25:
                l(classLoader, hashSet, new r(22));
                break;
            case 26:
            case 27:
            default:
                l(classLoader, hashSet, new r(26));
                break;
            case 28:
                l(classLoader, hashSet, new r(26));
                break;
        }
    }

    @Override // e4.c
    public void k(B2.a aVar) {
        Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(aVar.f521b)));
    }
}
