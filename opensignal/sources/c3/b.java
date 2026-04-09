package c3;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3136a = false;

    /* renamed from: b, reason: collision with root package name */
    public a f3137b;

    /* renamed from: c, reason: collision with root package name */
    public int f3138c;

    /* renamed from: d, reason: collision with root package name */
    public float f3139d;

    /* renamed from: e, reason: collision with root package name */
    public String f3140e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3141f;

    /* renamed from: g, reason: collision with root package name */
    public int f3142g;

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.f3137b = bVar.f3137b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        a aVar;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.CustomAttribute);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        a aVar2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == s.CustomAttribute_attributeName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == s.CustomAttribute_methodName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == s.CustomAttribute_customBoolean) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                aVar2 = a.BOOLEAN_TYPE;
            } else {
                if (index == s.CustomAttribute_customColorValue) {
                    aVar = a.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == s.CustomAttribute_customColorDrawableValue) {
                    aVar = a.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == s.CustomAttribute_customPixelDimension) {
                    aVar = a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == s.CustomAttribute_customDimension) {
                    aVar = a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == s.CustomAttribute_customFloatValue) {
                    aVar = a.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == s.CustomAttribute_customIntegerValue) {
                    aVar = a.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == s.CustomAttribute_customStringValue) {
                    aVar = a.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == s.CustomAttribute_customReference) {
                    aVar = a.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                aVar2 = aVar;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            b bVar = new b();
            bVar.f3137b = aVar2;
            bVar.f3136a = z10;
            bVar.b(objValueOf2);
            map.put(string, bVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (this.f3137b.ordinal()) {
            case 0:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f3138c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f3139d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f3142g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f3140e = (String) obj;
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                this.f3141f = ((Boolean) obj).booleanValue();
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f3139d = ((Float) obj).floatValue();
                break;
        }
    }
}
