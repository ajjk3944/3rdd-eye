package xu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewGroup;
import br.b0;
import com.google.android.gms.internal.measurement.b4;
import ht.x;
import io.sentry.c4;
import ir.f0;
import ir.v;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import lr.j1;
import lr.m1;
import lr.r;
import lr.r1;
import lr.z1;
import mq.o;
import n0.p;
import rr.r0;
import t7.z;
import tt.s;
import wt.q;
import y1.l0;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f25559a = true;

    /* renamed from: b, reason: collision with root package name */
    public static q3.a f25560b;

    public static boolean A(rr.d dVar) {
        br.l.e(dVar, "callableMemberDescriptor");
        if (!as.h.f2222d.contains(dVar.getName())) {
            return false;
        }
        if (o.k0(as.h.f2221c, xs.d.c(dVar)) && dVar.Y().isEmpty()) {
            return true;
        }
        if (!or.h.z(dVar)) {
            return false;
        }
        Collection collectionP = dVar.p();
        br.l.d(collectionP, "overriddenDescriptors");
        Collection<rr.d> collection = collectionP;
        if (collection.isEmpty()) {
            return false;
        }
        for (rr.d dVar2 : collection) {
            br.l.d(dVar2, "it");
            if (A(dVar2)) {
                return true;
            }
        }
        return false;
    }

    public static final String B(String str, String str2) {
        br.l.e(str2, "defaultValue");
        return (str == null || tt.l.D0(str)) ? str2 : str;
    }

    public static final String C(String str, String str2) {
        return (str == null || tt.l.D0(str)) ? str2 : str;
    }

    public static pq.c D(pq.c cVar) {
        br.l.e(cVar, "<this>");
        rq.c cVar2 = cVar instanceof rq.c ? (rq.c) cVar : null;
        if (cVar2 == null || (cVar = cVar2.f21667g) != null) {
            return cVar;
        }
        pq.e eVar = (pq.e) cVar2.m().Y(pq.d.f20620a);
        pq.c fVar = eVar != null ? new bu.f((q) eVar, cVar2) : cVar2;
        cVar2.f21667g = fVar;
        return fVar;
    }

    public static boolean F(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final boolean G(int i10, String str) {
        char cCharAt = str.charAt(i10);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    public static final double H(ar.a aVar) {
        int i10 = ut.d.f23699b;
        ut.f fVar = new ut.f(System.nanoTime() - ut.d.f23698a);
        aVar.c();
        return ut.a.toDouble-impl(fVar.elapsedNow-UwyO8pc(), TimeUnit.MILLISECONDS);
    }

    public static final lq.l I(uv.a aVar) {
        int i10 = ut.d.f23699b;
        return new lq.l(aVar.c(), Double.valueOf(ut.a.toDouble-impl(new ut.f(System.nanoTime() - ut.d.f23698a).elapsedNow-UwyO8pc(), TimeUnit.MILLISECONDS)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v17, types: [sb.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList O(fb.f r31) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xu.l.O(fb.f):java.util.ArrayList");
    }

    public static final boolean P(x xVar) {
        rr.i iVarP = xVar.Z().p();
        if (iVarP != null && ts.h.b(iVarP) && !xs.d.g((rr.f) iVarP).equals(or.o.f19719g)) {
            return true;
        }
        rr.i iVarP2 = xVar.Z().p();
        r0 r0Var = iVarP2 instanceof r0 ? (r0) iVarP2 : null;
        return r0Var == null ? false : P(se.b.D(r0Var));
    }

    public static final void Q(Object[] objArr, int i10, int i11) {
        br.l.e(objArr, "<this>");
        while (i10 < i11) {
            objArr[i10] = null;
            i10++;
        }
    }

    public static final String X(int i10, p pVar) {
        return ((Resources) pVar.i(l0.f25736c)).getString(i10);
    }

    public static void Y(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            z.b(viewGroup, z10);
        } else if (f25559a) {
            try {
                z.b(viewGroup, z10);
            } catch (NoSuchMethodError unused) {
                f25559a = false;
            }
        }
    }

    public static final String Z(int i10) {
        if (i10 == 0) {
            return "0";
        }
        char[] cArr = dv.b.f7591a;
        int i11 = 0;
        char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
        while (i11 < 8 && cArr2[i11] == '0') {
            i11++;
        }
        b4.e(i11, 8, 8);
        return new String(cArr2, i11, 8 - i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(z0.m r20, final boolean r21, final int r22, n0.p r23, final int r24) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xu.l.a(z0.m, boolean, int, n0.p, int):void");
    }

    public static String a0(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c4 = charArray[i10];
                    if (c4 >= 'A' && c4 <= 'Z') {
                        charArray[i10] = (char) (c4 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static final String b(Object[] objArr, int i10, int i11, mq.f fVar) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == fVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String string = sb2.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public static final String b0(String str) {
        br.l.e(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        br.l.d(string, "builder.toString()");
        return string;
    }

    public static final boolean c(int i10, int i11, int i12, byte[] bArr, byte[] bArr2) {
        br.l.e(bArr, "a");
        br.l.e(bArr2, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static String c0(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c4 = charArray[i10];
                    if (c4 >= 'a' && c4 <= 'z') {
                        charArray[i10] = (char) (c4 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static final String d(String str) {
        char cCharAt;
        br.l.e(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        String strSubstring = str.substring(1);
        br.l.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        return upperCase + strSubstring;
    }

    public static Object d0(ar.n nVar, Object obj, pq.c cVar) {
        br.l.e(nVar, "<this>");
        pq.h hVarM = cVar.m();
        Object dVar = hVarM == pq.i.f20621a ? new qq.d(cVar) : new qq.e(cVar, hVarM);
        b0.c(2, nVar);
        return nVar.w(obj, dVar);
    }

    public static final void e(long j, long j7, long j10) {
        if ((j7 | j10) < 0 || j7 > j || j - j7 < j10) {
            StringBuilder sbK = w.g.k(j, "size=", " offset=");
            sbK.append(j7);
            sbK.append(" byteCount=");
            sbK.append(j10);
            throw new ArrayIndexOutOfBoundsException(sbK.toString());
        }
    }

    public static int e0(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0 : 5;
        }
        return 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] h(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jArr[i10] = iArr[i10];
        }
        return jArr;
    }

    public static fn.a i(bn.d dVar, boolean z10) {
        int i10;
        int i11;
        br.l.e(dVar, "result");
        if (dVar instanceof bn.a) {
            bn.a aVar = (bn.a) dVar;
            return new fn.a(qk.l.connectivity_assistant_error_title, qk.l.connectivity_assistant_error_status, qk.l.connectivity_assistant_error_description, null, bh.g.TESTING, Integer.valueOf(qk.l.connectivity_assistant_button_run_again_label), qk.l.connectivity_assistant_button_close_label, fn.c.RUN_AGAIN, null, new bn.a(aVar.f2832a, aVar.f2833b), 264);
        }
        if (!(dVar instanceof bn.b)) {
            if (!(dVar instanceof bn.c)) {
                throw new bf.n();
            }
            if (z10) {
                bn.c cVar = (bn.c) dVar;
                return new fn.a(qk.l.connectivity_assistant_done_title, qk.l.connectivity_assistant_status_connected_status, qk.l.connectivity_assistant_status_connected_description, null, bh.g.CONNECTED_VIA_WIFI, Integer.valueOf(qk.l.connectivity_assistant_button_run_again_label), qk.l.connectivity_assistant_button_close_label, fn.c.RUN_AGAIN, null, new bn.c(cVar.f2837a, cVar.f2838b), 264);
            }
            bn.c cVar2 = (bn.c) dVar;
            return new fn.a(qk.l.connectivity_assistant_done_title, qk.l.connectivity_assistant_status_connected_status, qk.l.connectivity_assistant_status_connected_description, null, bh.g.CONNECTED_VIA_MOBILE, Integer.valueOf(qk.l.connectivity_assistant_button_run_again_label), qk.l.connectivity_assistant_button_close_label, fn.c.RUN_AGAIN, null, new bn.c(cVar2.f2837a, cVar2.f2838b), 264);
        }
        bn.b bVar = (bn.b) dVar;
        bh.a aVar2 = bVar.f2834a;
        bh.e eVar = aVar2.f2747d;
        List list = aVar2.f2749f;
        br.l.e(eVar, "assistantExplanation");
        switch (tk.a.f22878a[eVar.ordinal()]) {
            case 1:
                i10 = qk.l.connectivity_assistant_mobile_data_reason_policy;
                break;
            case 2:
                i10 = qk.l.connectivity_assistant_mobile_data_reason_carrier;
                break;
            case 3:
                i10 = qk.l.connectivity_assistant_mobile_data_reason_thermal;
                break;
            case 4:
                i10 = qk.l.connectivity_assistant_mobile_data_reason_airplane_mode_on;
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                i10 = qk.l.connectivity_assistant_mobile_data_reason_data_disabled;
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                i10 = qk.l.connectivity_assistant_mobile_data_reason_roaming_data_disabled;
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                i10 = qk.l.connectivity_assistant_connected_to_mobile_network_but_has_internet_issues;
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                i10 = qk.l.connectivity_assistant_connected_to_wifi_requires_login;
                break;
            case 9:
                i10 = qk.l.connectivity_assistant_connected_to_wifi_but_has_internet_issues;
                break;
            case 10:
                i10 = qk.l.connectivity_assistant_problem_with_internet_connection;
                break;
            case 11:
                i10 = qk.l.connectivity_assistant_poor_wifi_signal;
                break;
            case 12:
                i10 = qk.l.connectivity_assistant_poor_4g_mobile_signal;
                break;
            case 13:
                i10 = qk.l.connectivity_assistant_slow_mobile_connection_data_saver_on;
                break;
            case 14:
                i10 = qk.l.connectivity_assistant_mobile_connection_slow;
                break;
            case 15:
                i10 = qk.l.connectivity_assistant_internet_connection_slower_than_usual;
                break;
            case 16:
                i10 = qk.l.connectivity_assistant_connected_to_2g_network;
                break;
            case 17:
                i10 = qk.l.connectivity_assistant_poor_3g_mobile_signal;
                break;
            case 18:
                i10 = qk.l.connectivity_assistant_poor_5g_mobile_signal;
                break;
            case 19:
                i10 = qk.l.connectivity_assistant_mobile_network_congested;
                break;
            default:
                throw new bf.n();
        }
        int i12 = i10;
        int i13 = fn.b.f9024a[aVar2.f2746c.ordinal()];
        if (i13 == 1) {
            i11 = qk.l.connectivity_assistant_status_not_connected;
        } else {
            if (i13 != 2) {
                throw new bf.n();
            }
            i11 = qk.l.connectivity_assistant_status_possible_issues;
        }
        int i14 = i11;
        Integer numValueOf = !list.isEmpty() ? Integer.valueOf(qk.l.connectivity_assistant_button_fix_label) : null;
        fn.c cVar3 = list.isEmpty() ? null : fn.c.FIX;
        int i15 = qk.l.connectivity_assistant_done_title;
        int i16 = aVar2.f2745b;
        return new fn.a(i15, i14, i12, Integer.valueOf(i16), aVar2.f2748e, numValueOf, qk.l.connectivity_assistant_button_close_label, cVar3, null, bVar, 256);
    }

    public static FileOutputStream j(File file, FileOutputStream fileOutputStream, boolean z10) {
        return c4.c().k().isTracingEnabled() ? new io.sentry.instrumentation.file.f(io.sentry.instrumentation.file.f.b(file, fileOutputStream, z10)) : fileOutputStream;
    }

    public static FileOutputStream k(FileOutputStream fileOutputStream, File file) {
        return c4.c().k().isTracingEnabled() ? new io.sentry.instrumentation.file.f(io.sentry.instrumentation.file.f.b(file, fileOutputStream, false)) : fileOutputStream;
    }

    public static ColorFilter l(int i10, k3.a aVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object objI = a2.c.i(aVar);
            if (objI != null) {
                return a2.c.a(i10, objI);
            }
            return null;
        }
        PorterDuff.Mode modeX = a.a.x(aVar);
        if (modeX != null) {
            return new PorterDuffColorFilter(i10, modeX);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static pq.c m(ar.n nVar, Object obj, pq.c cVar) {
        br.l.e(nVar, "<this>");
        br.l.e(cVar, "completion");
        if (nVar instanceof rq.a) {
            return ((rq.a) nVar).o(obj, cVar);
        }
        pq.h hVarM = cVar.m();
        return hVarM == pq.i.f20621a ? new qq.b(nVar, obj, cVar) : new qq.c(cVar, hVarM, nVar, obj);
    }

    public static boolean o(String str, String str2) {
        char c4;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i10 = 0; i10 < length; i10++) {
                if (str.charAt(i10) == str2.charAt(i10) || ((c4 = (char) ((r3 | ' ') - 97)) < 26 && c4 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static Long p(String str) throws ParseException {
        Date date;
        br.l.e(str, "dateTimeIso");
        String strL0 = s.l0(str, "Z", "+00:00");
        String strConcat = tt.l.u0(3, strL0).concat(tt.l.Z0(strL0));
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        br.l.e(strConcat, "input");
        try {
            date = simpleDateFormat.parse(strConcat);
        } catch (ParseException unused) {
        }
        Long lValueOf = date != null ? Long.valueOf(date.getTime()) : null;
        if (lValueOf != null) {
            return lValueOf;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale);
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            Date date2 = simpleDateFormat2.parse(strConcat);
            if (date2 != null) {
                return Long.valueOf(date2.getTime());
            }
            return null;
        } catch (ParseException unused2) {
            return null;
        }
    }

    public static ColorStateList q(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListC = h3.c.c(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListC;
    }

    public static ColorStateList r(Context context, io.sentry.k kVar, int i10) {
        int resourceId;
        ColorStateList colorStateListC;
        TypedArray typedArray = (TypedArray) kVar.f12398g;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListC = h3.c.c(context, resourceId)) == null) ? kVar.T(i10) : colorStateListC;
    }

    public static Drawable t(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable drawableR;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (drawableR = ic.a.r(context, resourceId)) == null) ? typedArray.getDrawable(i10) : drawableR;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, lq.h] */
    public static final Field u(v vVar) {
        br.l.e(vVar, "<this>");
        j1 j1VarC = z1.c(vVar);
        if (j1VarC != null) {
            return (Field) j1VarC.E.getValue();
        }
        return null;
    }

    public static final Method v(ir.g gVar) {
        mr.g gVarZ;
        br.l.e(gVar, "<this>");
        r rVarA = z1.a(gVar);
        Member memberB = (rVarA == null || (gVarZ = rVarA.z()) == null) ? null : gVarZ.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }

    public static final Type w(br.m mVar) {
        br.l.e(mVar, "<this>");
        r1 r1Var = ((m1) mVar).f15645d;
        Type type = r1Var != null ? (Type) r1Var.c() : null;
        if (type != null) {
            return type;
        }
        r1 r1Var2 = ((m1) mVar).f15645d;
        Type type2 = r1Var2 != null ? (Type) r1Var2.c() : null;
        return type2 != null ? type2 : f0.i(mVar, false);
    }

    public static final Object x(h4.b bVar, h4.e eVar, Serializable serializable) {
        br.l.e(bVar, "<this>");
        br.l.e(eVar, "key");
        Object objCopyOf = bVar.f9890a.get(eVar);
        if (objCopyOf instanceof byte[]) {
            byte[] bArr = (byte[]) objCopyOf;
            objCopyOf = Arrays.copyOf(bArr, bArr.length);
            br.l.d(objCopyOf, "copyOf(this, size)");
        }
        return objCopyOf == null ? serializable : objCopyOf;
    }

    public static int z(Context context, int i10) throws Resources.NotFoundException {
        if (i10 == 0) {
            return 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, ed.l.MaterialTextAppearance);
        TypedValue typedValue = new TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(ed.l.MaterialTextAppearance_lineHeight, typedValue);
        if (!value) {
            value = typedArrayObtainStyledAttributes.getValue(ed.l.MaterialTextAppearance_android_lineHeight, typedValue);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (value) {
            return typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public boolean E() {
        return false;
    }

    public abstract void J();

    public abstract boolean L(int i10, KeyEvent keyEvent);

    public boolean M(KeyEvent keyEvent) {
        return false;
    }

    public boolean N() {
        return false;
    }

    public abstract void R(boolean z10);

    public abstract void S(boolean z10);

    public abstract void T();

    public abstract void U(boolean z10);

    public abstract void V(CharSequence charSequence);

    public n.a W(io.sentry.internal.debugmeta.c cVar) {
        return null;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void n(boolean z10);

    public abstract int s();

    public abstract Context y();

    public void K() {
    }
}
