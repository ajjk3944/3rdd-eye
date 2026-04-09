package lf;

import java.util.List;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f15191a;

    /* renamed from: b, reason: collision with root package name */
    public String f15192b;

    /* renamed from: c, reason: collision with root package name */
    public int f15193c;

    /* renamed from: d, reason: collision with root package name */
    public int f15194d;

    /* renamed from: e, reason: collision with root package name */
    public long f15195e;

    /* renamed from: f, reason: collision with root package name */
    public long f15196f;

    /* renamed from: g, reason: collision with root package name */
    public long f15197g;

    /* renamed from: h, reason: collision with root package name */
    public String f15198h;

    /* renamed from: i, reason: collision with root package name */
    public List f15199i;
    public byte j;

    public final d0 a() {
        String str;
        if (this.j == 63 && (str = this.f15192b) != null) {
            return new d0(this.f15191a, str, this.f15193c, this.f15194d, this.f15195e, this.f15196f, this.f15197g, this.f15198h, this.f15199i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f15192b == null) {
            sb2.append(" processName");
        }
        if ((this.j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(h0.b.p("Missing required properties:", sb2));
    }
}
