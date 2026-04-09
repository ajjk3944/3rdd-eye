package S4;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.AbstractC5107i;
import com.google.firebase.crashlytics.internal.common.F;
import com.google.firebase.crashlytics.internal.common.G;
import com.google.firebase.crashlytics.internal.common.H;
import com.google.firebase.crashlytics.internal.common.L;
import com.google.firebase.crashlytics.internal.common.g0;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class g implements j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20264a;

    /* renamed from: b, reason: collision with root package name */
    private final k f20265b;

    /* renamed from: c, reason: collision with root package name */
    private final h f20266c;

    /* renamed from: d, reason: collision with root package name */
    private final F f20267d;

    /* renamed from: e, reason: collision with root package name */
    private final S4.a f20268e;

    /* renamed from: f, reason: collision with root package name */
    private final l f20269f;

    /* renamed from: g, reason: collision with root package name */
    private final G f20270g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference f20271h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference f20272i;

    class a implements SuccessContinuation {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L4.f f20273a;

        a(L4.f fVar) {
            this.f20273a = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ JSONObject b() {
            return g.this.f20269f.a(g.this.f20265b, true);
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Task then(Void r52) throws Throwable {
            JSONObject jSONObject = (JSONObject) this.f20273a.f11232d.c().submit(new Callable() { // from class: S4.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f20263a.b();
                }
            }).get();
            if (jSONObject != null) {
                d dVarB = g.this.f20266c.b(jSONObject);
                g.this.f20268e.c(dVarB.f20252c, jSONObject);
                g.this.q(jSONObject, "Loaded settings: ");
                g gVar = g.this;
                gVar.r(gVar.f20265b.f20281f);
                g.this.f20271h.set(dVarB);
                ((TaskCompletionSource) g.this.f20272i.get()).trySetResult(dVarB);
            }
            return Tasks.forResult(null);
        }
    }

    g(Context context, k kVar, F f10, h hVar, S4.a aVar, l lVar, G g10) {
        AtomicReference atomicReference = new AtomicReference();
        this.f20271h = atomicReference;
        this.f20272i = new AtomicReference(new TaskCompletionSource());
        this.f20264a = context;
        this.f20265b = kVar;
        this.f20267d = f10;
        this.f20266c = hVar;
        this.f20268e = aVar;
        this.f20269f = lVar;
        this.f20270g = g10;
        atomicReference.set(b.b(f10));
    }

    public static g l(Context context, String str, L l10, P4.b bVar, String str2, String str3, Q4.g gVar, G g10) {
        String strG = l10.g();
        g0 g0Var = new g0();
        return new g(context, new k(str, l10.h(), l10.i(), l10.j(), l10, AbstractC5107i.h(AbstractC5107i.m(context), str, str3, str2), str3, str2, H.determineFrom(strG).getId()), g0Var, new h(g0Var), new S4.a(gVar), new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), g10);
    }

    private d m(e eVar) throws Throwable {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject jSONObjectB = this.f20268e.b();
                if (jSONObjectB != null) {
                    d dVarB = this.f20266c.b(jSONObjectB);
                    if (dVarB != null) {
                        q(jSONObjectB, "Loaded cached settings: ");
                        long jA = this.f20267d.a();
                        if (e.IGNORE_CACHE_EXPIRATION.equals(eVar) || !dVarB.a(jA)) {
                            try {
                                I4.g.f().i("Returning cached settings.");
                                dVar = dVarB;
                            } catch (Exception e10) {
                                e = e10;
                                dVar = dVarB;
                                I4.g.f().e("Failed to get cached settings", e);
                                return dVar;
                            }
                        } else {
                            I4.g.f().i("Cached settings have expired.");
                        }
                    } else {
                        I4.g.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    I4.g.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return dVar;
    }

    private String n() {
        return AbstractC5107i.q(this.f20264a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        I4.g.f().b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        SharedPreferences.Editor editorEdit = AbstractC5107i.q(this.f20264a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }

    @Override // S4.j
    public Task a() {
        return ((TaskCompletionSource) this.f20272i.get()).getTask();
    }

    @Override // S4.j
    public d b() {
        return (d) this.f20271h.get();
    }

    boolean k() {
        return !n().equals(this.f20265b.f20281f);
    }

    public Task o(L4.f fVar) {
        return p(e.USE_CACHE, fVar);
    }

    public Task p(e eVar, L4.f fVar) throws Throwable {
        d dVarM;
        if (!k() && (dVarM = m(eVar)) != null) {
            this.f20271h.set(dVarM);
            ((TaskCompletionSource) this.f20272i.get()).trySetResult(dVarM);
            return Tasks.forResult(null);
        }
        d dVarM2 = m(e.IGNORE_CACHE_EXPIRATION);
        if (dVarM2 != null) {
            this.f20271h.set(dVarM2);
            ((TaskCompletionSource) this.f20272i.get()).trySetResult(dVarM2);
        }
        return this.f20270g.k().onSuccessTask(fVar.f11229a, new a(fVar));
    }
}
