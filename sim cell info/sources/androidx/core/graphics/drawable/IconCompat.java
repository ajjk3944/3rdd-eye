package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: j, reason: collision with root package name */
    static final PorterDuff.Mode f1450j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    Object f1452b;

    /* renamed from: a, reason: collision with root package name */
    public int f1451a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f1453c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f1454d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f1455e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f1456f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1457g = null;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f1458h = f1450j;

    /* renamed from: i, reason: collision with root package name */
    public String f1459i = null;

    private static int b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    private static String d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    private static String g(int i2) {
        switch (i2) {
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

    public int a() {
        int i2 = this.f1451a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return b((Icon) this.f1452b);
        }
        if (i2 == 2) {
            return this.f1455e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String c() {
        int i2 = this.f1451a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return d((Icon) this.f1452b);
        }
        if (i2 == 2) {
            return ((String) this.f1452b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public void e() {
        Parcelable parcelable;
        this.f1458h = PorterDuff.Mode.valueOf(this.f1459i);
        switch (this.f1451a) {
            case -1:
                parcelable = this.f1454d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f1454d;
                if (parcelable == null) {
                    byte[] bArr = this.f1453c;
                    this.f1452b = bArr;
                    this.f1451a = 3;
                    this.f1455e = 0;
                    this.f1456f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                this.f1452b = new String(this.f1453c, Charset.forName("UTF-16"));
                return;
            case 3:
                this.f1452b = this.f1453c;
                return;
        }
        this.f1452b = parcelable;
    }

    public void f(boolean z2) {
        this.f1459i = this.f1458h.name();
        switch (this.f1451a) {
            case -1:
                if (z2) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z2) {
                    Bitmap bitmap = (Bitmap) this.f1452b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f1453c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f1453c = ((String) this.f1452b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f1453c = (byte[]) this.f1452b;
                return;
            case 4:
            case 6:
                this.f1453c = this.f1452b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f1454d = (Parcelable) this.f1452b;
    }

    public String toString() {
        int height;
        if (this.f1451a == -1) {
            return String.valueOf(this.f1452b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(g(this.f1451a));
        switch (this.f1451a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1452b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f1452b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(c());
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(a())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1455e);
                if (this.f1456f != 0) {
                    sb.append(" off=");
                    height = this.f1456f;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1452b);
                break;
        }
        if (this.f1457g != null) {
            sb.append(" tint=");
            sb.append(this.f1457g);
        }
        if (this.f1458h != f1450j) {
            sb.append(" mode=");
            sb.append(this.f1458h);
        }
        sb.append(")");
        return sb.toString();
    }
}
