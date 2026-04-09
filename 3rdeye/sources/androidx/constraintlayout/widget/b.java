package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* compiled from: ConstraintAttribute.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15295a = false;

    /* renamed from: b, reason: collision with root package name */
    public String f15296b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0232b f15297c;

    /* renamed from: d, reason: collision with root package name */
    public int f15298d;

    /* renamed from: e, reason: collision with root package name */
    public float f15299e;

    /* renamed from: f, reason: collision with root package name */
    public String f15300f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15301g;

    /* renamed from: h, reason: collision with root package name */
    public int f15302h;

    /* compiled from: ConstraintAttribute.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15303a;

        static {
            int[] iArr = new int[EnumC0232b.values().length];
            f15303a = iArr;
            try {
                iArr[EnumC0232b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15303a[EnumC0232b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15303a[EnumC0232b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15303a[EnumC0232b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15303a[EnumC0232b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15303a[EnumC0232b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15303a[EnumC0232b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15303a[EnumC0232b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: ConstraintAttribute.java */
    /* renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    public enum EnumC0232b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public b(b bVar, Object obj) {
        this.f15296b = bVar.f15296b;
        this.f15297c = bVar.f15297c;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        EnumC0232b enumC0232b;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), u0.d.f46502e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        EnumC0232b enumC0232b2 = null;
        boolean z10 = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0232b2 = EnumC0232b.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    enumC0232b = EnumC0232b.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    enumC0232b = EnumC0232b.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    enumC0232b = EnumC0232b.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    enumC0232b = EnumC0232b.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    enumC0232b = EnumC0232b.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    enumC0232b = EnumC0232b.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == 9) {
                    enumC0232b = EnumC0232b.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 8) {
                    enumC0232b = EnumC0232b.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                enumC0232b2 = enumC0232b;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            b bVar = new b();
            bVar.f15296b = string;
            bVar.f15297c = enumC0232b2;
            bVar.f15295a = z10;
            bVar.b(objValueOf2);
            map.put(string, bVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (a.f15303a[this.f15297c.ordinal()]) {
            case 1:
            case 6:
                this.f15298d = ((Integer) obj).intValue();
                break;
            case 2:
                this.f15301g = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f15300f = (String) obj;
                break;
            case 4:
            case 5:
                this.f15302h = ((Integer) obj).intValue();
                break;
            case 7:
                this.f15299e = ((Float) obj).floatValue();
                break;
            case 8:
                this.f15299e = ((Float) obj).floatValue();
                break;
        }
    }
}
