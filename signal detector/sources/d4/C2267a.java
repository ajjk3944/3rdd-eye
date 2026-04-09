package d4;

import A2.C;
import A2.C0117e;
import V0.m;
import Y2.C0217t;
import a4.q;
import a4.s;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.util.Log;
import b4.C0350o;
import b4.C0351p;
import c3.j;
import com.lefan.base.activity.LanguageActivity;
import d5.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import o4.AbstractC2763b;

/* renamed from: d4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2267a implements a4.b {

    /* renamed from: o, reason: collision with root package name */
    public static final long f19772o = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f19773p = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f19774a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f19775b;

    /* renamed from: c, reason: collision with root package name */
    public final s f19776c;

    /* renamed from: d, reason: collision with root package name */
    public final C0351p f19777d;

    /* renamed from: e, reason: collision with root package name */
    public final J2.i f19778e;

    /* renamed from: f, reason: collision with root package name */
    public final C0117e f19779f;

    /* renamed from: g, reason: collision with root package name */
    public final C0117e f19780g;

    /* renamed from: h, reason: collision with root package name */
    public final ThreadPoolExecutor f19781h;
    public final q i;

    /* renamed from: j, reason: collision with root package name */
    public final File f19782j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f19783k;

    /* renamed from: l, reason: collision with root package name */
    public final Set f19784l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f19785m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f19786n;

    public C2267a(Context context, File file, s sVar, C0351p c0351p) {
        ThreadPoolExecutor threadPoolExecutorT = y.t();
        J2.i iVar = new J2.i(context, 3, false);
        this.f19774a = new Handler(Looper.getMainLooper());
        this.f19783k = new AtomicReference();
        this.f19784l = Collections.synchronizedSet(new HashSet());
        this.f19785m = Collections.synchronizedSet(new HashSet());
        this.f19786n = new AtomicBoolean(false);
        this.f19775b = context;
        this.f19782j = file;
        this.f19776c = sVar;
        this.f19777d = c0351p;
        this.f19781h = threadPoolExecutorT;
        this.f19778e = iVar;
        this.f19780g = new C0117e(27);
        this.f19779f = new C0117e(27);
        this.i = q.f4715a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.util.ArrayList] */
    @Override // a4.b
    public final j a(V2.h hVar) {
        int iIndexOf;
        String string;
        Integer num;
        int i;
        ?? SingletonList;
        Iterator it;
        ArrayList arrayList = (ArrayList) hVar.f3876c;
        int i3 = 2;
        try {
            a4.d dVarF = f(new C0117e(29, hVar));
            if (dVarF == null) {
                return d(-100);
            }
            int i6 = dVarF.f4679a;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) hVar.f3875b;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                arrayList2.add(((Locale) obj).getLanguage());
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList4 = new ArrayList();
            File[] fileArrListFiles = this.f19782j.listFiles(C2271e.f19799a);
            if (fileArrListFiles == null) {
                Log.w("FakeSplitInstallManager", "Specified splits directory does not exist.");
                return d(-5);
            }
            int i8 = 0;
            long length = 0;
            while (i8 < fileArrListFiles.length) {
                File file = fileArrListFiles[i8];
                String strQ = T2.g.Q(file);
                String str = strQ.split("\\.config\\.", i3)[0];
                hashSet.add(strQ);
                if (arrayList3.contains(str)) {
                    String str2 = strQ.split("\\.config\\.", i3)[0];
                    Configuration configuration = this.f19778e.f2065b.getResources().getConfiguration();
                    if (Build.VERSION.SDK_INT >= 24) {
                        LocaleList locales = configuration.getLocales();
                        SingletonList = new ArrayList(locales.size());
                        i = i6;
                        for (int i9 = 0; i9 < locales.size(); i9++) {
                            SingletonList.add(J2.i.k(locales.get(i9)));
                        }
                    } else {
                        i = i6;
                        SingletonList = Collections.singletonList(J2.i.k(configuration.locale));
                    }
                    HashSet hashSet2 = new HashSet((Collection) SingletonList);
                    HashMap mapR = e().r(Arrays.asList(str2));
                    HashSet hashSet3 = new HashSet();
                    Iterator it2 = mapR.values().iterator();
                    while (it2.hasNext()) {
                        hashSet3.addAll((Set) it2.next());
                    }
                    HashSet hashSet4 = new HashSet();
                    Iterator it3 = hashSet2.iterator();
                    while (it3.hasNext()) {
                        String str3 = (String) it3.next();
                        HashMap map = mapR;
                        if (str3.contains("_")) {
                            it = it3;
                            str3 = str3.split("_", -1)[0];
                        } else {
                            it = it3;
                        }
                        hashSet4.add(str3);
                        mapR = map;
                        it3 = it;
                    }
                    HashMap map2 = mapR;
                    hashSet4.addAll(this.f19785m);
                    hashSet4.addAll(arrayList2);
                    HashSet hashSet5 = new HashSet();
                    Iterator it4 = map2.entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry = (Map.Entry) it4.next();
                        Iterator it5 = it4;
                        if (hashSet4.contains(entry.getKey())) {
                            hashSet5.addAll((Collection) entry.getValue());
                        }
                        it4 = it5;
                    }
                    if (!hashSet3.contains(strQ) || hashSet5.contains(strQ)) {
                        length = file.length() + length;
                        arrayList4.add(file);
                        break;
                    }
                    i8++;
                    i6 = i;
                    i3 = 2;
                } else {
                    i = i6;
                }
                ArrayList arrayList5 = new ArrayList(this.f19784l);
                arrayList5.addAll(Arrays.asList("", "base"));
                HashMap mapR2 = e().r(arrayList5);
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    Locale locale = (Locale) obj2;
                    if (mapR2.containsKey(locale.getLanguage()) && ((Set) mapR2.get(locale.getLanguage())).contains(strQ)) {
                        length = file.length() + length;
                        arrayList4.add(file);
                        break;
                        break;
                    }
                }
                i8++;
                i6 = i;
                i3 = 2;
            }
            int i11 = i6;
            Log.i("FakeSplitInstallManager", "availableSplits " + hashSet.toString() + " want " + String.valueOf(arrayList3));
            int size3 = arrayList3.size();
            C0351p c0351p = this.f19777d;
            if (size3 != 1 || (num = (Integer) ((C2269c) c0351p.a()).f19792b.get(arrayList3.get(0))) == null) {
                num = ((C2269c) c0351p.a()).f19791a;
            }
            if (num != null) {
                return d(num.intValue());
            }
            if (!hashSet.containsAll(new HashSet(arrayList3))) {
                return d(-2);
            }
            Long lValueOf = Long.valueOf(length);
            Integer numValueOf = Integer.valueOf(i11);
            g(1, 0, 0L, lValueOf, arrayList3, numValueOf, arrayList2);
            this.f19781h.execute(new C(this, arrayList4, arrayList2, 14));
            j jVar = new j();
            jVar.g(numValueOf);
            return jVar;
        } catch (C0350o e6) {
            Class[] clsArr = {a4.a.class};
            for (int i12 = 0; i12 <= 0; i12++) {
                Class cls = clsArr[i12];
                if (RuntimeException.class.isAssignableFrom(cls)) {
                    Object[] objArr = new Object[2];
                    objArr[0] = "getCause";
                    objArr[1] = cls;
                    int i13 = 0;
                    for (int i14 = 2; i13 < i14; i14 = 2) {
                        Object obj3 = objArr[i13];
                        if (obj3 == null) {
                            string = "null";
                        } else {
                            try {
                                string = obj3.toString();
                            } catch (Exception e7) {
                                String strF = AbstractC2763b.f(obj3.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj3)));
                                Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strF), (Throwable) e7);
                                string = "<" + strF + " threw " + e7.getClass().getName() + ">";
                            }
                        }
                        objArr[i13] = string;
                        i13++;
                    }
                    StringBuilder sb = new StringBuilder(118);
                    int i15 = 0;
                    int i16 = 0;
                    while (i16 < 2 && (iIndexOf = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s".indexOf("%s", i15)) != -1) {
                        sb.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i15, iIndexOf);
                        sb.append(objArr[i16]);
                        i16++;
                        i15 = iIndexOf + 2;
                    }
                    sb.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i15, 86);
                    if (i16 < 2) {
                        sb.append(" [");
                        sb.append(objArr[i16]);
                        for (int i17 = i16 + 1; i17 < 2; i17++) {
                            sb.append(", ");
                            sb.append(objArr[i17]);
                        }
                        sb.append(']');
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (a4.a.class.isInstance(e6.getCause())) {
                return d(((a4.a) ((Exception) a4.a.class.cast(e6.getCause()))).f2147a.f6904a);
            }
            Exception cause = e6.getCause();
            ClassCastException classCastException = new ClassCastException("getCause(" + a4.a.class + ") doesn't match underlying exception");
            classCastException.initCause(cause);
            throw classCastException;
        }
    }

    @Override // a4.b
    public final void b(LanguageActivity languageActivity) {
        C0117e c0117e = this.f19780g;
        synchronized (c0117e) {
            ((HashSet) c0117e.f245b).add(languageActivity);
        }
    }

    @Override // a4.b
    public final void c(LanguageActivity languageActivity) {
        C0117e c0117e = this.f19780g;
        synchronized (c0117e) {
            ((HashSet) c0117e.f245b).remove(languageActivity);
        }
    }

    public final j d(int i) {
        f(new m(i, 12));
        return com.bumptech.glide.d.r(new a4.a(i));
    }

    public final U0.j e() throws Resources.NotFoundException {
        Context context = this.f19775b;
        try {
            U0.j jVarA = this.f19776c.a(context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo.metaData);
            if (jVarA != null) {
                return jVarA;
            }
            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e6) {
            throw new IllegalStateException("App is not found in PackageManager", e6);
        }
    }

    public final synchronized a4.d f(g gVar) {
        a4.d dVar = (a4.d) this.f19783k.get();
        a4.d dVarM = gVar.m(dVar);
        AtomicReference atomicReference = this.f19783k;
        while (!atomicReference.compareAndSet(dVar, dVarM)) {
            if (atomicReference.get() != dVar && atomicReference.get() != dVar) {
                return null;
            }
        }
        return dVarM;
    }

    public final boolean g(int i, int i3, Long l2, Long l6, ArrayList arrayList, Integer num, ArrayList arrayList2) {
        C0217t c0217t = new C0217t();
        c0217t.f4365a = num;
        c0217t.f4368d = i;
        c0217t.f4369e = i3;
        c0217t.f4366b = l2;
        c0217t.f4367c = l6;
        c0217t.f4370f = arrayList;
        c0217t.f4371g = arrayList2;
        a4.d dVarF = f(c0217t);
        if (dVarF == null) {
            return false;
        }
        this.f19774a.post(new A1.d(this, dVarF, 29, false));
        return true;
    }
}
