package a0;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.appcompat.app.z;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static HashMap f13b;

    /* renamed from: a, reason: collision with root package name */
    public HashMap f14a = new HashMap();

    static {
        HashMap map = new HashMap();
        f13b = map;
        try {
            map.put("KeyAttribute", d.class.getConstructor(null));
            f13b.put("KeyPosition", g.class.getConstructor(null));
            f13b.put("KeyCycle", e.class.getConstructor(null));
            f13b.put("KeyTimeCycle", i.class.getConstructor(null));
            f13b.put("KeyTrigger", j.class.getConstructor(null));
        } catch (NoSuchMethodException e10) {
            Log.e("KeyFrames", "unable to load", e10);
        }
    }

    public f() {
    }

    public void a(l lVar) {
        ArrayList arrayList = (ArrayList) this.f14a.get(-1);
        if (arrayList != null) {
            lVar.a(arrayList);
        }
    }

    public void b(l lVar) {
        ArrayList arrayList = (ArrayList) this.f14a.get(Integer.valueOf(lVar.f43c));
        if (arrayList != null) {
            lVar.a(arrayList);
        }
        ArrayList arrayList2 = (ArrayList) this.f14a.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                z.a(it.next());
                String str = ((ConstraintLayout.b) lVar.f42b.getLayoutParams()).f2122b0;
                throw null;
            }
        }
    }

    public ArrayList c(int i10) {
        return (ArrayList) this.f14a.get(Integer.valueOf(i10));
    }

    public f(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    if (f13b.containsKey(name)) {
                        try {
                            Constructor constructor = (Constructor) f13b.get(name);
                            if (constructor != null) {
                                z.a(constructor.newInstance(null));
                                Xml.asAttributeSet(xmlPullParser);
                                throw null;
                            }
                            throw new NullPointerException("Keymaker for " + name + " not found");
                        } catch (Exception e10) {
                            Log.e("KeyFrames", "unable to create ", e10);
                        }
                    } else if (!name.equalsIgnoreCase("CustomAttribute")) {
                        name.equalsIgnoreCase("CustomMethod");
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }
}
