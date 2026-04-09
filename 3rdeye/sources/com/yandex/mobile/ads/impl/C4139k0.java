package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import com.singular.sdk.internal.Constants;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4139k0 {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f29430m = {fa.a(C4139k0.class, "activityInteractionEventListener", "getActivityInteractionEventListener()Lcom/monetization/ads/base/tracker/interaction/ActivityInteractionEventListener;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f29431a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<?> f29432b;

    /* renamed from: c, reason: collision with root package name */
    private final h80 f29433c;

    /* renamed from: d, reason: collision with root package name */
    private final o7 f29434d;

    /* renamed from: e, reason: collision with root package name */
    private final mp1 f29435e;

    /* renamed from: f, reason: collision with root package name */
    private final o80 f29436f;

    /* renamed from: g, reason: collision with root package name */
    private final k80 f29437g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f29438h;
    private final ao1 i;

    /* renamed from: j, reason: collision with root package name */
    private a f29439j;

    /* renamed from: k, reason: collision with root package name */
    private o71 f29440k;

    /* renamed from: l, reason: collision with root package name */
    private long f29441l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.k0$a */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f29442c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f29443d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f29444e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ a[] f29445f;

        /* renamed from: b, reason: collision with root package name */
        private final String f29446b;

        static {
            a aVar = new a(0, "BROWSER", "browser");
            f29442c = aVar;
            a aVar2 = new a(1, "WEBVIEW", "webview");
            f29443d = aVar2;
            a aVar3 = new a(2, "CUSTOM", "custom");
            f29444e = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f29445f = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i, String str, String str2) {
            this.f29446b = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f29445f.clone();
        }

        public final String a() {
            return this.f29446b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C4139k0(android.content.Context r12, com.yandex.mobile.ads.impl.C4072a3 r13, com.yandex.mobile.ads.impl.a8 r14, com.yandex.mobile.ads.impl.InterfaceC4132j0 r15, com.yandex.mobile.ads.impl.h80 r16) {
        /*
            r11 = this;
            r5 = r16
            com.yandex.mobile.ads.impl.o7 r6 = new com.yandex.mobile.ads.impl.o7
            r6.<init>()
            com.yandex.mobile.ads.impl.vu1 r0 = r13.q()
            r0.f()
            com.yandex.mobile.ads.impl.wm2 r0 = com.yandex.mobile.ads.impl.wm2.f35021a
            com.yandex.mobile.ads.impl.vu1 r1 = r13.q()
            com.yandex.mobile.ads.impl.bl2 r1 = r1.b()
            com.yandex.mobile.ads.impl.g01 r7 = com.yandex.mobile.ads.impl.gd.a(r12, r0, r1)
            if (r5 == 0) goto L25
            com.yandex.mobile.ads.impl.o80 r0 = new com.yandex.mobile.ads.impl.o80
            r0.<init>(r12, r13, r5)
        L23:
            r8 = r0
            goto L27
        L25:
            r0 = 0
            goto L23
        L27:
            com.yandex.mobile.ads.impl.k80 r9 = com.yandex.mobile.ads.impl.k80.a.a(r12)
            com.yandex.mobile.ads.impl.ew1 r0 = com.yandex.mobile.ads.impl.ew1.a.a()
            com.yandex.mobile.ads.impl.du1 r0 = r0.a(r12)
            if (r0 == 0) goto L43
            boolean r0 = r0.w0()
            r1 = 1
            if (r0 != r1) goto L43
        L3c:
            r0 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            r10 = r1
            r1 = r12
            goto L45
        L43:
            r1 = 0
            goto L3c
        L45:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C4139k0.<init>(android.content.Context, com.yandex.mobile.ads.impl.a3, com.yandex.mobile.ads.impl.a8, com.yandex.mobile.ads.impl.j0, com.yandex.mobile.ads.impl.h80):void");
    }

    private final ip1 a(a aVar, String str) {
        jp1 jp1VarA = this.f29434d.a(this.f29431a.a());
        jp1VarA.b(aVar.a(), "type");
        jp1VarA.b(this.f29431a.b().b(), Constants.ADMON_AD_TYPE);
        jp1VarA.b(this.f29431a.c(), "block_id");
        jp1VarA.b(this.f29431a.c(), Constants.ADMON_AD_UNIT_ID);
        jp1VarA.b(str, "interval");
        o71 o71Var = this.f29440k;
        if (o71Var != null) {
            jp1VarA = kp1.a(jp1VarA, o71Var.a());
        }
        ip1.b reportType = ip1.b.f28787M;
        Map<String, Object> reportData = jp1VarA.b();
        a8<?> a8Var = this.f29432b;
        C4075b c4075bA = a8Var != null ? a8Var.a() : null;
        kotlin.jvm.internal.l.f(reportType, "reportType");
        kotlin.jvm.internal.l.f(reportData, "reportData");
        return new ip1(reportType.a(), C2078B.u(reportData), c4075bA);
    }

    public final void b(a type) {
        kotlin.jvm.internal.l.f(type, "type");
        type.toString();
        fp0.a(new Object[0]);
        this.f29441l = System.currentTimeMillis();
        this.f29439j = type;
        if (type == a.f29442c && this.f29438h) {
            Map<String, Object> mapB = a(type, null).b();
            a8<?> a8Var = this.f29432b;
            this.f29437g.a(new i80(this.f29431a.b(), this.f29441l, type, this.f29433c, mapB, a8Var != null ? a8Var.a() : null));
        }
    }

    public C4139k0(Context context, C4072a3 adConfiguration, a8 a8Var, InterfaceC4132j0 activityInteractionEventListener, h80 h80Var, o7 adRequestReportDataProvider, mp1 metricaReporter, o80 o80Var, k80 falseClickDataStorage, boolean z10) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(activityInteractionEventListener, "activityInteractionEventListener");
        kotlin.jvm.internal.l.f(adRequestReportDataProvider, "adRequestReportDataProvider");
        kotlin.jvm.internal.l.f(metricaReporter, "metricaReporter");
        kotlin.jvm.internal.l.f(falseClickDataStorage, "falseClickDataStorage");
        this.f29431a = adConfiguration;
        this.f29432b = a8Var;
        this.f29433c = h80Var;
        this.f29434d = adRequestReportDataProvider;
        this.f29435e = metricaReporter;
        this.f29436f = o80Var;
        this.f29437g = falseClickDataStorage;
        this.f29438h = z10;
        this.i = bo1.a(activityInteractionEventListener);
    }

    public final void a(a type) {
        kotlin.jvm.internal.l.f(type, "type");
        type.toString();
        fp0.a(new Object[0]);
        if (this.f29441l == 0 || this.f29439j != type) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f29441l;
        String interval = tp0.a(jCurrentTimeMillis);
        kotlin.jvm.internal.l.f(interval, "interval");
        this.f29435e.a(a(type, interval));
        fp0.d(type.a(), interval);
        InterfaceC4132j0 interfaceC4132j0 = (InterfaceC4132j0) this.i.getValue(this, f29430m[0]);
        if (interfaceC4132j0 != null) {
            interfaceC4132j0.onReturnedToApplication();
        }
        o80 o80Var = this.f29436f;
        if (o80Var != null) {
            o80Var.a(jCurrentTimeMillis);
            if (this.f29438h) {
                this.f29437g.a(this.f29441l);
            }
        }
        this.f29441l = 0L;
        this.f29439j = null;
    }

    public final void a(o71 o71Var) {
        this.f29440k = o71Var;
    }
}
