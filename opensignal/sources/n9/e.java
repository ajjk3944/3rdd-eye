package n9;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import io.sentry.k;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final i4.b f17402a;

    /* renamed from: b, reason: collision with root package name */
    public final k f17403b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f17404c;

    public e(Context context, k kVar) {
        i4.b bVar = new i4.b(context);
        this.f17404c = new HashMap();
        this.f17402a = bVar;
        this.f17403b = kVar;
    }

    public final synchronized f a(String str) {
        if (this.f17404c.containsKey(str)) {
            return (f) this.f17404c.get(str);
        }
        CctBackendFactory cctBackendFactoryG = this.f17402a.G(str);
        if (cctBackendFactoryG == null) {
            return null;
        }
        k kVar = this.f17403b;
        f fVarCreate = cctBackendFactoryG.create(new b((Context) kVar.f12397d, (v9.a) kVar.f12398g, (v9.a) kVar.f12399r, str));
        this.f17404c.put(str, fVarCreate);
        return fVarCreate;
    }
}
