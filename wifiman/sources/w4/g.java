package W4;

import W4.h;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC4285n;
import com.google.android.gms.common.api.internal.AbstractC4286o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import f5.InterfaceC5536b;
import s3.AbstractC7901p;

/* loaded from: classes3.dex */
public class g extends V4.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.api.d f23618a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5536b f23619b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.f f23620c;

    static class a extends h.a {
        a() {
        }

        @Override // W4.h
        public void T(Status status, j jVar) {
            throw new UnsupportedOperationException();
        }
    }

    static class b extends a {

        /* renamed from: a, reason: collision with root package name */
        private final TaskCompletionSource f23621a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC5536b f23622b;

        public b(InterfaceC5536b interfaceC5536b, TaskCompletionSource taskCompletionSource) {
            this.f23622b = interfaceC5536b;
            this.f23621a = taskCompletionSource;
        }

        @Override // W4.h
        public void B(Status status, W4.a aVar) {
            Bundle bundle;
            D4.a aVar2;
            AbstractC4286o.a(status, aVar == null ? null : new V4.b(aVar), this.f23621a);
            if (aVar == null || (bundle = aVar.g().getBundle("scionData")) == null || bundle.keySet() == null || (aVar2 = (D4.a) this.f23622b.get()) == null) {
                return;
            }
            for (String str : bundle.keySet()) {
                aVar2.a("fdl", str, bundle.getBundle(str));
            }
        }
    }

    static final class c extends AbstractC4285n {

        /* renamed from: d, reason: collision with root package name */
        private final String f23623d;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC5536b f23624e;

        c(InterfaceC5536b interfaceC5536b, String str) {
            super(null, false, 13201);
            this.f23623d = str;
            this.f23624e = interfaceC5536b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.common.api.internal.AbstractC4285n
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(e eVar, TaskCompletionSource taskCompletionSource) {
            eVar.k0(new b(this.f23624e, taskCompletionSource), this.f23623d);
        }
    }

    public g(com.google.firebase.f fVar, InterfaceC5536b interfaceC5536b) {
        this(new d(fVar.k()), fVar, interfaceC5536b);
    }

    @Override // V4.a
    public Task a(Intent intent) {
        V4.b bVarD;
        Task taskH = this.f23618a.h(new c(this.f23619b, intent != null ? intent.getDataString() : null));
        return (intent == null || (bVarD = d(intent)) == null) ? taskH : Tasks.forResult(bVarD);
    }

    public V4.b d(Intent intent) {
        W4.a aVar = (W4.a) t3.d.b(intent, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA", W4.a.CREATOR);
        if (aVar != null) {
            return new V4.b(aVar);
        }
        return null;
    }

    public g(com.google.android.gms.common.api.d dVar, com.google.firebase.f fVar, InterfaceC5536b interfaceC5536b) {
        this.f23618a = dVar;
        this.f23620c = (com.google.firebase.f) AbstractC7901p.l(fVar);
        this.f23619b = interfaceC5536b;
        if (interfaceC5536b.get() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }
}
