package zc;

import android.os.Looper;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.e9;
import com.google.android.gms.internal.measurement.f7;
import com.google.android.gms.internal.measurement.n8;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.x7;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.zip.CRC32;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26899a;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d f26894d = new d(1);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ d f26895g = new d(2);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ d f26896r = new d(3);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ d f26897x = new d(4);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ d f26898y = new d(5);
    public static final /* synthetic */ d B = new d(6);
    public static final /* synthetic */ d D = new d(7);
    public static final /* synthetic */ d E = new d(8);
    public static final /* synthetic */ d F = new d(9);
    public static final /* synthetic */ d G = new d(10);
    public static final /* synthetic */ d H = new d(11);
    public static final /* synthetic */ d I = new d(12);
    public static final /* synthetic */ d J = new d(13);
    public static final /* synthetic */ d K = new d(14);
    public static final /* synthetic */ d L = new d(15);
    public static final /* synthetic */ d M = new d(16);

    public /* synthetic */ d(int i10) {
        this.f26899a = i10;
    }

    /* JADX WARN: Finally extract failed */
    public static String a(File file, String str, String str2) throws NoSuchAlgorithmException, IOException {
        byte[] bArr;
        String string;
        br.l.e(str, "packageName");
        String str3 = "0";
        try {
            CRC32 crc32 = new CRC32();
            byte[] bArr2 = new byte[65536];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(xu.d.j(file, new FileInputStream(file)), 8192);
            while (true) {
                try {
                    int i10 = bufferedInputStream.read(bArr2);
                    if (i10 == -1) {
                        break;
                    }
                    crc32.update(bArr2, 0, i10);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ic.a.g(bufferedInputStream, th2);
                        throw th3;
                    }
                }
            }
            str3 = String.format("%08x", Arrays.copyOf(new Object[]{Long.valueOf(crc32.getValue())}, 1));
            bufferedInputStream.close();
        } catch (Exception unused) {
        }
        byte[] bytes = w.g.g(str, str3, str2).getBytes(tt.a.f22975a);
        br.l.d(bytes, "getBytes(...)");
        if (bytes.length == 0) {
            bArr = new byte[1];
        } else {
            byte[] bArr3 = new byte[bytes.length];
            int length = bytes.length;
            int i11 = 0;
            while (i11 < length) {
                byte b2 = bytes[i11];
                int i12 = (i11 >= 8 || i11 <= -8) ? i11 % 8 : i11;
                bArr3[i11] = (byte) (~((byte) (((byte) Integer.rotateLeft(b2, 8 - i12)) | ((byte) Integer.rotateRight(b2, i12)))));
                i11++;
            }
            bArr = bArr3;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            br.l.d(messageDigest, "getInstance(...)");
            byte[] bArrDigest = messageDigest.digest(bArr);
            StringBuilder sb2 = new StringBuilder(bArrDigest.length * 2);
            for (byte b10 : bArrDigest) {
                sb2.append(String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1)));
            }
            string = sb2.toString();
        } catch (Exception unused2) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        Locale locale = Locale.getDefault();
        br.l.d(locale, "getDefault(...)");
        String lowerCase = string.toLowerCase(locale);
        br.l.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final boolean d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public JSONObject b(ak.e0 e0Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("check_after_ms", e0Var.f508a);
            jSONObject.put("check_detailed_state_connected", e0Var.f509b);
            jSONObject.put("check_response_code", e0Var.f510c);
            return jSONObject;
        } catch (JSONException e4) {
            return h0.b.x("NetworkRestrictionsConf", e4, e4);
        }
    }

    public ak.e0 c(JSONObject jSONObject, ak.e0 e0Var) {
        br.l.e(e0Var, "fallbackConfig");
        if (jSONObject == null) {
            return e0Var;
        }
        try {
            return new ak.e0(jSONObject.optLong("check_after_ms", e0Var.f508a), jSONObject.optBoolean("check_detailed_state_connected", e0Var.f509b), jSONObject.optBoolean("check_response_code", e0Var.f510c));
        } catch (JSONException e4) {
            ch.n.e("NetworkRestrictionsConf", e4);
            cj.a.G(e4);
            return e0Var;
        }
    }

    @Override // zc.q
    public Object zza() {
        switch (this.f26899a) {
            case 1:
                List list = u.f27161a;
                d7.f4955d.get();
                Long l10 = (Long) f7.f4989b.b();
                l10.getClass();
                return l10;
            case 2:
                List list2 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5008l0.b()).longValue());
            case 3:
                List list3 = u.f27161a;
                d7.f4955d.get();
                return (String) f7.M.b();
            case 4:
                List list4 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.K.b()).longValue());
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                List list5 = u.f27161a;
                d7.f4955d.get();
                Long l11 = (Long) f7.f4997f.b();
                l11.getClass();
                return l11;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                List list6 = u.f27161a;
                d7.f4955d.get();
                Long l12 = (Long) f7.f5032y.b();
                l12.getClass();
                return l12;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                List list7 = u.f27161a;
                d7.f4955d.get();
                Long l13 = (Long) f7.f5016p0.b();
                l13.getClass();
                return l13;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                List list8 = u.f27161a;
                n8.f5142d.get();
                return (String) p8.f5165f.b();
            case 9:
                List list9 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5025u.b()).longValue());
            case 10:
                List list10 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5015p.b()).longValue());
            case 11:
                List list11 = u.f27161a;
                d7.f4955d.get();
                return (String) f7.k.b();
            case 12:
                List list12 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5027v.b()).longValue());
            case 13:
                List list13 = u.f27161a;
                Boolean bool = (Boolean) x7.f5264c.b();
                bool.getClass();
                return bool;
            case 14:
                List list14 = u.f27161a;
                Boolean bool2 = (Boolean) e9.f4979a.b();
                bool2.getClass();
                return bool2;
            case 15:
                List list15 = u.f27161a;
                q8.f5180d.get();
                Boolean bool3 = (Boolean) s8.f5199b.b();
                bool3.getClass();
                return bool3;
            default:
                List list16 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5012n0.b()).longValue());
        }
    }

    public /* synthetic */ d(cj.a aVar, int i10) {
        this.f26899a = i10;
    }
}
