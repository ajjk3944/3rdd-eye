package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import bm.e;
import c3.c;
import c3.f;
import c3.g;
import c3.i;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import g4.j;
import io.sentry.android.core.e0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import z2.h;
import z2.l;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static t L;
    public int B;
    public boolean D;
    public int E;
    public p F;
    public e G;
    public int H;
    public HashMap I;
    public final SparseArray J;
    public final g K;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1195a;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1196d;

    /* renamed from: g, reason: collision with root package name */
    public final h f1197g;

    /* renamed from: r, reason: collision with root package name */
    public int f1198r;

    /* renamed from: x, reason: collision with root package name */
    public int f1199x;

    /* renamed from: y, reason: collision with root package name */
    public int f1200y;

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.f1195a = new SparseArray();
        this.f1196d = new ArrayList(4);
        this.f1197g = new h();
        this.f1198r = 0;
        this.f1199x = 0;
        this.f1200y = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.D = true;
        this.E = 257;
        this.F = null;
        this.G = null;
        this.H = -1;
        this.I = new HashMap();
        this.J = new SparseArray();
        this.K = new g(this, this);
        i(attributeSet, 0);
    }

    public static f g() {
        f fVar = new f(-2, -2);
        fVar.f3151a = -1;
        fVar.f3153b = -1;
        fVar.f3155c = -1.0f;
        fVar.f3157d = true;
        fVar.f3159e = -1;
        fVar.f3161f = -1;
        fVar.f3163g = -1;
        fVar.f3165h = -1;
        fVar.f3167i = -1;
        fVar.j = -1;
        fVar.k = -1;
        fVar.f3171l = -1;
        fVar.f3173m = -1;
        fVar.f3175n = -1;
        fVar.f3177o = -1;
        fVar.f3179p = -1;
        fVar.f3181q = 0;
        fVar.f3182r = 0.0f;
        fVar.f3183s = -1;
        fVar.f3184t = -1;
        fVar.f3185u = -1;
        fVar.f3186v = -1;
        fVar.f3187w = Integer.MIN_VALUE;
        fVar.f3188x = Integer.MIN_VALUE;
        fVar.f3189y = Integer.MIN_VALUE;
        fVar.f3190z = Integer.MIN_VALUE;
        fVar.A = Integer.MIN_VALUE;
        fVar.B = Integer.MIN_VALUE;
        fVar.C = Integer.MIN_VALUE;
        fVar.D = 0;
        fVar.E = 0.5f;
        fVar.F = 0.5f;
        fVar.G = null;
        fVar.H = -1.0f;
        fVar.I = -1.0f;
        fVar.J = 0;
        fVar.K = 0;
        fVar.L = 0;
        fVar.M = 0;
        fVar.N = 0;
        fVar.O = 0;
        fVar.P = 0;
        fVar.Q = 0;
        fVar.R = 1.0f;
        fVar.S = 1.0f;
        fVar.T = -1;
        fVar.U = -1;
        fVar.V = -1;
        fVar.W = false;
        fVar.X = false;
        fVar.Y = null;
        fVar.Z = 0;
        fVar.f3152a0 = true;
        fVar.f3154b0 = true;
        fVar.f3156c0 = false;
        fVar.f3158d0 = false;
        fVar.f3160e0 = false;
        fVar.f3162f0 = -1;
        fVar.f3164g0 = -1;
        fVar.f3166h0 = -1;
        fVar.f3168i0 = -1;
        fVar.f3169j0 = Integer.MIN_VALUE;
        fVar.f3170k0 = Integer.MIN_VALUE;
        fVar.f3172l0 = 0.5f;
        fVar.f3180p0 = new z2.g();
        return fVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static t getSharedValues() {
        if (L == null) {
            t tVar = new t();
            new SparseIntArray();
            new HashMap();
            L = tVar;
        }
        return L;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.f1196d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((c) arrayList.get(i10)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
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

    @Override // android.view.View
    public final void forceLayout() {
        this.D = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        f fVar = new f(context, attributeSet);
        fVar.f3151a = -1;
        fVar.f3153b = -1;
        fVar.f3155c = -1.0f;
        fVar.f3157d = true;
        fVar.f3159e = -1;
        fVar.f3161f = -1;
        fVar.f3163g = -1;
        fVar.f3165h = -1;
        fVar.f3167i = -1;
        fVar.j = -1;
        fVar.k = -1;
        fVar.f3171l = -1;
        fVar.f3173m = -1;
        fVar.f3175n = -1;
        fVar.f3177o = -1;
        fVar.f3179p = -1;
        fVar.f3181q = 0;
        fVar.f3182r = 0.0f;
        fVar.f3183s = -1;
        fVar.f3184t = -1;
        fVar.f3185u = -1;
        fVar.f3186v = -1;
        fVar.f3187w = Integer.MIN_VALUE;
        fVar.f3188x = Integer.MIN_VALUE;
        fVar.f3189y = Integer.MIN_VALUE;
        fVar.f3190z = Integer.MIN_VALUE;
        fVar.A = Integer.MIN_VALUE;
        fVar.B = Integer.MIN_VALUE;
        fVar.C = Integer.MIN_VALUE;
        fVar.D = 0;
        fVar.E = 0.5f;
        fVar.F = 0.5f;
        fVar.G = null;
        fVar.H = -1.0f;
        fVar.I = -1.0f;
        fVar.J = 0;
        fVar.K = 0;
        fVar.L = 0;
        fVar.M = 0;
        fVar.N = 0;
        fVar.O = 0;
        fVar.P = 0;
        fVar.Q = 0;
        fVar.R = 1.0f;
        fVar.S = 1.0f;
        fVar.T = -1;
        fVar.U = -1;
        fVar.V = -1;
        fVar.W = false;
        fVar.X = false;
        fVar.Y = null;
        fVar.Z = 0;
        fVar.f3152a0 = true;
        fVar.f3154b0 = true;
        fVar.f3156c0 = false;
        fVar.f3158d0 = false;
        fVar.f3160e0 = false;
        fVar.f3162f0 = -1;
        fVar.f3164g0 = -1;
        fVar.f3166h0 = -1;
        fVar.f3168i0 = -1;
        fVar.f3169j0 = Integer.MIN_VALUE;
        fVar.f3170k0 = Integer.MIN_VALUE;
        fVar.f3172l0 = 0.5f;
        fVar.f3180p0 = new z2.g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.ConstraintLayout_Layout);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            int i11 = c3.e.f3150a.get(index);
            switch (i11) {
                case 1:
                    fVar.V = typedArrayObtainStyledAttributes.getInt(index, fVar.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f3179p);
                    fVar.f3179p = resourceId;
                    if (resourceId == -1) {
                        fVar.f3179p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    fVar.f3181q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.f3181q);
                    break;
                case 4:
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, fVar.f3182r) % 360.0f;
                    fVar.f3182r = f10;
                    if (f10 < 0.0f) {
                        fVar.f3182r = (360.0f - f10) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case j.STRING_FIELD_NUMBER /* 5 */:
                    fVar.f3151a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, fVar.f3151a);
                    break;
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                    fVar.f3153b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, fVar.f3153b);
                    break;
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                    fVar.f3155c = typedArrayObtainStyledAttributes.getFloat(index, fVar.f3155c);
                    break;
                case j.BYTES_FIELD_NUMBER /* 8 */:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f3159e);
                    fVar.f3159e = resourceId2;
                    if (resourceId2 == -1) {
                        fVar.f3159e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f3161f);
                    fVar.f3161f = resourceId3;
                    if (resourceId3 == -1) {
                        fVar.f3161f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f3163g);
                    fVar.f3163g = resourceId4;
                    if (resourceId4 == -1) {
                        fVar.f3163g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f3165h);
                    fVar.f3165h = resourceId5;
                    if (resourceId5 == -1) {
                        fVar.f3165h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f3167i);
                    fVar.f3167i = resourceId6;
                    if (resourceId6 == -1) {
                        fVar.f3167i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.j);
                    fVar.j = resourceId7;
                    if (resourceId7 == -1) {
                        fVar.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.k);
                    fVar.k = resourceId8;
                    if (resourceId8 == -1) {
                        fVar.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f3171l);
                    fVar.f3171l = resourceId9;
                    if (resourceId9 == -1) {
                        fVar.f3171l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f3173m);
                    fVar.f3173m = resourceId10;
                    if (resourceId10 == -1) {
                        fVar.f3173m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f3183s);
                    fVar.f3183s = resourceId11;
                    if (resourceId11 == -1) {
                        fVar.f3183s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f3184t);
                    fVar.f3184t = resourceId12;
                    if (resourceId12 == -1) {
                        fVar.f3184t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f3185u);
                    fVar.f3185u = resourceId13;
                    if (resourceId13 == -1) {
                        fVar.f3185u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f3186v);
                    fVar.f3186v = resourceId14;
                    if (resourceId14 == -1) {
                        fVar.f3186v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    fVar.f3187w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.f3187w);
                    break;
                case 22:
                    fVar.f3188x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.f3188x);
                    break;
                case 23:
                    fVar.f3189y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.f3189y);
                    break;
                case 24:
                    fVar.f3190z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.f3190z);
                    break;
                case 25:
                    fVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.A);
                    break;
                case 26:
                    fVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.B);
                    break;
                case 27:
                    fVar.W = typedArrayObtainStyledAttributes.getBoolean(index, fVar.W);
                    break;
                case 28:
                    fVar.X = typedArrayObtainStyledAttributes.getBoolean(index, fVar.X);
                    break;
                case 29:
                    fVar.E = typedArrayObtainStyledAttributes.getFloat(index, fVar.E);
                    break;
                case 30:
                    fVar.F = typedArrayObtainStyledAttributes.getFloat(index, fVar.F);
                    break;
                case 31:
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    fVar.L = i12;
                    if (i12 == 1) {
                        e0.d("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    fVar.M = i13;
                    if (i13 == 1) {
                        e0.d("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        fVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.N);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, fVar.N) == -2) {
                            fVar.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        fVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.P);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, fVar.P) == -2) {
                            fVar.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    fVar.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, fVar.R));
                    fVar.L = 2;
                    break;
                case 36:
                    try {
                        fVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.O);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, fVar.O) == -2) {
                            fVar.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        fVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.Q);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, fVar.Q) == -2) {
                            fVar.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    fVar.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, fVar.S));
                    fVar.M = 2;
                    break;
                default:
                    switch (i11) {
                        case 44:
                            p.j(fVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            fVar.H = typedArrayObtainStyledAttributes.getFloat(index, fVar.H);
                            break;
                        case 46:
                            fVar.I = typedArrayObtainStyledAttributes.getFloat(index, fVar.I);
                            break;
                        case 47:
                            fVar.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            fVar.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            fVar.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, fVar.T);
                            break;
                        case 50:
                            fVar.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, fVar.U);
                            break;
                        case 51:
                            fVar.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f3175n);
                            fVar.f3175n = resourceId15;
                            if (resourceId15 == -1) {
                                fVar.f3175n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f3177o);
                            fVar.f3177o = resourceId16;
                            if (resourceId16 == -1) {
                                fVar.f3177o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            fVar.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.D);
                            break;
                        case 55:
                            fVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.C);
                            break;
                        default:
                            switch (i11) {
                                case 64:
                                    p.i(fVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    p.i(fVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    fVar.Z = typedArrayObtainStyledAttributes.getInt(index, fVar.Z);
                                    break;
                                case 67:
                                    fVar.f3157d = typedArrayObtainStyledAttributes.getBoolean(index, fVar.f3157d);
                                    break;
                            }
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        fVar.a();
        return fVar;
    }

    public int getMaxHeight() {
        return this.B;
    }

    public int getMaxWidth() {
        return this.f1200y;
    }

    public int getMinHeight() {
        return this.f1199x;
    }

    public int getMinWidth() {
        return this.f1198r;
    }

    public int getOptimizationLevel() {
        return this.f1197g.D0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        h hVar = this.f1197g;
        if (hVar.j == null) {
            int id3 = getId();
            if (id3 != -1) {
                hVar.j = getContext().getResources().getResourceEntryName(id3);
            } else {
                hVar.j = "parent";
            }
        }
        if (hVar.f26553i0 == null) {
            hVar.f26553i0 = hVar.j;
        }
        Iterator it = hVar.f26576q0.iterator();
        while (it.hasNext()) {
            z2.g gVar = (z2.g) it.next();
            View view = gVar.f26549g0;
            if (view != null) {
                if (gVar.j == null && (id2 = view.getId()) != -1) {
                    gVar.j = getContext().getResources().getResourceEntryName(id2);
                }
                if (gVar.f26553i0 == null) {
                    gVar.f26553i0 = gVar.j;
                }
            }
        }
        hVar.n(sb2);
        return sb2.toString();
    }

    public final z2.g h(View view) {
        if (view == this) {
            return this.f1197g;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof f) {
            return ((f) view.getLayoutParams()).f3180p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof f) {
            return ((f) view.getLayoutParams()).f3180p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException, NumberFormatException {
        h hVar = this.f1197g;
        hVar.f26549g0 = this;
        g gVar = this.K;
        hVar.f26580u0 = gVar;
        hVar.f26578s0.f49h = gVar;
        this.f1195a.put(getId(), this);
        this.F = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.ConstraintLayout_Layout, i10, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == s.ConstraintLayout_Layout_android_minWidth) {
                    this.f1198r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1198r);
                } else if (index == s.ConstraintLayout_Layout_android_minHeight) {
                    this.f1199x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1199x);
                } else if (index == s.ConstraintLayout_Layout_android_maxWidth) {
                    this.f1200y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1200y);
                } else if (index == s.ConstraintLayout_Layout_android_maxHeight) {
                    this.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                } else if (index == s.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.E = typedArrayObtainStyledAttributes.getInt(index, this.E);
                } else if (index == s.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.G = null;
                        }
                    }
                } else if (index == s.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        p pVar = new p();
                        this.F = pVar;
                        pVar.g(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.F = null;
                    }
                    this.H = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        hVar.D0 = this.E;
        x2.c.f24992q = hVar.W(512);
    }

    public final void j(int i10) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        String str;
        Context context = getContext();
        e eVar = new e(7);
        eVar.f2830d = new SparseArray();
        eVar.f2831g = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            c3.h hVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                eVar.D(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                c3.h hVar2 = new c3.h(context, xml);
                                ((SparseArray) eVar.f2830d).put(hVar2.f3200b, hVar2);
                                hVar = hVar2;
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
                                i iVar = new i(context, xml);
                                if (hVar != null) {
                                    hVar.f3199a.add(iVar);
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
        } catch (IOException e4) {
            e0.c("ConstraintLayoutStates", "Error parsing resource: " + i10, e4);
        } catch (XmlPullParserException e10) {
            e0.c("ConstraintLayoutStates", "Error parsing resource: " + i10, e10);
        }
        this.G = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5 A[PHI: r12
  0x00c5: PHI (r12v43 z2.f) = (r12v42 z2.f), (r12v1 z2.f) binds: [B:35:0x00d2, B:31:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(z2.h r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 1788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(z2.h, int, int, int):void");
    }

    public final void l(z2.g gVar, f fVar, SparseArray sparseArray, int i10, z2.c cVar) {
        View view = (View) this.f1195a.get(i10);
        z2.g gVar2 = (z2.g) sparseArray.get(i10);
        if (gVar2 == null || view == null || !(view.getLayoutParams() instanceof f)) {
            return;
        }
        fVar.f3156c0 = true;
        z2.c cVar2 = z2.c.BASELINE;
        if (cVar == cVar2) {
            f fVar2 = (f) view.getLayoutParams();
            fVar2.f3156c0 = true;
            fVar2.f3180p0.E = true;
        }
        gVar.i(cVar2).b(gVar2.i(cVar), fVar.D, fVar.C, true);
        gVar.E = true;
        gVar.i(z2.c.TOP).j();
        gVar.i(z2.c.BOTTOM).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            f fVar = (f) childAt.getLayoutParams();
            z2.g gVar = fVar.f3180p0;
            if (childAt.getVisibility() != 8 || fVar.f3158d0 || fVar.f3160e0 || zIsInEditMode) {
                int iR = gVar.r();
                int iS = gVar.s();
                childAt.layout(iR, iS, gVar.q() + iR, gVar.k() + iS);
            }
        }
        ArrayList arrayList = this.f1196d;
        int size = arrayList.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((c) arrayList.get(i15)).j();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x053e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r30, int r31) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        z2.g gVarH = h(view);
        if ((view instanceof Guideline) && !(gVarH instanceof l)) {
            f fVar = (f) view.getLayoutParams();
            l lVar = new l();
            fVar.f3180p0 = lVar;
            fVar.f3158d0 = true;
            lVar.S(fVar.V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.k();
            ((f) view.getLayoutParams()).f3160e0 = true;
            ArrayList arrayList = this.f1196d;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f1195a.put(view.getId(), view);
        this.D = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1195a.remove(view.getId());
        z2.g gVarH = h(view);
        this.f1197g.f26576q0.remove(gVarH);
        gVarH.C();
        this.f1196d.remove(view);
        this.D = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.D = true;
        super.requestLayout();
    }

    public void setConstraintSet(p pVar) {
        this.F = pVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        int id2 = getId();
        SparseArray sparseArray = this.f1195a;
        sparseArray.remove(id2);
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.B) {
            return;
        }
        this.B = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f1200y) {
            return;
        }
        this.f1200y = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f1199x) {
            return;
        }
        this.f1199x = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f1198r) {
            return;
        }
        this.f1198r = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(q qVar) {
        e eVar = this.G;
        if (eVar != null) {
            eVar.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.E = i10;
        h hVar = this.f1197g;
        hVar.D0 = i10;
        x2.c.f24992q = hVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i10);
        this.f1195a = new SparseArray();
        this.f1196d = new ArrayList(4);
        this.f1197g = new h();
        this.f1198r = 0;
        this.f1199x = 0;
        this.f1200y = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.D = true;
        this.E = 257;
        this.F = null;
        this.G = null;
        this.H = -1;
        this.I = new HashMap();
        this.J = new SparseArray();
        this.K = new g(this, this);
        i(attributeSet, i10);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        f fVar = new f(layoutParams);
        fVar.f3151a = -1;
        fVar.f3153b = -1;
        fVar.f3155c = -1.0f;
        fVar.f3157d = true;
        fVar.f3159e = -1;
        fVar.f3161f = -1;
        fVar.f3163g = -1;
        fVar.f3165h = -1;
        fVar.f3167i = -1;
        fVar.j = -1;
        fVar.k = -1;
        fVar.f3171l = -1;
        fVar.f3173m = -1;
        fVar.f3175n = -1;
        fVar.f3177o = -1;
        fVar.f3179p = -1;
        fVar.f3181q = 0;
        fVar.f3182r = 0.0f;
        fVar.f3183s = -1;
        fVar.f3184t = -1;
        fVar.f3185u = -1;
        fVar.f3186v = -1;
        fVar.f3187w = Integer.MIN_VALUE;
        fVar.f3188x = Integer.MIN_VALUE;
        fVar.f3189y = Integer.MIN_VALUE;
        fVar.f3190z = Integer.MIN_VALUE;
        fVar.A = Integer.MIN_VALUE;
        fVar.B = Integer.MIN_VALUE;
        fVar.C = Integer.MIN_VALUE;
        fVar.D = 0;
        fVar.E = 0.5f;
        fVar.F = 0.5f;
        fVar.G = null;
        fVar.H = -1.0f;
        fVar.I = -1.0f;
        fVar.J = 0;
        fVar.K = 0;
        fVar.L = 0;
        fVar.M = 0;
        fVar.N = 0;
        fVar.O = 0;
        fVar.P = 0;
        fVar.Q = 0;
        fVar.R = 1.0f;
        fVar.S = 1.0f;
        fVar.T = -1;
        fVar.U = -1;
        fVar.V = -1;
        fVar.W = false;
        fVar.X = false;
        fVar.Y = null;
        fVar.Z = 0;
        fVar.f3152a0 = true;
        fVar.f3154b0 = true;
        fVar.f3156c0 = false;
        fVar.f3158d0 = false;
        fVar.f3160e0 = false;
        fVar.f3162f0 = -1;
        fVar.f3164g0 = -1;
        fVar.f3166h0 = -1;
        fVar.f3168i0 = -1;
        fVar.f3169j0 = Integer.MIN_VALUE;
        fVar.f3170k0 = Integer.MIN_VALUE;
        fVar.f3172l0 = 0.5f;
        fVar.f3180p0 = new z2.g();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) fVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) fVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) fVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = marginLayoutParams.bottomMargin;
            fVar.setMarginStart(marginLayoutParams.getMarginStart());
            fVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof f)) {
            return fVar;
        }
        f fVar2 = (f) layoutParams;
        fVar.f3151a = fVar2.f3151a;
        fVar.f3153b = fVar2.f3153b;
        fVar.f3155c = fVar2.f3155c;
        fVar.f3157d = fVar2.f3157d;
        fVar.f3159e = fVar2.f3159e;
        fVar.f3161f = fVar2.f3161f;
        fVar.f3163g = fVar2.f3163g;
        fVar.f3165h = fVar2.f3165h;
        fVar.f3167i = fVar2.f3167i;
        fVar.j = fVar2.j;
        fVar.k = fVar2.k;
        fVar.f3171l = fVar2.f3171l;
        fVar.f3173m = fVar2.f3173m;
        fVar.f3175n = fVar2.f3175n;
        fVar.f3177o = fVar2.f3177o;
        fVar.f3179p = fVar2.f3179p;
        fVar.f3181q = fVar2.f3181q;
        fVar.f3182r = fVar2.f3182r;
        fVar.f3183s = fVar2.f3183s;
        fVar.f3184t = fVar2.f3184t;
        fVar.f3185u = fVar2.f3185u;
        fVar.f3186v = fVar2.f3186v;
        fVar.f3187w = fVar2.f3187w;
        fVar.f3188x = fVar2.f3188x;
        fVar.f3189y = fVar2.f3189y;
        fVar.f3190z = fVar2.f3190z;
        fVar.A = fVar2.A;
        fVar.B = fVar2.B;
        fVar.C = fVar2.C;
        fVar.D = fVar2.D;
        fVar.E = fVar2.E;
        fVar.F = fVar2.F;
        fVar.G = fVar2.G;
        fVar.H = fVar2.H;
        fVar.I = fVar2.I;
        fVar.J = fVar2.J;
        fVar.K = fVar2.K;
        fVar.W = fVar2.W;
        fVar.X = fVar2.X;
        fVar.L = fVar2.L;
        fVar.M = fVar2.M;
        fVar.N = fVar2.N;
        fVar.P = fVar2.P;
        fVar.O = fVar2.O;
        fVar.Q = fVar2.Q;
        fVar.R = fVar2.R;
        fVar.S = fVar2.S;
        fVar.T = fVar2.T;
        fVar.U = fVar2.U;
        fVar.V = fVar2.V;
        fVar.f3152a0 = fVar2.f3152a0;
        fVar.f3154b0 = fVar2.f3154b0;
        fVar.f3156c0 = fVar2.f3156c0;
        fVar.f3158d0 = fVar2.f3158d0;
        fVar.f3162f0 = fVar2.f3162f0;
        fVar.f3164g0 = fVar2.f3164g0;
        fVar.f3166h0 = fVar2.f3166h0;
        fVar.f3168i0 = fVar2.f3168i0;
        fVar.f3169j0 = fVar2.f3169j0;
        fVar.f3170k0 = fVar2.f3170k0;
        fVar.f3172l0 = fVar2.f3172l0;
        fVar.Y = fVar2.Y;
        fVar.Z = fVar2.Z;
        fVar.f3180p0 = fVar2.f3180p0;
        return fVar;
    }
}
