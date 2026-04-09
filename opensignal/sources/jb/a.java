package jb;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import fb.f;
import g4.j;
import h7.x1;
import io.sentry.android.core.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qb.v;

/* loaded from: classes.dex */
public final class a extends eb.c {

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f13556s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: n, reason: collision with root package name */
    public final boolean f13557n;

    /* renamed from: o, reason: collision with root package name */
    public final x1 f13558o;

    /* renamed from: p, reason: collision with root package name */
    public LinkedHashMap f13559p;

    /* renamed from: q, reason: collision with root package name */
    public float f13560q;

    /* renamed from: r, reason: collision with root package name */
    public float f13561r;

    public a(List list) throws NumberFormatException {
        super(0);
        this.f13560q = -3.4028235E38f;
        this.f13561r = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f13557n = false;
            this.f13558o = null;
            return;
        }
        this.f13557n = true;
        String strM = v.m((byte[]) list.get(0));
        qb.b.g(strM.startsWith("Format:"));
        x1 x1VarB = x1.b(strM);
        x1VarB.getClass();
        this.f13558o = x1VarB;
        o(new f((byte[]) list.get(1)));
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
        Matcher matcher = f13556s.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i10 = v.f20828a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // eb.c
    public final eb.e f(byte[] bArr, int i10, boolean z10) throws NumberFormatException {
        f fVar;
        x1 x1Var;
        float f10;
        int i11;
        float f11;
        int i12;
        Layout.Alignment alignment;
        int i13;
        int i14;
        float f12;
        float f13;
        float f14;
        boolean z11;
        float f15;
        int i15;
        float f16;
        int i16;
        int i17;
        int iA;
        int i18;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        f fVar2 = new f(i10, bArr);
        boolean z12 = aVar.f13557n;
        if (!z12) {
            aVar.o(fVar2);
        }
        x1 x1VarB = z12 ? aVar.f13558o : null;
        while (true) {
            String strE = fVar2.e();
            if (strE == null) {
                return new e(arrayList, arrayList2, 0);
            }
            if (strE.startsWith("Format:")) {
                x1VarB = x1.b(strE);
            } else if (strE.startsWith("Dialogue:")) {
                if (x1VarB == null) {
                    e0.p("SsaDecoder", strE.length() != 0 ? "Skipping dialogue line before complete format: ".concat(strE) : new String("Skipping dialogue line before complete format: "));
                } else {
                    int i19 = x1VarB.f10267e;
                    qb.b.g(strE.startsWith("Dialogue:"));
                    String[] strArrSplit = strE.substring(9).split(",", i19);
                    if (strArrSplit.length != i19) {
                        e0.p("SsaDecoder", strE.length() != 0 ? "Skipping dialogue line with fewer columns than format: ".concat(strE) : new String("Skipping dialogue line with fewer columns than format: "));
                    } else {
                        long jP = p(strArrSplit[x1VarB.f10263a]);
                        if (jP == -9223372036854775807L) {
                            e0.p("SsaDecoder", strE.length() != 0 ? "Skipping invalid timing: ".concat(strE) : new String("Skipping invalid timing: "));
                        } else {
                            long jP2 = p(strArrSplit[x1VarB.f10264b]);
                            if (jP2 == -9223372036854775807L) {
                                e0.p("SsaDecoder", strE.length() != 0 ? "Skipping invalid timing: ".concat(strE) : new String("Skipping invalid timing: "));
                            } else {
                                LinkedHashMap linkedHashMap = aVar.f13559p;
                                d dVar = (linkedHashMap == null || (i18 = x1VarB.f10265c) == -1) ? null : (d) linkedHashMap.get(strArrSplit[i18].trim());
                                String str = strArrSplit[x1VarB.f10266d];
                                Matcher matcher = c.f13571a.matcher(str);
                                int i20 = -1;
                                PointF pointF = null;
                                while (matcher.find()) {
                                    f fVar3 = fVar2;
                                    String strGroup = matcher.group(1);
                                    strGroup.getClass();
                                    try {
                                        PointF pointFA = c.a(strGroup);
                                        if (pointFA != null) {
                                            pointF = pointFA;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    try {
                                        Matcher matcher2 = c.f13574d.matcher(strGroup);
                                        if (matcher2.find()) {
                                            String strGroup2 = matcher2.group(1);
                                            strGroup2.getClass();
                                            iA = d.a(strGroup2);
                                        } else {
                                            iA = -1;
                                        }
                                        if (iA != -1) {
                                            i20 = iA;
                                        }
                                    } catch (RuntimeException unused2) {
                                    }
                                    fVar2 = fVar3;
                                }
                                fVar = fVar2;
                                String strReplace = c.f13571a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f17 = aVar.f13560q;
                                float f18 = aVar.f13561r;
                                SpannableString spannableString = new SpannableString(strReplace);
                                if (dVar != null) {
                                    boolean z13 = dVar.f13580f;
                                    Integer num = dVar.f13577c;
                                    if (num != null) {
                                        z11 = z13;
                                        x1Var = x1VarB;
                                        f10 = f17;
                                        spannableString.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        z11 = z13;
                                        x1Var = x1VarB;
                                        f10 = f17;
                                    }
                                    float f19 = dVar.f13578d;
                                    if (f19 == -3.4028235E38f || f18 == -3.4028235E38f) {
                                        f15 = -3.4028235E38f;
                                        i15 = Integer.MIN_VALUE;
                                    } else {
                                        f15 = f19 / f18;
                                        i15 = 1;
                                    }
                                    boolean z14 = dVar.f13579e;
                                    if (z14 && z11) {
                                        f16 = f15;
                                        i16 = i15;
                                        i17 = 33;
                                        i11 = 0;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        f16 = f15;
                                        i16 = i15;
                                        i17 = 33;
                                        i11 = 0;
                                        if (z14) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (z11) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (dVar.f13581g) {
                                        spannableString.setSpan(new UnderlineSpan(), i11, spannableString.length(), i17);
                                    }
                                    if (dVar.f13582h) {
                                        spannableString.setSpan(new StrikethroughSpan(), i11, spannableString.length(), i17);
                                    }
                                    i12 = i16;
                                    f11 = f16;
                                } else {
                                    x1Var = x1VarB;
                                    f10 = f17;
                                    i11 = 0;
                                    f11 = -3.4028235E38f;
                                    i12 = Integer.MIN_VALUE;
                                }
                                int i21 = -1;
                                if (i20 != -1) {
                                    i21 = i20;
                                } else if (dVar != null) {
                                    i21 = dVar.f13576b;
                                }
                                switch (i21) {
                                    case 0:
                                    default:
                                        c7.a.y("Unknown alignment: ", 30, i21, "SsaDecoder");
                                    case -1:
                                        alignment = null;
                                        break;
                                    case 1:
                                    case 4:
                                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                        break;
                                    case 2:
                                    case j.STRING_FIELD_NUMBER /* 5 */:
                                    case j.BYTES_FIELD_NUMBER /* 8 */:
                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                        break;
                                    case 3:
                                    case j.STRING_SET_FIELD_NUMBER /* 6 */:
                                    case 9:
                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                        break;
                                }
                                int i22 = Integer.MIN_VALUE;
                                switch (i21) {
                                    case 0:
                                    default:
                                        c7.a.y("Unknown alignment: ", 30, i21, "SsaDecoder");
                                    case -1:
                                        i11 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case 4:
                                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                                        break;
                                    case 2:
                                    case j.STRING_FIELD_NUMBER /* 5 */:
                                    case j.BYTES_FIELD_NUMBER /* 8 */:
                                        i11 = 1;
                                        break;
                                    case 3:
                                    case j.STRING_SET_FIELD_NUMBER /* 6 */:
                                    case 9:
                                        i11 = 2;
                                        break;
                                }
                                switch (i21) {
                                    case -1:
                                        break;
                                    case 0:
                                    default:
                                        c7.a.y("Unknown alignment: ", 30, i21, "SsaDecoder");
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        i22 = 2;
                                        break;
                                    case 4:
                                    case j.STRING_FIELD_NUMBER /* 5 */:
                                    case j.STRING_SET_FIELD_NUMBER /* 6 */:
                                        i22 = 1;
                                        break;
                                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                                    case j.BYTES_FIELD_NUMBER /* 8 */:
                                    case 9:
                                        i22 = 0;
                                        break;
                                }
                                if (pointF == null || f18 == -3.4028235E38f || f10 == -3.4028235E38f) {
                                    if (i11 != 0) {
                                        i14 = 1;
                                        if (i11 != 1) {
                                            i13 = 2;
                                            f12 = i11 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            i13 = 2;
                                            f12 = 0.5f;
                                        }
                                    } else {
                                        i13 = 2;
                                        i14 = 1;
                                        f12 = 0.05f;
                                    }
                                    f13 = i22 != 0 ? i22 != i14 ? i22 != i13 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                    f14 = f12;
                                } else {
                                    f14 = pointF.x / f10;
                                    f13 = pointF.y / f18;
                                }
                                eb.b bVar = new eb.b(spannableString, alignment, null, null, f13, 0, i22, f14, i11, i12, f11, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                int iN = n(jP2, arrayList2, arrayList);
                                for (int iN2 = n(jP, arrayList2, arrayList); iN2 < iN; iN2++) {
                                    ((List) arrayList.get(iN2)).add(bVar);
                                }
                                aVar = this;
                                fVar2 = fVar;
                                x1VarB = x1Var;
                            }
                        }
                    }
                }
                fVar = fVar2;
                x1Var = x1VarB;
                aVar = this;
                fVar2 = fVar;
                x1VarB = x1Var;
            } else {
                fVar = fVar2;
                x1Var = x1VarB;
                aVar = this;
                fVar2 = fVar;
                x1VarB = x1Var;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(fb.f r26) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.a.o(fb.f):void");
    }
}
