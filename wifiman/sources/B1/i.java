package B1;

import B1.k;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.C7030v;
import o.V;
import v2.AbstractC8187a;

/* loaded from: classes.dex */
abstract class i {

    /* renamed from: a, reason: collision with root package name */
    static final C7030v f1059a = new C7030v(16);

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f1060b = l.a("fonts-androidx", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    static final Object f1061c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final V f1062d = new V();

    class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1063a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f1064b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ B1.e f1065c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1066d;

        a(String str, Context context, B1.e eVar, int i10) {
            this.f1063a = str;
            this.f1064b = context;
            this.f1065c = eVar;
            this.f1066d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return i.c(this.f1063a, this.f1064b, w1.k.a(new Object[]{this.f1065c}), this.f1066d);
        }
    }

    class b implements E1.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ B1.a f1067a;

        b(B1.a aVar) {
            this.f1067a = aVar;
        }

        @Override // E1.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f1067a.b(eVar);
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1068a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f1069b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f1070c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1071d;

        c(String str, Context context, List list, int i10) {
            this.f1068a = str;
            this.f1069b = context;
            this.f1070c = list;
            this.f1071d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return i.c(this.f1068a, this.f1069b, this.f1070c, this.f1071d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements E1.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1072a;

        d(String str) {
            this.f1072a = str;
        }

        @Override // E1.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (i.f1061c) {
                try {
                    V v10 = i.f1062d;
                    ArrayList arrayList = (ArrayList) v10.get(this.f1072a);
                    if (arrayList == null) {
                        return;
                    }
                    v10.remove(this.f1072a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((E1.a) arrayList.get(i10)).accept(eVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static String a(List list, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(((B1.e) list.get(i11)).d());
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    private static int b(k.a aVar) {
        int i10 = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        k.b[] bVarArrC = aVar.c();
        if (bVarArrC != null && bVarArrC.length != 0) {
            i10 = 0;
            for (k.b bVar : bVarArrC) {
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

    static e c(String str, Context context, List list, int i10) {
        AbstractC8187a.a("getFontSync");
        try {
            C7030v c7030v = f1059a;
            Typeface typeface = (Typeface) c7030v.c(str);
            if (typeface != null) {
                return new e(typeface);
            }
            k.a aVarE = B1.d.e(context, list, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = (!aVarE.f() || Build.VERSION.SDK_INT < 29) ? w1.l.b(context, null, aVarE.c(), i10) : w1.l.c(context, null, aVarE.d(), i10);
            if (typefaceB == null) {
                return new e(-3);
            }
            c7030v.d(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        } finally {
            AbstractC8187a.b();
        }
    }

    static Typeface d(Context context, List list, int i10, Executor executor, B1.a aVar) {
        String strA = a(list, i10);
        Typeface typeface = (Typeface) f1059a.c(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f1061c) {
            try {
                V v10 = f1062d;
                ArrayList arrayList = (ArrayList) v10.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                v10.put(strA, arrayList2);
                c cVar = new c(strA, context, list, i10);
                if (executor == null) {
                    executor = f1060b;
                }
                l.c(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static Typeface e(Context context, B1.e eVar, B1.a aVar, int i10, int i11) {
        String strA = a(w1.k.a(new Object[]{eVar}), i10);
        Typeface typeface = (Typeface) f1059a.c(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, w1.k.a(new Object[]{eVar}), i10);
            aVar.b(eVarC);
            return eVarC.f1073a;
        }
        try {
            e eVar2 = (e) l.d(f1060b, new a(strA, context, eVar, i10), i11);
            aVar.b(eVar2);
            return eVar2.f1073a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f1073a;

        /* renamed from: b, reason: collision with root package name */
        final int f1074b;

        e(int i10) {
            this.f1073a = null;
            this.f1074b = i10;
        }

        boolean a() {
            return this.f1074b == 0;
        }

        e(Typeface typeface) {
            this.f1073a = typeface;
            this.f1074b = 0;
        }
    }
}
