package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import o.o;
import o.p;
import o.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ h E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f29457a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29463h;

    /* renamed from: i, reason: collision with root package name */
    public int f29464i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f29465k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f29466l;

    /* renamed from: m, reason: collision with root package name */
    public int f29467m;

    /* renamed from: n, reason: collision with root package name */
    public char f29468n;

    /* renamed from: o, reason: collision with root package name */
    public int f29469o;

    /* renamed from: p, reason: collision with root package name */
    public char f29470p;

    /* renamed from: q, reason: collision with root package name */
    public int f29471q;

    /* renamed from: r, reason: collision with root package name */
    public int f29472r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f29473s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f29474t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f29475u;

    /* renamed from: v, reason: collision with root package name */
    public int f29476v;

    /* renamed from: w, reason: collision with root package name */
    public int f29477w;

    /* renamed from: x, reason: collision with root package name */
    public String f29478x;

    /* renamed from: y, reason: collision with root package name */
    public String f29479y;

    /* renamed from: z, reason: collision with root package name */
    public p f29480z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f29458b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f29459c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f29460d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f29461e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29462f = true;
    public boolean g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f29457a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f29485c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        h hVar = this.E;
        Context context = hVar.f29485c;
        boolean z3 = false;
        menuItem.setChecked(this.f29473s).setVisible(this.f29474t).setEnabled(this.f29475u).setCheckable(this.f29472r >= 1).setTitleCondensed(this.f29466l).setIcon(this.f29467m);
        int i4 = this.f29476v;
        if (i4 >= 0) {
            menuItem.setShowAsAction(i4);
        }
        if (this.f29479y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.f29486d == null) {
                hVar.f29486d = h.a(context);
            }
            Object obj = hVar.f29486d;
            String str = this.f29479y;
            f fVar = new f();
            fVar.f29455a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f29456b = cls.getMethod(str, f.f29454c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e2) {
                StringBuilder sbA = d.h.A("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbA.append(cls.getName());
                InflateException inflateException = new InflateException(sbA.toString());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f29472r >= 2) {
            if (menuItem instanceof o) {
                o oVar = (o) menuItem;
                oVar.f30284x = (oVar.f30284x & (-5)) | 4;
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                y3.a aVar = tVar.f30295c;
                try {
                    if (tVar.f30296d == null) {
                        tVar.f30296d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    tVar.f30296d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e10) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                }
            }
        }
        String str2 = this.f29478x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f29481e, hVar.f29483a));
            z3 = true;
        }
        int i10 = this.f29477w;
        if (i10 > 0) {
            if (z3) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i10);
            }
        }
        p pVar = this.f29480z;
        if (pVar != null) {
            if (menuItem instanceof y3.a) {
                ((y3.a) menuItem).b(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z10 = menuItem instanceof y3.a;
        if (z10) {
            ((y3.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            ub.a.p(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z10) {
            ((y3.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            ub.a.u(menuItem, charSequence2);
        }
        char c9 = this.f29468n;
        int i11 = this.f29469o;
        if (z10) {
            ((y3.a) menuItem).setAlphabeticShortcut(c9, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            ub.a.o(menuItem, c9, i11);
        }
        char c10 = this.f29470p;
        int i12 = this.f29471q;
        if (z10) {
            ((y3.a) menuItem).setNumericShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            ub.a.t(menuItem, c10, i12);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z10) {
                ((y3.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                ub.a.s(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z10) {
                ((y3.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                ub.a.r(menuItem, colorStateList);
            }
        }
    }
}
