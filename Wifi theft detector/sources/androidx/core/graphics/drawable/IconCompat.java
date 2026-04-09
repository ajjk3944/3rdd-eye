package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import r0.i;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f2538k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f2539a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2540b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f2541c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f2542d;

    /* renamed from: e, reason: collision with root package name */
    public int f2543e;

    /* renamed from: f, reason: collision with root package name */
    public int f2544f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2545g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2546h;

    /* renamed from: i, reason: collision with root package name */
    public String f2547i;

    /* renamed from: j, reason: collision with root package name */
    public String f2548j;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface IconType {
    }

    public static class a {
        public static IconCompat a(Object obj) {
            i.g(obj);
            int iD = d(obj);
            if (iD == 2) {
                return IconCompat.i(null, c(obj), b(obj));
            }
            if (iD == 4) {
                return IconCompat.g(e(obj));
            }
            if (iD == 6) {
                return IconCompat.d(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f2540b = obj;
            return iconCompat;
        }

        public static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        public static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        public static int d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        @Nullable
        @DoNotInline
        public static Uri e(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        @DoNotInline
        public static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        @DoNotInline
        public static Icon g(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f2539a) {
                case -1:
                    return (Icon) iconCompat.f2540b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f2540b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.l(), iconCompat.f2543e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f2540b, iconCompat.f2543e, iconCompat.f2544f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f2540b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.c((Bitmap) iconCompat.f2540b, false));
                        break;
                    } else {
                        iconCreateWithBitmap = b.b((Bitmap) iconCompat.f2540b);
                        break;
                    }
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.n());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.n());
                        }
                        InputStream inputStreamO = iconCompat.o(context);
                        if (inputStreamO == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.n());
                        }
                        if (i10 < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.c(BitmapFactory.decodeStream(inputStreamO), false));
                            break;
                        } else {
                            iconCreateWithBitmap = b.b(BitmapFactory.decodeStream(inputStreamO));
                            break;
                        }
                    }
            }
            ColorStateList colorStateList = iconCompat.f2545g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f2546h;
            if (mode != IconCompat.f2538k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    public static class b {
        @DoNotInline
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        @DoNotInline
        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public static class c {
        @DoNotInline
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        @DoNotInline
        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        @DoNotInline
        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        @DoNotInline
        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class d {
        @DoNotInline
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public IconCompat() {
        this.f2539a = -1;
        this.f2541c = null;
        this.f2542d = null;
        this.f2543e = 0;
        this.f2544f = 0;
        this.f2545g = null;
        this.f2546h = f2538k;
        this.f2547i = null;
    }

    public static IconCompat a(Icon icon) {
        return a.a(icon);
    }

    public static IconCompat b(Icon icon) {
        if (a.d(icon) == 2 && a.b(icon) == 0) {
            return null;
        }
        return a.a(icon);
    }

    public static Bitmap c(Bitmap bitmap, boolean z10) {
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

    public static IconCompat d(Uri uri) {
        r0.d.c(uri);
        return e(uri.toString());
    }

    public static IconCompat e(String str) {
        r0.d.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f2540b = str;
        return iconCompat;
    }

    public static IconCompat f(Bitmap bitmap) {
        r0.d.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f2540b = bitmap;
        return iconCompat;
    }

    public static IconCompat g(Uri uri) {
        r0.d.c(uri);
        return h(uri.toString());
    }

    public static IconCompat h(String str) {
        r0.d.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f2540b = str;
        return iconCompat;
    }

    public static IconCompat i(Resources resources, String str, int i10) {
        r0.d.c(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f2543e = i10;
        if (resources != null) {
            try {
                iconCompat.f2540b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f2540b = str;
        }
        iconCompat.f2548j = str;
        return iconCompat;
    }

    public static String t(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap j() {
        int i10 = this.f2539a;
        if (i10 == -1) {
            Object obj = this.f2540b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f2540b;
        }
        if (i10 == 5) {
            return c((Bitmap) this.f2540b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int k() {
        int i10 = this.f2539a;
        if (i10 == -1) {
            return a.b(this.f2540b);
        }
        if (i10 == 2) {
            return this.f2543e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String l() {
        int i10 = this.f2539a;
        if (i10 == -1) {
            return a.c(this.f2540b);
        }
        if (i10 == 2) {
            String str = this.f2548j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f2540b).split(":", -1)[0] : this.f2548j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int m() {
        int i10 = this.f2539a;
        return i10 == -1 ? a.d(this.f2540b) : i10;
    }

    public Uri n() {
        int i10 = this.f2539a;
        if (i10 == -1) {
            return a.e(this.f2540b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f2540b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream o(Context context) {
        Uri uriN = n();
        String scheme = uriN.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriN);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriN, e10);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f2540b));
        } catch (FileNotFoundException e11) {
            Log.w("IconCompat", "Unable to load image from path: " + uriN, e11);
            return null;
        }
    }

    public void p() {
        this.f2546h = PorterDuff.Mode.valueOf(this.f2547i);
        switch (this.f2539a) {
            case -1:
                Parcelable parcelable = this.f2542d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f2540b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f2542d;
                if (parcelable2 != null) {
                    this.f2540b = parcelable2;
                    return;
                }
                byte[] bArr = this.f2541c;
                this.f2540b = bArr;
                this.f2539a = 3;
                this.f2543e = 0;
                this.f2544f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2541c, Charset.forName(C.UTF16_NAME));
                this.f2540b = str;
                if (this.f2539a == 2 && this.f2548j == null) {
                    this.f2548j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2540b = this.f2541c;
                return;
        }
    }

    public void q(boolean z10) {
        this.f2547i = this.f2546h.name();
        switch (this.f2539a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f2542d = (Parcelable) this.f2540b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z10) {
                    this.f2542d = (Parcelable) this.f2540b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f2540b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f2541c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f2541c = ((String) this.f2540b).getBytes(Charset.forName(C.UTF16_NAME));
                return;
            case 3:
                this.f2541c = (byte[]) this.f2540b;
                return;
            case 4:
            case 6:
                this.f2541c = this.f2540b.toString().getBytes(Charset.forName(C.UTF16_NAME));
                return;
        }
    }

    public Icon r() {
        return s(null);
    }

    public Icon s(Context context) {
        return a.g(this, context);
    }

    public String toString() {
        if (this.f2539a == -1) {
            return String.valueOf(this.f2540b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(t(this.f2539a));
        switch (this.f2539a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2540b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2540b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2548j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(k())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2543e);
                if (this.f2544f != 0) {
                    sb.append(" off=");
                    sb.append(this.f2544f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2540b);
                break;
        }
        if (this.f2545g != null) {
            sb.append(" tint=");
            sb.append(this.f2545g);
        }
        if (this.f2546h != f2538k) {
            sb.append(" mode=");
            sb.append(this.f2546h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i10) {
        this.f2541c = null;
        this.f2542d = null;
        this.f2543e = 0;
        this.f2544f = 0;
        this.f2545g = null;
        this.f2546h = f2538k;
        this.f2547i = null;
        this.f2539a = i10;
    }
}
