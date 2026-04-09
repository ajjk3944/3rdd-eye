package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class gv0 {

    /* renamed from: e, reason: collision with root package name */
    public static volatile int f11611e = 1;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11612a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f11613b;

    /* renamed from: c, reason: collision with root package name */
    public final Task f11614c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11615d;

    public gv0(Context context, Executor executor, Task task, boolean z3) {
        this.f11612a = context;
        this.f11613b = executor;
        this.f11614c = task;
        this.f11615d = z3;
    }

    public static gv0 a(Context context, Executor executor, boolean z3) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z3) {
            executor.execute(new uh0(14, context, taskCompletionSource));
        } else {
            executor.execute(new du0(3, taskCompletionSource));
        }
        return new gv0(context, executor, taskCompletionSource.getTask(), z3);
    }

    public void b(int i4, long j) {
        e(i4, j, null, null, null);
    }

    public void c(int i4, long j, Exception exc) {
        e(i4, j, exc, null, null);
    }

    public void d(int i4, String str) {
        e(i4, 0L, null, null, str);
    }

    public final Task e(int i4, long j, Exception exc, String str, String str2) {
        if (!this.f11615d) {
            return this.f11614c.continueWith(this.f11613b, tk0.f16848n);
        }
        Context context = this.f11612a;
        rc rcVarA = uc.A();
        String packageName = context.getPackageName();
        rcVarA.b();
        ((uc) rcVarA.f14755b).B(packageName);
        rcVarA.b();
        ((uc) rcVarA.f14755b).C(j);
        int i10 = f11611e;
        rcVarA.b();
        ((uc) rcVarA.f14755b).H(i10);
        if (exc != null) {
            Object obj = o31.f14530a;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            rcVarA.b();
            ((uc) rcVarA.f14755b).D(string);
            String name = exc.getClass().getName();
            rcVarA.b();
            ((uc) rcVarA.f14755b).E(name);
        }
        if (str2 != null) {
            rcVarA.b();
            ((uc) rcVarA.f14755b).F(str2);
        }
        if (str != null) {
            rcVarA.b();
            ((uc) rcVarA.f14755b).G(str);
        }
        return this.f11614c.continueWith(this.f11613b, new t7.m(rcVarA, i4, 10));
    }
}
