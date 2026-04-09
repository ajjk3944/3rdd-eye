package com.applovin.impl;

import android.os.Process;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class b4 {

    /* renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue f3735a = new PriorityBlockingQueue();

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f3736b;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class b extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final BlockingQueue f3737a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f3738b;

        private void a() {
            b((c) this.f3737a.take());
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        private b(BlockingQueue blockingQueue, int i4, com.applovin.impl.sdk.k kVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f3737a = blockingQueue;
            this.f3738b = kVar;
            setPriority(((Integer) kVar.a(x4.S)).intValue());
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00f3 A[Catch: all -> 0x00ff, TRY_LEAVE, TryCatch #14 {all -> 0x00ff, blocks: (B:56:0x00db, B:58:0x00f3, B:83:0x013a), top: B:114:0x00db }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x016d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(com.applovin.impl.b4.c r20) {
            /*
                Method dump skipped, instructions count: 431
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b4.b.b(com.applovin.impl.b4$c):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.f3745f.accept(dVar);
        }

        private HttpURLConnection a(c cVar) throws ProtocolException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.f3740a).openConnection();
            httpURLConnection.setRequestMethod(cVar.f3741b);
            httpURLConnection.setConnectTimeout(cVar.f3744e);
            httpURLConnection.setReadTimeout(cVar.f3744e);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.f3742c.isEmpty()) {
                for (Map.Entry entry : cVar.f3742c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class c implements Comparable {

        /* renamed from: i, reason: collision with root package name */
        private static final AtomicInteger f3739i = new AtomicInteger();

        /* renamed from: a, reason: collision with root package name */
        private final String f3740a;

        /* renamed from: b, reason: collision with root package name */
        private final String f3741b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f3742c;

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f3743d;

        /* renamed from: e, reason: collision with root package name */
        private final int f3744e;

        /* renamed from: f, reason: collision with root package name */
        private final d4.a f3745f;
        private final Executor g;

        /* renamed from: h, reason: collision with root package name */
        private final int f3746h;

        /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private String f3747a;

            /* renamed from: b, reason: collision with root package name */
            private String f3748b;

            /* renamed from: c, reason: collision with root package name */
            private Map f3749c = new HashMap();

            /* renamed from: d, reason: collision with root package name */
            private byte[] f3750d;

            /* renamed from: e, reason: collision with root package name */
            private int f3751e;

            /* renamed from: f, reason: collision with root package name */
            private d4.a f3752f;
            private Executor g;

            public a a(String str) {
                this.f3747a = str;
                return this;
            }

            public a b(String str) {
                this.f3748b = str;
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.f3749c = map;
                return this;
            }

            public a a(String str, String str2) {
                this.f3749c.put(str, str2);
                return this;
            }

            public a a(byte[] bArr) {
                this.f3750d = bArr;
                return this;
            }

            public a a(int i4) {
                this.f3751e = i4;
                return this;
            }

            public a a(d4.a aVar) {
                this.f3752f = aVar;
                return this;
            }

            public a a(Executor executor) {
                this.g = executor;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.f3746h - cVar.f3746h;
        }

        private c(a aVar) {
            this.f3740a = aVar.f3747a;
            this.f3741b = aVar.f3748b;
            this.f3742c = aVar.f3749c != null ? aVar.f3749c : Collections.EMPTY_MAP;
            this.f3743d = aVar.f3750d;
            this.f3744e = aVar.f3751e;
            this.f3745f = aVar.f3752f;
            this.g = aVar.g;
            this.f3746h = f3739i.incrementAndGet();
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f3753a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f3754b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f3755c;

        /* renamed from: d, reason: collision with root package name */
        private final long f3756d;

        /* renamed from: e, reason: collision with root package name */
        private final Throwable f3757e;

        /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f3758a;

            /* renamed from: b, reason: collision with root package name */
            private byte[] f3759b;

            /* renamed from: c, reason: collision with root package name */
            private byte[] f3760c;

            /* renamed from: d, reason: collision with root package name */
            private long f3761d;

            /* renamed from: e, reason: collision with root package name */
            private Throwable f3762e;

            public a a(int i4) {
                this.f3758a = i4;
                return this;
            }

            public a b(byte[] bArr) {
                this.f3760c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.f3759b = bArr;
                return this;
            }

            public a a(Throwable th2) {
                this.f3762e = th2;
                return this;
            }

            public a a(long j) {
                this.f3761d = j;
                return this;
            }

            public d a() {
                return new d(this);
            }
        }

        public static a a() {
            return new a();
        }

        public int b() {
            return this.f3753a;
        }

        public int c() throws Throwable {
            Throwable th2 = this.f3757e;
            if (th2 == null) {
                return this.f3753a;
            }
            throw th2;
        }

        public byte[] d() throws Throwable {
            Throwable th2 = this.f3757e;
            if (th2 == null) {
                return this.f3754b;
            }
            throw th2;
        }

        public long e() {
            return this.f3756d;
        }

        public byte[] f() {
            return this.f3755c;
        }

        private d(a aVar) {
            this.f3753a = aVar.f3758a;
            this.f3754b = aVar.f3759b;
            this.f3755c = aVar.f3760c;
            this.f3756d = aVar.f3761d;
            this.f3757e = aVar.f3762e;
        }
    }

    public b4(com.applovin.impl.sdk.k kVar) {
        this.f3736b = kVar;
    }

    public void a() {
        for (int i4 = 0; i4 < ((Integer) this.f3736b.a(x4.R)).intValue(); i4++) {
            new b(this.f3735a, i4, this.f3736b).start();
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.f3735a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
