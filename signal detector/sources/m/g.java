package m;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.lang.reflect.Constructor;
import n.m;
import n.n;
import n.r;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f21884A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f21885B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f21888E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f21889a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21896h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f21897j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f21898k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f21899l;

    /* renamed from: m, reason: collision with root package name */
    public int f21900m;

    /* renamed from: n, reason: collision with root package name */
    public char f21901n;

    /* renamed from: o, reason: collision with root package name */
    public int f21902o;

    /* renamed from: p, reason: collision with root package name */
    public char f21903p;

    /* renamed from: q, reason: collision with root package name */
    public int f21904q;

    /* renamed from: r, reason: collision with root package name */
    public int f21905r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21906s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21907t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21908u;

    /* renamed from: v, reason: collision with root package name */
    public int f21909v;

    /* renamed from: w, reason: collision with root package name */
    public int f21910w;

    /* renamed from: x, reason: collision with root package name */
    public String f21911x;

    /* renamed from: y, reason: collision with root package name */
    public String f21912y;

    /* renamed from: z, reason: collision with root package name */
    public n f21913z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f21886C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f21887D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f21890b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f21891c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f21892d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f21893e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21894f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21895g = true;

    public g(h hVar, Menu menu) {
        this.f21888E = hVar;
        this.f21889a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f21888E.f21918c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e6) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e6);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z6 = false;
        menuItem.setChecked(this.f21906s).setVisible(this.f21907t).setEnabled(this.f21908u).setCheckable(this.f21905r >= 1).setTitleCondensed(this.f21899l).setIcon(this.f21900m);
        int i = this.f21909v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f21912y;
        h hVar = this.f21888E;
        if (str != null) {
            if (hVar.f21918c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.f21919d == null) {
                hVar.f21919d = h.a(hVar.f21918c);
            }
            Object obj = hVar.f21919d;
            String str2 = this.f21912y;
            f fVar = new f();
            fVar.f21882a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f21883b = cls.getMethod(str2, f.f21881c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e6) {
                StringBuilder sbQ = AbstractC1135f5.q("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbQ.append(cls.getName());
                InflateException inflateException = new InflateException(sbQ.toString());
                inflateException.initCause(e6);
                throw inflateException;
            }
        }
        if (this.f21905r >= 2) {
            if (menuItem instanceof m) {
                ((m) menuItem).f(true);
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                L.a aVar = rVar.f22127c;
                try {
                    if (rVar.f22128d == null) {
                        rVar.f22128d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    rVar.f22128d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e7) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e7);
                }
            }
        }
        String str3 = this.f21911x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f21914e, hVar.f21916a));
            z6 = true;
        }
        int i3 = this.f21910w;
        if (i3 > 0) {
            if (z6) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        n nVar = this.f21913z;
        if (nVar != null) {
            if (menuItem instanceof L.a) {
                ((L.a) menuItem).b(nVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f21884A;
        boolean z7 = menuItem instanceof L.a;
        if (z7) {
            ((L.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            H.a.e(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f21885B;
        if (z7) {
            ((L.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            H.a.i(menuItem, charSequence2);
        }
        char c6 = this.f21901n;
        int i6 = this.f21902o;
        if (z7) {
            ((L.a) menuItem).setAlphabeticShortcut(c6, i6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            H.a.d(menuItem, c6, i6);
        }
        char c7 = this.f21903p;
        int i7 = this.f21904q;
        if (z7) {
            ((L.a) menuItem).setNumericShortcut(c7, i7);
        } else if (Build.VERSION.SDK_INT >= 26) {
            H.a.h(menuItem, c7, i7);
        }
        PorterDuff.Mode mode = this.f21887D;
        if (mode != null) {
            if (z7) {
                ((L.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                H.a.g(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f21886C;
        if (colorStateList != null) {
            if (z7) {
                ((L.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                H.a.f(menuItem, colorStateList);
            }
        }
    }
}
