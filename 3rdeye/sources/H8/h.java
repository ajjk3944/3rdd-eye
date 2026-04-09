package H8;

import J8.E;
import androidx.recyclerview.widget.RecyclerView;
import com.zipoapps.premiumhelper.ui.splash.PHSplashActivity;

/* compiled from: PHSplashActivity.kt */
@h9.e(c = "com.zipoapps.premiumhelper.ui.splash.PHSplashActivity", f = "PHSplashActivity.kt", l = {106, 109, 118}, m = "waitForInitComplete")
/* loaded from: classes3.dex */
public final class h extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public Object f2321l;

    /* renamed from: m, reason: collision with root package name */
    public E f2322m;

    /* renamed from: n, reason: collision with root package name */
    public long f2323n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2324o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ PHSplashActivity f2325p;

    /* renamed from: q, reason: collision with root package name */
    public int f2326q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PHSplashActivity pHSplashActivity, h9.c cVar) {
        super(cVar);
        this.f2325p = pHSplashActivity;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f2324o = obj;
        this.f2326q |= RecyclerView.UNDEFINED_DURATION;
        return PHSplashActivity.k(this.f2325p, this);
    }
}
