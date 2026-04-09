package com.google.firebase.crashlytics.internal.common;

import N4.F;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public class C {

    /* renamed from: g, reason: collision with root package name */
    private static final Map f38706g;

    /* renamed from: h, reason: collision with root package name */
    static final String f38707h;

    /* renamed from: a, reason: collision with root package name */
    private final Context f38708a;

    /* renamed from: b, reason: collision with root package name */
    private final L f38709b;

    /* renamed from: c, reason: collision with root package name */
    private final C5099a f38710c;

    /* renamed from: d, reason: collision with root package name */
    private final T4.d f38711d;

    /* renamed from: e, reason: collision with root package name */
    private final S4.j f38712e;

    /* renamed from: f, reason: collision with root package name */
    private final I4.j f38713f = I4.j.f8622a;

    static {
        HashMap map = new HashMap();
        f38706g = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f38707h = String.format(Locale.US, "Crashlytics Android SDK/%s", "19.4.1");
    }

    public C(Context context, L l10, C5099a c5099a, T4.d dVar, S4.j jVar) {
        this.f38708a = context;
        this.f38709b = l10;
        this.f38710c = c5099a;
        this.f38711d = dVar;
        this.f38712e = jVar;
    }

    private F.e.d.a.c A(F.a aVar) {
        return this.f38713f.a(aVar.e(), aVar.d(), aVar.c());
    }

    private F.a a(F.a aVar) {
        List listUnmodifiableList;
        if (!this.f38712e.b().f20251b.f20260c || this.f38710c.f38754c.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C5104f c5104f : this.f38710c.f38754c) {
                arrayList.add(F.a.AbstractC0564a.a().d(c5104f.c()).b(c5104f.a()).c(c5104f.b()).a());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return F.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(listUnmodifiableList).a();
    }

    private F.b b() {
        return N4.F.b().l("19.4.1").h(this.f38710c.f38752a).i(this.f38709b.a().c()).g(this.f38709b.a().e()).f(this.f38709b.a().d()).d(this.f38710c.f38757f).e(this.f38710c.f38758g).k(4);
    }

    private static long f(long j10) {
        if (j10 > 0) {
            return j10;
        }
        return 0L;
    }

    private static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) f38706g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private F.e.d.a.b.AbstractC0568a h() {
        return F.e.d.a.b.AbstractC0568a.a().b(0L).d(0L).c(this.f38710c.f38756e).e(this.f38710c.f38753b).a();
    }

    private List i() {
        return Collections.singletonList(h());
    }

    private F.e.d.a j(int i10, F.a aVar) {
        return F.e.d.a.a().c(Boolean.valueOf(aVar.c() != 100)).d(A(aVar)).h(i10).f(o(aVar)).a();
    }

    private F.e.d.a k(int i10, T4.e eVar, Thread thread, int i11, int i12, boolean z10) {
        Boolean boolValueOf;
        F.e.d.a.c cVarE = this.f38713f.e(this.f38708a);
        if (cVarE.b() > 0) {
            boolValueOf = Boolean.valueOf(cVarE.b() != 100);
        } else {
            boolValueOf = null;
        }
        return F.e.d.a.a().c(boolValueOf).d(cVarE).b(this.f38713f.d(this.f38708a)).h(i10).f(p(eVar, thread, i11, i12, z10)).a();
    }

    private F.e.d.c l(int i10) {
        C5103e c5103eA = C5103e.a(this.f38708a);
        Float fB = c5103eA.b();
        Double dValueOf = fB != null ? Double.valueOf(fB.doubleValue()) : null;
        int iC = c5103eA.c();
        boolean zN = AbstractC5107i.n(this.f38708a);
        return F.e.d.c.a().b(dValueOf).c(iC).f(zN).e(i10).g(f(AbstractC5107i.b(this.f38708a) - AbstractC5107i.a(this.f38708a))).d(AbstractC5107i.c(Environment.getDataDirectory().getPath())).a();
    }

    private F.e.d.a.b.c m(T4.e eVar, int i10, int i11) {
        return n(eVar, i10, i11, 0);
    }

    private F.e.d.a.b.c n(T4.e eVar, int i10, int i11, int i12) {
        String str = eVar.f21405b;
        String str2 = eVar.f21404a;
        StackTraceElement[] stackTraceElementArr = eVar.f21406c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        T4.e eVar2 = eVar.f21407d;
        if (i12 >= i11) {
            T4.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f21407d;
                i13++;
            }
        }
        F.e.d.a.b.c.AbstractC0571a abstractC0571aD = F.e.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i10)).d(i13);
        if (eVar2 != null && i13 == 0) {
            abstractC0571aD.b(n(eVar2, i10, i11, i12 + 1));
        }
        return abstractC0571aD.a();
    }

    private F.e.d.a.b o(F.a aVar) {
        return F.e.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    private F.e.d.a.b p(T4.e eVar, Thread thread, int i10, int i11, boolean z10) {
        return F.e.d.a.b.a().f(z(eVar, thread, i10, z10)).d(m(eVar, i10, i11)).e(w()).c(i()).a();
    }

    private F.e.d.a.b.AbstractC0574e.AbstractC0576b q(StackTraceElement stackTraceElement, F.e.d.a.b.AbstractC0574e.AbstractC0576b.AbstractC0577a abstractC0577a) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC0577a.e(jMax).f(str).b(fileName).d(lineNumber).a();
    }

    private List r(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, F.e.d.a.b.AbstractC0574e.AbstractC0576b.a().c(i10)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private F.e.a s() {
        return F.e.a.a().e(this.f38709b.f()).g(this.f38710c.f38757f).d(this.f38710c.f38758g).f(this.f38709b.a().c()).b(this.f38710c.f38759h.d()).c(this.f38710c.f38759h.e()).a();
    }

    private F.e t(String str, long j10) {
        return F.e.a().m(j10).j(str).h(f38707h).b(s()).l(v()).e(u()).i(3).a();
    }

    private F.e.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iG = g();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jB = AbstractC5107i.b(this.f38708a);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean zW = AbstractC5107i.w();
        int iL = AbstractC5107i.l();
        return F.e.c.a().b(iG).f(Build.MODEL).c(iAvailableProcessors).h(jB).d(blockCount).i(zW).j(iL).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }

    private F.e.AbstractC0581e v() {
        return F.e.AbstractC0581e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(AbstractC5107i.x()).a();
    }

    private F.e.d.a.b.AbstractC0572d w() {
        return F.e.d.a.b.AbstractC0572d.a().d("0").c("0").b(0L).a();
    }

    private F.e.d.a.b.AbstractC0574e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    private F.e.d.a.b.AbstractC0574e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return F.e.d.a.b.AbstractC0574e.a().d(thread.getName()).c(i10).b(r(stackTraceElementArr, i10)).a();
    }

    private List z(T4.e eVar, Thread thread, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f21406c, i10));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.f38711d.a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public F.e.d c(F.a aVar) {
        int i10 = this.f38708a.getResources().getConfiguration().orientation;
        return F.e.d.a().g("anr").f(aVar.i()).b(j(i10, a(aVar))).c(l(i10)).a();
    }

    public F.e.d d(Throwable th2, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        int i12 = this.f38708a.getResources().getConfiguration().orientation;
        return F.e.d.a().g(str).f(j10).b(k(i12, T4.e.a(th2, this.f38711d), thread, i10, i11, z10)).c(l(i12)).a();
    }

    public N4.F e(String str, long j10) {
        return b().m(t(str, j10)).a();
    }
}
