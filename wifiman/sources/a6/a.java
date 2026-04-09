package A6;

import Y5.b;
import Zg.AbstractC3682n;
import android.graphics.RectF;
import g6.C5867c;
import g6.InterfaceC5865a;
import j6.InterfaceC6255b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u6.e;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final C0007a f351e = new C0007a(null);

    /* renamed from: a, reason: collision with root package name */
    private final b f352a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f353b;

    /* renamed from: c, reason: collision with root package name */
    private final C5867c f354c;

    /* renamed from: d, reason: collision with root package name */
    private final C5867c f355d;

    /* renamed from: A6.a$a, reason: collision with other inner class name */
    private static final class C0007a {
        public /* synthetic */ C0007a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0007a() {
        }
    }

    public a(b axisManager) {
        AbstractC6492s.i(axisManager, "axisManager");
        this.f352a = axisManager;
        this.f353b = new ArrayList(5);
        this.f354c = new C5867c(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        this.f355d = new C5867c(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public RectF a(e context, RectF contentBounds, b6.b chart, B6.a aVar, InterfaceC6255b segmentProperties, InterfaceC5865a... chartInsetter) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(contentBounds, "contentBounds");
        AbstractC6492s.i(chart, "chart");
        AbstractC6492s.i(segmentProperties, "segmentProperties");
        AbstractC6492s.i(chartInsetter, "chartInsetter");
        this.f353b.clear();
        this.f354c.b();
        this.f355d.b();
        Float fValueOf = aVar != null ? Float.valueOf(aVar.b(context, contentBounds.width())) : null;
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        this.f352a.a(this.f353b);
        List listX = AbstractC3682n.X(chartInsetter);
        ArrayList arrayList = this.f353b;
        Iterator it = listX.iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC5865a) it.next());
        }
        this.f353b.addAll(chart.j());
        this.f353b.add(chart);
        Iterator it2 = this.f353b.iterator();
        while (it2.hasNext()) {
            ((InterfaceC5865a) it2.next()).i(context, this.f355d, segmentProperties);
            this.f354c.p(this.f355d);
        }
        float fHeight = (contentBounds.height() - this.f354c.i()) - fFloatValue;
        Iterator it3 = this.f353b.iterator();
        while (it3.hasNext()) {
            ((InterfaceC5865a) it3.next()).g(context, fHeight, this.f355d);
            this.f354c.p(this.f355d);
        }
        RectF rectF = new RectF();
        rectF.left = contentBounds.left + this.f354c.e(context.h());
        rectF.top = contentBounds.top + this.f354c.h();
        rectF.right = contentBounds.right - this.f354c.f(context.h());
        rectF.bottom = (contentBounds.bottom - this.f354c.c()) - fFloatValue;
        chart.l(Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.right), Float.valueOf(rectF.bottom));
        this.f352a.j(context, contentBounds, rectF, this.f354c);
        if (aVar != null) {
            aVar.l(Float.valueOf(contentBounds.left), Float.valueOf(chart.getBounds().bottom + this.f354c.c()), Float.valueOf(contentBounds.right), Float.valueOf(chart.getBounds().bottom + this.f354c.c() + fFloatValue));
        }
        return rectF;
    }
}
