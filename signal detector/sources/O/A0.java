package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import g.AbstractC2327a;
import java.lang.reflect.Method;
import n.InterfaceC2664A;

/* loaded from: classes.dex */
public class A0 implements InterfaceC2664A {

    /* renamed from: O, reason: collision with root package name */
    public static final Method f22334O;

    /* renamed from: P, reason: collision with root package name */
    public static final Method f22335P;

    /* renamed from: Q, reason: collision with root package name */
    public static final Method f22336Q;

    /* renamed from: C, reason: collision with root package name */
    public View f22337C;

    /* renamed from: D, reason: collision with root package name */
    public AdapterView.OnItemClickListener f22338D;

    /* renamed from: E, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f22339E;

    /* renamed from: J, reason: collision with root package name */
    public final Handler f22344J;

    /* renamed from: L, reason: collision with root package name */
    public Rect f22346L;
    public boolean M;

    /* renamed from: N, reason: collision with root package name */
    public final C2746x f22347N;

    /* renamed from: a, reason: collision with root package name */
    public final Context f22348a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f22349b;

    /* renamed from: c, reason: collision with root package name */
    public C2732p0 f22350c;

    /* renamed from: f, reason: collision with root package name */
    public int f22353f;

    /* renamed from: g, reason: collision with root package name */
    public int f22354g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22356j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22357k;

    /* renamed from: n, reason: collision with root package name */
    public V.b f22360n;

    /* renamed from: d, reason: collision with root package name */
    public final int f22351d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f22352e = -2;

    /* renamed from: h, reason: collision with root package name */
    public final int f22355h = BackupConstant.SCENE_BACKUP_RENDER_FAIL;

    /* renamed from: l, reason: collision with root package name */
    public int f22358l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f22359m = Integer.MAX_VALUE;

    /* renamed from: F, reason: collision with root package name */
    public final RunnableC2747x0 f22340F = new RunnableC2747x0(this, 1);

    /* renamed from: G, reason: collision with root package name */
    public final ViewOnTouchListenerC2751z0 f22341G = new ViewOnTouchListenerC2751z0(this);

    /* renamed from: H, reason: collision with root package name */
    public final C2749y0 f22342H = new C2749y0(this);

    /* renamed from: I, reason: collision with root package name */
    public final RunnableC2747x0 f22343I = new RunnableC2747x0(this, 0);

    /* renamed from: K, reason: collision with root package name */
    public final Rect f22345K = new Rect();

