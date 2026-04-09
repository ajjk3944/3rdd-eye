package r6;

import a5.d0;
import a5.v;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import g4.j;
import h7.x1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jb.e;
import ne.g;

/* loaded from: classes.dex */
public final class a extends eb.c {

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f21271s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: n, reason: collision with root package name */
    public final boolean f21272n;

    /* renamed from: o, reason: collision with root package name */
    public final x1 f21273o;

    /* renamed from: p, reason: collision with root package name */
    public LinkedHashMap f21274p;

    /* renamed from: q, reason: collision with root package name */
    public float f21275q;

    /* renamed from: r, reason: collision with root package name */
    public float f21276r;

    public a(List list) throws NumberFormatException {
        super(1);
        this.f21275q = -3.4028235E38f;
        this.f21276r = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f21272n = false;
            this.f21273o = null;
            return;
        }
        this.f21272n = true;
        String strL = d0.l((byte[]) list.get(0));
        a5.a.e(strL.startsWith("Format:"));
        x1 x1VarC = x1.c(strL);
        x1VarC.getClass();
        this.f21273o = x1VarC;
        o(new v((byte[]) list.get(1)), g.f17524c);
    }

    public static int n(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, Long.valueOf(j));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    public static long p(String str) {
        Matcher matcher = f21271s.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i10 = d0.f105a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // eb.c
    public final n6.b h(byte[] bArr, int i10, boolean z10) throws NumberFormatException {
        v vVar;
        Charset charset;
        x1 x1Var;
        int i11;
        float f10;
        int i12;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i13;
        PointF pointF;
        int i14;
        int i15;
        float f11;
        float f12;
        float f13;
        boolean z11;
        int i16;
        int i17;
        float f14;
        int i18;
        float f15;
        int i19;
        int i20;
        int iA;
        int i21;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        v vVar2 = new v(i10, bArr);
        Charset charsetA = vVar2.A();
        if (charsetA == null) {
            charsetA = g.f17524c;
        }
        boolean z12 = aVar.f21272n;
        if (!z12) {
            aVar.o(vVar2, charsetA);
        }
        x1 x1VarC = z12 ? aVar.f21273o : null;
        while (true) {
            String strH = vVar2.h(charsetA);
            if (strH == null) {
                return new e(arrayList, arrayList2, 1);
            }
            if (strH.startsWith("Format:")) {
                x1VarC = x1.c(strH);
            } else if (strH.startsWith("Dialogue:")) {
                if (x1VarC == null) {
                    a5.a.B("SsaDecoder", "Skipping dialogue line before complete format: ".concat(strH));
                } else {
                    int i22 = x1VarC.f10267e;
                    a5.a.e(strH.startsWith("Dialogue:"));
                    String[] strArrSplit = strH.substring(9).split(",", i22);
                    if (strArrSplit.length != i22) {
                        a5.a.B("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(strH));
                    } else {
                        long jP = p(strArrSplit[x1VarC.f10263a]);
                        if (jP == -9223372036854775807L) {
                            a5.a.B("SsaDecoder", "Skipping invalid timing: ".concat(strH));
                        } else {
                            long jP2 = p(strArrSplit[x1VarC.f10264b]);
                            if (jP2 == -9223372036854775807L) {
                                a5.a.B("SsaDecoder", "Skipping invalid timing: ".concat(strH));
                            } else {
                                LinkedHashMap linkedHashMap = aVar.f21274p;
                                d dVar = (linkedHashMap == null || (i21 = x1VarC.f10265c) == -1) ? null : (d) linkedHashMap.get(strArrSplit[i21].trim());
                                String str = strArrSplit[x1VarC.f10266d];
                                Matcher matcher = c.f21286a.matcher(str);
                                int i23 = -1;
                                PointF pointF2 = null;
                                while (matcher.find()) {
                                    v vVar3 = vVar2;
                                    String strGroup = matcher.group(1);
                                    strGroup.getClass();
                                    try {
                                        PointF pointFA = c.a(strGroup);
                                        if (pointFA != null) {
                                            pointF2 = pointFA;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    try {
                                        Matcher matcher2 = c.f21289d.matcher(strGroup);
                                        if (matcher2.find()) {
                                            String strGroup2 = matcher2.group(1);
                                            strGroup2.getClass();
                                            iA = d.a(strGroup2);
                                        } else {
                                            iA = -1;
                                        }
                                        if (iA != -1) {
                                            i23 = iA;
                                        }
                                    } catch (RuntimeException unused2) {
                                    }
                                    vVar2 = vVar3;
                                }
                                vVar = vVar2;
                                String strReplace = c.f21286a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f16 = aVar.f21275q;
                                float f17 = aVar.f21276r;
                                SpannableString spannableString = new SpannableString(strReplace);
                                if (dVar != null) {
                                    boolean z13 = dVar.f21296g;
                                    Integer num = dVar.f21293d;
                                    Integer num2 = dVar.f21292c;
                                    if (num2 != null) {
                                        z11 = z13;
                                        charset = charsetA;
                                        x1Var = x1VarC;
                                        i16 = 33;
                                        i17 = 0;
                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        z11 = z13;
                                        charset = charsetA;
                                        x1Var = x1VarC;
                                        i16 = 33;
                                        i17 = 0;
                                    }
                                    if (dVar.j == 3 && num != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i17, spannableString.length(), i16);
                                    }
                                    float f18 = dVar.f21294e;
                                    if (f18 == -3.4028235E38f || f17 == -3.4028235E38f) {
                                        f14 = -3.4028235E38f;
                                        i18 = Integer.MIN_VALUE;
                                    } else {
                                        f14 = f18 / f17;
                                        i18 = 1;
                                    }
                                    boolean z14 = dVar.f21295f;
                                    if (z14 && z11) {
                                        f15 = f14;
                                        i19 = i18;
                                        i20 = 33;
                                        i11 = 0;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        f15 = f14;
                                        i19 = i18;
                                        i20 = 33;
                                        i11 = 0;
                                        if (z14) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (z11) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (dVar.f21297h) {
                                        spannableString.setSpan(new UnderlineSpan(), i11, spannableString.length(), i20);
                                    }
                                    if (dVar.f21298i) {
                                        spannableString.setSpan(new StrikethroughSpan(), i11, spannableString.length(), i20);
                                    }
                                    f10 = f15;
                                    i12 = i19;
                                } else {
                                    charset = charsetA;
                                    x1Var = x1VarC;
                                    i11 = 0;
                                    f10 = -3.4028235E38f;
                                    i12 = Integer.MIN_VALUE;
                                }
                                int i24 = -1;
                                if (i23 != -1) {
                                    i24 = i23;
                                } else if (dVar != null) {
                                    i24 = dVar.f21291b;
                                }
                                switch (i24) {
                                    case 0:
                                    default:
                                        c7.a.z("Unknown alignment: ", i24, "SsaDecoder");
                                    case -1:
                                        alignment2 = null;
                                        break;
                                    case 1:
                                    case 4:
                                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                        alignment2 = alignment;
                                        break;
                                    case 2:
                                    case j.STRING_FIELD_NUMBER /* 5 */:
                                    case j.BYTES_FIELD_NUMBER /* 8 */:
                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                        alignment2 = alignment;
                                        break;
                                    case 3:
                                    case j.STRING_SET_FIELD_NUMBER /* 6 */:
                                    case 9:
                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                        alignment2 = alignment;
                                        break;
                                }
                                int i25 = Integer.MIN_VALUE;
                                switch (i24) {
                                    case 0:
                                    default:
                                        c7.a.z("Unknown alignment: ", i24, "SsaDecoder");
                                    case -1:
                                        i13 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case 4:
                                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                                        i13 = i11;
                                        break;
                                    case 2:
                                    case j.STRING_FIELD_NUMBER /* 5 */:
                                    case j.BYTES_FIELD_NUMBER /* 8 */:
                                        i13 = 1;
                                        break;
                                    case 3:
                                    case j.STRING_SET_FIELD_NUMBER /* 6 */:
                                    case 9:
                                        i13 = 2;
                                        break;
                                }
                                switch (i24) {
                                    case -1:
                                        pointF = pointF2;
                                        break;
                                    case 0:
                                    default:
                                        c7.a.z("Unknown alignment: ", i24, "SsaDecoder");
                                        pointF = pointF2;
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        pointF = pointF2;
                                        i25 = 2;
                                        break;
                                    case 4:
                                    case j.STRING_FIELD_NUMBER /* 5 */:
                                    case j.STRING_SET_FIELD_NUMBER /* 6 */:
                                        pointF = pointF2;
                                        i25 = 1;
                                        break;
                                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                                    case j.BYTES_FIELD_NUMBER /* 8 */:
                                    case 9:
                                        i25 = i11;
                                        pointF = pointF2;
                                        break;
                                }
                                if (pointF == null || f17 == -3.4028235E38f || f16 == -3.4028235E38f) {
                                    if (i13 != 0) {
                                        i15 = 1;
                                        if (i13 != 1) {
                                            i14 = 2;
                                            f11 = i13 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            i14 = 2;
                                            f11 = 0.5f;
                                        }
                                    } else {
                                        i14 = 2;
                                        i15 = 1;
                                        f11 = 0.05f;
                                    }
                                    f12 = i25 != 0 ? i25 != i15 ? i25 != i14 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                    f13 = f11;
                                } else {
                                    float f19 = pointF.x / f16;
                                    f12 = pointF.y / f17;
                                    f13 = f19;
                                }
                                z4.b bVar = new z4.b(spannableString, alignment2, null, null, f12, i11, i25, f13, i13, i12, f10, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                int iN = n(jP2, arrayList2, arrayList);
                                for (int iN2 = n(jP, arrayList2, arrayList); iN2 < iN; iN2++) {
                                    ((List) arrayList.get(iN2)).add(bVar);
                                }
                                aVar = this;
                                vVar2 = vVar;
                                charsetA = charset;
                                x1VarC = x1Var;
                            }
                        }
                    }
                }
                vVar = vVar2;
                charset = charsetA;
                x1Var = x1VarC;
                aVar = this;
                vVar2 = vVar;
                charsetA = charset;
                x1VarC = x1Var;
            } else {
                vVar = vVar2;
                charset = charsetA;
                x1Var = x1VarC;
                aVar = this;
                vVar2 = vVar;
                charsetA = charset;
                x1VarC = x1Var;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(a5.v r28, java.nio.charset.Charset r29) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.a.o(a5.v, java.nio.charset.Charset):void");
    }
}
