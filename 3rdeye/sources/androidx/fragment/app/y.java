package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.InterfaceC1788v;
import androidx.lifecycle.InterfaceC1790x;
import java.util.Map;

/* compiled from: FragmentManager.java */
/* loaded from: classes.dex */
public final class y implements InterfaceC1788v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B4.f f16016b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1781n f16017c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f16018d;

    public y(x xVar, B4.f fVar, AbstractC1781n abstractC1781n) {
        this.f16018d = xVar;
        this.f16016b = fVar;
        this.f16017c = abstractC1781n;
    }

    @Override // androidx.lifecycle.InterfaceC1788v
    public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
        Map<String, Bundle> map;
        Bundle bundle;
        AbstractC1781n.a aVar2 = AbstractC1781n.a.ON_START;
        x xVar = this.f16018d;
        if (aVar == aVar2 && (bundle = (map = xVar.f15985k).get("REQUEST_ACCOUNT_DELETE")) != null) {
            this.f16016b.f(bundle);
            map.remove("REQUEST_ACCOUNT_DELETE");
            if (x.G(2)) {
                Log.v("FragmentManager", "Clearing fragment result with key REQUEST_ACCOUNT_DELETE");
            }
        }
        if (aVar == AbstractC1781n.a.ON_DESTROY) {
            this.f16017c.removeObserver(this);
            xVar.f15986l.remove("REQUEST_ACCOUNT_DELETE");
        }
    }
}
