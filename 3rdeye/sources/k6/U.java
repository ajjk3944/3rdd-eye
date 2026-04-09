package K6;

import H6.C0672i;
import N7.C1333r3;
import N7.C1431y3;
import O6.InterfaceC1480f;
import android.view.ViewGroup;
import b9.C1992A;
import c9.C2099t;
import i7.C4460a;
import java.util.List;
import org.json.JSONException;
import z6.C5865d;

/* compiled from: DivContainerBinder.kt */
/* loaded from: classes.dex */
public final class U extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1333r3 f3337g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0672i f3338h;
    public final /* synthetic */ ViewGroup i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f3339j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1431y3 f3340k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C5865d f3341l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q6.c f3342m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C1333r3 c1333r3, C0672i c0672i, ViewGroup viewGroup, S s10, C1431y3 c1431y3, C5865d c5865d, Q6.c cVar) {
        super(1);
        this.f3337g = c1333r3;
        this.f3338h = c0672i;
        this.i = viewGroup;
        this.f3339j = s10;
        this.f3340k = c1431y3;
        this.f3341l = c5865d;
        this.f3342m = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p9.l
    public final C1992A invoke(Object it) throws JSONException {
        kotlin.jvm.internal.l.f(it, "it");
        C0672i c0672i = this.f3338h;
        List<i7.b> listA = C4460a.a(this.f3337g, c0672i.f2147b);
        ViewGroup viewGroup = this.i;
        kotlin.jvm.internal.l.d(viewGroup, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCollectionHolder");
        List<i7.b> items = ((InterfaceC1480f) viewGroup).getItems();
        if (items == null) {
            items = C2099t.f18581b;
        }
        List<i7.b> list = items;
        S s10 = this.f3339j;
        s10.t(viewGroup, c0672i.f2146a, list, listA);
        C5865d c5865d = this.f3341l;
        Q6.c cVar = this.f3342m;
        C1431y3 c1431y3 = this.f3340k;
        s10.p(this.i, c0672i, c1431y3, c1431y3, listA, list, c5865d, cVar);
        return C1992A.f18074a;
    }
}
