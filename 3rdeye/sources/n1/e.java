package n1;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import androidx.preference.c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PreferenceInflater.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f44209e = {Context.class, AttributeSet.class};

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap<String, Constructor<?>> f44210f = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public final Context f44211a;

    /* renamed from: c, reason: collision with root package name */
    public final f f44213c;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f44212b = new Object[2];

    /* renamed from: d, reason: collision with root package name */
    public final String[] f44214d = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public e(Context context, f fVar) {
        this.f44211a = context;
        this.f44213c = fVar;
    }

    public final Preference a(String str, String[] strArr, AttributeSet attributeSet) throws InflateException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        HashMap<String, Constructor<?>> map = f44210f;
        Constructor<?> constructor = map.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f44211a.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e4 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e10) {
                                e4 = e10;
                            }
                        }
                        if (cls == null) {
                            if (e4 != null) {
                                throw e4;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(f44209e);
                    constructor.setAccessible(true);
                    map.put(str, constructor);
                } catch (ClassNotFoundException e11) {
                    throw e11;
                }
            } catch (Exception e12) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e12);
                throw inflateException;
            }
        }
        Object[] objArr = this.f44212b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? a(str, this.f44214d, attributeSet) : a(str, null, attributeSet);
        } catch (InflateException e4) {
            throw e4;
        } catch (ClassNotFoundException e10) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e10);
            throw inflateException;
        } catch (Exception e11) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e11);
            throw inflateException2;
        }
    }

    public final PreferenceGroup c(XmlResourceParser xmlResourceParser) {
        int next;
        PreferenceGroup preferenceGroup;
        synchronized (this.f44212b) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.f44212b[0] = this.f44211a;
            do {
                try {
                    try {
                        next = xmlResourceParser.next();
                        if (next == 2) {
                            break;
                        }
                    } catch (IOException e4) {
                        InflateException inflateException = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e4.getMessage());
                        inflateException.initCause(e4);
                        throw inflateException;
                    } catch (XmlPullParserException e10) {
                        InflateException inflateException2 = new InflateException(e10.getMessage());
                        inflateException2.initCause(e10);
                        throw inflateException2;
                    }
                } catch (InflateException e11) {
                    throw e11;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
            preferenceGroup = (PreferenceGroup) b(xmlResourceParser.getName(), attributeSetAsAttributeSet);
            preferenceGroup.k(this.f44213c);
            d(xmlResourceParser, preferenceGroup, attributeSetAsAttributeSet);
        }
        return preferenceGroup;
    }

    public final void d(XmlResourceParser xmlResourceParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        long jB;
        int depth = xmlResourceParser.getDepth();
        while (true) {
            int next = xmlResourceParser.next();
            if ((next == 3 && xmlResourceParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.f16258m = Intent.parseIntent(this.f44211a.getResources(), xmlResourceParser, attributeSet);
                    } catch (IOException e4) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e4);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    Resources resources = this.f44211a.getResources();
                    if (preference.f16260o == null) {
                        preference.f16260o = new Bundle();
                    }
                    resources.parseBundleExtra("extra", attributeSet, preference.f16260o);
                    try {
                        int depth2 = xmlResourceParser.getDepth();
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlResourceParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e10) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e10);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceB = b(name, attributeSet);
                    PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                    if (!preferenceGroup.f16275O.contains(preferenceB)) {
                        if (preferenceB.f16257l != null) {
                            PreferenceGroup preferenceGroup2 = preferenceGroup;
                            while (true) {
                                PreferenceGroup preferenceGroup3 = preferenceGroup2.f16243I;
                                if (preferenceGroup3 == null) {
                                    break;
                                } else {
                                    preferenceGroup2 = preferenceGroup3;
                                }
                            }
                            String str = preferenceB.f16257l;
                            if (preferenceGroup2.A(str) != null) {
                                Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                            }
                        }
                        int i = preferenceB.f16253g;
                        if (i == Integer.MAX_VALUE) {
                            if (preferenceGroup.f16276P) {
                                int i10 = preferenceGroup.f16277Q;
                                preferenceGroup.f16277Q = i10 + 1;
                                if (i10 != i) {
                                    preferenceB.f16253g = i10;
                                    androidx.preference.c cVar = preferenceB.f16241G;
                                    if (cVar != null) {
                                        Handler handler = cVar.f16337n;
                                        c.a aVar = cVar.f16338o;
                                        handler.removeCallbacks(aVar);
                                        handler.post(aVar);
                                    }
                                }
                            }
                            if (preferenceB instanceof PreferenceGroup) {
                                ((PreferenceGroup) preferenceB).f16276P = preferenceGroup.f16276P;
                            }
                        }
                        int iBinarySearch = Collections.binarySearch(preferenceGroup.f16275O, preferenceB);
                        if (iBinarySearch < 0) {
                            iBinarySearch = (iBinarySearch * (-1)) - 1;
                        }
                        boolean zY = preferenceGroup.y();
                        if (preferenceB.f16267v == zY) {
                            preferenceB.f16267v = !zY;
                            preferenceB.i(preferenceB.y());
                            preferenceB.h();
                        }
                        synchronized (preferenceGroup) {
                            preferenceGroup.f16275O.add(iBinarySearch, preferenceB);
                        }
                        f fVar = preferenceGroup.f16249c;
                        String str2 = preferenceB.f16257l;
                        if (str2 == null || !preferenceGroup.f16274N.containsKey(str2)) {
                            jB = fVar.b();
                        } else {
                            jB = preferenceGroup.f16274N.get(str2).longValue();
                            preferenceGroup.f16274N.remove(str2);
                        }
                        preferenceB.f16250d = jB;
                        preferenceB.f16251e = true;
                        try {
                            preferenceB.k(fVar);
                            preferenceB.f16251e = false;
                            if (preferenceB.f16243I != null) {
                                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                            }
                            preferenceB.f16243I = preferenceGroup;
                            if (preferenceGroup.f16278R) {
                                preferenceB.j();
                            }
                            androidx.preference.c cVar2 = preferenceGroup.f16241G;
                            if (cVar2 != null) {
                                Handler handler2 = cVar2.f16337n;
                                c.a aVar2 = cVar2.f16338o;
                                handler2.removeCallbacks(aVar2);
                                handler2.post(aVar2);
                            }
                        } catch (Throwable th) {
                            preferenceB.f16251e = false;
                            throw th;
                        }
                    }
                    d(xmlResourceParser, preferenceB, attributeSet);
                }
            }
        }
    }
}
