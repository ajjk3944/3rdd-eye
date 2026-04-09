package com.yandex.mobile.ads.impl;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;

/* loaded from: classes3.dex */
final class h72 {
    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i10, i72 i72Var, f72 f72Var, Map map, int i11) {
        f72 f72Var2;
        if (i72Var.k() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(i72Var.k()), i, i10, 33);
        }
        if (i72Var.q()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i10, 33);
        }
        if (i72Var.r()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i10, 33);
        }
        if (i72Var.p()) {
            c12.a(spannableStringBuilder, new ForegroundColorSpan(i72Var.b()), i, i10);
        }
        if (i72Var.o()) {
            c12.a(spannableStringBuilder, new BackgroundColorSpan(i72Var.a()), i, i10);
        }
        if (i72Var.c() != null) {
            c12.a(spannableStringBuilder, new TypefaceSpan(i72Var.c()), i, i10);
        }
        if (i72Var.n() != null) {
            i72Var.n().getClass();
            c12.a(spannableStringBuilder, new f42(), i, i10);
        }
        int i12 = i72Var.i();
        if (i12 == 2) {
            while (true) {
                f72Var2 = null;
                if (f72Var == null) {
                    f72Var = null;
                    break;
                }
                i72 i72VarA = a(f72Var.f27232f, f72Var.c(), map);
                if (i72VarA != null && i72VarA.i() == 1) {
                    break;
                } else {
                    f72Var = f72Var.f27235j;
                }
            }
            if (f72Var != null) {
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(f72Var);
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        break;
                    }
                    f72 f72Var3 = (f72) arrayDeque.pop();
                    i72 i72VarA2 = a(f72Var3.f27232f, f72Var3.c(), map);
                    if (i72VarA2 != null && i72VarA2.i() == 3) {
                        f72Var2 = f72Var3;
                        break;
                    }
                    for (int iA = f72Var3.a() - 1; iA >= 0; iA--) {
                        arrayDeque.push(f72Var3.a(iA));
                    }
                }
                if (f72Var2 != null) {
                    if (f72Var2.a() != 1 || f72Var2.a(0).f27228b == null) {
                        rs0.c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                    } else {
                        String str = f72Var2.a(0).f27228b;
                        int i13 = s82.f32899a;
                        i72 i72VarA3 = a(f72Var2.f27232f, f72Var2.c(), map);
                        if (i72VarA3 == null || i72VarA3.h() == -1) {
                            a(f72Var.f27232f, f72Var.c(), map);
                        }
                        spannableStringBuilder.setSpan(new ts1(), i, i10, 33);
                    }
                }
            }
        } else if (i12 == 3 || i12 == 4) {
            spannableStringBuilder.setSpan(new u00(), i, i10, 33);
        }
        if (i72Var.m()) {
            c12.a(spannableStringBuilder, new sf0(), i, i10);
        }
        int iE = i72Var.e();
        if (iE == 1) {
            c12.a(spannableStringBuilder, new AbsoluteSizeSpan((int) i72Var.d(), true), i, i10);
        } else if (iE == 2) {
            c12.a(spannableStringBuilder, new RelativeSizeSpan(i72Var.d()), i, i10);
        } else {
            if (iE != 3) {
                return;
            }
            c12.a(spannableStringBuilder, new RelativeSizeSpan(i72Var.d() / 100.0f), i, i10);
        }
    }

    public static i72 a(i72 i72Var, String[] strArr, Map<String, i72> map) {
        int i = 0;
        if (i72Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                i72 i72Var2 = new i72();
                int length = strArr.length;
                while (i < length) {
                    i72Var2.a(map.get(strArr[i]));
                    i++;
                }
                return i72Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return i72Var.a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    i72Var.a(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return i72Var;
    }
}
