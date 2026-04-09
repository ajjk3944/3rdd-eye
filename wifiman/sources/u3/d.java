package u3;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.AbstractC4285n;
import com.google.android.gms.common.api.internal.InterfaceC4283l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import s3.C7904t;
import s3.C7907w;
import s3.InterfaceC7906v;

/* loaded from: classes.dex */
public final class d extends com.google.android.gms.common.api.d implements InterfaceC7906v {

    /* renamed from: k, reason: collision with root package name */
    private static final a.g f62673k;

    /* renamed from: l, reason: collision with root package name */
    private static final a.AbstractC1198a f62674l;

    /* renamed from: m, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f62675m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f62676n = 0;

    static {
        a.g gVar = new a.g();
        f62673k = gVar;
        c cVar = new c();
        f62674l = cVar;
        f62675m = new com.google.android.gms.common.api.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, C7907w c7907w) {
        super(context, f62675m, c7907w, d.a.f34741c);
    }

    @Override // s3.InterfaceC7906v
    public final Task a(final C7904t c7904t) {
        AbstractC4285n.a aVarA = AbstractC4285n.a();
        aVarA.d(A3.d.f277a);
        aVarA.c(false);
        aVarA.b(new InterfaceC4283l() { // from class: u3.b
            @Override // com.google.android.gms.common.api.internal.InterfaceC4283l
            public final void accept(Object obj, Object obj2) {
                int i10 = d.f62676n;
                ((C8130a) ((e) obj).B()).n0(c7904t);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        });
        return f(aVarA.a());
    }
}
