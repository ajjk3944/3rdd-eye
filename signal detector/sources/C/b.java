package C;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f802a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f803b;

    /* renamed from: c, reason: collision with root package name */
    public int f804c;

    /* renamed from: d, reason: collision with root package name */
    public float f805d;

    /* renamed from: e, reason: collision with root package name */
    public String f806e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f807f;

    /* renamed from: g, reason: collision with root package name */
    public int f808g;

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.f803b = bVar.f803b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f1015d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i = 0;
        boolean z6 = false;
        Object objValueOf = null;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i3);
            int i6 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z6 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i7 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i7 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i7 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i6 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i6;
                            }
                        }
                        i = 7;
                    }
                }
                i = i7;
            }
        }
        if (string != null && objValueOf != null) {
            b bVar = new b();
            bVar.f803b = i;
            bVar.f802a = z6;
            bVar.b(objValueOf);
            map.put(string, bVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (AbstractC2984e.c(this.f803b)) {
            case 0:
            case 7:
                this.f804c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f805d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f808g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f806e = (String) obj;
                break;
            case 5:
                this.f807f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f805d = ((Float) obj).floatValue();
                break;
        }
    }
}
