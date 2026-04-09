package Sf;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class e extends a {

    /* renamed from: b, reason: collision with root package name */
    private Double f20589b;

    /* renamed from: c, reason: collision with root package name */
    private String f20590c;

    /* renamed from: d, reason: collision with root package name */
    private String f20591d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f20592e;

    /* renamed from: f, reason: collision with root package name */
    private Double f20593f;

    /* renamed from: g, reason: collision with root package name */
    private Uf.a f20594g;

    /* renamed from: h, reason: collision with root package name */
    private Double f20595h;

    /* renamed from: i, reason: collision with root package name */
    private Double f20596i;

    /* renamed from: j, reason: collision with root package name */
    private Double f20597j;

    /* renamed from: k, reason: collision with root package name */
    private Double f20598k;

    /* renamed from: l, reason: collision with root package name */
    private Double f20599l;

    /* renamed from: m, reason: collision with root package name */
    private String f20600m;

    /* renamed from: n, reason: collision with root package name */
    private Double f20601n;

    /* renamed from: o, reason: collision with root package name */
    private Integer f20602o;

    /* renamed from: p, reason: collision with root package name */
    private String f20603p;

    /* renamed from: q, reason: collision with root package name */
    private String f20604q;

    /* renamed from: r, reason: collision with root package name */
    private Date f20605r;

    /* renamed from: s, reason: collision with root package name */
    private String f20606s;

    /* renamed from: t, reason: collision with root package name */
    private Double f20607t;

    public e(String str, float f10, float f11) {
        this.f20600m = str;
        this.f20597j = Double.valueOf(f10);
        this.f20598k = Double.valueOf(f11);
    }

    public void A(Integer num) {
        this.f20592e = num;
    }

    public void B(Double d10) {
        this.f20593f = d10;
    }

    public void C(Uf.a aVar) {
        this.f20594g = aVar;
    }

    public void D(Double d10) {
        this.f20595h = d10;
    }

    public void E(Double d10) {
        this.f20596i = d10;
    }

    public void F(Double d10) {
        this.f20597j = d10;
    }

    public void G(Double d10) {
        this.f20598k = d10;
    }

    public void H(Double d10) {
        this.f20599l = d10;
    }

    public void I(String str) {
        this.f20600m = str;
    }

    public void J(Double d10) {
        this.f20601n = d10;
    }

    public void K(Integer num) {
        this.f20602o = num;
    }

    public void L(String str) {
        this.f20603p = str;
    }

    public void M(String str) {
        this.f20604q = str;
    }

    public void N(Date date) {
        this.f20605r = date;
    }

    public void O(String str) {
        this.f20606s = str;
    }

    public void P(Double d10) {
        this.f20607t = d10;
    }

    public Double e() {
        return this.f20589b;
    }

    public String f() {
        return this.f20590c;
    }

    public String g() {
        return this.f20591d;
    }

    public Integer h() {
        return this.f20592e;
    }

    public Double i() {
        return this.f20593f;
    }

    public Uf.a j() {
        return this.f20594g;
    }

    public Double k() {
        return this.f20595h;
    }

    public Double l() {
        return this.f20596i;
    }

    public Double m() {
        return this.f20597j;
    }

    public Double n() {
        return this.f20598k;
    }

    public Double o() {
        return this.f20599l;
    }

    public String p() {
        return this.f20600m;
    }

    public Double q() {
        return this.f20601n;
    }

    public Integer r() {
        return this.f20602o;
    }

    public String s() {
        return this.f20603p;
    }

    public String t() {
        return this.f20604q;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = this.f20605r;
        String str = date != null ? simpleDateFormat.format(date) : "";
        stringBuffer.append("[");
        stringBuffer.append("name:'" + this.f20600m + "' ");
        stringBuffer.append("lat:" + this.f20597j + " ");
        stringBuffer.append("lon:" + this.f20598k + " ");
        stringBuffer.append("elv:" + this.f20593f + " ");
        stringBuffer.append("time:" + str + " ");
        stringBuffer.append("fix:" + this.f20594g + " ");
        if (this.f20568a != null) {
            stringBuffer.append("extensions:{");
            Iterator it = this.f20568a.keySet().iterator();
            while (it.hasNext()) {
                stringBuffer.append((String) it.next());
                if (it.hasNext()) {
                    stringBuffer.append(",");
                }
            }
            stringBuffer.append("}");
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public Date u() {
        return this.f20605r;
    }

    public String v() {
        return this.f20606s;
    }

    public Double w() {
        return this.f20607t;
    }

    public void x(Double d10) {
        this.f20589b = d10;
    }

    public void y(String str) {
        this.f20590c = str;
    }

    public void z(String str) {
        this.f20591d = str;
    }
}
