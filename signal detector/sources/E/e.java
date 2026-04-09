package E;

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
    public b f1311a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1312b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1313c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1314d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1315e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1316f;

    /* renamed from: g, reason: collision with root package name */
    public int f1317g;

    /* renamed from: h, reason: collision with root package name */
    public int f1318h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f1319j;

    /* renamed from: k, reason: collision with root package name */
    public View f1320k;

    /* renamed from: l, reason: collision with root package name */
    public View f1321l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1322m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1323n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1324o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1325p;

    public e() {
        super(-2, -2);
        this.f1312b = false;
        this.f1313c = 0;
        this.f1314d = 0;
        this.f1315e = -1;
        this.f1316f = -1;
        this.f1317g = 0;
        this.f1318h = 0;
        this.f1325p = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f1322m;
        }
        if (i != 1) {
            return false;
        }
        return this.f1323n;
    }

    public final void b(b bVar) {
        b bVar2 = this.f1311a;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.j();
            }
            this.f1311a = bVar;
            this.f1312b = true;
            if (bVar != null) {
                bVar.g(this);
            }
        }
    }

    public e(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        b bVar;
        super(context, attributeSet);
        this.f1312b = false;
        this.f1313c = 0;
        this.f1314d = 0;
        this.f1315e = -1;
        this.f1316f = -1;
        this.f1317g = 0;
        this.f1318h = 0;
        this.f1325p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D.a.f1200b);
        this.f1313c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f1316f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f1314d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f1315e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f1317g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f1318h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f1312b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f5056H;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f5056H;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f5058J;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f5057I);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e6) {
                    throw new RuntimeException(A.f.l("Could not inflate Behavior subclass ", string), e6);
                }
            }
            this.f1311a = bVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        b bVar2 = this.f1311a;
        if (bVar2 != null) {
            bVar2.g(this);
        }
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f1312b = false;
        this.f1313c = 0;
        this.f1314d = 0;
        this.f1315e = -1;
        this.f1316f = -1;
        this.f1317g = 0;
        this.f1318h = 0;
        this.f1325p = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1312b = false;
        this.f1313c = 0;
        this.f1314d = 0;
        this.f1315e = -1;
        this.f1316f = -1;
        this.f1317g = 0;
        this.f1318h = 0;
        this.f1325p = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1312b = false;
        this.f1313c = 0;
        this.f1314d = 0;
        this.f1315e = -1;
        this.f1316f = -1;
        this.f1317g = 0;
        this.f1318h = 0;
        this.f1325p = new Rect();
    }
}
