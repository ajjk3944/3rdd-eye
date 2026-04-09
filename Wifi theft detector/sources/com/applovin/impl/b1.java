package com.applovin.impl;

import android.os.Handler;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f5553a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f5554b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f5555c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f5556d = new AtomicInteger();

    public interface b {
        void a();

        boolean b();
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f5557a;

        /* renamed from: b, reason: collision with root package name */
        private final b f5558b;

        /* renamed from: c, reason: collision with root package name */
        private final long f5559c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            String str = this.f5557a;
            String str2 = ((c) obj).f5557a;
            return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
        }

        public int hashCode() {
            String str = this.f5557a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f5557a + "', countdownStepMillis=" + this.f5559c + '}';
        }

        private c(String str, long j10, b bVar) {
            this.f5557a = str;
            this.f5559c = j10;
            this.f5558b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b a() {
            return this.f5558b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f5559c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c() {
            return this.f5557a;
        }
    }

    public b1(Handler handler, com.applovin.impl.sdk.k kVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f5554b = handler;
        this.f5553a = kVar.O();
    }

    public void b() {
        HashSet<c> hashSet = new HashSet(this.f5555c);
        if (com.applovin.impl.sdk.o.a()) {
            this.f5553a.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int iIncrementAndGet = this.f5556d.incrementAndGet();
        for (c cVar : hashSet) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5553a.a("CountdownManager", "Starting countdown: " + cVar.c() + " for generation " + iIncrementAndGet + "...");
            }
            a(cVar, iIncrementAndGet);
        }
    }

    public void c() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5553a.a("CountdownManager", "Stopping countdowns...");
        }
        this.f5556d.incrementAndGet();
        this.f5554b.removeCallbacksAndMessages(null);
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5553a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f5555c.clear();
    }

    public void a(String str, long j10, b bVar) {
        if (j10 > 0) {
            if (this.f5554b != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f5553a.a("CountdownManager", "Adding countdown: " + str);
                }
                this.f5555c.add(new c(str, j10, bVar));
                return;
            }
            throw new IllegalArgumentException("No handler specified.");
        }
        throw new IllegalArgumentException("Invalid step specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c cVar, int i10) {
        b bVarA = cVar.a();
        if (bVarA.b()) {
            if (this.f5556d.get() == i10) {
                try {
                    bVarA.a();
                    a(cVar, i10);
                    return;
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f5553a.a("CountdownManager", "Encountered error on countdown step for: " + cVar.c(), th);
                    }
                    a();
                    return;
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f5553a.k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.c());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f5553a.a("CountdownManager", "Ending countdown for " + cVar.c());
        }
    }

    private void a(final c cVar, final int i10) {
        this.f5554b.postDelayed(new Runnable() { // from class: com.applovin.impl.e9
            @Override // java.lang.Runnable
            public final void run() {
                this.f5956a.b(cVar, i10);
            }
        }, cVar.b());
    }
}
