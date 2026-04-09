package N6;

import H6.C0672i;
import H6.C0675l;
import N7.Ba;
import androidx.viewpager.widget.ViewPager;
import j6.g;
import java.util.LinkedHashMap;
import java.util.Map;
import o6.C5426c;
import z6.C5865d;

/* compiled from: DivTabsActiveStateTracker.kt */
/* loaded from: classes.dex */
public final class b implements ViewPager.j {

    /* renamed from: a, reason: collision with root package name */
    public final C0672i f4680a;

    /* renamed from: b, reason: collision with root package name */
    public final C5865d f4681b;

    /* renamed from: c, reason: collision with root package name */
    public final g.a f4682c;

    /* renamed from: d, reason: collision with root package name */
    public final F3.f f4683d;

    /* renamed from: e, reason: collision with root package name */
    public final p6.d f4684e;

    /* renamed from: f, reason: collision with root package name */
    public Ba f4685f;

    public b(C0672i c0672i, C5865d c5865d, g.a div2Logger, F3.f tabsStateCache, p6.d runtimeVisitor, Ba div) {
        kotlin.jvm.internal.l.f(div2Logger, "div2Logger");
        kotlin.jvm.internal.l.f(tabsStateCache, "tabsStateCache");
        kotlin.jvm.internal.l.f(runtimeVisitor, "runtimeVisitor");
        kotlin.jvm.internal.l.f(div, "div");
        this.f4680a = c0672i;
        this.f4681b = c5865d;
        this.f4682c = div2Logger;
        this.f4683d = tabsStateCache;
        this.f4684e = runtimeVisitor;
        this.f4685f = div;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        C5426c c5426cC;
        C0672i c0672i = this.f4680a;
        this.f4682c.getClass();
        C0675l divView = c0672i.f2146a;
        String str = divView.getDataTag().f38455a;
        C5865d c5865d = this.f4681b;
        String path = c5865d.b();
        F3.f fVar = this.f4683d;
        fVar.getClass();
        kotlin.jvm.internal.l.f(path, "path");
        LinkedHashMap linkedHashMap = (LinkedHashMap) fVar.f1607b;
        Object linkedHashMap2 = linkedHashMap.get(str);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(str, linkedHashMap2);
        }
        ((Map) linkedHashMap2).put(path, Integer.valueOf(i));
        Ba div = this.f4685f;
        p6.d dVar = this.f4684e;
        dVar.getClass();
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(div, "div");
        A7.d expressionResolver = c0672i.f2147b;
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        p6.h runtimeStore$div_release = divView.getRuntimeStore$div_release();
        if (runtimeStore$div_release == null || (c5426cC = runtimeStore$div_release.c(expressionResolver)) == null) {
            return;
        }
        c5426cC.a(divView);
        dVar.h(div, divView, c5865d.b(), p6.d.d(c5865d), c5426cC);
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f10, int i10) {
    }
}
