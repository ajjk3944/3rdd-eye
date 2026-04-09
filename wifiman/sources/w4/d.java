package W4;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.e;
import s3.C7889d;

/* loaded from: classes3.dex */
public class d extends com.google.android.gms.common.api.d {

    /* renamed from: k, reason: collision with root package name */
    private static final a.g f23615k;

    /* renamed from: l, reason: collision with root package name */
    private static final a.AbstractC1198a f23616l;

    /* renamed from: m, reason: collision with root package name */
    static final com.google.android.gms.common.api.a f23617m;

    class a extends a.AbstractC1198a {
        a() {
        }

        @Override // com.google.android.gms.common.api.a.AbstractC1198a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e a(Context context, Looper looper, C7889d c7889d, a.d.C1199a c1199a, e.a aVar, e.b bVar) {
            return new e(context, looper, c7889d, aVar, bVar);
        }
    }

    static {
        a.g gVar = new a.g();
        f23615k = gVar;
        a aVar = new a();
        f23616l = aVar;
        f23617m = new com.google.android.gms.common.api.a("DynamicLinks.API", aVar, gVar);
    }

    public d(Context context) {
        super(context, f23617m, a.d.f34730a, d.a.f34741c);
    }
}
