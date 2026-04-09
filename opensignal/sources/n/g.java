package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import io.sentry.android.core.e0;
import java.lang.reflect.Constructor;
import o.o;
import o.p;
import o.t;

/* loaded from: classes.dex */
public final class g {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ h E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f17087a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17094h;

    /* renamed from: i, reason: collision with root package name */
    public int f17095i;
    public int j;
    public CharSequence k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f17096l;

    /* renamed from: m, reason: collision with root package name */
    public int f17097m;

    /* renamed from: n, reason: collision with root package name */
    public char f17098n;

    /* renamed from: o, reason: collision with root package name */
    public int f17099o;

    /* renamed from: p, reason: collision with root package name */
    public char f17100p;

    /* renamed from: q, reason: collision with root package name */
    public int f17101q;

    /* renamed from: r, reason: collision with root package name */
    public int f17102r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17103s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f17104t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f17105u;

    /* renamed from: v, reason: collision with root package name */
    public int f17106v;

    /* renamed from: w, reason: collision with root package name */
    public int f17107w;

    /* renamed from: x, reason: collision with root package name */
    public String f17108x;

    /* renamed from: y, reason: collision with root package name */
    public String f17109y;

    /* renamed from: z, reason: collision with root package name */
    public p f17110z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f17088b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f17089c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f17090d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f17091e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17092f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17093g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f17087a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f17115c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e4) {
            e0.q("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        h hVar = this.E;
        Context context = hVar.f17115c;
        boolean z10 = false;
        menuItem.setChecked(this.f17103s).setVisible(this.f17104t).setEnabled(this.f17105u).setCheckable(this.f17102r >= 1).setTitleCondensed(this.f17096l).setIcon(this.f17097m);
        int i10 = this.f17106v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        if (this.f17109y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.f17116d == null) {
                hVar.f17116d = h.a(context);
            }
            Object obj = hVar.f17116d;
            String str = this.f17109y;
            f fVar = new f();
            fVar.f17085a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f17086b = cls.getMethod(str, f.f17084c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e4) {
                StringBuilder sbU = c7.a.u("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbU.append(cls.getName());
                InflateException inflateException = new InflateException(sbU.toString());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        if (this.f17102r >= 2) {
            if (menuItem instanceof o) {
                o oVar = (o) menuItem;
                oVar.f18659x = (oVar.f18659x & (-5)) | 4;
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                m3.a aVar = tVar.f18669c;
                try {
                    if (tVar.f18670d == null) {
                        tVar.f18670d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    tVar.f18670d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e10) {
                    e0.q("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                }
            }
        }
        String str2 = this.f17108x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f17111e, hVar.f17113a));
            z10 = true;
        }
        int i11 = this.f17107w;
        if (i11 > 0) {
            if (z10) {
                e0.p("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i11);
            }
        }
        p pVar = this.f17110z;
        if (pVar != null) {
            if (menuItem instanceof m3.a) {
                ((m3.a) menuItem).b(pVar);
            } else {
                e0.p("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z11 = menuItem instanceof m3.a;
        if (z11) {
            ((m3.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a2.e.m(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z11) {
            ((m3.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a2.e.q(menuItem, charSequence2);
        }
        char c4 = this.f17098n;
        int i12 = this.f17099o;
        if (z11) {
            ((m3.a) menuItem).setAlphabeticShortcut(c4, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a2.e.l(menuItem, c4, i12);
        }
        char c10 = this.f17100p;
        int i13 = this.f17101q;
        if (z11) {
            ((m3.a) menuItem).setNumericShortcut(c10, i13);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a2.e.p(menuItem, c10, i13);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z11) {
                ((m3.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                a2.e.o(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z11) {
                ((m3.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                a2.e.n(menuItem, colorStateList);
            }
        }
    }
}
