package s7;

import C6.r;
import M6.C0795a;
import O6.t;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b9.j;
import java.util.Iterator;
import kotlin.jvm.internal.l;
import s7.d;
import s7.f;
import t7.C5611b;
import t7.C5612c;
import t7.InterfaceC5610a;
import u7.C5636a;
import u7.C5637b;
import u7.InterfaceC5638c;

/* compiled from: PagerIndicatorView.kt */
/* loaded from: classes.dex */
public class i extends View {

    /* renamed from: b, reason: collision with root package name */
    public f f46163b;

    /* renamed from: c, reason: collision with root package name */
    public t f46164c;

    /* renamed from: d, reason: collision with root package name */
    public e f46165d;

    /* renamed from: e, reason: collision with root package name */
    public final h f46166e;

    public i(Context context) {
        super(context, null, 0);
        this.f46166e = new h(this);
    }

    public final void a(f fVar) {
        Q1.f viewPager;
        t tVar = this.f46164c;
        RecyclerView.h adapter = (tVar == null || (viewPager = tVar.getViewPager()) == null) ? null : viewPager.getAdapter();
        C0795a c0795a = adapter instanceof C0795a ? (C0795a) adapter : null;
        if (c0795a != null) {
            int iC = c0795a.f3271l.c();
            fVar.f46145f = iC;
            InterfaceC5610a interfaceC5610a = fVar.f46142c;
            interfaceC5610a.d(iC);
            fVar.b();
            fVar.f46147h = fVar.f46150l / 2.0f;
            int currentItem$div_release = c0795a.f4226u.getCurrentItem$div_release() - (c0795a.f4230y ? 2 : 0);
            fVar.f46151m = currentItem$div_release;
            fVar.f46152n = 0.0f;
            interfaceC5610a.onPageSelected(currentItem$div_release);
            fVar.a(0.0f, currentItem$div_release);
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        InterfaceC5610a interfaceC5610a;
        InterfaceC5638c interfaceC5638c;
        Object next;
        l.f(canvas, "canvas");
        super.onDraw(canvas);
        canvas.translate(getPaddingLeft(), getPaddingTop());
        f fVar = this.f46163b;
        if (fVar != null) {
            f.b bVar = fVar.f46144e;
            Iterator it = bVar.f46159b.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                interfaceC5610a = fVar.f46142c;
                interfaceC5638c = fVar.f46141b;
                if (!zHasNext) {
                    break;
                }
                f.a aVar = (f.a) it.next();
                float f10 = aVar.f46155c;
                float f11 = fVar.f46147h;
                int i = aVar.f46153a;
                interfaceC5638c.a(canvas, f10, f11, aVar.f46156d, interfaceC5610a.h(i), interfaceC5610a.i(i), interfaceC5610a.c(i));
            }
            Iterator it2 = bVar.f46159b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (((f.a) next).f46154b) {
                        break;
                    }
                }
            }
            f.a aVar2 = (f.a) next;
            if (aVar2 != null) {
                RectF rectFE = interfaceC5610a.e(aVar2.f46155c, fVar.f46147h, fVar.f46149k, r.d(fVar.f46143d));
                if (rectFE != null) {
                    interfaceC5638c.b(canvas, rectFE);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            s7.e r1 = r6.f46165d
            r2 = 0
            if (r1 == 0) goto L1a
            s7.d r1 = r1.f46136b
            s7.c r1 = r1.b()
            if (r1 == 0) goto L1a
            float r1 = r1.a()
            goto L1b
        L1a:
            r1 = r2
        L1b:
            int r3 = r6.getPaddingTop()
            float r3 = (float) r3
            float r1 = r1 + r3
            int r3 = r6.getPaddingBottom()
            float r3 = (float) r3
            float r1 = r1 + r3
            int r1 = (int) r1
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r4) goto L32
            if (r0 == r3) goto L36
            r8 = r1
            goto L36
        L32:
            int r8 = java.lang.Math.min(r1, r8)
        L36:
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            s7.e r1 = r6.f46165d
            if (r1 == 0) goto L4e
            s7.d r1 = r1.f46136b
            s7.c r1 = r1.b()
            if (r1 == 0) goto L4e
            float r2 = r1.b()
        L4e:
            s7.e r1 = r6.f46165d
            if (r1 == 0) goto L55
            s7.b r1 = r1.f46139e
            goto L56
        L55:
            r1 = 0
        L56:
            boolean r5 = r1 instanceof s7.InterfaceC5583b.a
            if (r5 == 0) goto L83
            s7.b$a r1 = (s7.InterfaceC5583b.a) r1
            float r1 = r1.f46122a
            O6.t r5 = r6.f46164c
            if (r5 == 0) goto L73
            Q1.f r5 = r5.getViewPager()
            if (r5 == 0) goto L73
            androidx.recyclerview.widget.RecyclerView$h r5 = r5.getAdapter()
            if (r5 == 0) goto L73
            int r5 = r5.getItemCount()
            goto L74
        L73:
            r5 = 0
        L74:
            float r5 = (float) r5
            float r1 = r1 * r5
            float r1 = r1 + r2
            int r1 = (int) r1
            int r2 = r6.getPaddingLeft()
            int r2 = r2 + r1
            int r1 = r6.getPaddingRight()
        L81:
            int r1 = r1 + r2
            goto L96
        L83:
            boolean r5 = r1 instanceof s7.InterfaceC5583b.C0527b
            if (r5 == 0) goto L89
            r1 = r7
            goto L96
        L89:
            if (r1 != 0) goto Lbf
            int r1 = (int) r2
            int r2 = r6.getPaddingLeft()
            int r2 = r2 + r1
            int r1 = r6.getPaddingRight()
            goto L81
        L96:
            if (r0 == r4) goto L9c
            if (r0 == r3) goto La0
            r7 = r1
            goto La0
        L9c:
            int r7 = java.lang.Math.min(r1, r7)
        La0:
            r6.setMeasuredDimension(r7, r8)
            s7.f r0 = r6.f46163b
            if (r0 == 0) goto Lbe
            int r1 = r6.getPaddingLeft()
            int r7 = r7 - r1
            int r1 = r6.getPaddingRight()
            int r7 = r7 - r1
            int r1 = r6.getPaddingTop()
            int r8 = r8 - r1
            int r1 = r6.getPaddingBottom()
            int r8 = r8 - r1
            r0.c(r7, r8)
        Lbe:
            return
        Lbf:
            b9.j r7 = new b9.j
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.i.onMeasure(int, int):void");
    }

    public final void setStyle(e style) {
        InterfaceC5638c c5636a;
        InterfaceC5610a c5612c;
        l.f(style, "style");
        this.f46165d = style;
        d dVar = style.f46136b;
        if (dVar instanceof d.b) {
            c5636a = new C5637b(style);
        } else {
            if (!(dVar instanceof d.a)) {
                throw new j();
            }
            c5636a = new C5636a(style);
        }
        int i = C5611b.f46430a[style.f46135a.ordinal()];
        if (i == 1) {
            c5612c = new C5612c(style);
        } else if (i == 2) {
            c5612c = new t7.e(style);
        } else {
            if (i != 3) {
                throw new j();
            }
            c5612c = new t7.d(style);
        }
        f fVar = new f(style, c5636a, c5612c, this);
        fVar.c((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        a(fVar);
        this.f46163b = fVar;
        requestLayout();
    }
}
