package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import r0.C5507d;
import r0.C5508e;
import r0.C5509f;
import r0.C5511h;
import r0.C5513j;
import r0.C5514k;
import s0.C5543b;
import u0.C5617a;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: s, reason: collision with root package name */
    public static u0.e f15196s;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<View> f15197b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<androidx.constraintlayout.widget.c> f15198c;

    /* renamed from: d, reason: collision with root package name */
    public final C5509f f15199d;

    /* renamed from: e, reason: collision with root package name */
    public int f15200e;

    /* renamed from: f, reason: collision with root package name */
    public int f15201f;

    /* renamed from: g, reason: collision with root package name */
    public int f15202g;

    /* renamed from: h, reason: collision with root package name */
    public int f15203h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f15204j;

    /* renamed from: k, reason: collision with root package name */
    public d f15205k;

    /* renamed from: l, reason: collision with root package name */
    public C5617a f15206l;

    /* renamed from: m, reason: collision with root package name */
    public int f15207m;

    /* renamed from: n, reason: collision with root package name */
    public HashMap<String, Integer> f15208n;

    /* renamed from: o, reason: collision with root package name */
    public final SparseArray<C5508e> f15209o;

    /* renamed from: p, reason: collision with root package name */
    public final c f15210p;

    /* renamed from: q, reason: collision with root package name */
    public int f15211q;

    /* renamed from: r, reason: collision with root package name */
    public int f15212r;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15213a;

        static {
            int[] iArr = new int[C5508e.b.values().length];
            f15213a = iArr;
            try {
                iArr[C5508e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15213a[C5508e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15213a[C5508e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15213a[C5508e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class c implements C5543b.InterfaceC0526b {

        /* renamed from: a, reason: collision with root package name */
        public final ConstraintLayout f15283a;

        /* renamed from: b, reason: collision with root package name */
        public int f15284b;

        /* renamed from: c, reason: collision with root package name */
        public int f15285c;

        /* renamed from: d, reason: collision with root package name */
        public int f15286d;

        /* renamed from: e, reason: collision with root package name */
        public int f15287e;

        /* renamed from: f, reason: collision with root package name */
        public int f15288f;

        /* renamed from: g, reason: collision with root package name */
        public int f15289g;

        public c(ConstraintLayout constraintLayout) {
            this.f15283a = constraintLayout;
        }

        public static boolean a(int i, int i10, int i11) {
            if (i == i10) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i11 == size;
            }
            return false;
        }

        @SuppressLint({"WrongCall"})
        public final void b(C5508e c5508e, C5543b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int iMax;
            int iMax2;
            int i;
            boolean z10;
            int baseline;
            int i10;
            int childMeasureSpec;
            if (c5508e == null) {
                return;
            }
            if (c5508e.f45557i0 == 8 && !c5508e.f45520F) {
                aVar.f45905e = 0;
                aVar.f45906f = 0;
                aVar.f45907g = 0;
                return;
            }
            if (c5508e.f45536V == null) {
                return;
            }
            C5508e.b bVar = aVar.f45901a;
            C5508e.b bVar2 = aVar.f45902b;
            int i11 = aVar.f45903c;
            int i12 = aVar.f45904d;
            int i13 = this.f15284b + this.f15285c;
            int i14 = this.f15286d;
            View view = c5508e.f45556h0;
            int[] iArr = a.f15213a;
            int i15 = iArr[bVar.ordinal()];
            C5507d c5507d = c5508e.f45526L;
            C5507d c5507d2 = c5508e.f45524J;
            if (i15 != 1) {
                if (i15 == 2) {
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f15288f, i14, -2);
                } else if (i15 == 3) {
                    int i16 = this.f15288f;
                    int i17 = c5507d2 != null ? c5507d2.f45512g : 0;
                    if (c5507d != null) {
                        i17 += c5507d.f45512g;
                    }
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(i16, i14 + i17, -1);
                } else if (i15 != 4) {
                    iMakeMeasureSpec = 0;
                } else {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f15288f, i14, -2);
                    boolean z11 = c5508e.f45574r == 1;
                    int i18 = aVar.f45909j;
                    if (i18 == 1 || i18 == 2) {
                        boolean z12 = view.getMeasuredHeight() == c5508e.k();
                        if (aVar.f45909j == 2 || !z11 || ((z11 && z12) || (view instanceof f) || c5508e.A())) {
                            childMeasureSpec = View.MeasureSpec.makeMeasureSpec(c5508e.q(), 1073741824);
                        }
                    }
                }
                iMakeMeasureSpec = childMeasureSpec;
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            }
            int i19 = iArr[bVar2.ordinal()];
            if (i19 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else if (i19 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f15289g, i13, -2);
            } else if (i19 == 3) {
                int i20 = this.f15289g;
                int i21 = c5507d2 != null ? c5508e.f45525K.f45512g : 0;
                if (c5507d != null) {
                    i21 += c5508e.f45527M.f45512g;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i20, i13 + i21, -1);
            } else if (i19 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f15289g, i13, -2);
                boolean z13 = c5508e.f45575s == 1;
                int i22 = aVar.f45909j;
                if (i22 == 1 || i22 == 2) {
                    boolean z14 = view.getMeasuredWidth() == c5508e.q();
                    if (aVar.f45909j == 2 || !z13 || ((z13 && z14) || (view instanceof f) || c5508e.B())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c5508e.k(), 1073741824);
                    }
                }
            }
            C5509f c5509f = (C5509f) c5508e.f45536V;
            ConstraintLayout constraintLayout = ConstraintLayout.this;
            if (c5509f != null && C5513j.b(constraintLayout.f15204j, 256) && view.getMeasuredWidth() == c5508e.q() && view.getMeasuredWidth() < c5509f.q() && view.getMeasuredHeight() == c5508e.k() && view.getMeasuredHeight() < c5509f.k() && view.getBaseline() == c5508e.f45546c0 && !c5508e.z() && a(c5508e.f45522H, iMakeMeasureSpec, c5508e.q()) && a(c5508e.f45523I, iMakeMeasureSpec2, c5508e.k())) {
                aVar.f45905e = c5508e.q();
                aVar.f45906f = c5508e.k();
                aVar.f45907g = c5508e.f45546c0;
                return;
            }
            C5508e.b bVar3 = C5508e.b.MATCH_CONSTRAINT;
            boolean z15 = bVar == bVar3;
            boolean z16 = bVar2 == bVar3;
            C5508e.b bVar4 = C5508e.b.MATCH_PARENT;
            boolean z17 = bVar2 == bVar4 || bVar2 == C5508e.b.FIXED;
            boolean z18 = bVar == bVar4 || bVar == C5508e.b.FIXED;
            boolean z19 = z15 && c5508e.f45539Y > 0.0f;
            boolean z20 = z16 && c5508e.f45539Y > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i23 = aVar.f45909j;
            if (i23 != 1 && i23 != 2 && z15 && c5508e.f45574r == 0 && z16 && c5508e.f45575s == 0) {
                z10 = false;
                baseline = 0;
                i10 = -1;
                iMax = 0;
                iMax2 = 0;
            } else {
                if ((view instanceof u0.f) && (c5508e instanceof C5514k)) {
                    ((u0.f) view).j((C5514k) c5508e, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                c5508e.f45522H = iMakeMeasureSpec;
                c5508e.f45523I = iMakeMeasureSpec2;
                c5508e.f45553g = false;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i24 = c5508e.f45577u;
                iMax = i24 > 0 ? Math.max(i24, measuredWidth) : measuredWidth;
                int i25 = c5508e.f45578v;
                if (i25 > 0) {
                    iMax = Math.min(i25, iMax);
                }
                int i26 = c5508e.f45580x;
                iMax2 = i26 > 0 ? Math.max(i26, measuredHeight) : measuredHeight;
                boolean z21 = z18;
                int i27 = c5508e.f45581y;
                if (i27 > 0) {
                    iMax2 = Math.min(i27, iMax2);
                }
                if (!C5513j.b(constraintLayout.f15204j, 1)) {
                    if (z19 && z17) {
                        iMax = (int) ((iMax2 * c5508e.f45539Y) + 0.5f);
                    } else if (z20 && z21) {
                        iMax2 = (int) ((iMax / c5508e.f45539Y) + 0.5f);
                    }
                }
                if (measuredWidth == iMax && measuredHeight == iMax2) {
                    baseline = baseline2;
                    z10 = false;
                } else {
                    if (measuredWidth != iMax) {
                        i = 1073741824;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        i = 1073741824;
                    }
                    if (measuredHeight != iMax2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    c5508e.f45522H = iMakeMeasureSpec;
                    c5508e.f45523I = iMakeMeasureSpec2;
                    z10 = false;
                    c5508e.f45553g = false;
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMax = measuredWidth2;
                    iMax2 = measuredHeight2;
                }
                i10 = -1;
            }
            boolean z22 = baseline != i10 ? true : z10;
            if (iMax != aVar.f45903c || iMax2 != aVar.f45904d) {
                z10 = true;
            }
            aVar.i = z10;
            if (bVar5.f15245c0) {
                z22 = true;
            }
            if (z22 && baseline != -1 && c5508e.f45546c0 != baseline) {
                aVar.i = true;
            }
            aVar.f45905e = iMax;
            aVar.f45906f = iMax2;
            aVar.f45908h = z22;
            aVar.f45907g = baseline;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15197b = new SparseArray<>();
        this.f15198c = new ArrayList<>(4);
        this.f15199d = new C5509f();
        this.f15200e = 0;
        this.f15201f = 0;
        this.f15202g = Integer.MAX_VALUE;
        this.f15203h = Integer.MAX_VALUE;
        this.i = true;
        this.f15204j = 257;
        this.f15205k = null;
        this.f15206l = null;
        this.f15207m = -1;
        this.f15208n = new HashMap<>();
        this.f15209o = new SparseArray<>();
        this.f15210p = new c(this);
        this.f15211q = 0;
        this.f15212r = 0;
        c(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static u0.e getSharedValues() {
        if (f15196s == null) {
            u0.e eVar = new u0.e();
            new SparseIntArray();
            new HashMap();
            f15196s = eVar;
        }
        return f15196s;
    }

    public final C5508e b(View view) {
        if (view == this) {
            return this.f15199d;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f15272q0;
        }
        view.setLayoutParams(new b(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f15272q0;
        }
        return null;
    }

    public final void c(AttributeSet attributeSet, int i) {
        C5509f c5509f = this.f15199d;
        c5509f.f45556h0 = this;
        c cVar = this.f15210p;
        c5509f.f45600v0 = cVar;
        c5509f.f45598t0.f45917f = cVar;
        this.f15197b.put(getId(), this);
        this.f15205k = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u0.d.f46499b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 16) {
                    this.f15200e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15200e);
                } else if (index == 17) {
                    this.f15201f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15201f);
                } else if (index == 14) {
                    this.f15202g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15202g);
                } else if (index == 15) {
                    this.f15203h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15203h);
                } else if (index == 113) {
                    this.f15204j = typedArrayObtainStyledAttributes.getInt(index, this.f15204j);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            e(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f15206l = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.f15205k = dVar;
                        dVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f15205k = null;
                    }
                    this.f15207m = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c5509f.f45589E0 = this.f15204j;
        p0.c.f44980p = c5509f.W(AdRequest.MAX_CONTENT_URL_LENGTH);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    public final boolean d() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.c> arrayList = this.f15198c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                arrayList.get(i).getClass();
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
                    String[] strArrSplit = ((String) tag).split(StringUtils.COMMA);
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

    public void e(int i) {
        this.f15206l = new C5617a(getContext(), this, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[PHI: r12
  0x00b4: PHI (r12v10 r0.e$b) = (r12v9 r0.e$b), (r12v1 r0.e$b) binds: [B:33:0x00c1, B:29:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(r0.C5509f r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.f(r0.f, int, int, int):void");
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.i = true;
        super.forceLayout();
    }

    public final void g(C5508e c5508e, b bVar, SparseArray<C5508e> sparseArray, int i, C5507d.b bVar2) {
        View view = this.f15197b.get(i);
        C5508e c5508e2 = sparseArray.get(i);
        if (c5508e2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f15245c0 = true;
        C5507d.b bVar3 = C5507d.b.BASELINE;
        if (bVar2 == bVar3) {
            b bVar4 = (b) view.getLayoutParams();
            bVar4.f15245c0 = true;
            bVar4.f15272q0.f45519E = true;
        }
        c5508e.i(bVar3).b(c5508e2.i(bVar2), bVar.f15217D, bVar.f15216C, true);
        c5508e.f45519E = true;
        c5508e.i(C5507d.b.TOP).j();
        c5508e.i(C5507d.b.BOTTOM).j();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f15203h;
    }

    public int getMaxWidth() {
        return this.f15202g;
    }

    public int getMinHeight() {
        return this.f15201f;
    }

    public int getMinWidth() {
        return this.f15200e;
    }

    public int getOptimizationLevel() {
        return this.f15199d.f45589E0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C5509f c5509f = this.f15199d;
        if (c5509f.f45558j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c5509f.f45558j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c5509f.f45558j = "parent";
            }
        }
        if (c5509f.f45559j0 == null) {
            c5509f.f45559j0 = c5509f.f45558j;
            Log.v("ConstraintLayout", " setDebugName " + c5509f.f45559j0);
        }
        Iterator<C5508e> it = c5509f.f45667r0.iterator();
        while (it.hasNext()) {
            C5508e next = it.next();
            View view = next.f45556h0;
            if (view != null) {
                if (next.f45558j == null && (id = view.getId()) != -1) {
                    next.f45558j = getContext().getResources().getResourceEntryName(id);
                }
                if (next.f45559j0 == null) {
                    next.f45559j0 = next.f45558j;
                    Log.v("ConstraintLayout", " setDebugName " + next.f45559j0);
                }
            }
        }
        c5509f.n(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            b bVar = (b) childAt.getLayoutParams();
            C5508e c5508e = bVar.f15272q0;
            if ((childAt.getVisibility() != 8 || bVar.f15247d0 || bVar.f15249e0 || zIsInEditMode) && !bVar.f15251f0) {
                int iR = c5508e.r();
                int iS = c5508e.s();
                int iQ = c5508e.q() + iR;
                int iK = c5508e.k() + iS;
                childAt.layout(iR, iS, iQ, iK);
                if ((childAt instanceof f) && (content = ((f) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iR, iS, iQ, iK);
                }
            }
        }
        ArrayList<androidx.constraintlayout.widget.c> arrayList = this.f15198c;
        int size = arrayList.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                arrayList.get(i14).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0583  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r30, int r31) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C5508e c5508eB = b(view);
        if ((view instanceof Guideline) && !(c5508eB instanceof C5511h)) {
            b bVar = (b) view.getLayoutParams();
            C5511h c5511h = new C5511h();
            bVar.f15272q0 = c5511h;
            bVar.f15247d0 = true;
            c5511h.S(bVar.f15235V);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.i();
            ((b) view.getLayoutParams()).f15249e0 = true;
            ArrayList<androidx.constraintlayout.widget.c> arrayList = this.f15198c;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f15197b.put(view.getId(), view);
        this.i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f15197b.remove(view.getId());
        C5508e c5508eB = b(view);
        this.f15199d.f45667r0.remove(c5508eB);
        c5508eB.C();
        this.f15198c.remove(view);
        this.i = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.i = true;
        super.requestLayout();
    }

    public void setConstraintSet(d dVar) {
        this.f15205k = dVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray<View> sparseArray = this.f15197b;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f15203h) {
            return;
        }
        this.f15203h = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f15202g) {
            return;
        }
        this.f15202g = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f15201f) {
            return;
        }
        this.f15201f = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f15200e) {
            return;
        }
        this.f15200e = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(u0.b bVar) {
        C5617a c5617a = this.f15206l;
        if (c5617a != null) {
            c5617a.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f15204j = i;
        C5509f c5509f = this.f15199d;
        c5509f.f45589E0 = i;
        p0.c.f44980p = c5509f.W(AdRequest.MAX_CONTENT_URL_LENGTH);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15197b = new SparseArray<>();
        this.f15198c = new ArrayList<>(4);
        this.f15199d = new C5509f();
        this.f15200e = 0;
        this.f15201f = 0;
        this.f15202g = Integer.MAX_VALUE;
        this.f15203h = Integer.MAX_VALUE;
        this.i = true;
        this.f15204j = 257;
        this.f15205k = null;
        this.f15206l = null;
        this.f15207m = -1;
        this.f15208n = new HashMap<>();
        this.f15209o = new SparseArray<>();
        this.f15210p = new c(this);
        this.f15211q = 0;
        this.f15212r = 0;
        c(attributeSet, i);
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A, reason: collision with root package name */
        public int f15214A;

        /* renamed from: B, reason: collision with root package name */
        public int f15215B;

        /* renamed from: C, reason: collision with root package name */
        public final int f15216C;

        /* renamed from: D, reason: collision with root package name */
        public final int f15217D;

        /* renamed from: E, reason: collision with root package name */
        public float f15218E;

        /* renamed from: F, reason: collision with root package name */
        public float f15219F;

        /* renamed from: G, reason: collision with root package name */
        public String f15220G;

        /* renamed from: H, reason: collision with root package name */
        public float f15221H;

        /* renamed from: I, reason: collision with root package name */
        public float f15222I;

        /* renamed from: J, reason: collision with root package name */
        public int f15223J;

        /* renamed from: K, reason: collision with root package name */
        public int f15224K;

        /* renamed from: L, reason: collision with root package name */
        public int f15225L;

        /* renamed from: M, reason: collision with root package name */
        public int f15226M;

        /* renamed from: N, reason: collision with root package name */
        public int f15227N;

        /* renamed from: O, reason: collision with root package name */
        public int f15228O;

        /* renamed from: P, reason: collision with root package name */
        public int f15229P;

        /* renamed from: Q, reason: collision with root package name */
        public int f15230Q;

        /* renamed from: R, reason: collision with root package name */
        public float f15231R;

        /* renamed from: S, reason: collision with root package name */
        public float f15232S;

        /* renamed from: T, reason: collision with root package name */
        public int f15233T;

        /* renamed from: U, reason: collision with root package name */
        public int f15234U;

        /* renamed from: V, reason: collision with root package name */
        public int f15235V;

        /* renamed from: W, reason: collision with root package name */
        public boolean f15236W;

        /* renamed from: X, reason: collision with root package name */
        public boolean f15237X;

        /* renamed from: Y, reason: collision with root package name */
        public String f15238Y;

        /* renamed from: Z, reason: collision with root package name */
        public int f15239Z;

        /* renamed from: a, reason: collision with root package name */
        public int f15240a;

        /* renamed from: a0, reason: collision with root package name */
        public boolean f15241a0;

        /* renamed from: b, reason: collision with root package name */
        public int f15242b;

        /* renamed from: b0, reason: collision with root package name */
        public boolean f15243b0;

        /* renamed from: c, reason: collision with root package name */
        public float f15244c;

        /* renamed from: c0, reason: collision with root package name */
        public boolean f15245c0;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f15246d;

        /* renamed from: d0, reason: collision with root package name */
        public boolean f15247d0;

        /* renamed from: e, reason: collision with root package name */
        public int f15248e;

        /* renamed from: e0, reason: collision with root package name */
        public boolean f15249e0;

        /* renamed from: f, reason: collision with root package name */
        public int f15250f;

        /* renamed from: f0, reason: collision with root package name */
        public boolean f15251f0;

        /* renamed from: g, reason: collision with root package name */
        public int f15252g;

        /* renamed from: g0, reason: collision with root package name */
        public int f15253g0;

        /* renamed from: h, reason: collision with root package name */
        public int f15254h;

        /* renamed from: h0, reason: collision with root package name */
        public int f15255h0;
        public int i;

        /* renamed from: i0, reason: collision with root package name */
        public int f15256i0;

        /* renamed from: j, reason: collision with root package name */
        public int f15257j;

        /* renamed from: j0, reason: collision with root package name */
        public int f15258j0;

        /* renamed from: k, reason: collision with root package name */
        public int f15259k;

        /* renamed from: k0, reason: collision with root package name */
        public int f15260k0;

        /* renamed from: l, reason: collision with root package name */
        public int f15261l;

        /* renamed from: l0, reason: collision with root package name */
        public int f15262l0;

        /* renamed from: m, reason: collision with root package name */
        public int f15263m;

        /* renamed from: m0, reason: collision with root package name */
        public float f15264m0;

        /* renamed from: n, reason: collision with root package name */
        public int f15265n;

        /* renamed from: n0, reason: collision with root package name */
        public int f15266n0;

        /* renamed from: o, reason: collision with root package name */
        public int f15267o;

        /* renamed from: o0, reason: collision with root package name */
        public int f15268o0;

        /* renamed from: p, reason: collision with root package name */
        public int f15269p;

        /* renamed from: p0, reason: collision with root package name */
        public float f15270p0;

        /* renamed from: q, reason: collision with root package name */
        public int f15271q;

        /* renamed from: q0, reason: collision with root package name */
        public C5508e f15272q0;

        /* renamed from: r, reason: collision with root package name */
        public float f15273r;

        /* renamed from: s, reason: collision with root package name */
        public int f15274s;

        /* renamed from: t, reason: collision with root package name */
        public int f15275t;

        /* renamed from: u, reason: collision with root package name */
        public int f15276u;

        /* renamed from: v, reason: collision with root package name */
        public int f15277v;

        /* renamed from: w, reason: collision with root package name */
        public final int f15278w;

        /* renamed from: x, reason: collision with root package name */
        public int f15279x;

        /* renamed from: y, reason: collision with root package name */
        public final int f15280y;

        /* renamed from: z, reason: collision with root package name */
        public int f15281z;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f15282a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f15282a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f15240a = -1;
            this.f15242b = -1;
            this.f15244c = -1.0f;
            this.f15246d = true;
            this.f15248e = -1;
            this.f15250f = -1;
            this.f15252g = -1;
            this.f15254h = -1;
            this.i = -1;
            this.f15257j = -1;
            this.f15259k = -1;
            this.f15261l = -1;
            this.f15263m = -1;
            this.f15265n = -1;
            this.f15267o = -1;
            this.f15269p = -1;
            this.f15271q = 0;
            this.f15273r = 0.0f;
            this.f15274s = -1;
            this.f15275t = -1;
            this.f15276u = -1;
            this.f15277v = -1;
            this.f15278w = RecyclerView.UNDEFINED_DURATION;
            this.f15279x = RecyclerView.UNDEFINED_DURATION;
            this.f15280y = RecyclerView.UNDEFINED_DURATION;
            this.f15281z = RecyclerView.UNDEFINED_DURATION;
            this.f15214A = RecyclerView.UNDEFINED_DURATION;
            this.f15215B = RecyclerView.UNDEFINED_DURATION;
            this.f15216C = RecyclerView.UNDEFINED_DURATION;
            this.f15217D = 0;
            this.f15218E = 0.5f;
            this.f15219F = 0.5f;
            this.f15220G = null;
            this.f15221H = -1.0f;
            this.f15222I = -1.0f;
            this.f15223J = 0;
            this.f15224K = 0;
            this.f15225L = 0;
            this.f15226M = 0;
            this.f15227N = 0;
            this.f15228O = 0;
            this.f15229P = 0;
            this.f15230Q = 0;
            this.f15231R = 1.0f;
            this.f15232S = 1.0f;
            this.f15233T = -1;
            this.f15234U = -1;
            this.f15235V = -1;
            this.f15236W = false;
            this.f15237X = false;
            this.f15238Y = null;
            this.f15239Z = 0;
            this.f15241a0 = true;
            this.f15243b0 = true;
            this.f15245c0 = false;
            this.f15247d0 = false;
            this.f15249e0 = false;
            this.f15251f0 = false;
            this.f15253g0 = -1;
            this.f15255h0 = -1;
            this.f15256i0 = -1;
            this.f15258j0 = -1;
            this.f15260k0 = RecyclerView.UNDEFINED_DURATION;
            this.f15262l0 = RecyclerView.UNDEFINED_DURATION;
            this.f15264m0 = 0.5f;
            this.f15272q0 = new C5508e();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.d.f46499b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i10 = a.f15282a.get(index);
                switch (i10) {
                    case 1:
                        this.f15235V = typedArrayObtainStyledAttributes.getInt(index, this.f15235V);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f15269p);
                        this.f15269p = resourceId;
                        if (resourceId == -1) {
                            this.f15269p = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f15271q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15271q);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f15273r) % 360.0f;
                        this.f15273r = f10;
                        if (f10 < 0.0f) {
                            this.f15273r = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f15240a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15240a);
                        break;
                    case 6:
                        this.f15242b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15242b);
                        break;
                    case 7:
                        this.f15244c = typedArrayObtainStyledAttributes.getFloat(index, this.f15244c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15248e);
                        this.f15248e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f15248e = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15250f);
                        this.f15250f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f15250f = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15252g);
                        this.f15252g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f15252g = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15254h);
                        this.f15254h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f15254h = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 == -1) {
                            this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15257j);
                        this.f15257j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f15257j = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15259k);
                        this.f15259k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f15259k = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15261l);
                        this.f15261l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f15261l = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15263m);
                        this.f15263m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f15263m = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15274s);
                        this.f15274s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f15274s = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15275t);
                        this.f15275t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f15275t = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15276u);
                        this.f15276u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f15276u = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15277v);
                        this.f15277v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f15277v = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f15278w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15278w);
                        break;
                    case 22:
                        this.f15279x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15279x);
                        break;
                    case 23:
                        this.f15280y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15280y);
                        break;
                    case 24:
                        this.f15281z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15281z);
                        break;
                    case 25:
                        this.f15214A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15214A);
                        break;
                    case 26:
                        this.f15215B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15215B);
                        break;
                    case 27:
                        this.f15236W = typedArrayObtainStyledAttributes.getBoolean(index, this.f15236W);
                        break;
                    case 28:
                        this.f15237X = typedArrayObtainStyledAttributes.getBoolean(index, this.f15237X);
                        break;
                    case 29:
                        this.f15218E = typedArrayObtainStyledAttributes.getFloat(index, this.f15218E);
                        break;
                    case 30:
                        this.f15219F = typedArrayObtainStyledAttributes.getFloat(index, this.f15219F);
                        break;
                    case 31:
                        int i11 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f15225L = i11;
                        if (i11 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f15226M = i12;
                        if (i12 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f15227N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15227N);
                            break;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f15227N) == -2) {
                                this.f15227N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f15229P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15229P);
                            break;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f15229P) == -2) {
                                this.f15229P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f15231R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f15231R));
                        this.f15225L = 2;
                        break;
                    case 36:
                        try {
                            this.f15228O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15228O);
                            break;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f15228O) == -2) {
                                this.f15228O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f15230Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15230Q);
                            break;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f15230Q) == -2) {
                                this.f15230Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f15232S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f15232S));
                        this.f15226M = 2;
                        break;
                    default:
                        switch (i10) {
                            case 44:
                                d.h(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f15221H = typedArrayObtainStyledAttributes.getFloat(index, this.f15221H);
                                break;
                            case 46:
                                this.f15222I = typedArrayObtainStyledAttributes.getFloat(index, this.f15222I);
                                break;
                            case 47:
                                this.f15223J = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f15224K = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f15233T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15233T);
                                break;
                            case 50:
                                this.f15234U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15234U);
                                break;
                            case 51:
                                this.f15238Y = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15265n);
                                this.f15265n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f15265n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15267o);
                                this.f15267o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f15267o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.f15217D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15217D);
                                break;
                            case 55:
                                this.f15216C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15216C);
                                break;
                            default:
                                switch (i10) {
                                    case 64:
                                        d.g(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        d.g(this, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.f15239Z = typedArrayObtainStyledAttributes.getInt(index, this.f15239Z);
                                        break;
                                    case 67:
                                        this.f15246d = typedArrayObtainStyledAttributes.getBoolean(index, this.f15246d);
                                        break;
                                }
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.f15247d0 = false;
            this.f15241a0 = true;
            this.f15243b0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f15236W) {
                this.f15241a0 = false;
                if (this.f15225L == 0) {
                    this.f15225L = 1;
                }
            }
            int i10 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i10 == -2 && this.f15237X) {
                this.f15243b0 = false;
                if (this.f15226M == 0) {
                    this.f15226M = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f15241a0 = false;
                if (i == 0 && this.f15225L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f15236W = true;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f15243b0 = false;
                if (i10 == 0 && this.f15226M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f15237X = true;
                }
            }
            if (this.f15244c == -1.0f && this.f15240a == -1 && this.f15242b == -1) {
                return;
            }
            this.f15247d0 = true;
            this.f15241a0 = true;
            this.f15243b0 = true;
            if (!(this.f15272q0 instanceof C5511h)) {
                this.f15272q0 = new C5511h();
            }
            ((C5511h) this.f15272q0).S(this.f15235V);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b() {
            super(-2, -2);
            this.f15240a = -1;
            this.f15242b = -1;
            this.f15244c = -1.0f;
            this.f15246d = true;
            this.f15248e = -1;
            this.f15250f = -1;
            this.f15252g = -1;
            this.f15254h = -1;
            this.i = -1;
            this.f15257j = -1;
            this.f15259k = -1;
            this.f15261l = -1;
            this.f15263m = -1;
            this.f15265n = -1;
            this.f15267o = -1;
            this.f15269p = -1;
            this.f15271q = 0;
            this.f15273r = 0.0f;
            this.f15274s = -1;
            this.f15275t = -1;
            this.f15276u = -1;
            this.f15277v = -1;
            this.f15278w = RecyclerView.UNDEFINED_DURATION;
            this.f15279x = RecyclerView.UNDEFINED_DURATION;
            this.f15280y = RecyclerView.UNDEFINED_DURATION;
            this.f15281z = RecyclerView.UNDEFINED_DURATION;
            this.f15214A = RecyclerView.UNDEFINED_DURATION;
            this.f15215B = RecyclerView.UNDEFINED_DURATION;
            this.f15216C = RecyclerView.UNDEFINED_DURATION;
            this.f15217D = 0;
            this.f15218E = 0.5f;
            this.f15219F = 0.5f;
            this.f15220G = null;
            this.f15221H = -1.0f;
            this.f15222I = -1.0f;
            this.f15223J = 0;
            this.f15224K = 0;
            this.f15225L = 0;
            this.f15226M = 0;
            this.f15227N = 0;
            this.f15228O = 0;
            this.f15229P = 0;
            this.f15230Q = 0;
            this.f15231R = 1.0f;
            this.f15232S = 1.0f;
            this.f15233T = -1;
            this.f15234U = -1;
            this.f15235V = -1;
            this.f15236W = false;
            this.f15237X = false;
            this.f15238Y = null;
            this.f15239Z = 0;
            this.f15241a0 = true;
            this.f15243b0 = true;
            this.f15245c0 = false;
            this.f15247d0 = false;
            this.f15249e0 = false;
            this.f15251f0 = false;
            this.f15253g0 = -1;
            this.f15255h0 = -1;
            this.f15256i0 = -1;
            this.f15258j0 = -1;
            this.f15260k0 = RecyclerView.UNDEFINED_DURATION;
            this.f15262l0 = RecyclerView.UNDEFINED_DURATION;
            this.f15264m0 = 0.5f;
            this.f15272q0 = new C5508e();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f15240a = -1;
            this.f15242b = -1;
            this.f15244c = -1.0f;
            this.f15246d = true;
            this.f15248e = -1;
            this.f15250f = -1;
            this.f15252g = -1;
            this.f15254h = -1;
            this.i = -1;
            this.f15257j = -1;
            this.f15259k = -1;
            this.f15261l = -1;
            this.f15263m = -1;
            this.f15265n = -1;
            this.f15267o = -1;
            this.f15269p = -1;
            this.f15271q = 0;
            this.f15273r = 0.0f;
            this.f15274s = -1;
            this.f15275t = -1;
            this.f15276u = -1;
            this.f15277v = -1;
            this.f15278w = RecyclerView.UNDEFINED_DURATION;
            this.f15279x = RecyclerView.UNDEFINED_DURATION;
            this.f15280y = RecyclerView.UNDEFINED_DURATION;
            this.f15281z = RecyclerView.UNDEFINED_DURATION;
            this.f15214A = RecyclerView.UNDEFINED_DURATION;
            this.f15215B = RecyclerView.UNDEFINED_DURATION;
            this.f15216C = RecyclerView.UNDEFINED_DURATION;
            this.f15217D = 0;
            this.f15218E = 0.5f;
            this.f15219F = 0.5f;
            this.f15220G = null;
            this.f15221H = -1.0f;
            this.f15222I = -1.0f;
            this.f15223J = 0;
            this.f15224K = 0;
            this.f15225L = 0;
            this.f15226M = 0;
            this.f15227N = 0;
            this.f15228O = 0;
            this.f15229P = 0;
            this.f15230Q = 0;
            this.f15231R = 1.0f;
            this.f15232S = 1.0f;
            this.f15233T = -1;
            this.f15234U = -1;
            this.f15235V = -1;
            this.f15236W = false;
            this.f15237X = false;
            this.f15238Y = null;
            this.f15239Z = 0;
            this.f15241a0 = true;
            this.f15243b0 = true;
            this.f15245c0 = false;
            this.f15247d0 = false;
            this.f15249e0 = false;
            this.f15251f0 = false;
            this.f15253g0 = -1;
            this.f15255h0 = -1;
            this.f15256i0 = -1;
            this.f15258j0 = -1;
            this.f15260k0 = RecyclerView.UNDEFINED_DURATION;
            this.f15262l0 = RecyclerView.UNDEFINED_DURATION;
            this.f15264m0 = 0.5f;
            this.f15272q0 = new C5508e();
        }
    }
}
