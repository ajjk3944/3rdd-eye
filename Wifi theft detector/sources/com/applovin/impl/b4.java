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
public class b4 {

    /* renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue f5560a = new PriorityBlockingQueue();

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f5561b;

    public static class b extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final BlockingQueue f5562a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f5563b;

        private void a() {
            b((c) this.f5562a.take());
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

        private b(BlockingQueue blockingQueue, int i10, com.applovin.impl.sdk.k kVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f5562a = blockingQueue;
            this.f5563b = kVar;
            setPriority(((Integer) kVar.a(x4.S)).intValue());
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00f3 A[Catch: all -> 0x00ff, TRY_LEAVE, TryCatch #14 {all -> 0x00ff, blocks: (B:56:0x00db, B:58:0x00f3, B:83:0x013a), top: B:114:0x00db }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x016d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(final com.applovin.impl.b4.c r20) {
            /*
                Method dump skipped, instructions count: 430
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b4.b.b(com.applovin.impl.b4$c):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.f5570f.accept(dVar);
        }

        private HttpURLConnection a(c cVar) throws ProtocolException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.f5565a).openConnection();
            httpURLConnection.setRequestMethod(cVar.f5566b);
            httpURLConnection.setConnectTimeout(cVar.f5569e);
            httpURLConnection.setReadTimeout(cVar.f5569e);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.f5567c.isEmpty()) {
                for (Map.Entry entry : cVar.f5567c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }
    }

    public static class c implements Comparable {

        /* renamed from: i, reason: collision with root package name */
        private static final AtomicInteger f5564i = new AtomicInteger();

        /* renamed from: a, reason: collision with root package name */
        private final String f5565a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5566b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f5567c;

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f5568d;

        /* renamed from: e, reason: collision with root package name */
        private final int f5569e;

        /* renamed from: f, reason: collision with root package name */
        private final r0.b f5570f;

        /* renamed from: g, reason: collision with root package name */
        private final Executor f5571g;

        /* renamed from: h, reason: collision with root package name */
        private final int f5572h;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private String f5573a;

            /* renamed from: b, reason: collision with root package name */
            private String f5574b;

            /* renamed from: c, reason: collision with root package name */
            private Map f5575c = new HashMap();

            /* renamed from: d, reason: collision with root package name */
            private byte[] f5576d;

            /* renamed from: e, reason: collision with root package name */
            private int f5577e;

            /* renamed from: f, reason: collision with root package name */
            private r0.b f5578f;

            /* renamed from: g, reason: collision with root package name */
            private Executor f5579g;

            public a a(String str) {
                this.f5573a = str;
                return this;
            }

            public a b(String str) {
                this.f5574b = str;
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.f5575c = map;
                return this;
            }

            public a a(String str, String str2) {
                this.f5575c.put(str, str2);
                return this;
            }

            public a a(byte[] bArr) {
                this.f5576d = bArr;
                return this;
            }

            public a a(int i10) {
                this.f5577e = i10;
                return this;
            }

            public a a(r0.b bVar) {
                this.f5578f = bVar;
                return this;
            }

            public a a(Executor executor) {
                this.f5579g = executor;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.f5572h - cVar.f5572h;
        }

        private c(a aVar) {
            this.f5565a = aVar.f5573a;
            this.f5566b = aVar.f5574b;
            this.f5567c = aVar.f5575c != null ? aVar.f5575c : Collections.EMPTY_MAP;
            this.f5568d = aVar.f5576d;
            this.f5569e = aVar.f5577e;
            this.f5570f = aVar.f5578f;
            this.f5571g = aVar.f5579g;
            this.f5572h = f5564i.incrementAndGet();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f5580a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f5581b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f5582c;

        /* renamed from: d, reason: collision with root package name */
        private final long f5583d;

        /* renamed from: e, reason: collision with root package name */
        private final Throwable f5584e;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f5585a;

            /* renamed from: b, reason: collision with root package name */
            private byte[] f5586b;

            /* renamed from: c, reason: collision with root package name */
            private byte[] f5587c;

            /* renamed from: d, reason: collision with root package name */
            private long f5588d;

            /* renamed from: e, reason: collision with root package name */
            private Throwable f5589e;

            public a a(int i10) {
                this.f5585a = i10;
                return this;
            }

            public a b(byte[] bArr) {
                this.f5587c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.f5586b = bArr;
                return this;
            }

            public a a(Throwable th) {
                this.f5589e = th;
                return this;
            }

            public a a(long j10) {
                this.f5588d = j10;
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
            return this.f5580a;
        }

        public int c() throws Throwable {
            Throwable th = this.f5584e;
            if (th == null) {
                return this.f5580a;
            }
            throw th;
        }

        public byte[] d() throws Throwable {
            Throwable th = this.f5584e;
            if (th == null) {
                return this.f5581b;
            }
            throw th;
        }

        public long e() {
            return this.f5583d;
        }

        public byte[] f() {
            return this.f5582c;
        }

        private d(a aVar) {
            this.f5580a = aVar.f5585a;
            this.f5581b = aVar.f5586b;
            this.f5582c = aVar.f5587c;
            this.f5583d = aVar.f5588d;
            this.f5584e = aVar.f5589e;
        }
    }

    public b4(com.applovin.impl.sdk.k kVar) {
        this.f5561b = kVar;
    }

    public void a() {
        for (int i10 = 0; i10 < ((Integer) this.f5561b.a(x4.R)).intValue(); i10++) {
            new b(this.f5560a, i10, this.f5561b).start();
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.f5560a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
