package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class gi2 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f27765a = Log.isLoggable("Volley", 2);

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final boolean f27766c = gi2.f27765a;

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f27767a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private boolean f27768b = false;

        /* renamed from: com.yandex.mobile.ads.impl.gi2$a$a, reason: collision with other inner class name */
        public static class C0404a {

            /* renamed from: a, reason: collision with root package name */
            public final String f27769a;

            /* renamed from: b, reason: collision with root package name */
            public final long f27770b;

            /* renamed from: c, reason: collision with root package name */
            public final long f27771c;

            public C0404a(String str, long j4, long j10) {
                this.f27769a = str;
                this.f27770b = j4;
                this.f27771c = j10;
            }
        }

        public final synchronized void a(String str, long j4) {
            if (this.f27768b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f27767a.add(new C0404a(str, j4, SystemClock.elapsedRealtime()));
        }

        public final void finalize() throws Throwable {
            if (this.f27768b) {
                return;
            }
            a("Request on the loose");
            fp0.b(new Object[0]);
        }

        public final synchronized void a(String str) {
            long j4;
            this.f27768b = true;
            if (this.f27767a.size() == 0) {
                j4 = 0;
            } else {
                long j10 = ((C0404a) this.f27767a.get(0)).f27771c;
                ArrayList arrayList = this.f27767a;
                j4 = ((C0404a) arrayList.get(arrayList.size() - 1)).f27771c - j10;
            }
            if (j4 <= 0) {
                return;
            }
            long j11 = ((C0404a) this.f27767a.get(0)).f27771c;
            fp0.a(Long.valueOf(j4), str);
            Iterator it = this.f27767a.iterator();
            while (it.hasNext()) {
                C0404a c0404a = (C0404a) it.next();
                long j12 = c0404a.f27771c;
                fp0.a(Long.valueOf(j12 - j11), Long.valueOf(c0404a.f27770b), c0404a.f27769a);
                j11 = j12;
            }
        }
    }
}
