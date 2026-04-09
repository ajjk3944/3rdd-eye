package B7;

import org.json.JSONObject;
import z7.b;

/* compiled from: CachingTemplateProvider.kt */
/* loaded from: classes.dex */
public final class a<T extends z7.b<?>> implements f<T> {

    /* renamed from: b, reason: collision with root package name */
    public final b f577b;

    public a(b bVar, d dVar) {
        this.f577b = bVar;
    }

    @Override // B7.f
    public final /* synthetic */ Z6.b f(String str, JSONObject jSONObject) {
        return c.a(this, str, jSONObject);
    }

    @Override // B7.f
    public final Z6.b get(String str) {
        z7.b bVar = (z7.b) this.f577b.f578b.get(str);
        if (bVar != null) {
            return bVar;
        }
        return null;
    }
}
