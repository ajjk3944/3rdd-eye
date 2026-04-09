package cj;

import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.x;
import com.opensignal.sdk.domain.ApplicationLifecycleListener;
import lq.b0;

/* loaded from: classes.dex */
public final class s extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3991d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ProcessLifecycleOwner f3992g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ApplicationLifecycleListener f3993r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(ProcessLifecycleOwner processLifecycleOwner, ApplicationLifecycleListener applicationLifecycleListener, int i10) {
        super(0);
        this.f3991d = i10;
        this.f3992g = processLifecycleOwner;
        this.f3993r = applicationLifecycleListener;
    }

    @Override // ar.a
    public final Object c() {
        x xVar;
        x xVar2;
        switch (this.f3991d) {
            case 0:
                ProcessLifecycleOwner processLifecycleOwner = this.f3992g;
                if (processLifecycleOwner != null && (xVar = processLifecycleOwner.f1470y) != null) {
                    xVar.V0(this.f3993r);
                }
                break;
            default:
                ProcessLifecycleOwner processLifecycleOwner2 = this.f3992g;
                if (processLifecycleOwner2 != null && (xVar2 = processLifecycleOwner2.f1470y) != null) {
                    xVar2.m1(this.f3993r);
                }
                break;
        }
        return b0.f15562a;
    }
}
