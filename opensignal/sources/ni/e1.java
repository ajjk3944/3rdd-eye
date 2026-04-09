package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e1 extends f1 {

    /* renamed from: b, reason: collision with root package name */
    public final long f17797b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17798c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17799d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17800e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17801f;

    /* renamed from: g, reason: collision with root package name */
    public final long f17802g;

    /* renamed from: h, reason: collision with root package name */
    public final long f17803h;

    /* renamed from: i, reason: collision with root package name */
    public final long f17804i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(long j, long j7, String str, String str2, String str3, long j10, long j11, long j12) {
        super(true);
        br.l.e(str, "taskName");
        br.l.e(str3, "dataEndpoint");
        this.f17797b = j;
        this.f17798c = j7;
        this.f17799d = str;
        this.f17800e = str2;
        this.f17801f = str3;
        this.f17802g = j10;
        this.f17803h = j11;
        this.f17804i = j12;
    }

    @Override // vj.c
    public final String a() {
        return this.f17801f;
    }

    @Override // vj.c
    public final long b() {
        return this.f17797b;
    }

    @Override // vj.c
    public final String c() {
        return this.f17800e;
    }

    @Override // vj.c
    public final long d() {
        return this.f17798c;
    }

    @Override // vj.c
    public final String e() {
        return this.f17799d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return this.f17797b == e1Var.f17797b && this.f17798c == e1Var.f17798c && br.l.a(this.f17799d, e1Var.f17799d) && br.l.a(this.f17800e, e1Var.f17800e) && br.l.a(this.f17801f, e1Var.f17801f) && this.f17802g == e1Var.f17802g && this.f17803h == e1Var.f17803h && this.f17804i == e1Var.f17804i;
    }

    @Override // vj.c
    public final long f() {
        return this.f17802g;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("is_progress_result", true);
        jSONObject.put("is_progress_result", this.f17821a);
        jSONObject.put("video_current_position", this.f17803h);
        jSONObject.put("KEY_RESOURCE_DURATION", this.f17804i);
    }

    public final int hashCode() {
        return Long.hashCode(this.f17804i) + h0.b.b(h0.b.b(c7.a.g(this.f17801f, c7.a.g(this.f17800e, c7.a.g(this.f17799d, h0.b.b(Long.hashCode(this.f17797b) * 31, 31, this.f17798c), 31), 31), 31), 31, this.f17802g), 31, this.f17803h);
    }

    @Override // ni.f1
    public final f1 i(long j) {
        String str = this.f17799d;
        br.l.e(str, "taskName");
        String str2 = this.f17800e;
        br.l.e(str2, "jobType");
        String str3 = this.f17801f;
        br.l.e(str3, "dataEndpoint");
        return new e1(j, this.f17798c, str, str2, str3, this.f17802g, this.f17803h, this.f17804i);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoProgressResult(id=");
        sb2.append(this.f17797b);
        sb2.append(", taskId=");
        sb2.append(this.f17798c);
        sb2.append(", taskName=");
        sb2.append(this.f17799d);
        sb2.append(", jobType=");
        sb2.append(this.f17800e);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f17801f);
        sb2.append(", timeOfResult=");
        sb2.append(this.f17802g);
        sb2.append(", currentPosition=");
        sb2.append(this.f17803h);
        sb2.append(", resourceDuration=");
        return w.g.h(sb2, this.f17804i, ')');
    }
}
