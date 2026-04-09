package H6;

import C.C0638z;
import K6.C0751q;
import N7.Z;
import O6.InterfaceC1478d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import b9.C1992A;
import c.AbstractC2021s;
import c.C2004b;
import c.C2023u;
import c9.C2087h;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.Iterator;
import java.util.ListIterator;
import r6.C5528e;
import s6.C5581b;

/* compiled from: Div2View.kt */
/* renamed from: H6.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0680q extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2219g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2220h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0680q(Object obj, int i) {
        super(1);
        this.f2219g = i;
        this.f2220h = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p9.l
    public final Object invoke(Object it) {
        AbstractC2021s abstractC2021s = null;
        Object obj = this.f2220h;
        switch (this.f2219g) {
            case 0:
                Z div = (Z) it;
                kotlin.jvm.internal.l.f(div, "div");
                if (div instanceof Z.m) {
                    ((C2087h) obj).o();
                }
                break;
            case 1:
                kotlin.jvm.internal.l.f(it, "it");
                ((C0751q) obj).invoke();
                break;
            case 2:
                double dDoubleValue = ((Number) it).doubleValue();
                View view = (View) obj;
                kotlin.jvm.internal.l.f(view, "<this>");
                view.setAlpha((float) dDoubleValue);
                InterfaceC1478d interfaceC1478d = view instanceof InterfaceC1478d ? (InterfaceC1478d) view : null;
                if (interfaceC1478d != null) {
                    interfaceC1478d.c();
                }
                break;
            case 3:
                Drawable drawable = (Drawable) it;
                O6.j jVar = (O6.j) obj;
                if (!jVar.m() && !kotlin.jvm.internal.l.b(jVar.getTag(R.id.image_loaded_flag), Boolean.FALSE)) {
                    jVar.setPlaceholder(drawable);
                }
                break;
            case 4:
                N6.c divTabsAdapter = ((O6.C) obj).getDivTabsAdapter();
                if (divTabsAdapter != null) {
                    divTabsAdapter.b();
                }
                break;
            case 5:
                C0638z cameraX = (C0638z) it;
                V.f fVar = V.f.f12823g;
                kotlin.jvm.internal.l.e(cameraX, "cameraX");
                fVar.f12827d = cameraX;
                Context contextA = G.e.a((Context) obj);
                kotlin.jvm.internal.l.e(contextA, "getApplicationContext(context)");
                fVar.f12828e = contextA;
                break;
            case 6:
                C2004b backEvent = (C2004b) it;
                kotlin.jvm.internal.l.f(backEvent, "backEvent");
                C2023u c2023u = (C2023u) obj;
                C2087h<AbstractC2021s> c2087h = c2023u.f18309b;
                ListIterator<AbstractC2021s> listIterator = c2087h.listIterator(c2087h.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        AbstractC2021s abstractC2021sPrevious = listIterator.previous();
                        if (abstractC2021sPrevious.f18304a) {
                            abstractC2021s = abstractC2021sPrevious;
                        }
                    }
                }
                AbstractC2021s abstractC2021s2 = abstractC2021s;
                if (c2023u.f18310c != null) {
                    c2023u.c();
                }
                c2023u.f18310c = abstractC2021s2;
                break;
            case 7:
                break;
            case 8:
                kotlin.jvm.internal.l.f((Z6.d) it, "<anonymous parameter 0>");
                ((C5528e) obj).b();
                break;
            case 9:
                String variableName = (String) it;
                kotlin.jvm.internal.l.f(variableName, "variableName");
                Iterator<p9.l<String, C1992A>> it2 = ((C5581b) obj).f46088d.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke(variableName);
                }
                break;
            default:
                ((sa.b) obj).cancel();
                break;
        }
        return C1992A.f18074a;
    }
}
