package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class Cw {

    /* renamed from: e, reason: collision with root package name */
    public static volatile int f7697e = 1;

    /* renamed from: a, reason: collision with root package name */
    public final Context f7698a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f7699b;

    /* renamed from: c, reason: collision with root package name */
    public final c3.j f7700c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7701d;

    public Cw(Context context, Executor executor, c3.j jVar, boolean z6) {
        this.f7698a = context;
        this.f7699b = executor;
        this.f7700c = jVar;
        this.f7701d = z6;
    }

    public static Cw a(Context context, Executor executor, boolean z6) {
        c3.f fVar = new c3.f();
        if (z6) {
            executor.execute(new RunnableC0786Vp(context, 15, fVar));
        } else {
            executor.execute(new Fu(4, fVar));
        }
        return new Cw(context, executor, fVar.f5902a, z6);
    }

    public void b(int i, long j6) {
        e(i, j6, null, null, null);
    }

    public void c(int i, long j6, Exception exc) {
        e(i, j6, exc, null, null);
    }

    public void d(int i, String str) {
        e(i, 0L, null, null, str);
    }

    public final c3.j e(int i, long j6, Exception exc, String str, String str2) {
        int i3 = 0;
        if (!this.f7701d) {
            c3.j jVar = this.f7700c;
            Executor executor = this.f7699b;
            C1285ht c1285ht = C1285ht.f14609g;
            jVar.getClass();
            c3.j jVar2 = new c3.j();
            jVar.f5912b.i(new c3.h(executor, c1285ht, jVar2, i3));
            jVar.j();
            return jVar2;
        }
        Context context = this.f7698a;
        K5 k5A = N5.A();
        String packageName = context.getPackageName();
        k5A.b();
        ((N5) k5A.f13551b).B(packageName);
        k5A.b();
        ((N5) k5A.f13551b).C(j6);
        int i6 = f7697e;
        k5A.b();
        ((N5) k5A.f13551b).H(i6);
        if (exc != null) {
            Object obj = AbstractC0977cB.f13539a;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            k5A.b();
            ((N5) k5A.f13551b).D(string);
            String name = exc.getClass().getName();
            k5A.b();
            ((N5) k5A.f13551b).E(name);
        }
        if (str2 != null) {
            k5A.b();
            ((N5) k5A.f13551b).F(str2);
        }
        if (str != null) {
            k5A.b();
            ((N5) k5A.f13551b).G(str);
        }
        c3.j jVar3 = this.f7700c;
        Executor executor2 = this.f7699b;
        L2.w wVar = new L2.w(i, 11, k5A);
        jVar3.getClass();
        c3.j jVar4 = new c3.j();
        jVar3.f5912b.i(new c3.h(executor2, wVar, jVar4, i3));
        jVar3.j();
        return jVar4;
    }
}
