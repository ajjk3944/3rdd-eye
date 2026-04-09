package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebView;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.slf4j.ILoggerFactory;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class fr implements o41, gk, h81, i64, ee0, wl0, ILoggerFactory, qm0 {
    public static Cipher n;
    public static fr t;
    public final /* synthetic */ int f;
    public static final fr g = new fr(1);
    public static final /* synthetic */ fr h = new fr(2);
    public static final String[] i = new String[0];
    public static final /* synthetic */ fr j = new fr(4);
    public static final fr k = new fr(5);
    public static final fr l = new fr(6);
    public static final fr m = new fr(7);
    public static final Object o = new Object();
    public static final Object p = new Object();
    public static final fr q = new fr(9);
    public static final fr r = new fr(10);
    public static final fr s = new fr(11);

    public /* synthetic */ fr(int i2) {
        this.f = i2;
    }

    public static lx c(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new lx(1, httpURLConnection);
    }

    public static String n(byte[] bArr, byte[] bArr2) throws at1 {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (o) {
                q().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = q().doFinal(bArr2);
                iv = q().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e) {
            throw new at1(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new at1(e2);
        } catch (BadPaddingException e3) {
            throw new at1(e3);
        } catch (IllegalBlockSizeException e4) {
            throw new at1(e4);
        } catch (NoSuchPaddingException e5) {
            throw new at1(e5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.pc4 o(android.content.Context r31, defpackage.e13 r32) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr.o(android.content.Context, e13):pc4");
    }

    public static byte[] p(String str, byte[] bArr) throws at1 {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            if (bArrDecode.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            int length2 = bArrDecode.length;
            if (length2 <= 16) {
                throw new at1();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrDecode);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (o) {
                q().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = q().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e) {
            throw new at1(e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new at1(e2);
        } catch (InvalidKeyException e3) {
            throw new at1(e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new at1(e4);
        } catch (BadPaddingException e5) {
            throw new at1(e5);
        } catch (IllegalBlockSizeException e6) {
            throw new at1(e6);
        } catch (NoSuchPaddingException e7) {
            throw new at1(e7);
        }
    }

    public static final Cipher q() {
        Cipher cipher;
        synchronized (p) {
            try {
                if (n == null) {
                    n = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    public static final void t(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                webView.evaluateJavascript(str, null);
            } catch (IllegalStateException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append("javascript: ");
                sb.append(str);
                webView.loadUrl(sb.toString());
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // org.slf4j.ILoggerFactory
    public i80 a(String str) {
        return vf0.f;
    }

    @Override // defpackage.h81
    public String[] b() {
        return i;
    }

    @Override // defpackage.h81
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public void d(float f, float f2, float f3, k90 k90Var) {
        k90Var.d(f, 0.0f);
    }

    public f20 e(Context context) {
        f20 f20Var;
        f20 f20Var2 = f20.i;
        if (f20Var2 != null) {
            return f20Var2;
        }
        synchronized (this) {
            f20Var = f20.i;
            if (f20Var == null) {
                f20Var = new f20(context);
                f20.i = f20Var;
            }
        }
        return f20Var;
    }

    @Override // defpackage.i64
    public boolean g(Class cls) {
        return p54.class.isAssignableFrom(cls);
    }

    @Override // defpackage.h81
    public ProfileStoreBoundaryInterface getProfileStore() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.h81
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.wl0
    public CharSequence h(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        CharSequence[] charSequenceArr = listPreference.Y;
        int iY = listPreference.y(listPreference.a0);
        if (TextUtils.isEmpty((iY < 0 || charSequenceArr == null) ? null : charSequenceArr[iY])) {
            return listPreference.f.getString(R.string.not_set);
        }
        int iY2 = listPreference.y(listPreference.a0);
        if (iY2 < 0 || charSequenceArr == null) {
            return null;
        }
        return charSequenceArr[iY2];
    }

    @Override // defpackage.qm0
    public void i(int i2, Object obj) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override // defpackage.i64
    public r64 j(Class cls) {
        if (!p54.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (r64) p54.t(cls.asSubclass(p54.class)).w(3, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // defpackage.o41
    public Object k(i40 i40Var, float f) {
        switch (this.f) {
            case 1:
                boolean z = i40Var.o() == 1;
                if (z) {
                    i40Var.a();
                }
                double dL = i40Var.l();
                double dL2 = i40Var.l();
                double dL3 = i40Var.l();
                double dL4 = i40Var.o() == 7 ? i40Var.l() : 1.0d;
                if (z) {
                    i40Var.f();
                }
                if (dL <= 1.0d && dL2 <= 1.0d && dL3 <= 1.0d) {
                    dL *= 255.0d;
                    dL2 *= 255.0d;
                    dL3 *= 255.0d;
                    if (dL4 <= 1.0d) {
                        dL4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dL4, (int) dL, (int) dL2, (int) dL3));
            case 5:
                return k40.b(i40Var, f);
            default:
                boolean z2 = i40Var.o() == 1;
                if (z2) {
                    i40Var.a();
                }
                float fL = (float) i40Var.l();
                float fL2 = (float) i40Var.l();
                while (i40Var.i()) {
                    i40Var.s();
                }
                if (z2) {
                    i40Var.f();
                }
                return new dt0((fL / 100.0f) * f, (fL2 / 100.0f) * f);
        }
    }

    public Signature[] l(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public void m(l92 l92Var, float f) {
        uq0 uq0Var = (uq0) ((Drawable) l92Var.f);
        od odVar = (od) l92Var.g;
        boolean useCompatPadding = odVar.getUseCompatPadding();
        boolean preventCornerOverlap = odVar.getPreventCornerOverlap();
        if (f != uq0Var.e || uq0Var.f != useCompatPadding || uq0Var.g != preventCornerOverlap) {
            uq0Var.e = f;
            uq0Var.f = useCompatPadding;
            uq0Var.g = preventCornerOverlap;
            uq0Var.b(null);
            uq0Var.invalidateSelf();
        }
        if (!odVar.getUseCompatPadding()) {
            l92Var.H(0, 0, 0, 0);
            return;
        }
        uq0 uq0Var2 = (uq0) ((Drawable) l92Var.f);
        float f2 = uq0Var2.e;
        float f3 = uq0Var2.a;
        int iCeil = (int) Math.ceil(vq0.a(f2, f3, odVar.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(vq0.b(f2, f3, odVar.getPreventCornerOverlap()));
        l92Var.H(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // defpackage.ee0
    public boolean r(od0 od0Var) {
        return false;
    }

    public void s(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append("null");
                } else if (obj instanceof String) {
                    String string = obj.toString();
                    if (string.startsWith("{")) {
                        sb.append(string);
                    } else {
                        sb.append('\"');
                        sb.append(string);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
            sb.append(")}");
            String string2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            if (Looper.myLooper() == handler.getLooper()) {
                t(webView, string2);
            } else {
                handler.post(new sz2(this, webView, string2));
            }
        }
    }

    @Override // defpackage.ee0
    public void f(od0 od0Var, boolean z) {
    }
}
