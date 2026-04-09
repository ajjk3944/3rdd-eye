package fa;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final y4.a f23856a;

    /* renamed from: b, reason: collision with root package name */
    public final yb.e f23857b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f23858c;

    public d(Context context, yb.e eVar) {
        y4.a aVar = new y4.a(context);
        this.f23858c = new HashMap();
        this.f23856a = aVar;
        this.f23857b = eVar;
    }

    public final synchronized e a(String str) {
        if (this.f23858c.containsKey(str)) {
            return (e) this.f23858c.get(str);
        }
        CctBackendFactory cctBackendFactoryH = this.f23856a.h(str);
        if (cctBackendFactoryH == null) {
            return null;
        }
        yb.e eVar = this.f23857b;
        e eVarCreate = cctBackendFactoryH.create(new b((Context) eVar.f37509b, (na.a) eVar.f37510c, (na.a) eVar.f37511d, str));
        this.f23858c.put(str, eVarCreate);
        return eVarCreate;
    }
}
