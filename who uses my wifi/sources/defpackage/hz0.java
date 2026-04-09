package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hz0 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public hz0(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        gz0 gz0Var = new gz0(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z = z;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            gz0Var.b = 0;
                            gz0Var.c = 0;
                            gz0Var.d = 0;
                            gz0Var.e = 0;
                            gz0Var.f = true;
                            gz0Var.g = true;
                        } else if (name2.equals("item")) {
                            if (!gz0Var.h) {
                                td0 td0Var = gz0Var.z;
                                if (td0Var == null || !td0Var.b.hasSubMenu()) {
                                    gz0Var.h = true;
                                    gz0Var.b(gz0Var.a.add(gz0Var.b, gz0Var.i, gz0Var.j, gz0Var.k));
                                } else {
                                    gz0Var.h = true;
                                    gz0Var.b(gz0Var.a.addSubMenu(gz0Var.b, gz0Var.i, gz0Var.j, gz0Var.k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z = z;
                    }
                }
                eventType = xmlPullParser2.next();
                i = 2;
                z = z;
                z2 = z2;
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hn0.p);
                        gz0Var.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        gz0Var.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        gz0Var.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        gz0Var.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        gz0Var.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        gz0Var.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, hn0.q);
                            gz0Var.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            gz0Var.j = (typedArrayObtainStyledAttributes2.getInt(5, gz0Var.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, gz0Var.d) & 65535);
                            gz0Var.k = typedArrayObtainStyledAttributes2.getText(7);
                            gz0Var.l = typedArrayObtainStyledAttributes2.getText(8);
                            gz0Var.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            gz0Var.n = string == null ? (char) 0 : string.charAt(0);
                            gz0Var.o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            gz0Var.p = string2 == null ? (char) 0 : string2.charAt(0);
                            gz0Var.q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                gz0Var.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gz0Var.r = gz0Var.e;
                            }
                            gz0Var.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            gz0Var.t = typedArrayObtainStyledAttributes2.getBoolean(4, gz0Var.f);
                            gz0Var.u = typedArrayObtainStyledAttributes2.getBoolean(1, gz0Var.g);
                            gz0Var.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            gz0Var.y = typedArrayObtainStyledAttributes2.getString(12);
                            gz0Var.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            gz0Var.x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            if (string3 != null && gz0Var.w == 0 && gz0Var.x == null) {
                                gz0Var.z = (td0) gz0Var.a(string3, f, this.b);
                            } else {
                                gz0Var.z = null;
                            }
                            gz0Var.A = typedArrayObtainStyledAttributes2.getText(17);
                            gz0Var.B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                gz0Var.D = yp.c(typedArrayObtainStyledAttributes2.getInt(19, -1), gz0Var.D);
                            } else {
                                gz0Var.D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = ob1.d(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                gz0Var.C = colorStateList;
                            } else {
                                gz0Var.C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            gz0Var.h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            gz0Var.h = true;
                            SubMenu subMenuAddSubMenu = gz0Var.a.addSubMenu(gz0Var.b, gz0Var.i, gz0Var.j, gz0Var.k);
                            gz0Var.b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof od0)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof od0) {
                    od0 od0Var = (od0) menu;
                    if (!od0Var.p) {
                        od0Var.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((od0) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((od0) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
