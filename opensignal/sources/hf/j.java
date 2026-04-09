package hf;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.measurement.e5;
import h9.r2;
import io.sentry.android.core.e0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import lf.c2;
import lf.o0;
import lf.p0;
import lf.q0;
import lf.r0;
import lf.t0;
import lf.u0;
import lf.v0;
import lf.z0;
import p.v2;

/* loaded from: classes.dex */
public final class j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f10659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f10660c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al.b f10661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f10662e;

    public j(l lVar, long j, Throwable th2, Thread thread, al.b bVar) {
        this.f10662e = lVar;
        this.f10658a = j;
        this.f10659b = th2;
        this.f10660c = thread;
        this.f10661d = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        Thread thread;
        long j = this.f10658a;
        long j7 = j / 1000;
        l lVar = this.f10662e;
        NavigableSet navigableSetC = ((of.a) lVar.f10677m.f10471d).c();
        String str = !navigableSetC.isEmpty() ? (String) navigableSetC.first() : null;
        if (str == null) {
            e0.c("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return e5.u(null);
        }
        lVar.f10669c.u();
        r2 r2Var = lVar.f10677m;
        r2Var.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        r rVar = (r) r2Var.f10470a;
        Context context = rVar.f10707a;
        int i10 = context.getResources().getConfiguration().orientation;
        om.f fVar = rVar.f10710d;
        Stack stack = new Stack();
        for (Throwable cause = this.f10659b; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        js.e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            eVar = new js.e(th2.getLocalizedMessage(), th2.getClass().getName(), fVar.q(th2.getStackTrace()), eVar, 11);
        }
        js.e eVar2 = eVar;
        o0 o0Var = new o0();
        o0Var.f15379b = "crash";
        o0Var.f15378a = j7;
        o0Var.f15384g = (byte) (o0Var.f15384g | 1);
        c2 c2VarB = ef.d.f8190a.b(context);
        int i11 = ((z0) c2VarB).f15484c;
        Boolean boolValueOf = i11 > 0 ? Boolean.valueOf(i11 != 100) : null;
        ArrayList arrayListA = ef.d.a(context);
        byte b2 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) eVar2.f13800x;
        Thread thread2 = this.f10660c;
        String name = thread2.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b10 = (byte) 1;
        List listD = r.d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        if (b10 != 1) {
            StringBuilder sb2 = new StringBuilder();
            if (b10 == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException(h0.b.p("Missing required properties:", sb2));
        }
        String str2 = str;
        arrayList.add(new v0(name, 4, listD));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            if (key.equals(thread2)) {
                thread = thread2;
            } else {
                StackTraceElement[] stackTraceElementArrQ = fVar.q(entry.getValue());
                String name2 = key.getName();
                if (name2 == null) {
                    throw new NullPointerException("Null name");
                }
                List listD2 = r.d(stackTraceElementArrQ, 0);
                if (listD2 == null) {
                    throw new NullPointerException("Null frames");
                }
                if (b10 != 1) {
                    StringBuilder sb3 = new StringBuilder();
                    if (b10 == 0) {
                        sb3.append(" importance");
                    }
                    throw new IllegalStateException(h0.b.p("Missing required properties:", sb3));
                }
                thread = thread2;
                arrayList.add(new v0(name2, 0, listD2));
            }
            thread2 = thread;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        t0 t0VarC = r.c(eVar2, 0);
        u0 u0VarE = r.e();
        List listA = rVar.a();
        if (listA == null) {
            throw new NullPointerException("Null binaries");
        }
        r0 r0Var = new r0(listUnmodifiableList, t0VarC, null, u0VarE, listA);
        if (b2 != 1) {
            StringBuilder sb4 = new StringBuilder();
            if (b2 == 0) {
                sb4.append(" uiOrientation");
            }
            throw new IllegalStateException(h0.b.p("Missing required properties:", sb4));
        }
        o0Var.f15380c = new q0(r0Var, null, null, boolValueOf, c2VarB, arrayListA, i10);
        o0Var.f15381d = rVar.b(i10);
        p0 p0VarA = o0Var.a();
        kf.e eVar3 = (kf.e) r2Var.f10473r;
        v2 v2Var = (v2) r2Var.f10474x;
        ((of.a) r2Var.f10471d).d(r2.A(r2.z(p0VarA, eVar3, v2Var, mq.x.f16946a), v2Var), str2, true);
        try {
            of.b bVar = lVar.f10673g;
            String str3 = ".ae" + j;
            bVar.getClass();
            if (!new File((File) bVar.f19423g, str3).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e4) {
            e0.q("FirebaseCrashlytics", "Could not create app exception marker file.", e4);
        }
        al.b bVar2 = this.f10661d;
        lVar.b(false, bVar2, false);
        lVar.c(new d().f10648a, Boolean.FALSE);
        if (!lVar.f10668b.z()) {
            return e5.u(null);
        }
        dd.r rVar2 = ((dd.h) ((AtomicReference) bVar2.f817i).get()).f7294a;
        jf.b bVar3 = lVar.f10671e.f13707a;
        a2.g gVar = new a2.g();
        gVar.f31a = this;
        return rVar2.k(bVar3, gVar);
    }
}
