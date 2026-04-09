package androidx.core.graphics.drawable;

import K.a;
import K.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f5091k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f5092a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5093b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f5094c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f5095d;

    /* renamed from: e, reason: collision with root package name */
    public int f5096e;

    /* renamed from: f, reason: collision with root package name */
    public int f5097f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f5098g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f5099h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f5100j;

    public IconCompat() {
        this.f5092a = -1;
        this.f5094c = null;
        this.f5095d = null;
        this.f5096e = 0;
        this.f5097f = 0;
        this.f5098g = null;
        this.f5099h = f5091k;
        this.i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z6) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f2 = iMin;
        float f5 = 0.5f * f2;
        float f6 = 0.9166667f * f5;
        if (z6) {
            float f7 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f7, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.setShadowLayer(f7, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f5, f5, f6, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f5096e = i;
        iconCompat.f5093b = "";
        iconCompat.f5100j = "";
        return iconCompat;
    }

    public final int c() {
        int i = this.f5092a;
        if (i != -1) {
            if (i == 2) {
                return this.f5096e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i3 = Build.VERSION.SDK_INT;
        Object obj = this.f5093b;
        if (i3 >= 28) {
            return a.d(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e6) {
            Log.e("IconCompat", "Unable to get icon resource", e6);
            return 0;
        } catch (NoSuchMethodException e7) {
            Log.e("IconCompat", "Unable to get icon resource", e7);
            return 0;
        } catch (InvocationTargetException e8) {
            Log.e("IconCompat", "Unable to get icon resource", e8);
            return 0;
        }
    }

    public final int d() {
        int i = this.f5092a;
        if (i != -1) {
            return i;
        }
        int i3 = Build.VERSION.SDK_INT;
        Object obj = this.f5093b;
        if (i3 >= 28) {
            return a.l(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e6) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e6);
            return -1;
        } catch (NoSuchMethodException e7) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e7);
            return -1;
        } catch (InvocationTargetException e8) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e8);
            return -1;
        }
    }

    public final Uri e() {
        int i = this.f5092a;
        if (i != -1) {
            if (i == 4 || i == 6) {
                return Uri.parse((String) this.f5093b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i3 = Build.VERSION.SDK_INT;
        Object obj = this.f5093b;
        if (i3 >= 28) {
            return a.m(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e6) {
            Log.e("IconCompat", "Unable to get icon uri", e6);
            return null;
        } catch (NoSuchMethodException e7) {
            Log.e("IconCompat", "Unable to get icon uri", e7);
            return null;
        } catch (InvocationTargetException e8) {
            Log.e("IconCompat", "Unable to get icon uri", e8);
            return null;
        }
    }

    public final Icon f(Context context) throws FileNotFoundException {
        Icon iconCreateWithBitmap;
        int i = Build.VERSION.SDK_INT;
        int i3 = this.f5092a;
        String strE = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream = null;
        strE = null;
        strE = null;
        switch (i3) {
            case -1:
                return (Icon) this.f5093b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f5093b);
                break;
            case 2:
                if (i3 == -1) {
                    Object obj = this.f5093b;
                    if (i >= 28) {
                        strE = a.e(obj);
                    } else {
                        try {
                            strE = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e6) {
                            Log.e("IconCompat", "Unable to get icon package", e6);
                        } catch (NoSuchMethodException e7) {
                            Log.e("IconCompat", "Unable to get icon package", e7);
                        } catch (InvocationTargetException e8) {
                            Log.e("IconCompat", "Unable to get icon package", e8);
                        }
                    }
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str = this.f5100j;
                    strE = (str == null || TextUtils.isEmpty(str)) ? ((String) this.f5093b).split(":", -1)[0] : this.f5100j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strE, this.f5096e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f5093b, this.f5096e, this.f5097f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f5093b);
                break;
            case 5:
                if (i < 26) {
                    iconCreateWithBitmap = Icon.createWithBitmap(a((Bitmap) this.f5093b, false));
                    break;
                } else {
                    iconCreateWithBitmap = H.a.a((Bitmap) this.f5093b);
                    break;
                }
            case 6:
                if (i >= 30) {
                    iconCreateWithBitmap = b.a(e());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + e());
                    }
                    Uri uriE = e();
                    String scheme = uriE.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriE);
                        } catch (Exception e9) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriE, e9);
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) this.f5093b));
                        } catch (FileNotFoundException e10) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriE, e10);
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + e());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(a(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                        break;
                    } else {
                        iconCreateWithBitmap = H.a.a(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                        break;
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.f5098g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f5099h;
        if (mode != f5091k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f5092a == -1) {
            return String.valueOf(this.f5093b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f5092a) {
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
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f5092a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f5093b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f5093b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f5100j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f5096e);
                if (this.f5097f != 0) {
                    sb.append(" off=");
                    sb.append(this.f5097f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f5093b);
                break;
        }
        if (this.f5098g != null) {
            sb.append(" tint=");
            sb.append(this.f5098g);
        }
        if (this.f5099h != f5091k) {
            sb.append(" mode=");
            sb.append(this.f5099h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.f5094c = null;
        this.f5095d = null;
        this.f5096e = 0;
        this.f5097f = 0;
        this.f5098g = null;
        this.f5099h = f5091k;
        this.i = null;
        this.f5092a = i;
    }
}
