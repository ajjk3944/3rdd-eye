package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.yandex.mobile.ads.impl.xj0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes3.dex */
public class r52 implements em {

    /* renamed from: B, reason: collision with root package name */
    public static final r52 f32483B = new r52(new a());

    /* renamed from: A, reason: collision with root package name */
    public final zj0<Integer> f32484A;

    /* renamed from: b, reason: collision with root package name */
    public final int f32485b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32486c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32487d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32488e;

    /* renamed from: f, reason: collision with root package name */
    public final int f32489f;

    /* renamed from: g, reason: collision with root package name */
    public final int f32490g;

    /* renamed from: h, reason: collision with root package name */
    public final int f32491h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f32492j;

    /* renamed from: k, reason: collision with root package name */
    public final int f32493k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f32494l;

    /* renamed from: m, reason: collision with root package name */
    public final xj0<String> f32495m;

    /* renamed from: n, reason: collision with root package name */
    public final int f32496n;

    /* renamed from: o, reason: collision with root package name */
    public final xj0<String> f32497o;

    /* renamed from: p, reason: collision with root package name */
    public final int f32498p;

    /* renamed from: q, reason: collision with root package name */
    public final int f32499q;

    /* renamed from: r, reason: collision with root package name */
    public final int f32500r;

    /* renamed from: s, reason: collision with root package name */
    public final xj0<String> f32501s;

    /* renamed from: t, reason: collision with root package name */
    public final xj0<String> f32502t;

    /* renamed from: u, reason: collision with root package name */
    public final int f32503u;

    /* renamed from: v, reason: collision with root package name */
    public final int f32504v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f32505w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f32506x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f32507y;

    /* renamed from: z, reason: collision with root package name */
    public final yj0<l52, q52> f32508z;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f32509a;

        /* renamed from: b, reason: collision with root package name */
        private int f32510b;

        /* renamed from: c, reason: collision with root package name */
        private int f32511c;

        /* renamed from: d, reason: collision with root package name */
        private int f32512d;

        /* renamed from: e, reason: collision with root package name */
        private int f32513e;

        /* renamed from: f, reason: collision with root package name */
        private int f32514f;

        /* renamed from: g, reason: collision with root package name */
        private int f32515g;

        /* renamed from: h, reason: collision with root package name */
        private int f32516h;
        private int i;

        /* renamed from: j, reason: collision with root package name */
        private int f32517j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f32518k;

        /* renamed from: l, reason: collision with root package name */
        private xj0<String> f32519l;

        /* renamed from: m, reason: collision with root package name */
        private int f32520m;

        /* renamed from: n, reason: collision with root package name */
        private xj0<String> f32521n;

        /* renamed from: o, reason: collision with root package name */
        private int f32522o;

        /* renamed from: p, reason: collision with root package name */
        private int f32523p;

        /* renamed from: q, reason: collision with root package name */
        private int f32524q;

        /* renamed from: r, reason: collision with root package name */
        private xj0<String> f32525r;

        /* renamed from: s, reason: collision with root package name */
        private xj0<String> f32526s;

        /* renamed from: t, reason: collision with root package name */
        private int f32527t;

        /* renamed from: u, reason: collision with root package name */
        private int f32528u;

        /* renamed from: v, reason: collision with root package name */
        private boolean f32529v;

        /* renamed from: w, reason: collision with root package name */
        private boolean f32530w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f32531x;

        /* renamed from: y, reason: collision with root package name */
        private HashMap<l52, q52> f32532y;

        /* renamed from: z, reason: collision with root package name */
        private HashSet<Integer> f32533z;

        @Deprecated
        public a() {
            this.f32509a = Integer.MAX_VALUE;
            this.f32510b = Integer.MAX_VALUE;
            this.f32511c = Integer.MAX_VALUE;
            this.f32512d = Integer.MAX_VALUE;
            this.i = Integer.MAX_VALUE;
            this.f32517j = Integer.MAX_VALUE;
            this.f32518k = true;
            this.f32519l = xj0.h();
            this.f32520m = 0;
            this.f32521n = xj0.h();
            this.f32522o = 0;
            this.f32523p = Integer.MAX_VALUE;
            this.f32524q = Integer.MAX_VALUE;
            this.f32525r = xj0.h();
            this.f32526s = xj0.h();
            this.f32527t = 0;
            this.f32528u = 0;
            this.f32529v = false;
            this.f32530w = false;
            this.f32531x = false;
            this.f32532y = new HashMap<>();
            this.f32533z = new HashSet<>();
        }

