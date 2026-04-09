package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import g4.j;
import i3.a;
import io.sentry.android.core.e0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import xu.d;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f1222a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1223b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f1224c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f1225d;

    /* renamed from: e, reason: collision with root package name */
    public int f1226e;

    /* renamed from: f, reason: collision with root package name */
    public int f1227f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1228g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1229h;

    /* renamed from: i, reason: collision with root package name */
    public String f1230i;
    public String j;

    public IconCompat() {
        this.f1222a = -1;
        this.f1224c = null;
        this.f1225d = null;
        this.f1226e = 0;
        this.f1227f = 0;
        this.f1228g = null;
        this.f1229h = k;
        this.f1230i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i10) {
        str.getClass();
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f1226e = i10;
        if (resources != null) {
            try {
                iconCompat.f1223b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f1223b = str;
        }
        iconCompat.j = str;
        return iconCompat;
    }

    public final int c() {
        int i10 = this.f1222a;
        if (i10 != -1) {
            if (i10 == 2) {
                return this.f1226e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f1223b;
        if (i11 >= 28) {
            return a.e(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e4) {
            e0.c("IconCompat", "Unable to get icon resource", e4);
            return 0;
        } catch (NoSuchMethodException e10) {
            e0.c("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (InvocationTargetException e11) {
            e0.c("IconCompat", "Unable to get icon resource", e11);
            return 0;
        }
    }

    public final int d() {
        int i10 = this.f1222a;
        if (i10 != -1) {
            return i10;
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f1223b;
        if (i11 >= 28) {
            return a.m(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e4) {
            e0.c("IconCompat", "Unable to get icon type " + obj, e4);
            return -1;
        } catch (NoSuchMethodException e10) {
            e0.c("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        } catch (InvocationTargetException e11) {
            e0.c("IconCompat", "Unable to get icon type " + obj, e11);
            return -1;
        }
    }

    public final Uri e() {
        int i10 = this.f1222a;
        if (i10 != -1) {
            if (i10 == 4 || i10 == 6) {
                return Uri.parse((String) this.f1223b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f1223b;
        if (i11 >= 28) {
            return a.n(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e4) {
            e0.c("IconCompat", "Unable to get icon uri", e4);
            return null;
        } catch (NoSuchMethodException e10) {
            e0.c("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (InvocationTargetException e11) {
            e0.c("IconCompat", "Unable to get icon uri", e11);
            return null;
        }
    }

    public final InputStream f(Context context) {
        Uri uriE = e();
        String scheme = uriE.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriE);
            } catch (Exception e4) {
                e0.q("IconCompat", "Unable to load image from URI: " + uriE, e4);
                return null;
            }
        }
        try {
            File file = new File((String) this.f1223b);
            return d.j(file, new FileInputStream(file));
        } catch (FileNotFoundException e10) {
            e0.q("IconCompat", "Unable to load image from path: " + uriE, e10);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Icon g(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.g(android.content.Context):android.graphics.drawable.Icon");
    }

    public final String toString() {
        String str;
        if (this.f1222a == -1) {
            return String.valueOf(this.f1223b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f1222a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f1222a) {
            case 1:
            case j.STRING_FIELD_NUMBER /* 5 */:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f1223b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f1223b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1226e);
                if (this.f1227f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f1227f);
                    break;
                }
                break;
            case 4:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                sb2.append(" uri=");
                sb2.append(this.f1223b);
                break;
        }
        if (this.f1228g != null) {
            sb2.append(" tint=");
            sb2.append(this.f1228g);
        }
        if (this.f1229h != k) {
            sb2.append(" mode=");
            sb2.append(this.f1229h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.f1224c = null;
        this.f1225d = null;
        this.f1226e = 0;
        this.f1227f = 0;
        this.f1228g = null;
        this.f1229h = k;
        this.f1230i = null;
        this.f1222a = i10;
    }
}
