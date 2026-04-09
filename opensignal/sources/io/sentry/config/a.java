package io.sentry.config;

import a5.p;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.Layout;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import bf.n;
import bh.m;
import bn.f;
import br.l;
import br.x;
import com.google.android.exoplayer2.y0;
import com.google.android.gms.internal.measurement.e5;
import com.staircase3.opensignal.osca.domain.model.ResolutionCardInfo;
import e2.k;
import g4.j;
import io.sentry.b5;
import io.sentry.u0;
import io.sentry.util.i;
import ir.f0;
import ir.v;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipException;
import ku.t0;
import mq.o;
import mq.w;
import mr.g;
import ni.y;
import org.json.JSONException;
import org.json.JSONObject;
import t2.h;

/* loaded from: classes.dex */
public abstract class a implements ju.c, ju.a {
    public static final long E(float f10, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static void F(g gVar, Object[] objArr) {
        l.e(objArr, "args");
        if (f0.A(gVar) == objArr.length) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Callable expects ");
        sb2.append(f0.A(gVar));
        sb2.append(" arguments, but ");
        throw new IllegalArgumentException(h0.b.i(objArr.length, " were provided.", sb2));
    }

    public static final void G(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, i11, ", size: "));
        }
    }

    public static final void H(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, i11, ", size: "));
        }
    }

    public static final void I(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 > i11) {
                throw new IllegalArgumentException(h0.b.l("fromIndex: ", i10, i11, " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
    }

    public static void L(b1.e eVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        e2.l lVar;
        k kVar;
        ar.k kVar2;
        int size = longSparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            long jKeyAt = longSparseArray.keyAt(i10);
            ViewTranslationResponse viewTranslationResponseK = p.k(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseK != null && (value = viewTranslationResponseK.getValue("android:text")) != null && (text = value.getText()) != null && (lVar = (e2.l) eVar.d().b((int) jKeyAt)) != null && (kVar = lVar.f7721a) != null) {
                Object objG = kVar.f7717d.f1191a.g(e2.g.j);
                if (objG == null) {
                    objG = null;
                }
                e2.a aVar = (e2.a) objG;
                if (aVar != null && (kVar2 = (ar.k) aVar.f7678b) != null) {
                }
            }
        }
    }

    public static final boolean N(long j, long j7) {
        return j == j7;
    }

    public static dv.d O(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        long j = length - 22;
        if (j < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j7 = length - 65558;
        long j10 = j7 >= 0 ? j7 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                dv.d dVar = new dv.d();
                dVar.f7598b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                dVar.f7597a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return dVar;
            }
            j--;
        } while (j >= j10);
        throw new ZipException("End Of Central Directory signature not found");
    }

    public static ResolutionCardInfo P(Context context, m mVar, int i10) {
        l.e(mVar, "solution");
        switch (f.f2843a[mVar.ordinal()]) {
            case 1:
                String string = context.getString(qk.l.assistant_solution_turn_off_airplane_title);
                l.d(string, "getString(...)");
                String string2 = context.getString(qk.l.assistant_solution_turn_off_airplane_message);
                l.d(string2, "getString(...)");
                return new ResolutionCardInfo(string, string2, mVar.getUri(), mVar, i10);
            case 2:
                String string3 = context.getString(qk.l.assistant_solution_turn_on_mobile_data_title);
                l.d(string3, "getString(...)");
                String string4 = context.getString(qk.l.assistant_solution_turn_on_mobile_data_message);
                l.d(string4, "getString(...)");
                return new ResolutionCardInfo(string3, string4, mVar.getUri(), mVar, i10);
            case 3:
                String string5 = context.getString(qk.l.assistant_solution_connect_to_wifi_title);
                l.d(string5, "getString(...)");
                String string6 = context.getString(qk.l.assistant_solution_connect_to_wifi_message);
                l.d(string6, "getString(...)");
                return new ResolutionCardInfo(string5, string6, mVar.getUri(), mVar, i10);
            case 4:
                String string7 = context.getString(qk.l.assistant_solution_disable_wifi_title);
                l.d(string7, "getString(...)");
                String string8 = context.getString(qk.l.assistant_solution_disable_wifi_message);
                l.d(string8, "getString(...)");
                return new ResolutionCardInfo(string7, string8, mVar.getUri(), mVar, i10);
            case j.STRING_FIELD_NUMBER /* 5 */:
                String string9 = context.getString(qk.l.assistant_solution_setup_esim_title);
                l.d(string9, "getString(...)");
                String string10 = context.getString(qk.l.assistant_solution_setup_esim_message);
                l.d(string10, "getString(...)");
                return new ResolutionCardInfo(string9, string10, null, mVar, i10);
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                String string11 = context.getString(qk.l.assistant_solution_switch_wifi_connection_title);
                l.d(string11, "getString(...)");
                String string12 = context.getString(qk.l.assistant_solution_switch_wifi_connection_message);
                l.d(string12, "getString(...)");
                return new ResolutionCardInfo(string11, string12, mVar.getUri(), mVar, i10);
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                String string13 = context.getString(qk.l.assistant_solution_cycle_airplane_mode_title);
                l.d(string13, "getString(...)");
                String string14 = context.getString(qk.l.assistant_solution_cycle_airplane_mode_message);
                l.d(string14, "getString(...)");
                return new ResolutionCardInfo(string13, string14, mVar.getUri(), mVar, i10);
            case j.BYTES_FIELD_NUMBER /* 8 */:
                String string15 = context.getString(qk.l.assistant_solution_login_wifi_connection_title);
                l.d(string15, "getString(...)");
                String string16 = context.getString(qk.l.assistant_solution_login_wifi_connection_message);
                l.d(string16, "getString(...)");
                return new ResolutionCardInfo(string15, string16, mVar.getUri(), mVar, i10);
            case 9:
                String string17 = context.getString(qk.l.assistant_solution_move_closer_to_wifi_router_title);
                l.d(string17, "getString(...)");
                String string18 = context.getString(qk.l.assistant_solution_move_closer_to_wifi_router_message);
                l.d(string18, "getString(...)");
                return new ResolutionCardInfo(string17, string18, "compass_uri", mVar, i10);
            case 10:
                String string19 = context.getString(qk.l.assistant_solution_move_closer_to_cellular_antenna_title);
                l.d(string19, "getString(...)");
                String string20 = context.getString(qk.l.assistant_solution_move_closer_to_cellular_antenna_message);
                l.d(string20, "getString(...)");
                return new ResolutionCardInfo(string19, string20, "compass_uri", mVar, i10);
            default:
                throw new n();
        }
    }

    public static y Q(String str) {
        if (str == null || str.length() == 0 || tt.l.D0(str)) {
            ch.n.g("LastPublicIpCoreResult", "Null or blank JSON");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new y(xu.d.K("last_public_ip", jSONObject), xu.d.K("last_public_ips", jSONObject), xu.d.C("last_public_ip_timestamp", jSONObject));
        } catch (JSONException unused) {
            ch.n.c("LastPublicIpCoreResult", "Trying to parse invalid JSON: ".concat(str));
            return null;
        }
    }

    public static String R() {
        byte[] bArr = new byte[16];
        i.a().b(bArr);
        byte b2 = (byte) (bArr[6] & 15);
        bArr[6] = b2;
        bArr[6] = (byte) (b2 | 64);
        byte b10 = (byte) (bArr[8] & 63);
        bArr[8] = b10;
        bArr[8] = (byte) (b10 | 128);
        long j = 0;
        long j7 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j7 = (j7 << 8) | (bArr[i10] & 255);
        }
        for (int i11 = 8; i11 < 16; i11++) {
            j = (j << 8) | (bArr[i11] & 255);
        }
        UUID uuid = new UUID(j7, j);
        char[] cArr = io.sentry.util.l.f12819a;
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        char[] cArr2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, cArr[(int) (((-1152921504606846976L) & leastSignificantBits) >>> 60)], cArr[(int) ((1080863910568919040L & leastSignificantBits) >>> 56)], cArr[(int) ((67553994410557440L & leastSignificantBits) >>> 52)], cArr[(int) ((4222124650659840L & leastSignificantBits) >>> 48)], cArr[(int) ((263882790666240L & leastSignificantBits) >>> 44)], cArr[(int) ((16492674416640L & leastSignificantBits) >>> 40)], cArr[(int) ((1030792151040L & leastSignificantBits) >>> 36)], cArr[(int) ((64424509440L & leastSignificantBits) >>> 32)], cArr[(int) ((4026531840L & leastSignificantBits) >>> 28)], cArr[(int) ((251658240 & leastSignificantBits) >>> 24)], cArr[(int) ((15728640 & leastSignificantBits) >>> 20)], cArr[(int) ((983040 & leastSignificantBits) >>> 16)], cArr[(int) ((61440 & leastSignificantBits) >>> 12)], cArr[(int) ((3840 & leastSignificantBits) >>> 8)], cArr[(int) ((240 & leastSignificantBits) >>> 4)], cArr[(int) (15 & leastSignificantBits)]};
        io.sentry.util.l.a(cArr2, mostSignificantBits);
        char[] cArr3 = io.sentry.util.l.f12819a;
        return new String(cArr2);
    }

    public static ArrayList S(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader;
        List listH;
        Collection collectionN0;
        l.e(inputStream, "citiesInputStream");
        ArrayList arrayList = new ArrayList(21248);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, tt.a.f22975a), 8192);
        } catch (IOException unused) {
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
        try {
            Iterator it = new st.a(new mq.n(6, bufferedReader)).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Pattern patternCompile = Pattern.compile(",");
                l.d(patternCompile, "compile(...)");
                l.e(str, "input");
                tt.l.L0(0);
                Matcher matcher = patternCompile.matcher(str);
                if (matcher.find()) {
                    ArrayList arrayList2 = new ArrayList(10);
                    int iEnd = 0;
                    do {
                        arrayList2.add(str.subSequence(iEnd, matcher.start()).toString());
                        iEnd = matcher.end();
                    } while (matcher.find());
                    arrayList2.add(str.subSequence(iEnd, str.length()).toString());
                    listH = arrayList2;
                } else {
                    listH = e5.H(str.toString());
                }
                if (listH.isEmpty()) {
                    collectionN0 = w.f16945a;
                } else {
                    ListIterator listIterator = listH.listIterator(listH.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            collectionN0 = o.N0(listIterator.nextIndex() + 1, listH);
                            break;
                        }
                    }
                    collectionN0 = w.f16945a;
                }
                Object[] array = collectionN0.toArray(new String[0]);
                String str2 = ((String[]) array)[0];
                l.e(str2, "<this>");
                LinkedHashMap linkedHashMap = gn.a.f9629a;
                Locale locale = Locale.ROOT;
                String upperCase = str2.toUpperCase(locale);
                l.d(upperCase, "toUpperCase(...)");
                String upperCase2 = (String) linkedHashMap.get(upperCase);
                if (upperCase2 == null) {
                    upperCase2 = str2.toUpperCase(locale);
                    l.d(upperCase2, "toUpperCase(...)");
                }
                arrayList.add(new sm.a(upperCase2, ((String[]) array)[1], ((String[]) array)[2], ((String[]) array)[3], Double.parseDouble(((String[]) array)[4]), Double.parseDouble(((String[]) array)[5])));
            }
            bufferedReader.close();
            try {
                inputStream.close();
            } catch (IOException unused3) {
            }
            return arrayList;
        } finally {
        }
    }

    public static final qs.b T(ns.f fVar, int i10) {
        l.e(fVar, "<this>");
        return qs.b.e(fVar.n(i10), fVar.A(i10));
    }

    public static int U(Context context, int i10, int i11) {
        Integer numValueOf;
        TypedValue typedValueC0 = xu.d.c0(context, i10);
        if (typedValueC0 != null) {
            int i12 = typedValueC0.resourceId;
            numValueOf = Integer.valueOf(i12 != 0 ? context.getColor(i12) : typedValueC0.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i11;
    }

    public static int V(View view, int i10) {
        Context context = view.getContext();
        TypedValue typedValueE0 = xu.d.e0(i10, view.getContext(), view.getClass().getCanonicalName());
        int i11 = typedValueE0.resourceId;
        return i11 != 0 ? context.getColor(i11) : typedValueE0.data;
    }

    public static final float W(Layout layout, int i10, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i10);
        i2.g gVar = i2.i.f11183a;
        if (layout.getEllipsisCount(i10) <= 0 || layout.getParagraphDirection(i10) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment == null ? -1 : j2.d.f13142a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float X(Layout layout, int i10, Paint paint) {
        float width;
        float width2;
        i2.g gVar = i2.i.f11183a;
        if (layout.getEllipsisCount(i10) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i10) != -1 || layout.getWidth() >= layout.getLineRight(i10)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i10) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment != null ? j2.d.f13142a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final qs.g Y(ns.f fVar, int i10) {
        l.e(fVar, "<this>");
        return qs.g.d(fVar.getString(i10));
    }

    public static final Object Z(gt.m mVar, v vVar) {
        l.e(mVar, "<this>");
        l.e(vVar, "p");
        return mVar.c();
    }

    public static boolean a0(int i10) {
        if (i10 == 0) {
            return false;
        }
        ThreadLocal threadLocal = k3.c.f14012a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d6 = iRed / 255.0d;
        double dPow = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
        double d10 = iGreen / 255.0d;
        double dPow2 = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = iBlue / 255.0d;
        double dPow3 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d12 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d12;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d12 / 100.0d > 0.5d;
    }

    public static int b0(int i10, float f10, int i11) {
        return k3.c.b(k3.c.d(i11, Math.round(Color.alpha(i11) * f10)), i10);
    }

    public static void c0(Class cls, Object obj, u0 u0Var) {
        u0Var.m(b5.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }

    public static String d0(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    public static final void e0(SharedPreferences sharedPreferences, String str, String str2) {
        SharedPreferences.Editor editorPutString = sharedPreferences.edit().putString(str, str2);
        if (editorPutString != null) {
            editorPutString.apply();
        }
    }

    public static b9.c f0(fb.f fVar, boolean z10, boolean z11) throws y0 {
        if (z10) {
            j0(3, fVar, false);
        }
        fVar.m((int) fVar.g(), ne.g.f17524c);
        long jG = fVar.g();
        String[] strArr = new String[(int) jG];
        for (int i10 = 0; i10 < jG; i10++) {
            strArr[i10] = fVar.m((int) fVar.g(), ne.g.f17524c);
        }
        if (z11 && (fVar.o() & 1) == 0) {
            throw y0.a(null, "framing bit expected to be set");
        }
        return new b9.c(9, strArr);
    }

    public static final h g0(f1.c cVar) {
        return new h(Math.round(cVar.f8404a), Math.round(cVar.f8405b), Math.round(cVar.f8406c), Math.round(cVar.f8407d));
    }

    public static void h0(long j) throws InterruptedException {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
            ch.n.c("ThreadUtils", Thread.currentThread().getName() + " has been interrupted");
            Thread.currentThread().interrupt();
        }
    }

    public static final float i0(a.a aVar, m8.g gVar) {
        if (aVar instanceof m8.a) {
            return ((m8.a) aVar).f16320f;
        }
        int i10 = q8.g.f20733a[gVar.ordinal()];
        if (i10 == 1) {
            return Float.MIN_VALUE;
        }
        if (i10 == 2) {
            return Float.MAX_VALUE;
        }
        throw new n();
    }

    public static boolean j0(int i10, fb.f fVar, boolean z10) throws y0 {
        if (fVar.a() < 7) {
            if (z10) {
                return false;
            }
            int iA = fVar.a();
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("too short header: ");
            sb2.append(iA);
            throw y0.a(null, sb2.toString());
        }
        if (fVar.o() != i10) {
            if (z10) {
                return false;
            }
            String strValueOf = String.valueOf(Integer.toHexString(i10));
            throw y0.a(null, strValueOf.length() != 0 ? "expected header type ".concat(strValueOf) : new String("expected header type "));
        }
        if (fVar.o() == 118 && fVar.o() == 111 && fVar.o() == 114 && fVar.o() == 98 && fVar.o() == 105 && fVar.o() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw y0.a(null, "expected characters 'vorbis'");
    }

    public static void k0(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(c7.a.l(i11, "at index ", new StringBuilder(String.valueOf(i11).length() + 9)));
            }
        }
    }

    public static void l0(int i10, int i11) {
        String strA0;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strA0 = f0.a0("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(c7.a.l(i11, "negative size: ", new StringBuilder(String.valueOf(i11).length() + 15)));
                }
                strA0 = f0.a0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strA0);
        }
    }

    public static void m0(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? n0("start index", i10, i12) : (i11 < 0 || i11 > i12) ? n0("end index", i11, i12) : f0.a0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static String n0(String str, int i10, int i11) {
        if (i10 < 0) {
            return f0.a0("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return f0.a0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(c7.a.l(i11, "negative size: ", new StringBuilder(String.valueOf(i11).length() + 15)));
    }

    @Override // ju.c
    public abstract short A();

    @Override // ju.c
    public float B() {
        K();
        throw null;
    }

    @Override // ju.c
    public double C() {
        K();
        throw null;
    }

    @Override // ju.c
    public int D(iu.e eVar) {
        l.e(eVar, "enumDescriptor");
        K();
        throw null;
    }

    public abstract String J(byte[] bArr, int i10, int i11);

    public void K() {
        throw new gu.e(x.f2918a.b(getClass()) + " can't retrieve untyped values");
    }

    public abstract int M(int i10, int i11, String str, byte[] bArr);

    @Override // ju.c
    public ju.a b(iu.e eVar) {
        l.e(eVar, "descriptor");
        return this;
    }

    @Override // ju.a
    public void c(iu.e eVar) {
        l.e(eVar, "descriptor");
    }

    @Override // ju.c
    public boolean d() {
        K();
        throw null;
    }

    @Override // ju.c
    public char e() {
        K();
        throw null;
    }

    @Override // ju.c
    public Object f(gu.a aVar) {
        l.e(aVar, "deserializer");
        return aVar.deserialize(this);
    }

    @Override // ju.a
    public long g(iu.e eVar, int i10) {
        l.e(eVar, "descriptor");
        return r();
    }

    @Override // ju.a
    public int h(iu.e eVar, int i10) {
        l.e(eVar, "descriptor");
        return k();
    }

    @Override // ju.a
    public float i(t0 t0Var, int i10) {
        l.e(t0Var, "descriptor");
        return B();
    }

    @Override // ju.c
    public abstract int k();

    @Override // ju.a
    public char l(t0 t0Var, int i10) {
        l.e(t0Var, "descriptor");
        return e();
    }

    @Override // ju.a
    public Object m(iu.e eVar, int i10, gu.a aVar, Object obj) {
        l.e(eVar, "descriptor");
        l.e(aVar, "deserializer");
        return f(aVar);
    }

    @Override // ju.c
    public String n() {
        K();
        throw null;
    }

    @Override // ju.a
    public short o(t0 t0Var, int i10) {
        l.e(t0Var, "descriptor");
        return A();
    }

    @Override // ju.c
    public ju.c p(iu.e eVar) {
        l.e(eVar, "descriptor");
        return this;
    }

    @Override // ju.a
    public String q(iu.e eVar, int i10) {
        l.e(eVar, "descriptor");
        return n();
    }

    @Override // ju.c
    public abstract long r();

    @Override // ju.a
    public ju.c s(t0 t0Var, int i10) {
        l.e(t0Var, "descriptor");
        return p(t0Var.n(i10));
    }

    @Override // ju.c
    public boolean u() {
        return true;
    }

    @Override // ju.a
    public boolean v(iu.e eVar, int i10) {
        l.e(eVar, "descriptor");
        return d();
    }

    @Override // ju.a
    public double w(iu.e eVar, int i10) {
        l.e(eVar, "descriptor");
        return C();
    }

    @Override // ju.a
    public byte x(t0 t0Var, int i10) {
        l.e(t0Var, "descriptor");
        return z();
    }

    @Override // ju.a
    public Object y(iu.e eVar, int i10, gu.a aVar, Object obj) {
        l.e(eVar, "descriptor");
        l.e(aVar, "deserializer");
        if (aVar.getDescriptor().i() || u()) {
            return f(aVar);
        }
        return null;
    }

    @Override // ju.c
    public abstract byte z();
}
