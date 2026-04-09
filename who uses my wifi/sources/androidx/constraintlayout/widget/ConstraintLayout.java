package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ai;
import defpackage.b00;
import defpackage.bi;
import defpackage.ci;
import defpackage.di;
import defpackage.ei;
import defpackage.gw3;
import defpackage.ni;
import defpackage.pi;
import defpackage.pi1;
import defpackage.qi;
import defpackage.si;
import defpackage.tv0;
import defpackage.x60;
import defpackage.zm0;
import defpackage.zy1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static tv0 u;
    public final SparseArray f;
    public final ArrayList g;
    public final qi h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public ni o;
    public gw3 p;
    public int q;
    public HashMap r;
    public final SparseArray s;
    public final di t;

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.f = new SparseArray();
        this.g = new ArrayList(4);
        this.h = new qi();
        this.i = 0;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.m = true;
        this.n = 257;
        this.o = null;
        this.p = null;
        this.q = -1;
        this.r = new HashMap();
        this.s = new SparseArray();
        this.t = new di(this, this);
        i(attributeSet, 0);
    }

    public static ci g() {
        ci ciVar = new ci(-2, -2);
        ciVar.a = -1;
        ciVar.b = -1;
        ciVar.c = -1.0f;
        ciVar.d = true;
        ciVar.e = -1;
        ciVar.f = -1;
        ciVar.g = -1;
        ciVar.h = -1;
        ciVar.i = -1;
        ciVar.j = -1;
        ciVar.k = -1;
        ciVar.l = -1;
        ciVar.m = -1;
        ciVar.n = -1;
        ciVar.o = -1;
        ciVar.p = -1;
        ciVar.q = 0;
        ciVar.r = 0.0f;
        ciVar.s = -1;
        ciVar.t = -1;
        ciVar.u = -1;
        ciVar.v = -1;
        ciVar.w = Integer.MIN_VALUE;
        ciVar.x = Integer.MIN_VALUE;
        ciVar.y = Integer.MIN_VALUE;
        ciVar.z = Integer.MIN_VALUE;
        ciVar.A = Integer.MIN_VALUE;
        ciVar.B = Integer.MIN_VALUE;
        ciVar.C = Integer.MIN_VALUE;
        ciVar.D = 0;
        ciVar.E = 0.5f;
        ciVar.F = 0.5f;
        ciVar.G = null;
        ciVar.H = -1.0f;
        ciVar.I = -1.0f;
        ciVar.J = 0;
        ciVar.K = 0;
        ciVar.L = 0;
        ciVar.M = 0;
        ciVar.N = 0;
        ciVar.O = 0;
        ciVar.P = 0;
        ciVar.Q = 0;
        ciVar.R = 1.0f;
        ciVar.S = 1.0f;
        ciVar.T = -1;
        ciVar.U = -1;
        ciVar.V = -1;
        ciVar.W = false;
        ciVar.X = false;
        ciVar.Y = null;
        ciVar.Z = 0;
        ciVar.a0 = true;
        ciVar.b0 = true;
        ciVar.c0 = false;
        ciVar.d0 = false;
        ciVar.e0 = false;
        ciVar.f0 = -1;
        ciVar.g0 = -1;
        ciVar.h0 = -1;
        ciVar.i0 = -1;
        ciVar.j0 = Integer.MIN_VALUE;
        ciVar.k0 = Integer.MIN_VALUE;
        ciVar.l0 = 0.5f;
        ciVar.p0 = new pi();
        return ciVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static tv0 getSharedValues() {
        if (u == null) {
            tv0 tv0Var = new tv0();
            new SparseIntArray();
            new HashMap();
            u = tv0Var;
        }
        return u;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ci;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((ai) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.m = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ci ciVar = new ci(context, attributeSet);
        ciVar.a = -1;
        ciVar.b = -1;
        ciVar.c = -1.0f;
        ciVar.d = true;
        ciVar.e = -1;
        ciVar.f = -1;
        ciVar.g = -1;
        ciVar.h = -1;
        ciVar.i = -1;
        ciVar.j = -1;
        ciVar.k = -1;
        ciVar.l = -1;
        ciVar.m = -1;
        ciVar.n = -1;
        ciVar.o = -1;
        ciVar.p = -1;
        ciVar.q = 0;
        ciVar.r = 0.0f;
        ciVar.s = -1;
        ciVar.t = -1;
        ciVar.u = -1;
        ciVar.v = -1;
        ciVar.w = Integer.MIN_VALUE;
        ciVar.x = Integer.MIN_VALUE;
        ciVar.y = Integer.MIN_VALUE;
        ciVar.z = Integer.MIN_VALUE;
        ciVar.A = Integer.MIN_VALUE;
        ciVar.B = Integer.MIN_VALUE;
        ciVar.C = Integer.MIN_VALUE;
        ciVar.D = 0;
        ciVar.E = 0.5f;
        ciVar.F = 0.5f;
        ciVar.G = null;
        ciVar.H = -1.0f;
        ciVar.I = -1.0f;
        ciVar.J = 0;
        ciVar.K = 0;
        ciVar.L = 0;
        ciVar.M = 0;
        ciVar.N = 0;
        ciVar.O = 0;
        ciVar.P = 0;
        ciVar.Q = 0;
        ciVar.R = 1.0f;
        ciVar.S = 1.0f;
        ciVar.T = -1;
        ciVar.U = -1;
        ciVar.V = -1;
        ciVar.W = false;
        ciVar.X = false;
        ciVar.Y = null;
        ciVar.Z = 0;
        ciVar.a0 = true;
        ciVar.b0 = true;
        ciVar.c0 = false;
        ciVar.d0 = false;
        ciVar.e0 = false;
        ciVar.f0 = -1;
        ciVar.g0 = -1;
        ciVar.h0 = -1;
        ciVar.i0 = -1;
        ciVar.j0 = Integer.MIN_VALUE;
        ciVar.k0 = Integer.MIN_VALUE;
        ciVar.l0 = 0.5f;
        ciVar.p0 = new pi();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zm0.b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = bi.a.get(index);
            switch (i2) {
                case 1:
                    ciVar.V = typedArrayObtainStyledAttributes.getInt(index, ciVar.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, ciVar.p);
                    ciVar.p = resourceId;
                    if (resourceId == -1) {
                        ciVar.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    ciVar.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ciVar.q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, ciVar.r) % 360.0f;
                    ciVar.r = f;
                    if (f < 0.0f) {
                        ciVar.r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    ciVar.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ciVar.a);
                    break;
                case 6:
                    ciVar.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ciVar.b);
                    break;
                case 7:
                    ciVar.c = typedArrayObtainStyledAttributes.getFloat(index, ciVar.c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, ciVar.e);
                    ciVar.e = resourceId2;
                    if (resourceId2 == -1) {
                        ciVar.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, ciVar.f);
                    ciVar.f = resourceId3;
                    if (resourceId3 == -1) {
                        ciVar.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, ciVar.g);
                    ciVar.g = resourceId4;
                    if (resourceId4 == -1) {
                        ciVar.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, ciVar.h);
                    ciVar.h = resourceId5;
                    if (resourceId5 == -1) {
                        ciVar.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, ciVar.i);
                    ciVar.i = resourceId6;
                    if (resourceId6 == -1) {
                        ciVar.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, ciVar.j);
                    ciVar.j = resourceId7;
                    if (resourceId7 == -1) {
                        ciVar.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, ciVar.k);
                    ciVar.k = resourceId8;
                    if (resourceId8 == -1) {
                        ciVar.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, ciVar.l);
                    ciVar.l = resourceId9;
                    if (resourceId9 == -1) {
                        ciVar.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, ciVar.m);
                    ciVar.m = resourceId10;
                    if (resourceId10 == -1) {
                        ciVar.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, ciVar.s);
                    ciVar.s = resourceId11;
                    if (resourceId11 == -1) {
                        ciVar.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, ciVar.t);
                    ciVar.t = resourceId12;
                    if (resourceId12 == -1) {
                        ciVar.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, ciVar.u);
                    ciVar.u = resourceId13;
                    if (resourceId13 == -1) {
                        ciVar.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, ciVar.v);
                    ciVar.v = resourceId14;
                    if (resourceId14 == -1) {
                        ciVar.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case zy1.zzm /* 21 */:
                    ciVar.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ciVar.w);
                    break;
                case 22:
                    ciVar.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ciVar.x);
                    break;
                case 23:
                    ciVar.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ciVar.y);
                    break;
                case 24:
                    ciVar.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ciVar.z);
                    break;
                case 25:
                    ciVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ciVar.A);
                    break;
                case 26:
                    ciVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ciVar.B);
                    break;
                case 27:
                    ciVar.W = typedArrayObtainStyledAttributes.getBoolean(index, ciVar.W);
                    break;
                case 28:
                    ciVar.X = typedArrayObtainStyledAttributes.getBoolean(index, ciVar.X);
                    break;
                case 29:
                    ciVar.E = typedArrayObtainStyledAttributes.getFloat(index, ciVar.E);
                    break;
                case 30:
                    ciVar.F = typedArrayObtainStyledAttributes.getFloat(index, ciVar.F);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    ciVar.L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    ciVar.M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        ciVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ciVar.N);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, ciVar.N) == -2) {
                            ciVar.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        ciVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ciVar.P);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, ciVar.P) == -2) {
                            ciVar.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    ciVar.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, ciVar.R));
                    ciVar.L = 2;
                    break;
                case 36:
                    try {
                        ciVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ciVar.O);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, ciVar.O) == -2) {
                            ciVar.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        ciVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ciVar.Q);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, ciVar.Q) == -2) {
                            ciVar.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    ciVar.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, ciVar.S));
                    ciVar.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            ni.h(ciVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            ciVar.H = typedArrayObtainStyledAttributes.getFloat(index, ciVar.H);
                            break;
                        case 46:
                            ciVar.I = typedArrayObtainStyledAttributes.getFloat(index, ciVar.I);
                            break;
                        case 47:
                            ciVar.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            ciVar.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            ciVar.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ciVar.T);
                            break;
                        case 50:
                            ciVar.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ciVar.U);
                            break;
                        case 51:
                            ciVar.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, ciVar.n);
                            ciVar.n = resourceId15;
                            if (resourceId15 == -1) {
                                ciVar.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, ciVar.o);
                            ciVar.o = resourceId16;
                            if (resourceId16 == -1) {
                                ciVar.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            ciVar.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ciVar.D);
                            break;
                        case 55:
                            ciVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ciVar.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    ni.g(ciVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    ni.g(ciVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    ciVar.Z = typedArrayObtainStyledAttributes.getInt(index, ciVar.Z);
                                    break;
                                case 67:
                                    ciVar.d = typedArrayObtainStyledAttributes.getBoolean(index, ciVar.d);
                                    break;
                            }
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        ciVar.a();
        return ciVar;
    }

    public int getMaxHeight() {
        return this.l;
    }

    public int getMaxWidth() {
        return this.k;
    }

    public int getMinHeight() {
        return this.j;
    }

    public int getMinWidth() {
        return this.i;
    }

    public int getOptimizationLevel() {
        return this.h.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        qi qiVar = this.h;
        if (qiVar.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                qiVar.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                qiVar.j = "parent";
            }
        }
        if (qiVar.h0 == null) {
            qiVar.h0 = qiVar.j;
        }
        ArrayList arrayList = qiVar.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            pi piVar = (pi) obj;
            View view = piVar.f0;
            if (view != null) {
                if (piVar.j == null && (id = view.getId()) != -1) {
                    piVar.j = getContext().getResources().getResourceEntryName(id);
                }
                if (piVar.h0 == null) {
                    piVar.h0 = piVar.j;
                }
            }
        }
        qiVar.n(sb);
        return sb.toString();
    }

    public final pi h(View view) {
        if (view == this) {
            return this.h;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof ci) {
            return ((ci) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof ci) {
            return ((ci) view.getLayoutParams()).p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) throws XmlPullParserException, IOException, NumberFormatException {
        qi qiVar = this.h;
        qiVar.f0 = this;
        di diVar = this.t;
        qiVar.u0 = diVar;
        qiVar.s0.f = diVar;
        this.f.put(getId(), this);
        this.o = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, zm0.b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.i);
                } else if (index == 17) {
                    this.j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.j);
                } else if (index == 14) {
                    this.k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.k);
                } else if (index == 15) {
                    this.l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.l);
                } else if (index == 113) {
                    this.n = typedArrayObtainStyledAttributes.getInt(index, this.n);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.p = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ni niVar = new ni();
                        this.o = niVar;
                        niVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.o = null;
                    }
                    this.q = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        qiVar.D0 = this.n;
        x60.q = qiVar.W(512);
    }

    public final void j(int i) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        String str;
        Context context = getContext();
        gw3 gw3Var = new gw3(5);
        gw3Var.g = new SparseArray();
        gw3Var.h = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            pi1 pi1Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                gw3Var.w(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                pi1 pi1Var2 = new pi1(context, xml);
                                ((SparseArray) gw3Var.g).put(pi1Var2.f, pi1Var2);
                                pi1Var = pi1Var2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                ei eiVar = new ei(context, xml);
                                if (pi1Var != null) {
                                    ((ArrayList) pi1Var.h).add(eiVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
        this.p = gw3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(defpackage.qi r29, int r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 1772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(qi, int, int, int):void");
    }

    public final void l(pi piVar, ci ciVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f.get(i);
        pi piVar2 = (pi) sparseArray.get(i);
        if (piVar2 == null || view == null || !(view.getLayoutParams() instanceof ci)) {
            return;
        }
        ciVar.c0 = true;
        if (i2 == 6) {
            ci ciVar2 = (ci) view.getLayoutParams();
            ciVar2.c0 = true;
            ciVar2.p0.E = true;
        }
        piVar.i(6).b(piVar2.i(i2), ciVar.D, ciVar.C, true);
        piVar.E = true;
        piVar.i(3).j();
        piVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            ci ciVar = (ci) childAt.getLayoutParams();
            pi piVar = ciVar.p0;
            if (childAt.getVisibility() != 8 || ciVar.d0 || ciVar.e0 || zIsInEditMode) {
                int iR = piVar.r();
                int iS = piVar.s();
                childAt.layout(iR, iS, piVar.q() + iR, piVar.k() + iS);
            }
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((ai) arrayList.get(i6)).j();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0552  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r35, int r36) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        pi piVarH = h(view);
        if ((view instanceof Guideline) && !(piVarH instanceof b00)) {
            ci ciVar = (ci) view.getLayoutParams();
            b00 b00Var = new b00();
            ciVar.p0 = b00Var;
            ciVar.d0 = true;
            b00Var.S(ciVar.V);
        }
        if (view instanceof ai) {
            ai aiVar = (ai) view;
            aiVar.k();
            ((ci) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.g;
            if (!arrayList.contains(aiVar)) {
                arrayList.add(aiVar);
            }
        }
        this.f.put(view.getId(), view);
        this.m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f.remove(view.getId());
        pi piVarH = h(view);
        this.h.q0.remove(piVarH);
        piVarH.C();
        this.g.remove(view);
        this.m = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.m = true;
        super.requestLayout();
    }

    public void setConstraintSet(ni niVar) {
        this.o = niVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.l) {
            return;
        }
        this.l = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.k) {
            return;
        }
        this.k = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.j) {
            return;
        }
        this.j = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(si siVar) {
        gw3 gw3Var = this.p;
        if (gw3Var != null) {
            gw3Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.n = i;
        qi qiVar = this.h;
        qiVar.D0 = i;
        x60.q = qiVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i);
        this.f = new SparseArray();
        this.g = new ArrayList(4);
        this.h = new qi();
        this.i = 0;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.m = true;
        this.n = 257;
        this.o = null;
        this.p = null;
        this.q = -1;
        this.r = new HashMap();
        this.s = new SparseArray();
        this.t = new di(this, this);
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ci ciVar = new ci(layoutParams);
        ciVar.a = -1;
        ciVar.b = -1;
        ciVar.c = -1.0f;
        ciVar.d = true;
        ciVar.e = -1;
        ciVar.f = -1;
        ciVar.g = -1;
        ciVar.h = -1;
        ciVar.i = -1;
        ciVar.j = -1;
        ciVar.k = -1;
        ciVar.l = -1;
        ciVar.m = -1;
        ciVar.n = -1;
        ciVar.o = -1;
        ciVar.p = -1;
        ciVar.q = 0;
        ciVar.r = 0.0f;
        ciVar.s = -1;
        ciVar.t = -1;
        ciVar.u = -1;
        ciVar.v = -1;
        ciVar.w = Integer.MIN_VALUE;
        ciVar.x = Integer.MIN_VALUE;
        ciVar.y = Integer.MIN_VALUE;
        ciVar.z = Integer.MIN_VALUE;
        ciVar.A = Integer.MIN_VALUE;
        ciVar.B = Integer.MIN_VALUE;
        ciVar.C = Integer.MIN_VALUE;
        ciVar.D = 0;
        ciVar.E = 0.5f;
        ciVar.F = 0.5f;
        ciVar.G = null;
        ciVar.H = -1.0f;
        ciVar.I = -1.0f;
        ciVar.J = 0;
        ciVar.K = 0;
        ciVar.L = 0;
        ciVar.M = 0;
        ciVar.N = 0;
        ciVar.O = 0;
        ciVar.P = 0;
        ciVar.Q = 0;
        ciVar.R = 1.0f;
        ciVar.S = 1.0f;
        ciVar.T = -1;
        ciVar.U = -1;
        ciVar.V = -1;
        ciVar.W = false;
        ciVar.X = false;
        ciVar.Y = null;
        ciVar.Z = 0;
        ciVar.a0 = true;
        ciVar.b0 = true;
        ciVar.c0 = false;
        ciVar.d0 = false;
        ciVar.e0 = false;
        ciVar.f0 = -1;
        ciVar.g0 = -1;
        ciVar.h0 = -1;
        ciVar.i0 = -1;
        ciVar.j0 = Integer.MIN_VALUE;
        ciVar.k0 = Integer.MIN_VALUE;
        ciVar.l0 = 0.5f;
        ciVar.p0 = new pi();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) ciVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) ciVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) ciVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) ciVar).bottomMargin = marginLayoutParams.bottomMargin;
            ciVar.setMarginStart(marginLayoutParams.getMarginStart());
            ciVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof ci)) {
            return ciVar;
        }
        ci ciVar2 = (ci) layoutParams;
        ciVar.a = ciVar2.a;
        ciVar.b = ciVar2.b;
        ciVar.c = ciVar2.c;
        ciVar.d = ciVar2.d;
        ciVar.e = ciVar2.e;
        ciVar.f = ciVar2.f;
        ciVar.g = ciVar2.g;
        ciVar.h = ciVar2.h;
        ciVar.i = ciVar2.i;
        ciVar.j = ciVar2.j;
        ciVar.k = ciVar2.k;
        ciVar.l = ciVar2.l;
        ciVar.m = ciVar2.m;
        ciVar.n = ciVar2.n;
        ciVar.o = ciVar2.o;
        ciVar.p = ciVar2.p;
        ciVar.q = ciVar2.q;
        ciVar.r = ciVar2.r;
        ciVar.s = ciVar2.s;
        ciVar.t = ciVar2.t;
        ciVar.u = ciVar2.u;
        ciVar.v = ciVar2.v;
        ciVar.w = ciVar2.w;
        ciVar.x = ciVar2.x;
        ciVar.y = ciVar2.y;
        ciVar.z = ciVar2.z;
        ciVar.A = ciVar2.A;
        ciVar.B = ciVar2.B;
        ciVar.C = ciVar2.C;
        ciVar.D = ciVar2.D;
        ciVar.E = ciVar2.E;
        ciVar.F = ciVar2.F;
        ciVar.G = ciVar2.G;
        ciVar.H = ciVar2.H;
        ciVar.I = ciVar2.I;
        ciVar.J = ciVar2.J;
        ciVar.K = ciVar2.K;
        ciVar.W = ciVar2.W;
        ciVar.X = ciVar2.X;
        ciVar.L = ciVar2.L;
        ciVar.M = ciVar2.M;
        ciVar.N = ciVar2.N;
        ciVar.P = ciVar2.P;
        ciVar.O = ciVar2.O;
        ciVar.Q = ciVar2.Q;
        ciVar.R = ciVar2.R;
        ciVar.S = ciVar2.S;
        ciVar.T = ciVar2.T;
        ciVar.U = ciVar2.U;
        ciVar.V = ciVar2.V;
        ciVar.a0 = ciVar2.a0;
        ciVar.b0 = ciVar2.b0;
        ciVar.c0 = ciVar2.c0;
        ciVar.d0 = ciVar2.d0;
        ciVar.f0 = ciVar2.f0;
        ciVar.g0 = ciVar2.g0;
        ciVar.h0 = ciVar2.h0;
        ciVar.i0 = ciVar2.i0;
        ciVar.j0 = ciVar2.j0;
        ciVar.k0 = ciVar2.k0;
        ciVar.l0 = ciVar2.l0;
        ciVar.Y = ciVar2.Y;
        ciVar.Z = ciVar2.Z;
        ciVar.p0 = ciVar2.p0;
        return ciVar;
    }
}
