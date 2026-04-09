package io.sentry;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class j2 implements q0, r0, i3, j3, e1, l1, m1, u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j2 f12375a = new j2();

    /* renamed from: d, reason: collision with root package name */
    public static final j2 f12376d = new j2();

    /* renamed from: g, reason: collision with root package name */
    public static final j2 f12377g = new j2();

    /* renamed from: r, reason: collision with root package name */
    public static final j2 f12378r = new j2();

    /* renamed from: x, reason: collision with root package name */
    public static final j2 f12379x = new j2();

    /* renamed from: y, reason: collision with root package name */
    public static final j2 f12380y = new j2();

    @Override // io.sentry.j3
    /* renamed from: G */
    public i3 getI() {
        return f12377g;
    }

    @Override // io.sentry.q0
    public void a(boolean z10) {
    }

    @Override // io.sentry.m1
    public io.sentry.transport.g c(x5 x5Var, t tVar) {
        return new io.sentry.transport.c(x5Var, new io.sentry.transport.p(x5Var), x5Var.getTransportGate(), tVar);
    }

    @Override // io.sentry.u0
    public void f(b5 b5Var, Throwable th2, String str, Object... objArr) {
        PrintStream printStream = System.out;
        String str2 = String.format(str, objArr);
        String string = th2.toString();
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(b5Var + ": " + str2 + " \n " + string + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.u0
    public void g(b5 b5Var, String str, Throwable th2) {
        if (th2 == null) {
            m(b5Var, str, new Object[0]);
            return;
        }
        PrintStream printStream = System.out;
        String str2 = String.format(str, th2.toString());
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(b5Var + ": " + str2 + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.j3
    public io.sentry.protocol.t i() {
        return io.sentry.protocol.t.f12636d;
    }

    @Override // io.sentry.e1
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.l1
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.l1
    public g3 k(g6 g6Var, List list, x5 x5Var) {
        return null;
    }

    @Override // io.sentry.q0
    public void l(f3 f3Var) {
    }

    @Override // io.sentry.u0
    public void m(b5 b5Var, String str, Object... objArr) {
        System.out.println(b5Var + ": " + String.format(str, objArr));
    }

    @Override // io.sentry.q0
    public void n(f3 f3Var, r6 r6Var) {
    }

    @Override // io.sentry.u0
    public boolean o(b5 b5Var) {
        return true;
    }

    @Override // io.sentry.i3
    public io.sentry.rrweb.b p(e eVar) {
        return null;
    }

    @Override // io.sentry.e1
    public Future q(Runnable runnable, long j) {
        return new FutureTask(new i0(1));
    }

    @Override // io.sentry.q0
    public void r() {
    }

    @Override // io.sentry.q0
    public io.sentry.protocol.t s() {
        return io.sentry.protocol.t.f12636d;
    }

    @Override // io.sentry.e1
    public Future submit(Runnable runnable) {
        return new FutureTask(new i0(1));
    }

    @Override // io.sentry.l1
    public void close() {
    }

    @Override // io.sentry.e1
    public void e() {
    }

    @Override // io.sentry.j3
    public void h() {
    }

    @Override // io.sentry.j3
    public void pause() {
    }

    @Override // io.sentry.l1
    public void start() {
    }

    @Override // io.sentry.j3
    public void stop() {
    }

    @Override // io.sentry.j3
    public void y() {
    }

    @Override // io.sentry.j3
    public void b(Boolean bool) {
    }

    @Override // io.sentry.e1
    public void d(long j) {
    }

    @Override // io.sentry.l1
    public void j(k1 k1Var) {
    }
}
