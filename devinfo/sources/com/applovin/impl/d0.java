package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.e0;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class d0 extends c0 {

    /* renamed from: f, reason: collision with root package name */
    private final String f3851f;
    private final com.applovin.impl.sdk.ad.b g;

    /* renamed from: h, reason: collision with root package name */
    private final List f3852h;

    /* renamed from: i, reason: collision with root package name */
    private final c f3853i;
    private StringBuffer j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f3854k;

    /* renamed from: l, reason: collision with root package name */
    private final ExecutorService f3855l;

    /* renamed from: m, reason: collision with root package name */
    private final String f3856m;

    /* renamed from: n, reason: collision with root package name */
    private List f3857n;

    /* renamed from: o, reason: collision with root package name */
    private List f3858o;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3859a;

        public a(String str) {
            this.f3859a = str;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f3797a.a(x4.T0)).booleanValue()) {
                    synchronized (d0.this.f3854k) {
                        StringUtils.replaceAll(d0.this.j, this.f3859a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.j, this.f3859a, uri.toString());
                }
                d0.this.g.a(uri.toString(), this.f3859a);
                return;
            }
            com.applovin.impl.sdk.o oVar = d0.this.f3799c;
            if (com.applovin.impl.sdk.o.a()) {
                d0 d0Var = d0.this;
                a0.g.B(new StringBuilder("Failed to cache JavaScript resource "), this.f3859a, d0Var.f3799c, d0Var.f3798b);
            }
            if (d0.this.f3853i != null) {
                d0.this.f3853i.a(d0.this.f3851f, true);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b implements e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3861a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f3862b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3863c;

        public b(String str, String str2, String str3) {
            this.f3861a = str;
            this.f3862b = str2;
            this.f3863c = str3;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f3797a.a(x4.T0)).booleanValue()) {
                    synchronized (d0.this.f3854k) {
                        StringUtils.replaceAll(d0.this.j, this.f3861a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.j, this.f3861a, uri.toString());
                }
                d0.this.g.a(uri.toString(), this.f3861a);
                return;
            }
            if (!d0.this.g.Q().contains(this.f3862b + this.f3863c) || d0.this.f3853i == null) {
                return;
            }
            d0.this.f3853i.a(d0.this.f3851f, true);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface c {
        void a(String str, boolean z3);
    }

    public d0(String str, com.applovin.impl.sdk.ad.b bVar, List list, ExecutorService executorService, String str2, com.applovin.impl.sdk.k kVar, c cVar) {
        super("AsyncTaskCacheHTMLResources", kVar);
        this.f3851f = str;
        this.g = bVar;
        this.f3852h = list;
        this.f3855l = executorService;
        this.f3856m = str2;
        this.f3853i = cVar;
        this.j = new StringBuffer(str);
        this.f3854k = new Object();
    }

    private Collection f() {
        HashSet hashSet = new HashSet();
        for (char c9 : ((String) this.f3797a.a(x4.D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c9));
        }
        hashSet.add('\"');
        return hashSet;
    }

    private void a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f3855l.submit((e0) it.next()));
        }
        this.f3858o = arrayList;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            try {
                ((Future) obj).get();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0017, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.HashSet d() {
        /*
            r18 = this;
            r0 = r18
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            com.applovin.impl.sdk.ad.b r2 = r0.g
            java.util.List r2 = r2.H()
            java.util.Collection r3 = r0.f()
            java.util.List r4 = r0.f3852h
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lbf
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            r7 = r6
        L25:
            java.lang.String r8 = r0.f3851f
            int r8 = r8.length()
            if (r6 >= r8) goto L17
            java.util.concurrent.atomic.AtomicBoolean r6 = r0.f3801e
            boolean r6 = r6.get()
            r8 = 0
            if (r6 == 0) goto L37
            return r8
        L37:
            java.lang.String r6 = r0.f3851f
            int r6 = r6.indexOf(r5, r7)
            r7 = -1
            if (r6 != r7) goto L41
            goto L17
        L41:
            java.lang.String r7 = r0.f3851f
            int r7 = r7.length()
            r9 = r6
        L48:
            java.lang.String r10 = r0.f3851f
            char r10 = r10.charAt(r9)
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            boolean r10 = r3.contains(r10)
            if (r10 != 0) goto L5d
            if (r9 >= r7) goto L5d
            int r9 = r9 + 1
            goto L48
        L5d:
            if (r9 <= r6) goto Laf
            if (r9 == r7) goto Laf
            java.lang.String r7 = r0.f3851f
            int r8 = r5.length()
            int r8 = r8 + r6
            java.lang.String r7 = r7.substring(r8, r9)
            java.lang.String r11 = d.h.s(r5, r7)
            boolean r8 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r7)
            if (r8 == 0) goto L9d
            boolean r8 = r2.contains(r11)
            if (r8 != 0) goto L9d
            com.applovin.impl.e0 r10 = new com.applovin.impl.e0
            com.applovin.impl.sdk.ad.b r12 = r0.g
            java.lang.String[] r8 = new java.lang.String[]{r5}
            java.util.List r13 = java.util.Arrays.asList(r8)
            java.lang.String r15 = r0.f3856m
            com.applovin.impl.sdk.k r8 = r0.f3797a
            com.applovin.impl.d0$b r14 = new com.applovin.impl.d0$b
            r14.<init>(r11, r5, r7)
            r17 = r14
            r14 = 1
            r16 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r1.add(r10)
            goto Lac
        L9d:
            boolean r8 = com.applovin.impl.sdk.o.a()
            if (r8 == 0) goto Lac
            com.applovin.impl.sdk.o r8 = r0.f3799c
            java.lang.String r10 = r0.f3798b
            java.lang.String r11 = "Skip caching of optional or non-resource "
            a0.g.x(r11, r7, r8, r10)
        Lac:
            r7 = r9
            goto L25
        Laf:
            boolean r1 = com.applovin.impl.sdk.o.a()
            if (r1 == 0) goto Lbe
            com.applovin.impl.sdk.o r1 = r0.f3799c
            java.lang.String r2 = r0.f3798b
            java.lang.String r3 = "Unable to cache resource; ad HTML is invalid."
            r1.b(r2, r3)
        Lbe:
            return r8
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d0.d():java.util.HashSet");
    }

    private HashSet e() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f3851f, (String) this.f3797a.a(x4.f6050h5)), 1)) {
            if (this.f3801e.get()) {
                return null;
            }
            if (StringUtils.isValidString(str)) {
                hashSet.add(new e0(str, this.g, Collections.EMPTY_LIST, false, this.f3856m, this.f3797a, new a(str)));
            } else if (com.applovin.impl.sdk.o.a()) {
                a0.g.x("Skip caching of non-resource ", str, this.f3799c, this.f3798b);
            }
        }
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() throws InterruptedException {
        HashSet hashSetE;
        if (this.f3801e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f3851f)) {
            a(this.f3851f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.f3797a.a(x4.E0)).booleanValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f3799c.a(this.f3798b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f3851f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSetD = d();
        if (hashSetD != null) {
            hashSet.addAll(hashSetD);
        }
        if (((Boolean) this.f3797a.a(x4.g5)).booleanValue() && (hashSetE = e()) != null) {
            hashSet.addAll(hashSetE);
        }
        this.f3857n = new ArrayList(hashSet);
        if (this.f3801e.get()) {
            return Boolean.FALSE;
        }
        List list = this.f3857n;
        if (list == null || list.isEmpty()) {
            a(this.f3851f);
            return Boolean.FALSE;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f3799c.a(this.f3798b, "Executing " + this.f3857n.size() + " caching operations...");
        }
        if (this.f3797a.q0().e()) {
            a(this.f3857n);
        } else {
            this.f3855l.invokeAll(this.f3857n);
        }
        if (((Boolean) this.f3797a.a(x4.T0)).booleanValue()) {
            synchronized (this.f3854k) {
                a(this.j.toString());
            }
        } else {
            a(this.j.toString());
        }
        return Boolean.TRUE;
    }

    public void c() {
        List list = this.f3857n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e0) it.next()).a(true);
            }
        }
        List<Future> list2 = this.f3858o;
        if (list2 != null) {
            for (Future future : list2) {
                if (!future.isDone()) {
                    future.cancel(true);
                }
            }
        }
    }

    private void a(String str) {
        c cVar;
        if (this.f3801e.get() || (cVar = this.f3853i) == null) {
            return;
        }
        cVar.a(str, false);
    }
}
