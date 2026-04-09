package C;

import G0.e;
import G3.b;
import W.F;
import W.F.c;
import W.F.d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.InterfaceC1700l0;
import androidx.preference.Preference;
import com.applovin.impl.AbstractC2113d;
import com.applovin.impl.C2131m;
import com.applovin.impl.C2139p0;
import com.applovin.impl.d2;
import com.applovin.impl.j2;
import com.applovin.impl.k2;
import com.applovin.impl.q6;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.yandex.mobile.ads.impl.C4130i5;
import com.yandex.mobile.ads.impl.C4165n5;
import com.yandex.mobile.ads.impl.c21;
import com.yandex.mobile.ads.impl.ed;
import com.yandex.mobile.ads.impl.j21;
import com.yandex.mobile.ads.impl.jj0;
import com.yandex.mobile.ads.impl.l52;
import com.yandex.mobile.ads.impl.n00;
import com.yandex.mobile.ads.impl.nr0;
import com.yandex.mobile.ads.impl.rj0;
import com.yandex.mobile.ads.impl.tn0;
import com.yandex.mobile.ads.impl.vi0;
import com.zipoapps.premiumhelper.ui.preferences.common.OpenSettingsPreference;
import com.zipoapps.premiumhelper.ui.preferences.common.SafeClickPreference;
import com.zipoapps.premiumhelper.ui.settings.PHSettingsActivity;
import com.zipoapps.premiumhelper.ui.settings.b;
import g0.C4366m;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.impl.J9;
import io.appmetrica.analytics.impl.We;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o0.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements b.c, InterfaceC1700l0.a, b.a, e.a, AbstractC2113d.b, C2139p0.c, k2.a, j21.a, n00.g.a, C4130i5.a, vi0.b, nr0.a, ActivationBarrierCallback, Preference.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f695b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f696c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f697d;

    public /* synthetic */ e0(int i, Object obj, Object obj2) {
        this.f695b = i;
        this.f696c = obj;
        this.f697d = obj2;
    }

    @Override // com.yandex.mobile.ads.impl.n00.g.a
    public List a(int i, l52 l52Var, int[] iArr) {
        return n00.a((n00.c) this.f696c, (String) this.f697d, i, l52Var, iArr);
    }

    @Override // G0.e.a
    public void b() throws Throwable {
        ((K1.i) this.f696c).cancel();
        ((E) this.f697d).run();
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0.a
    public void c(InterfaceC1700l0 interfaceC1700l0) {
        E.v vVar = (E.v) this.f696c;
        vVar.getClass();
        ((InterfaceC1700l0.a) this.f697d).c(vVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.String r11) throws org.json.JSONException {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f696c
            o6.e r0 = (o6.C5428e) r0
            java.lang.String r1 = "this$0"
            kotlin.jvm.internal.l.f(r0, r1)
            java.lang.Object r1 = r10.f697d
            Q6.c r1 = (Q6.c) r1
            q6.c r0 = r0.f44868e
            java.lang.String r2 = "Stored value '"
            java.lang.String r3 = "stored_value_"
            java.lang.String r3 = r3.concat(r11)
            b9.p r0 = r0.f45443a
            java.lang.Object r4 = r0.getValue()
            F7.o r4 = (F7.o) r4
            java.util.List r5 = E.u.G(r3)
            F7.s r4 = r4.b(r5)
            java.util.List<F7.p> r5 = r4.f1710b
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L2f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L3f
            java.lang.Object r6 = r5.next()
            F7.p r6 = (F7.p) r6
            r1.a(r6)
            goto L2f
        L3f:
            java.util.List<J7.a> r4 = r4.f1709a
            java.lang.Object r4 = c9.C2097r.q0(r4)
            J7.a r4 = (J7.a) r4
            r5 = 0
            if (r4 == 0) goto L75
            org.json.JSONObject r4 = r4.getData()
            if (r4 != 0) goto L51
            goto L75
        L51:
            java.lang.String r6 = "expiration_time"
            boolean r7 = r4.has(r6)
            if (r7 == 0) goto L77
            long r6 = r4.getLong(r6)
            long r8 = java.lang.System.currentTimeMillis()
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 < 0) goto L77
            java.lang.Object r11 = r0.getValue()
            F7.o r11 = (F7.o) r11
            C9.r r0 = new C9.r
            r1 = 11
            r0.<init>(r3, r1)
            r11.a(r0)
        L75:
            r11 = r5
            goto Ld0
        L77:
            java.lang.String r0 = "type"
            java.lang.String r0 = r4.getString(r0)     // Catch: org.json.JSONException -> Lb5
            Z6.c$h$a r3 = Z6.c.h.Converter     // Catch: org.json.JSONException -> Lb5
            java.lang.String r6 = "typeStrValue"
            kotlin.jvm.internal.l.e(r0, r6)     // Catch: org.json.JSONException -> Lb5
            r3.getClass()     // Catch: org.json.JSONException -> Lb5
            Z6.c$h r3 = Z6.c.h.a.a(r0)     // Catch: org.json.JSONException -> Lb5
            if (r3 != 0) goto Lb0
            q6.a r3 = new q6.a     // Catch: org.json.JSONException -> Lb5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Lb5
            r4.<init>(r2)     // Catch: org.json.JSONException -> Lb5
            r4.append(r11)     // Catch: org.json.JSONException -> Lb5
            java.lang.String r6 = "' declaration failed because of unknown type '"
            r4.append(r6)     // Catch: org.json.JSONException -> Lb5
            r4.append(r0)     // Catch: org.json.JSONException -> Lb5
            r0 = 39
            r4.append(r0)     // Catch: org.json.JSONException -> Lb5
            java.lang.String r0 = r4.toString()     // Catch: org.json.JSONException -> Lb5
            r4 = 2
            r3.<init>(r4, r5, r0)     // Catch: org.json.JSONException -> Lb5
            r1.a(r3)     // Catch: org.json.JSONException -> Lb5
            goto L75
        Lb0:
            Z6.c r11 = q6.C5494c.a(r4, r3, r11)     // Catch: org.json.JSONException -> Lb5
            goto Ld0
        Lb5:
            r0 = move-exception
            q6.a r3 = new q6.a
            java.lang.String r4 = "' declaration failed: "
            java.lang.StringBuilder r11 = N7.B8.k(r2, r11, r4)
            java.lang.String r2 = r0.getMessage()
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            r3.<init>(r11, r0)
            r1.a(r3)
            goto L75
        Ld0:
            if (r11 == 0) goto Ld6
            java.lang.Object r5 = r11.b()
        Ld6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: C.e0.d(java.lang.String):java.lang.Object");
    }

    @Override // androidx.preference.Preference.c
    public boolean e(Preference it) {
        Object obj = this.f697d;
        Object obj2 = this.f696c;
        switch (this.f695b) {
            case 19:
                kotlin.jvm.internal.l.f(it, "it");
                b.a aVar = new b.a();
                String str = ((OpenSettingsPreference) obj2).f37076O;
                if (str != null) {
                    aVar.f37153a = str;
                }
                com.zipoapps.premiumhelper.ui.settings.b bVar = new com.zipoapps.premiumhelper.ui.settings.b(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, aVar.f37153a);
                int i = PHSettingsActivity.f37122d;
                Context context = (Context) obj;
                Intent intent = new Intent(context, (Class<?>) PHSettingsActivity.class);
                intent.putExtras(bVar.a());
                context.startActivity(intent);
                return true;
            default:
                kotlin.jvm.internal.l.f(it, "it");
                SafeClickPreference safeClickPreference = (SafeClickPreference) obj2;
                if (System.currentTimeMillis() - safeClickPreference.f37083N < 1500) {
                    va.a.f47104a.a("Preference click is less than 1 seconds from the last click. Click denied.", new Object[0]);
                    return false;
                }
                safeClickPreference.f37083N = System.currentTimeMillis();
                va.a.f47104a.a("Preference click interval is ok, click allowed & lastClickTime updated.", new Object[0]);
                return ((Preference.c) obj).e(safeClickPreference);
        }
    }

    @Override // G3.b.a
    public Object execute() {
        return ((E3.j) this.f696c).f1399c.H((y3.j) this.f697d);
    }

    @Override // o0.b.c
    public Object i(b.a aVar) {
        int i = 1;
        int i10 = 2;
        int i11 = 0;
        Object obj = this.f697d;
        Object obj2 = this.f696c;
        switch (this.f695b) {
            case 0:
                ((AtomicReference) obj2).set(aVar);
                return B4.f.c(new StringBuilder(), (String) obj, "-cancellation");
            case 4:
                W.F f10 = (W.F) obj2;
                f10.getClass();
                N.f fVar = new N.f(i, f10, aVar);
                Z.h hVar = f10.f13083C;
                F.c cVar = f10.new c(fVar);
                H.g gVar = hVar.f13910a;
                H.g gVar2 = f10.f13113d;
                gVar.execute(new Z.e(hVar, gVar2, cVar, i11));
                f10.f13086F.j(f10.new d(aVar, fVar, (F.h) obj), gVar2);
                return "audioEncodingFuture";
            case 5:
                ((W.T) obj2).getClass();
                H0.b bVar = (H0.b) obj;
                bVar.f14887b.f14954g.f14935a.put("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                W.U u8 = new W.U(atomicBoolean, aVar, bVar);
                aVar.a(new J4.f(atomicBoolean, bVar, u8, i10), E.u.y());
                bVar.f14887b.b(u8);
                return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
            default:
                C4366m c4366m = (C4366m) obj2;
                c4366m.getClass();
                S.a("TextureViewImpl", "Surface set on Preview.");
                Surface surface = (Surface) obj;
                c4366m.f37933h.b(surface, E.u.y(), new E.y(aVar, 5));
                return "provideSurface[request=" + c4366m.f37933h + " surface=" + surface + "]";
        }
    }

    @Override // com.yandex.mobile.ads.impl.nr0.a
    public void invoke(Object obj) {
        ed edVar = (ed) obj;
        switch (this.f695b) {
            case 13:
                edVar.getClass();
                break;
            case 14:
                edVar.getClass();
                break;
            default:
                edVar.getClass();
                break;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public void onWaitFinished() {
        We.a((We) this.f696c, (J9) this.f697d);
    }

    @Override // com.yandex.mobile.ads.impl.C4130i5.a
    public void a() {
        C4165n5.a((C4165n5) this.f696c, (tn0) this.f697d);
    }

    @Override // com.applovin.impl.AbstractC2113d.b
    public void a(Activity activity) {
        ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize((C2131m) this.f696c, (com.applovin.impl.sdk.k) this.f697d);
    }

    @Override // com.yandex.mobile.ads.impl.vi0.b
    public void a(Bitmap bitmap) {
        rj0.a((rj0) this.f696c, (jj0) this.f697d, bitmap);
    }

    @Override // com.applovin.impl.k2.a
    public void a(d2 d2Var, j2 j2Var) {
        ((q6) this.f696c).a((com.applovin.impl.sdk.k) this.f697d, d2Var, j2Var);
    }

    @Override // com.applovin.impl.C2139p0.c
    public void a(C2139p0.b bVar) {
        ((C2139p0) this.f696c).a((C2139p0.c) this.f697d, bVar);
    }

    @Override // com.yandex.mobile.ads.impl.j21.a
    public void a(String str) {
        c21.a((c21) this.f696c, (String) this.f697d, str);
    }
}
