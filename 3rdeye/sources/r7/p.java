package r7;

import H6.C0672i;
import H6.C0675l;
import L0.I;
import V6.d;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import c9.C2092m;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: TextViewWithAccessibleSpans.kt */
/* loaded from: classes.dex */
public class p extends C5535f {

    /* renamed from: A, reason: collision with root package name */
    public String f45821A;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f45822x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f45823y;

    /* renamed from: z, reason: collision with root package name */
    public final a f45824z;

    /* compiled from: TextViewWithAccessibleSpans.kt */
    public final class a extends V0.a {
        public a() {
            super(p.this);
        }

        public final V6.d A(int i) {
            if (i == -1) {
                return null;
            }
            p pVar = p.this;
            if (pVar.f45822x.size() == 0) {
                return null;
            }
            ArrayList arrayList = pVar.f45822x;
            if (i < arrayList.size() && i >= 0) {
                return (V6.d) arrayList.get(i);
            }
            return null;
        }

        @Override // V0.a
        public final int o(float f10, float f11) {
            RectF rectF = new RectF();
            Iterator it = p.this.f45822x.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i10 = i + 1;
                if (i < 0) {
                    C2092m.a0();
                    throw null;
                }
                V6.d dVar = (V6.d) next;
                dVar.getClass();
                rectF.set(dVar.f12961h);
                rectF.offset(r1.getPaddingLeft(), r1.getPaddingTop());
                if (rectF.contains(f10, f11)) {
                    return i;
                }
                i = i10;
            }
            return -1;
        }

        @Override // V0.a
        public final void p(ArrayList arrayList) {
            Iterator it = p.this.f45822x.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i10 = i + 1;
                if (i < 0) {
                    C2092m.a0();
                    throw null;
                }
                arrayList.add(Integer.valueOf(i));
                i = i10;
            }
        }

        @Override // V0.a
        public final boolean u(int i, int i10, Bundle bundle) {
            d.a aVar;
            V6.j jVar;
            V6.d dVarA = A(i);
            if (dVarA == null || (aVar = dVarA.f12959f) == null || (jVar = aVar.f12964c) == null || i10 != 16) {
                return false;
            }
            C0675l divView = (C0675l) jVar.f12999a;
            kotlin.jvm.internal.l.f(divView, "$divView");
            C0672i c0672i = (C0672i) jVar.f13000b;
            TextView textView = (TextView) jVar.f13001c;
            kotlin.jvm.internal.l.f(textView, "$textView");
            divView.getDiv2Component$div_release().k().f(c0672i, textView, (List) jVar.f13002d);
            return true;
        }

        @Override // V0.a
        public final void w(int i, M0.g gVar) {
            String str;
            V6.d dVarA = A(i);
            if (dVarA == null) {
                return;
            }
            d.a aVar = dVarA.f12959f;
            if (aVar == null || (str = aVar.f12962a) == null) {
                str = "";
            }
            gVar.j(str);
            p pVar = p.this;
            String packageName = pVar.getContext().getPackageName();
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4122a;
            accessibilityNodeInfo.setPackageName(packageName);
            Rect rect = new Rect();
            RectF rectF = dVarA.f12961h;
            rect.set(com.google.gson.internal.c.y(rectF.left), com.google.gson.internal.c.y(rectF.top), com.google.gson.internal.c.y(rectF.right), com.google.gson.internal.c.y(rectF.bottom));
            rect.offset(pVar.getPaddingLeft(), pVar.getPaddingTop());
            accessibilityNodeInfo.setContentDescription(aVar != null ? aVar.f12963b : null);
            if ((aVar != null ? aVar.f12964c : null) == null) {
                accessibilityNodeInfo.setClickable(false);
            } else {
                accessibilityNodeInfo.setClickable(true);
                gVar.a(16);
            }
            gVar.i(rect);
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return com.google.gson.internal.c.g(Integer.valueOf(((Number) t11).intValue()), Integer.valueOf(((Number) t10).intValue()));
        }
    }

    public p(Context context) {
        super(context, R.attr.divTextStyle);
        this.f45822x = new ArrayList();
        this.f45823y = new ArrayList();
        if (C6.a.f926b == null) {
            Object systemService = context.getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            C6.a.f926b = accessibilityManager != null ? Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()) : Boolean.FALSE;
        }
        if (!kotlin.jvm.internal.l.b(C6.a.f926b, Boolean.TRUE)) {
            this.f45824z = null;
            return;
        }
        a aVar = new a();
        this.f45824z = aVar;
        I.o(this, aVar);
        setAccessibilityLiveRegion(1);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent event) {
        kotlin.jvm.internal.l.f(event, "event");
        a aVar = this.f45824z;
        return (aVar != null && aVar.m(event)) || super.dispatchHoverEvent(event);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.l.f(event, "event");
        a aVar = this.f45824z;
        return (aVar != null && aVar.n(event)) || super.dispatchKeyEvent(event);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        super.onDraw(canvas);
        Iterator it = this.f45822x.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            a aVar = this.f45824z;
            if (aVar != null) {
                aVar.q(i, 0);
            }
            i = i10;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i, Rect rect) {
        super.onFocusChanged(z10, i, rect);
        a aVar = this.f45824z;
        if (aVar != null) {
            aVar.t(z10, i, rect);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            r5 = this;
            java.lang.Boolean r0 = C6.a.f926b
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.l.b(r0, r1)
            if (r0 != 0) goto L10
            java.lang.String r0 = r5.f45821A
            super.setContentDescription(r0)
            return
        L10:
            java.util.ArrayList r0 = r5.f45823y
            if (r0 == 0) goto Lb8
            java.lang.String r1 = r5.f45821A
            if (r1 == 0) goto L1a
            goto Lb8
        L1a:
            int r1 = r0.size()
            r2 = 0
            if (r1 != 0) goto L23
            goto Lba
        L23:
            java.lang.CharSequence r1 = r5.getText()
            int r1 = r1.length()
            if (r1 != 0) goto L2f
            goto Lba
        L2f:
            java.lang.CharSequence r1 = r5.getText()
            boolean r3 = r1 instanceof android.text.SpannableString
            if (r3 == 0) goto L3a
            r2 = r1
            android.text.SpannableString r2 = (android.text.SpannableString) r2
        L3a:
            if (r2 == 0) goto Laf
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = c9.C2092m.T(r0, r3)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L4b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L63
            java.lang.Object r3 = r0.next()
            V6.d r3 = (V6.d) r3
            int r3 = r2.getSpanStart(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
            goto L4b
        L63:
            r7.p$b r0 = new r7.p$b
            r0.<init>()
            java.util.List r0 = c9.C2097r.C0(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L78:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L96
            java.lang.Object r3 = r0.next()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.CharSequence r4 = r5.getText()
            java.lang.CharSequence r2 = r4.subSequence(r2, r3)
            r1.append(r2)
            int r2 = r3 + 1
            goto L78
        L96:
            java.lang.CharSequence r0 = r5.getText()
            java.lang.CharSequence r3 = r5.getText()
            int r3 = r3.length()
            java.lang.CharSequence r0 = r0.subSequence(r2, r3)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            if (r2 != 0) goto Lba
        Laf:
            java.lang.CharSequence r0 = r5.getText()
            java.lang.String r2 = r0.toString()
            goto Lba
        Lb8:
            java.lang.String r2 = r5.f45821A
        Lba:
            super.setContentDescription(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.p.p():void");
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        this.f45821A = charSequence != null ? charSequence.toString() : null;
        super.setContentDescription(charSequence);
    }

    @Override // r7.C5535f, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        p();
    }
}
