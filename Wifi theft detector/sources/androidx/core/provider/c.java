package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.core.provider.FontsContractCompat;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o0.g;
import o0.h;
import r.j;
import r.k;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final j f2573a = new j(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f2574b = h.a("fonts-androidx", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2575c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final k f2576d = new k();

    public class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2577a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f2578b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f2579c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f2580d;

        public a(String str, Context context, g gVar, int i10) {
            this.f2577a = str;
            this.f2578b = context;
            this.f2579c = gVar;
            this.f2580d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return c.c(this.f2577a, this.f2578b, this.f2579c, this.f2580d);
        }
    }

    public class b implements r0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.core.provider.a f2581a;

        public b(androidx.core.provider.a aVar) {
            this.f2581a = aVar;
        }

        @Override // r0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f2581a.b(eVar);
        }
    }

    /* renamed from: androidx.core.provider.c$c, reason: collision with other inner class name */
    public class CallableC0020c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2582a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f2583b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f2584c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f2585d;

        public CallableC0020c(String str, Context context, g gVar, int i10) {
            this.f2582a = str;
            this.f2583b = context;
            this.f2584c = gVar;
            this.f2585d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return c.c(this.f2582a, this.f2583b, this.f2584c, this.f2585d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    public class d implements r0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2586a;

        public d(String str) {
            this.f2586a = str;
        }

        @Override // r0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (c.f2575c) {
                try {
                    k kVar = c.f2576d;
                    ArrayList arrayList = (ArrayList) kVar.get(this.f2586a);
                    if (arrayList == null) {
                        return;
                    }
                    kVar.remove(this.f2586a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((r0.b) arrayList.get(i10)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static String a(g gVar, int i10) {
        return gVar.d() + "-" + i10;
    }

    public static int b(FontsContractCompat.a aVar) {
        int i10 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        FontsContractCompat.b[] bVarArrB = aVar.b();
        if (bVarArrB != null && bVarArrB.length != 0) {
            i10 = 0;
            for (FontsContractCompat.b bVar : bVarArrB) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i10;
    }

    public static e c(String str, Context context, g gVar, int i10) {
        j jVar = f2573a;
        Typeface typeface = (Typeface) jVar.get(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            FontsContractCompat.a aVarE = androidx.core.provider.b.e(context, gVar, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = j0.e.b(context, null, aVarE.b(), i10);
            if (typefaceB == null) {
                return new e(-3);
            }
            jVar.put(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    public static Typeface d(Context context, g gVar, int i10, Executor executor, androidx.core.provider.a aVar) {
        String strA = a(gVar, i10);
        Typeface typeface = (Typeface) f2573a.get(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f2575c) {
            try {
                k kVar = f2576d;
                ArrayList arrayList = (ArrayList) kVar.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                kVar.put(strA, arrayList2);
                CallableC0020c callableC0020c = new CallableC0020c(strA, context, gVar, i10);
                if (executor == null) {
                    executor = f2574b;
                }
                h.b(executor, callableC0020c, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface e(Context context, g gVar, androidx.core.provider.a aVar, int i10, int i11) {
        String strA = a(gVar, i10);
        Typeface typeface = (Typeface) f2573a.get(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, gVar, i10);
            aVar.b(eVarC);
            return eVarC.f2587a;
        }
        try {
            e eVar = (e) h.c(f2574b, new a(strA, context, gVar, i10), i11);
            aVar.b(eVar);
            return eVar.f2587a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f2587a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2588b;

        public e(int i10) {
            this.f2587a = null;
            this.f2588b = i10;
        }

        public boolean a() {
            return this.f2588b == 0;
        }

        public e(Typeface typeface) {
            this.f2587a = typeface;
            this.f2588b = 0;
        }
    }
}
