package m;

import L0.AbstractC0771b;
import L0.C0782m;
import N7.B8;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import g.C4353a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n.MenuItemC5341c;
import o.C5375C;
import org.xmlpull.v1.XmlPullParserException;
import z0.C5848a;

/* compiled from: SupportMenuInflater.java */
/* loaded from: classes.dex */
public final class f extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f43947e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class<?>[] f43948f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f43949a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f43950b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f43951c;

    /* renamed from: d, reason: collision with root package name */
    public Object f43952d;

    /* compiled from: SupportMenuInflater.java */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d, reason: collision with root package name */
        public static final Class<?>[] f43953d = {MenuItem.class};

        /* renamed from: b, reason: collision with root package name */
        public Object f43954b;

        /* renamed from: c, reason: collision with root package name */
        public Method f43955c;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Method method = this.f43955c;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f43954b;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    /* compiled from: SupportMenuInflater.java */
    public class b {

        /* renamed from: A, reason: collision with root package name */
        public CharSequence f43956A;

        /* renamed from: B, reason: collision with root package name */
        public CharSequence f43957B;

        /* renamed from: a, reason: collision with root package name */
        public final Menu f43961a;

        /* renamed from: h, reason: collision with root package name */
        public boolean f43968h;
        public int i;

        /* renamed from: j, reason: collision with root package name */
        public int f43969j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f43970k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f43971l;

        /* renamed from: m, reason: collision with root package name */
        public int f43972m;

        /* renamed from: n, reason: collision with root package name */
        public char f43973n;

        /* renamed from: o, reason: collision with root package name */
        public int f43974o;

        /* renamed from: p, reason: collision with root package name */
        public char f43975p;

        /* renamed from: q, reason: collision with root package name */
        public int f43976q;

        /* renamed from: r, reason: collision with root package name */
        public int f43977r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f43978s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f43979t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f43980u;

        /* renamed from: v, reason: collision with root package name */
        public int f43981v;

        /* renamed from: w, reason: collision with root package name */
        public int f43982w;

        /* renamed from: x, reason: collision with root package name */
        public String f43983x;

        /* renamed from: y, reason: collision with root package name */
        public String f43984y;

        /* renamed from: z, reason: collision with root package name */
        public AbstractC0771b f43985z;

        /* renamed from: C, reason: collision with root package name */
        public ColorStateList f43958C = null;

        /* renamed from: D, reason: collision with root package name */
        public PorterDuff.Mode f43959D = null;

        /* renamed from: b, reason: collision with root package name */
        public int f43962b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f43963c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f43964d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f43965e = 0;

        /* renamed from: f, reason: collision with root package name */
        public boolean f43966f = true;

        /* renamed from: g, reason: collision with root package name */
        public boolean f43967g = true;

        public b(Menu menu) {
            this.f43961a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f43951c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e4) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
                return null;
            }
        }

        public final void b(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            boolean z10 = false;
            menuItem.setChecked(this.f43978s).setVisible(this.f43979t).setEnabled(this.f43980u).setCheckable(this.f43977r >= 1).setTitleCondensed(this.f43971l).setIcon(this.f43972m);
            int i = this.f43981v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            String str = this.f43984y;
            f fVar = f.this;
            if (str != null) {
                if (fVar.f43951c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (fVar.f43952d == null) {
                    fVar.f43952d = f.a(fVar.f43951c);
                }
                Object obj = fVar.f43952d;
                String str2 = this.f43984y;
                a aVar = new a();
                aVar.f43954b = obj;
                Class<?> cls = obj.getClass();
                try {
                    aVar.f43955c = cls.getMethod(str2, a.f43953d);
                    menuItem.setOnMenuItemClickListener(aVar);
                } catch (Exception e4) {
                    StringBuilder sbK = B8.k("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    sbK.append(cls.getName());
                    InflateException inflateException = new InflateException(sbK.toString());
                    inflateException.initCause(e4);
                    throw inflateException;
                }
            }
            if (this.f43977r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.h) {
                    androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) menuItem;
                    hVar.f14482x = (hVar.f14482x & (-5)) | 4;
                } else if (menuItem instanceof MenuItemC5341c) {
                    MenuItemC5341c menuItemC5341c = (MenuItemC5341c) menuItem;
                    try {
                        Method method = menuItemC5341c.f44178e;
                        E0.b bVar = menuItemC5341c.f44177d;
                        if (method == null) {
                            menuItemC5341c.f44178e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemC5341c.f44178e.invoke(bVar, Boolean.TRUE);
                    } catch (Exception e10) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                    }
                }
            }
            String str3 = this.f43983x;
            if (str3 != null) {
                menuItem.setActionView((View) a(str3, f.f43947e, fVar.f43949a));
                z10 = true;
            }
            int i10 = this.f43982w;
            if (i10 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i10);
                }
            }
            AbstractC0771b abstractC0771b = this.f43985z;
            if (abstractC0771b != null) {
                if (menuItem instanceof E0.b) {
                    ((E0.b) menuItem).a(abstractC0771b);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.f43956A;
            boolean z11 = menuItem instanceof E0.b;
            if (z11) {
                ((E0.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0782m.h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.f43957B;
            if (z11) {
                ((E0.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0782m.m(menuItem, charSequence2);
            }
            char c10 = this.f43973n;
            int i11 = this.f43974o;
            if (z11) {
                ((E0.b) menuItem).setAlphabeticShortcut(c10, i11);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0782m.g(menuItem, c10, i11);
            }
            char c11 = this.f43975p;
            int i12 = this.f43976q;
            if (z11) {
                ((E0.b) menuItem).setNumericShortcut(c11, i12);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0782m.k(menuItem, c11, i12);
            }
            PorterDuff.Mode mode = this.f43959D;
            if (mode != null) {
                if (z11) {
                    ((E0.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    C0782m.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.f43958C;
            if (colorStateList != null) {
                if (z11) {
                    ((E0.b) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    C0782m.i(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f43947e = clsArr;
        f43948f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f43951c = context;
        Object[] objArr = {context};
        this.f43949a = objArr;
        this.f43950b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ?? r42;
        int i;
        XmlResourceParser xmlResourceParser2;
        boolean z10;
        ColorStateList colorStateList;
        int resourceId;
        b bVar = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r42 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        while (!z11) {
            if (eventType == r42) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType != 3) {
                    xmlResourceParser2 = xmlResourceParser;
                    z10 = r42;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if (z12 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        z10 = r42;
                        z12 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            bVar.f43962b = 0;
                            bVar.f43963c = 0;
                            bVar.f43964d = 0;
                            bVar.f43965e = 0;
                            bVar.f43966f = r42;
                            bVar.f43967g = r42;
                        } else if (name2.equals("item")) {
                            if (!bVar.f43968h) {
                                AbstractC0771b abstractC0771b = bVar.f43985z;
                                if (abstractC0771b == null || !abstractC0771b.a()) {
                                    bVar.f43968h = r42;
                                    bVar.b(bVar.f43961a.add(bVar.f43962b, bVar.i, bVar.f43969j, bVar.f43970k));
                                } else {
                                    bVar.f43968h = r42;
                                    bVar.b(bVar.f43961a.addSubMenu(bVar.f43962b, bVar.i, bVar.f43969j, bVar.f43970k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlResourceParser2 = xmlResourceParser;
                            z10 = r42;
                            z11 = z10;
                        }
                        xmlResourceParser2 = xmlResourceParser;
                        z10 = r42;
                    }
                }
                eventType = xmlResourceParser2.next();
                r42 = z10;
                i = 2;
                z12 = z12;
            } else {
                if (!z12) {
                    String name3 = xmlResourceParser.getName();
                    boolean zEquals = name3.equals("group");
                    f fVar = f.this;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = fVar.f43951c.obtainStyledAttributes(attributeSet, C4353a.f37890p);
                        bVar.f43962b = typedArrayObtainStyledAttributes.getResourceId(r42, 0);
                        bVar.f43963c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        bVar.f43964d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        bVar.f43965e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        bVar.f43966f = typedArrayObtainStyledAttributes.getBoolean(2, r42);
                        bVar.f43967g = typedArrayObtainStyledAttributes.getBoolean(0, r42);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = fVar.f43951c;
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C4353a.f37891q);
                            bVar.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            bVar.f43969j = (typedArrayObtainStyledAttributes2.getInt(5, bVar.f43963c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, bVar.f43964d) & 65535);
                            bVar.f43970k = typedArrayObtainStyledAttributes2.getText(7);
                            bVar.f43971l = typedArrayObtainStyledAttributes2.getText(8);
                            bVar.f43972m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            bVar.f43973n = string == null ? (char) 0 : string.charAt(0);
                            bVar.f43974o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            bVar.f43975p = string2 == null ? (char) 0 : string2.charAt(0);
                            bVar.f43976q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                bVar.f43977r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                bVar.f43977r = bVar.f43965e;
                            }
                            bVar.f43978s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            bVar.f43979t = typedArrayObtainStyledAttributes2.getBoolean(4, bVar.f43966f);
                            bVar.f43980u = typedArrayObtainStyledAttributes2.getBoolean(1, bVar.f43967g);
                            bVar.f43981v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            bVar.f43984y = typedArrayObtainStyledAttributes2.getString(12);
                            bVar.f43982w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            bVar.f43983x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z13 = string3 != null;
                            if (z13 && bVar.f43982w == 0 && bVar.f43983x == null) {
                                bVar.f43985z = (AbstractC0771b) bVar.a(string3, f43948f, fVar.f43950b);
                            } else {
                                if (z13) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                bVar.f43985z = null;
                            }
                            bVar.f43956A = typedArrayObtainStyledAttributes2.getText(17);
                            bVar.f43957B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                bVar.f43959D = C5375C.c(typedArrayObtainStyledAttributes2.getInt(19, -1), bVar.f43959D);
                            } else {
                                bVar.f43959D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = C5848a.getColorStateList(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                bVar.f43958C = colorStateList;
                            } else {
                                bVar.f43958C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            bVar.f43968h = false;
                            xmlResourceParser2 = xmlResourceParser;
                            z10 = true;
                        } else if (name3.equals("menu")) {
                            z10 = true;
                            bVar.f43968h = true;
                            SubMenu subMenuAddSubMenu = bVar.f43961a.addSubMenu(bVar.f43962b, bVar.i, bVar.f43969j, bVar.f43970k);
                            bVar.b(subMenuAddSubMenu.getItem());
                            xmlResourceParser2 = xmlResourceParser;
                            b(xmlResourceParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlResourceParser2 = xmlResourceParser;
                            z10 = true;
                            str = name3;
                            z12 = true;
                        }
                        eventType = xmlResourceParser2.next();
                        r42 = z10;
                        i = 2;
                        z12 = z12;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z10 = r42;
            }
            eventType = xmlResourceParser2.next();
            r42 = z10;
            i = 2;
            z12 = z12;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof E0.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f43951c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.f) {
                    androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) menu;
                    if (!fVar.f14445p) {
                        fVar.w();
                        z10 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((androidx.appcompat.view.menu.f) menu).v();
                }
                layout.close();
            } catch (IOException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th) {
            if (z10) {
                ((androidx.appcompat.view.menu.f) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
