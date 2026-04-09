package h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.z0;
import androidx.core.view.y;
import c.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f21333e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f21334f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f21335a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f21336b;

    /* renamed from: c, reason: collision with root package name */
    public Context f21337c;

    /* renamed from: d, reason: collision with root package name */
    public Object f21338d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        public static final Class[] f21339c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        public Object f21340a;

        /* renamed from: b, reason: collision with root package name */
        public Method f21341b;

        public a(Object obj, String str) {
            this.f21340a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f21341b = cls.getMethod(str, f21339c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.f21341b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f21341b.invoke(this.f21340a, menuItem)).booleanValue();
                }
                this.f21341b.invoke(this.f21340a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public class b {
        public androidx.core.view.b A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;

        /* renamed from: a, reason: collision with root package name */
        public Menu f21342a;

        /* renamed from: b, reason: collision with root package name */
        public int f21343b;

        /* renamed from: c, reason: collision with root package name */
        public int f21344c;

        /* renamed from: d, reason: collision with root package name */
        public int f21345d;

        /* renamed from: e, reason: collision with root package name */
        public int f21346e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f21347f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f21348g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f21349h;

        /* renamed from: i, reason: collision with root package name */
        public int f21350i;

        /* renamed from: j, reason: collision with root package name */
        public int f21351j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f21352k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f21353l;

        /* renamed from: m, reason: collision with root package name */
        public int f21354m;

        /* renamed from: n, reason: collision with root package name */
        public char f21355n;

        /* renamed from: o, reason: collision with root package name */
        public int f21356o;

        /* renamed from: p, reason: collision with root package name */
        public char f21357p;

        /* renamed from: q, reason: collision with root package name */
        public int f21358q;

        /* renamed from: r, reason: collision with root package name */
        public int f21359r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f21360s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f21361t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f21362u;

        /* renamed from: v, reason: collision with root package name */
        public int f21363v;

        /* renamed from: w, reason: collision with root package name */
        public int f21364w;

        /* renamed from: x, reason: collision with root package name */
        public String f21365x;

        /* renamed from: y, reason: collision with root package name */
        public String f21366y;

        /* renamed from: z, reason: collision with root package name */
        public String f21367z;

        public b(Menu menu) {
            this.f21342a = menu;
            h();
        }

        public void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f21349h = true;
            i(this.f21342a.add(this.f21343b, this.f21350i, this.f21351j, this.f21352k));
        }

        public SubMenu b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f21349h = true;
            SubMenu subMenuAddSubMenu = this.f21342a.addSubMenu(this.f21343b, this.f21350i, this.f21351j, this.f21352k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f21349h;
        }

        public final Object e(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f21337c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f21337c.obtainStyledAttributes(attributeSet, j.MenuGroup);
            this.f21343b = typedArrayObtainStyledAttributes.getResourceId(j.MenuGroup_android_id, 0);
            this.f21344c = typedArrayObtainStyledAttributes.getInt(j.MenuGroup_android_menuCategory, 0);
            this.f21345d = typedArrayObtainStyledAttributes.getInt(j.MenuGroup_android_orderInCategory, 0);
            this.f21346e = typedArrayObtainStyledAttributes.getInt(j.MenuGroup_android_checkableBehavior, 0);
            this.f21347f = typedArrayObtainStyledAttributes.getBoolean(j.MenuGroup_android_visible, true);
            this.f21348g = typedArrayObtainStyledAttributes.getBoolean(j.MenuGroup_android_enabled, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            z0 z0VarU = z0.u(g.this.f21337c, attributeSet, j.MenuItem);
            this.f21350i = z0VarU.n(j.MenuItem_android_id, 0);
            this.f21351j = (z0VarU.k(j.MenuItem_android_menuCategory, this.f21344c) & (-65536)) | (z0VarU.k(j.MenuItem_android_orderInCategory, this.f21345d) & 65535);
            this.f21352k = z0VarU.p(j.MenuItem_android_title);
            this.f21353l = z0VarU.p(j.MenuItem_android_titleCondensed);
            this.f21354m = z0VarU.n(j.MenuItem_android_icon, 0);
            this.f21355n = c(z0VarU.o(j.MenuItem_android_alphabeticShortcut));
            this.f21356o = z0VarU.k(j.MenuItem_alphabeticModifiers, 4096);
            this.f21357p = c(z0VarU.o(j.MenuItem_android_numericShortcut));
            this.f21358q = z0VarU.k(j.MenuItem_numericModifiers, 4096);
            int i10 = j.MenuItem_android_checkable;
            if (z0VarU.s(i10)) {
                this.f21359r = z0VarU.a(i10, false) ? 1 : 0;
            } else {
                this.f21359r = this.f21346e;
            }
            this.f21360s = z0VarU.a(j.MenuItem_android_checked, false);
            this.f21361t = z0VarU.a(j.MenuItem_android_visible, this.f21347f);
            this.f21362u = z0VarU.a(j.MenuItem_android_enabled, this.f21348g);
            this.f21363v = z0VarU.k(j.MenuItem_showAsAction, -1);
            this.f21367z = z0VarU.o(j.MenuItem_android_onClick);
            this.f21364w = z0VarU.n(j.MenuItem_actionLayout, 0);
            this.f21365x = z0VarU.o(j.MenuItem_actionViewClass);
            String strO = z0VarU.o(j.MenuItem_actionProviderClass);
            this.f21366y = strO;
            boolean z10 = strO != null;
            if (z10 && this.f21364w == 0 && this.f21365x == null) {
                this.A = (androidx.core.view.b) e(strO, g.f21334f, g.this.f21336b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = z0VarU.p(j.MenuItem_contentDescription);
            this.C = z0VarU.p(j.MenuItem_tooltipText);
            int i11 = j.MenuItem_iconTintMode;
            if (z0VarU.s(i11)) {
                this.E = j0.e(z0VarU.k(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = j.MenuItem_iconTint;
            if (z0VarU.s(i12)) {
                this.D = z0VarU.c(i12);
            } else {
                this.D = null;
            }
            z0VarU.x();
            this.f21349h = false;
        }

        public void h() {
            this.f21343b = 0;
            this.f21344c = 0;
            this.f21345d = 0;
            this.f21346e = 0;
            this.f21347f = true;
            this.f21348g = true;
        }

        public final void i(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            boolean z10 = false;
            menuItem.setChecked(this.f21360s).setVisible(this.f21361t).setEnabled(this.f21362u).setCheckable(this.f21359r >= 1).setTitleCondensed(this.f21353l).setIcon(this.f21354m);
            int i10 = this.f21363v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f21367z != null) {
                if (g.this.f21337c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f21367z));
            }
            if (this.f21359r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.f) {
                    ((androidx.appcompat.view.menu.f) menuItem).t(true);
                } else if (menuItem instanceof i.c) {
                    ((i.c) menuItem).h(true);
                }
            }
            String str = this.f21365x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f21333e, g.this.f21335a));
                z10 = true;
            }
            int i11 = this.f21364w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                y.a(menuItem, bVar);
            }
            y.c(menuItem, this.B);
            y.g(menuItem, this.C);
            y.b(menuItem, this.f21355n, this.f21356o);
            y.f(menuItem, this.f21357p, this.f21358q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                y.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                y.d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f21333e = clsArr;
        f21334f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f21337c = context;
        Object[] objArr = {context};
        this.f21335a = objArr;
        this.f21336b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f21338d == null) {
            this.f21338d = a(this.f21337c);
        }
        return this.f21338d;
    }

    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        z11 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            androidx.core.view.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof l0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f21337c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.d) {
                    androidx.appcompat.view.menu.d dVar = (androidx.appcompat.view.menu.d) menu;
                    if (dVar.H()) {
                        dVar.i0();
                        z10 = true;
                    }
                }
                c(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((androidx.appcompat.view.menu.d) menu).h0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (z10) {
                ((androidx.appcompat.view.menu.d) menu).h0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
