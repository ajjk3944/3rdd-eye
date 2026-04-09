package com.yandex.mobile.ads.impl;

import N7.C1094a9;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class rk1<T, V> {

    /* renamed from: a, reason: collision with root package name */
    private final long f32676a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32677b;

    /* renamed from: c, reason: collision with root package name */
    private final i70 f32678c;

    /* renamed from: d, reason: collision with root package name */
    private final j70 f32679d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f32680e;

    public static final class a<T, V> implements h70 {

        /* renamed from: a, reason: collision with root package name */
        private final T f32681a;

        /* renamed from: b, reason: collision with root package name */
        private final V f32682b;

        /* renamed from: c, reason: collision with root package name */
        private final long f32683c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(qd0 qd0Var, Object obj, long j4) {
            this.f32681a = qd0Var;
            this.f32682b = obj;
            this.f32683c = j4;
        }

        @Override // com.yandex.mobile.ads.impl.h70
        public final long a() {
            return this.f32683c;
        }

        public final V b() {
            return this.f32682b;
        }

        public final T c() {
            return this.f32681a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.l.b(this.f32681a, aVar.f32681a) && kotlin.jvm.internal.l.b(this.f32682b, aVar.f32682b) && this.f32683c == aVar.f32683c;
        }

        public final int hashCode() {
            T t10 = this.f32681a;
            int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
            V v10 = this.f32682b;
            int iHashCode2 = (iHashCode + (v10 != null ? v10.hashCode() : 0)) * 31;
            long j4 = this.f32683c;
            return ((int) (j4 ^ (j4 >>> 32))) + iHashCode2;
        }

        public final String toString() {
            T t10 = this.f32681a;
            V v10 = this.f32682b;
            long j4 = this.f32683c;
            StringBuilder sb = new StringBuilder("CachedItem(params=");
            sb.append(t10);
            sb.append(", item=");
            sb.append(v10);
            sb.append(", expiresAtTimestampMillis=");
            return C1094a9.f(sb, j4, ")");
        }
    }

    public /* synthetic */ rk1() {
        this(com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS, 5, new i70(), new j70());
    }

    public final synchronized void a(qd0 qd0Var, Object obj) {
        a();
        if (this.f32680e.size() < this.f32677b) {
            ArrayList arrayList = this.f32680e;
            j70 j70Var = this.f32679d;
            long j4 = this.f32676a;
            j70Var.getClass();
            arrayList.add(new a(qd0Var, obj, System.currentTimeMillis() + j4));
        }
    }

    public final synchronized boolean b() {
        a();
        return this.f32680e.size() < this.f32677b;
    }

    public rk1(long j4, int i, i70 expirationChecker, j70 expirationTimestampUtil) {
        kotlin.jvm.internal.l.f(expirationChecker, "expirationChecker");
        kotlin.jvm.internal.l.f(expirationTimestampUtil, "expirationTimestampUtil");
        this.f32676a = j4;
        this.f32677b = i;
        this.f32678c = expirationChecker;
        this.f32679d = expirationTimestampUtil;
        this.f32680e = new ArrayList();
    }

    private final void a() {
        ArrayList arrayList = this.f32680e;
        i70 i70Var = this.f32678c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            h70 any = (h70) next;
            i70Var.getClass();
            kotlin.jvm.internal.l.f(any, "any");
            if (System.currentTimeMillis() > any.a()) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.f32680e.remove((a) it2.next());
        }
    }

    public final synchronized Object a(qd0 qd0Var) {
        Object obj;
        Object next;
        Object objB;
        try {
            a();
            Iterator it = this.f32680e.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.l.b(((a) next).c(), qd0Var)) {
                    break;
                }
            }
            a aVar = (a) next;
            if (aVar != null && (objB = aVar.b()) != null) {
                this.f32680e.remove(aVar);
                obj = objB;
            }
        } catch (Throwable th) {
            throw th;
        }
        return obj;
    }
}
