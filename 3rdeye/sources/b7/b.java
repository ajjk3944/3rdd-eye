package B7;

import i6.C4458a;
import kotlin.jvm.internal.l;
import m0.C5308a;
import m6.C5330c;
import org.json.JSONObject;

/* compiled from: InMemoryTemplateProvider.kt */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final C5308a f578b;

    public b(int i) {
        switch (i) {
            case 1:
                this.f578b = new C5308a();
                break;
            default:
                this.f578b = new C5308a();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(C4458a tag, String str) {
        l.f(tag, "tag");
        if (((C5330c) this.f578b.get(tag)) != null) {
            throw null;
        }
    }

    @Override // B7.f
    public /* synthetic */ Z6.b f(String str, JSONObject jSONObject) {
        return c.a(this, str, jSONObject);
    }

    @Override // B7.f
    public Z6.b get(String str) {
        return (z7.b) this.f578b.get(str);
    }
}
