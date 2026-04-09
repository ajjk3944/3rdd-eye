package a;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import br.l;
import c0.b0;
import c0.x;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.w;
import com.google.android.gms.internal.measurement.y3;
import cv.b;
import cv.c;
import cv.d0;
import cv.e0;
import cv.f0;
import cv.g;
import cv.h0;
import cv.u;
import cv.z;
import g4.j;
import io.sentry.b1;
import io.sentry.exception.SentryHttpClientException;
import io.sentry.t4;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.logging.Logger;
import js.e;
import mq.o;
import n0.f1;
import n0.k1;
import n0.p;
import ou.a0;
import ou.c0;
import rr.r0;
import rs.i;
import tg.a1;
import tt.s;
import x1.y;
import y3.f;
import z0.m;

/* loaded from: classes.dex */
public abstract class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f0a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f1b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2c;

    /* renamed from: d, reason: collision with root package name */
    public static a1 f3d;

    /* renamed from: e, reason: collision with root package name */
    public static e f4e;

    public static final void A(TextView textView, String str) {
        l.e(textView, "<this>");
        textView.setVisibility((str == null || tt.l.D0(str)) ? 8 : 0);
        if (str == null) {
            str = "";
        }
        textView.setText(new SpannableString(Html.fromHtml(str, 0)));
        textView.setClickable(true);
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static final b D(Socket socket) throws IOException {
        Logger logger = u.f6739a;
        e0 e0Var = new e0(socket);
        OutputStream outputStream = socket.getOutputStream();
        l.d(outputStream, "getOutputStream(...)");
        return new b(e0Var, new b(outputStream, e0Var));
    }

    public static final c E(InputStream inputStream) {
        Logger logger = u.f6739a;
        l.e(inputStream, "<this>");
        return new c(inputStream, new h0());
    }

    public static final c F(Socket socket) throws IOException {
        Logger logger = u.f6739a;
        e0 e0Var = new e0(socket);
        InputStream inputStream = socket.getInputStream();
        l.d(inputStream, "getInputStream(...)");
        return new c(e0Var, new c(inputStream, e0Var));
    }

    public static final String G(String str) {
        l.e(str, "<this>");
        int i10 = 0;
        int i11 = -1;
        if (!tt.l.q0(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                l.d(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                l.d(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                l.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i12 = 0; i12 < length; i12++) {
                    char cCharAt = lowerCase.charAt(i12);
                    if (l.g(cCharAt, 31) <= 0 || l.g(cCharAt, 127) >= 0 || tt.l.A0(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressI = (s.n0(str, "[", false) && s.f0(str, "]", false)) ? i(str, 1, str.length() - 1) : i(str, 0, str.length());
        if (inetAddressI == null) {
            return null;
        }
        byte[] address = inetAddressI.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressI.getHostAddress();
            }
            throw new AssertionError(h0.b.g('\'', "Invalid IPv6 address: '", str));
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < address.length) {
            int i15 = i13;
            while (i15 < 16 && address[i15] == 0 && address[i15 + 1] == 0) {
                i15 += 2;
            }
            int i16 = i15 - i13;
            if (i16 > i14 && i16 >= 4) {
                i11 = i13;
                i14 = i16;
            }
            i13 = i15 + 2;
        }
        g gVar = new g();
        while (i10 < address.length) {
            if (i10 == i11) {
                gVar.p0(58);
                i10 += i14;
                if (i10 == 16) {
                    gVar.p0(58);
                }
            } else {
                if (i10 > 0) {
                    gVar.p0(58);
                }
                byte b2 = address[i10];
                byte[] bArr = pu.b.f20645a;
                gVar.r0(((b2 & 255) << 8) | (address[i10 + 1] & 255));
                i10 += 2;
            }
        }
        return gVar.Y();
    }

    public static String H(Date date) {
        TimeZone timeZone = TimeZone.getDefault();
        l.d(timeZone, "getDefault(...)");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        String str = simpleDateFormat.format(date);
        StringBuilder sb2 = new StringBuilder();
        l.b(str);
        sb2.append(tt.l.u0(2, str));
        sb2.append(':');
        sb2.append(tt.l.Z0(str));
        return sb2.toString();
    }

    public static void I(String str, int i10, List list) {
        if (list.size() == i10) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i10 + " parameters found " + list.size());
    }

    public static void J(String str, int i10, List list) {
        if (list.size() >= i10) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i10 + " parameters found " + list.size());
    }

    public static void K(String str, int i10, ArrayList arrayList) {
        if (arrayList.size() <= i10) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i10 + " parameters found " + arrayList.size());
    }

    public static boolean L(n nVar) {
        if (nVar == null) {
            return false;
        }
        Double dC = nVar.c();
        return !dC.isNaN() && dC.doubleValue() >= 0.0d && dC.equals(Double.valueOf(Math.floor(dC.doubleValue())));
    }

    public static w M(String str) {
        w wVarZza = null;
        if (str != null && !str.isEmpty()) {
            wVarZza = w.zza(Integer.parseInt(str));
        }
        if (wVarZza != null) {
            return wVarZza;
        }
        throw new IllegalArgumentException(c7.a.p("Unsupported commandId ", str));
    }

    public static boolean N(n nVar, n nVar2) {
        if (!nVar.getClass().equals(nVar2.getClass())) {
            return false;
        }
        if ((nVar instanceof r) || (nVar instanceof com.google.android.gms.internal.measurement.l)) {
            return true;
        }
        if (!(nVar instanceof com.google.android.gms.internal.measurement.g)) {
            return nVar instanceof q ? nVar.l().equals(nVar2.l()) : nVar instanceof com.google.android.gms.internal.measurement.e ? nVar.a().equals(nVar2.a()) : nVar == nVar2;
        }
        if (Double.isNaN(nVar.c().doubleValue()) || Double.isNaN(nVar2.c().doubleValue())) {
            return false;
        }
        return nVar.c().equals(nVar2.c());
    }

    public static int O(double d6) {
        if (Double.isNaN(d6) || Double.isInfinite(d6) || d6 == 0.0d) {
            return 0;
        }
        return (int) (((d6 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d6))) % 4.294967296E9d);
    }

    public static double P(double d6) {
        if (Double.isNaN(d6)) {
            return 0.0d;
        }
        if (Double.isInfinite(d6) || d6 == 0.0d || d6 == 0.0d) {
            return d6;
        }
        return (d6 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d6));
    }

    public static Object Q(n nVar) {
        if (n.f5130h.equals(nVar)) {
            return null;
        }
        if (n.f5129f.equals(nVar)) {
            return "";
        }
        if (nVar instanceof k) {
            return R((k) nVar);
        }
        if (!(nVar instanceof d)) {
            return !nVar.c().isNaN() ? nVar.c() : nVar.l();
        }
        ArrayList arrayList = new ArrayList();
        d dVar = (d) nVar;
        int i10 = 0;
        while (i10 < dVar.p()) {
            if (i10 >= dVar.p()) {
                throw new NoSuchElementException(c7.a.l(i10, "Out of bounds index: ", new StringBuilder(String.valueOf(i10).length() + 21)));
            }
            int i11 = i10 + 1;
            Object objQ = Q(dVar.r(i10));
            if (objQ != null) {
                arrayList.add(objQ);
            }
            i10 = i11;
        }
        return arrayList;
    }

    public static HashMap R(k kVar) {
        HashMap map = new HashMap();
        Iterator it = new ArrayList(kVar.f5091a.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object objQ = Q(kVar.d(str));
            if (objQ != null) {
                map.put(str, objQ);
            }
        }
        return map;
    }

    public static void S(kg.r rVar) {
        int iO = O(rVar.I("runtime.counter").c().doubleValue() + 1.0d);
        if (iO > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        rVar.G("runtime.counter", new com.google.android.gms.internal.measurement.g(Double.valueOf(iO)));
    }

    public static final void a(m mVar, bh.g gVar, p pVar, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        l.e(gVar, "type");
        pVar.T(-184415948);
        int i14 = (pVar.c(gVar.ordinal()) ? 32 : 16) | i10;
        if (pVar.K(i14 & 1, (i14 & 19) != 18)) {
            int[] iArr = en.c.f8235a;
            switch (iArr[gVar.ordinal()]) {
                case 1:
                case 10:
                case 11:
                    z10 = false;
                    break;
                case 2:
                case 3:
                case 4:
                case j.STRING_FIELD_NUMBER /* 5 */:
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                case j.BYTES_FIELD_NUMBER /* 8 */:
                case 9:
                    z10 = true;
                    break;
                default:
                    throw new bf.n();
            }
            switch (iArr[gVar.ordinal()]) {
                case 1:
                case 4:
                case j.STRING_FIELD_NUMBER /* 5 */:
                case 10:
                case 11:
                    z11 = false;
                    break;
                case 2:
                case 3:
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                case j.BYTES_FIELD_NUMBER /* 8 */:
                case 9:
                    z11 = true;
                    break;
                default:
                    throw new bf.n();
            }
            switch (iArr[gVar.ordinal()]) {
                case 1:
                    i11 = qk.f.ic_connection_cell_tower;
                    break;
                case 2:
                    i11 = qk.f.ic_connection_cell_tower;
                    break;
                case 3:
                    i11 = qk.f.ic_connection_wifi;
                    break;
                case 4:
                    i11 = qk.f.ic_connection_cell_tower;
                    break;
                case j.STRING_FIELD_NUMBER /* 5 */:
                    i11 = qk.f.ic_connection_wifi;
                    break;
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                    i11 = qk.f.ic_connection_cell_tower;
                    break;
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                    i11 = qk.f.ic_connection_wifi;
                    break;
                case j.BYTES_FIELD_NUMBER /* 8 */:
                    i11 = qk.f.ic_connection_cell_tower;
                    break;
                case 9:
                    i11 = qk.f.ic_connection_wifi;
                    break;
                case 10:
                    i11 = qk.f.ic_connection_cell_tower;
                    break;
                case 11:
                    i11 = qk.f.ic_connection_wifi;
                    break;
                default:
                    throw new bf.n();
            }
            int i15 = i11;
            switch (iArr[gVar.ordinal()]) {
                case 1:
                    i12 = qk.f.ic_connection_dots;
                    break;
                case 2:
                    i12 = qk.f.ic_connection_line;
                    break;
                case 3:
                    i12 = qk.f.ic_connection_line;
                    break;
                case 4:
                    i12 = qk.f.ic_connection_line;
                    break;
                case j.STRING_FIELD_NUMBER /* 5 */:
                    i12 = qk.f.ic_connection_line;
                    break;
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                    i12 = qk.f.ic_connection_line;
                    break;
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                    i12 = qk.f.ic_connection_warning;
                    break;
                case j.BYTES_FIELD_NUMBER /* 8 */:
                    i12 = qk.f.ic_connection_warning;
                    break;
                case 9:
                    i12 = qk.f.ic_connection_warning;
                    break;
                case 10:
                    i12 = qk.f.ic_connection_error;
                    break;
                case 11:
                    i12 = qk.f.ic_connection_error;
                    break;
                default:
                    throw new bf.n();
            }
            switch (iArr[gVar.ordinal()]) {
                case 1:
                    i13 = qk.f.ic_connection_dots;
                    break;
                case 2:
                    i13 = qk.f.ic_connection_line;
                    break;
                case 3:
                    i13 = qk.f.ic_connection_line;
                    break;
                case 4:
                    i13 = qk.f.ic_connection_error;
                    break;
                case j.STRING_FIELD_NUMBER /* 5 */:
                    i13 = qk.f.ic_connection_error;
                    break;
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                    i13 = qk.f.ic_connection_warning;
                    break;
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                    i13 = qk.f.ic_connection_warning;
                    break;
                case j.BYTES_FIELD_NUMBER /* 8 */:
                    i13 = qk.f.ic_connection_warning;
                    break;
                case 9:
                    i13 = qk.f.ic_connection_warning;
                    break;
                case 10:
                    i13 = qk.f.ic_connection_dots;
                    break;
                case 11:
                    i13 = qk.f.ic_connection_dots;
                    break;
                default:
                    throw new bf.n();
            }
            int i16 = i13;
            x xVarA = c0.w.a(c0.d.f3066a, z0.b.G, pVar, 48);
            int iHashCode = Long.hashCode(pVar.S);
            f1 f1VarK = pVar.k();
            m mVarF = y3.F(pVar, mVar);
            x1.g.f24833a.getClass();
            y yVar = x1.f.f24793b;
            pVar.U();
            if (pVar.R) {
                pVar.j(yVar);
            } else {
                pVar.e0();
            }
            n0.w.k(x1.f.f24796e, xVarA, pVar);
            n0.w.k(x1.f.f24795d, f1VarK, pVar);
            x1.e eVar = x1.f.f24797f;
            if (pVar.R || !l.a(pVar.I(), Integer.valueOf(iHashCode))) {
                w.g.m(iHashCode, pVar, iHashCode, eVar);
            }
            n0.w.k(x1.f.f24794c, mVarF, pVar);
            xu.l.a(null, true, qk.f.connection_icon_mobile, pVar, 48);
            b0.a(pVar, c0.y.a());
            b4.a(xu.d.W(i12, pVar, 0), null, null, null, 0.0f, pVar, 48);
            b0.a(pVar, c0.y.a());
            xu.l.a(null, z10, i15, pVar, 0);
            b0.a(pVar, c0.y.a());
            b4.a(xu.d.W(i16, pVar, 0), null, null, null, 0.0f, pVar, 48);
            b0.a(pVar, c0.y.a());
            xu.l.a(null, z11, qk.f.ic_connection_type, pVar, 0);
            pVar.o(true);
        } else {
            pVar.N();
        }
        k1 k1VarQ = pVar.q();
        if (k1VarQ != null) {
            k1VarQ.f17207d = new en.b(mVar, gVar, i10, 0);
        }
    }

    public static yt.c b(int i10, int i11, yt.a aVar) {
        if ((i11 & 2) != 0) {
            aVar = yt.a.SUSPEND;
        }
        if (i10 == -2) {
            if (aVar != yt.a.SUSPEND) {
                return new yt.m(1, aVar);
            }
            yt.g.C.getClass();
            return new yt.c(yt.f.f26446b);
        }
        if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? aVar == yt.a.SUSPEND ? new yt.c(i10) : new yt.m(i10, aVar) : new yt.c(Integer.MAX_VALUE) : aVar == yt.a.SUSPEND ? new yt.c(0) : new yt.m(1, aVar);
        }
        if (aVar == yt.a.SUSPEND) {
            return new yt.m(1, yt.a.DROP_OLDEST);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static final a1.e c(String str) {
        return new a1.e(i3.g.H(str));
    }

    public static final cv.y d(d0 d0Var) {
        l.e(d0Var, "<this>");
        return new cv.y(d0Var);
    }

    public static final z e(f0 f0Var) {
        l.e(f0Var, "<this>");
        return new z(f0Var);
    }

    public static void f(b1 b1Var, a0 a0Var, c0 c0Var) {
        l.e(b1Var, "scopes");
        l.e(a0Var, "request");
        ou.s sVar = a0Var.f19862c;
        l.e(c0Var, "response");
        ou.s sVar2 = c0Var.f19889y;
        io.sentry.k kVarD = vc.e.D(a0Var.f19860a.f19974h);
        io.sentry.protocol.k kVar = new io.sentry.protocol.k();
        kVar.f12580a = "SentryOkHttpInterceptor";
        StringBuilder sb2 = new StringBuilder("HTTP Client Error with status code: ");
        int i10 = c0Var.f19887r;
        sb2.append(i10);
        t4 t4Var = new t4(new io.sentry.exception.a(kVar, new SentryHttpClientException(sb2.toString()), Thread.currentThread(), true));
        io.sentry.h0 h0Var = new io.sentry.h0();
        h0Var.c(a0Var, "okHttp:request");
        h0Var.c(c0Var, "okHttp:response");
        io.sentry.protocol.n nVar = new io.sentry.protocol.n();
        nVar.f12596a = (String) kVarD.f12397d;
        nVar.f12598g = (String) kVarD.f12398g;
        nVar.F = (String) kVarD.f12399r;
        nVar.f12600x = b1Var.k().isSendDefaultPii() ? sVar.a("Cookie") : null;
        nVar.f12597d = a0Var.f19861b;
        nVar.f12601y = b4.O(q(b1Var, sVar));
        Long lValueOf = a0Var.f19863d != null ? Long.valueOf(r13.f2602d) : null;
        if (lValueOf != null && lValueOf.longValue() != -1) {
            nVar.D = Long.valueOf(lValueOf.longValue());
        }
        io.sentry.protocol.p pVar = new io.sentry.protocol.p();
        pVar.f12602a = b1Var.k().isSendDefaultPii() ? sVar2.a("Set-Cookie") : null;
        pVar.f12603d = b4.O(q(b1Var, sVar2));
        pVar.f12604g = Integer.valueOf(i10);
        ou.e0 e0Var = c0Var.B;
        Long lValueOf2 = e0Var != null ? Long.valueOf(e0Var.b()) : null;
        if (lValueOf2 != null && lValueOf2.longValue() != -1) {
            pVar.f12605r = Long.valueOf(lValueOf2.longValue());
        }
        t4Var.f12271r = nVar;
        t4Var.f12269d.q(pVar);
        b1Var.y(t4Var, h0Var);
    }

    public static final ht.h0 g(rr.f fVar, rr.f fVar2) {
        l.e(fVar, "from");
        l.e(fVar2, "to");
        fVar.s().size();
        fVar2.s().size();
        List listS = fVar.s();
        l.d(listS, "from.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(mq.p.a0(listS, 10));
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(((r0) it.next()).v());
        }
        List listS2 = fVar2.s();
        l.d(listS2, "to.declaredTypeParameters");
        ArrayList arrayList2 = new ArrayList(mq.p.a0(listS2, 10));
        Iterator it2 = listS2.iterator();
        while (it2.hasNext()) {
            ht.b0 b0VarQ = ((r0) it2.next()).q();
            l.d(b0VarQ, "it.defaultType");
            arrayList2.add(se.b.i(b0VarQ));
        }
        return new ht.h0(1, mq.b0.V(o.W0(arrayList, arrayList2)));
    }

    public static final File h(Context context, String str) {
        l.e(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
    
        if (r7 == 16) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cd, code lost:
    
        if (r8 != (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d1, code lost:
    
        r0 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress i(java.lang.String r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.i(java.lang.String, int, int):java.net.InetAddress");
    }

    public static final sq.b j(Enum[] enumArr) {
        l.e(enumArr, "entries");
        return new sq.b(enumArr);
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final String l(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final String[] m(a1.n nVar) {
        l.c(nVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((a1.e) nVar).f19b.toArray(new String[0]);
    }

    public static final String n(String str) throws ParseException {
        l.e(str, "<this>");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date date = simpleDateFormat.parse(str);
            if (date == null) {
                return null;
            }
            return simpleDateFormat.format(date);
        } catch (ParseException unused) {
            return null;
        }
    }

    public static final Object o(rs.m mVar, rs.o oVar) {
        l.e(mVar, "<this>");
        l.e(oVar, "extension");
        if (mVar.l(oVar)) {
            return mVar.k(oVar);
        }
        return null;
    }

    public static final Object p(rs.m mVar, rs.o oVar, int i10) {
        l.e(mVar, "<this>");
        l.e(oVar, "extension");
        mVar.o(oVar);
        i iVar = mVar.f21766a;
        rs.n nVar = oVar.f21773d;
        iVar.getClass();
        rs.b0 b0Var = iVar.f21760a;
        if (!nVar.f21769g) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj = b0Var.get(nVar);
        if (i10 >= (obj == null ? 0 : ((List) obj).size())) {
            return null;
        }
        mVar.o(oVar);
        if (!nVar.f21769g) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj2 = b0Var.get(nVar);
        if (obj2 != null) {
            return oVar.a(((List) obj2).get(i10));
        }
        throw new IndexOutOfBoundsException();
    }

    public static LinkedHashMap q(b1 b1Var, ou.s sVar) {
        if (!b1Var.k().isSendDefaultPii()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = sVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strB = sVar.b(i10);
            if (!io.sentry.util.b.f12801a.contains(strB.toUpperCase(Locale.ROOT))) {
                linkedHashMap.put(strB, sVar.d(i10));
            }
        }
        return linkedHashMap;
    }

    public static jv.a r(kv.a aVar) {
        jv.a aVar2 = lv.a.f15967b;
        if (aVar2 != null) {
            return aVar2;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    public static String t(ot.e eVar, cs.g gVar) {
        if (eVar.a(gVar)) {
            return null;
        }
        return eVar.getDescription();
    }

    public static final boolean u(AssertionError assertionError) {
        Logger logger = u.f6739a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? tt.l.q0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean v(com.survicate.surveys.entities.survey.EventTriggerOccurrenceTimeSettings r10, cq.a r11, long r12) throws java.text.ParseException {
        /*
            java.lang.Long r0 = r10.getPeriodMs()
            java.util.List r1 = r10.getDates()
            java.lang.String r2 = "dates"
            br.l.e(r1, r2)
            int r2 = r1.size()
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 2
            if (r2 == r6) goto L19
        L17:
            r7 = r5
            goto L38
        L19:
            java.lang.Object r2 = r1.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = n(r2)
            if (r2 != 0) goto L26
            goto L17
        L26:
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = n(r1)
            if (r1 != 0) goto L33
            goto L17
        L33:
            ef.c r7 = new ef.c
            r7.<init>(r2, r1)
        L38:
            java.util.Date r1 = new java.util.Date
            r1.<init>(r12)
            java.lang.String r1 = H(r1)
            java.lang.String r1 = n(r1)
            long r8 = r11.f6608c
            long r8 = r8 - r12
            com.survicate.surveys.entities.survey.EventTriggerOccurrenceTimeOperator r10 = r10.getOperator()
            int[] r11 = fq.d.f9031a
            int r10 = r10.ordinal()
            r10 = r11[r10]
            if (r10 == r3) goto Lb3
            if (r10 == r6) goto La8
            r11 = 3
            if (r10 == r11) goto L87
            r11 = 4
            if (r10 != r11) goto L81
            if (r1 == 0) goto Lbe
            if (r7 == 0) goto L7a
            java.lang.String r10 = r7.f8188b
            java.lang.String r11 = r7.f8189c
            int r11 = r1.compareTo(r11)
            if (r11 > 0) goto L74
            int r10 = r1.compareTo(r10)
            if (r10 < 0) goto L74
            r10 = r3
            goto L75
        L74:
            r10 = r4
        L75:
            r10 = r10 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)
        L7a:
            if (r5 == 0) goto Lbe
            boolean r10 = r5.booleanValue()
            return r10
        L81:
            bf.n r10 = new bf.n
            r10.<init>()
            throw r10
        L87:
            if (r1 == 0) goto Lbe
            if (r7 == 0) goto La1
            java.lang.String r10 = r7.f8188b
            java.lang.String r11 = r7.f8189c
            int r11 = r1.compareTo(r11)
            if (r11 > 0) goto L9c
            int r10 = r1.compareTo(r10)
            if (r10 < 0) goto L9c
            goto L9d
        L9c:
            r3 = r4
        L9d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
        La1:
            if (r5 == 0) goto Lbe
            boolean r10 = r5.booleanValue()
            return r10
        La8:
            if (r0 == 0) goto Lbe
            long r10 = r0.longValue()
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 > 0) goto Lbe
            goto Lbd
        Lb3:
            if (r0 == 0) goto Lbe
            long r10 = r0.longValue()
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 < 0) goto Lbe
        Lbd:
            return r3
        Lbe:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.v(com.survicate.surveys.entities.survey.EventTriggerOccurrenceTimeSettings, cq.a, long):boolean");
    }

    public static final void w() {
        try {
            if (f3d == null) {
                a1 a1Var = (a1) ((tg.i) ((tg.p) se.f.c().b(tg.p.class))).f22804o.get();
                l.e(a1Var, "<set-?>");
                f3d = a1Var;
            }
            a1 a1Var2 = f3d;
            if (a1Var2 == null) {
                l.l("sharedSessionRepository");
                throw null;
            }
            if (a1Var2.f22733i) {
                if (a1Var2 != null) {
                    a1Var2.b();
                } else {
                    l.l("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static PorterDuff.Mode x(k3.a aVar) {
        if (aVar == null) {
            return null;
        }
        switch (k3.b.f14011a[aVar.ordinal()]) {
        }
        return null;
    }

    public void B(View view, float f10) {
        if (f0a) {
            try {
                t7.b0.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f0a = false;
            }
        }
        view.setAlpha(f10);
    }

    public void C(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f2c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f1b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2c = true;
        }
        Field field = f1b;
        if (field != null) {
            try {
                f1b.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public float s(View view) {
        if (f0a) {
            try {
                return t7.b0.a(view);
            } catch (NoSuchMethodError unused) {
                f0a = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void y(int i10);

    public abstract void z(Typeface typeface, boolean z10);
}
