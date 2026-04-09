package F6;

import A6.h;
import N7.Xa;
import O6.q;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import b9.C2001h;
import b9.p;
import com.yandex.div.core.util.text.DivBackgroundSpan;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.l;

/* compiled from: DivTextRangesBackgroundHelper.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final q f1669a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.d f1670b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<DivBackgroundSpan> f1671c;

    /* renamed from: d, reason: collision with root package name */
    public final p f1672d;

    /* renamed from: e, reason: collision with root package name */
    public final p f1673e;

    /* renamed from: f, reason: collision with root package name */
    public final p f1674f;

    public d(q view, A7.d resolver) {
        l.f(view, "view");
        l.f(resolver, "resolver");
        this.f1669a = view;
        this.f1670b = resolver;
        this.f1671c = new ArrayList<>();
        this.f1672d = C2001h.b(new c(this, 0));
        int i = 1;
        this.f1673e = C2001h.b(new h(this, i));
        this.f1674f = C2001h.b(new A6.g(this, i));
    }

    public final void a(Canvas canvas, Spanned spanned, Layout layout) {
        Iterator<DivBackgroundSpan> it = this.f1671c.iterator();
        while (it.hasNext()) {
            DivBackgroundSpan next = it.next();
            int spanStart = spanned.getSpanStart(next);
            int spanEnd = spanned.getSpanEnd(next);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            int primaryHorizontal = (int) layout.getPrimaryHorizontal(spanStart);
            int primaryHorizontal2 = (int) layout.getPrimaryHorizontal(spanEnd);
            if (next.f23937c instanceof Xa.a) {
                ((b) this.f1674f.getValue()).a(canvas, layout, lineForOffset, lineForOffset2, primaryHorizontal, primaryHorizontal2, next.f23936b, next.f23937c);
            } else {
                ((e) (lineForOffset == lineForOffset2 ? this.f1672d.getValue() : this.f1673e.getValue())).a(canvas, layout, lineForOffset, lineForOffset2, primaryHorizontal, primaryHorizontal2, next.f23936b, next.f23937c);
            }
        }
    }
}
