package androidx.constraintlayout.motion.widget;

import a0.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import b0.f;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final MotionLayout f1953a;

    /* renamed from: n, reason: collision with root package name */
    public MotionEvent f1966n;

    /* renamed from: q, reason: collision with root package name */
    public MotionLayout.g f1969q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1970r;

    /* renamed from: s, reason: collision with root package name */
    public final d f1971s;

    /* renamed from: t, reason: collision with root package name */
    public float f1972t;

    /* renamed from: u, reason: collision with root package name */
    public float f1973u;

    /* renamed from: b, reason: collision with root package name */
    public f f1954b = null;

    /* renamed from: c, reason: collision with root package name */
    public b f1955c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1956d = false;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1957e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public b f1958f = null;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1959g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public SparseArray f1960h = new SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public HashMap f1961i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public SparseIntArray f1962j = new SparseIntArray();

    /* renamed from: k, reason: collision with root package name */
    public boolean f1963k = false;

    /* renamed from: l, reason: collision with root package name */
    public int f1964l = 400;

    /* renamed from: m, reason: collision with root package name */
    public int f1965m = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1967o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1968p = false;

    /* renamed from: androidx.constraintlayout.motion.widget.a$a, reason: collision with other inner class name */
    public class InterpolatorC0010a implements Interpolator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v.c f1974a;

        public InterpolatorC0010a(v.c cVar) {
            this.f1974a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (float) this.f1974a.a(f10);
        }
    }

    public a(Context context, MotionLayout motionLayout, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        this.f1953a = motionLayout;
        this.f1971s = new d(motionLayout);
        J(context, i10);
        SparseArray sparseArray = this.f1960h;
        int i11 = b0.c.motion_base;
        sparseArray.put(i11, new androidx.constraintlayout.widget.c());
        this.f1961i.put("motion_base", Integer.valueOf(i11));
    }

    public static String Z(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }

    public float A() {
        b bVar = this.f1955c;
        if (bVar == null || bVar.f1987l == null) {
            return 0.0f;
        }
        return this.f1955c.f1987l.m();
    }

    public float B() {
        b bVar = this.f1955c;
        if (bVar == null || bVar.f1987l == null) {
            return 0.0f;
        }
        return this.f1955c.f1987l.n();
    }

    public float C() {
        b bVar = this.f1955c;
        if (bVar == null || bVar.f1987l == null) {
            return 0.0f;
        }
        return this.f1955c.f1987l.o();
    }

    public float D() {
        b bVar = this.f1955c;
        if (bVar != null) {
            return bVar.f1984i;
        }
        return 0.0f;
    }

    public int E() {
        b bVar = this.f1955c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f1979d;
    }

    public b F(int i10) {
        ArrayList arrayList = this.f1957e;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            b bVar = (b) obj;
            if (bVar.f1976a == i10) {
                return bVar;
            }
        }
        return null;
    }

    public List G(int i10) {
        int iX = x(i10);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f1957e;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            b bVar = (b) obj;
            if (bVar.f1979d == iX || bVar.f1978c == iX) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final boolean H(int i10) {
        int i11 = this.f1962j.get(i10);
        int size = this.f1962j.size();
        while (i11 > 0) {
            if (i11 == i10) {
                return true;
            }
            int i12 = size - 1;
            if (size < 0) {
                return true;
            }
            i11 = this.f1962j.get(i11);
            size = i12;
        }
        return false;
    }

    public final boolean I() {
        return this.f1969q != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(android.content.Context r9, int r10) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.a.J(android.content.Context, int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int K(android.content.Context r14, org.xmlpull.v1.XmlPullParser r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r13 = this;
            androidx.constraintlayout.widget.c r0 = new androidx.constraintlayout.widget.c
            r0.<init>()
            r1 = 0
            r0.Q(r1)
            int r2 = r15.getAttributeCount()
            r3 = -1
            r4 = r1
            r5 = r3
            r6 = r5
        L11:
            r7 = 1
            if (r4 >= r2) goto L8a
            java.lang.String r8 = r15.getAttributeName(r4)
            java.lang.String r9 = r15.getAttributeValue(r4)
            boolean r10 = r13.f1963k
            if (r10 == 0) goto L36
            java.io.PrintStream r10 = java.lang.System.out
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "id string = "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            r10.println(r11)
        L36:
            r8.getClass()
            int r10 = r8.hashCode()
            switch(r10) {
                case -1995929160: goto L56;
                case -1496482599: goto L4d;
                case 3355: goto L42;
                default: goto L40;
            }
        L40:
            r7 = r3
            goto L60
        L42:
            java.lang.String r7 = "id"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L4b
            goto L40
        L4b:
            r7 = 2
            goto L60
        L4d:
            java.lang.String r10 = "deriveConstraintsFrom"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L60
            goto L40
        L56:
            java.lang.String r7 = "ConstraintRotate"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L5f
            goto L40
        L5f:
            r7 = r1
        L60:
            switch(r7) {
                case 0: goto L81;
                case 1: goto L7c;
                case 2: goto L64;
                default: goto L63;
            }
        L63:
            goto L87
        L64:
            int r5 = r13.q(r14, r9)
            java.util.HashMap r7 = r13.f1961i
            java.lang.String r8 = Z(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.put(r8, r9)
            java.lang.String r7 = a0.a.c(r14, r5)
            r0.f2192b = r7
            goto L87
        L7c:
            int r6 = r13.q(r14, r9)
            goto L87
        L81:
            int r7 = java.lang.Integer.parseInt(r9)
            r0.f2194d = r7
        L87:
            int r4 = r4 + 1
            goto L11
        L8a:
            if (r5 == r3) goto La4
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r13.f1953a
            int r1 = r1.V
            if (r1 == 0) goto L95
            r0.R(r7)
        L95:
            r0.D(r14, r15)
            if (r6 == r3) goto L9f
            android.util.SparseIntArray r14 = r13.f1962j
            r14.put(r5, r6)
        L9f:
            android.util.SparseArray r14 = r13.f1960h
            r14.put(r5, r0)
        La4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.a.K(android.content.Context, org.xmlpull.v1.XmlPullParser):int");
    }

    public final int L(Context context, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return K(context, xml);
                }
            }
            return -1;
        } catch (IOException e10) {
            e10.printStackTrace();
            return -1;
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    public final void M(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), b0.d.include);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == b0.d.include_constraintSet) {
                L(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void N(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), b0.d.MotionScene);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == b0.d.MotionScene_defaultDuration) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f1964l);
                this.f1964l = i11;
                if (i11 < 8) {
                    this.f1964l = 8;
                }
            } else if (index == b0.d.MotionScene_layoutDuringTransition) {
                this.f1965m = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void O(float f10, float f11) {
        b bVar = this.f1955c;
        if (bVar == null || bVar.f1987l == null) {
            return;
        }
        this.f1955c.f1987l.t(f10, f11);
    }

    public void P(float f10, float f11) {
        b bVar = this.f1955c;
        if (bVar == null || bVar.f1987l == null) {
            return;
        }
        this.f1955c.f1987l.u(f10, f11);
    }

    public void Q(MotionEvent motionEvent, int i10, MotionLayout motionLayout) {
        MotionLayout.g gVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f1969q == null) {
            this.f1969q = this.f1953a.u0();
        }
        this.f1969q.a(motionEvent);
        if (i10 != -1) {
            int action = motionEvent.getAction();
            boolean z10 = false;
            if (action == 0) {
                this.f1972t = motionEvent.getRawX();
                this.f1973u = motionEvent.getRawY();
                this.f1966n = motionEvent;
                this.f1967o = false;
                if (this.f1955c.f1987l != null) {
                    RectF rectFF = this.f1955c.f1987l.f(this.f1953a, rectF);
                    if (rectFF != null && !rectFF.contains(this.f1966n.getX(), this.f1966n.getY())) {
                        this.f1966n = null;
                        this.f1967o = true;
                        return;
                    }
                    RectF rectFP = this.f1955c.f1987l.p(this.f1953a, rectF);
                    if (rectFP == null || rectFP.contains(this.f1966n.getX(), this.f1966n.getY())) {
                        this.f1968p = false;
                    } else {
                        this.f1968p = true;
                    }
                    this.f1955c.f1987l.v(this.f1972t, this.f1973u);
                    return;
                }
                return;
            }
            if (action == 2 && !this.f1967o) {
                float rawY = motionEvent.getRawY() - this.f1973u;
                float rawX = motionEvent.getRawX() - this.f1972t;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f1966n) == null) {
                    return;
                }
                b bVarH = h(i10, rawX, rawY, motionEvent2);
                if (bVarH != null) {
                    motionLayout.setTransition(bVarH);
                    RectF rectFP2 = this.f1955c.f1987l.p(this.f1953a, rectF);
                    if (rectFP2 != null && !rectFP2.contains(this.f1966n.getX(), this.f1966n.getY())) {
                        z10 = true;
                    }
                    this.f1968p = z10;
                    this.f1955c.f1987l.x(this.f1972t, this.f1973u);
                }
            }
        }
        if (this.f1967o) {
            return;
        }
        b bVar = this.f1955c;
        if (bVar != null && bVar.f1987l != null && !this.f1968p) {
            this.f1955c.f1987l.r(motionEvent, this.f1969q, i10, this);
        }
        this.f1972t = motionEvent.getRawX();
        this.f1973u = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (gVar = this.f1969q) == null) {
            return;
        }
        gVar.d();
        this.f1969q = null;
        int i11 = motionLayout.D;
        if (i11 != -1) {
            g(motionLayout, i11);
        }
    }

    public final void R(int i10, MotionLayout motionLayout) {
        androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) this.f1960h.get(i10);
        cVar.f2193c = cVar.f2192b;
        int i11 = this.f1962j.get(i10);
        if (i11 > 0) {
            R(i11, motionLayout);
            androidx.constraintlayout.widget.c cVar2 = (androidx.constraintlayout.widget.c) this.f1960h.get(i11);
            if (cVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + a0.a.c(this.f1953a.getContext(), i11));
                return;
            }
            cVar.f2193c += "/" + cVar2.f2193c;
            cVar.L(cVar2);
        } else {
            cVar.f2193c += "  layout";
            cVar.K(motionLayout);
        }
        cVar.h(cVar);
    }

    public void S(MotionLayout motionLayout) {
        for (int i10 = 0; i10 < this.f1960h.size(); i10++) {
            int iKeyAt = this.f1960h.keyAt(i10);
            if (H(iKeyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            R(iKeyAt, motionLayout);
        }
    }

    public void T(int i10, androidx.constraintlayout.widget.c cVar) {
        this.f1960h.put(i10, cVar);
    }

    public void U(int i10) {
        b bVar = this.f1955c;
        if (bVar != null) {
            bVar.E(i10);
        } else {
            this.f1964l = i10;
        }
    }

    public void V(boolean z10) {
        this.f1970r = z10;
        b bVar = this.f1955c;
        if (bVar == null || bVar.f1987l == null) {
            return;
        }
        this.f1955c.f1987l.w(this.f1970r);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void W(int r10, int r11) {
        /*
            r9 = this;
            b0.f r0 = r9.f1954b
            r1 = -1
            if (r0 == 0) goto L18
            int r0 = r0.c(r10, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r10
        Ld:
            b0.f r2 = r9.f1954b
            int r2 = r2.c(r11, r1, r1)
            if (r2 == r1) goto L16
            goto L1a
        L16:
            r2 = r11
            goto L1a
        L18:
            r0 = r10
            goto L16
        L1a:
            androidx.constraintlayout.motion.widget.a$b r3 = r9.f1955c
            if (r3 == 0) goto L2d
            int r3 = androidx.constraintlayout.motion.widget.a.b.a(r3)
            if (r3 != r11) goto L2d
            androidx.constraintlayout.motion.widget.a$b r3 = r9.f1955c
            int r3 = androidx.constraintlayout.motion.widget.a.b.c(r3)
            if (r3 != r10) goto L2d
            goto L6c
        L2d:
            java.util.ArrayList r3 = r9.f1957e
            int r4 = r3.size()
            r5 = 0
            r6 = r5
        L35:
            if (r6 >= r4) goto L6d
            java.lang.Object r7 = r3.get(r6)
            int r6 = r6 + 1
            androidx.constraintlayout.motion.widget.a$b r7 = (androidx.constraintlayout.motion.widget.a.b) r7
            int r8 = androidx.constraintlayout.motion.widget.a.b.a(r7)
            if (r8 != r2) goto L4b
            int r8 = androidx.constraintlayout.motion.widget.a.b.c(r7)
            if (r8 == r0) goto L57
        L4b:
            int r8 = androidx.constraintlayout.motion.widget.a.b.a(r7)
            if (r8 != r11) goto L35
            int r8 = androidx.constraintlayout.motion.widget.a.b.c(r7)
            if (r8 != r10) goto L35
        L57:
            r9.f1955c = r7
            if (r7 == 0) goto L6c
            androidx.constraintlayout.motion.widget.b r10 = androidx.constraintlayout.motion.widget.a.b.l(r7)
            if (r10 == 0) goto L6c
            androidx.constraintlayout.motion.widget.a$b r10 = r9.f1955c
            androidx.constraintlayout.motion.widget.b r10 = androidx.constraintlayout.motion.widget.a.b.l(r10)
            boolean r11 = r9.f1970r
            r10.w(r11)
        L6c:
            return
        L6d:
            androidx.constraintlayout.motion.widget.a$b r10 = r9.f1958f
            java.util.ArrayList r3 = r9.f1959g
            int r4 = r3.size()
        L75:
            if (r5 >= r4) goto L87
            java.lang.Object r6 = r3.get(r5)
            int r5 = r5 + 1
            androidx.constraintlayout.motion.widget.a$b r6 = (androidx.constraintlayout.motion.widget.a.b) r6
            int r7 = androidx.constraintlayout.motion.widget.a.b.a(r6)
            if (r7 != r11) goto L75
            r10 = r6
            goto L75
        L87:
            androidx.constraintlayout.motion.widget.a$b r11 = new androidx.constraintlayout.motion.widget.a$b
            r11.<init>(r9, r10)
            androidx.constraintlayout.motion.widget.a.b.d(r11, r0)
            androidx.constraintlayout.motion.widget.a.b.b(r11, r2)
            if (r0 == r1) goto L99
            java.util.ArrayList r10 = r9.f1957e
            r10.add(r11)
        L99:
            r9.f1955c = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.a.W(int, int):void");
    }

    public void X(b bVar) {
        this.f1955c = bVar;
        if (bVar == null || bVar.f1987l == null) {
            return;
        }
        this.f1955c.f1987l.w(this.f1970r);
    }

    public void Y() {
        b bVar = this.f1955c;
        if (bVar == null || bVar.f1987l == null) {
            return;
        }
        this.f1955c.f1987l.y();
    }

    public boolean a0() {
        ArrayList arrayList = this.f1957e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((b) obj).f1987l != null) {
                return true;
            }
        }
        b bVar = this.f1955c;
        return (bVar == null || bVar.f1987l == null) ? false : true;
    }

    public void f(MotionLayout motionLayout, int i10) {
        ArrayList arrayList = this.f1957e;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            b bVar = (b) obj;
            if (bVar.f1988m.size() > 0) {
                ArrayList arrayList2 = bVar.f1988m;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    ((b.ViewOnClickListenerC0011a) obj2).c(motionLayout);
                }
            }
        }
        ArrayList arrayList3 = this.f1959g;
        int size3 = arrayList3.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList3.get(i13);
            i13++;
            b bVar2 = (b) obj3;
            if (bVar2.f1988m.size() > 0) {
                ArrayList arrayList4 = bVar2.f1988m;
                int size4 = arrayList4.size();
                int i14 = 0;
                while (i14 < size4) {
                    Object obj4 = arrayList4.get(i14);
                    i14++;
                    ((b.ViewOnClickListenerC0011a) obj4).c(motionLayout);
                }
            }
        }
        ArrayList arrayList5 = this.f1957e;
        int size5 = arrayList5.size();
        int i15 = 0;
        while (i15 < size5) {
            Object obj5 = arrayList5.get(i15);
            i15++;
            b bVar3 = (b) obj5;
            if (bVar3.f1988m.size() > 0) {
                ArrayList arrayList6 = bVar3.f1988m;
                int size6 = arrayList6.size();
                int i16 = 0;
                while (i16 < size6) {
                    Object obj6 = arrayList6.get(i16);
                    i16++;
                    ((b.ViewOnClickListenerC0011a) obj6).a(motionLayout, i10, bVar3);
                }
            }
        }
        ArrayList arrayList7 = this.f1959g;
        int size7 = arrayList7.size();
        int i17 = 0;
        while (i17 < size7) {
            Object obj7 = arrayList7.get(i17);
            i17++;
            b bVar4 = (b) obj7;
            if (bVar4.f1988m.size() > 0) {
                ArrayList arrayList8 = bVar4.f1988m;
                int size8 = arrayList8.size();
                int i18 = 0;
                while (i18 < size8) {
                    Object obj8 = arrayList8.get(i18);
                    i18++;
                    ((b.ViewOnClickListenerC0011a) obj8).a(motionLayout, i10, bVar4);
                }
            }
        }
    }

    public boolean g(MotionLayout motionLayout, int i10) {
        b bVar;
        if (I() || this.f1956d) {
            return false;
        }
        ArrayList arrayList = this.f1957e;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            b bVar2 = (b) obj;
            if (bVar2.f1989n != 0 && ((bVar = this.f1955c) != bVar2 || !bVar.D(2))) {
                if (i10 == bVar2.f1979d && (bVar2.f1989n == 4 || bVar2.f1989n == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.f1989n == 4) {
                        motionLayout.E0();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.j0(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState);
                        motionLayout.v0();
                    }
                    return true;
                }
                if (i10 == bVar2.f1978c && (bVar2.f1989n == 3 || bVar2.f1989n == 1)) {
                    MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState2);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.f1989n == 3) {
                        motionLayout.G0();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.j0(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState2);
                        motionLayout.v0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public b h(int i10, float f10, float f11, MotionEvent motionEvent) {
        if (i10 == -1) {
            return this.f1955c;
        }
        List<b> listG = G(i10);
        RectF rectF = new RectF();
        float f12 = 0.0f;
        b bVar = null;
        for (b bVar2 : listG) {
            if (!bVar2.f1990o && bVar2.f1987l != null) {
                bVar2.f1987l.w(this.f1970r);
                RectF rectFP = bVar2.f1987l.p(this.f1953a, rectF);
                if (rectFP == null || motionEvent == null || rectFP.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF rectFF = bVar2.f1987l.f(this.f1953a, rectF);
                    if (rectFF == null || motionEvent == null || rectFF.contains(motionEvent.getX(), motionEvent.getY())) {
                        float fA = bVar2.f1987l.a(f10, f11);
                        if (bVar2.f1987l.f2008l && motionEvent != null) {
                            fA = ((float) (Math.atan2(f11 + r10, f10 + r9) - Math.atan2(motionEvent.getX() - bVar2.f1987l.f2005i, motionEvent.getY() - bVar2.f1987l.f2006j))) * 10.0f;
                        }
                        float f13 = fA * (bVar2.f1978c == i10 ? -1.0f : 1.1f);
                        if (f13 > f12) {
                            bVar = bVar2;
                            f12 = f13;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public int i() {
        b bVar = this.f1955c;
        if (bVar != null) {
            return bVar.f1991p;
        }
        return -1;
    }

    public int j() {
        b bVar = this.f1955c;
        if (bVar == null || bVar.f1987l == null) {
            return 0;
        }
        return this.f1955c.f1987l.d();
    }

    public androidx.constraintlayout.widget.c k(int i10) {
        return l(i10, -1, -1);
    }

    public androidx.constraintlayout.widget.c l(int i10, int i11, int i12) {
        int iC;
        if (this.f1963k) {
            System.out.println("id " + i10);
            System.out.println("size " + this.f1960h.size());
        }
        f fVar = this.f1954b;
        if (fVar != null && (iC = fVar.c(i10, i11, i12)) != -1) {
            i10 = iC;
        }
        if (this.f1960h.get(i10) != null) {
            return (androidx.constraintlayout.widget.c) this.f1960h.get(i10);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + a0.a.c(this.f1953a.getContext(), i10) + " In MotionScene");
        SparseArray sparseArray = this.f1960h;
        return (androidx.constraintlayout.widget.c) sparseArray.get(sparseArray.keyAt(0));
    }

    public int[] m() {
        int size = this.f1960h.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = this.f1960h.keyAt(i10);
        }
        return iArr;
    }

    public ArrayList n() {
        return this.f1957e;
    }

    public int o() {
        b bVar = this.f1955c;
        return bVar != null ? bVar.f1983h : this.f1964l;
    }

    public int p() {
        b bVar = this.f1955c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f1978c;
    }

    public final int q(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f1963k) {
                System.out.println("id getMap res = " + identifier);
            }
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return identifier;
    }

    public Interpolator r() {
        int i10 = this.f1955c.f1980e;
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(this.f1953a.getContext(), this.f1955c.f1982g);
        }
        if (i10 == -1) {
            return new InterpolatorC0010a(v.c.c(this.f1955c.f1981f));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 == 5) {
            return new OvershootInterpolator();
        }
        if (i10 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public void s(l lVar) {
        b bVar = this.f1955c;
        int i10 = 0;
        if (bVar != null) {
            ArrayList arrayList = bVar.f1986k;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((a0.f) obj).b(lVar);
            }
            return;
        }
        b bVar2 = this.f1958f;
        if (bVar2 != null) {
            ArrayList arrayList2 = bVar2.f1986k;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                ((a0.f) obj2).b(lVar);
            }
        }
    }

    public float t() {
        b bVar = this.f1955c;
        if (bVar == null || bVar.f1987l == null) {
            return 0.0f;
        }
        return this.f1955c.f1987l.g();
    }

    public float u() {
        b bVar = this.f1955c;
        if (bVar == null || bVar.f1987l == null) {
            return 0.0f;
        }
        return this.f1955c.f1987l.h();
    }

    public boolean v() {
        b bVar = this.f1955c;
        if (bVar == null || bVar.f1987l == null) {
            return false;
        }
        return this.f1955c.f1987l.i();
    }

    public float w(float f10, float f11) {
        b bVar = this.f1955c;
        if (bVar == null || bVar.f1987l == null) {
            return 0.0f;
        }
        return this.f1955c.f1987l.j(f10, f11);
    }

    public final int x(int i10) {
        int iC;
        f fVar = this.f1954b;
        return (fVar == null || (iC = fVar.c(i10, -1, -1)) == -1) ? i10 : iC;
    }

    public int y() {
        b bVar = this.f1955c;
        if (bVar == null || bVar.f1987l == null) {
            return 0;
        }
        return this.f1955c.f1987l.k();
    }

    public float z() {
        b bVar = this.f1955c;
        if (bVar == null || bVar.f1987l == null) {
            return 0.0f;
        }
        return this.f1955c.f1987l.l();
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f1976a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1977b;

        /* renamed from: c, reason: collision with root package name */
        public int f1978c;

        /* renamed from: d, reason: collision with root package name */
        public int f1979d;

        /* renamed from: e, reason: collision with root package name */
        public int f1980e;

        /* renamed from: f, reason: collision with root package name */
        public String f1981f;

        /* renamed from: g, reason: collision with root package name */
        public int f1982g;

        /* renamed from: h, reason: collision with root package name */
        public int f1983h;

        /* renamed from: i, reason: collision with root package name */
        public float f1984i;

        /* renamed from: j, reason: collision with root package name */
        public final a f1985j;

        /* renamed from: k, reason: collision with root package name */
        public ArrayList f1986k;

        /* renamed from: l, reason: collision with root package name */
        public androidx.constraintlayout.motion.widget.b f1987l;

        /* renamed from: m, reason: collision with root package name */
        public ArrayList f1988m;

        /* renamed from: n, reason: collision with root package name */
        public int f1989n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f1990o;

        /* renamed from: p, reason: collision with root package name */
        public int f1991p;

        /* renamed from: q, reason: collision with root package name */
        public int f1992q;

        /* renamed from: r, reason: collision with root package name */
        public int f1993r;

        /* renamed from: androidx.constraintlayout.motion.widget.a$b$a, reason: collision with other inner class name */
        public static class ViewOnClickListenerC0011a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final b f1994a;

            /* renamed from: b, reason: collision with root package name */
            public int f1995b;

            /* renamed from: c, reason: collision with root package name */
            public int f1996c;

            public ViewOnClickListenerC0011a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f1995b = -1;
                this.f1996c = 17;
                this.f1994a = bVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), b0.d.OnClick);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i10 = 0; i10 < indexCount; i10++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i10);
                    if (index == b0.d.OnClick_targetId) {
                        this.f1995b = typedArrayObtainStyledAttributes.getResourceId(index, this.f1995b);
                    } else if (index == b0.d.OnClick_clickAction) {
                        this.f1996c = typedArrayObtainStyledAttributes.getInt(index, this.f1996c);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View] */
            public void a(MotionLayout motionLayout, int i10, b bVar) {
                int i11 = this.f1995b;
                MotionLayout motionLayoutFindViewById = motionLayout;
                if (i11 != -1) {
                    motionLayoutFindViewById = motionLayout.findViewById(i11);
                }
                if (motionLayoutFindViewById == null) {
                    Log.e("MotionScene", "OnClick could not find id " + this.f1995b);
                    return;
                }
                int i12 = bVar.f1979d;
                int i13 = bVar.f1978c;
                if (i12 == -1) {
                    motionLayoutFindViewById.setOnClickListener(this);
                    return;
                }
                int i14 = this.f1996c;
                boolean z10 = false;
                boolean z11 = ((i14 & 1) != 0 && i10 == i12) | ((i14 & 1) != 0 && i10 == i12) | ((i14 & 256) != 0 && i10 == i12) | ((i14 & 16) != 0 && i10 == i13);
                if ((i14 & 4096) != 0 && i10 == i13) {
                    z10 = true;
                }
                if (z11 || z10) {
                    motionLayoutFindViewById.setOnClickListener(this);
                }
            }

            public boolean b(b bVar, MotionLayout motionLayout) {
                b bVar2 = this.f1994a;
                if (bVar2 == bVar) {
                    return true;
                }
                int i10 = bVar2.f1978c;
                int i11 = this.f1994a.f1979d;
                if (i11 == -1) {
                    return motionLayout.D != i10;
                }
                int i12 = motionLayout.D;
                return i12 == i11 || i12 == i10;
            }

            public void c(MotionLayout motionLayout) {
                int i10 = this.f1995b;
                if (i10 == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i10);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + this.f1995b);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MotionLayout motionLayout = this.f1994a.f1985j.f1953a;
                if (motionLayout.t0()) {
                    if (this.f1994a.f1979d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.H0(this.f1994a.f1978c);
                            return;
                        }
                        b bVar = new b(this.f1994a.f1985j, this.f1994a);
                        bVar.f1979d = currentState;
                        bVar.f1978c = this.f1994a.f1978c;
                        motionLayout.setTransition(bVar);
                        motionLayout.E0();
                        return;
                    }
                    b bVar2 = this.f1994a.f1985j.f1955c;
                    int i10 = this.f1996c;
                    boolean z10 = false;
                    boolean z11 = ((i10 & 1) == 0 && (i10 & 256) == 0) ? false : true;
                    boolean z12 = ((i10 & 16) == 0 && (i10 & 4096) == 0) ? false : true;
                    if (z11 && z12) {
                        b bVar3 = this.f1994a.f1985j.f1955c;
                        b bVar4 = this.f1994a;
                        if (bVar3 != bVar4) {
                            motionLayout.setTransition(bVar4);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z12 = false;
                            z10 = z11;
                        }
                    } else {
                        z10 = z11;
                    }
                    if (b(bVar2, motionLayout)) {
                        if (z10 && (this.f1996c & 1) != 0) {
                            motionLayout.setTransition(this.f1994a);
                            motionLayout.E0();
                            return;
                        }
                        if (z12 && (this.f1996c & 16) != 0) {
                            motionLayout.setTransition(this.f1994a);
                            motionLayout.G0();
                        } else if (z10 && (this.f1996c & 256) != 0) {
                            motionLayout.setTransition(this.f1994a);
                            motionLayout.setProgress(1.0f);
                        } else {
                            if (!z12 || (this.f1996c & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(this.f1994a);
                            motionLayout.setProgress(0.0f);
                        }
                    }
                }
            }
        }

        public b(a aVar, b bVar) {
            this.f1976a = -1;
            this.f1977b = false;
            this.f1978c = -1;
            this.f1979d = -1;
            this.f1980e = 0;
            this.f1981f = null;
            this.f1982g = -1;
            this.f1983h = 400;
            this.f1984i = 0.0f;
            this.f1986k = new ArrayList();
            this.f1987l = null;
            this.f1988m = new ArrayList();
            this.f1989n = 0;
            this.f1990o = false;
            this.f1991p = -1;
            this.f1992q = 0;
            this.f1993r = 0;
            this.f1985j = aVar;
            this.f1983h = aVar.f1964l;
            if (bVar != null) {
                this.f1991p = bVar.f1991p;
                this.f1980e = bVar.f1980e;
                this.f1981f = bVar.f1981f;
                this.f1982g = bVar.f1982g;
                this.f1983h = bVar.f1983h;
                this.f1986k = bVar.f1986k;
                this.f1984i = bVar.f1984i;
                this.f1992q = bVar.f1992q;
            }
        }

        public int A() {
            return this.f1979d;
        }

        public androidx.constraintlayout.motion.widget.b B() {
            return this.f1987l;
        }

        public boolean C() {
            return !this.f1990o;
        }

        public boolean D(int i10) {
            return (i10 & this.f1993r) != 0;
        }

        public void E(int i10) {
            this.f1983h = Math.max(i10, 8);
        }

        public void F(int i10, String str, int i11) {
            this.f1980e = i10;
            this.f1981f = str;
            this.f1982g = i11;
        }

        public void G(int i10) {
            this.f1991p = i10;
        }

        public void t(a0.f fVar) {
            this.f1986k.add(fVar);
        }

        public void u(Context context, XmlPullParser xmlPullParser) {
            this.f1988m.add(new ViewOnClickListenerC0011a(context, this, xmlPullParser));
        }

        public final void v(a aVar, Context context, TypedArray typedArray) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                if (index == b0.d.Transition_constraintSetEnd) {
                    this.f1978c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1978c);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        cVar.C(context, this.f1978c);
                        aVar.f1960h.append(this.f1978c, cVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f1978c = aVar.L(context, this.f1978c);
                    }
                } else if (index == b0.d.Transition_constraintSetStart) {
                    this.f1979d = typedArray.getResourceId(index, this.f1979d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f1979d);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
                        cVar2.C(context, this.f1979d);
                        aVar.f1960h.append(this.f1979d, cVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f1979d = aVar.L(context, this.f1979d);
                    }
                } else if (index == b0.d.Transition_motionInterpolator) {
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f1982g = resourceId;
                        if (resourceId != -1) {
                            this.f1980e = -2;
                        }
                    } else if (i11 == 3) {
                        String string = typedArray.getString(index);
                        this.f1981f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f1982g = typedArray.getResourceId(index, -1);
                                this.f1980e = -2;
                            } else {
                                this.f1980e = -1;
                            }
                        }
                    } else {
                        this.f1980e = typedArray.getInteger(index, this.f1980e);
                    }
                } else if (index == b0.d.Transition_duration) {
                    int i12 = typedArray.getInt(index, this.f1983h);
                    this.f1983h = i12;
                    if (i12 < 8) {
                        this.f1983h = 8;
                    }
                } else if (index == b0.d.Transition_staggered) {
                    this.f1984i = typedArray.getFloat(index, this.f1984i);
                } else if (index == b0.d.Transition_autoTransition) {
                    this.f1989n = typedArray.getInteger(index, this.f1989n);
                } else if (index == b0.d.Transition_android_id) {
                    this.f1976a = typedArray.getResourceId(index, this.f1976a);
                } else if (index == b0.d.Transition_transitionDisable) {
                    this.f1990o = typedArray.getBoolean(index, this.f1990o);
                } else if (index == b0.d.Transition_pathMotionArc) {
                    this.f1991p = typedArray.getInteger(index, -1);
                } else if (index == b0.d.Transition_layoutDuringTransition) {
                    this.f1992q = typedArray.getInteger(index, 0);
                } else if (index == b0.d.Transition_transitionFlags) {
                    this.f1993r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f1979d == -1) {
                this.f1977b = true;
            }
        }

        public final void w(a aVar, Context context, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b0.d.Transition);
            v(aVar, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        public int x() {
            return this.f1989n;
        }

        public int y() {
            return this.f1978c;
        }

        public int z() {
            return this.f1992q;
        }

        public b(int i10, a aVar, int i11, int i12) {
            this.f1976a = -1;
            this.f1977b = false;
            this.f1978c = -1;
            this.f1979d = -1;
            this.f1980e = 0;
            this.f1981f = null;
            this.f1982g = -1;
            this.f1983h = 400;
            this.f1984i = 0.0f;
            this.f1986k = new ArrayList();
            this.f1987l = null;
            this.f1988m = new ArrayList();
            this.f1989n = 0;
            this.f1990o = false;
            this.f1991p = -1;
            this.f1992q = 0;
            this.f1993r = 0;
            this.f1976a = i10;
            this.f1985j = aVar;
            this.f1979d = i11;
            this.f1978c = i12;
            this.f1983h = aVar.f1964l;
            this.f1992q = aVar.f1965m;
        }

        public b(a aVar, Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
            this.f1976a = -1;
            this.f1977b = false;
            this.f1978c = -1;
            this.f1979d = -1;
            this.f1980e = 0;
            this.f1981f = null;
            this.f1982g = -1;
            this.f1983h = 400;
            this.f1984i = 0.0f;
            this.f1986k = new ArrayList();
            this.f1987l = null;
            this.f1988m = new ArrayList();
            this.f1989n = 0;
            this.f1990o = false;
            this.f1991p = -1;
            this.f1992q = 0;
            this.f1993r = 0;
            this.f1983h = aVar.f1964l;
            this.f1992q = aVar.f1965m;
            this.f1985j = aVar;
            w(aVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}
