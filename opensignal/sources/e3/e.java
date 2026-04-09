package e3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public b f7771a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7772b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7773c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7774d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7775e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7776f;

    /* renamed from: g, reason: collision with root package name */
    public int f7777g;

    /* renamed from: h, reason: collision with root package name */
    public int f7778h;

    /* renamed from: i, reason: collision with root package name */
    public int f7779i;
    public int j;
    public View k;

    /* renamed from: l, reason: collision with root package name */
    public View f7780l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7781m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7782n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7783o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f7784p;

    public e() {
        super(-2, -2);
        this.f7772b = false;
        this.f7773c = 0;
        this.f7774d = 0;
        this.f7775e = -1;
        this.f7776f = -1;
        this.f7777g = 0;
        this.f7778h = 0;
        this.f7784p = new Rect();
    }

    public final boolean a(int i10) {
        if (i10 == 0) {
            return this.f7781m;
        }
        if (i10 != 1) {
            return false;
        }
        return this.f7782n;
    }

    public final void b(b bVar) {
        b bVar2 = this.f7771a;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.f();
            }
            this.f7771a = bVar;
            this.f7772b = true;
            if (bVar != null) {
                bVar.c(this);
            }
        }
    }

    public e(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        b bVar;
        super(context, attributeSet);
        this.f7772b = false;
        this.f7773c = 0;
        this.f7774d = 0;
        this.f7775e = -1;
        this.f7776f = -1;
        this.f7777g = 0;
        this.f7778h = 0;
        this.f7784p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d3.c.CoordinatorLayout_Layout);
        this.f7773c = typedArrayObtainStyledAttributes.getInteger(d3.c.CoordinatorLayout_Layout_android_layout_gravity, 0);
        this.f7776f = typedArrayObtainStyledAttributes.getResourceId(d3.c.CoordinatorLayout_Layout_layout_anchor, -1);
        this.f7774d = typedArrayObtainStyledAttributes.getInteger(d3.c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
        this.f7775e = typedArrayObtainStyledAttributes.getInteger(d3.c.CoordinatorLayout_Layout_layout_keyline, -1);
        this.f7777g = typedArrayObtainStyledAttributes.getInt(d3.c.CoordinatorLayout_Layout_layout_insetEdge, 0);
        this.f7778h = typedArrayObtainStyledAttributes.getInt(d3.c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(d3.c.CoordinatorLayout_Layout_layout_behavior);
        this.f7772b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(d3.c.CoordinatorLayout_Layout_layout_behavior);
            String str = CoordinatorLayout.P;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.P;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.R;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.Q);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e4) {
                    throw new RuntimeException(c7.a.p("Could not inflate Behavior subclass ", string), e4);
                }
            }
            this.f7771a = bVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        b bVar2 = this.f7771a;
        if (bVar2 != null) {
            bVar2.c(this);
        }
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f7772b = false;
        this.f7773c = 0;
        this.f7774d = 0;
        this.f7775e = -1;
        this.f7776f = -1;
        this.f7777g = 0;
        this.f7778h = 0;
        this.f7784p = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f7772b = false;
        this.f7773c = 0;
        this.f7774d = 0;
        this.f7775e = -1;
        this.f7776f = -1;
        this.f7777g = 0;
        this.f7778h = 0;
        this.f7784p = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f7772b = false;
        this.f7773c = 0;
        this.f7774d = 0;
        this.f7775e = -1;
        this.f7776f = -1;
        this.f7777g = 0;
        this.f7778h = 0;
        this.f7784p = new Rect();
    }
}
