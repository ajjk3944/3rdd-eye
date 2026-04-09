package com.applovin.impl;

import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f3728a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f3729b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f3730c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f3731d = new AtomicInteger();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface b {
        void a();

        boolean b();
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f3732a;

        /* renamed from: b, reason: collision with root package name */
        private final b f3733b;

        /* renamed from: c, reason: collision with root package name */
        private final long f3734c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            String str = this.f3732a;
            String str2 = ((c) obj).f3732a;
            return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
        }

        public int hashCode() {
            String str = this.f3732a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f3732a + "', countdownStepMillis=" + this.f3734c + '}';
        }

        private c(String str, long j, b bVar) {
            this.f3732a = str;
            this.f3734c = j;
            this.f3733b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b a() {
            return this.f3733b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f3734c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c() {
            return this.f3732a;
        }
    }

    public b1(Handler handler, com.applovin.impl.sdk.k kVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f3729b = handler;
        this.f3728a = kVar.O();
    }

    public void b() {
        HashSet hashSet = new HashSet(this.f3730c);
        if (com.applovin.impl.sdk.o.a()) {
            this.f3728a.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int iIncrementAndGet = this.f3731d.incrementAndGet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (com.applovin.impl.sdk.o.a()) {
                this.f3728a.a("CountdownManager", "Starting countdown: " + cVar.c() + " for generation " + iIncrementAndGet + "...");
            }
            a(cVar, iIncrementAndGet);
        }
    }

    public void c() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f3728a.a("CountdownManager", "Stopping countdowns...");
        }
        this.f3731d.incrementAndGet();
        this.f3729b.removeCallbacksAndMessages(null);
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f3728a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f3730c.clear();
    }

    public void a(String str, long j, b bVar) {
        if (j > 0) {
            if (this.f3729b != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    a0.g.x("Adding countdown: ", str, this.f3728a, "CountdownManager");
                }
                this.f3730c.add(new c(str, j, bVar));
                return;
            }
            throw new IllegalArgumentException("No handler specified.");
        }
        throw new IllegalArgumentException("Invalid step specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c cVar, int i4) {
        b bVarA = cVar.a();
        if (bVarA.b()) {
            if (this.f3731d.get() == i4) {
                try {
                    bVarA.a();
                    a(cVar, i4);
                    return;
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f3728a.a("CountdownManager", "Encountered error on countdown step for: " + cVar.c(), th2);
                    }
                    a();
                    return;
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f3728a.k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.c());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            a0.g.B(new StringBuilder("Ending countdown for "), cVar.c(), this.f3728a, "CountdownManager");
        }
    }

    private void a(c cVar, int i4) {
        this.f3729b.postDelayed(new u8(this, cVar, i4, 0), cVar.b());
    }
}
