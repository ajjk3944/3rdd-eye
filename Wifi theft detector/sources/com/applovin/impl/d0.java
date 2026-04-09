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

/* loaded from: classes.dex */
public class d0 extends c0 {

    /* renamed from: f, reason: collision with root package name */
    private final String f5692f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f5693g;

    /* renamed from: h, reason: collision with root package name */
    private final List f5694h;

    /* renamed from: i, reason: collision with root package name */
    private final c f5695i;

    /* renamed from: j, reason: collision with root package name */
    private StringBuffer f5696j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f5697k;

    /* renamed from: l, reason: collision with root package name */
    private final ExecutorService f5698l;

    /* renamed from: m, reason: collision with root package name */
    private final String f5699m;

    /* renamed from: n, reason: collision with root package name */
    private List f5700n;

    /* renamed from: o, reason: collision with root package name */
    private List f5701o;

    public class a implements e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5702a;

        public a(String str) {
            this.f5702a = str;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f5631a.a(x4.T0)).booleanValue()) {
                    synchronized (d0.this.f5697k) {
                        StringUtils.replaceAll(d0.this.f5696j, this.f5702a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.f5696j, this.f5702a, uri.toString());
                }
                d0.this.f5693g.a(uri.toString(), this.f5702a);
                return;
            }
            com.applovin.impl.sdk.o oVar = d0.this.f5633c;
            if (com.applovin.impl.sdk.o.a()) {
                d0 d0Var = d0.this;
                d0Var.f5633c.a(d0Var.f5632b, "Failed to cache JavaScript resource " + this.f5702a);
            }
            if (d0.this.f5695i != null) {
                d0.this.f5695i.a(d0.this.f5692f, true);
            }
        }
    }

    public class b implements e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5704a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f5705b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f5706c;

        public b(String str, String str2, String str3) {
            this.f5704a = str;
            this.f5705b = str2;
            this.f5706c = str3;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f5631a.a(x4.T0)).booleanValue()) {
                    synchronized (d0.this.f5697k) {
                        StringUtils.replaceAll(d0.this.f5696j, this.f5704a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.f5696j, this.f5704a, uri.toString());
                }
                d0.this.f5693g.a(uri.toString(), this.f5704a);
                return;
            }
            if (!d0.this.f5693g.Q().contains(this.f5705b + this.f5706c) || d0.this.f5695i == null) {
                return;
            }
            d0.this.f5695i.a(d0.this.f5692f, true);
        }
    }

    public interface c {
        void a(String str, boolean z10);
    }

    public d0(String str, com.applovin.impl.sdk.ad.b bVar, List list, ExecutorService executorService, String str2, com.applovin.impl.sdk.k kVar, c cVar) {
        super("AsyncTaskCacheHTMLResources", kVar);
        this.f5692f = str;
        this.f5693g = bVar;
        this.f5694h = list;
        this.f5698l = executorService;
        this.f5699m = str2;
        this.f5695i = cVar;
        this.f5696j = new StringBuffer(str);
        this.f5697k = new Object();
    }

    private Collection f() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f5631a.a(x4.D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    private void a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f5698l.submit((e0) it.next()));
        }
        this.f5701o = arrayList;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
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
            com.applovin.impl.sdk.ad.b r2 = r0.f5693g
            java.util.List r2 = r2.H()
            java.util.Collection r3 = r0.f()
            java.util.List r4 = r0.f5694h
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Ld9
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            r7 = r6
        L25:
            java.lang.String r8 = r0.f5692f
            int r8 = r8.length()
            if (r6 >= r8) goto L17
            java.util.concurrent.atomic.AtomicBoolean r6 = r0.f5635e
            boolean r6 = r6.get()
            r8 = 0
            if (r6 == 0) goto L37
            return r8
        L37:
            java.lang.String r6 = r0.f5692f
            int r6 = r6.indexOf(r5, r7)
            r7 = -1
            if (r6 != r7) goto L41
            goto L17
        L41:
            java.lang.String r7 = r0.f5692f
            int r7 = r7.length()
            r9 = r6
        L48:
            java.lang.String r10 = r0.f5692f
            char r10 = r10.charAt(r9)
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            boolean r10 = r3.contains(r10)
            if (r10 != 0) goto L5d
            if (r9 >= r7) goto L5d
            int r9 = r9 + 1
            goto L48
        L5d:
            if (r9 <= r6) goto Lc9
            if (r9 == r7) goto Lc9
            java.lang.String r7 = r0.f5692f
            int r8 = r5.length()
            int r8 = r8 + r6
            java.lang.String r7 = r7.substring(r8, r9)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r7)
            java.lang.String r11 = r8.toString()
            boolean r8 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r7)
            if (r8 == 0) goto La8
            boolean r8 = r2.contains(r11)
            if (r8 != 0) goto La8
            com.applovin.impl.e0 r10 = new com.applovin.impl.e0
            com.applovin.impl.sdk.ad.b r12 = r0.f5693g
            java.lang.String[] r8 = new java.lang.String[]{r5}
            java.util.List r13 = java.util.Arrays.asList(r8)
            java.lang.String r15 = r0.f5699m
            com.applovin.impl.sdk.k r8 = r0.f5631a
            com.applovin.impl.d0$b r14 = new com.applovin.impl.d0$b
            r14.<init>(r11, r5, r7)
            r17 = r14
            r14 = 1
            r16 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r1.add(r10)
            goto Lc6
        La8:
            boolean r8 = com.applovin.impl.sdk.o.a()
            if (r8 == 0) goto Lc6
            com.applovin.impl.sdk.o r8 = r0.f5633c
            java.lang.String r10 = r0.f5632b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Skip caching of optional or non-resource "
            r11.append(r12)
            r11.append(r7)
            java.lang.String r7 = r11.toString()
            r8.a(r10, r7)
        Lc6:
            r7 = r9
            goto L25
        Lc9:
            boolean r1 = com.applovin.impl.sdk.o.a()
            if (r1 == 0) goto Ld8
            com.applovin.impl.sdk.o r1 = r0.f5633c
            java.lang.String r2 = r0.f5632b
            java.lang.String r3 = "Unable to cache resource; ad HTML is invalid."
            r1.b(r2, r3)
        Ld8:
            return r8
        Ld9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d0.d():java.util.HashSet");
    }

    private HashSet e() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f5692f, (String) this.f5631a.a(x4.f8483h5)), 1)) {
            if (this.f5635e.get()) {
                return null;
            }
            if (StringUtils.isValidString(str)) {
                hashSet.add(new e0(str, this.f5693g, Collections.EMPTY_LIST, false, this.f5699m, this.f5631a, new a(str)));
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f5633c.a(this.f5632b, "Skip caching of non-resource " + str);
            }
        }
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() throws InterruptedException {
        HashSet hashSetE;
        if (this.f5635e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f5692f)) {
            a(this.f5692f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.f5631a.a(x4.E0)).booleanValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5633c.a(this.f5632b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f5692f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSetD = d();
        if (hashSetD != null) {
            hashSet.addAll(hashSetD);
        }
        if (((Boolean) this.f5631a.a(x4.f8474g5)).booleanValue() && (hashSetE = e()) != null) {
            hashSet.addAll(hashSetE);
        }
        this.f5700n = new ArrayList(hashSet);
        if (this.f5635e.get()) {
            return Boolean.FALSE;
        }
        List list = this.f5700n;
        if (list == null || list.isEmpty()) {
            a(this.f5692f);
            return Boolean.FALSE;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f5633c.a(this.f5632b, "Executing " + this.f5700n.size() + " caching operations...");
        }
        if (this.f5631a.q0().e()) {
            a(this.f5700n);
        } else {
            this.f5698l.invokeAll(this.f5700n);
        }
        if (((Boolean) this.f5631a.a(x4.T0)).booleanValue()) {
            synchronized (this.f5697k) {
                a(this.f5696j.toString());
            }
        } else {
            a(this.f5696j.toString());
        }
        return Boolean.TRUE;
    }

    public void c() {
        List list = this.f5700n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e0) it.next()).a(true);
            }
        }
        List<Future> list2 = this.f5701o;
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
        if (this.f5635e.get() || (cVar = this.f5695i) == null) {
            return;
        }
        cVar.a(str, false);
    }
}
