package androidx.appcompat.view;

import F1.AbstractC2738b;
import F1.AbstractC2783y;
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
import androidx.appcompat.widget.K;
import androidx.appcompat.widget.b0;
import h.AbstractC5936j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l.MenuItemC6522c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y1.InterfaceMenuC8606a;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    static final Class[] f26694e;

    /* renamed from: f, reason: collision with root package name */
    static final Class[] f26695f;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f26696a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f26697b;

    /* renamed from: c, reason: collision with root package name */
    Context f26698c;

    /* renamed from: d, reason: collision with root package name */
    private Object f26699d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        private static final Class[] f26700c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        private Object f26701a;

        /* renamed from: b, reason: collision with root package name */
        private Method f26702b;

        public a(Object obj, String str) {
            this.f26701a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f26702b = cls.getMethod(str, f26700c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.f26702b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f26702b.invoke(this.f26701a, menuItem)).booleanValue();
                }
                this.f26702b.invoke(this.f26701a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private class b {

        /* renamed from: A, reason: collision with root package name */
        AbstractC2738b f26703A;

        /* renamed from: B, reason: collision with root package name */
        private CharSequence f26704B;

        /* renamed from: C, reason: collision with root package name */
        private CharSequence f26705C;

        /* renamed from: D, reason: collision with root package name */
        private ColorStateList f26706D = null;

        /* renamed from: E, reason: collision with root package name */
        private PorterDuff.Mode f26707E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f26709a;

        /* renamed from: b, reason: collision with root package name */
        private int f26710b;

        /* renamed from: c, reason: collision with root package name */
        private int f26711c;

        /* renamed from: d, reason: collision with root package name */
        private int f26712d;

        /* renamed from: e, reason: collision with root package name */
        private int f26713e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f26714f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f26715g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f26716h;

        /* renamed from: i, reason: collision with root package name */
        private int f26717i;

        /* renamed from: j, reason: collision with root package name */
        private int f26718j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f26719k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f26720l;

        /* renamed from: m, reason: collision with root package name */
        private int f26721m;

        /* renamed from: n, reason: collision with root package name */
        private char f26722n;

        /* renamed from: o, reason: collision with root package name */
        private int f26723o;

        /* renamed from: p, reason: collision with root package name */
        private char f26724p;

        /* renamed from: q, reason: collision with root package name */
        private int f26725q;

        /* renamed from: r, reason: collision with root package name */
        private int f26726r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f26727s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f26728t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f26729u;

        /* renamed from: v, reason: collision with root package name */
        private int f26730v;

        /* renamed from: w, reason: collision with root package name */
        private int f26731w;

        /* renamed from: x, reason: collision with root package name */
        private String f26732x;

        /* renamed from: y, reason: collision with root package name */
        private String f26733y;

        /* renamed from: z, reason: collision with root package name */
        private String f26734z;

        public b(Menu menu) {
            this.f26709a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f26698c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            boolean z10 = false;
            menuItem.setChecked(this.f26727s).setVisible(this.f26728t).setEnabled(this.f26729u).setCheckable(this.f26726r >= 1).setTitleCondensed(this.f26720l).setIcon(this.f26721m);
            int i10 = this.f26730v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f26734z != null) {
                if (g.this.f26698c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f26734z));
            }
            if (this.f26726r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof MenuItemC6522c) {
                    ((MenuItemC6522c) menuItem).h(true);
                }
            }
            String str = this.f26732x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f26694e, g.this.f26696a));
                z10 = true;
            }
            int i11 = this.f26731w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            AbstractC2738b abstractC2738b = this.f26703A;
            if (abstractC2738b != null) {
                AbstractC2783y.a(menuItem, abstractC2738b);
            }
            AbstractC2783y.c(menuItem, this.f26704B);
            AbstractC2783y.g(menuItem, this.f26705C);
            AbstractC2783y.b(menuItem, this.f26722n, this.f26723o);
            AbstractC2783y.f(menuItem, this.f26724p, this.f26725q);
            PorterDuff.Mode mode = this.f26707E;
            if (mode != null) {
                AbstractC2783y.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f26706D;
            if (colorStateList != null) {
                AbstractC2783y.d(menuItem, colorStateList);
            }
        }

        public void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f26716h = true;
            i(this.f26709a.add(this.f26710b, this.f26717i, this.f26718j, this.f26719k));
        }

        public SubMenu b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f26716h = true;
            SubMenu subMenuAddSubMenu = this.f26709a.addSubMenu(this.f26710b, this.f26717i, this.f26718j, this.f26719k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f26716h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f26698c.obtainStyledAttributes(attributeSet, AbstractC5936j.f48259o1);
            this.f26710b = typedArrayObtainStyledAttributes.getResourceId(AbstractC5936j.f48267q1, 0);
            this.f26711c = typedArrayObtainStyledAttributes.getInt(AbstractC5936j.f48275s1, 0);
            this.f26712d = typedArrayObtainStyledAttributes.getInt(AbstractC5936j.f48279t1, 0);
            this.f26713e = typedArrayObtainStyledAttributes.getInt(AbstractC5936j.f48283u1, 0);
            this.f26714f = typedArrayObtainStyledAttributes.getBoolean(AbstractC5936j.f48271r1, true);
            this.f26715g = typedArrayObtainStyledAttributes.getBoolean(AbstractC5936j.f48263p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            b0 b0VarU = b0.u(g.this.f26698c, attributeSet, AbstractC5936j.f48287v1);
            this.f26717i = b0VarU.n(AbstractC5936j.f48299y1, 0);
            this.f26718j = (b0VarU.k(AbstractC5936j.f48091B1, this.f26711c) & (-65536)) | (b0VarU.k(AbstractC5936j.f48095C1, this.f26712d) & 65535);
            this.f26719k = b0VarU.p(AbstractC5936j.f48099D1);
            this.f26720l = b0VarU.p(AbstractC5936j.f48103E1);
            this.f26721m = b0VarU.n(AbstractC5936j.f48291w1, 0);
            this.f26722n = c(b0VarU.o(AbstractC5936j.f48107F1));
            this.f26723o = b0VarU.k(AbstractC5936j.f48135M1, 4096);
            this.f26724p = c(b0VarU.o(AbstractC5936j.f48111G1));
            this.f26725q = b0VarU.k(AbstractC5936j.f48151Q1, 4096);
            int i10 = AbstractC5936j.f48115H1;
            if (b0VarU.s(i10)) {
                this.f26726r = b0VarU.a(i10, false) ? 1 : 0;
            } else {
                this.f26726r = this.f26713e;
            }
            this.f26727s = b0VarU.a(AbstractC5936j.f48303z1, false);
            this.f26728t = b0VarU.a(AbstractC5936j.f48087A1, this.f26714f);
            this.f26729u = b0VarU.a(AbstractC5936j.f48295x1, this.f26715g);
            this.f26730v = b0VarU.k(AbstractC5936j.f48155R1, -1);
            this.f26734z = b0VarU.o(AbstractC5936j.f48119I1);
            this.f26731w = b0VarU.n(AbstractC5936j.f48123J1, 0);
            this.f26732x = b0VarU.o(AbstractC5936j.f48131L1);
            String strO = b0VarU.o(AbstractC5936j.f48127K1);
            this.f26733y = strO;
            boolean z10 = strO != null;
            if (z10 && this.f26731w == 0 && this.f26732x == null) {
                this.f26703A = (AbstractC2738b) e(strO, g.f26695f, g.this.f26697b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f26703A = null;
            }
            this.f26704B = b0VarU.p(AbstractC5936j.f48139N1);
            this.f26705C = b0VarU.p(AbstractC5936j.f48159S1);
            int i11 = AbstractC5936j.f48147P1;
            if (b0VarU.s(i11)) {
                this.f26707E = K.d(b0VarU.k(i11, -1), this.f26707E);
            } else {
                this.f26707E = null;
            }
            int i12 = AbstractC5936j.f48143O1;
            if (b0VarU.s(i12)) {
                this.f26706D = b0VarU.c(i12);
            } else {
                this.f26706D = null;
            }
            b0VarU.x();
            this.f26716h = false;
        }

        public void h() {
            this.f26710b = 0;
            this.f26711c = 0;
            this.f26712d = 0;
            this.f26713e = 0;
            this.f26714f = true;
            this.f26715g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f26694e = clsArr;
        f26695f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f26698c = context;
        Object[] objArr = {context};
        this.f26696a = objArr;
        this.f26697b = objArr;
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
                            AbstractC2738b abstractC2738b = bVar.f26703A;
                            if (abstractC2738b == null || !abstractC2738b.a()) {
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

    Object b() {
        if (this.f26699d == null) {
            this.f26699d = a(this.f26698c);
        }
        return this.f26699d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof InterfaceMenuC8606a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f26698c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.e) {
                    androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) menu;
                    if (eVar.F()) {
                        eVar.e0();
                        z10 = true;
                    }
                }
                c(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((androidx.appcompat.view.menu.e) menu).d0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (z10) {
                ((androidx.appcompat.view.menu.e) menu).d0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
