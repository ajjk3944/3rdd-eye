package m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import g.AbstractC2327a;
import java.io.IOException;
import n.MenuC2677k;
import n.n;
import o.AbstractC2720j0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f21914e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f21915f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f21916a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f21917b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f21918c;

    /* renamed from: d, reason: collision with root package name */
    public Object f21919d;

    static {
        Class[] clsArr = {Context.class};
        f21914e = clsArr;
        f21915f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f21918c = context;
        Object[] objArr = {context};
        this.f21916a = objArr;
        this.f21917b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
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
        boolean z6 = false;
        boolean z7 = false;
        String str = null;
        while (!z6) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z6 = z6;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z7 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z7 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            gVar.f21890b = 0;
                            gVar.f21891c = 0;
                            gVar.f21892d = 0;
                            gVar.f21893e = 0;
                            gVar.f21894f = true;
                            gVar.f21895g = true;
                        } else if (name2.equals("item")) {
                            if (!gVar.f21896h) {
                                n nVar = gVar.f21913z;
                                if (nVar == null || !nVar.f22121c.hasSubMenu()) {
                                    gVar.f21896h = true;
                                    gVar.b(gVar.f21889a.add(gVar.f21890b, gVar.i, gVar.f21897j, gVar.f21898k));
                                } else {
                                    gVar.f21896h = true;
                                    gVar.b(gVar.f21889a.addSubMenu(gVar.f21890b, gVar.i, gVar.f21897j, gVar.f21898k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z6 = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z6 = z6;
                    }
                }
                eventType = xmlPullParser2.next();
                i = 2;
                z6 = z6;
                z7 = z7;
            } else {
                if (!z7) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray typedArrayObtainStyledAttributes = this.f21918c.obtainStyledAttributes(attributeSet, AbstractC2327a.f20129q);
                        gVar.f21890b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        gVar.f21891c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        gVar.f21892d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        gVar.f21893e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        gVar.f21894f = typedArrayObtainStyledAttributes.getBoolean(i, true);
                        gVar.f21895g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            int[] iArr = AbstractC2327a.f20130r;
                            Context context = this.f21918c;
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
                            gVar.i = typedArrayObtainStyledAttributes2.getResourceId(i, 0);
                            gVar.f21897j = (typedArrayObtainStyledAttributes2.getInt(6, gVar.f21892d) & 65535) | (typedArrayObtainStyledAttributes2.getInt(5, gVar.f21891c) & (-65536));
                            gVar.f21898k = typedArrayObtainStyledAttributes2.getText(7);
                            gVar.f21899l = typedArrayObtainStyledAttributes2.getText(8);
                            gVar.f21900m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            gVar.f21901n = string == null ? (char) 0 : string.charAt(0);
                            gVar.f21902o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            gVar.f21903p = string2 == null ? (char) 0 : string2.charAt(0);
                            gVar.f21904q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                gVar.f21905r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.f21905r = gVar.f21893e;
                            }
                            gVar.f21906s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            gVar.f21907t = typedArrayObtainStyledAttributes2.getBoolean(4, gVar.f21894f);
                            gVar.f21908u = typedArrayObtainStyledAttributes2.getBoolean(1, gVar.f21895g);
                            gVar.f21909v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            gVar.f21912y = typedArrayObtainStyledAttributes2.getString(12);
                            gVar.f21910w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            gVar.f21911x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z8 = string3 != null;
                            if (z8 && gVar.f21910w == 0 && gVar.f21911x == null) {
                                gVar.f21913z = (n) gVar.a(string3, f21915f, this.f21917b);
                            } else {
                                if (z8) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                gVar.f21913z = null;
                            }
                            gVar.f21884A = typedArrayObtainStyledAttributes2.getText(17);
                            gVar.f21885B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                gVar.f21887D = AbstractC2720j0.c(typedArrayObtainStyledAttributes2.getInt(19, -1), gVar.f21887D);
                            } else {
                                gVar.f21887D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = G.c.b(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                gVar.f21886C = colorStateList;
                            } else {
                                gVar.f21886C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            gVar.f21896h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            gVar.f21896h = true;
                            SubMenu subMenuAddSubMenu = gVar.f21889a.addSubMenu(gVar.f21890b, gVar.i, gVar.f21897j, gVar.f21898k);
                            gVar.b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z7 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z6 = z6;
                        z7 = z7;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z6 = z6;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z6 = z6;
            z7 = z7;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC2677k)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z6 = false;
        try {
            try {
                layout = this.f21918c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC2677k) {
                    MenuC2677k menuC2677k = (MenuC2677k) menu;
                    if (!menuC2677k.f22067D) {
                        menuC2677k.y();
                        z6 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z6) {
                    ((MenuC2677k) menu).x();
                }
                layout.close();
            } catch (IOException e6) {
                throw new InflateException("Error inflating menu XML", e6);
            } catch (XmlPullParserException e7) {
                throw new InflateException("Error inflating menu XML", e7);
            }
        } catch (Throwable th) {
            if (z6) {
                ((MenuC2677k) menu).x();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
