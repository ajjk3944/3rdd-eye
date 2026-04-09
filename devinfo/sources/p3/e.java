package p3;

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
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public b f31147a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31148b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31149c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31150d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31151e;

    /* renamed from: f, reason: collision with root package name */
    public final int f31152f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public int f31153h;

    /* renamed from: i, reason: collision with root package name */
    public int f31154i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public View f31155k;

    /* renamed from: l, reason: collision with root package name */
    public View f31156l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f31157m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f31158n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f31159o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f31160p;

    public e() {
        super(-2, -2);
        this.f31148b = false;
        this.f31149c = 0;
        this.f31150d = 0;
        this.f31151e = -1;
        this.f31152f = -1;
        this.g = 0;
        this.f31153h = 0;
        this.f31160p = new Rect();
    }

    public final boolean a(int i4) {
        if (i4 == 0) {
            return this.f31157m;
        }
        if (i4 != 1) {
            return false;
        }
        return this.f31158n;
    }

    public e(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        b bVar;
        super(context, attributeSet);
        this.f31148b = false;
        this.f31149c = 0;
        this.f31150d = 0;
        this.f31151e = -1;
        this.f31152f = -1;
        this.g = 0;
        this.f31153h = 0;
        this.f31160p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o3.a.f30407b);
        this.f31149c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f31152f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f31150d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f31151e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f31153h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f31148b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f871t;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f871t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f873v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f872u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException(u.t("Could not inflate Behavior subclass ", string), e2);
                }
            }
            this.f31147a = bVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        b bVar2 = this.f31147a;
        if (bVar2 != null) {
            bVar2.g(this);
        }
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f31148b = false;
        this.f31149c = 0;
        this.f31150d = 0;
        this.f31151e = -1;
        this.f31152f = -1;
        this.g = 0;
        this.f31153h = 0;
        this.f31160p = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f31148b = false;
        this.f31149c = 0;
        this.f31150d = 0;
        this.f31151e = -1;
        this.f31152f = -1;
        this.g = 0;
        this.f31153h = 0;
        this.f31160p = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f31148b = false;
        this.f31149c = 0;
        this.f31150d = 0;
        this.f31151e = -1;
        this.f31152f = -1;
        this.g = 0;
        this.f31153h = 0;
        this.f31160p = new Rect();
    }
}
