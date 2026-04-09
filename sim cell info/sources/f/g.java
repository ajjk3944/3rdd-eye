package f;

import a.j;
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
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.w0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    static final Class<?>[] f2571e;

    /* renamed from: f, reason: collision with root package name */
    static final Class<?>[] f2572f;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f2573a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f2574b;

    /* renamed from: c, reason: collision with root package name */
    Context f2575c;

    /* renamed from: d, reason: collision with root package name */
    private Object f2576d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f2577c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        private Object f2578a;

        /* renamed from: b, reason: collision with root package name */
        private Method f2579b;

        public a(Object obj, String str) {
            this.f2578a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f2579b = cls.getMethod(str, f2577c);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.f2579b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f2579b.invoke(this.f2578a, menuItem)).booleanValue();
                }
                this.f2579b.invoke(this.f2578a, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    private class b {
        a0.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f2580a;

        /* renamed from: b, reason: collision with root package name */
        private int f2581b;

        /* renamed from: c, reason: collision with root package name */
        private int f2582c;

        /* renamed from: d, reason: collision with root package name */
        private int f2583d;

        /* renamed from: e, reason: collision with root package name */
        private int f2584e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f2585f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f2586g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f2587h;

        /* renamed from: i, reason: collision with root package name */
        private int f2588i;

        /* renamed from: j, reason: collision with root package name */
        private int f2589j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f2590k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f2591l;

        /* renamed from: m, reason: collision with root package name */
        private int f2592m;

        /* renamed from: n, reason: collision with root package name */
        private char f2593n;

        /* renamed from: o, reason: collision with root package name */
        private int f2594o;

        /* renamed from: p, reason: collision with root package name */
        private char f2595p;

        /* renamed from: q, reason: collision with root package name */
        private int f2596q;

        /* renamed from: r, reason: collision with root package name */
        private int f2597r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f2598s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f2599t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f2600u;

        /* renamed from: v, reason: collision with root package name */
        private int f2601v;

        /* renamed from: w, reason: collision with root package name */
        private int f2602w;

        /* renamed from: x, reason: collision with root package name */
        private String f2603x;

        /* renamed from: y, reason: collision with root package name */
        private String f2604y;

        /* renamed from: z, reason: collision with root package name */
        private String f2605z;

        public b(Menu menu) {
            this.f2580a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f2575c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        private void i(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            boolean z2 = false;
            menuItem.setChecked(this.f2598s).setVisible(this.f2599t).setEnabled(this.f2600u).setCheckable(this.f2597r >= 1).setTitleCondensed(this.f2591l).setIcon(this.f2592m);
            int i2 = this.f2601v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.f2605z != null) {
                if (g.this.f2575c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f2605z));
            }
            boolean z3 = menuItem instanceof androidx.appcompat.view.menu.g;
            if (z3) {
            }
            if (this.f2597r >= 2) {
                if (z3) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof g.c) {
                    ((g.c) menuItem).h(true);
                }
            }
            String str = this.f2603x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f2571e, g.this.f2573a));
                z2 = true;
            }
            int i3 = this.f2602w;
            if (i3 > 0) {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            a0.b bVar = this.A;
            if (bVar != null) {
                a0.h.a(menuItem, bVar);
            }
            a0.h.c(menuItem, this.B);
            a0.h.g(menuItem, this.C);
            a0.h.b(menuItem, this.f2593n, this.f2594o);
            a0.h.f(menuItem, this.f2595p, this.f2596q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                a0.h.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                a0.h.d(menuItem, colorStateList);
            }
        }

        public void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f2587h = true;
            i(this.f2580a.add(this.f2581b, this.f2588i, this.f2589j, this.f2590k));
        }

        public SubMenu b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f2587h = true;
            SubMenu subMenuAddSubMenu = this.f2580a.addSubMenu(this.f2581b, this.f2588i, this.f2589j, this.f2590k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f2587h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f2575c.obtainStyledAttributes(attributeSet, j.r1);
            this.f2581b = typedArrayObtainStyledAttributes.getResourceId(j.t1, 0);
            this.f2582c = typedArrayObtainStyledAttributes.getInt(j.v1, 0);
            this.f2583d = typedArrayObtainStyledAttributes.getInt(j.w1, 0);
            this.f2584e = typedArrayObtainStyledAttributes.getInt(j.x1, 0);
            this.f2585f = typedArrayObtainStyledAttributes.getBoolean(j.u1, true);
            this.f2586g = typedArrayObtainStyledAttributes.getBoolean(j.s1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            w0 w0VarS = w0.s(g.this.f2575c, attributeSet, j.y1);
            this.f2588i = w0VarS.m(j.B1, 0);
            this.f2589j = (w0VarS.j(j.E1, this.f2582c) & (-65536)) | (w0VarS.j(j.F1, this.f2583d) & 65535);
            this.f2590k = w0VarS.o(j.G1);
            this.f2591l = w0VarS.o(j.H1);
            this.f2592m = w0VarS.m(j.z1, 0);
            this.f2593n = c(w0VarS.n(j.I1));
            this.f2594o = w0VarS.j(j.P1, 4096);
            this.f2595p = c(w0VarS.n(j.J1));
            this.f2596q = w0VarS.j(j.T1, 4096);
            int i2 = j.K1;
            this.f2597r = w0VarS.q(i2) ? w0VarS.a(i2, false) : this.f2584e;
            this.f2598s = w0VarS.a(j.C1, false);
            this.f2599t = w0VarS.a(j.D1, this.f2585f);
            this.f2600u = w0VarS.a(j.A1, this.f2586g);
            this.f2601v = w0VarS.j(j.U1, -1);
            this.f2605z = w0VarS.n(j.L1);
            this.f2602w = w0VarS.m(j.M1, 0);
            this.f2603x = w0VarS.n(j.O1);
            String strN = w0VarS.n(j.N1);
            this.f2604y = strN;
            boolean z2 = strN != null;
            if (z2 && this.f2602w == 0 && this.f2603x == null) {
                this.A = (a0.b) e(strN, g.f2572f, g.this.f2574b);
            } else {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = w0VarS.o(j.Q1);
            this.C = w0VarS.o(j.V1);
            int i3 = j.S1;
            if (w0VarS.q(i3)) {
                this.E = e0.d(w0VarS.j(i3, -1), this.E);
            } else {
                this.E = null;
            }
            int i4 = j.R1;
            if (w0VarS.q(i4)) {
                this.D = w0VarS.c(i4);
            } else {
                this.D = null;
            }
            w0VarS.u();
            this.f2587h = false;
        }

        public void h() {
            this.f2581b = 0;
            this.f2582c = 0;
            this.f2583d = 0;
            this.f2584e = 0;
            this.f2585f = true;
            this.f2586g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f2571e = clsArr;
        f2572f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f2575c = context;
        Object[] objArr = {context};
        this.f2573a = objArr;
        this.f2574b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
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
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z3 && name2.equals(str)) {
                        str = null;
                        z3 = false;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            a0.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z2 = true;
                    }
                }
            } else if (!z3) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z3 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f2576d == null) {
            this.f2576d = a(this.f2575c);
        }
        return this.f2576d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof v.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f2575c.getResources().getLayout(i2);
                    c(layout, Xml.asAttributeSet(layout), menu);
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}
