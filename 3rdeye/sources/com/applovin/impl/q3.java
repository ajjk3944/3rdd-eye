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

/* loaded from: classes.dex */
public class q3 {

    /* renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue f20762a = new PriorityBlockingQueue();

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f20763b;

    public static class b extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final BlockingQueue f20764a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f20765b;

        private void a() {
            b((c) this.f20764a.take());
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

        private b(BlockingQueue blockingQueue, int i, com.applovin.impl.sdk.k kVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f20764a = blockingQueue;
            this.f20765b = kVar;
            setPriority(((Integer) kVar.a(l4.f19812Q)).intValue());
        }

        /* JADX WARN: Removed duplicated region for block: B:59:0x00d1 A[Catch: all -> 0x00dd, TRY_LEAVE, TryCatch #12 {all -> 0x00dd, blocks: (B:57:0x00b9, B:59:0x00d1, B:80:0x0108, B:64:0x00e2, B:67:0x00ee, B:79:0x0107, B:78:0x0104, B:75:0x00ff, B:65:0x00e6), top: B:108:0x00b9, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(com.applovin.impl.q3.c r17) {
            /*
                Method dump skipped, instructions count: 349
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.q3.b.b(com.applovin.impl.q3$c):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.f20771f.accept(dVar);
        }

        private HttpURLConnection a(c cVar) throws ProtocolException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.f20766a).openConnection();
            httpURLConnection.setRequestMethod(cVar.f20767b);
            httpURLConnection.setConnectTimeout(cVar.f20770e);
            httpURLConnection.setReadTimeout(cVar.f20770e);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.f20768c.isEmpty()) {
                for (Map.Entry entry : cVar.f20768c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }
    }

    public static class c implements Comparable {
        private static final AtomicInteger i = new AtomicInteger();

        /* renamed from: a, reason: collision with root package name */
        private final String f20766a;

        /* renamed from: b, reason: collision with root package name */
        private final String f20767b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f20768c;

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f20769d;

        /* renamed from: e, reason: collision with root package name */
        private final int f20770e;

        /* renamed from: f, reason: collision with root package name */
        private final K0.b f20771f;

        /* renamed from: g, reason: collision with root package name */
        private final Executor f20772g;

        /* renamed from: h, reason: collision with root package name */
        private final int f20773h;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private String f20774a;

            /* renamed from: b, reason: collision with root package name */
            private String f20775b;

            /* renamed from: c, reason: collision with root package name */
            private Map f20776c = new HashMap();

            /* renamed from: d, reason: collision with root package name */
            private byte[] f20777d;

            /* renamed from: e, reason: collision with root package name */
            private int f20778e;

            /* renamed from: f, reason: collision with root package name */
            private K0.b f20779f;

            /* renamed from: g, reason: collision with root package name */
            private Executor f20780g;

            public a a(String str) {
                this.f20774a = str;
                return this;
            }

            public a b(String str) {
                this.f20775b = str;
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.f20776c = map;
                return this;
            }

            public a a(String str, String str2) {
                this.f20776c.put(str, str2);
                return this;
            }

            public a a(byte[] bArr) {
                this.f20777d = bArr;
                return this;
            }

            public a a(int i) {
                this.f20778e = i;
                return this;
            }

            public a a(K0.b bVar) {
                this.f20779f = bVar;
                return this;
            }

            public a a(Executor executor) {
                this.f20780g = executor;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.f20773h - cVar.f20773h;
        }

        private c(a aVar) {
            this.f20766a = aVar.f20774a;
            this.f20767b = aVar.f20775b;
            this.f20768c = aVar.f20776c != null ? aVar.f20776c : Collections.EMPTY_MAP;
            this.f20769d = aVar.f20777d;
            this.f20770e = aVar.f20778e;
            this.f20771f = aVar.f20779f;
            this.f20772g = aVar.f20780g;
            this.f20773h = i.incrementAndGet();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f20781a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f20782b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f20783c;

        /* renamed from: d, reason: collision with root package name */
        private final long f20784d;

        /* renamed from: e, reason: collision with root package name */
        private final Throwable f20785e;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f20786a;

            /* renamed from: b, reason: collision with root package name */
            private byte[] f20787b;

            /* renamed from: c, reason: collision with root package name */
            private byte[] f20788c;

            /* renamed from: d, reason: collision with root package name */
            private long f20789d;

            /* renamed from: e, reason: collision with root package name */
            private Throwable f20790e;

            public a a(int i) {
                this.f20786a = i;
                return this;
            }

            public a b(byte[] bArr) {
                this.f20788c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.f20787b = bArr;
                return this;
            }

            public a a(Throwable th) {
                this.f20790e = th;
                return this;
            }

            public a a(long j4) {
                this.f20789d = j4;
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
            return this.f20781a;
        }

        public int c() throws Throwable {
            Throwable th = this.f20785e;
            if (th == null) {
                return this.f20781a;
            }
            throw th;
        }

        public byte[] d() throws Throwable {
            Throwable th = this.f20785e;
            if (th == null) {
                return this.f20782b;
            }
            throw th;
        }

        public long e() {
            return this.f20784d;
        }

        public byte[] f() {
            return this.f20783c;
        }

        private d(a aVar) {
            this.f20781a = aVar.f20786a;
            this.f20782b = aVar.f20787b;
            this.f20783c = aVar.f20788c;
            this.f20784d = aVar.f20789d;
            this.f20785e = aVar.f20790e;
        }
    }

    public q3(com.applovin.impl.sdk.k kVar) {
        this.f20763b = kVar;
    }

    public void a() {
        for (int i = 0; i < ((Integer) this.f20763b.a(l4.f19805P)).intValue(); i++) {
            new b(this.f20762a, i, this.f20763b).start();
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.f20762a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
