package n;

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
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.internal.Buffer;
import java.io.IOException;
import o.p;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p.i1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f29481e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f29482f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f29483a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f29484b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f29485c;

    /* renamed from: d, reason: collision with root package name */
    public Object f29486d;

    static {
        Class[] clsArr = {Context.class};
        f29481e = clsArr;
        f29482f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f29485c = context;
        Object[] objArr = {context};
        this.f29483a = objArr;
        this.f29484b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i4;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i4 = 2;
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
        boolean z3 = false;
        boolean z10 = false;
        String str = null;
        while (!z3) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i4) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z3 = z3;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z10 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z10 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            gVar.f29458b = 0;
                            gVar.f29459c = 0;
                            gVar.f29460d = 0;
                            gVar.f29461e = 0;
                            gVar.f29462f = true;
                            gVar.g = true;
                        } else if (name2.equals("item")) {
                            if (!gVar.f29463h) {
                                p pVar = gVar.f29480z;
                                if (pVar == null || !pVar.f30289c.hasSubMenu()) {
                                    gVar.f29463h = true;
                                    gVar.b(gVar.f29457a.add(gVar.f29458b, gVar.f29464i, gVar.j, gVar.f29465k));
                                } else {
                                    gVar.f29463h = true;
                                    gVar.b(gVar.f29457a.addSubMenu(gVar.f29458b, gVar.f29464i, gVar.j, gVar.f29465k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z3 = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z3 = z3;
                    }
                }
                eventType = xmlPullParser2.next();
                i4 = 2;
                z3 = z3;
                z10 = z10;
            } else {
                if (!z10) {
                    String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    Context context = this.f29485c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f24789p);
                        gVar.f29458b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        gVar.f29459c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        gVar.f29460d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        gVar.f29461e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        gVar.f29462f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        gVar.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h.a.f24790q);
                            gVar.f29464i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            gVar.j = (typedArrayObtainStyledAttributes2.getInt(5, gVar.f29459c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, gVar.f29460d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                            gVar.f29465k = typedArrayObtainStyledAttributes2.getText(7);
                            gVar.f29466l = typedArrayObtainStyledAttributes2.getText(8);
                            gVar.f29467m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            gVar.f29468n = string == null ? (char) 0 : string.charAt(0);
                            gVar.f29469o = typedArrayObtainStyledAttributes2.getInt(16, Buffer.SEGMENTING_THRESHOLD);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            gVar.f29470p = string2 == null ? (char) 0 : string2.charAt(0);
                            gVar.f29471q = typedArrayObtainStyledAttributes2.getInt(20, Buffer.SEGMENTING_THRESHOLD);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                gVar.f29472r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.f29472r = gVar.f29461e;
                            }
                            gVar.f29473s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            gVar.f29474t = typedArrayObtainStyledAttributes2.getBoolean(4, gVar.f29462f);
                            gVar.f29475u = typedArrayObtainStyledAttributes2.getBoolean(1, gVar.g);
                            gVar.f29476v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            gVar.f29479y = typedArrayObtainStyledAttributes2.getString(12);
                            gVar.f29477w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            gVar.f29478x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z11 = string3 != null;
                            if (z11 && gVar.f29477w == 0 && gVar.f29478x == null) {
                                gVar.f29480z = (p) gVar.a(string3, f29482f, this.f29484b);
                            } else {
                                if (z11) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                gVar.f29480z = null;
                            }
                            gVar.A = typedArrayObtainStyledAttributes2.getText(17);
                            gVar.B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                gVar.D = i1.c(typedArrayObtainStyledAttributes2.getInt(19, -1), gVar.D);
                            } else {
                                gVar.D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = wd.b.r(resourceId, context)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                gVar.C = colorStateList;
                            } else {
                                gVar.C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            gVar.f29463h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            gVar.f29463h = true;
                            SubMenu subMenuAddSubMenu = gVar.f29457a.addSubMenu(gVar.f29458b, gVar.f29464i, gVar.j, gVar.f29465k);
                            gVar.b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z10 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i4 = 2;
                        z3 = z3;
                        z10 = z10;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z3 = z3;
            }
            eventType = xmlPullParser2.next();
            i4 = 2;
            z3 = z3;
            z10 = z10;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i4, Menu menu) {
        if (!(menu instanceof o.m)) {
            super.inflate(i4, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z3 = false;
        try {
            try {
                layout = this.f29485c.getResources().getLayout(i4);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof o.m) {
                    o.m mVar = (o.m) menu;
                    if (!mVar.f30251p) {
                        mVar.w();
                        z3 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z3) {
                    ((o.m) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th2) {
            if (z3) {
                ((o.m) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
