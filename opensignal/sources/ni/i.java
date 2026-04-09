package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Long f17898a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f17899b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f17900c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f17901d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f17902e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f17903f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f17904g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f17905h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f17906i;
    public final Long j;
    public final Long k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f17907l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f17908m;

    /* renamed from: n, reason: collision with root package name */
    public final Long f17909n;

    /* renamed from: o, reason: collision with root package name */
    public final Long f17910o;

    /* renamed from: p, reason: collision with root package name */
    public final Long f17911p;

    /* renamed from: q, reason: collision with root package name */
    public final Long f17912q;

    /* renamed from: r, reason: collision with root package name */
    public final Long f17913r;

    /* renamed from: s, reason: collision with root package name */
    public final Long f17914s;

    /* renamed from: t, reason: collision with root package name */
    public final Long f17915t;

    /* renamed from: u, reason: collision with root package name */
    public final Long f17916u;

    /* renamed from: v, reason: collision with root package name */
    public final Long f17917v;

    /* renamed from: w, reason: collision with root package name */
    public final Long f17918w;

    /* renamed from: x, reason: collision with root package name */
    public final Long f17919x;

    /* renamed from: y, reason: collision with root package name */
    public final Long f17920y;

    public i(Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Long l18, Long l19, Long l20, Long l21, Long l22, Long l23, Long l24, Long l25, Long l26, Long l27, Long l28, Long l29, Long l30, Long l31, Long l32, Long l33, Long l34) {
        this.f17898a = l10;
        this.f17899b = l11;
        this.f17900c = l12;
        this.f17901d = l13;
        this.f17902e = l14;
        this.f17903f = l15;
        this.f17904g = l16;
        this.f17905h = l17;
        this.f17906i = l18;
        this.j = l19;
        this.k = l20;
        this.f17907l = l21;
        this.f17908m = l22;
        this.f17909n = l23;
        this.f17910o = l24;
        this.f17911p = l25;
        this.f17912q = l26;
        this.f17913r = l27;
        this.f17914s = l28;
        this.f17915t = l29;
        this.f17916u = l30;
        this.f17917v = l31;
        this.f17918w = l32;
        this.f17919x = l33;
        this.f17920y = l34;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        xu.d.Y(jSONObject, "dt_delta_tx_bytes_wifi", this.f17898a);
        xu.d.Y(jSONObject, "dt_delta_rx_bytes_wifi", this.f17899b);
        xu.d.Y(jSONObject, "dt_delta_tx_bytes_cell", this.f17900c);
        xu.d.Y(jSONObject, "dt_delta_rx_bytes_cell", this.f17901d);
        xu.d.Y(jSONObject, "dt_delta_interval", this.f17902e);
        xu.d.Y(jSONObject, "dt_delta_tx_drops_wifi", this.f17903f);
        xu.d.Y(jSONObject, "dt_delta_tx_packets_wifi", this.f17904g);
        xu.d.Y(jSONObject, "dt_delta_tx_drops_cell", this.f17905h);
        xu.d.Y(jSONObject, "dt_delta_tx_packets_cell", this.f17906i);
        xu.d.Y(jSONObject, "dt_delta_rx_drops_wifi", this.j);
        xu.d.Y(jSONObject, "dt_delta_rx_packets_wifi", this.k);
        xu.d.Y(jSONObject, "dt_delta_rx_drops_cell", this.f17907l);
        xu.d.Y(jSONObject, "dt_delta_rx_packets_cell", this.f17908m);
        xu.d.Y(jSONObject, "dt_tot_tx_drops_wifi", this.f17909n);
        xu.d.Y(jSONObject, "dt_tot_tx_packets_wifi", this.f17910o);
        xu.d.Y(jSONObject, "dt_tot_tx_drops_cell", this.f17911p);
        xu.d.Y(jSONObject, "dt_tot_tx_packets_cell", this.f17912q);
        xu.d.Y(jSONObject, "dt_tot_rx_drops_wifi", this.f17913r);
        xu.d.Y(jSONObject, "dt_tot_rx_packets_wifi", this.f17914s);
        xu.d.Y(jSONObject, "dt_tot_rx_drops_cell", this.f17915t);
        xu.d.Y(jSONObject, "dt_tot_rx_packets_cell", this.f17916u);
        xu.d.Y(jSONObject, "dt_tot_rx_bytes_cell", this.f17917v);
        xu.d.Y(jSONObject, "dt_tot_rx_bytes_wifi", this.f17918w);
        xu.d.Y(jSONObject, "dt_tot_tx_bytes_cell", this.f17919x);
        xu.d.Y(jSONObject, "dt_tot_tx_bytes_wifi", this.f17920y);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return br.l.a(this.f17898a, iVar.f17898a) && br.l.a(this.f17899b, iVar.f17899b) && br.l.a(this.f17900c, iVar.f17900c) && br.l.a(this.f17901d, iVar.f17901d) && br.l.a(this.f17902e, iVar.f17902e) && br.l.a(this.f17903f, iVar.f17903f) && br.l.a(this.f17904g, iVar.f17904g) && br.l.a(this.f17905h, iVar.f17905h) && br.l.a(this.f17906i, iVar.f17906i) && br.l.a(this.j, iVar.j) && br.l.a(this.k, iVar.k) && br.l.a(this.f17907l, iVar.f17907l) && br.l.a(this.f17908m, iVar.f17908m) && br.l.a(this.f17909n, iVar.f17909n) && br.l.a(this.f17910o, iVar.f17910o) && br.l.a(this.f17911p, iVar.f17911p) && br.l.a(this.f17912q, iVar.f17912q) && br.l.a(this.f17913r, iVar.f17913r) && br.l.a(this.f17914s, iVar.f17914s) && br.l.a(this.f17915t, iVar.f17915t) && br.l.a(this.f17916u, iVar.f17916u) && br.l.a(this.f17917v, iVar.f17917v) && br.l.a(this.f17918w, iVar.f17918w) && br.l.a(this.f17919x, iVar.f17919x) && br.l.a(this.f17920y, iVar.f17920y);
    }

    public final int hashCode() {
        Long l10 = this.f17898a;
        int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.f17899b;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f17900c;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f17901d;
        int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f17902e;
        int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f17903f;
        int iHashCode6 = (iHashCode5 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.f17904g;
        int iHashCode7 = (iHashCode6 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.f17905h;
        int iHashCode8 = (iHashCode7 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Long l18 = this.f17906i;
        int iHashCode9 = (iHashCode8 + (l18 == null ? 0 : l18.hashCode())) * 31;
        Long l19 = this.j;
        int iHashCode10 = (iHashCode9 + (l19 == null ? 0 : l19.hashCode())) * 31;
        Long l20 = this.k;
        int iHashCode11 = (iHashCode10 + (l20 == null ? 0 : l20.hashCode())) * 31;
        Long l21 = this.f17907l;
        int iHashCode12 = (iHashCode11 + (l21 == null ? 0 : l21.hashCode())) * 31;
        Long l22 = this.f17908m;
        int iHashCode13 = (iHashCode12 + (l22 == null ? 0 : l22.hashCode())) * 31;
        Long l23 = this.f17909n;
        int iHashCode14 = (iHashCode13 + (l23 == null ? 0 : l23.hashCode())) * 31;
        Long l24 = this.f17910o;
        int iHashCode15 = (iHashCode14 + (l24 == null ? 0 : l24.hashCode())) * 31;
        Long l25 = this.f17911p;
        int iHashCode16 = (iHashCode15 + (l25 == null ? 0 : l25.hashCode())) * 31;
        Long l26 = this.f17912q;
        int iHashCode17 = (iHashCode16 + (l26 == null ? 0 : l26.hashCode())) * 31;
        Long l27 = this.f17913r;
        int iHashCode18 = (iHashCode17 + (l27 == null ? 0 : l27.hashCode())) * 31;
        Long l28 = this.f17914s;
        int iHashCode19 = (iHashCode18 + (l28 == null ? 0 : l28.hashCode())) * 31;
        Long l29 = this.f17915t;
        int iHashCode20 = (iHashCode19 + (l29 == null ? 0 : l29.hashCode())) * 31;
        Long l30 = this.f17916u;
        int iHashCode21 = (iHashCode20 + (l30 == null ? 0 : l30.hashCode())) * 31;
        Long l31 = this.f17917v;
        int iHashCode22 = (iHashCode21 + (l31 == null ? 0 : l31.hashCode())) * 31;
        Long l32 = this.f17918w;
        int iHashCode23 = (iHashCode22 + (l32 == null ? 0 : l32.hashCode())) * 31;
        Long l33 = this.f17919x;
        int iHashCode24 = (iHashCode23 + (l33 == null ? 0 : l33.hashCode())) * 31;
        Long l34 = this.f17920y;
        return iHashCode24 + (l34 != null ? l34.hashCode() : 0);
    }

    public final String toString() {
        return "DataUsageCoreResult(dtDeltaTxBytesWifi=" + this.f17898a + ", dtDeltaRxBytesWifi=" + this.f17899b + ", dtDeltaTxBytesCell=" + this.f17900c + ", dtDeltaRxBytesCell=" + this.f17901d + ", dtDeltaInterval=" + this.f17902e + ", dtDeltaTxDropsWifi=" + this.f17903f + ", dtDeltaTxPacketsWifi=" + this.f17904g + ", dtDeltaTxDropsCell=" + this.f17905h + ", dtDeltaTxPacketsCell=" + this.f17906i + ", dtDeltaRxDropsWifi=" + this.j + ", dtDeltaRxPacketsWifi=" + this.k + ", dtDeltaRxDropsCell=" + this.f17907l + ", dtDeltaRxPacketsCell=" + this.f17908m + ", dtTotTxDropsWifi=" + this.f17909n + ", dtTotTxPacketsWifi=" + this.f17910o + ", dtTotTxDropsCell=" + this.f17911p + ", dtTotTxPacketsCell=" + this.f17912q + ", dtTotRxDropsWifi=" + this.f17913r + ", dtTotRxPacketsWifi=" + this.f17914s + ", dtTotRxDropsCell=" + this.f17915t + ", dtTotRxPacketsCell=" + this.f17916u + ", dtTotRxBytesCell=" + this.f17917v + ", dtTotRxBytesWifi=" + this.f17918w + ", dtTotTxBytesCell=" + this.f17919x + ", dtTotTxBytesWifi=" + this.f17920y + ')';
    }
}
