package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import io.sentry.b5;
import io.sentry.c4;
import io.sentry.e1;
import io.sentry.g3;
import io.sentry.g6;
import io.sentry.h3;
import io.sentry.k1;
import io.sentry.l1;
import io.sentry.x5;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class s implements l1 {
    public final f0 B;
    public final io.sentry.android.core.internal.util.q F;
    public volatile h3 G;
    public long I;
    public long J;
    public Date K;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11764a;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.u0 f11765d;

    /* renamed from: g, reason: collision with root package name */
    public final String f11766g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f11767r;

    /* renamed from: x, reason: collision with root package name */
    public final int f11768x;

    /* renamed from: y, reason: collision with root package name */
    public final e1 f11769y;
    public boolean D = false;
    public final AtomicBoolean E = new AtomicBoolean(false);
    public volatile q H = null;
    public final io.sentry.util.a L = new io.sentry.util.a();

    public s(Context context, f0 f0Var, io.sentry.android.core.internal.util.q qVar, io.sentry.u0 u0Var, String str, boolean z10, int i10, e1 e1Var) {
        Context applicationContext = context.getApplicationContext();
        this.f11764a = applicationContext != null ? applicationContext : context;
        ir.f0.T(u0Var, "ILogger is required");
        this.f11765d = u0Var;
        this.F = qVar;
        ir.f0.T(f0Var, "The BuildInfoProvider is required.");
        this.B = f0Var;
        this.f11766g = str;
        this.f11767r = z10;
        this.f11768x = i10;
        ir.f0.T(e1Var, "The ISentryExecutorService is required.");
        this.f11769y = e1Var;
        this.K = dr.a.q();
    }

    public final g3 a(String str, String str2, String str3, boolean z10, List list, x5 x5Var) {
        this.B.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (this.H != null) {
            io.sentry.q qVarA = this.L.a();
            try {
                h3 h3Var = this.G;
                if (h3Var == null || !h3Var.f12301a.equals(str2)) {
                    this.f11765d.m(b5.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
                    qVarA.close();
                    return null;
                }
                this.G = null;
                qVarA.close();
                this.f11765d.m(b5.DEBUG, "Transaction %s (%s) finished.", str, str3);
                d5.y0 y0VarA = this.H.a(list, false);
                this.E.set(false);
                if (y0VarA != null) {
                    long j = y0VarA.f7106d - this.I;
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(h3Var);
                    long j7 = y0VarA.f7106d;
                    long j10 = this.I;
                    long j11 = y0VarA.f7107g;
                    long j12 = this.J;
                    if (h3Var.f12305x == null) {
                        h3Var.f12305x = Long.valueOf(j7 - j10);
                        h3Var.f12304r = Long.valueOf(h3Var.f12304r.longValue() - j10);
                        h3Var.B = Long.valueOf(j11 - j12);
                        h3Var.f12306y = Long.valueOf(h3Var.f12306y.longValue() - j12);
                    }
                    Long l10 = x5Var instanceof SentryAndroidOptions ? i0.c(this.f11764a, (SentryAndroidOptions) x5Var).f11600h : null;
                    String string = l10 != null ? Long.toString(l10.longValue()) : "0";
                    String[] strArr = Build.SUPPORTED_ABIS;
                    File file = (File) y0VarA.f7109x;
                    Date date = this.K;
                    String string2 = Long.toString(j);
                    this.B.getClass();
                    String str4 = (strArr == null || strArr.length <= 0) ? "" : strArr[0];
                    io.sentry.i0 i0Var = new io.sentry.i0(3);
                    this.B.getClass();
                    String str5 = Build.MANUFACTURER;
                    this.B.getClass();
                    String str6 = Build.MODEL;
                    this.B.getClass();
                    return new g3(file, date, arrayList, str, str2, str3, string2, i10, str4, i0Var, str5, str6, Build.VERSION.RELEASE, this.B.b(), string, x5Var.getProguardUuid(), x5Var.getRelease(), x5Var.getEnvironment(), (y0VarA.f7108r || z10) ? "timeout" : "normal", (Map) y0VarA.f7110y);
                }
            } finally {
            }
        }
        return null;
    }

    @Override // io.sentry.l1
    public final void close() {
        s sVar;
        h3 h3Var = this.G;
        if (h3Var != null) {
            sVar = this;
            sVar.a(h3Var.f12303g, h3Var.f12301a, h3Var.f12302d, true, null, c4.c().k());
        } else {
            sVar = this;
        }
        sVar.E.set(false);
        if (sVar.H == null) {
            return;
        }
        q qVar = sVar.H;
        io.sentry.q qVarA = qVar.f11749o.a();
        try {
            Future future = qVar.f11740d;
            if (future != null) {
                future.cancel(true);
                qVar.f11740d = null;
            }
            if (qVar.f11748n) {
                qVar.a(null, true);
            }
            qVarA.close();
        } finally {
        }
    }

    @Override // io.sentry.l1
    public final boolean isRunning() {
        return this.E.get();
    }

    @Override // io.sentry.l1
    public final void j(k1 k1Var) {
        if (this.E.get() && this.G == null) {
            io.sentry.q qVarA = this.L.a();
            try {
                if (this.E.get() && this.G == null) {
                    this.G = new h3(k1Var, Long.valueOf(this.I), Long.valueOf(this.J));
                }
                qVarA.close();
            } catch (Throwable th2) {
                try {
                    qVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // io.sentry.l1
    public final g3 k(g6 g6Var, List list, x5 x5Var) {
        return a(g6Var.f12279e, g6Var.f12275a.toString(), g6Var.f12276b.f12388c.f12412a.toString(), false, list, x5Var);
    }

    @Override // io.sentry.l1
    public final void start() {
        p pVarC;
        this.B.getClass();
        if (this.E.getAndSet(true)) {
            return;
        }
        if (!this.D) {
            this.D = true;
            if (this.f11767r) {
                String str = this.f11766g;
                if (str == null) {
                    this.f11765d.m(b5.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
                } else {
                    int i10 = this.f11768x;
                    if (i10 <= 0) {
                        this.f11765d.m(b5.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i10));
                    } else {
                        this.H = new q(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f11768x, this.F, this.f11769y, this.f11765d);
                    }
                }
            } else {
                this.f11765d.m(b5.INFO, "Profiling is disabled in options.", new Object[0]);
            }
        }
        if (this.H != null && (pVarC = this.H.c()) != null) {
            this.I = pVarC.f11714a;
            this.J = pVarC.f11715b;
            this.K = pVarC.f11716c;
            this.f11765d.m(b5.DEBUG, "Profiler started.", new Object[0]);
            return;
        }
        if (this.H != null && this.H.f11748n) {
            this.f11765d.m(b5.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            return;
        }
        io.sentry.q qVarA = this.L.a();
        try {
            this.G = null;
            qVarA.close();
            this.E.set(false);
        } finally {
        }
    }
}
