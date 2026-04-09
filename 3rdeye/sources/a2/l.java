package A2;

import A7.b;
import A9.A0;
import A9.C0575f;
import A9.C0602t;
import A9.L0;
import A9.U;
import E3.e;
import E9.s;
import F9.A;
import F9.q;
import F9.v;
import H6.C0675l;
import H6.H;
import L0.T;
import S1.a;
import a9.InterfaceC1676a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.database.SQLException;
import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.AbstractC1730h;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.C1785s;
import androidx.lifecycle.C1786t;
import androidx.lifecycle.InterfaceC1790x;
import b9.C2001h;
import c.InterfaceC2025w;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database.Model;
import com.google.android.gms.ads.AdRequest;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.z;
import t4.C5606d;

/* compiled from: BlockModelDao_Impl.java */
/* loaded from: classes.dex */
public class l implements A3.b, T, P2.a, W4.a, a3.g, com.google.gson.internal.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27b;

    public /* synthetic */ l(int i) {
        this.f27b = i;
    }

    public static final boolean A(A7.b bVar) {
        return bVar == null || (bVar instanceof b.C0000b);
    }

    public static boolean B(String str) {
        a.d dVar = S1.k.f11856a;
        Set<S1.d> setUnmodifiableSet = Collections.unmodifiableSet(S1.a.f11846c);
        HashSet hashSet = new HashSet();
        for (S1.d dVar2 : setUnmodifiableSet) {
            if (dVar2.b().equals(str)) {
                hashSet.add(dVar2);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((S1.d) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    public static void C(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static final void D(View view, InterfaceC2025w interfaceC2025w) {
        kotlin.jvm.internal.l.f(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, interfaceC2025w);
    }

    public static final Object E(v vVar, v vVar2, p9.p pVar) {
        Object c0602t;
        Object objS;
        try {
            z.b(2, pVar);
            c0602t = pVar.invoke(vVar2, vVar);
        } catch (Throwable th) {
            c0602t = new C0602t(false, th);
        }
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        if (c0602t == aVar || (objS = vVar.S(c0602t)) == A0.f176b) {
            return aVar;
        }
        if (objS instanceof C0602t) {
            throw ((C0602t) objS).f272a;
        }
        return A0.b(objS);
    }

    public static final /* synthetic */ Integer F(int i) {
        Integer numValueOf = Integer.valueOf(i);
        if (i != Integer.MIN_VALUE) {
            return numValueOf;
        }
        return null;
    }

    public static final void G(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        if (str != null) {
            sb.append(", message: ".concat(str));
        }
        throw new SQLException(sb.toString());
    }

    public static final void H(ViewGroup viewGroup, C0675l divView, List list, InterfaceC1676a divViewCreator) {
        kotlin.jvm.internal.l.f(viewGroup, "<this>");
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(divViewCreator, "divViewCreator");
        T6.e currentRebindReusableList$div_release = divView.getCurrentRebindReusableList$div_release();
        if (currentRebindReusableList$div_release == null) {
            return;
        }
        viewGroup.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i7.b bVar = (i7.b) it.next();
            View viewA = currentRebindReusableList$div_release.a(bVar.f38460a);
            if (viewA == null) {
                viewA = ((H) divViewCreator.get()).o(bVar.f38460a, bVar.f38461b);
            }
            viewGroup.addView(viewA);
        }
    }

    public static final Object I(InterfaceC4350h interfaceC4350h, Object obj, Object obj2, p9.p pVar, InterfaceC4347e frame) {
        Object objInvoke;
        Object objC = A.c(interfaceC4350h, obj2);
        try {
            s sVar = new s(frame, interfaceC4350h);
            if (androidx.work.s.n(pVar)) {
                z.b(2, pVar);
                objInvoke = pVar.invoke(obj, sVar);
            } else {
                objInvoke = com.google.gson.internal.c.J(pVar, obj, sVar);
            }
            A.a(interfaceC4350h, objC);
            if (objInvoke == g9.a.COROUTINE_SUSPENDED) {
                kotlin.jvm.internal.l.f(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            A.a(interfaceC4350h, objC);
            throw th;
        }
    }

    public static final void i(StringBuilder sb, int i) {
        for (int i10 = 0; i10 < i; i10++) {
            sb.append("?");
            if (i10 < i - 1) {
                sb.append(StringUtils.COMMA);
            }
        }
    }

    public static void k(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void l(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void m(int i, int i10, int i11, String str) {
        if (i < i10) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i10 + ", " + i11 + "] (too low)");
        }
        if (i <= i11) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i10 + ", " + i11 + "] (too high)");
    }

    public static void o(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void q(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static void r() {
        File file = new File(I2.b.f2413a);
        File file2 = new File(I2.b.f2414b);
        File file3 = new File(I2.b.f2415c);
        if (!file2.exists()) {
            file3.mkdirs();
        }
        if (!file3.exists()) {
            file2.mkdirs();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static final boolean s(A7.b bVar, A7.b bVar2) {
        if (bVar == null && bVar2 == null) {
            return true;
        }
        return bVar != null && (bVar instanceof b.C0000b) && bVar2 != null && (bVar2 instanceof b.C0000b) && kotlin.jvm.internal.l.b(bVar.b(), bVar2.b());
    }

    public static final boolean t(A7.c cVar, A7.c cVar2) {
        if (cVar == null && cVar2 == null) {
            return true;
        }
        return cVar != null && (cVar instanceof A7.a) && cVar2 != null && (cVar2 instanceof A7.a) && kotlin.jvm.internal.l.b(((A7.a) cVar).f86a, ((A7.a) cVar2).f86a);
    }

    public static String u(AbstractC1730h abstractC1730h) {
        StringBuilder sb = new StringBuilder(abstractC1730h.size());
        for (int i = 0; i < abstractC1730h.size(); i++) {
            byte b10 = abstractC1730h.b(i);
            if (b10 == 34) {
                sb.append("\\\"");
            } else if (b10 == 39) {
                sb.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b10 < 32 || b10 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b10 >>> 6) & 3) + 48));
                            sb.append((char) (((b10 >>> 3) & 7) + 48));
                            sb.append((char) ((b10 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b10);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final void v(E1.a aVar, String sql) {
        kotlin.jvm.internal.l.f(aVar, "<this>");
        kotlin.jvm.internal.l.f(sql, "sql");
        E1.c cVarK0 = aVar.K0(sql);
        try {
            cVarK0.x();
            cVarK0.close();
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final i7.k w(View view) {
        kotlin.jvm.internal.l.f(view, "<this>");
        if (view instanceof i7.k) {
            return (i7.k) view;
        }
        Object tag = view.getTag(R.id.div_releasable_list);
        m0.j jVar = tag instanceof m0.j ? (m0.j) tag : null;
        if (jVar == null) {
            jVar = new m0.j();
            view.setTag(R.id.div_releasable_list, jVar);
        }
        Object objD = jVar.d(0);
        i7.k kVar = objD instanceof i7.k ? (i7.k) objD : null;
        if (kVar != null) {
            return kVar;
        }
        C6.f fVar = new C6.f();
        jVar.e(0, fVar);
        return fVar;
    }

    public static String x(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "|");
            }
        }
        return sb.toString();
    }

    public static final C1786t y(InterfaceC1790x interfaceC1790x) {
        kotlin.jvm.internal.l.f(interfaceC1790x, "<this>");
        AbstractC1781n lifecycle = interfaceC1790x.getLifecycle();
        kotlin.jvm.internal.l.f(lifecycle, "<this>");
        while (true) {
            C1786t c1786t = (C1786t) lifecycle.getInternalScopeRef().get();
            if (c1786t != null) {
                return c1786t;
            }
            L0 l0A = C0575f.a();
            I9.c cVar = U.f211a;
            C1786t c1786t2 = new C1786t(lifecycle, InterfaceC4350h.a.C0456a.d(l0A, q.f1782a.R0()));
            AtomicReference<Object> internalScopeRef = lifecycle.getInternalScopeRef();
            while (!internalScopeRef.compareAndSet(null, c1786t2)) {
                if (internalScopeRef.get() != null) {
                    break;
                }
            }
            I9.c cVar2 = U.f211a;
            C0575f.e(c1786t2, q.f1782a.R0(), null, new C1785s(c1786t2, null), 2);
            return c1786t2;
        }
    }

    public static final boolean z(A7.b bVar) {
        kotlin.jvm.internal.l.f(bVar, "<this>");
        return bVar instanceof b.C0000b;
    }

    @Override // W4.a
    public StackTraceElement[] c(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, AdRequest.MAX_CONTENT_URL_LENGTH);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - AdRequest.MAX_CONTENT_URL_LENGTH, stackTraceElementArr2, AdRequest.MAX_CONTENT_URL_LENGTH, AdRequest.MAX_CONTENT_URL_LENGTH);
        return stackTraceElementArr2;
    }

    @Override // a3.g
    public void g(a3.i iVar) {
        iVar.onStart();
    }

    @Override // a9.InterfaceC1676a
    public Object get() {
        C5606d c5606d = new C5606d(6);
        HashMap map = new HashMap();
        v3.e eVar = v3.e.DEFAULT;
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(eVar, new E3.c(30000L, com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS, set));
        v3.e eVar2 = v3.e.HIGHEST;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(eVar2, new E3.c(1000L, com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS, set));
        v3.e eVar3 = v3.e.VERY_LOW;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(e.b.DEVICE_IDLE)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(eVar3, new E3.c(com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS, com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS, setUnmodifiableSet));
        if (map.keySet().size() < v3.e.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new E3.b(c5606d, map);
    }

    @Override // P2.a
    public File h(L2.f fVar) {
        return null;
    }

    public void j(E1.c cVar, Object obj) {
        Model model = (Model) obj;
        cVar.b(1, model.getId());
        if (model.getName() == null) {
            cVar.f(2);
        } else {
            cVar.Q(2, model.getName());
        }
        if (model.getPack() == null) {
            cVar.f(3);
        } else {
            cVar.Q(3, model.getPack());
        }
    }

    @Override // com.google.gson.internal.g
    public Object n() {
        switch (this.f27b) {
            case 28:
                return new TreeMap();
            default:
                return new TreeSet();
        }
    }

    public l(A6.g gVar) {
        this.f27b = 12;
        C2001h.b(gVar);
    }

    @Override // L0.T
    public void a() {
    }

    @Override // L0.T
    public void d() {
    }

    @Override // a3.g
    public void b(a3.i iVar) {
    }

    @Override // P2.a
    public void f(L2.f fVar, N2.g gVar) {
    }
}
