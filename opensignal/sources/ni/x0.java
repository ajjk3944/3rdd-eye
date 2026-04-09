package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class x0 extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18291a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18292b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18293c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18294d;

    /* renamed from: e, reason: collision with root package name */
    public final long f18295e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18296f;

    public x0(int i10, long j, long j7, String str) {
        this.f18291a = i10;
        switch (i10) {
            case 1:
                br.l.e(str, "taskName");
                this.f18292b = j;
                this.f18293c = str;
                this.f18294d = j7;
                this.f18295e = System.currentTimeMillis();
                this.f18296f = "UPDATE_CONFIG";
                break;
            case 2:
                br.l.e(str, "taskName");
                this.f18292b = j;
                this.f18293c = str;
                this.f18294d = j7;
                this.f18295e = System.currentTimeMillis();
                this.f18296f = "SEND_RESULTS";
                break;
            default:
                br.l.e(str, "taskName");
                this.f18292b = j;
                this.f18293c = str;
                this.f18294d = j7;
                this.f18295e = System.currentTimeMillis();
                this.f18296f = "TRIM_DATABASE_TABLES";
                break;
        }
    }

    @Override // vj.c
    public final String a() {
        switch (this.f18291a) {
        }
        return "";
    }

    @Override // vj.c
    public final long b() {
        switch (this.f18291a) {
        }
        return this.f18295e;
    }

    @Override // vj.c
    public final String c() {
        switch (this.f18291a) {
        }
        return this.f18296f;
    }

    @Override // vj.c
    public final long d() {
        switch (this.f18291a) {
        }
        return this.f18292b;
    }

    @Override // vj.c
    public final String e() {
        switch (this.f18291a) {
        }
        return this.f18293c;
    }

    @Override // vj.c
    public final long f() {
        switch (this.f18291a) {
        }
        return this.f18294d;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) {
        int i10 = this.f18291a;
    }

    private final void i(JSONObject jSONObject) {
    }

    private final void j(JSONObject jSONObject) {
    }

    private final void k(JSONObject jSONObject) {
    }
}
