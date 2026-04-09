package C3;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.AbstractC4285n;
import com.google.android.gms.tasks.Task;

/* renamed from: C3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2547g extends com.google.android.gms.common.api.d implements I3.b {

    /* renamed from: k, reason: collision with root package name */
    static final a.g f2212k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f2213l;

    /* renamed from: m, reason: collision with root package name */
    private static final Object f2214m;

    static {
        a.g gVar = new a.g();
        f2212k = gVar;
        f2213l = new com.google.android.gms.common.api.a("LocationServices.API", new C2546f(), gVar);
        f2214m = new Object();
    }

    public C2547g(Context context) {
        super(context, f2213l, a.d.f34730a, d.a.f34741c);
    }

    @Override // I3.b
    public final Task c() {
        return g(AbstractC4285n.a().b(C2549i.f2216a).e(2414).a());
    }

    @Override // I3.b
    public final Task d() {
        return g(AbstractC4285n.a().b(C2548h.f2215a).e(2416).a());
    }

    @Override // com.google.android.gms.common.api.d
    protected final String i(Context context) {
        return null;
    }
}
