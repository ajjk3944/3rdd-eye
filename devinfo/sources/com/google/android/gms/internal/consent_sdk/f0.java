package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static String f19344a;

    /* renamed from: b, reason: collision with root package name */
    public static final q4 f19345b = new q4(21);

    public static synchronized String a(Context context) {
        String str;
        try {
            if (f19344a == null) {
                ContentResolver contentResolver = context.getContentResolver();
                String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || d()) {
                    string = "emulator";
                }
                for (int i4 = 0; i4 < 3; i4++) {
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.update(string.getBytes());
                        str = String.format("%032X", new BigInteger(1, messageDigest.digest()));
                        break;
                    } catch (ArithmeticException unused) {
                    } catch (NoSuchAlgorithmException unused2) {
                    }
                }
                str = "";
                f19344a = str;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f19344a;
    }

    public static String b(p5 p5Var) {
        StringBuilder sb2 = new StringBuilder(p5Var.d());
        for (int i4 = 0; i4 < p5Var.d(); i4++) {
            byte bA = p5Var.a(i4);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bA);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static String c(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i4 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i4 >= length || (iIndexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i10, iIndexOf);
            sb2.append(e(objArr[i4]));
            i10 = iIndexOf + 2;
            i4++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i4 < length) {
            String str2 = " [";
            while (i4 < objArr.length) {
                sb2.append(str2);
                sb2.append(e(objArr[i4]));
                i4++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }

    public static String e(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String strE = d.h.E(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strE), (Throwable) e2);
            return a0.g.n("<", strE, " threw ", e2.getClass().getName(), ">");
        }
    }
}