    static {
        int i = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i <= 28) {
            try {
                f22334O = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f22336Q = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f22335P = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public A0(Context context, AttributeSet attributeSet, int i, int i3) {
        int resourceId;
        this.f22348a = context;
        this.f22344J = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2327a.f20128p, i, 0);
        this.f22353f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f22354g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C2746x c2746x = new C2746x(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC2327a.f20132t, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c2746x.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c2746x.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : a4.t.i(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f22347N = c2746x;
        c2746x.setInputMethodMode(1);
    }

    @Override // n.InterfaceC2664A
    public final boolean a() {
        return this.f22347N.isShowing();
    }

    public final int b() {
        return this.f22353f;
    }

    public final void d(int i) {
        this.f22353f = i;
    }

    @Override // n.InterfaceC2664A
    public final void dismiss() {
        C2746x c2746x = this.f22347N;
        c2746x.dismiss();
        c2746x.setContentView(null);
        this.f22350c = null;
        this.f22344J.removeCallbacks(this.f22340F);
    }

    public final Drawable f() {
        return this.f22347N.getBackground();
    }

    @Override // n.InterfaceC2664A
    public final void g() {
        int i;
        int iA;
        int paddingBottom;
        C2732p0 c2732p0;
        C2732p0 c2732p02 = this.f22350c;
        Context context = this.f22348a;
        C2746x c2746x = this.f22347N;
        if (c2732p02 == null) {
            C2732p0 c2732p0Q = q(context, !this.M);
            this.f22350c = c2732p0Q;
            c2732p0Q.setAdapter(this.f22349b);
            this.f22350c.setOnItemClickListener(this.f22338D);
            this.f22350c.setFocusable(true);
            this.f22350c.setFocusableInTouchMode(true);
            this.f22350c.setOnItemSelectedListener(new C2741u0(0, this));
            this.f22350c.setOnScrollListener(this.f22342H);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f22339E;
            if (onItemSelectedListener != null) {
                this.f22350c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c2746x.setContentView(this.f22350c);
        }
        Drawable background = c2746x.getBackground();
        Rect rect = this.f22345K;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i = rect.bottom + i3;
            if (!this.i) {
                this.f22354g = -i3;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z6 = c2746x.getInputMethodMode() == 2;
        View view = this.f22337C;
        int i6 = this.f22354g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f22335P;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(c2746x, view, Integer.valueOf(i6), Boolean.valueOf(z6))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            } else {
                iA = c2746x.getMaxAvailableHeight(view, i6);
            }
        } else {
            iA = AbstractC2743v0.a(c2746x, view, i6, z6);
        }
        int i7 = this.f22351d;
        if (i7 == -1) {
            paddingBottom = iA + i;
        } else {
            int i8 = this.f22352e;
            int iA2 = this.f22350c.a(i8 != -2 ? i8 != -1 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), LinearLayoutManager.INVALID_OFFSET), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f22350c.getPaddingBottom() + this.f22350c.getPaddingTop() + i : 0);
        }
        boolean z7 = this.f22347N.getInputMethodMode() == 2;
        c2746x.setWindowLayoutType(this.f22355h);
        if (c2746x.isShowing()) {
            if (this.f22337C.isAttachedToWindow()) {
                int width = this.f22352e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f22337C.getWidth();
                }
                if (i7 == -1) {
                    i7 = z7 ? paddingBottom : -1;
                    if (z7) {
                        c2746x.setWidth(this.f22352e == -1 ? -1 : 0);
                        c2746x.setHeight(0);
                    } else {
                        c2746x.setWidth(this.f22352e == -1 ? -1 : 0);
                        c2746x.setHeight(-1);
                    }
                } else if (i7 == -2) {
                    i7 = paddingBottom;
                }
                c2746x.setOutsideTouchable(true);
                View view2 = this.f22337C;
                int i9 = width;
                int i10 = this.f22353f;
                int i11 = this.f22354g;
                int i12 = i9 < 0 ? -1 : i9;
                if (i7 < 0) {
                    i7 = -1;
                }
                c2746x.update(view2, i10, i11, i12, i7);
                return;
            }
            return;
        }
        int width2 = this.f22352e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f22337C.getWidth();
        }
        if (i7 == -1) {
            i7 = -1;
        } else if (i7 == -2) {
            i7 = paddingBottom;
        }
        c2746x.setWidth(width2);
        c2746x.setHeight(i7);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f22334O;
            if (method2 != null) {
                try {
                    method2.invoke(c2746x, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC2745w0.b(c2746x, true);
        }
        c2746x.setOutsideTouchable(true);
        c2746x.setTouchInterceptor(this.f22341G);
        if (this.f22357k) {
            c2746x.setOverlapAnchor(this.f22356j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f22336Q;
            if (method3 != null) {
                try {
                    method3.invoke(c2746x, this.f22346L);
                } catch (Exception e6) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e6);
                }
            }
        } else {
            AbstractC2745w0.a(c2746x, this.f22346L);
        }
        c2746x.showAsDropDown(this.f22337C, this.f22353f, this.f22354g, this.f22358l);
        this.f22350c.setSelection(-1);
        if ((!this.M || this.f22350c.isInTouchMode()) && (c2732p0 = this.f22350c) != null) {
            c2732p0.setListSelectionHidden(true);
            c2732p0.requestLayout();
        }
        if (this.M) {
            return;
        }
        this.f22344J.post(this.f22343I);
    }

    @Override // n.InterfaceC2664A
    public final C2732p0 i() {
        return this.f22350c;
    }

    public final void j(Drawable drawable) {
        this.f22347N.setBackgroundDrawable(drawable);
    }

    public final void k(int i) {
        this.f22354g = i;
        this.i = true;
    }

    public final int n() {
        if (this.i) {
            return this.f22354g;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        V.b bVar = this.f22360n;
        if (bVar == null) {
            this.f22360n = new V.b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f22349b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f22349b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f22360n);
        }
        C2732p0 c2732p0 = this.f22350c;
        if (c2732p0 != null) {
            c2732p0.setAdapter(this.f22349b);
        }
    }

    public C2732p0 q(Context context, boolean z6) {
        return new C2732p0(context, z6);
    }

    public final void r(int i) {
        Drawable background = this.f22347N.getBackground();
        if (background == null) {
            this.f22352e = i;
            return;
        }
        Rect rect = this.f22345K;
        background.getPadding(rect);
        this.f22352e = rect.left + rect.right + i;
    }
}
