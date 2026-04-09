package Sf;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public class d extends a {

    /* renamed from: b, reason: collision with root package name */
    private String f20581b;

    /* renamed from: c, reason: collision with root package name */
    private String f20582c;

    /* renamed from: d, reason: collision with root package name */
    private String f20583d;

    /* renamed from: e, reason: collision with root package name */
    private String f20584e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f20585f;

    /* renamed from: g, reason: collision with root package name */
    private String f20586g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f20587h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f20588i;

    public void e(e eVar) {
        if (this.f20587h == null) {
            this.f20587h = new ArrayList();
        }
        this.f20587h.add(eVar);
    }

    public void f(ArrayList arrayList) {
        if (this.f20587h == null) {
            this.f20587h = new ArrayList();
        }
        this.f20587h.addAll(arrayList);
    }

    public void g(ArrayList arrayList) {
        if (this.f20588i == null) {
            this.f20588i = new ArrayList();
        }
        this.f20588i.add(arrayList);
    }

    public String h() {
        return this.f20582c;
    }

    public String i() {
        return this.f20583d;
    }

    public String j() {
        return this.f20581b;
    }

    public Integer k() {
        return this.f20585f;
    }

    public String l() {
        return this.f20584e;
    }

    public ArrayList m() {
        return this.f20587h;
    }

    public String n() {
        return this.f20586g;
    }

    public void o(String str) {
        this.f20582c = str;
    }

    public void p(String str) {
        this.f20583d = str;
    }

    public void q(String str) {
        this.f20581b = str;
    }

    public void r(Integer num) {
        this.f20585f = num;
    }

    public void s(String str) {
        this.f20584e = str;
    }

    public void t(String str) {
        this.f20586g = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("trk[");
        stringBuffer.append("name:" + this.f20581b + " ");
        ArrayList arrayList = this.f20587h;
        stringBuffer.append("trkseg:" + (arrayList != null ? arrayList.size() : 0) + " ");
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
