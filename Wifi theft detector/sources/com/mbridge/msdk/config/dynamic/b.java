package com.mbridge.msdk.config.dynamic;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    private static final Class<?>[] f13802d = {Context.class, AttributeSet.class};

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap<String, Constructor<?>> f13803e = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private final Context f13804a;

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.config.dynamic.binddata.wrapper.a f13805b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f13806c = new Object[2];

    public b(Context context, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.f13804a = context;
        this.f13805b = aVar;
    }

    private void b(XmlPullParser xmlPullParser, View view, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        if (!(view instanceof ViewGroup)) {
            throw new InflateException("<include /> can only be used inside of a ViewGroup");
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue(null, TtmlNode.TAG_LAYOUT, 0);
        if (attributeResourceValue == 0) {
            String attributeValue = attributeSet.getAttributeValue(null, TtmlNode.TAG_LAYOUT);
            if (attributeValue == null) {
                throw new InflateException("You must specify a layout in the include tag: <include layout=\"@layout/layoutID\" />");
            }
            throw new InflateException("You must specify a valid layout reference. The layout ID " + attributeValue + " is not valid.");
        }
        try {
            XmlResourceParser layout = this.f13804a.getResources().getLayout(attributeResourceValue);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (layout.next() == 2) {
                    if ("merge".equals(layout.getName())) {
                        a(layout, view, attributeSetAsAttributeSet);
                    }
                    layout.close();
                } else {
                    throw new InflateException(layout.getPositionDescription() + ": No start tag found!");
                }
            } finally {
            }
        } catch (Exception e10) {
            throw new InflateException(e10);
        }
    }

    public View a(String str, ViewGroup viewGroup) {
        return a(str, viewGroup, viewGroup != null);
    }

    public View a(String str, ViewGroup viewGroup, boolean z10) {
        return a(a(str), viewGroup, z10);
    }

    public XmlPullParser a(String str) throws XmlPullParserException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        try {
            xmlPullParserNewPullParser.setInput(new FileInputStream(str), "utf-8");
            return xmlPullParserNewPullParser;
        } catch (Exception e10) {
            q0.b("ComponentLayoutInflate", e10.getMessage(), e10);
            return xmlPullParserNewPullParser;
        }
    }

    private View a(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z10) {
        View view;
        synchronized (this.f13806c) {
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
                this.f13806c[0] = this.f13804a;
                try {
                    if (xmlPullParser.next() == 2) {
                        String name = xmlPullParser.getName();
                        q0.d("ComponentLayoutInflate", "********Creating root view: " + name);
                        if (!"merge".equals(name)) {
                            View viewA = a(name, attributeSetAsAttributeSet, viewGroup);
                            a(xmlPullParser, viewA, attributeSetAsAttributeSet);
                            view = viewA;
                        } else if (viewGroup != null && z10) {
                            a(xmlPullParser, viewGroup, attributeSetAsAttributeSet);
                            view = viewGroup;
                        } else {
                            throw new InflateException("<merge /> can be used only with a valid ViewGroup root and attachToRoot=true");
                        }
                    } else {
                        throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
                    }
                } catch (IOException e10) {
                    throw new InflateException(xmlPullParser.getPositionDescription() + ": " + e10.getMessage(), e10);
                } catch (XmlPullParserException e11) {
                    throw new InflateException(e11.getMessage(), e11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return view;
    }

    private View a(String str, AttributeSet attributeSet, ViewGroup viewGroup) {
        if (str.equals(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        q0.d("ComponentLayoutInflate", "******** Creating view: " + str);
        try {
            View viewA = a(str, -1 == str.indexOf(46) ? "com.mbridge.msdk.config.dynamic.baseview.Component" : null, attributeSet);
            com.mbridge.msdk.config.dynamic.utils.a.a(viewA, attributeSet, viewGroup, this.f13805b);
            return viewA;
        } catch (InflateException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str, e11);
        }
    }

    public final View a(String str, String str2, AttributeSet attributeSet) throws InflateException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        String str3;
        HashMap<String, Constructor<?>> map = f13803e;
        Constructor<?> constructor = map.get(str);
        if (str2 != null) {
            str3 = str2 + str;
        } else {
            str3 = str;
        }
        Class<?> clsLoadClass = null;
        try {
            if (constructor == null) {
                clsLoadClass = this.f13804a.getClassLoader().loadClass(str3);
                constructor = clsLoadClass.getConstructor(f13802d);
                map.put(str, constructor);
            } else {
                clsLoadClass = this.f13804a.getClassLoader().loadClass(str3);
            }
            Object[] objArr = this.f13806c;
            objArr[1] = attributeSet;
            return (View) constructor.newInstance(objArr);
        } catch (ClassNotFoundException e10) {
            throw e10;
        } catch (NoSuchMethodException e11) {
            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str3, e11);
        } catch (Exception e12) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Error inflating class ");
            sb.append(clsLoadClass == null ? "<unknown>" : clsLoadClass.getName());
            throw new InflateException(sb.toString(), e12);
        }
    }

    private void a(XmlPullParser xmlPullParser, View view, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("requestFocus".equals(name)) {
                    view.requestFocus();
                } else if ("include".equals(name)) {
                    if (xmlPullParser.getDepth() != 0) {
                        b(xmlPullParser, view, attributeSet);
                    } else {
                        throw new InflateException("<include /> cannot be the root element");
                    }
                } else if (!"merge".equals(name)) {
                    a(xmlPullParser, a(name, attributeSet, (ViewGroup) view), attributeSet);
                } else {
                    throw new InflateException("<merge /> must be the root element");
                }
            }
        }
    }
}
