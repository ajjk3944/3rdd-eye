package androidx.constraintlayout.widget;

import C.c;
import C.f;
import C.o;
import C.p;
import C.r;
import C.s;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import h0.C2351a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import x.C2982c;
import z.d;
import z.e;
import z.h;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: F, reason: collision with root package name */
    public static s f5038F;

    /* renamed from: C, reason: collision with root package name */
    public final f f5039C;

    /* renamed from: D, reason: collision with root package name */
    public int f5040D;

    /* renamed from: E, reason: collision with root package name */
    public int f5041E;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f5042a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5043b;

    /* renamed from: c, reason: collision with root package name */
    public final e f5044c;

    /* renamed from: d, reason: collision with root package name */
    public int f5045d;

    /* renamed from: e, reason: collision with root package name */
    public int f5046e;

    /* renamed from: f, reason: collision with root package name */
    public int f5047f;

    /* renamed from: g, reason: collision with root package name */
    public int f5048g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5049h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public o f5050j;

    /* renamed from: k, reason: collision with root package name */
    public C2351a f5051k;

    /* renamed from: l, reason: collision with root package name */
    public int f5052l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f5053m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f5054n;

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        super(context, attributeSet);
        this.f5042a = new SparseArray();
        this.f5043b = new ArrayList(4);
        this.f5044c = new e();
        this.f5045d = 0;
        this.f5046e = 0;
        this.f5047f = Integer.MAX_VALUE;
        this.f5048g = Integer.MAX_VALUE;
        this.f5049h = true;
        this.i = 257;
        this.f5050j = null;
        this.f5051k = null;
        this.f5052l = -1;
        this.f5053m = new HashMap();
        this.f5054n = new SparseArray();
        this.f5039C = new f(this, this);
        this.f5040D = 0;
        this.f5041E = 0;
        i(attributeSet, 0);
    }

    public static C.e g() {
        C.e eVar = new C.e(-2, -2);
        eVar.f842a = -1;
        eVar.f844b = -1;
        eVar.f845c = -1.0f;
        eVar.f847d = true;
        eVar.f849e = -1;
        eVar.f851f = -1;
        eVar.f853g = -1;
        eVar.f855h = -1;
        eVar.i = -1;
        eVar.f858j = -1;
        eVar.f860k = -1;
        eVar.f862l = -1;
        eVar.f864m = -1;
        eVar.f866n = -1;
        eVar.f868o = -1;
        eVar.f870p = -1;
        eVar.f872q = 0;
        eVar.f873r = 0.0f;
        eVar.f874s = -1;
        eVar.f875t = -1;
        eVar.f876u = -1;
        eVar.f877v = -1;
        eVar.f878w = LinearLayoutManager.INVALID_OFFSET;
        eVar.f879x = LinearLayoutManager.INVALID_OFFSET;
        eVar.f880y = LinearLayoutManager.INVALID_OFFSET;
        eVar.f881z = LinearLayoutManager.INVALID_OFFSET;
        eVar.f817A = LinearLayoutManager.INVALID_OFFSET;
        eVar.f818B = LinearLayoutManager.INVALID_OFFSET;
        eVar.f819C = LinearLayoutManager.INVALID_OFFSET;
        eVar.f820D = 0;
        eVar.f821E = 0.5f;
        eVar.f822F = 0.5f;
        eVar.f823G = null;
        eVar.f824H = -1.0f;
        eVar.f825I = -1.0f;
        eVar.f826J = 0;
        eVar.f827K = 0;
        eVar.f828L = 0;
        eVar.M = 0;
        eVar.f829N = 0;
        eVar.f830O = 0;
        eVar.f831P = 0;
        eVar.f832Q = 0;
        eVar.f833R = 1.0f;
        eVar.f834S = 1.0f;
        eVar.f835T = -1;
        eVar.f836U = -1;
        eVar.f837V = -1;
        eVar.f838W = false;
        eVar.f839X = false;
        eVar.f840Y = null;
        eVar.f841Z = 0;
        eVar.f843a0 = true;
        eVar.b0 = true;
        eVar.f846c0 = false;
        eVar.f848d0 = false;
        eVar.f850e0 = false;
        eVar.f852f0 = -1;
        eVar.f854g0 = -1;
        eVar.f856h0 = -1;
        eVar.f857i0 = -1;
        eVar.f859j0 = LinearLayoutManager.INVALID_OFFSET;
        eVar.f861k0 = LinearLayoutManager.INVALID_OFFSET;
        eVar.f863l0 = 0.5f;
        eVar.f871p0 = new d();
        return eVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static s getSharedValues() {
        if (f5038F == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f5038F = sVar;
        }
        return f5038F;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.f5043b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((c) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i6 = Integer.parseInt(strArrSplit[0]);
                        int i7 = Integer.parseInt(strArrSplit[1]);
                        int i8 = Integer.parseInt(strArrSplit[2]);
                        int i9 = (int) ((i6 / 1080.0f) * width);
                        int i10 = (int) ((i7 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i9;
                        float f5 = i10;
                        float f6 = i9 + ((int) ((i8 / 1080.0f) * width));
                        canvas.drawLine(f2, f5, f6, f5, paint);
                        float f7 = i10 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f6, f5, f6, f7, paint);
                        canvas.drawLine(f6, f7, f2, f7, paint);
                        canvas.drawLine(f2, f7, f2, f5, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f5, f6, f7, paint);
                        canvas.drawLine(f2, f7, f6, f5, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f5049h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C.e eVar = new C.e(context, attributeSet);
        eVar.f842a = -1;
        eVar.f844b = -1;
        eVar.f845c = -1.0f;
        eVar.f847d = true;
        eVar.f849e = -1;
        eVar.f851f = -1;
        eVar.f853g = -1;
        eVar.f855h = -1;
        eVar.i = -1;
        eVar.f858j = -1;
        eVar.f860k = -1;
        eVar.f862l = -1;
        eVar.f864m = -1;
        eVar.f866n = -1;
        eVar.f868o = -1;
        eVar.f870p = -1;
        eVar.f872q = 0;
        eVar.f873r = 0.0f;
        eVar.f874s = -1;
        eVar.f875t = -1;
        eVar.f876u = -1;
        eVar.f877v = -1;
        eVar.f878w = LinearLayoutManager.INVALID_OFFSET;
        eVar.f879x = LinearLayoutManager.INVALID_OFFSET;
        eVar.f880y = LinearLayoutManager.INVALID_OFFSET;
        eVar.f881z = LinearLayoutManager.INVALID_OFFSET;
        eVar.f817A = LinearLayoutManager.INVALID_OFFSET;
        eVar.f818B = LinearLayoutManager.INVALID_OFFSET;
        eVar.f819C = LinearLayoutManager.INVALID_OFFSET;
        eVar.f820D = 0;
        eVar.f821E = 0.5f;
        eVar.f822F = 0.5f;
        eVar.f823G = null;
        eVar.f824H = -1.0f;
        eVar.f825I = -1.0f;
        eVar.f826J = 0;
        eVar.f827K = 0;
        eVar.f828L = 0;
        eVar.M = 0;
        eVar.f829N = 0;
        eVar.f830O = 0;
        eVar.f831P = 0;
        eVar.f832Q = 0;
        eVar.f833R = 1.0f;
        eVar.f834S = 1.0f;
        eVar.f835T = -1;
        eVar.f836U = -1;
        eVar.f837V = -1;
        eVar.f838W = false;
        eVar.f839X = false;
        eVar.f840Y = null;
        eVar.f841Z = 0;
        eVar.f843a0 = true;
        eVar.b0 = true;
        eVar.f846c0 = false;
        eVar.f848d0 = false;
        eVar.f850e0 = false;
        eVar.f852f0 = -1;
        eVar.f854g0 = -1;
        eVar.f856h0 = -1;
        eVar.f857i0 = -1;
        eVar.f859j0 = LinearLayoutManager.INVALID_OFFSET;
        eVar.f861k0 = LinearLayoutManager.INVALID_OFFSET;
        eVar.f863l0 = 0.5f;
        eVar.f871p0 = new d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1013b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i3 = C.d.f816a.get(index);
            switch (i3) {
                case 1:
                    eVar.f837V = typedArrayObtainStyledAttributes.getInt(index, eVar.f837V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f870p);
                    eVar.f870p = resourceId;
                    if (resourceId == -1) {
                        eVar.f870p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    eVar.f872q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f872q);
                    break;
                case 4:
                    float f2 = typedArrayObtainStyledAttributes.getFloat(index, eVar.f873r) % 360.0f;
                    eVar.f873r = f2;
                    if (f2 < 0.0f) {
                        eVar.f873r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    eVar.f842a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f842a);
                    break;
                case 6:
                    eVar.f844b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f844b);
                    break;
                case 7:
                    eVar.f845c = typedArrayObtainStyledAttributes.getFloat(index, eVar.f845c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f849e);
                    eVar.f849e = resourceId2;
                    if (resourceId2 == -1) {
                        eVar.f849e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f851f);
                    eVar.f851f = resourceId3;
                    if (resourceId3 == -1) {
                        eVar.f851f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f853g);
                    eVar.f853g = resourceId4;
                    if (resourceId4 == -1) {
                        eVar.f853g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f855h);
                    eVar.f855h = resourceId5;
                    if (resourceId5 == -1) {
                        eVar.f855h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.i);
                    eVar.i = resourceId6;
                    if (resourceId6 == -1) {
                        eVar.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f858j);
                    eVar.f858j = resourceId7;
                    if (resourceId7 == -1) {
                        eVar.f858j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f860k);
                    eVar.f860k = resourceId8;
                    if (resourceId8 == -1) {
                        eVar.f860k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f862l);
                    eVar.f862l = resourceId9;
                    if (resourceId9 == -1) {
                        eVar.f862l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f864m);
                    eVar.f864m = resourceId10;
                    if (resourceId10 == -1) {
                        eVar.f864m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f874s);
                    eVar.f874s = resourceId11;
                    if (resourceId11 == -1) {
                        eVar.f874s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f875t);
                    eVar.f875t = resourceId12;
                    if (resourceId12 == -1) {
                        eVar.f875t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f876u);
                    eVar.f876u = resourceId13;
                    if (resourceId13 == -1) {
                        eVar.f876u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f877v);
                    eVar.f877v = resourceId14;
                    if (resourceId14 == -1) {
                        eVar.f877v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    eVar.f878w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f878w);
                    break;
                case 22:
                    eVar.f879x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f879x);
                    break;
                case 23:
                    eVar.f880y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f880y);
                    break;
                case 24:
                    eVar.f881z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f881z);
                    break;
                case 25:
                    eVar.f817A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f817A);
                    break;
                case 26:
                    eVar.f818B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f818B);
                    break;
                case 27:
                    eVar.f838W = typedArrayObtainStyledAttributes.getBoolean(index, eVar.f838W);
                    break;
                case 28:
                    eVar.f839X = typedArrayObtainStyledAttributes.getBoolean(index, eVar.f839X);
                    break;
                case 29:
                    eVar.f821E = typedArrayObtainStyledAttributes.getFloat(index, eVar.f821E);
                    break;
                case 30:
                    eVar.f822F = typedArrayObtainStyledAttributes.getFloat(index, eVar.f822F);
                    break;
                case 31:
                    int i6 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    eVar.f828L = i6;
                    if (i6 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i7 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    eVar.M = i7;
                    if (i7 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        eVar.f829N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f829N);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.f829N) == -2) {
                            eVar.f829N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        eVar.f831P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f831P);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.f831P) == -2) {
                            eVar.f831P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    eVar.f833R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.f833R));
                    eVar.f828L = 2;
                    break;
                case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                    try {
                        eVar.f830O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f830O);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.f830O) == -2) {
                            eVar.f830O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        eVar.f832Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f832Q);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.f832Q) == -2) {
                            eVar.f832Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                    eVar.f834S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.f834S));
                    eVar.M = 2;
                    break;
                default:
                    switch (i3) {
                        case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                            o.h(eVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            eVar.f824H = typedArrayObtainStyledAttributes.getFloat(index, eVar.f824H);
                            break;
                        case 46:
                            eVar.f825I = typedArrayObtainStyledAttributes.getFloat(index, eVar.f825I);
                            break;
                        case 47:
                            eVar.f826J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            eVar.f827K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            eVar.f835T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f835T);
                            break;
                        case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                            eVar.f836U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f836U);
                            break;
                        case 51:
                            eVar.f840Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f866n);
                            eVar.f866n = resourceId15;
                            if (resourceId15 == -1) {
                                eVar.f866n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f868o);
                            eVar.f868o = resourceId16;
                            if (resourceId16 == -1) {
                                eVar.f868o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            eVar.f820D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f820D);
                            break;
                        case 55:
                            eVar.f819C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f819C);
                            break;
                        default:
                            switch (i3) {
                                case 64:
                                    o.g(eVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    o.g(eVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    eVar.f841Z = typedArrayObtainStyledAttributes.getInt(index, eVar.f841Z);
                                    break;
                                case 67:
                                    eVar.f847d = typedArrayObtainStyledAttributes.getBoolean(index, eVar.f847d);
                                    break;
                            }
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        eVar.a();
        return eVar;
    }

    public int getMaxHeight() {
        return this.f5048g;
    }

    public int getMaxWidth() {
        return this.f5047f;
    }

    public int getMinHeight() {
        return this.f5046e;
    }

    public int getMinWidth() {
        return this.f5045d;
    }

    public int getOptimizationLevel() {
        return this.f5044c.f24360D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        e eVar = this.f5044c;
        if (eVar.f24333j == null) {
            int id2 = getId();
            if (id2 != -1) {
                eVar.f24333j = getContext().getResources().getResourceEntryName(id2);
            } else {
                eVar.f24333j = "parent";
            }
        }
        if (eVar.f24331h0 == null) {
            eVar.f24331h0 = eVar.f24333j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f24331h0);
        }
        ArrayList arrayList = eVar.f24369q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            d dVar = (d) obj;
            View view = dVar.f24327f0;
            if (view != null) {
                if (dVar.f24333j == null && (id = view.getId()) != -1) {
                    dVar.f24333j = getContext().getResources().getResourceEntryName(id);
                }
                if (dVar.f24331h0 == null) {
                    dVar.f24331h0 = dVar.f24333j;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.f24331h0);
                }
            }
        }
        eVar.n(sb);
        return sb.toString();
    }

    public final d h(View view) {
        if (view == this) {
            return this.f5044c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C.e) {
            return ((C.e) view.getLayoutParams()).f871p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C.e) {
            return ((C.e) view.getLayoutParams()).f871p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        e eVar = this.f5044c;
        eVar.f24327f0 = this;
        f fVar = this.f5039C;
        eVar.f24373u0 = fVar;
        eVar.f24371s0.f16f = fVar;
        this.f5042a.put(getId(), this);
        this.f5050j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f1013b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.f5045d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5045d);
                } else if (index == 17) {
                    this.f5046e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5046e);
                } else if (index == 14) {
                    this.f5047f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5047f);
                } else if (index == 15) {
                    this.f5048g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5048g);
                } else if (index == 113) {
                    this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f5051k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        o oVar = new o();
                        this.f5050j = oVar;
                        oVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f5050j = null;
                    }
                    this.f5052l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        eVar.f24360D0 = this.i;
        C2982c.f24000p = eVar.W(512);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r10) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            r9 = this;
            h0.a r0 = new h0.a
            android.content.Context r1 = r9.getContext()
            r2 = 1
            r3 = 0
            r0.<init>(r2, r3)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f20441b = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f20442c = r2
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.XmlResourceParser r10 = r2.getXml(r10)
            int r2 = r10.getEventType()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            r3 = 0
        L26:
            r4 = 1
            if (r2 == r4) goto Lad
            if (r2 == 0) goto L9e
            r5 = 2
            if (r2 == r5) goto L30
            goto La1
        L30:
            java.lang.String r2 = r10.getName()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            int r6 = r2.hashCode()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            r7 = 4
            r8 = 3
            switch(r6) {
                case -1349929691: goto L6a;
                case 80204913: goto L60;
                case 1382829617: goto L57;
                case 1657696882: goto L4d;
                case 1901439077: goto L3e;
                default: goto L3d;
            }     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
        L3d:
            goto L74
        L3e:
            java.lang.String r4 = "Variant"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r2 == 0) goto L74
            r4 = r8
            goto L75
        L48:
            r10 = move-exception
            goto La6
        L4a:
            r10 = move-exception
            goto Laa
        L4d:
            java.lang.String r4 = "layoutDescription"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r2 == 0) goto L74
            r4 = 0
            goto L75
        L57:
            java.lang.String r6 = "StateSet"
            boolean r2 = r2.equals(r6)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r2 == 0) goto L74
            goto L75
        L60:
            java.lang.String r4 = "State"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r2 == 0) goto L74
            r4 = r5
            goto L75
        L6a:
            java.lang.String r4 = "ConstraintSet"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r2 == 0) goto L74
            r4 = r7
            goto L75
        L74:
            r4 = -1
        L75:
            if (r4 == r5) goto L8f
            if (r4 == r8) goto L80
            if (r4 == r7) goto L7c
            goto La1
        L7c:
            r0.O(r1, r10)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            goto La1
        L80:
            C.h r2 = new C.h     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            r2.<init>(r1, r10)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r3 == 0) goto La1
            java.lang.Object r4 = r3.f892c     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            r4.add(r2)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            goto La1
        L8f:
            C.g r3 = new C.g     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            r3.<init>(r1, r10)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            java.lang.Object r2 = r0.f20441b     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            int r4 = r3.f890a     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            r2.put(r4, r3)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            goto La1
        L9e:
            r10.getName()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
        La1:
            int r2 = r10.next()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            goto L26
        La6:
            r10.printStackTrace()
            goto Lad
        Laa:
            r10.printStackTrace()
        Lad:
            r9.f5051k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.j(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(z.e r29, int r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 1766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(z.e, int, int, int):void");
    }

    public final void l(d dVar, C.e eVar, SparseArray sparseArray, int i, int i3) {
        View view = (View) this.f5042a.get(i);
        d dVar2 = (d) sparseArray.get(i);
        if (dVar2 == null || view == null || !(view.getLayoutParams() instanceof C.e)) {
            return;
        }
        eVar.f846c0 = true;
        if (i3 == 6) {
            C.e eVar2 = (C.e) view.getLayoutParams();
            eVar2.f846c0 = true;
            eVar2.f871p0.f24296E = true;
        }
        dVar.i(6).b(dVar2.i(i3), eVar.f820D, eVar.f819C, true);
        dVar.f24296E = true;
        dVar.i(3).j();
        dVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            C.e eVar = (C.e) childAt.getLayoutParams();
            d dVar = eVar.f871p0;
            if (childAt.getVisibility() != 8 || eVar.f848d0 || eVar.f850e0 || zIsInEditMode) {
                int iR = dVar.r();
                int iS = dVar.s();
                childAt.layout(iR, iS, dVar.q() + iR, dVar.k() + iS);
            }
        }
        ArrayList arrayList = this.f5043b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                ((c) arrayList.get(i9)).j();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x055f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r35, int r36) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d dVarH = h(view);
        if ((view instanceof Guideline) && !(dVarH instanceof h)) {
            C.e eVar = (C.e) view.getLayoutParams();
            h hVar = new h();
            eVar.f871p0 = hVar;
            eVar.f848d0 = true;
            hVar.S(eVar.f837V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.k();
            ((C.e) view.getLayoutParams()).f850e0 = true;
            ArrayList arrayList = this.f5043b;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f5042a.put(view.getId(), view);
        this.f5049h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f5042a.remove(view.getId());
        d dVarH = h(view);
        this.f5044c.f24369q0.remove(dVarH);
        dVarH.C();
        this.f5043b.remove(view);
        this.f5049h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f5049h = true;
        super.requestLayout();
    }

    public void setConstraintSet(o oVar) {
        this.f5050j = oVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f5042a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f5048g) {
            return;
        }
        this.f5048g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f5047f) {
            return;
        }
        this.f5047f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f5046e) {
            return;
        }
        this.f5046e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f5045d) {
            return;
        }
        this.f5045d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(p pVar) {
        C2351a c2351a = this.f5051k;
        if (c2351a != null) {
            c2351a.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        e eVar = this.f5044c;
        eVar.f24360D0 = i;
        C2982c.f24000p = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        super(context, attributeSet, i);
        this.f5042a = new SparseArray();
        this.f5043b = new ArrayList(4);
        this.f5044c = new e();
        this.f5045d = 0;
        this.f5046e = 0;
        this.f5047f = Integer.MAX_VALUE;
        this.f5048g = Integer.MAX_VALUE;
        this.f5049h = true;
        this.i = 257;
        this.f5050j = null;
        this.f5051k = null;
        this.f5052l = -1;
        this.f5053m = new HashMap();
        this.f5054n = new SparseArray();
        this.f5039C = new f(this, this);
        this.f5040D = 0;
        this.f5041E = 0;
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C.e eVar = new C.e(layoutParams);
        eVar.f842a = -1;
        eVar.f844b = -1;
        eVar.f845c = -1.0f;
        eVar.f847d = true;
        eVar.f849e = -1;
        eVar.f851f = -1;
        eVar.f853g = -1;
        eVar.f855h = -1;
        eVar.i = -1;
        eVar.f858j = -1;
        eVar.f860k = -1;
        eVar.f862l = -1;
        eVar.f864m = -1;
        eVar.f866n = -1;
        eVar.f868o = -1;
        eVar.f870p = -1;
        eVar.f872q = 0;
        eVar.f873r = 0.0f;
        eVar.f874s = -1;
        eVar.f875t = -1;
        eVar.f876u = -1;
        eVar.f877v = -1;
        eVar.f878w = LinearLayoutManager.INVALID_OFFSET;
        eVar.f879x = LinearLayoutManager.INVALID_OFFSET;
        eVar.f880y = LinearLayoutManager.INVALID_OFFSET;
        eVar.f881z = LinearLayoutManager.INVALID_OFFSET;
        eVar.f817A = LinearLayoutManager.INVALID_OFFSET;
        eVar.f818B = LinearLayoutManager.INVALID_OFFSET;
        eVar.f819C = LinearLayoutManager.INVALID_OFFSET;
        eVar.f820D = 0;
        eVar.f821E = 0.5f;
        eVar.f822F = 0.5f;
        eVar.f823G = null;
        eVar.f824H = -1.0f;
        eVar.f825I = -1.0f;
        eVar.f826J = 0;
        eVar.f827K = 0;
        eVar.f828L = 0;
        eVar.M = 0;
        eVar.f829N = 0;
        eVar.f830O = 0;
        eVar.f831P = 0;
        eVar.f832Q = 0;
        eVar.f833R = 1.0f;
        eVar.f834S = 1.0f;
        eVar.f835T = -1;
        eVar.f836U = -1;
        eVar.f837V = -1;
        eVar.f838W = false;
        eVar.f839X = false;
        eVar.f840Y = null;
        eVar.f841Z = 0;
        eVar.f843a0 = true;
        eVar.b0 = true;
        eVar.f846c0 = false;
        eVar.f848d0 = false;
        eVar.f850e0 = false;
        eVar.f852f0 = -1;
        eVar.f854g0 = -1;
        eVar.f856h0 = -1;
        eVar.f857i0 = -1;
        eVar.f859j0 = LinearLayoutManager.INVALID_OFFSET;
        eVar.f861k0 = LinearLayoutManager.INVALID_OFFSET;
        eVar.f863l0 = 0.5f;
        eVar.f871p0 = new d();
        return eVar;
    }
}
