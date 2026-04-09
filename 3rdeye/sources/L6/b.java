package L6;

import H6.B;
import H6.C0672i;
import H6.C0683u;
import H6.H;
import K6.C0713c;
import K6.D;
import N7.C1322q5;
import O6.v;
import a9.InterfaceC1676a;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.DivLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager;
import z6.C5866e;
import z6.C5867f;

/* compiled from: DivGalleryBinder.kt */
/* loaded from: classes.dex */
public final class b extends B {

    /* renamed from: c, reason: collision with root package name */
    public final D f4075c;

    /* renamed from: d, reason: collision with root package name */
    public final H f4076d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1676a<C0683u> f4077e;

    /* renamed from: f, reason: collision with root package name */
    public final B7.b f4078f;

    /* renamed from: g, reason: collision with root package name */
    public final float f4079g;

    /* compiled from: DivGalleryBinder.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4080a;

        static {
            int[] iArr = new int[C1322q5.c.values().length];
            try {
                iArr[C1322q5.c.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C1322q5.c.PAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4080a = iArr;
        }
    }

    public b(D d10, H h10, InterfaceC1676a<C0683u> interfaceC1676a, B7.b bVar, float f10) {
        super(d10);
        this.f4075c = d10;
        this.f4076d = h10;
        this.f4077e = interfaceC1676a;
        this.f4078f = bVar;
        this.f4079g = f10;
    }

    public final void m(v vVar, C0672i c0672i, C1322q5 c1322q5) {
        r7.i iVar;
        String str;
        int i;
        l lVar;
        DisplayMetrics metrics = vVar.getResources().getDisplayMetrics();
        A7.b<C1322q5.b> bVar = c1322q5.f8979x;
        A7.d dVar = c0672i.f2147b;
        int paddingStart = 0;
        int i10 = bVar.a(dVar) == C1322q5.b.HORIZONTAL ? 0 : 1;
        boolean z10 = c1322q5.f8941D.a(dVar) == C1322q5.d.AUTO;
        vVar.setVerticalScrollBarEnabled(z10 && i10 == 1);
        vVar.setHorizontalScrollBarEnabled(z10 && i10 == 0);
        vVar.setScrollbarFadingEnabled(false);
        A7.b<Long> bVar2 = c1322q5.f8964h;
        long jLongValue = bVar2 != null ? bVar2.a(dVar).longValue() : 1L;
        vVar.setClipChildren(false);
        A7.b<Long> bVar3 = c1322q5.f8975t;
        if (jLongValue == 1) {
            Long lA = bVar3.a(dVar);
            kotlin.jvm.internal.l.e(metrics, "metrics");
            iVar = new r7.i(C0713c.B(lA, metrics), 0, i10, 61);
        } else {
            Long lA2 = bVar3.a(dVar);
            kotlin.jvm.internal.l.e(metrics, "metrics");
            int iB = C0713c.B(lA2, metrics);
            A7.b<Long> bVar4 = c1322q5.f8966k;
            if (bVar4 == null) {
                bVar4 = bVar3;
            }
            iVar = new r7.i(iB, C0713c.B(bVar4.a(dVar), metrics), i10, 57);
        }
        for (int itemDecorationCount = vVar.getItemDecorationCount() - 1; -1 < itemDecorationCount; itemDecorationCount--) {
            vVar.removeItemDecorationAt(itemDecorationCount);
        }
        vVar.addItemDecoration(iVar);
        C1322q5.c cVarA = c1322q5.f8940C.a(dVar);
        vVar.setScrollMode(cVarA);
        int i11 = a.f4080a[cVarA.ordinal()];
        if (i11 == 1) {
            k pagerSnapStartHelper = vVar.getPagerSnapStartHelper();
            if (pagerSnapStartHelper != null) {
                pagerSnapStartHelper.a(null);
            }
        } else if (i11 == 2) {
            Long lA3 = bVar3.a(dVar);
            DisplayMetrics displayMetrics = vVar.getResources().getDisplayMetrics();
            kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
            C0713c.B(lA3, displayMetrics);
            k pagerSnapStartHelper2 = vVar.getPagerSnapStartHelper();
            if (pagerSnapStartHelper2 == null) {
                pagerSnapStartHelper2 = new k();
                vVar.setPagerSnapStartHelper(pagerSnapStartHelper2);
            }
            pagerSnapStartHelper2.a(vVar);
        }
        e divLinearLayoutManager = jLongValue == 1 ? new DivLinearLayoutManager(c0672i, vVar, c1322q5, i10) : new DivGridLayoutManager(c0672i, vVar, c1322q5, i10);
        vVar.setLayoutManager(divLinearLayoutManager.n());
        vVar.setScrollInterceptionAngle(this.f4079g);
        vVar.clearOnScrollListeners();
        C5866e currentState = c0672i.f2146a.getCurrentState();
        if (currentState != null) {
            String strValueOf = c1322q5.f8973r;
            if (strValueOf == null) {
                strValueOf = String.valueOf(c1322q5.hashCode());
            }
            C5866e.a aVar = (C5866e.a) currentState.f48466b.get(strValueOf);
            C5867f c5867f = aVar instanceof C5867f ? (C5867f) aVar : null;
            if (c5867f != null) {
                i = c5867f.f48467a;
                str = strValueOf;
            } else {
                str = strValueOf;
                long jLongValue2 = c1322q5.f8967l.a(dVar).longValue();
                long j4 = jLongValue2 >> 31;
                i = (j4 == 0 || j4 == -1) ? (int) jLongValue2 : jLongValue2 > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
            }
            if (c5867f != null) {
                paddingStart = c5867f.f48468b;
            } else if (i == 0) {
                paddingStart = i10 == 0 ? vVar.getPaddingStart() : vVar.getPaddingTop();
            }
            int i12 = m.f4103a[cVarA.ordinal()];
            if (i12 == 1) {
                lVar = l.DEFAULT;
            } else {
                if (i12 != 2) {
                    throw new b9.j();
                }
                lVar = l.CENTER;
            }
            Object layoutManager = vVar.getLayoutManager();
            e eVar = layoutManager instanceof e ? (e) layoutManager : null;
            if (eVar != null) {
                if (paddingStart == 0 && i == 0) {
                    eVar.c(i, lVar);
                } else {
                    eVar.d(i, paddingStart, lVar);
                }
            }
            vVar.addOnScrollListener(new z6.k(str, currentState, divLinearLayoutManager));
        }
        vVar.addOnScrollListener(new i(c0672i, vVar, divLinearLayoutManager, c1322q5));
        vVar.setOnInterceptTouchEventListener(c1322q5.f8981z.a(dVar).booleanValue() ? O6.H.f10376a : null);
    }
}
