package Sf;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public class c extends a {

    /* renamed from: b, reason: collision with root package name */
    private String f20574b;

    /* renamed from: c, reason: collision with root package name */
    private String f20575c;

    /* renamed from: d, reason: collision with root package name */
    private String f20576d;

    /* renamed from: e, reason: collision with root package name */
    private String f20577e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f20578f;

    /* renamed from: g, reason: collision with root package name */
    private String f20579g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f20580h;

    public void e(e eVar) {
        if (this.f20580h == null) {
            this.f20580h = new ArrayList();
        }
        this.f20580h.add(eVar);
    }

    public String f() {
        return this.f20575c;
    }

    public String g() {
        return this.f20576d;
    }

    public String h() {
        return this.f20574b;
    }

    public Integer i() {
        return this.f20578f;
    }

    public ArrayList j() {
        return this.f20580h;
    }

    public String k() {
        return this.f20577e;
    }

    public String l() {
        return this.f20579g;
    }

    public void m(String str) {
        this.f20575c = str;
    }

    public void n(String str) {
        this.f20576d = str;
    }

    public void o(String str) {
        this.f20574b = str;
    }

    public void p(Integer num) {
        this.f20578f = num;
    }

    public void q(String str) {
        this.f20577e = str;
    }

    public void r(String str) {
        this.f20579g = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("rte[");
        stringBuffer.append("name:" + this.f20574b + " ");
        ArrayList arrayList = this.f20580h;
        stringBuffer.append("rtepts:" + (arrayList != null ? arrayList.size() : 0) + " ");
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
