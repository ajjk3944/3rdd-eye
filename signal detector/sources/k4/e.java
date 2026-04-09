package K4;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.ads.AbstractC0709Rg;
import com.google.android.gms.internal.ads.AbstractC0933bL;
import com.google.android.gms.internal.ads.AbstractC1114el;
import com.google.android.gms.internal.ads.Ay;
import com.google.android.gms.internal.ads.C0682Pn;
import com.google.android.gms.internal.ads.C0745Ti;
import com.google.android.gms.internal.ads.C0901aq;
import com.google.android.gms.internal.ads.C0902ar;
import com.google.android.gms.internal.ads.C0922bA;
import com.google.android.gms.internal.ads.C1163ff;
import com.google.android.gms.internal.ads.C1440ko;
import com.google.android.gms.internal.ads.C1613nz;
import com.google.android.gms.internal.ads.C1768qs;
import com.google.android.gms.internal.ads.C1799rN;
import com.google.android.gms.internal.ads.C1811ri;
import com.google.android.gms.internal.ads.C1840sA;
import com.google.android.gms.internal.ads.C1907tN;
import com.google.android.gms.internal.ads.C1922tl;
import com.google.android.gms.internal.ads.C1927tq;
import com.google.android.gms.internal.ads.C2123xN;
import com.google.android.gms.internal.ads.C2197yq;
import com.google.android.gms.internal.ads.InterfaceC0730Sk;
import com.google.android.gms.internal.ads.InterfaceC1544mk;
import com.google.android.gms.internal.ads.InterfaceC1853sN;
import com.google.android.gms.internal.ads.InterfaceC2084wl;
import com.google.android.gms.internal.ads.Ry;
import com.google.android.gms.internal.ads.Xx;
import com.google.android.gms.internal.ads.Yx;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.slider.Slider;
import com.lefan.signal.ui.noise.NoiseTrendView;
import com.lefan.signal.ui.noise.NoiseView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k2.InterfaceC2625d;

/* loaded from: classes.dex */
public final class e implements O0.a {

    /* renamed from: C, reason: collision with root package name */
    public Object f2236C;

    /* renamed from: a, reason: collision with root package name */
    public final Object f2237a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2238b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2239c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2240d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2241e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2242f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2243g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2244h;
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2245j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f2246k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f2247l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f2248m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2249n;

    public e() {
        this.f2237a = new HashSet();
        this.f2238b = new HashSet();
        this.f2239c = new HashSet();
        this.f2240d = new HashSet();
        this.f2241e = new HashSet();
        this.f2242f = new HashSet();
        this.f2243g = new HashSet();
        this.f2244h = new HashSet();
        this.i = new HashSet();
        this.f2245j = new HashSet();
        this.f2246k = new HashSet();
        this.f2247l = new HashSet();
        this.f2248m = new HashSet();
        this.f2249n = new HashSet();
    }

    public void a(InterfaceC1544mk interfaceC1544mk, Executor executor) {
        ((HashSet) this.i).add(new C1922tl(interfaceC1544mk, executor));
    }

    public void b(InterfaceC2625d interfaceC2625d, Executor executor) {
        ((HashSet) this.f2246k).add(new C1922tl(interfaceC2625d, executor));
    }

    public void c(InterfaceC2084wl interfaceC2084wl, Executor executor) {
        ((HashSet) this.f2240d).add(new C1922tl(interfaceC2084wl, executor));
    }

    public void d(InterfaceC0730Sk interfaceC0730Sk, Executor executor) {
        ((HashSet) this.f2238b).add(new C1922tl(interfaceC0730Sk, executor));
    }

    @Override // O0.a
    public View getRoot() {
        return (LinearLayoutCompat) this.f2237a;
    }

