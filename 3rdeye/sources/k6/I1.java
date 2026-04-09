package K6;

import H6.C0672i;
import N7.C1217ic;
import N7.C1259lc;
import N7.S2;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import c9.C2092m;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import j6.RunnableC5197b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import x6.AbstractC5774f;
import x6.C5770b;
import x6.C5771c;
import x6.C5776h;
import x6.C5777i;
import x6.C5778j;
import x6.InterfaceC5772d;
import z6.C5865d;

/* compiled from: DivVideoBinder.kt */
/* loaded from: classes.dex */
public final class I1 extends H6.B {

    /* renamed from: c, reason: collision with root package name */
    public final s6.g f3241c;

    /* renamed from: d, reason: collision with root package name */
    public final C5778j f3242d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f3243e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC5772d.a f3244f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I1(D d10, s6.g gVar, C0745n c0745n, C5778j c5778j, ExecutorService executorService, InterfaceC5772d.a playerFactory) {
        super(d10);
        kotlin.jvm.internal.l.f(executorService, "executorService");
        kotlin.jvm.internal.l.f(playerFactory, "playerFactory");
        this.f3241c = gVar;
        this.f3242d = c5778j;
        this.f3243e = executorService;
        this.f3244f = playerFactory;
    }

    @Override // H6.B
    public final void e(View view, C0672i c0672i, S2 s22, S2 s23, C5865d path) {
        J1 j12;
        AttributeSet attributeSet;
        AbstractC5774f c5771c;
        J1 j13;
        C1217ic c1217ic;
        Iterator it;
        Uri uri;
        C5776h c5776h;
        O6.D d10 = (O6.D) view;
        C1217ic c1217ic2 = (C1217ic) s22;
        C1217ic c1217ic3 = (C1217ic) s23;
        kotlin.jvm.internal.l.f(d10, "<this>");
        kotlin.jvm.internal.l.f(path, "path");
        A7.d resolver = c0672i.f2147b;
        kotlin.jvm.internal.l.f(resolver, "resolver");
        List<C1259lc> list = c1217ic2.f8438Q;
        ArrayList arrayList = new ArrayList(C2092m.T(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1259lc c1259lc = (C1259lc) it2.next();
            Uri uriA = c1259lc.f8741d.a(resolver);
            String strA = c1259lc.f8739b.a(resolver);
            C1259lc.a aVar = c1259lc.f8740c;
            if (aVar != null) {
                uri = uriA;
                int iLongValue = (int) aVar.f8744b.a(resolver).longValue();
                Long lA = aVar.f8743a.a(resolver);
                c1217ic = c1217ic3;
                it = it2;
                c5776h = new C5776h(iLongValue, (int) lA.longValue());
            } else {
                c1217ic = c1217ic3;
                it = it2;
                uri = uriA;
                c5776h = null;
            }
            A7.b<Long> bVar = c1259lc.f8738a;
            arrayList.add(new C5777i(uri, strA, c5776h, bVar != null ? bVar.a(resolver) : null));
            c1217ic3 = c1217ic;
            it2 = it;
        }
        C1217ic c1217ic4 = c1217ic3;
        c1217ic2.f8450g.a(resolver).getClass();
        A7.b<Boolean> bVar2 = c1217ic2.f8465w;
        bVar2.a(resolver).getClass();
        c1217ic2.f8424C.a(resolver).getClass();
        AbstractC5774f playerView = d10.getPlayerView();
        int childCount = d10.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                j12 = null;
                break;
            }
            View childAt = d10.getChildAt(i);
            if (childAt instanceof J1) {
                j12 = (J1) childAt;
                break;
            }
            i++;
        }
        InterfaceC5772d.a aVar2 = this.f3244f;
        if (playerView == null) {
            Context context = d10.getContext();
            kotlin.jvm.internal.l.e(context, "context");
            aVar2.getClass();
            attributeSet = null;
            c5771c = new C5771c(context, null, R.attr.divImageStyle);
            c5771c.setVisibility(4);
        } else {
            attributeSet = null;
            c5771c = playerView;
        }
        if (j12 == null) {
            Context context2 = d10.getContext();
            kotlin.jvm.internal.l.e(context2, "context");
            j13 = new J1(context2, attributeSet);
            j13.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            j13.setBackgroundColor(0);
            j13.setVisibility(4);
        } else {
            j13 = j12;
        }
        F1 f12 = new F1(c5771c, j13);
        A7.b<String> bVar3 = c1217ic2.f8423B;
        String strA2 = bVar3 != null ? bVar3.a(resolver) : null;
        if (strA2 == null) {
            f12.invoke(null);
        } else {
            this.f3243e.submit(new RunnableC5197b(strA2, false, f12));
        }
        aVar2.getClass();
        C5770b c5770b = new C5770b();
        String str = c1217ic2.f8455m;
        if (str != null) {
            d10.b(this.f3241c.a(c0672i, str, new H1(c5770b), path));
        }
        d10.b(bVar2.e(resolver, new C9.r(c5770b, 6)));
        d10.b(c1217ic2.f8428G.e(resolver, new H6.y(5, c5771c, j13)));
        if (j12 == null && playerView == null) {
            d10.removeAllViews();
            d10.addView(c5771c);
            d10.addView(j13);
        }
        C5778j c5778j = this.f3242d;
        c5778j.getClass();
        c5778j.f47796a.put(d10, c1217ic2);
        C0713c.s(d10, c1217ic2.f8449f, c1217ic4 != null ? c1217ic4.f8449f : null, resolver);
    }
}
