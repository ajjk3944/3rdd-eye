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
import androidx.recyclerview.widget.LinearLayoutManager;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import k3.e;
import k3.h;
import n3.b;
import n3.c;
import n3.d;
import n3.f;
import n3.g;
import n3.n;
import n3.o;
import n3.q;
import n3.r;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: p, reason: collision with root package name */
    public static r f856p;

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f857a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f858b;

    /* renamed from: c, reason: collision with root package name */
    public e f859c;

    /* renamed from: d, reason: collision with root package name */
    public int f860d;

    /* renamed from: e, reason: collision with root package name */
    public int f861e;

    /* renamed from: f, reason: collision with root package name */
    public int f862f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f863h;

    /* renamed from: i, reason: collision with root package name */
    public int f864i;
    public n j;

    /* renamed from: k, reason: collision with root package name */
    public km.n f865k;

    /* renamed from: l, reason: collision with root package name */
    public int f866l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f867m;

    /* renamed from: n, reason: collision with root package name */
    public SparseArray f868n;

    /* renamed from: o, reason: collision with root package name */
    public n3.e f869o;

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.f857a = new SparseArray();
        this.f858b = new ArrayList(4);
        this.f859c = new e();
        this.f860d = 0;
        this.f861e = 0;
        this.f862f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.f863h = true;
        this.f864i = 257;
        this.j = null;
        this.f865k = null;
        this.f866l = -1;
        this.f867m = new HashMap();
        this.f868n = new SparseArray();
        this.f869o = new n3.e(this, this);
        i(attributeSet, 0);
    }

    public static d a() {
        d dVar = new d(-2, -2);
        dVar.f29579a = -1;
        dVar.f29581b = -1;
        dVar.f29583c = -1.0f;
        dVar.f29585d = true;
        dVar.f29587e = -1;
        dVar.f29589f = -1;
        dVar.g = -1;
        dVar.f29592h = -1;
        dVar.f29594i = -1;
        dVar.j = -1;
        dVar.f29597k = -1;
        dVar.f29599l = -1;
        dVar.f29601m = -1;
        dVar.f29603n = -1;
        dVar.f29605o = -1;
        dVar.f29607p = -1;
        dVar.f29609q = 0;
        dVar.f29610r = 0.0f;
        dVar.f29611s = -1;
        dVar.f29612t = -1;
        dVar.f29613u = -1;
        dVar.f29614v = -1;
        dVar.f29615w = LinearLayoutManager.INVALID_OFFSET;
        dVar.f29616x = LinearLayoutManager.INVALID_OFFSET;
        dVar.f29617y = LinearLayoutManager.INVALID_OFFSET;
        dVar.f29618z = LinearLayoutManager.INVALID_OFFSET;
        dVar.A = LinearLayoutManager.INVALID_OFFSET;
        dVar.B = LinearLayoutManager.INVALID_OFFSET;
        dVar.C = LinearLayoutManager.INVALID_OFFSET;
        dVar.D = 0;
        dVar.E = 0.5f;
        dVar.F = 0.5f;
        dVar.G = null;
        dVar.H = -1.0f;
        dVar.I = -1.0f;
        dVar.J = 0;
        dVar.K = 0;
        dVar.L = 0;
        dVar.M = 0;
        dVar.N = 0;
        dVar.O = 0;
        dVar.P = 0;
        dVar.Q = 0;
        dVar.R = 1.0f;
        dVar.S = 1.0f;
        dVar.T = -1;
        dVar.U = -1;
        dVar.V = -1;
        dVar.W = false;
        dVar.X = false;
        dVar.Y = null;
        dVar.Z = 0;
        dVar.f29580a0 = true;
        dVar.f29582b0 = true;
        dVar.f29584c0 = false;
        dVar.f29586d0 = false;
        dVar.f29588e0 = false;
        dVar.f29590f0 = -1;
        dVar.f29591g0 = -1;
        dVar.f29593h0 = -1;
        dVar.f29595i0 = -1;
        dVar.f29596j0 = LinearLayoutManager.INVALID_OFFSET;
        dVar.f29598k0 = LinearLayoutManager.INVALID_OFFSET;
        dVar.f29600l0 = 0.5f;
        dVar.f29608p0 = new k3.d();
        return dVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static r getSharedValues() {
        if (f856p == null) {
            r rVar = new r();
            new SparseIntArray();
            new HashMap();
            f856p = rVar;
        }
        return f856p;
    }

    public final k3.d b(View view) {
        if (view == this) {
            return this.f859c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof d) {
            return ((d) view.getLayoutParams()).f29608p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof d) {
            return ((d) view.getLayoutParams()).f29608p0;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.f858b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((b) arrayList.get(i4)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i11 = Integer.parseInt(strArrSplit[0]);
                        int i12 = Integer.parseInt(strArrSplit[1]);
                        int i13 = Integer.parseInt(strArrSplit[2]);
                        int i14 = (int) ((i11 / 1080.0f) * width);
                        int i15 = (int) ((i12 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i14;
                        float f11 = i15;
                        float f12 = i14 + ((int) ((i13 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i15 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
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
        this.f863h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f29579a = -1;
        dVar.f29581b = -1;
        dVar.f29583c = -1.0f;
        dVar.f29585d = true;
        dVar.f29587e = -1;
        dVar.f29589f = -1;
        dVar.g = -1;
        dVar.f29592h = -1;
        dVar.f29594i = -1;
        dVar.j = -1;
        dVar.f29597k = -1;
        dVar.f29599l = -1;
        dVar.f29601m = -1;
        dVar.f29603n = -1;
        dVar.f29605o = -1;
        dVar.f29607p = -1;
        dVar.f29609q = 0;
        dVar.f29610r = 0.0f;
        dVar.f29611s = -1;
        dVar.f29612t = -1;
        dVar.f29613u = -1;
        dVar.f29614v = -1;
        dVar.f29615w = LinearLayoutManager.INVALID_OFFSET;
        dVar.f29616x = LinearLayoutManager.INVALID_OFFSET;
        dVar.f29617y = LinearLayoutManager.INVALID_OFFSET;
        dVar.f29618z = LinearLayoutManager.INVALID_OFFSET;
        dVar.A = LinearLayoutManager.INVALID_OFFSET;
        dVar.B = LinearLayoutManager.INVALID_OFFSET;
        dVar.C = LinearLayoutManager.INVALID_OFFSET;
        dVar.D = 0;
        dVar.E = 0.5f;
        dVar.F = 0.5f;
        dVar.G = null;
        dVar.H = -1.0f;
        dVar.I = -1.0f;
        dVar.J = 0;
        dVar.K = 0;
        dVar.L = 0;
        dVar.M = 0;
        dVar.N = 0;
        dVar.O = 0;
        dVar.P = 0;
        dVar.Q = 0;
        dVar.R = 1.0f;
        dVar.S = 1.0f;
        dVar.T = -1;
        dVar.U = -1;
        dVar.V = -1;
        dVar.W = false;
        dVar.X = false;
        dVar.Y = null;
        dVar.Z = 0;
        dVar.f29580a0 = true;
        dVar.f29582b0 = true;
        dVar.f29584c0 = false;
        dVar.f29586d0 = false;
        dVar.f29588e0 = false;
        dVar.f29590f0 = -1;
        dVar.f29591g0 = -1;
        dVar.f29593h0 = -1;
        dVar.f29595i0 = -1;
        dVar.f29596j0 = LinearLayoutManager.INVALID_OFFSET;
        dVar.f29598k0 = LinearLayoutManager.INVALID_OFFSET;
        dVar.f29600l0 = 0.5f;
        dVar.f29608p0 = new k3.d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f29721b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            int i10 = c.f29578a.get(index);
            switch (i10) {
                case 1:
                    dVar.V = typedArrayObtainStyledAttributes.getInt(index, dVar.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f29607p);
                    dVar.f29607p = resourceId;
                    if (resourceId == -1) {
                        dVar.f29607p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    dVar.f29609q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f29609q);
                    break;
                case 4:
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, dVar.f29610r) % 360.0f;
                    dVar.f29610r = f10;
                    if (f10 < 0.0f) {
                        dVar.f29610r = (360.0f - f10) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    dVar.f29579a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.f29579a);
                    break;
                case 6:
                    dVar.f29581b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.f29581b);
                    break;
                case 7:
                    dVar.f29583c = typedArrayObtainStyledAttributes.getFloat(index, dVar.f29583c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f29587e);
                    dVar.f29587e = resourceId2;
                    if (resourceId2 == -1) {
                        dVar.f29587e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f29589f);
                    dVar.f29589f = resourceId3;
                    if (resourceId3 == -1) {
                        dVar.f29589f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.g);
                    dVar.g = resourceId4;
                    if (resourceId4 == -1) {
                        dVar.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f29592h);
                    dVar.f29592h = resourceId5;
                    if (resourceId5 == -1) {
                        dVar.f29592h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f29594i);
                    dVar.f29594i = resourceId6;
                    if (resourceId6 == -1) {
                        dVar.f29594i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.j);
                    dVar.j = resourceId7;
                    if (resourceId7 == -1) {
                        dVar.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f29597k);
                    dVar.f29597k = resourceId8;
                    if (resourceId8 == -1) {
                        dVar.f29597k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f29599l);
                    dVar.f29599l = resourceId9;
                    if (resourceId9 == -1) {
                        dVar.f29599l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f29601m);
                    dVar.f29601m = resourceId10;
                    if (resourceId10 == -1) {
                        dVar.f29601m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f29611s);
                    dVar.f29611s = resourceId11;
                    if (resourceId11 == -1) {
                        dVar.f29611s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f29612t);
                    dVar.f29612t = resourceId12;
                    if (resourceId12 == -1) {
                        dVar.f29612t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f29613u);
                    dVar.f29613u = resourceId13;
                    if (resourceId13 == -1) {
                        dVar.f29613u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f29614v);
                    dVar.f29614v = resourceId14;
                    if (resourceId14 == -1) {
                        dVar.f29614v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    dVar.f29615w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f29615w);
                    break;
                case 22:
                    dVar.f29616x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f29616x);
                    break;
                case 23:
                    dVar.f29617y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f29617y);
                    break;
                case 24:
                    dVar.f29618z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f29618z);
                    break;
                case 25:
                    dVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.A);
                    break;
                case 26:
                    dVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.B);
                    break;
                case 27:
                    dVar.W = typedArrayObtainStyledAttributes.getBoolean(index, dVar.W);
                    break;
                case 28:
                    dVar.X = typedArrayObtainStyledAttributes.getBoolean(index, dVar.X);
                    break;
                case 29:
                    dVar.E = typedArrayObtainStyledAttributes.getFloat(index, dVar.E);
                    break;
                case 30:
                    dVar.F = typedArrayObtainStyledAttributes.getFloat(index, dVar.F);
                    break;
                case 31:
                    int i11 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    dVar.L = i11;
                    if (i11 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    dVar.M = i12;
                    if (i12 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        dVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.N);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.N) == -2) {
                            dVar.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        dVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.P);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.P) == -2) {
                            dVar.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    dVar.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, dVar.R));
                    dVar.L = 2;
                    break;
                case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                    try {
                        dVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.O);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.O) == -2) {
                            dVar.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        dVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.Q);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.Q) == -2) {
                            dVar.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                    dVar.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, dVar.S));
                    dVar.M = 2;
                    break;
                default:
                    switch (i10) {
                        case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                            n.h(dVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            dVar.H = typedArrayObtainStyledAttributes.getFloat(index, dVar.H);
                            break;
                        case 46:
                            dVar.I = typedArrayObtainStyledAttributes.getFloat(index, dVar.I);
                            break;
                        case 47:
                            dVar.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            dVar.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            dVar.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.T);
                            break;
                        case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                            dVar.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.U);
                            break;
                        case 51:
                            dVar.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f29603n);
                            dVar.f29603n = resourceId15;
                            if (resourceId15 == -1) {
                                dVar.f29603n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f29605o);
                            dVar.f29605o = resourceId16;
                            if (resourceId16 == -1) {
                                dVar.f29605o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            dVar.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.D);
                            break;
                        case 55:
                            dVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.C);
                            break;
                        default:
                            switch (i10) {
                                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                                    n.g(dVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(dVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    dVar.Z = typedArrayObtainStyledAttributes.getInt(index, dVar.Z);
                                    break;
                                case 67:
                                    dVar.f29585d = typedArrayObtainStyledAttributes.getBoolean(index, dVar.f29585d);
                                    break;
                            }
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        dVar.a();
        return dVar;
    }

    public int getMaxHeight() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f862f;
    }

    public int getMinHeight() {
        return this.f861e;
    }

    public int getMinWidth() {
        return this.f860d;
    }

    public int getOptimizationLevel() {
        return this.f859c.D0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        e eVar = this.f859c;
        if (eVar.j == null) {
            int id3 = getId();
            if (id3 != -1) {
                eVar.j = getContext().getResources().getResourceEntryName(id3);
            } else {
                eVar.j = "parent";
            }
        }
        if (eVar.f27853h0 == null) {
            eVar.f27853h0 = eVar.j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f27853h0);
        }
        ArrayList arrayList = eVar.f27879q0;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            k3.d dVar = (k3.d) obj;
            View view = dVar.f27850f0;
            if (view != null) {
                if (dVar.j == null && (id2 = view.getId()) != -1) {
                    dVar.j = getContext().getResources().getResourceEntryName(id2);
                }
                if (dVar.f27853h0 == null) {
                    dVar.f27853h0 = dVar.j;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.f27853h0);
                }
            }
        }
        eVar.n(sb2);
        return sb2.toString();
    }

    public final void i(AttributeSet attributeSet, int i4) throws XmlPullParserException, IOException, NumberFormatException {
        e eVar = this.f859c;
        eVar.f27850f0 = this;
        n3.e eVar2 = this.f869o;
        eVar.f27883u0 = eVar2;
        eVar.f27881s0.f27620f = eVar2;
        this.f857a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f29721b, i4, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 16) {
                    this.f860d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f860d);
                } else if (index == 17) {
                    this.f861e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f861e);
                } else if (index == 14) {
                    this.f862f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f862f);
                } else if (index == 15) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == 113) {
                    this.f864i = typedArrayObtainStyledAttributes.getInt(index, this.f864i);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f865k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.j = nVar;
                        nVar.e(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.f866l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        eVar.D0 = this.f864i;
        i3.c.f25834q = eVar.W(512);
    }

    public final void j(int i4) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        String str;
        Context context = getContext();
        km.n nVar = new km.n((char) 0, 4);
        nVar.f28442b = new SparseArray();
        nVar.f28443c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            f fVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                nVar.v(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                f fVar2 = new f(context, xml);
                                ((SparseArray) nVar.f28442b).put(fVar2.f29626a, fVar2);
                                fVar = fVar2;
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
                                g gVar = new g(context, xml);
                                if (fVar != null) {
                                    ((ArrayList) fVar.f29628c).add(gVar);
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
        } catch (IOException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i4, e2);
        } catch (XmlPullParserException e10) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i4, e10);
        }
        this.f865k = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(k3.e r29, int r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 1772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(k3.e, int, int, int):void");
    }

    public final void l(k3.d dVar, d dVar2, SparseArray sparseArray, int i4, int i10) {
        View view = (View) this.f857a.get(i4);
        k3.d dVar3 = (k3.d) sparseArray.get(i4);
        if (dVar3 == null || view == null || !(view.getLayoutParams() instanceof d)) {
            return;
        }
        dVar2.f29584c0 = true;
        if (i10 == 6) {
            d dVar4 = (d) view.getLayoutParams();
            dVar4.f29584c0 = true;
            dVar4.f29608p0.E = true;
        }
        dVar.i(6).b(dVar3.i(i10), dVar2.D, dVar2.C, true);
        dVar.E = true;
        dVar.i(3).j();
        dVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        ArrayList arrayList = this.f858b;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            d dVar = (d) childAt.getLayoutParams();
            k3.d dVar2 = dVar.f29608p0;
            if (childAt.getVisibility() != 8 || dVar.f29586d0 || dVar.f29588e0 || zIsInEditMode) {
                int iR = dVar2.r();
                int iS = dVar2.s();
                childAt.layout(iR, iS, dVar2.q() + iR, dVar2.k() + iS);
            }
        }
        int size = arrayList.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                ((b) arrayList.get(i14)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0560  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r35, int r36) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        ArrayList arrayList = this.f858b;
        super.onViewAdded(view);
        k3.d dVarB = b(view);
        if ((view instanceof Guideline) && !(dVarB instanceof h)) {
            d dVar = (d) view.getLayoutParams();
            h hVar = new h();
            dVar.f29608p0 = hVar;
            dVar.f29586d0 = true;
            hVar.S(dVar.V);
        }
        if (view instanceof b) {
            b bVar = (b) view;
            bVar.i();
            ((d) view.getLayoutParams()).f29588e0 = true;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        this.f857a.put(view.getId(), view);
        this.f863h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f857a.remove(view.getId());
        k3.d dVarB = b(view);
        this.f859c.f27879q0.remove(dVarB);
        dVarB.C();
        this.f858b.remove(view);
        this.f863h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f863h = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.j = nVar;
    }

    @Override // android.view.View
    public void setId(int i4) {
        SparseArray sparseArray = this.f857a;
        sparseArray.remove(getId());
        super.setId(i4);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i4) {
        if (i4 == this.g) {
            return;
        }
        this.g = i4;
        requestLayout();
    }

    public void setMaxWidth(int i4) {
        if (i4 == this.f862f) {
            return;
        }
        this.f862f = i4;
        requestLayout();
    }

    public void setMinHeight(int i4) {
        if (i4 == this.f861e) {
            return;
        }
        this.f861e = i4;
        requestLayout();
    }

    public void setMinWidth(int i4) {
        if (i4 == this.f860d) {
            return;
        }
        this.f860d = i4;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        km.n nVar = this.f865k;
        if (nVar != null) {
            nVar.getClass();
        }
    }

    public void setOptimizationLevel(int i4) {
        this.f864i = i4;
        e eVar = this.f859c;
        eVar.D0 = i4;
        i3.c.f25834q = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i4) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i4);
        this.f857a = new SparseArray();
        this.f858b = new ArrayList(4);
        this.f859c = new e();
        this.f860d = 0;
        this.f861e = 0;
        this.f862f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.f863h = true;
        this.f864i = 257;
        this.j = null;
        this.f865k = null;
        this.f866l = -1;
        this.f867m = new HashMap();
        this.f868n = new SparseArray();
        this.f869o = new n3.e(this, this);
        i(attributeSet, i4);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        d dVar = new d(layoutParams);
        dVar.f29579a = -1;
        dVar.f29581b = -1;
        dVar.f29583c = -1.0f;
        dVar.f29585d = true;
        dVar.f29587e = -1;
        dVar.f29589f = -1;
        dVar.g = -1;
        dVar.f29592h = -1;
        dVar.f29594i = -1;
        dVar.j = -1;
        dVar.f29597k = -1;
        dVar.f29599l = -1;
        dVar.f29601m = -1;
        dVar.f29603n = -1;
        dVar.f29605o = -1;
        dVar.f29607p = -1;
        dVar.f29609q = 0;
        dVar.f29610r = 0.0f;
        dVar.f29611s = -1;
        dVar.f29612t = -1;
        dVar.f29613u = -1;
        dVar.f29614v = -1;
        dVar.f29615w = LinearLayoutManager.INVALID_OFFSET;
        dVar.f29616x = LinearLayoutManager.INVALID_OFFSET;
        dVar.f29617y = LinearLayoutManager.INVALID_OFFSET;
        dVar.f29618z = LinearLayoutManager.INVALID_OFFSET;
        dVar.A = LinearLayoutManager.INVALID_OFFSET;
        dVar.B = LinearLayoutManager.INVALID_OFFSET;
        dVar.C = LinearLayoutManager.INVALID_OFFSET;
        dVar.D = 0;
        dVar.E = 0.5f;
        dVar.F = 0.5f;
        dVar.G = null;
        dVar.H = -1.0f;
        dVar.I = -1.0f;
        dVar.J = 0;
        dVar.K = 0;
        dVar.L = 0;
        dVar.M = 0;
        dVar.N = 0;
        dVar.O = 0;
        dVar.P = 0;
        dVar.Q = 0;
        dVar.R = 1.0f;
        dVar.S = 1.0f;
        dVar.T = -1;
        dVar.U = -1;
        dVar.V = -1;
        dVar.W = false;
        dVar.X = false;
        dVar.Y = null;
        dVar.Z = 0;
        dVar.f29580a0 = true;
        dVar.f29582b0 = true;
        dVar.f29584c0 = false;
        dVar.f29586d0 = false;
        dVar.f29588e0 = false;
        dVar.f29590f0 = -1;
        dVar.f29591g0 = -1;
        dVar.f29593h0 = -1;
        dVar.f29595i0 = -1;
        dVar.f29596j0 = LinearLayoutManager.INVALID_OFFSET;
        dVar.f29598k0 = LinearLayoutManager.INVALID_OFFSET;
        dVar.f29600l0 = 0.5f;
        dVar.f29608p0 = new k3.d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) dVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) dVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) dVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = marginLayoutParams.bottomMargin;
            dVar.setMarginStart(marginLayoutParams.getMarginStart());
            dVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof d)) {
            return dVar;
        }
        d dVar2 = (d) layoutParams;
        dVar.f29579a = dVar2.f29579a;
        dVar.f29581b = dVar2.f29581b;
        dVar.f29583c = dVar2.f29583c;
        dVar.f29585d = dVar2.f29585d;
        dVar.f29587e = dVar2.f29587e;
        dVar.f29589f = dVar2.f29589f;
        dVar.g = dVar2.g;
        dVar.f29592h = dVar2.f29592h;
        dVar.f29594i = dVar2.f29594i;
        dVar.j = dVar2.j;
        dVar.f29597k = dVar2.f29597k;
        dVar.f29599l = dVar2.f29599l;
        dVar.f29601m = dVar2.f29601m;
        dVar.f29603n = dVar2.f29603n;
        dVar.f29605o = dVar2.f29605o;
        dVar.f29607p = dVar2.f29607p;
        dVar.f29609q = dVar2.f29609q;
        dVar.f29610r = dVar2.f29610r;
        dVar.f29611s = dVar2.f29611s;
        dVar.f29612t = dVar2.f29612t;
        dVar.f29613u = dVar2.f29613u;
        dVar.f29614v = dVar2.f29614v;
        dVar.f29615w = dVar2.f29615w;
        dVar.f29616x = dVar2.f29616x;
        dVar.f29617y = dVar2.f29617y;
        dVar.f29618z = dVar2.f29618z;
        dVar.A = dVar2.A;
        dVar.B = dVar2.B;
        dVar.C = dVar2.C;
        dVar.D = dVar2.D;
        dVar.E = dVar2.E;
        dVar.F = dVar2.F;
        dVar.G = dVar2.G;
        dVar.H = dVar2.H;
        dVar.I = dVar2.I;
        dVar.J = dVar2.J;
        dVar.K = dVar2.K;
        dVar.W = dVar2.W;
        dVar.X = dVar2.X;
        dVar.L = dVar2.L;
        dVar.M = dVar2.M;
        dVar.N = dVar2.N;
        dVar.P = dVar2.P;
        dVar.O = dVar2.O;
        dVar.Q = dVar2.Q;
        dVar.R = dVar2.R;
        dVar.S = dVar2.S;
        dVar.T = dVar2.T;
        dVar.U = dVar2.U;
        dVar.V = dVar2.V;
        dVar.f29580a0 = dVar2.f29580a0;
        dVar.f29582b0 = dVar2.f29582b0;
        dVar.f29584c0 = dVar2.f29584c0;
        dVar.f29586d0 = dVar2.f29586d0;
        dVar.f29590f0 = dVar2.f29590f0;
        dVar.f29591g0 = dVar2.f29591g0;
        dVar.f29593h0 = dVar2.f29593h0;
        dVar.f29595i0 = dVar2.f29595i0;
        dVar.f29596j0 = dVar2.f29596j0;
        dVar.f29598k0 = dVar2.f29598k0;
        dVar.f29600l0 = dVar2.f29600l0;
        dVar.Y = dVar2.Y;
        dVar.Z = dVar2.Z;
        dVar.f29608p0 = dVar2.f29608p0;
        return dVar;
    }
}