    public e(ExecutorService executorService, Context context, Xx xx) {
        this.f2237a = this;
        C1907tN c1907tNA = C1907tN.a(context);
        this.f2238b = c1907tNA;
        C1799rN c1799rNA = C1799rN.a(AbstractC1114el.f13942K);
        this.f2239c = c1799rNA;
        C1907tN c1907tNA2 = C1907tN.a(executorService);
        this.f2240d = c1907tNA2;
        int i = 0;
        C1799rN c1799rNA2 = C1799rN.a(new C1840sA(c1907tNA, c1799rNA, c1907tNA2, i));
        int i3 = 2;
        C1799rN c1799rNA3 = C1799rN.a(new C1163ff(c1907tNA, c1907tNA2, i3));
        C1799rN c1799rNA4 = C1799rN.a(new C1163ff(c1907tNA, c1907tNA2, 3));
        C1799rN c1799rNA5 = C1799rN.a(new C0902ar(C1799rN.a(c1907tNA2), c1799rNA, 13));
        C1799rN c1799rNA6 = C1799rN.a(AbstractC0933bL.f13374y);
        C1907tN c1907tNA3 = C1907tN.a(xx);
        this.f2241e = c1907tNA3;
        C1799rN c1799rNA7 = C1799rN.a(new C1927tq(c1799rNA5, c1799rNA6, c1907tNA3, 8));
        this.f2242f = c1799rNA7;
        int i6 = 1;
        C1799rN c1799rNA8 = C1799rN.a(new C1163ff(c1907tNA2, c1907tNA3, i6));
        this.f2243g = c1799rNA8;
        C1799rN c1799rNA9 = C1799rN.a(new Ay(c1907tNA, c1799rNA7, c1907tNA2, c1799rNA8, c1907tNA3));
        this.f2244h = c1799rNA9;
        int i7 = C2123xN.f17584c;
        ArrayList arrayList = new ArrayList(4);
        List list = Collections.EMPTY_LIST;
        arrayList.add(c1799rNA2);
        arrayList.add(c1799rNA3);
        arrayList.add(c1799rNA4);
        arrayList.add(c1799rNA9);
        C2123xN c2123xN = new C2123xN(arrayList, list);
        C1799rN c1799rNA10 = C1799rN.a(new C1811ri(23, new Yx(i, this)));
        C1799rN c1799rNA11 = C1799rN.a(new C1811ri(24, new Yx(i6, this)));
        C1799rN c1799rNA12 = C1799rN.a(new C1811ri(25, new Yx(i3, this)));
        C1799rN c1799rNA13 = C1799rN.a(new C0902ar(c1799rNA, c1799rNA9, 15));
        this.i = c1799rNA13;
        C1799rN c1799rNA14 = C1799rN.a(new Ry(c1907tNA3, C1799rN.a(new C2197yq(c1799rNA10, c1799rNA11, c1799rNA12, c1907tNA2, c1799rNA13)), c1799rNA9, c1907tNA2, c1799rNA13, 0));
        C1799rN c1799rNA15 = C1799rN.a(new C1440ko(c1907tNA2, 5));
        this.f2245j = c1799rNA15;
        C1799rN c1799rNA16 = C1799rN.a(new C1613nz(c1907tNA, c1799rNA13, c1907tNA3, c1799rNA15, 3));
        C1799rN c1799rNA17 = C1799rN.a(new C1613nz(c1907tNA, c1799rNA13, c1799rNA15, c1907tNA3, 4));
        ArrayList arrayList2 = new ArrayList(3);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(c1799rNA14);
        arrayList2.add(c1799rNA16);
        arrayList2.add(c1799rNA17);
        C1799rN c1799rNA18 = C1799rN.a(new C0745Ti((InterfaceC1853sN) c2123xN, (InterfaceC1853sN) new C2123xN(arrayList2, list2), (InterfaceC1853sN) c1907tNA2, c1799rNA13, 14));
        C1799rN c1799rNA19 = C1799rN.a(AbstractC0709Rg.f10916B);
        C1799rN c1799rNA20 = C1799rN.a(new C0922bA(c1799rNA, 6));
        ArrayList arrayList3 = new ArrayList(7);
        List list3 = Collections.EMPTY_LIST;
        arrayList3.add(c1799rNA19);
        arrayList3.add(c1799rNA2);
        arrayList3.add(c1799rNA3);
        arrayList3.add(c1799rNA20);
        arrayList3.add(c1799rNA4);
        arrayList3.add(c1799rNA16);
        arrayList3.add(c1799rNA17);
        C1799rN c1799rNA21 = C1799rN.a(new C1768qs(c1799rNA19, new C2123xN(arrayList3, list3), 11));
        this.f2246k = c1799rNA21;
        C1799rN c1799rNA22 = C1799rN.a(new C0901aq(c1799rNA13, 24));
        this.f2247l = c1799rNA22;
        this.f2248m = C1799rN.a(new C0682Pn(c1799rNA18, c1799rNA14, c1799rNA21, c1799rNA13, c1799rNA7, C1799rN.a(new C1613nz(c1907tNA, c1799rNA13, c1799rNA22, c1907tNA3, 2)), c1907tNA3, 4));
        this.f2249n = C1799rN.a(new C1440ko(c1907tNA, 4));
        this.f2236C = C1799rN.a(new C1440ko(c1907tNA2, 6));
    }

    public e(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, AppBarLayout appBarLayout, TextView textView, RelativeLayout relativeLayout, TextView textView2, TextView textView3, Toolbar toolbar, NoiseTrendView noiseTrendView, NoiseView noiseView, MaterialButton materialButton, AppCompatTextView appCompatTextView2, Slider slider, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.f2237a = linearLayoutCompat;
        this.f2238b = appCompatTextView;
        this.f2242f = appBarLayout;
        this.f2243g = textView;
        this.f2245j = relativeLayout;
        this.f2244h = textView2;
        this.i = textView3;
        this.f2246k = toolbar;
        this.f2247l = noiseTrendView;
        this.f2248m = noiseView;
        this.f2249n = materialButton;
        this.f2239c = appCompatTextView2;
        this.f2236C = slider;
        this.f2240d = appCompatTextView3;
        this.f2241e = appCompatTextView4;
    }
}
