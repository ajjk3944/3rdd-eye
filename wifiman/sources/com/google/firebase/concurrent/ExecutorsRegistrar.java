package com.google.firebase.concurrent;

import F4.A;
import F4.t;
import android.annotation.SuppressLint;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import f5.InterfaceC5536b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    static final t f38630a = new t(new InterfaceC5536b() { // from class: G4.a
        @Override // f5.InterfaceC5536b
        public final Object get() {
            return ExecutorsRegistrar.p();
        }
    });

    /* renamed from: b, reason: collision with root package name */
    static final t f38631b = new t(new InterfaceC5536b() { // from class: G4.b
        @Override // f5.InterfaceC5536b
        public final Object get() {
            return ExecutorsRegistrar.q();
        }
    });

    /* renamed from: c, reason: collision with root package name */
    static final t f38632c = new t(new InterfaceC5536b() { // from class: G4.c
        @Override // f5.InterfaceC5536b
        public final Object get() {
            return ExecutorsRegistrar.r();
        }
    });

    /* renamed from: d, reason: collision with root package name */
    static final t f38633d = new t(new InterfaceC5536b() { // from class: G4.d
        @Override // f5.InterfaceC5536b
        public final Object get() {
            return ExecutorsRegistrar.s();
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        builderDetectNetwork.detectUnbufferedIo();
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(F4.d dVar) {
        return (ScheduledExecutorService) f38630a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(F4.d dVar) {
        return (ScheduledExecutorService) f38632c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(F4.d dVar) {
        return (ScheduledExecutorService) f38631b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor o(F4.d dVar) {
        return G4.k.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f38633d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(F4.c.d(A.a(E4.a.class, ScheduledExecutorService.class), A.a(E4.a.class, ExecutorService.class), A.a(E4.a.class, Executor.class)).e(new F4.g() { // from class: G4.e
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return ExecutorsRegistrar.l(dVar);
            }
        }).c(), F4.c.d(A.a(E4.b.class, ScheduledExecutorService.class), A.a(E4.b.class, ExecutorService.class), A.a(E4.b.class, Executor.class)).e(new F4.g() { // from class: G4.f
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return ExecutorsRegistrar.m(dVar);
            }
        }).c(), F4.c.d(A.a(E4.c.class, ScheduledExecutorService.class), A.a(E4.c.class, ExecutorService.class), A.a(E4.c.class, Executor.class)).e(new F4.g() { // from class: G4.g
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return ExecutorsRegistrar.n(dVar);
            }
        }).c(), F4.c.c(A.a(E4.d.class, Executor.class)).e(new F4.g() { // from class: G4.h
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return ExecutorsRegistrar.o(dVar);
            }
        }).c());
    }
}
