package j6;

import H6.C0675l;
import H6.H;
import H6.K;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.InterfaceC1790x;
import b9.C2001h;
import b9.InterfaceC2000g;
import c9.C2095p;
import c9.C2097r;
import c9.C2099t;
import com.yandex.div.core.dagger.Div2Component;
import i6.C4458a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m0.C5308a;
import o6.C5426c;
import o6.C5428e;
import p7.C5477i;
import p7.InterfaceC5475g;
import p9.InterfaceC5480a;
import q7.C5495a;
import q7.C5496b;
import s6.C5581b;

/* compiled from: Div2Context.kt */
/* loaded from: classes.dex */
public class e extends ContextWrapper {
    public static final a Companion = new a();
    public static final int RESET_ERROR_COLLECTORS = 2;
    public static final int RESET_EXPRESSION_RUNTIMES = 1;
    private static final int RESET_NONE = 0;
    public static final int RESET_SELECTED_STATES = 4;
    public static final int RESET_VISIBILITY_COUNTERS = 8;
    private final ContextThemeWrapper baseContext;
    private final Div2Component div2Component;
    private final InterfaceC2000g globalVariableController$delegate;
    private LayoutInflater inflater;
    private final InterfaceC1790x lifecycleOwner;

    /* compiled from: Div2Context.kt */
    public static final class a {
    }

