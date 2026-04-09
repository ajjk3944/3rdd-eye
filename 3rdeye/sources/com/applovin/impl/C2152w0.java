package com.applovin.impl;

import N7.C1154e9;
import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.applovin.impl.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2152w0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f21677a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f21678b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f21679c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f21680d = new AtomicInteger();

    /* renamed from: com.applovin.impl.w0$b */
    public interface b {
        void a();

        boolean b();
    }

    /* renamed from: com.applovin.impl.w0$c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f21681a;

        /* renamed from: b, reason: collision with root package name */
        private final b f21682b;

        /* renamed from: c, reason: collision with root package name */
        private final long f21683c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            String str = this.f21681a;
            String str2 = ((c) obj).f21681a;
            return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
        }

        public int hashCode() {
            String str = this.f21681a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CountdownProxy{identifier='");
            sb.append(this.f21681a);
            sb.append("', countdownStepMillis=");
            return androidx.work.s.f(sb, this.f21683c, '}');
        }

        private c(String str, long j4, b bVar) {
            this.f21681a = str;
            this.f21683c = j4;
            this.f21682b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b a() {
            return this.f21682b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f21683c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c() {
            return this.f21681a;
        }
    }

    public C2152w0(Handler handler, com.applovin.impl.sdk.k kVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f21678b = handler;
        this.f21677a = kVar.O();
    }

    public void b() {
        HashSet hashSet = new HashSet(this.f21679c);
        if (com.applovin.impl.sdk.o.a()) {
            this.f21677a.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int iIncrementAndGet = this.f21680d.incrementAndGet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21677a.a("CountdownManager", "Starting countdown: " + cVar.c() + " for generation " + iIncrementAndGet + "...");
            }
            a(cVar, iIncrementAndGet);
        }
    }

    public void c() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21677a.a("CountdownManager", "Stopping countdowns...");
        }
        this.f21680d.incrementAndGet();
        this.f21678b.removeCallbacksAndMessages(null);
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21677a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f21679c.clear();
    }

    public void a(String str, long j4, b bVar) {
        if (j4 > 0) {
            if (this.f21678b != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    C1154e9.m("Adding countdown: ", str, this.f21677a, "CountdownManager");
                }
                this.f21679c.add(new c(str, j4, bVar));
                return;
            }
            throw new IllegalArgumentException("No handler specified.");
        }
        throw new IllegalArgumentException("Invalid step specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c cVar, int i) {
        b bVarA = cVar.a();
        if (bVarA.b()) {
            if (this.f21680d.get() == i) {
                try {
                    bVarA.a();
                    a(cVar, i);
                    return;
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21677a.a("CountdownManager", "Encountered error on countdown step for: " + cVar.c(), th);
                    }
                    a();
                    return;
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f21677a.k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.c());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21677a.a("CountdownManager", "Ending countdown for " + cVar.c());
        }
    }

    private void a(final c cVar, final int i) {
        this.f21678b.postDelayed(new Runnable() { // from class: com.applovin.impl.T0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18867b.b(cVar, i);
            }
        }, cVar.b());
    }
}
