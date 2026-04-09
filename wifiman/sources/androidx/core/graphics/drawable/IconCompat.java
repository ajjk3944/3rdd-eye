package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f30681k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f30682a;

    /* renamed from: b, reason: collision with root package name */
    Object f30683b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f30684c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f30685d;

    /* renamed from: e, reason: collision with root package name */
    public int f30686e;

    /* renamed from: f, reason: collision with root package name */
    public int f30687f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f30688g;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f30689h;

    /* renamed from: i, reason: collision with root package name */
    public String f30690i;

    /* renamed from: j, reason: collision with root package name */
    public String f30691j;

    static class a {
        static int a(Object obj) {
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

        static String b(Object obj) {
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

        static int c(Object obj) {
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

        static Uri d(Object obj) {
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

        static Icon e(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f30682a) {
                case -1:
                    return (Icon) iconCompat.f30683b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f30683b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.c(), iconCompat.f30686e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f30683b, iconCompat.f30686e, iconCompat.f30687f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f30683b);
                    break;
                case 5:
                    iconCreateWithBitmap = b.a((Bitmap) iconCompat.f30683b);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.e());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.e());
                        }
                        InputStream inputStreamF = iconCompat.f(context);
                        if (inputStreamF == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.e());
                        }
                        iconCreateWithBitmap = b.a(BitmapFactory.decodeStream(inputStreamF));
                        break;
                    }
            }
            ColorStateList colorStateList = iconCompat.f30688g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f30689h;
            if (mode != IconCompat.f30681k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    static class b {
        static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f30682a = -1;
        this.f30684c = null;
        this.f30685d = null;
        this.f30686e = 0;
        this.f30687f = 0;
        this.f30688g = null;
        this.f30689h = f30681k;
        this.f30690i = null;
    }

    public static IconCompat a(Resources resources, String str, int i10) {
        E1.d.c(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f30686e = i10;
        if (resources != null) {
            try {
                iconCompat.f30683b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f30683b = str;
        }
        iconCompat.f30691j = str;
        return iconCompat;
    }

    private static String k(int i10) {
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

    public int b() {
        int i10 = this.f30682a;
        if (i10 == -1) {
            return a.a(this.f30683b);
        }
        if (i10 == 2) {
            return this.f30686e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String c() {
        int i10 = this.f30682a;
        if (i10 == -1) {
            return a.b(this.f30683b);
        }
        if (i10 == 2) {
            String str = this.f30691j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f30683b).split(":", -1)[0] : this.f30691j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int d() {
        int i10 = this.f30682a;
        return i10 == -1 ? a.c(this.f30683b) : i10;
    }

    public Uri e() {
        int i10 = this.f30682a;
        if (i10 == -1) {
            return a.d(this.f30683b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f30683b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream f(Context context) {
        Uri uriE = e();
        String scheme = uriE.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriE);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriE, e10);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f30683b));
        } catch (FileNotFoundException e11) {
            Log.w("IconCompat", "Unable to load image from path: " + uriE, e11);
            return null;
        }
    }

    public void g() {
        this.f30689h = PorterDuff.Mode.valueOf(this.f30690i);
        switch (this.f30682a) {
            case -1:
                Parcelable parcelable = this.f30685d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f30683b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f30685d;
                if (parcelable2 != null) {
                    this.f30683b = parcelable2;
                    return;
                }
                byte[] bArr = this.f30684c;
                this.f30683b = bArr;
                this.f30682a = 3;
                this.f30686e = 0;
                this.f30687f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f30684c, Charset.forName("UTF-16"));
                this.f30683b = str;
                if (this.f30682a == 2 && this.f30691j == null) {
                    this.f30691j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f30683b = this.f30684c;
                return;
        }
    }

    public void h(boolean z10) {
        this.f30690i = this.f30689h.name();
        switch (this.f30682a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f30685d = (Parcelable) this.f30683b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z10) {
                    this.f30685d = (Parcelable) this.f30683b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f30683b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f30684c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f30684c = ((String) this.f30683b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f30684c = (byte[]) this.f30683b;
                return;
            case 4:
            case 6:
                this.f30684c = this.f30683b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Icon i() {
        return j(null);
    }

    public Icon j(Context context) {
        return a.e(this, context);
    }

    public String toString() {
        if (this.f30682a == -1) {
            return String.valueOf(this.f30683b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(k(this.f30682a));
        switch (this.f30682a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f30683b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f30683b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f30691j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f30686e);
                if (this.f30687f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f30687f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f30683b);
                break;
        }
        if (this.f30688g != null) {
            sb2.append(" tint=");
            sb2.append(this.f30688g);
        }
        if (this.f30689h != f30681k) {
            sb2.append(" mode=");
            sb2.append(this.f30689h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    IconCompat(int i10) {
        this.f30684c = null;
        this.f30685d = null;
        this.f30686e = 0;
        this.f30687f = 0;
        this.f30688g = null;
        this.f30689h = f30681k;
        this.f30690i = null;
        this.f30682a = i10;
    }
}
