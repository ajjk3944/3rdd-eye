package wi;

import android.content.Context;
import android.webkit.MimeTypeMap;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.google.android.gms.internal.measurement.j4;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import nk.k;
import r0.i0;
import vk.p;
import yj.n;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final n f36746a = a.a.u(new i0(9));

    public static final long a(yi.d dVar) {
        ArrayList arrayListF;
        k.e(dVar, "file");
        if (!dVar.a()) {
            return 0L;
        }
        if (dVar.isDirectory() && (arrayListF = dVar.f()) != null && arrayListF.isEmpty()) {
            return 0L;
        }
        return b(dVar);
    }

    public static final long b(yi.d dVar) {
        if (dVar.c()) {
            return dVar.getLength();
        }
        long length = dVar.getLength();
        ArrayList arrayListF = dVar.f();
        if (arrayListF != null) {
            int size = arrayListF.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayListF.get(i4);
                i4++;
                length += b((yi.d) obj);
            }
        }
        return length;
    }

    public static final boolean c(yi.d dVar, boolean z3) {
        String lowerCase;
        k.e(dVar, "file");
        if (!dVar.a()) {
            return true;
        }
        if (dVar.c()) {
            return dVar.e();
        }
        ArrayList arrayListF = dVar.f();
        if (arrayListF != null) {
            int size = arrayListF.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayListF.get(i4);
                i4++;
                yi.d dVar2 = (yi.d) obj;
                if (z3) {
                    String name = dVar2.getName();
                    if (name != null) {
                        lowerCase = name.toLowerCase(Locale.ROOT);
                        k.d(lowerCase, "toLowerCase(...)");
                    } else {
                        lowerCase = null;
                    }
                    if (".nomedia".equals(lowerCase)) {
                    }
                }
                c(dVar2, z3);
            }
        }
        ArrayList arrayListF2 = dVar.f();
        if (arrayListF2 == null || !arrayListF2.isEmpty() || z3) {
            return false;
        }
        return dVar.e();
    }

    public static final void d(AbstractCollection abstractCollection, mk.a aVar, a aVar2) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (((Boolean) aVar.invoke()).booleanValue()) {
                break;
            }
            yi.d dVarH = yi.g.f37630a.h(str);
            aVar2.d(str);
            if (!dVarH.a()) {
                linkedList2.add(str);
            } else if (c(dVarH, false)) {
                linkedList2.add(str);
            } else {
                linkedList.add(str);
            }
        }
        aVar2.a(linkedList2, linkedList);
    }

    public static String e(long j) {
        return m.c0(f(j), " ", null, 62);
    }

    public static final String[] f(long j) {
        n nVar;
        float f10 = j;
        int i4 = 0;
        while (true) {
            nVar = f36746a;
            if (f10 <= 1.0f) {
                break;
            }
            Object value = nVar.getValue();
            k.d(value, "getValue(...)");
            if (i4 >= ((String[]) value).length - 1) {
                break;
            }
            float f11 = f10 / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
            if (f11 < 1.0f) {
                break;
            }
            i4++;
            f10 = f11;
        }
        String strU0 = p.u0(String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f10)}, 1)), ".00", "");
        Object value2 = nVar.getValue();
        k.d(value2, "getValue(...)");
        return new String[]{strU0, ((String[]) value2)[i4]};
    }

    public static String g(InputStream inputStream, byte[] bArr) throws NoSuchAlgorithmException, IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            k.d(messageDigest, "getInstance(...)");
            while (true) {
                int i4 = inputStream.read(bArr, 0, bArr.length);
                if (i4 == -1 || Boolean.FALSE.booleanValue()) {
                    break;
                }
                messageDigest.update(bArr, 0, i4);
            }
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest == null || bArrDigest.length == 0) {
                return null;
            }
            return new BigInteger(1, bArrDigest).toString(16);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static final String h(long j, boolean z3, boolean z10) {
        Context context = pk.a.f32022a;
        k.b(context);
        String str = k.a(j4.q(context).getLanguage(), new Locale("zh").getLanguage()) ? z3 ? z10 ? "yyyy/MM/dd" : "MM/dd" : z10 ? "yyyy/MM/dd HH:mm" : "MM/dd HH:mm" : z3 ? z10 ? "dd/MM/yy" : "dd/MM" : z10 ? "dd/MM/yy hh:mm a" : "dd/MM hh:mm a";
        Context context2 = pk.a.f32022a;
        k.b(context2);
        String str2 = new SimpleDateFormat(str, j4.q(context2)).format(Long.valueOf(j));
        k.d(str2, "format(...)");
        return str2;
    }

    public static final String i(String str) {
        k.e(str, "name");
        int iK0 = vk.i.K0(str, '.', 0, 6);
        if (iK0 <= 0) {
            return "application/octet-stream";
        }
        String strSubstring = str.substring(iK0 + 1);
        k.d(strSubstring, "substring(...)");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        k.d(lowerCase, "toLowerCase(...)");
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }
}
