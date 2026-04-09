package o6;

import java.util.HashSet;
import org.json.JSONObject;
import p6.b;
import p6.d;
import p6.e;
import p6.f;

/* loaded from: classes3.dex */
public class c implements b.InterfaceC0454b {

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f23700a;

    /* renamed from: b, reason: collision with root package name */
    public final p6.c f23701b;

    public c(p6.c cVar) {
        this.f23701b = cVar;
    }

    @Override // p6.b.InterfaceC0454b
    public JSONObject a() {
        return this.f23700a;
    }

    public void b(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f23701b.c(new e(this, hashSet, jSONObject, j10));
    }

    public void c() {
        this.f23701b.c(new d(this));
    }

    public void d(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f23701b.c(new f(this, hashSet, jSONObject, j10));
    }

    @Override // p6.b.InterfaceC0454b
    public void a(JSONObject jSONObject) {
        this.f23700a = jSONObject;
    }
}
