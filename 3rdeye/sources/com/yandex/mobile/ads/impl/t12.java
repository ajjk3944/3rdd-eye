package com.yandex.mobile.ads.impl;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.av;
import com.yandex.mobile.ads.impl.v12;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class t12 extends jy1 {

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f33366r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: m, reason: collision with root package name */
    private final boolean f33367m;

    /* renamed from: n, reason: collision with root package name */
    private final u12 f33368n;

    /* renamed from: o, reason: collision with root package name */
    private LinkedHashMap f33369o;

    /* renamed from: p, reason: collision with root package name */
    private float f33370p = -3.4028235E38f;

    /* renamed from: q, reason: collision with root package name */
    private float f33371q = -3.4028235E38f;

    public t12(List<byte[]> list) throws NumberFormatException {
        if (list == null || list.isEmpty()) {
            this.f33367m = false;
            this.f33368n = null;
            return;
        }
        this.f33367m = true;
        String strA = s82.a(list.get(0));
        zf.a(strA.startsWith("Format:"));
        this.f33368n = (u12) zf.a(u12.a(strA));
        a(new uf1(list.get(1)));
    }

    private static int a(long j4, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j4) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j4) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j4));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    @Override // com.yandex.mobile.ads.impl.jy1
    public final b32 a(byte[] bArr, int i, boolean z10) throws NumberFormatException {
        uf1 uf1Var;
        u12 u12Var;
        float f10;
        int i10;
        Layout.Alignment alignment;
        int i11;
        int i12;
        int i13;
        int i14;
        t12 t12Var = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        uf1 uf1Var2 = new uf1(i, bArr);
        if (!t12Var.f33367m) {
            t12Var.a(uf1Var2);
        }
        u12 u12VarA = t12Var.f33367m ? t12Var.f33368n : null;
        while (true) {
            String strJ = uf1Var2.j();
            if (strJ != null) {
                if (strJ.startsWith("Format:")) {
                    u12VarA = u12.a(strJ);
                } else if (strJ.startsWith("Dialogue:")) {
                    if (u12VarA == null) {
                        rs0.d("SsaDecoder", "Skipping dialogue line before complete format: ".concat(strJ));
                    } else if (strJ.startsWith("Dialogue:")) {
                        String[] strArrSplit = strJ.substring(9).split(StringUtils.COMMA, u12VarA.f33865e);
                        if (strArrSplit.length != u12VarA.f33865e) {
                            rs0.d("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(strJ));
                        } else {
                            long jA = a(strArrSplit[u12VarA.f33861a]);
                            if (jA == -9223372036854775807L) {
                                rs0.d("SsaDecoder", "Skipping invalid timing: ".concat(strJ));
                            } else {
                                long jA2 = a(strArrSplit[u12VarA.f33862b]);
                                if (jA2 == -9223372036854775807L) {
                                    rs0.d("SsaDecoder", "Skipping invalid timing: ".concat(strJ));
                                } else {
                                    LinkedHashMap linkedHashMap = t12Var.f33369o;
                                    v12 v12Var = (linkedHashMap == null || (i14 = u12VarA.f33863c) == -1) ? null : (v12) linkedHashMap.get(strArrSplit[i14].trim());
                                    String str = strArrSplit[u12VarA.f33864d];
                                    v12.b bVarA = v12.b.a(str);
                                    String strReplace = v12.b.c(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f11 = t12Var.f33370p;
                                    float f12 = t12Var.f33371q;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    av.a aVarA = new av.a().a(spannableString);
                                    if (v12Var != null) {
                                        if (v12Var.f34286c != null) {
                                            uf1Var = uf1Var2;
                                            u12Var = u12VarA;
                                            f10 = f11;
                                            spannableString.setSpan(new ForegroundColorSpan(v12Var.f34286c.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            uf1Var = uf1Var2;
                                            u12Var = u12VarA;
                                            f10 = f11;
                                        }
                                        if (v12Var.f34292j == 3 && v12Var.f34287d != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(v12Var.f34287d.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f13 = v12Var.f34288e;
                                        if (f13 != -3.4028235E38f && f12 != -3.4028235E38f) {
                                            aVarA.b(1, f13 / f12);
                                        }
                                        boolean z11 = v12Var.f34289f;
                                        if (z11 && v12Var.f34290g) {
                                            i12 = 0;
                                            i13 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i12 = 0;
                                            i13 = 33;
                                            if (z11) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (v12Var.f34290g) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (v12Var.f34291h) {
                                            spannableString.setSpan(new UnderlineSpan(), i12, spannableString.length(), i13);
                                        }
                                        if (v12Var.i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i12, spannableString.length(), i13);
                                        }
                                    } else {
                                        uf1Var = uf1Var2;
                                        u12Var = u12VarA;
                                        f10 = f11;
                                    }
                                    int i15 = bVarA.f34307a;
                                    if (i15 != -1) {
                                        i10 = i15;
                                    } else {
                                        i10 = v12Var != null ? v12Var.f34285b : -1;
                                    }
                                    switch (i10) {
                                        case 0:
                                        default:
                                            kr0.a("Unknown alignment: ", i10, "SsaDecoder");
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    av.a aVarB = aVarA.b(alignment);
                                    int i16 = RecyclerView.UNDEFINED_DURATION;
                                    switch (i10) {
                                        case 0:
                                        default:
                                            kr0.a("Unknown alignment: ", i10, "SsaDecoder");
                                        case -1:
                                            i11 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i11 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i11 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i11 = 2;
                                            break;
                                    }
                                    av.a aVarB2 = aVarB.b(i11);
                                    switch (i10) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            kr0.a("Unknown alignment: ", i10, "SsaDecoder");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i16 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i16 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i16 = 0;
                                            break;
                                    }
                                    aVarB2.a(i16);
                                    PointF pointF = bVarA.f34308b;
                                    if (pointF != null && f12 != -3.4028235E38f && f10 != -3.4028235E38f) {
                                        aVarA.b(pointF.x / f10);
                                        aVarA.a(0, bVarA.f34308b.y / f12);
                                    } else {
                                        int iC = aVarA.c();
                                        aVarA.b(iC != 0 ? iC != 1 ? iC != 2 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f);
                                        int iB = aVarA.b();
                                        aVarA.a(0, iB != 0 ? iB != 1 ? iB != 2 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f);
                                    }
                                    av avVarA = aVarA.a();
                                    int iA = a(jA2, arrayList2, arrayList);
                                    for (int iA2 = a(jA, arrayList2, arrayList); iA2 < iA; iA2++) {
                                        ((List) arrayList.get(iA2)).add(avVarA);
                                    }
                                    t12Var = this;
                                    uf1Var2 = uf1Var;
                                    u12VarA = u12Var;
                                }
                            }
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                    uf1Var = uf1Var2;
                    u12Var = u12VarA;
                    t12Var = this;
                    uf1Var2 = uf1Var;
                    u12VarA = u12Var;
                } else {
                    uf1Var = uf1Var2;
                    u12Var = u12VarA;
                    t12Var = this;
                    uf1Var2 = uf1Var;
                    u12VarA = u12Var;
                }
            } else {
                return new w12(arrayList, arrayList2);
            }
        }
    }

    private void a(uf1 uf1Var) throws NumberFormatException {
        while (true) {
            String strJ = uf1Var.j();
            if (strJ == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strJ)) {
                while (true) {
                    String strJ2 = uf1Var.j();
                    if (strJ2 == null || (uf1Var.a() != 0 && uf1Var.g() == 91)) {
                        break;
                    }
                    String[] strArrSplit = strJ2.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    if (strArrSplit.length == 2) {
                        String strB = xf.b(strArrSplit[0].trim());
                        strB.getClass();
                        if (strB.equals("playresx")) {
                            this.f33370p = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strB.equals("playresy")) {
                            try {
                                this.f33371q = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strJ)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                v12.a aVarA = null;
                while (true) {
                    String strJ3 = uf1Var.j();
                    if (strJ3 == null || (uf1Var.a() != 0 && uf1Var.g() == 91)) {
                        break;
                    }
                    if (strJ3.startsWith("Format:")) {
                        aVarA = v12.a.a(strJ3);
                    } else if (strJ3.startsWith("Style:")) {
                        if (aVarA == null) {
                            rs0.d("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(strJ3));
                        } else {
                            v12 v12VarA = v12.a(strJ3, aVarA);
                            if (v12VarA != null) {
                                linkedHashMap.put(v12VarA.f34284a, v12VarA);
                            }
                        }
                    }
                }
                this.f33369o = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strJ)) {
                rs0.c("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strJ)) {
                return;
            }
        }
    }

    private static long a(String str) {
        Matcher matcher = f33366r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = s82.f32899a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }
}
