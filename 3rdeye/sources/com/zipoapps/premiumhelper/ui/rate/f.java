package com.zipoapps.premiumhelper.ui.rate;

import J8.C0702q;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.ActivityC1762o;
import androidx.fragment.app.C1748a;
import androidx.work.s;
import b9.C1992A;
import b9.j;
import com.applovin.impl.A0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import g0.C4356c;
import i9.InterfaceC4463a;
import io.appmetrica.analytics.impl.Oo;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import l8.b;
import p9.InterfaceC5480a;
import w9.i;
import x4.C5766a;
import y4.n;
import z4.C5860a;

/* compiled from: RateHelper.kt */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i<Object>[] f37113d;

    /* renamed from: a, reason: collision with root package name */
    public final l8.b f37114a;

    /* renamed from: b, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.c f37115b;

    /* renamed from: c, reason: collision with root package name */
    public final r8.d f37116c = new r8.d("PremiumHelper");

    /* compiled from: RateHelper.kt */
    public interface a {
        void a(c cVar);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RateHelper.kt */
    public static final class b {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b NONE = new b("NONE", 0);
        public static final b ALL = new b("ALL", 1);
        public static final b VALIDATE_INTENT = new b("VALIDATE_INTENT", 2);

        private static final /* synthetic */ b[] $values() {
            return new b[]{NONE, ALL, VALIDATE_INTENT};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = com.google.gson.internal.c.l(bVarArr$values);
        }

        private b(String str, int i) {
        }

        public static InterfaceC4463a<b> getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RateHelper.kt */
    public static final class c {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c NONE = new c("NONE", 0);
        public static final c DIALOG = new c("DIALOG", 1);
        public static final c IN_APP_REVIEW = new c("IN_APP_REVIEW", 2);

        private static final /* synthetic */ c[] $values() {
            return new c[]{NONE, DIALOG, IN_APP_REVIEW};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = com.google.gson.internal.c.l(cVarArr$values);
        }

        private c(String str, int i) {
        }

        public static InterfaceC4463a<c> getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* compiled from: RateHelper.kt */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37117a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f37118b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f37119c;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.VALIDATE_INTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37117a = iArr;
            int[] iArr2 = new int[b.e.values().length];
            try {
                iArr2[b.e.THUMBSUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            f37118b = iArr2;
            int[] iArr3 = new int[c.values().length];
            try {
                iArr3[c.DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[c.IN_APP_REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[c.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f37119c = iArr3;
        }
    }

    /* compiled from: RateHelper.kt */
    public static final class e implements a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5480a<C1992A> f37120a;

        public e(InterfaceC5480a<C1992A> interfaceC5480a) {
            this.f37120a = interfaceC5480a;
        }

        @Override // com.zipoapps.premiumhelper.ui.rate.f.a
        public final void a(c reviewUiShown) {
            l.f(reviewUiShown, "reviewUiShown");
            InterfaceC5480a<C1992A> interfaceC5480a = this.f37120a;
            if (interfaceC5480a != null) {
                interfaceC5480a.invoke();
            }
        }
    }

    static {
        q qVar = new q(f.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        x.f43661a.getClass();
        f37113d = new i[]{qVar};
    }

    public f(l8.b bVar, com.zipoapps.premiumhelper.c cVar) {
        this.f37114a = bVar;
        this.f37115b = cVar;
    }

    public static boolean b(Activity activity) {
        l.f(activity, "activity");
        if (activity instanceof AppCompatActivity) {
            return ((AppCompatActivity) activity).getSupportFragmentManager().B("RATE_DIALOG") != null;
        }
        C0702q.a("Please use AppCompatActivity for ".concat(activity.getClass().getName()));
        return false;
    }

    public static void d(Activity activity, a aVar) {
        Task task;
        l.f(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = activity;
        }
        x4.f fVar = new x4.f(new x4.i(applicationContext));
        x4.i iVar = fVar.f47762a;
        y4.g gVar = x4.i.f47769c;
        gVar.a("requestInAppReview (%s)", iVar.f47771b);
        if (iVar.f47770a == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", y4.g.b(gVar.f48109a, "Play Store app is either not installed or not the official version", objArr));
            }
            Locale locale = Locale.getDefault();
            HashMap map = C5860a.f48452a;
            task = Tasks.forException(new C5766a(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, !map.containsKey(-1) ? "" : F3.h.i((String) map.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) C5860a.f48453b.get(-1), ")")))));
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            n nVar = iVar.f47770a;
            x4.g gVar2 = new x4.g(iVar, taskCompletionSource, taskCompletionSource);
            synchronized (nVar.f48123f) {
                nVar.f48122e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new K4.b(8, nVar, taskCompletionSource));
            }
            synchronized (nVar.f48123f) {
                try {
                    if (nVar.f48127k.getAndIncrement() > 0) {
                        y4.g gVar3 = nVar.f48119b;
                        Object[] objArr2 = new Object[0];
                        gVar3.getClass();
                        if (Log.isLoggable("PlayCore", 3)) {
                            Log.d("PlayCore", y4.g.b(gVar3.f48109a, "Already connected to the service.", objArr2));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            nVar.a().post(new y4.i(nVar, taskCompletionSource, gVar2));
            task = taskCompletionSource.getTask();
        }
        l.e(task, "requestReviewFlow(...)");
        task.addOnCompleteListener(new A0(fVar, activity, aVar));
    }

    public static void e(Activity activity, InterfaceC5480a interfaceC5480a) {
        l.f(activity, "activity");
        d(activity, new e(interfaceC5480a));
    }

    public final r8.c a() {
        return this.f37116c.a(this, f37113d[0]);
    }

    public final c c() {
        Enum enumValueOf;
        l8.d<Integer> PH_RATEUS_SESSION_START = i8.d.f38536P;
        l.e(PH_RATEUS_SESSION_START, "PH_RATEUS_SESSION_START");
        l8.b bVar = this.f37114a;
        Integer num = (Integer) bVar.h(PH_RATEUS_SESSION_START);
        com.zipoapps.premiumhelper.c cVar = this.f37115b;
        int i = cVar.i();
        a().g("Rate: shouldShowRateThisSession appStartCounter=" + i + ", startSession=" + num, new Object[0]);
        if (i < num.intValue()) {
            return c.NONE;
        }
        l8.d<String> PH_RATE_US_MODE = i8.d.f38537Q;
        l.e(PH_RATE_US_MODE, "PH_RATE_US_MODE");
        String str = PH_RATE_US_MODE.f43924a;
        String str2 = PH_RATE_US_MODE.f43925b;
        String str3 = (String) bVar.a(bVar, str, str2);
        try {
            String upperCase = str3.toUpperCase(Locale.ROOT);
            l.e(upperCase, "toUpperCase(...)");
            enumValueOf = Enum.valueOf(b.class, upperCase);
            l.c(enumValueOf);
        } catch (IllegalArgumentException unused) {
            va.a.f47104a.c(Oo.h("Invalid remote value for for '", str.getClass().getSimpleName(), "': ", str3, ". Returning key's default value."), new Object[0]);
            String upperCase2 = str2.toUpperCase(Locale.ROOT);
            l.e(upperCase2, "toUpperCase(...)");
            enumValueOf = Enum.valueOf(b.class, upperCase2);
        }
        b bVar2 = (b) enumValueOf;
        int i10 = cVar.i();
        a().g("Rate: shouldShowRateOnAppStart rateMode=" + bVar2, new Object[0]);
        int i11 = d.f37117a[bVar2.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return c.IN_APP_REVIEW;
            }
            if (i11 == 3) {
                return c.NONE;
            }
            throw new j();
        }
        a().g(C4356c.h(i10, "Rate: shouldShowRateOnAppStart appStartCounter="), new Object[0]);
        String str4 = (String) cVar.a(cVar, "rate_intent", "");
        a().g(s.d("Rate: shouldShowRateOnAppStart rateIntent=", str4), new Object[0]);
        if (str4.length() != 0) {
            return str4.equals("positive") ? c.IN_APP_REVIEW : str4.equals("negative") ? c.NONE : c.NONE;
        }
        int i12 = cVar.f37004a.getInt("rate_session_number", 0);
        a().g(C4356c.h(i12, "Rate: shouldShowRateOnAppStart nextSession="), new Object[0]);
        return i10 >= i12 ? c.DIALOG : c.NONE;
    }

    public final void f(androidx.fragment.app.x xVar, int i, String str, a aVar) {
        Enum enumValueOf;
        String str2 = str;
        l8.d<String> PH_RATE_US_TYPE = i8.d.f38538R;
        l.e(PH_RATE_US_TYPE, "PH_RATE_US_TYPE");
        l8.a aVar2 = this.f37114a;
        String str3 = PH_RATE_US_TYPE.f43924a;
        String str4 = PH_RATE_US_TYPE.f43925b;
        String str5 = (String) aVar2.a(aVar2, str3, str4);
        try {
            String upperCase = str5.toUpperCase(Locale.ROOT);
            l.e(upperCase, "toUpperCase(...)");
            enumValueOf = Enum.valueOf(b.e.class, upperCase);
            l.c(enumValueOf);
        } catch (IllegalArgumentException unused) {
            va.a.f47104a.c(Oo.h("Invalid remote value for for '", str3.getClass().getSimpleName(), "': ", str5, ". Returning key's default value."), new Object[0]);
            String upperCase2 = str4.toUpperCase(Locale.ROOT);
            l.e(upperCase2, "toUpperCase(...)");
            enumValueOf = Enum.valueOf(b.e.class, upperCase2);
        }
        if (d.f37118b[((b.e) enumValueOf).ordinal()] == 1) {
            com.zipoapps.premiumhelper.ui.rate.e eVar = new com.zipoapps.premiumhelper.ui.rate.e();
            eVar.f37111b = aVar;
            eVar.setArguments(G0.d.a(new b9.l("theme", Integer.valueOf(i)), new b9.l("arg_rate_source", str2)));
            try {
                C1748a c1748a = new C1748a(xVar);
                c1748a.c(0, eVar, "RATE_DIALOG", 1);
                c1748a.g(true);
                return;
            } catch (IllegalStateException e4) {
                va.a.f47104a.e(e4, "Failed to show rate dialog", new Object[0]);
                return;
            }
        }
        RateBarDialog rateBarDialog = new RateBarDialog();
        rateBarDialog.f37084b = aVar;
        if (str2 == null) {
            str2 = "";
        }
        rateBarDialog.setArguments(G0.d.a(new b9.l("theme", Integer.valueOf(i)), new b9.l("rate_source", str2)));
        try {
            C1748a c1748a2 = new C1748a(xVar);
            c1748a2.c(0, rateBarDialog, "RATE_DIALOG", 1);
            c1748a2.g(true);
        } catch (IllegalStateException e10) {
            va.a.f47104a.e(e10, "Failed to show rate dialog", new Object[0]);
        }
    }

    public final void g(ActivityC1762o activity, int i, p9.l lVar) {
        l.f(activity, "activity");
        h hVar = new h(lVar);
        c cVarC = c();
        a().g("Rate: showRateUi=" + cVarC, new Object[0]);
        int i10 = d.f37119c[cVarC.ordinal()];
        com.zipoapps.premiumhelper.c cVar = this.f37115b;
        if (i10 == 1) {
            androidx.fragment.app.x supportFragmentManager = activity.getSupportFragmentManager();
            l.e(supportFragmentManager, "getSupportFragmentManager(...)");
            f(supportFragmentManager, i, "relaunch", hVar);
        } else if (i10 == 2) {
            d(activity, hVar);
        } else {
            if (i10 != 3) {
                throw new j();
            }
            c cVar2 = c.NONE;
            l.b((String) cVar.a(cVar, "rate_intent", ""), "negative");
            hVar.a(cVar2);
        }
        if (cVarC != c.NONE) {
            int i11 = cVar.i() + 3;
            SharedPreferences.Editor editorEdit = cVar.f37004a.edit();
            editorEdit.putInt("rate_session_number", i11);
            editorEdit.apply();
        }
    }
}
