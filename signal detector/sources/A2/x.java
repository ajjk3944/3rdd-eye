package A2;

import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC0640Nf;
import com.google.android.gms.internal.ads.InterfaceC0425Al;
import org.json.JSONException;
import t2.C2911G;
import t2.HandlerC2908D;

/* loaded from: classes.dex */
public final class x implements InterfaceC0425Al {

    /* renamed from: a, reason: collision with root package name */
    public final r f348a;

    /* renamed from: b, reason: collision with root package name */
    public final int f349b;

    /* renamed from: c, reason: collision with root package name */
    public final String f350c;

    public x(r rVar, int i, String str) {
        this.f348a = rVar;
        this.f349b = i;
        this.f350c = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0425Al
    public final void a(w wVar) throws JSONException, V2.d {
        if (wVar == null || this.f349b != 2 || TextUtils.isEmpty(this.f350c)) {
            return;
        }
        A1.d dVar = new A1.d(this, wVar, 2, false);
        HandlerC2908D handlerC2908D = C2911G.f23576l;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            dVar.run();
        } else {
            AbstractC0640Nf.f10005a.execute(dVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0425Al
    public final void x(String str) {
    }
}