        private static xj0<String> a(String[] strArr) {
            int i = xj0.f35328d;
            xj0.a aVar = new xj0.a();
            for (String str : strArr) {
                str.getClass();
                aVar.b(s82.e(str));
            }
            return aVar.a();
        }

        public void b(Context context) {
            Point pointC = s82.c(context);
            a(pointC.x, pointC.y);
        }

        public a a(int i, int i10) {
            this.i = i;
            this.f32517j = i10;
            this.f32518k = true;
            return this;
        }

        public void a(Context context) {
            CaptioningManager captioningManager;
            int i = s82.f32899a;
            if (i >= 19) {
                if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                    this.f32527t = 1088;
                    Locale locale = captioningManager.getLocale();
                    if (locale != null) {
                        this.f32526s = xj0.a(s82.a(locale));
                    }
                }
            }
        }

        public a(Context context) {
            this();
            a(context);
            b(context);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v35, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v44, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v59, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v65, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v91, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r7v1, types: [int[], java.io.Serializable] */
        public a(Bundle bundle) {
            xj0 xj0VarA;
            String strA = r52.a(6);
            r52 r52Var = r52.f32483B;
            this.f32509a = bundle.getInt(strA, r52Var.f32485b);
            this.f32510b = bundle.getInt(r52.a(7), r52Var.f32486c);
            this.f32511c = bundle.getInt(r52.a(8), r52Var.f32487d);
            this.f32512d = bundle.getInt(r52.a(9), r52Var.f32488e);
            this.f32513e = bundle.getInt(r52.a(10), r52Var.f32489f);
            this.f32514f = bundle.getInt(r52.a(11), r52Var.f32490g);
            this.f32515g = bundle.getInt(r52.a(12), r52Var.f32491h);
            this.f32516h = bundle.getInt(r52.a(13), r52Var.i);
            this.i = bundle.getInt(r52.a(14), r52Var.f32492j);
            this.f32517j = bundle.getInt(r52.a(15), r52Var.f32493k);
            this.f32518k = bundle.getBoolean(r52.a(16), r52Var.f32494l);
            this.f32519l = xj0.b((String[]) n11.a(bundle.getStringArray(r52.a(17)), new String[0]));
            this.f32520m = bundle.getInt(r52.a(25), r52Var.f32496n);
            this.f32521n = a((String[]) n11.a(bundle.getStringArray(r52.a(1)), new String[0]));
            this.f32522o = bundle.getInt(r52.a(2), r52Var.f32498p);
            this.f32523p = bundle.getInt(r52.a(18), r52Var.f32499q);
            this.f32524q = bundle.getInt(r52.a(19), r52Var.f32500r);
            this.f32525r = xj0.b((String[]) n11.a(bundle.getStringArray(r52.a(20)), new String[0]));
            this.f32526s = a((String[]) n11.a(bundle.getStringArray(r52.a(3)), new String[0]));
            this.f32527t = bundle.getInt(r52.a(4), r52Var.f32503u);
            this.f32528u = bundle.getInt(r52.a(26), r52Var.f32504v);
            this.f32529v = bundle.getBoolean(r52.a(5), r52Var.f32505w);
            this.f32530w = bundle.getBoolean(r52.a(21), r52Var.f32506x);
            this.f32531x = bundle.getBoolean(r52.a(22), r52Var.f32507y);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(r52.a(23));
            if (parcelableArrayList == null) {
                xj0VarA = xj0.h();
            } else {
                xj0VarA = fm.a(q52.f32074d, parcelableArrayList);
            }
            this.f32532y = new HashMap<>();
            for (int i = 0; i < xj0VarA.size(); i++) {
                q52 q52Var = (q52) xj0VarA.get(i);
                this.f32532y.put(q52Var.f32075b, q52Var);
            }
            int[] iArr = (int[]) n11.a(bundle.getIntArray(r52.a(24)), new int[0]);
            this.f32533z = new HashSet<>();
            for (int i10 : iArr) {
                this.f32533z.add(Integer.valueOf(i10));
            }
        }
    }

    public r52(a aVar) {
        this.f32485b = aVar.f32509a;
        this.f32486c = aVar.f32510b;
        this.f32487d = aVar.f32511c;
        this.f32488e = aVar.f32512d;
        this.f32489f = aVar.f32513e;
        this.f32490g = aVar.f32514f;
        this.f32491h = aVar.f32515g;
        this.i = aVar.f32516h;
        this.f32492j = aVar.i;
        this.f32493k = aVar.f32517j;
        this.f32494l = aVar.f32518k;
        this.f32495m = aVar.f32519l;
        this.f32496n = aVar.f32520m;
        this.f32497o = aVar.f32521n;
        this.f32498p = aVar.f32522o;
        this.f32499q = aVar.f32523p;
        this.f32500r = aVar.f32524q;
        this.f32501s = aVar.f32525r;
        this.f32502t = aVar.f32526s;
        this.f32503u = aVar.f32527t;
        this.f32504v = aVar.f32528u;
        this.f32505w = aVar.f32529v;
        this.f32506x = aVar.f32530w;
        this.f32507y = aVar.f32531x;
        this.f32508z = yj0.a(aVar.f32532y);
        this.f32484A = zj0.a(aVar.f32533z);
    }

    public static String a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            r52 r52Var = (r52) obj;
            if (this.f32485b == r52Var.f32485b && this.f32486c == r52Var.f32486c && this.f32487d == r52Var.f32487d && this.f32488e == r52Var.f32488e && this.f32489f == r52Var.f32489f && this.f32490g == r52Var.f32490g && this.f32491h == r52Var.f32491h && this.i == r52Var.i && this.f32494l == r52Var.f32494l && this.f32492j == r52Var.f32492j && this.f32493k == r52Var.f32493k && this.f32495m.equals(r52Var.f32495m) && this.f32496n == r52Var.f32496n && this.f32497o.equals(r52Var.f32497o) && this.f32498p == r52Var.f32498p && this.f32499q == r52Var.f32499q && this.f32500r == r52Var.f32500r && this.f32501s.equals(r52Var.f32501s) && this.f32502t.equals(r52Var.f32502t) && this.f32503u == r52Var.f32503u && this.f32504v == r52Var.f32504v && this.f32505w == r52Var.f32505w && this.f32506x == r52Var.f32506x && this.f32507y == r52Var.f32507y && this.f32508z.equals(r52Var.f32508z) && this.f32484A.equals(r52Var.f32484A)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f32484A.hashCode() + ((this.f32508z.hashCode() + ((((((((((((this.f32502t.hashCode() + ((this.f32501s.hashCode() + ((((((((this.f32497o.hashCode() + ((((this.f32495m.hashCode() + ((((((((((((((((((((((this.f32485b + 31) * 31) + this.f32486c) * 31) + this.f32487d) * 31) + this.f32488e) * 31) + this.f32489f) * 31) + this.f32490g) * 31) + this.f32491h) * 31) + this.i) * 31) + (this.f32494l ? 1 : 0)) * 31) + this.f32492j) * 31) + this.f32493k) * 31)) * 31) + this.f32496n) * 31)) * 31) + this.f32498p) * 31) + this.f32499q) * 31) + this.f32500r) * 31)) * 31)) * 31) + this.f32503u) * 31) + this.f32504v) * 31) + (this.f32505w ? 1 : 0)) * 31) + (this.f32506x ? 1 : 0)) * 31) + (this.f32507y ? 1 : 0)) * 31)) * 31);
    }

    public static r52 a(Bundle bundle) {
        return new r52(new a(bundle));
    }
}
