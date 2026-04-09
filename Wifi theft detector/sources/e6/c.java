package e6;

import f6.b;
import f6.d;
import f6.e;
import f6.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c implements b.InterfaceC0394b {

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f20980a;

    /* renamed from: b, reason: collision with root package name */
    public final f6.c f20981b;

    public c(f6.c cVar) {
        this.f20981b = cVar;
    }

    @Override // f6.b.InterfaceC0394b
    public JSONObject a() {
        return this.f20980a;
    }

    public void b(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f20981b.c(new e(this, hashSet, jSONObject, j10));
    }

    public void c() {
        this.f20981b.c(new d(this));
    }

    public void d(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f20981b.c(new f(this, hashSet, jSONObject, j10));
    }

    @Override // f6.b.InterfaceC0394b
    public void a(JSONObject jSONObject) {
        this.f20980a = jSONObject;
    }
}
