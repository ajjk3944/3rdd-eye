package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gz0 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ hz0 E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public td0 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public gz0(hz0 hz0Var, Menu menu) {
        this.E = hz0Var;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        hz0 hz0Var = this.E;
        Context context = hz0Var.c;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hz0Var.d == null) {
                hz0Var.d = hz0.a(context);
            }
            Object obj = hz0Var.d;
            String str = this.y;
            fz0 fz0Var = new fz0();
            fz0Var.g = obj;
            Class<?> cls = obj.getClass();
            try {
                fz0Var.h = cls.getMethod(str, fz0.i);
                menuItem.setOnMenuItemClickListener(fz0Var);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof sd0) {
                sd0 sd0Var = (sd0) menuItem;
                sd0Var.x = (sd0Var.x & (-5)) | 4;
            } else if (menuItem instanceof wd0) {
                wd0 wd0Var = (wd0) menuItem;
                iz0 iz0Var = wd0Var.c;
                try {
                    if (wd0Var.d == null) {
                        wd0Var.d = iz0Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    wd0Var.d.invoke(iz0Var, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, hz0.e, hz0Var.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        td0 td0Var = this.z;
        if (td0Var != null && (menuItem instanceof iz0)) {
            ((iz0) menuItem).a(td0Var);
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof iz0;
        if (z2) {
            ((iz0) menuItem).setContentDescription(charSequence);
        } else {
            qd0.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((iz0) menuItem).setTooltipText(charSequence2);
        } else {
            qd0.m(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((iz0) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            qd0.g(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((iz0) menuItem).setNumericShortcut(c2, i4);
        } else {
            qd0.k(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((iz0) menuItem).setIconTintMode(mode);
            } else {
                qd0.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((iz0) menuItem).setIconTintList(colorStateList);
            } else {
                qd0.i(menuItem, colorStateList);
            }
        }
    }
}
