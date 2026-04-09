package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.ar.core.ImageFormat;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import o1.C7048d;
import o1.C7049e;
import o1.C7050f;
import o1.C7052h;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.snmp4j.mp.MPv3;
import org.xmlpull.v1.XmlPullParserException;
import p1.C7206b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    SparseArray f30042a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f30043b;

    /* renamed from: c, reason: collision with root package name */
    protected C7050f f30044c;

    /* renamed from: d, reason: collision with root package name */
    private int f30045d;

    /* renamed from: e, reason: collision with root package name */
    private int f30046e;

    /* renamed from: f, reason: collision with root package name */
    private int f30047f;

    /* renamed from: g, reason: collision with root package name */
    private int f30048g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f30049h;

    /* renamed from: i, reason: collision with root package name */
    private int f30050i;

    /* renamed from: j, reason: collision with root package name */
    private e f30051j;

    /* renamed from: k, reason: collision with root package name */
    protected d f30052k;

    /* renamed from: l, reason: collision with root package name */
    private int f30053l;

    /* renamed from: m, reason: collision with root package name */
    private HashMap f30054m;

    /* renamed from: n, reason: collision with root package name */
    private int f30055n;

    /* renamed from: o, reason: collision with root package name */
    private int f30056o;

    /* renamed from: p, reason: collision with root package name */
    int f30057p;

    /* renamed from: q, reason: collision with root package name */
    int f30058q;

    /* renamed from: r, reason: collision with root package name */
    int f30059r;

    /* renamed from: s, reason: collision with root package name */
    int f30060s;

    /* renamed from: t, reason: collision with root package name */
    private SparseArray f30061t;

    /* renamed from: u, reason: collision with root package name */
    c f30062u;

    /* renamed from: v, reason: collision with root package name */
    private int f30063v;

    /* renamed from: w, reason: collision with root package name */
    private int f30064w;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30065a;

        static {
            int[] iArr = new int[C7049e.b.values().length];
            f30065a = iArr;
            try {
                iArr[C7049e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30065a[C7049e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30065a[C7049e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30065a[C7049e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c implements C7206b.InterfaceC2026b {

        /* renamed from: a, reason: collision with root package name */
        ConstraintLayout f30134a;

        /* renamed from: b, reason: collision with root package name */
        int f30135b;

        /* renamed from: c, reason: collision with root package name */
        int f30136c;

        /* renamed from: d, reason: collision with root package name */
        int f30137d;

        /* renamed from: e, reason: collision with root package name */
        int f30138e;

        /* renamed from: f, reason: collision with root package name */
        int f30139f;

        /* renamed from: g, reason: collision with root package name */
        int f30140g;

        public c(ConstraintLayout constraintLayout) {
            this.f30134a = constraintLayout;
        }

        @Override // p1.C7206b.InterfaceC2026b
        public final void a() {
            int childCount = this.f30134a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f30134a.getChildAt(i10);
            }
            int size = this.f30134a.f30043b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.c) this.f30134a.f30043b.get(i11)).j(this.f30134a);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:102:0x016b A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0192  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x01ae  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01db  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x01e3  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x01e8  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x0214  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x0218  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x021e  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x0234  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x023c  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x0244  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x024b  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x024d  */
        /* JADX WARN: Removed duplicated region for block: B:170:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0160  */
        @Override // p1.C7206b.InterfaceC2026b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(o1.C7049e r20, p1.C7206b.a r21) {
            /*
                Method dump skipped, instructions count: 613
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c.b(o1.e, p1.b$a):void");
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f30135b = i12;
            this.f30136c = i13;
            this.f30137d = i14;
            this.f30138e = i15;
            this.f30139f = i10;
            this.f30140g = i11;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        super(context, attributeSet);
        this.f30042a = new SparseArray();
        this.f30043b = new ArrayList(4);
        this.f30044c = new C7050f();
        this.f30045d = 0;
        this.f30046e = 0;
        this.f30047f = MPv3.MAX_MESSAGE_ID;
        this.f30048g = MPv3.MAX_MESSAGE_ID;
        this.f30049h = true;
        this.f30050i = 263;
        this.f30051j = null;
        this.f30052k = null;
        this.f30053l = -1;
        this.f30054m = new HashMap();
        this.f30055n = -1;
        this.f30056o = -1;
        this.f30057p = -1;
        this.f30058q = -1;
        this.f30059r = 0;
        this.f30060s = 0;
        this.f30061t = new SparseArray();
        this.f30062u = new c(this);
        this.f30063v = 0;
        this.f30064w = 0;
        j(attributeSet, 0, 0);
    }

    private final C7049e g(int i10) {
        if (i10 == 0) {
            return this.f30044c;
        }
        View viewFindViewById = (View) this.f30042a.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f30044c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f30119n0;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    private void j(AttributeSet attributeSet, int i10, int i11) throws XmlPullParserException, IOException {
        this.f30044c.c0(this);
        this.f30044c.f1(this.f30062u);
        this.f30042a.put(getId(), this);
        this.f30051j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f30435a1, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == i.f30505k1) {
                    this.f30045d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f30045d);
                } else if (index == i.f30512l1) {
                    this.f30046e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f30046e);
                } else if (index == i.f30491i1) {
                    this.f30047f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f30047f);
                } else if (index == i.f30498j1) {
                    this.f30048g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f30048g);
                } else if (index == i.f30346L2) {
                    this.f30050i = typedArrayObtainStyledAttributes.getInt(index, this.f30050i);
                } else if (index == i.f30351M1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f30052k = null;
                        }
                    }
                } else if (index == i.f30561s1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.f30051j = eVar;
                        eVar.k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f30051j = null;
                    }
                    this.f30053l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f30044c.g1(this.f30050i);
    }

    private void l() {
        this.f30049h = true;
        this.f30055n = -1;
        this.f30056o = -1;
        this.f30057p = -1;
        this.f30058q = -1;
        this.f30059r = 0;
        this.f30060s = 0;
    }

    private void p() throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            C7049e c7049eI = i(getChildAt(i10));
            if (c7049eI != null) {
                c7049eI.Y();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    g(childAt.getId()).d0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f30053l != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                getChildAt(i12).getId();
            }
        }
        e eVar = this.f30051j;
        if (eVar != null) {
            eVar.d(this, true);
        }
        this.f30044c.M0();
        int size = this.f30043b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                ((androidx.constraintlayout.widget.c) this.f30043b.get(i13)).l(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            getChildAt(i14);
        }
        this.f30061t.clear();
        this.f30061t.put(0, this.f30044c);
        this.f30061t.put(getId(), this.f30044c);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            this.f30061t.put(childAt2.getId(), i(childAt2));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt3 = getChildAt(i16);
            C7049e c7049eI2 = i(childAt3);
            if (c7049eI2 != null) {
                b bVar = (b) childAt3.getLayoutParams();
                this.f30044c.a(c7049eI2);
                c(zIsInEditMode, childAt3, c7049eI2, bVar, this.f30061t);
            }
        }
    }

    private boolean s() throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            p();
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    protected void c(boolean z10, View view, C7049e c7049e, b bVar, SparseArray sparseArray) throws NumberFormatException {
        float f10;
        C7049e c7049e2;
        C7049e c7049e3;
        C7049e c7049e4;
        C7049e c7049e5;
        int i10;
        bVar.a();
        bVar.f30121o0 = false;
        c7049e.D0(view.getVisibility());
        if (bVar.f30095b0) {
            c7049e.p0(true);
            c7049e.D0(8);
        }
        c7049e.c0(view);
        if (view instanceof androidx.constraintlayout.widget.c) {
            ((androidx.constraintlayout.widget.c) view).h(c7049e, this.f30044c.a1());
        }
        if (bVar.f30091Z) {
            C7052h c7052h = (C7052h) c7049e;
            int i11 = bVar.f30113k0;
            int i12 = bVar.f30115l0;
            float f11 = bVar.f30117m0;
            if (f11 != -1.0f) {
                c7052h.Q0(f11);
                return;
            } else if (i11 != -1) {
                c7052h.O0(i11);
                return;
            } else {
                if (i12 != -1) {
                    c7052h.P0(i12);
                    return;
                }
                return;
            }
        }
        int i13 = bVar.f30099d0;
        int i14 = bVar.f30101e0;
        int i15 = bVar.f30103f0;
        int i16 = bVar.f30105g0;
        int i17 = bVar.f30107h0;
        int i18 = bVar.f30109i0;
        float f12 = bVar.f30111j0;
        int i19 = bVar.f30116m;
        if (i19 != -1) {
            C7049e c7049e6 = (C7049e) sparseArray.get(i19);
            if (c7049e6 != null) {
                c7049e.k(c7049e6, bVar.f30120o, bVar.f30118n);
            }
        } else {
            if (i13 != -1) {
                C7049e c7049e7 = (C7049e) sparseArray.get(i13);
                if (c7049e7 != null) {
                    C7048d.b bVar2 = C7048d.b.LEFT;
                    f10 = f12;
                    c7049e.T(bVar2, c7049e7, bVar2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
                } else {
                    f10 = f12;
                }
            } else {
                f10 = f12;
                if (i14 != -1 && (c7049e2 = (C7049e) sparseArray.get(i14)) != null) {
                    c7049e.T(C7048d.b.LEFT, c7049e2, C7048d.b.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
                }
            }
            if (i15 != -1) {
                C7049e c7049e8 = (C7049e) sparseArray.get(i15);
                if (c7049e8 != null) {
                    c7049e.T(C7048d.b.RIGHT, c7049e8, C7048d.b.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
                }
            } else if (i16 != -1 && (c7049e3 = (C7049e) sparseArray.get(i16)) != null) {
                C7048d.b bVar3 = C7048d.b.RIGHT;
                c7049e.T(bVar3, c7049e3, bVar3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
            }
            int i20 = bVar.f30106h;
            if (i20 != -1) {
                C7049e c7049e9 = (C7049e) sparseArray.get(i20);
                if (c7049e9 != null) {
                    C7048d.b bVar4 = C7048d.b.TOP;
                    c7049e.T(bVar4, c7049e9, bVar4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f30127u);
                }
            } else {
                int i21 = bVar.f30108i;
                if (i21 != -1 && (c7049e4 = (C7049e) sparseArray.get(i21)) != null) {
                    c7049e.T(C7048d.b.TOP, c7049e4, C7048d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f30127u);
                }
            }
            int i22 = bVar.f30110j;
            if (i22 != -1) {
                C7049e c7049e10 = (C7049e) sparseArray.get(i22);
                if (c7049e10 != null) {
                    c7049e.T(C7048d.b.BOTTOM, c7049e10, C7048d.b.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f30129w);
                }
            } else {
                int i23 = bVar.f30112k;
                if (i23 != -1 && (c7049e5 = (C7049e) sparseArray.get(i23)) != null) {
                    C7048d.b bVar5 = C7048d.b.BOTTOM;
                    c7049e.T(bVar5, c7049e5, bVar5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f30129w);
                }
            }
            int i24 = bVar.f30114l;
            if (i24 != -1) {
                View view2 = (View) this.f30042a.get(i24);
                C7049e c7049e11 = (C7049e) sparseArray.get(bVar.f30114l);
                if (c7049e11 != null && view2 != null && (view2.getLayoutParams() instanceof b)) {
                    b bVar6 = (b) view2.getLayoutParams();
                    bVar.f30090Y = true;
                    bVar6.f30090Y = true;
                    C7048d.b bVar7 = C7048d.b.BASELINE;
                    c7049e.m(bVar7).b(c7049e11.m(bVar7), 0, -1, true);
                    c7049e.g0(true);
                    bVar6.f30119n0.g0(true);
                    c7049e.m(C7048d.b.TOP).l();
                    c7049e.m(C7048d.b.BOTTOM).l();
                }
            }
            float f13 = f10;
            if (f13 >= 0.0f) {
                c7049e.i0(f13);
            }
            float f14 = bVar.f30066A;
            if (f14 >= 0.0f) {
                c7049e.x0(f14);
            }
        }
        if (z10 && ((i10 = bVar.f30082Q) != -1 || bVar.f30083R != -1)) {
            c7049e.v0(i10, bVar.f30083R);
        }
        if (bVar.f30088W) {
            c7049e.l0(C7049e.b.FIXED);
            c7049e.E0(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                c7049e.l0(C7049e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            if (bVar.f30085T) {
                c7049e.l0(C7049e.b.MATCH_CONSTRAINT);
            } else {
                c7049e.l0(C7049e.b.MATCH_PARENT);
            }
            c7049e.m(C7048d.b.LEFT).f55076e = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            c7049e.m(C7048d.b.RIGHT).f55076e = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            c7049e.l0(C7049e.b.MATCH_CONSTRAINT);
            c7049e.E0(0);
        }
        if (bVar.f30089X) {
            c7049e.A0(C7049e.b.FIXED);
            c7049e.h0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                c7049e.A0(C7049e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            if (bVar.f30086U) {
                c7049e.A0(C7049e.b.MATCH_CONSTRAINT);
            } else {
                c7049e.A0(C7049e.b.MATCH_PARENT);
            }
            c7049e.m(C7048d.b.TOP).f55076e = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            c7049e.m(C7048d.b.BOTTOM).f55076e = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            c7049e.A0(C7049e.b.MATCH_CONSTRAINT);
            c7049e.h0(0);
        }
        c7049e.e0(bVar.f30067B);
        c7049e.n0(bVar.f30070E);
        c7049e.C0(bVar.f30071F);
        c7049e.j0(bVar.f30072G);
        c7049e.y0(bVar.f30073H);
        c7049e.m0(bVar.f30074I, bVar.f30076K, bVar.f30078M, bVar.f30080O);
        c7049e.B0(bVar.f30075J, bVar.f30077L, bVar.f30079N, bVar.f30081P);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.f30043b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.constraintlayout.widget.c) this.f30043b.get(i10)).k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.f30054m;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f30054m.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.f30048g;
    }

    public int getMaxWidth() {
        return this.f30047f;
    }

    public int getMinHeight() {
        return this.f30046e;
    }

    public int getMinWidth() {
        return this.f30045d;
    }

    public int getOptimizationLevel() {
        return this.f30044c.V0();
    }

    public View h(int i10) {
        return (View) this.f30042a.get(i10);
    }

    public final C7049e i(View view) {
        if (view == this) {
            return this.f30044c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f30119n0;
    }

    protected boolean k() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    protected void m(int i10) {
        this.f30052k = new d(getContext(), this, i10);
    }

    protected void n(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f30062u;
        int i14 = cVar.f30138e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f30137d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.f30047f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f30048g, iResolveSizeAndState2);
        if (z10) {
            iMin |= 16777216;
        }
        if (z11) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f30055n = iMin;
        this.f30056o = iMin2;
    }

    protected void o(C7050f c7050f, int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i13 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f30062u.c(i11, i12, iMax, iMax2, paddingWidth, i13);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        int iMax5 = (iMax3 > 0 || iMax4 > 0) ? k() ? iMax4 : iMax3 : Math.max(0, getPaddingLeft());
        int i14 = size - paddingWidth;
        int i15 = size2 - i13;
        r(c7050f, mode, i14, mode2, i15);
        c7050f.c1(i10, mode, i14, mode2, i15, this.f30055n, this.f30056o, iMax5, iMax);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            C7049e c7049e = bVar.f30119n0;
            if ((childAt.getVisibility() != 8 || bVar.f30091Z || bVar.f30093a0 || bVar.f30097c0 || zIsInEditMode) && !bVar.f30095b0) {
                int iQ = c7049e.Q();
                int iR = c7049e.R();
                childAt.layout(iQ, iR, c7049e.P() + iQ, c7049e.v() + iR);
            }
        }
        int size = this.f30043b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((androidx.constraintlayout.widget.c) this.f30043b.get(i15)).i(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        this.f30063v = i10;
        this.f30064w = i11;
        this.f30044c.h1(k());
        if (this.f30049h) {
            this.f30049h = false;
            if (s()) {
                this.f30044c.j1();
            }
        }
        o(this.f30044c, this.f30050i, i10, i11);
        n(i10, i11, this.f30044c.P(), this.f30044c.v(), this.f30044c.b1(), this.f30044c.Z0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C7049e c7049eI = i(view);
        if ((view instanceof g) && !(c7049eI instanceof C7052h)) {
            b bVar = (b) view.getLayoutParams();
            C7052h c7052h = new C7052h();
            bVar.f30119n0 = c7052h;
            bVar.f30091Z = true;
            c7052h.R0(bVar.f30084S);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.m();
            ((b) view.getLayoutParams()).f30093a0 = true;
            if (!this.f30043b.contains(cVar)) {
                this.f30043b.add(cVar);
            }
        }
        this.f30042a.put(view.getId(), view);
        this.f30049h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f30042a.remove(view.getId());
        this.f30044c.L0(i(view));
        this.f30043b.remove(view);
        this.f30049h = true;
    }

    public void q(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f30054m == null) {
                this.f30054m = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf(MqttTopic.TOPIC_LEVEL_SEPARATOR);
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.f30054m.put(strSubstring, num);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
  0x003e: PHI (r2v4 o1.e$b) = (r2v3 o1.e$b), (r2v0 o1.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void r(o1.C7050f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f30062u
            int r1 = r0.f30138e
            int r0 = r0.f30137d
            o1.e$b r2 = o1.C7049e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r6
            goto L38
        L1a:
            int r9 = r7.f30047f
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            o1.e$b r9 = o1.C7049e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.f30045d
            int r10 = java.lang.Math.max(r6, r10)
            goto L38
        L2e:
            o1.e$b r9 = o1.C7049e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.f30045d
            int r10 = java.lang.Math.max(r6, r10)
        L38:
            if (r11 == r5) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = r6
            goto L5d
        L40:
            int r11 = r7.f30048g
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            o1.e$b r2 = o1.C7049e.b.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.f30046e
            int r12 = java.lang.Math.max(r6, r11)
            goto L5d
        L53:
            o1.e$b r2 = o1.C7049e.b.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.f30046e
            int r12 = java.lang.Math.max(r6, r11)
        L5d:
            int r11 = r8.P()
            if (r10 != r11) goto L69
            int r11 = r8.v()
            if (r12 == r11) goto L6c
        L69:
            r8.Y0()
        L6c:
            r8.F0(r6)
            r8.G0(r6)
            int r11 = r7.f30047f
            int r11 = r11 - r0
            r8.s0(r11)
            int r11 = r7.f30048g
            int r11 = r11 - r1
            r8.r0(r11)
            r8.u0(r6)
            r8.t0(r6)
            r8.l0(r9)
            r8.E0(r10)
            r8.A0(r2)
            r8.h0(r12)
            int r9 = r7.f30045d
            int r9 = r9 - r0
            r8.u0(r9)
            int r9 = r7.f30046e
            int r9 = r9 - r1
            r8.t0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.r(o1.f, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public void setConstraintSet(e eVar) {
        this.f30051j = eVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f30042a.remove(getId());
        super.setId(i10);
        this.f30042a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f30048g) {
            return;
        }
        this.f30048g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f30047f) {
            return;
        }
        this.f30047f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f30046e) {
            return;
        }
        this.f30046e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f30045d) {
            return;
        }
        this.f30045d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        d dVar = this.f30052k;
        if (dVar != null) {
            dVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f30050i = i10;
        this.f30044c.g1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException {
        super(context, attributeSet, i10);
        this.f30042a = new SparseArray();
        this.f30043b = new ArrayList(4);
        this.f30044c = new C7050f();
        this.f30045d = 0;
        this.f30046e = 0;
        this.f30047f = MPv3.MAX_MESSAGE_ID;
        this.f30048g = MPv3.MAX_MESSAGE_ID;
        this.f30049h = true;
        this.f30050i = 263;
        this.f30051j = null;
        this.f30052k = null;
        this.f30053l = -1;
        this.f30054m = new HashMap();
        this.f30055n = -1;
        this.f30056o = -1;
        this.f30057p = -1;
        this.f30058q = -1;
        this.f30059r = 0;
        this.f30060s = 0;
        this.f30061t = new SparseArray();
        this.f30062u = new c(this);
        this.f30063v = 0;
        this.f30064w = 0;
        j(attributeSet, i10, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A, reason: collision with root package name */
        public float f30066A;

        /* renamed from: B, reason: collision with root package name */
        public String f30067B;

        /* renamed from: C, reason: collision with root package name */
        float f30068C;

        /* renamed from: D, reason: collision with root package name */
        int f30069D;

        /* renamed from: E, reason: collision with root package name */
        public float f30070E;

        /* renamed from: F, reason: collision with root package name */
        public float f30071F;

        /* renamed from: G, reason: collision with root package name */
        public int f30072G;

        /* renamed from: H, reason: collision with root package name */
        public int f30073H;

        /* renamed from: I, reason: collision with root package name */
        public int f30074I;

        /* renamed from: J, reason: collision with root package name */
        public int f30075J;

        /* renamed from: K, reason: collision with root package name */
        public int f30076K;

        /* renamed from: L, reason: collision with root package name */
        public int f30077L;

        /* renamed from: M, reason: collision with root package name */
        public int f30078M;

        /* renamed from: N, reason: collision with root package name */
        public int f30079N;

        /* renamed from: O, reason: collision with root package name */
        public float f30080O;

        /* renamed from: P, reason: collision with root package name */
        public float f30081P;

        /* renamed from: Q, reason: collision with root package name */
        public int f30082Q;

        /* renamed from: R, reason: collision with root package name */
        public int f30083R;

        /* renamed from: S, reason: collision with root package name */
        public int f30084S;

        /* renamed from: T, reason: collision with root package name */
        public boolean f30085T;

        /* renamed from: U, reason: collision with root package name */
        public boolean f30086U;

        /* renamed from: V, reason: collision with root package name */
        public String f30087V;

        /* renamed from: W, reason: collision with root package name */
        boolean f30088W;

        /* renamed from: X, reason: collision with root package name */
        boolean f30089X;

        /* renamed from: Y, reason: collision with root package name */
        boolean f30090Y;

        /* renamed from: Z, reason: collision with root package name */
        boolean f30091Z;

        /* renamed from: a, reason: collision with root package name */
        public int f30092a;

        /* renamed from: a0, reason: collision with root package name */
        boolean f30093a0;

        /* renamed from: b, reason: collision with root package name */
        public int f30094b;

        /* renamed from: b0, reason: collision with root package name */
        boolean f30095b0;

        /* renamed from: c, reason: collision with root package name */
        public float f30096c;

        /* renamed from: c0, reason: collision with root package name */
        boolean f30097c0;

        /* renamed from: d, reason: collision with root package name */
        public int f30098d;

        /* renamed from: d0, reason: collision with root package name */
        int f30099d0;

        /* renamed from: e, reason: collision with root package name */
        public int f30100e;

        /* renamed from: e0, reason: collision with root package name */
        int f30101e0;

        /* renamed from: f, reason: collision with root package name */
        public int f30102f;

        /* renamed from: f0, reason: collision with root package name */
        int f30103f0;

        /* renamed from: g, reason: collision with root package name */
        public int f30104g;

        /* renamed from: g0, reason: collision with root package name */
        int f30105g0;

        /* renamed from: h, reason: collision with root package name */
        public int f30106h;

        /* renamed from: h0, reason: collision with root package name */
        int f30107h0;

        /* renamed from: i, reason: collision with root package name */
        public int f30108i;

        /* renamed from: i0, reason: collision with root package name */
        int f30109i0;

        /* renamed from: j, reason: collision with root package name */
        public int f30110j;

        /* renamed from: j0, reason: collision with root package name */
        float f30111j0;

        /* renamed from: k, reason: collision with root package name */
        public int f30112k;

        /* renamed from: k0, reason: collision with root package name */
        int f30113k0;

        /* renamed from: l, reason: collision with root package name */
        public int f30114l;

        /* renamed from: l0, reason: collision with root package name */
        int f30115l0;

        /* renamed from: m, reason: collision with root package name */
        public int f30116m;

        /* renamed from: m0, reason: collision with root package name */
        float f30117m0;

        /* renamed from: n, reason: collision with root package name */
        public int f30118n;

        /* renamed from: n0, reason: collision with root package name */
        C7049e f30119n0;

        /* renamed from: o, reason: collision with root package name */
        public float f30120o;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f30121o0;

        /* renamed from: p, reason: collision with root package name */
        public int f30122p;

        /* renamed from: q, reason: collision with root package name */
        public int f30123q;

        /* renamed from: r, reason: collision with root package name */
        public int f30124r;

        /* renamed from: s, reason: collision with root package name */
        public int f30125s;

        /* renamed from: t, reason: collision with root package name */
        public int f30126t;

        /* renamed from: u, reason: collision with root package name */
        public int f30127u;

        /* renamed from: v, reason: collision with root package name */
        public int f30128v;

        /* renamed from: w, reason: collision with root package name */
        public int f30129w;

        /* renamed from: x, reason: collision with root package name */
        public int f30130x;

        /* renamed from: y, reason: collision with root package name */
        public int f30131y;

        /* renamed from: z, reason: collision with root package name */
        public float f30132z;

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f30133a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f30133a = sparseIntArray;
                sparseIntArray.append(i.f30513l2, 8);
                sparseIntArray.append(i.f30520m2, 9);
                sparseIntArray.append(i.f30534o2, 10);
                sparseIntArray.append(i.f30541p2, 11);
                sparseIntArray.append(i.f30583v2, 12);
                sparseIntArray.append(i.f30576u2, 13);
                sparseIntArray.append(i.f30393T1, 14);
                sparseIntArray.append(i.f30387S1, 15);
                sparseIntArray.append(i.f30375Q1, 16);
                sparseIntArray.append(i.f30399U1, 2);
                sparseIntArray.append(i.f30411W1, 3);
                sparseIntArray.append(i.f30405V1, 4);
                sparseIntArray.append(i.f30298D2, 49);
                sparseIntArray.append(i.f30304E2, 50);
                sparseIntArray.append(i.f30436a2, 5);
                sparseIntArray.append(i.f30443b2, 6);
                sparseIntArray.append(i.f30450c2, 7);
                sparseIntArray.append(i.f30442b1, 1);
                sparseIntArray.append(i.f30548q2, 17);
                sparseIntArray.append(i.f30555r2, 18);
                sparseIntArray.append(i.f30429Z1, 19);
                sparseIntArray.append(i.f30423Y1, 20);
                sparseIntArray.append(i.f30322H2, 21);
                sparseIntArray.append(i.f30340K2, 22);
                sparseIntArray.append(i.f30328I2, 23);
                sparseIntArray.append(i.f30310F2, 24);
                sparseIntArray.append(i.f30334J2, 25);
                sparseIntArray.append(i.f30316G2, 26);
                sparseIntArray.append(i.f30485h2, 29);
                sparseIntArray.append(i.f30590w2, 30);
                sparseIntArray.append(i.f30417X1, 44);
                sparseIntArray.append(i.f30499j2, 45);
                sparseIntArray.append(i.f30602y2, 46);
                sparseIntArray.append(i.f30492i2, 47);
                sparseIntArray.append(i.f30596x2, 48);
                sparseIntArray.append(i.f30363O1, 27);
                sparseIntArray.append(i.f30357N1, 28);
                sparseIntArray.append(i.f30608z2, 31);
                sparseIntArray.append(i.f30457d2, 32);
                sparseIntArray.append(i.f30286B2, 33);
                sparseIntArray.append(i.f30280A2, 34);
                sparseIntArray.append(i.f30292C2, 35);
                sparseIntArray.append(i.f30471f2, 36);
                sparseIntArray.append(i.f30464e2, 37);
                sparseIntArray.append(i.f30478g2, 38);
                sparseIntArray.append(i.f30506k2, 39);
                sparseIntArray.append(i.f30569t2, 40);
                sparseIntArray.append(i.f30527n2, 41);
                sparseIntArray.append(i.f30381R1, 42);
                sparseIntArray.append(i.f30369P1, 43);
                sparseIntArray.append(i.f30562s2, 51);
            }
        }

        public b(Context context, AttributeSet attributeSet) throws NumberFormatException {
            int i10;
            super(context, attributeSet);
            this.f30092a = -1;
            this.f30094b = -1;
            this.f30096c = -1.0f;
            this.f30098d = -1;
            this.f30100e = -1;
            this.f30102f = -1;
            this.f30104g = -1;
            this.f30106h = -1;
            this.f30108i = -1;
            this.f30110j = -1;
            this.f30112k = -1;
            this.f30114l = -1;
            this.f30116m = -1;
            this.f30118n = 0;
            this.f30120o = 0.0f;
            this.f30122p = -1;
            this.f30123q = -1;
            this.f30124r = -1;
            this.f30125s = -1;
            this.f30126t = -1;
            this.f30127u = -1;
            this.f30128v = -1;
            this.f30129w = -1;
            this.f30130x = -1;
            this.f30131y = -1;
            this.f30132z = 0.5f;
            this.f30066A = 0.5f;
            this.f30067B = null;
            this.f30068C = 0.0f;
            this.f30069D = 1;
            this.f30070E = -1.0f;
            this.f30071F = -1.0f;
            this.f30072G = 0;
            this.f30073H = 0;
            this.f30074I = 0;
            this.f30075J = 0;
            this.f30076K = 0;
            this.f30077L = 0;
            this.f30078M = 0;
            this.f30079N = 0;
            this.f30080O = 1.0f;
            this.f30081P = 1.0f;
            this.f30082Q = -1;
            this.f30083R = -1;
            this.f30084S = -1;
            this.f30085T = false;
            this.f30086U = false;
            this.f30087V = null;
            this.f30088W = true;
            this.f30089X = true;
            this.f30090Y = false;
            this.f30091Z = false;
            this.f30093a0 = false;
            this.f30095b0 = false;
            this.f30097c0 = false;
            this.f30099d0 = -1;
            this.f30101e0 = -1;
            this.f30103f0 = -1;
            this.f30105g0 = -1;
            this.f30107h0 = -1;
            this.f30109i0 = -1;
            this.f30111j0 = 0.5f;
            this.f30119n0 = new C7049e();
            this.f30121o0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f30435a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                int i12 = a.f30133a.get(index);
                switch (i12) {
                    case 1:
                        this.f30084S = typedArrayObtainStyledAttributes.getInt(index, this.f30084S);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f30116m);
                        this.f30116m = resourceId;
                        if (resourceId == -1) {
                            this.f30116m = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f30118n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30118n);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f30120o) % 360.0f;
                        this.f30120o = f10;
                        if (f10 < 0.0f) {
                            this.f30120o = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f30092a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f30092a);
                        break;
                    case 6:
                        this.f30094b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f30094b);
                        break;
                    case 7:
                        this.f30096c = typedArrayObtainStyledAttributes.getFloat(index, this.f30096c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f30098d);
                        this.f30098d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f30098d = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f30100e);
                        this.f30100e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f30100e = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f30102f);
                        this.f30102f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f30102f = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f30104g);
                        this.f30104g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f30104g = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f30106h);
                        this.f30106h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f30106h = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f30108i);
                        this.f30108i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f30108i = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f30110j);
                        this.f30110j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f30110j = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f30112k);
                        this.f30112k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f30112k = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f30114l);
                        this.f30114l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f30114l = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f30122p);
                        this.f30122p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f30122p = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f30123q);
                        this.f30123q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f30123q = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f30124r);
                        this.f30124r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f30124r = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f30125s);
                        this.f30125s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f30125s = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f30126t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30126t);
                        break;
                    case ImageFormat.RGBA_FP16 /* 22 */:
                        this.f30127u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30127u);
                        break;
                    case 23:
                        this.f30128v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30128v);
                        break;
                    case 24:
                        this.f30129w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30129w);
                        break;
                    case 25:
                        this.f30130x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30130x);
                        break;
                    case 26:
                        this.f30131y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30131y);
                        break;
                    case 27:
                        this.f30085T = typedArrayObtainStyledAttributes.getBoolean(index, this.f30085T);
                        break;
                    case 28:
                        this.f30086U = typedArrayObtainStyledAttributes.getBoolean(index, this.f30086U);
                        break;
                    case 29:
                        this.f30132z = typedArrayObtainStyledAttributes.getFloat(index, this.f30132z);
                        break;
                    case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                        this.f30066A = typedArrayObtainStyledAttributes.getFloat(index, this.f30066A);
                        break;
                    case 31:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f30074I = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i14 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f30075J = i14;
                        if (i14 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f30076K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30076K);
                            break;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f30076K) == -2) {
                                this.f30076K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f30078M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30078M);
                            break;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f30078M) == -2) {
                                this.f30078M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case ImageFormat.YUV_420_888 /* 35 */:
                        this.f30080O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f30080O));
                        this.f30074I = 2;
                        break;
                    case 36:
                        try {
                            this.f30077L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30077L);
                            break;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f30077L) == -2) {
                                this.f30077L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f30079N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30079N);
                            break;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f30079N) == -2) {
                                this.f30079N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f30081P = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f30081P));
                        this.f30075J = 2;
                        break;
                    default:
                        switch (i12) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.f30067B = string;
                                this.f30068C = Float.NaN;
                                this.f30069D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.f30067B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i10 = 0;
                                    } else {
                                        String strSubstring = this.f30067B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.f30069D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.f30069D = 1;
                                        }
                                        i10 = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.f30067B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.f30067B.substring(i10);
                                        if (strSubstring2.length() > 0) {
                                            this.f30068C = Float.parseFloat(strSubstring2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String strSubstring3 = this.f30067B.substring(i10, iIndexOf2);
                                        String strSubstring4 = this.f30067B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                            break;
                                        } else {
                                            try {
                                                float f11 = Float.parseFloat(strSubstring3);
                                                float f12 = Float.parseFloat(strSubstring4);
                                                if (f11 <= 0.0f || f12 <= 0.0f) {
                                                    break;
                                                } else if (this.f30069D == 1) {
                                                    this.f30068C = Math.abs(f12 / f11);
                                                    break;
                                                } else {
                                                    this.f30068C = Math.abs(f11 / f12);
                                                    break;
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case 45:
                                this.f30070E = typedArrayObtainStyledAttributes.getFloat(index, this.f30070E);
                                break;
                            case 46:
                                this.f30071F = typedArrayObtainStyledAttributes.getFloat(index, this.f30071F);
                                break;
                            case 47:
                                this.f30072G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f30073H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f30082Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f30082Q);
                                break;
                            case 50:
                                this.f30083R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f30083R);
                                break;
                            case 51:
                                this.f30087V = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f30091Z = false;
            this.f30088W = true;
            this.f30089X = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f30085T) {
                this.f30088W = false;
                if (this.f30074I == 0) {
                    this.f30074I = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f30086U) {
                this.f30089X = false;
                if (this.f30075J == 0) {
                    this.f30075J = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f30088W = false;
                if (i10 == 0 && this.f30074I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f30085T = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f30089X = false;
                if (i11 == 0 && this.f30075J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f30086U = true;
                }
            }
            if (this.f30096c == -1.0f && this.f30092a == -1 && this.f30094b == -1) {
                return;
            }
            this.f30091Z = true;
            this.f30088W = true;
            this.f30089X = true;
            if (!(this.f30119n0 instanceof C7052h)) {
                this.f30119n0 = new C7052h();
            }
            ((C7052h) this.f30119n0).R0(this.f30084S);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f30092a = -1;
            this.f30094b = -1;
            this.f30096c = -1.0f;
            this.f30098d = -1;
            this.f30100e = -1;
            this.f30102f = -1;
            this.f30104g = -1;
            this.f30106h = -1;
            this.f30108i = -1;
            this.f30110j = -1;
            this.f30112k = -1;
            this.f30114l = -1;
            this.f30116m = -1;
            this.f30118n = 0;
            this.f30120o = 0.0f;
            this.f30122p = -1;
            this.f30123q = -1;
            this.f30124r = -1;
            this.f30125s = -1;
            this.f30126t = -1;
            this.f30127u = -1;
            this.f30128v = -1;
            this.f30129w = -1;
            this.f30130x = -1;
            this.f30131y = -1;
            this.f30132z = 0.5f;
            this.f30066A = 0.5f;
            this.f30067B = null;
            this.f30068C = 0.0f;
            this.f30069D = 1;
            this.f30070E = -1.0f;
            this.f30071F = -1.0f;
            this.f30072G = 0;
            this.f30073H = 0;
            this.f30074I = 0;
            this.f30075J = 0;
            this.f30076K = 0;
            this.f30077L = 0;
            this.f30078M = 0;
            this.f30079N = 0;
            this.f30080O = 1.0f;
            this.f30081P = 1.0f;
            this.f30082Q = -1;
            this.f30083R = -1;
            this.f30084S = -1;
            this.f30085T = false;
            this.f30086U = false;
            this.f30087V = null;
            this.f30088W = true;
            this.f30089X = true;
            this.f30090Y = false;
            this.f30091Z = false;
            this.f30093a0 = false;
            this.f30095b0 = false;
            this.f30097c0 = false;
            this.f30099d0 = -1;
            this.f30101e0 = -1;
            this.f30103f0 = -1;
            this.f30105g0 = -1;
            this.f30107h0 = -1;
            this.f30109i0 = -1;
            this.f30111j0 = 0.5f;
            this.f30119n0 = new C7049e();
            this.f30121o0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f30092a = -1;
            this.f30094b = -1;
            this.f30096c = -1.0f;
            this.f30098d = -1;
            this.f30100e = -1;
            this.f30102f = -1;
            this.f30104g = -1;
            this.f30106h = -1;
            this.f30108i = -1;
            this.f30110j = -1;
            this.f30112k = -1;
            this.f30114l = -1;
            this.f30116m = -1;
            this.f30118n = 0;
            this.f30120o = 0.0f;
            this.f30122p = -1;
            this.f30123q = -1;
            this.f30124r = -1;
            this.f30125s = -1;
            this.f30126t = -1;
            this.f30127u = -1;
            this.f30128v = -1;
            this.f30129w = -1;
            this.f30130x = -1;
            this.f30131y = -1;
            this.f30132z = 0.5f;
            this.f30066A = 0.5f;
            this.f30067B = null;
            this.f30068C = 0.0f;
            this.f30069D = 1;
            this.f30070E = -1.0f;
            this.f30071F = -1.0f;
            this.f30072G = 0;
            this.f30073H = 0;
            this.f30074I = 0;
            this.f30075J = 0;
            this.f30076K = 0;
            this.f30077L = 0;
            this.f30078M = 0;
            this.f30079N = 0;
            this.f30080O = 1.0f;
            this.f30081P = 1.0f;
            this.f30082Q = -1;
            this.f30083R = -1;
            this.f30084S = -1;
            this.f30085T = false;
            this.f30086U = false;
            this.f30087V = null;
            this.f30088W = true;
            this.f30089X = true;
            this.f30090Y = false;
            this.f30091Z = false;
            this.f30093a0 = false;
            this.f30095b0 = false;
            this.f30097c0 = false;
            this.f30099d0 = -1;
            this.f30101e0 = -1;
            this.f30103f0 = -1;
            this.f30105g0 = -1;
            this.f30107h0 = -1;
            this.f30109i0 = -1;
            this.f30111j0 = 0.5f;
            this.f30119n0 = new C7049e();
            this.f30121o0 = false;
        }
    }
}
