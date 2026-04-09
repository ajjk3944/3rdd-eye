package ul;

import br.l;
import ch.f;
import mq.x;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.staircase3.opensignal.utils.a f23591a;

    /* renamed from: b, reason: collision with root package name */
    public final f f23592b;

    public a(com.staircase3.opensignal.utils.a aVar, f fVar) {
        l.e(aVar, "analytics");
        l.e(fVar, "deviceSdk");
        this.f23591a = aVar;
        this.f23592b = fVar;
    }

    public final void a(String str) {
        this.f23591a.d("CATEGORY_ONBOARDING", "exit_".concat(str), x.f16946a);
    }
}
