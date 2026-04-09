package u5;

import java.util.HashSet;
import org.json.JSONObject;
import v5.b;
import v5.d;
import v5.e;
import v5.f;

/* loaded from: classes3.dex */
public class c implements b.InterfaceC0493b {

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f24531a;

    /* renamed from: b, reason: collision with root package name */
    public final v5.c f24532b;

    public c(v5.c cVar) {
        this.f24532b = cVar;
    }

    @Override // v5.b.InterfaceC0493b
    public JSONObject a() {
        return this.f24531a;
    }

    public void b(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f24532b.c(new e(this, hashSet, jSONObject, j10));
    }

    public void c() {
        this.f24532b.c(new d(this));
    }

    public void d(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f24532b.c(new f(this, hashSet, jSONObject, j10));
    }

    @Override // v5.b.InterfaceC0493b
    public void a(JSONObject jSONObject) {
        this.f24531a = jSONObject;
    }
}