    /* compiled from: Div2Context.kt */
    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<s6.d> {
        public c() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final s6.d invoke() {
            kotlin.jvm.internal.l.e(e.this.getDiv2Component$div_release().n(), "div2Component.divVariableController");
            return new s6.d();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(ContextThemeWrapper baseContext, i configuration) {
        this(baseContext, configuration, 0, null, 12, null);
        kotlin.jvm.internal.l.f(baseContext, "baseContext");
        kotlin.jvm.internal.l.f(configuration, "configuration");
    }

    private LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflaterCloneInContext;
        LayoutInflater layoutInflater = this.inflater;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        synchronized (this) {
            layoutInflaterCloneInContext = this.inflater;
            if (layoutInflaterCloneInContext == null) {
                layoutInflaterCloneInContext = LayoutInflater.from(this.baseContext).cloneInContext(this);
                kotlin.jvm.internal.l.d(layoutInflaterCloneInContext, "null cannot be cast to non-null type android.view.LayoutInflater");
                layoutInflaterCloneInContext.setFactory2(new b(this));
                this.inflater = layoutInflaterCloneInContext;
            }
        }
        return layoutInflaterCloneInContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reset$default(e eVar, int i, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reset");
        }
        if ((i10 & 1) != 0) {
            i = 0;
        }
        if ((i10 & 2) != 0) {
            list = C2099t.f18581b;
        }
        eVar.reset(i, list);
    }

    public boolean cancelTooltips() {
        B6.k kVarE = getDiv2Component$div_release().E();
        LinkedHashMap linkedHashMap = kVarE.f557h;
        if (linkedHashMap.isEmpty()) {
            return false;
        }
        Iterator it = C2097r.G0(linkedHashMap.values()).iterator();
        while (it.hasNext()) {
            kVarE.c((B6.q) it.next());
        }
        linkedHashMap.clear();
        return true;
    }

    public e childContext(ContextThemeWrapper baseContext) {
        kotlin.jvm.internal.l.f(baseContext, "baseContext");
        return new e(baseContext, getDiv2Component$div_release(), getLifecycleOwner$div_release());
    }

    public Div2Component getDiv2Component$div_release() {
        return this.div2Component;
    }

    public C5581b getDivVariableController() {
        C5581b c5581bN = getDiv2Component$div_release().n();
        kotlin.jvm.internal.l.e(c5581bN, "div2Component.divVariableController");
        return c5581bN;
    }

    public s6.d getGlobalVariableController() {
        return (s6.d) this.globalVariableController$delegate.getValue();
    }

    public InterfaceC1790x getLifecycleOwner$div_release() {
        return this.lifecycleOwner;
    }

    public C5495a getPerformanceDependentSessionProfiler() {
        return getDiv2Component$div_release().p();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String name) {
        kotlin.jvm.internal.l.f(name, "name");
        return "layout_inflater".equals(name) ? getLayoutInflater() : this.baseContext.getSystemService(name);
    }

    public C5477i getViewPreCreationProfile() {
        return getDiv2Component$div_release().o().f2048d;
    }

    public C5496b getViewPreCreationProfileRepository() {
        return getDiv2Component$div_release().z();
    }

    public void reset(int i, List<? extends C4458a> tags) {
        kotlin.jvm.internal.l.f(tags, "tags");
        if ((i & 1) != 0) {
            C5428e c5428eT = getDiv2Component$div_release().t();
            boolean zIsEmpty = tags.isEmpty();
            Map<String, C5426c> map = c5428eT.f44869f;
            if (zIsEmpty) {
                map.clear();
            } else {
                Iterator<T> it = tags.iterator();
                while (it.hasNext()) {
                    map.remove(((C4458a) it.next()).f38455a);
                }
            }
        }
        if ((i & 2) != 0) {
            Q6.d dVarA = getDiv2Component$div_release().a();
            boolean zIsEmpty2 = tags.isEmpty();
            LinkedHashMap linkedHashMap = dVarA.f11323a;
            if (zIsEmpty2) {
                linkedHashMap.clear();
            } else {
                Iterator<T> it2 = tags.iterator();
                while (it2.hasNext()) {
                    linkedHashMap.remove(((C4458a) it2.next()).f38455a);
                }
            }
        }
        if ((i & 4) != 0) {
            A6.b bVarC = getDiv2Component$div_release().C();
            boolean zIsEmpty3 = tags.isEmpty();
            C5308a c5308a = (C5308a) bVarC.f42d;
            Q6.d dVar = (Q6.d) bVarC.f41c;
            E7.b bVar = (E7.b) bVarC.f40b;
            if (zIsEmpty3) {
                c5308a.clear();
                ((Map) bVar.f1475b).clear();
                ((Map) bVar.f1476c).clear();
                dVar.f11323a.clear();
            } else {
                for (C4458a c4458a : tags) {
                    c5308a.remove(c4458a);
                    String str = c4458a.f38455a;
                    ((Map) bVar.f1476c).remove(str);
                    Set setKeySet = ((Map) bVar.f1475b).keySet();
                    E7.a aVar = new E7.a(str, 0);
                    kotlin.jvm.internal.l.f(setKeySet, "<this>");
                    C2095p.e0(setKeySet, aVar, true);
                    String str2 = c4458a.f38455a;
                    synchronized (dVar.f11323a) {
                    }
                }
            }
        }
        if ((i & 8) != 0) {
            K kH = getDiv2Component$div_release().h();
            boolean zIsEmpty4 = tags.isEmpty();
            C5308a c5308a2 = kH.f2063f;
            C5308a c5308a3 = kH.f2062e;
            if (zIsEmpty4) {
                c5308a3.clear();
                c5308a2.clear();
                return;
            }
            for (C4458a c4458a2 : tags) {
                C2095p.e0(c5308a3.keySet(), new F7.h(c4458a2, 1), true);
                C2095p.e0(c5308a2.keySet(), new C9.r(c4458a2, 1), true);
            }
        }
    }

    public void setViewPreCreationProfile(C5477i value) {
        kotlin.jvm.internal.l.f(value, "value");
        H hO = getDiv2Component$div_release().o();
        int i = value.f45277b.f45251a;
        InterfaceC5475g interfaceC5475g = hO.f2046b;
        interfaceC5475g.j(i, "DIV2.TEXT_VIEW");
        interfaceC5475g.j(value.f45278c.f45251a, "DIV2.IMAGE_VIEW");
        interfaceC5475g.j(value.f45279d.f45251a, "DIV2.IMAGE_GIF_VIEW");
        interfaceC5475g.j(value.f45280e.f45251a, "DIV2.OVERLAP_CONTAINER_VIEW");
        interfaceC5475g.j(value.f45281f.f45251a, "DIV2.LINEAR_CONTAINER_VIEW");
        interfaceC5475g.j(value.f45282g.f45251a, "DIV2.WRAP_CONTAINER_VIEW");
        interfaceC5475g.j(value.f45283h.f45251a, "DIV2.GRID_VIEW");
        interfaceC5475g.j(value.i.f45251a, "DIV2.GALLERY_VIEW");
        interfaceC5475g.j(value.f45284j.f45251a, "DIV2.PAGER_VIEW");
        interfaceC5475g.j(value.f45285k.f45251a, "DIV2.TAB_VIEW");
        interfaceC5475g.j(value.f45286l.f45251a, "DIV2.STATE");
        interfaceC5475g.j(value.f45287m.f45251a, "DIV2.CUSTOM");
        interfaceC5475g.j(value.f45288n.f45251a, "DIV2.INDICATOR");
        interfaceC5475g.j(value.f45289o.f45251a, "DIV2.SLIDER");
        interfaceC5475g.j(value.f45290p.f45251a, "DIV2.INPUT");
        interfaceC5475g.j(value.f45291q.f45251a, "DIV2.SELECT");
        interfaceC5475g.j(value.f45292r.f45251a, "DIV2.VIDEO");
        interfaceC5475g.j(value.f45293s.f45251a, "DIV2.SWITCH");
        hO.f2048d = value;
    }

    public void warmUp() {
        getDiv2Component$div_release().j();
    }

    /* compiled from: Div2Context.kt */
    public static final class b implements LayoutInflater.Factory2 {

        /* renamed from: b, reason: collision with root package name */
        public final e f42991b;

        public b(e eVar) {
            this.f42991b = eVar;
        }

        @Override // android.view.LayoutInflater.Factory
        public final View onCreateView(String name, Context context, AttributeSet attrs) {
            kotlin.jvm.internal.l.f(name, "name");
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(attrs, "attrs");
            if ("com.yandex.div.core.view2.Div2View".equals(name) || "Div2View".equals(name)) {
                return new C0675l(this.f42991b, attrs, 4);
            }
            return null;
        }

        @Override // android.view.LayoutInflater.Factory2
        public final View onCreateView(View view, String name, Context context, AttributeSet attrs) {
            kotlin.jvm.internal.l.f(name, "name");
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(attrs, "attrs");
            return onCreateView(name, context, attrs);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(ContextThemeWrapper baseContext, i configuration, int i) {
        this(baseContext, configuration, i, null, 8, null);
        kotlin.jvm.internal.l.f(baseContext, "baseContext");
        kotlin.jvm.internal.l.f(configuration, "configuration");
    }

    public e childContext(InterfaceC1790x interfaceC1790x) {
        return new e(this.baseContext, getDiv2Component$div_release(), interfaceC1790x);
    }

    public /* synthetic */ e(ContextThemeWrapper contextThemeWrapper, Div2Component div2Component, InterfaceC1790x interfaceC1790x, int i, kotlin.jvm.internal.g gVar) {
        this(contextThemeWrapper, div2Component, (i & 4) != 0 ? null : interfaceC1790x);
    }

    public e childContext(ContextThemeWrapper baseContext, InterfaceC1790x interfaceC1790x) {
        kotlin.jvm.internal.l.f(baseContext, "baseContext");
        return new e(baseContext, getDiv2Component$div_release(), interfaceC1790x);
    }

    private e(ContextThemeWrapper contextThemeWrapper, Div2Component div2Component, InterfaceC1790x interfaceC1790x) {
        super(contextThemeWrapper);
        this.baseContext = contextThemeWrapper;
        this.div2Component = div2Component;
        this.lifecycleOwner = interfaceC1790x;
        this.globalVariableController$delegate = C2001h.b(new c());
        j jVarI = getDiv2Component$div_release().i();
        if (jVarI.f43031b >= 0) {
            return;
        }
        jVarI.f43031b = SystemClock.uptimeMillis();
    }

    public /* synthetic */ e(ContextThemeWrapper contextThemeWrapper, i iVar, int i, InterfaceC1790x interfaceC1790x, int i10, kotlin.jvm.internal.g gVar) {
        this(contextThemeWrapper, iVar, (i10 & 4) != 0 ? 2132017479 : i, (i10 & 8) != 0 ? null : interfaceC1790x);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(ContextThemeWrapper baseContext, i configuration, int i, InterfaceC1790x interfaceC1790x) {
        kotlin.jvm.internal.l.f(baseContext, "baseContext");
        kotlin.jvm.internal.l.f(configuration, "configuration");
        Div2Component.Builder builderB = p.f43037b.a(baseContext).f43040a.b();
        builderB.e(baseContext);
        builderB.d(configuration);
        builderB.a(i);
        builderB.c(new j(SystemClock.uptimeMillis()));
        builderB.b(configuration.f43019r);
        this(baseContext, builderB.build(), interfaceC1790x);
    }

    public static /* synthetic */ void getGlobalVariableController$annotations() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(ContextThemeWrapper baseContext, i configuration, int i, int i10, kotlin.jvm.internal.g gVar) {
        this(baseContext, configuration, i, null);
        kotlin.jvm.internal.l.f(baseContext, "baseContext");
        kotlin.jvm.internal.l.f(configuration, "configuration");
    }
}
