package yh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o {
    public ArrayList A;
    public ArrayList B;

    /* renamed from: a, reason: collision with root package name */
    public final long f26330a;

    /* renamed from: d, reason: collision with root package name */
    public String f26333d;

    /* renamed from: e, reason: collision with root package name */
    public String f26334e;

    /* renamed from: f, reason: collision with root package name */
    public String f26335f;

    /* renamed from: g, reason: collision with root package name */
    public String f26336g;

    /* renamed from: h, reason: collision with root package name */
    public int f26337h;

    /* renamed from: i, reason: collision with root package name */
    public int f26338i;

    /* renamed from: o, reason: collision with root package name */
    public String f26342o;

    /* renamed from: p, reason: collision with root package name */
    public String f26343p;

    /* renamed from: q, reason: collision with root package name */
    public String f26344q;

    /* renamed from: u, reason: collision with root package name */
    public String f26348u;

    /* renamed from: v, reason: collision with root package name */
    public String f26349v;

    /* renamed from: w, reason: collision with root package name */
    public long f26350w;

    /* renamed from: x, reason: collision with root package name */
    public long f26351x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f26352y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f26353z;

    /* renamed from: b, reason: collision with root package name */
    public double f26331b = -32768.0d;

    /* renamed from: c, reason: collision with root package name */
    public double f26332c = -32768.0d;
    public int j = -32768;
    public int k = -32768;

    /* renamed from: l, reason: collision with root package name */
    public int f26339l = -32768;

    /* renamed from: m, reason: collision with root package name */
    public int f26340m = -32768;

    /* renamed from: n, reason: collision with root package name */
    public int f26341n = -32768;

    /* renamed from: r, reason: collision with root package name */
    public double f26345r = -32768.0d;

    /* renamed from: s, reason: collision with root package name */
    public double f26346s = -32768.0d;

    /* renamed from: t, reason: collision with root package name */
    public long f26347t = -32768;

    public o(int i10, long j, long j7) {
        this.f26337h = i10;
        this.f26338i = i10;
        this.f26330a = j;
    }

    public final String a() {
        return this.f26335f;
    }

    public final int b() {
        return this.f26338i;
    }

    public final void c(String str) {
        this.f26343p = str;
    }

    public final void d(List list) {
        if (list != null) {
            this.f26352y = new ArrayList();
            this.f26353z = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                this.f26352y.add(Long.valueOf(nVar.f26328a));
                this.f26353z.add(Long.valueOf(nVar.f26329b));
            }
        }
        ic.a.t(list);
    }

    public final void e(long j) {
        this.f26347t = j;
    }

    public final void f(int i10) {
        this.f26339l = i10;
    }

    public final void g(int i10) {
        this.f26340m = i10;
    }

    public final void h(String str) {
        this.f26349v = str;
    }

    public final void i(int i10) {
        this.f26338i = i10;
    }

    public final void j(double d6) {
        this.f26332c = d6;
    }

    public final void k(List list) {
        if (list != null) {
            this.A = new ArrayList();
            this.B = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                this.A.add(Long.valueOf(nVar.f26328a));
                this.B.add(Long.valueOf(nVar.f26329b));
            }
        }
        ic.a.t(list);
    }
}
