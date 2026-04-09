package B0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: TypedArrayUtils.java */
/* loaded from: classes.dex */
public final class i {
    public static int a(Context context, int i, int i10) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i10;
    }

    public static d b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        d dVarA;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i10 = typedValue.type;
            if (i10 >= 28 && i10 <= 31) {
                return new d(null, null, typedValue.data);
            }
            try {
                dVarA = d.a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e4) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e4);
                dVarA = null;
            }
            if (dVarA != null) {
                return dVarA;
            }
        }
        return new d(null, null, 0);
    }

    public static String c(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i) {
        if (d(xmlResourceParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray e(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
