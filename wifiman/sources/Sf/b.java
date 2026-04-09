package Sf;

import java.util.HashSet;

/* loaded from: classes4.dex */
public class b extends a {

    /* renamed from: b, reason: collision with root package name */
    private String f20569b;

    /* renamed from: e, reason: collision with root package name */
    private String f20572e;

    /* renamed from: f, reason: collision with root package name */
    private HashSet f20573f = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private HashSet f20571d = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private HashSet f20570c = new HashSet();

    public void e(c cVar) {
        if (this.f20570c == null) {
            this.f20570c = new HashSet();
        }
        this.f20570c.add(cVar);
    }

    public void f(d dVar) {
        if (this.f20571d == null) {
            this.f20571d = new HashSet();
        }
        this.f20571d.add(dVar);
    }

    public void g(e eVar) {
        if (this.f20573f == null) {
            this.f20573f = new HashSet();
        }
        this.f20573f.add(eVar);
    }

    public String h() {
        return this.f20569b;
    }

    public HashSet i() {
        return this.f20570c;
    }

    public HashSet j() {
        return this.f20571d;
    }

    public String k() {
        return this.f20572e;
    }

    public HashSet l() {
        return this.f20573f;
    }

    public void m(String str) {
        this.f20569b = str;
    }

    public void n(String str) {
        this.f20572e = str;
    }
}
