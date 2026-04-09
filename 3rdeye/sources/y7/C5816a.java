package y7;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import m0.C5308a;
import y7.c;

/* compiled from: R8$$SyntheticClass */
/* renamed from: y7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5816a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5817b f48197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f48199c;

    public /* synthetic */ C5816a(AbstractC5817b abstractC5817b, int i, int i10) {
        this.f48197a = abstractC5817b;
        this.f48198b = i;
        this.f48199c = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(int i) {
        ViewGroup viewGroup;
        int measuredHeight;
        c cVar = (c) this.f48197a.f48201b.f317c;
        if (cVar.f48216l == null) {
            return -1;
        }
        x xVar = cVar.f48209d;
        int collapsiblePaddingBottom = xVar != null ? xVar.getCollapsiblePaddingBottom() : 0;
        List listA = cVar.f48216l.a();
        if (i >= 0) {
            listA.size();
        }
        c.f.a aVar = (c.f.a) listA.get(i);
        Integer numA = aVar.a();
        if (numA != null) {
            measuredHeight = numA.intValue();
        } else {
            C5308a c5308a = cVar.f48212g;
            c.d dVar = (c.d) c5308a.get(Integer.valueOf(i));
            if (dVar == null) {
                ViewGroup viewGroup2 = (ViewGroup) cVar.f48206a.d(cVar.f48213h);
                c.d dVar2 = new c.d(viewGroup2, aVar, i);
                c5308a.put(Integer.valueOf(i), dVar2);
                viewGroup = viewGroup2;
                dVar = dVar2;
            } else {
                viewGroup = dVar.f48221a;
            }
            dVar.a();
            viewGroup.forceLayout();
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(this.f48198b, 1073741824), aVar.b().intValue() == -1 ? this.f48199c : View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        return measuredHeight + collapsiblePaddingBottom;
    }
}
