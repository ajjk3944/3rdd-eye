package C9;

import A9.C0583j;
import H6.C0673j;
import H6.C0675l;
import K6.C0713c;
import K6.C0751q;
import O6.C;
import O6.H;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import c9.C2078B;
import c9.C2092m;
import c9.C2097r;
import c9.C2100u;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import i6.C4458a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k6.C5246y;
import o6.C5426c;
import p6.i;

/* compiled from: Produce.kt */
/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1015g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1016h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, int i) {
        super(1);
        this.f1015g = i;
        this.f1016h = obj;
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, java.util.Map] */
    @Override // p9.l
    public final Object invoke(Object it) {
        Map map;
        int i = 1;
        Object obj = this.f1016h;
        switch (this.f1015g) {
            case 0:
                C1992A c1992a = C1992A.f18074a;
                ((C0583j) obj).resumeWith(c1992a);
                return c1992a;
            case 1:
                C0673j compositeLogId = (C0673j) it;
                kotlin.jvm.internal.l.f(compositeLogId, "compositeLogId");
                return Boolean.valueOf(kotlin.jvm.internal.l.b(compositeLogId.f2149a, ((C4458a) obj).f38455a));
            case 2:
                kotlin.jvm.internal.l.f(it, "it");
                ((C0751q) obj).invoke();
                return C1992A.f18074a;
            case 3:
                long jLongValue = ((Number) it).longValue();
                long j4 = jLongValue >> 31;
                ((O6.k) obj).setColumnCount((j4 == 0 || j4 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION);
                return C1992A.f18074a;
            case 4:
                boolean zBooleanValue = ((Boolean) it).booleanValue();
                O6.p pVar = (O6.p) obj;
                if (!zBooleanValue && pVar.isFocused()) {
                    C5246y.a(pVar);
                }
                pVar.setEnabled$div_release(zBooleanValue);
                return C1992A.f18074a;
            case 5:
                ((O6.y) obj).setInteractive(((Boolean) it).booleanValue());
                return C1992A.f18074a;
            case 6:
                ((Boolean) it).getClass();
                return C1992A.f18074a;
            case 7:
                ((C) obj).getViewPager().setOnInterceptTouchEventListener(((Boolean) it).booleanValue() ? H.f10376a : null);
                return C1992A.f18074a;
            case 8:
                Q6.j m10 = (Q6.j) it;
                kotlin.jvm.internal.l.f(m10, "m");
                Q6.i iVar = (Q6.i) obj;
                Q6.j jVar = iVar.f11342g;
                boolean z10 = m10.f11344a;
                C0675l c0675l = iVar.f11337b;
                if (jVar == null || jVar.f11344a != z10) {
                    View view = iVar.f11340e;
                    if (view != null) {
                        c0675l.removeView(view);
                    }
                    iVar.f11340e = null;
                    View view2 = iVar.f11341f;
                    if (view2 != null) {
                        c0675l.removeView(view2);
                    }
                    iVar.f11341f = null;
                }
                int i10 = m10.f11346c;
                int i11 = m10.f11345b;
                if (z10) {
                    Q6.a aVar = iVar.f11341f;
                    Q6.g gVar = iVar.f11338c;
                    if (aVar == null) {
                        Context context = c0675l.getContext();
                        kotlin.jvm.internal.l.e(context, "root.context");
                        gVar.getClass();
                        Q6.a aVar2 = new Q6.a(context, new A8.q(gVar.f11328b), new F7.l(iVar, 3), new F7.m(iVar, 2));
                        c0675l.addView(aVar2, new ViewGroup.LayoutParams(-1, -1));
                        iVar.f11341f = aVar2;
                    }
                    Q6.a aVar3 = iVar.f11341f;
                    if (aVar3 != null) {
                        String value = m10.f11348e;
                        String str = m10.f11347d;
                        if (i11 > 0 && i10 > 0) {
                            value = B4.g.o(str, "\n\n", value);
                        } else if (i10 <= 0) {
                            value = str;
                        }
                        kotlin.jvm.internal.l.f(value, "value");
                        aVar3.f11314e.setText(value);
                    }
                    Q6.a aVar4 = iVar.f11341f;
                    if (aVar4 != null) {
                        p6.h runtimeStore$div_release = gVar.f11328b.getRuntimeStore$div_release();
                        if (runtimeStore$div_release == null) {
                            map = C2100u.f18582b;
                        } else {
                            LinkedHashMap linkedHashMap = runtimeStore$div_release.f45228h.f45231b;
                            ArrayList arrayList = new ArrayList(linkedHashMap.size());
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                arrayList.add(new b9.l(entry.getKey(), ((i.a) entry.getValue()).f45232a));
                            }
                            Map mapS = C2078B.s(arrayList);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            C5426c c5426c = runtimeStore$div_release.i;
                            if (c5426c != null) {
                                linkedHashMap2.put("", c5426c.f44858b);
                            }
                            for (Map.Entry entry2 : mapS.entrySet()) {
                                linkedHashMap2.put((String) entry2.getKey(), ((C5426c) entry2.getValue()).f44858b);
                            }
                            map = linkedHashMap2;
                        }
                        Q6.p pVar2 = aVar4.f11313d;
                        pVar2.getClass();
                        ?? r22 = pVar2.f11368d;
                        if (!map.isEmpty()) {
                            Iterator it2 = map.entrySet().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Map.Entry entry3 = (Map.Entry) it2.next();
                                    if (!kotlin.jvm.internal.l.b(r22.get(entry3.getKey()), entry3.getValue())) {
                                        Set setL0 = C2097r.L0(pVar2.f11368d.values());
                                        pVar2.f11368d = map;
                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                        for (Map.Entry entry4 : map.entrySet()) {
                                            if (!setL0.contains((s6.k) entry4.getValue())) {
                                                linkedHashMap3.put(entry4.getKey(), entry4.getValue());
                                            }
                                        }
                                        for (Map.Entry entry5 : linkedHashMap3.entrySet()) {
                                            String str2 = (String) entry5.getKey();
                                            s6.k kVar = (s6.k) entry5.getValue();
                                            List<Z6.d> listH = kVar.h();
                                            ArrayList arrayList2 = new ArrayList(C2092m.T(listH, 10));
                                            Iterator<T> it3 = listH.iterator();
                                            while (it3.hasNext()) {
                                                arrayList2.add(((Z6.d) it3.next()).a());
                                            }
                                            kVar.b(arrayList2, new B9.e(6, pVar2, str2));
                                        }
                                        LinkedHashMap linkedHashMap4 = pVar2.f11366b;
                                        linkedHashMap4.clear();
                                        for (Map.Entry entry6 : pVar2.f11368d.entrySet()) {
                                            String str3 = (String) entry6.getKey();
                                            for (Z6.d dVar : ((s6.k) entry6.getValue()).h()) {
                                                linkedHashMap4.put(new b9.l(str3, dVar.a()), dVar);
                                            }
                                        }
                                        pVar2.a();
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int length = m10.b().length();
                    int i12 = R.drawable.error_counter_background;
                    if (length <= 0 && !iVar.f11339d) {
                        View view3 = iVar.f11340e;
                        if (view3 != null) {
                            c0675l.removeView(view3);
                        }
                        iVar.f11340e = null;
                    } else if (iVar.f11340e == null) {
                        AppCompatTextView appCompatTextView = new AppCompatTextView(c0675l.getContext(), null);
                        appCompatTextView.setBackgroundResource(R.drawable.error_counter_background);
                        appCompatTextView.setTextSize(12.0f);
                        appCompatTextView.setTextColor(-16777216);
                        appCompatTextView.setGravity(17);
                        appCompatTextView.setElevation(appCompatTextView.getResources().getDimension(R.dimen.div_shadow_elevation));
                        appCompatTextView.setOnClickListener(new D8.f(iVar, i));
                        DisplayMetrics metrics = c0675l.getContext().getResources().getDisplayMetrics();
                        kotlin.jvm.internal.l.e(metrics, "metrics");
                        int iC = C0713c.C(24, metrics);
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(iC, iC);
                        int iC2 = C0713c.C(8, metrics);
                        marginLayoutParams.topMargin = iC2;
                        marginLayoutParams.leftMargin = iC2;
                        marginLayoutParams.rightMargin = iC2;
                        marginLayoutParams.bottomMargin = iC2;
                        Context context2 = c0675l.getContext();
                        kotlin.jvm.internal.l.e(context2, "root.context");
                        r7.g gVar2 = new r7.g(context2, null, 0);
                        gVar2.addView(appCompatTextView, marginLayoutParams);
                        c0675l.addView(gVar2, -1, -1);
                        iVar.f11340e = gVar2;
                    }
                    r7.g gVar3 = iVar.f11340e;
                    View childAt = gVar3 != null ? gVar3.getChildAt(0) : null;
                    AppCompatTextView appCompatTextView2 = childAt instanceof AppCompatTextView ? (AppCompatTextView) childAt : null;
                    if (appCompatTextView2 != null) {
                        appCompatTextView2.setText(m10.b());
                        if (i10 > 0 && i11 > 0) {
                            i12 = R.drawable.warning_error_counter_background;
                        } else if (i10 == 0 && i11 == 0) {
                            i12 = R.drawable.neutral_counter_background;
                        } else if (i10 > 0) {
                            i12 = R.drawable.warning_counter_background;
                        }
                        appCompatTextView2.setBackgroundResource(i12);
                    }
                }
                iVar.f11342g = m10;
                return C1992A.f18074a;
            case 9:
                return String.format(((k3.e) obj).getLocale(), "%.0f", Arrays.copyOf(new Object[]{Float.valueOf(((Number) it).floatValue())}, 1));
            case 10:
                List mutate = (List) it;
                kotlin.jvm.internal.l.f(mutate, "$this$mutate");
                mutate.add(obj);
                return C1992A.f18074a;
            case 11:
                J7.a it4 = (J7.a) it;
                kotlin.jvm.internal.l.f(it4, "it");
                return Boolean.valueOf(kotlin.jvm.internal.l.b(it4.getId(), (String) obj));
            default:
                ((sa.b) obj).cancel();
                return C1992A.f18074a;
        }
    }
}
