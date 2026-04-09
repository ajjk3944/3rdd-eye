package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class b20 {
    public static Uri a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d20.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    public static Drawable b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    public static Icon c(IconCompat iconCompat, Context context) throws FileNotFoundException {
        Icon iconCreateWithBitmap;
        int i = iconCompat.a;
        String strB = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream = null;
        strB = null;
        strB = null;
        switch (i) {
            case -1:
                return (Icon) iconCompat.b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.b);
                break;
            case 2:
                if (i == -1) {
                    int i2 = Build.VERSION.SDK_INT;
                    Object obj = iconCompat.b;
                    if (i2 >= 28) {
                        strB = d20.b(obj);
                    } else {
                        try {
                            strB = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e) {
                            Log.e("IconCompat", "Unable to get icon package", e);
                        } catch (NoSuchMethodException e2) {
                            Log.e("IconCompat", "Unable to get icon package", e2);
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon package", e3);
                        }
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    String str = iconCompat.j;
                    strB = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.b).split(":", -1)[0] : iconCompat.j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strB, iconCompat.e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.b, iconCompat.e, iconCompat.f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.b);
                break;
            case 5:
                iconCreateWithBitmap = c20.b((Bitmap) iconCompat.b);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = e20.a(iconCompat.d());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.d());
                    }
                    Uri uriD = iconCompat.d();
                    String scheme = uriD.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriD);
                        } catch (Exception unused) {
                            uriD.toString();
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.b));
                        } catch (FileNotFoundException unused2) {
                            uriD.toString();
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.d());
                    }
                    iconCreateWithBitmap = c20.b(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    break;
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.h;
        if (mode != IconCompat.k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }
}
