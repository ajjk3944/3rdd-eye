package androidx.compose.ui.platform;

import L0.C3174d;
import Zg.AbstractC3682n;
import android.content.ClipData;
import android.content.ClipDescription;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: androidx.compose.ui.platform.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3934l {
    public static final C3174d a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new C3174d(charSequence.toString(), null, null, 6, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i10 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int iG0 = AbstractC3682n.g0(annotationArr);
        if (iG0 >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i10];
                if (AbstractC6492s.d(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new C3174d.c(new C3935l0(annotation.getValue()).k(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i10 == iG0) {
                    break;
                }
                i10++;
            }
        }
        return new C3174d(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final CharSequence b(C3174d c3174d) {
        if (c3174d.g().isEmpty()) {
            return c3174d.k();
        }
        SpannableString spannableString = new SpannableString(c3174d.k());
        C3950s0 c3950s0 = new C3950s0();
        List listG = c3174d.g();
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3174d.c cVar = (C3174d.c) listG.get(i10);
            L0.D d10 = (L0.D) cVar.a();
            int iB = cVar.b();
            int iC = cVar.c();
            c3950s0.q();
            c3950s0.d(d10);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", c3950s0.p()), iB, iC, 33);
        }
        return spannableString;
    }

    public static final C3917f0 c(ClipData clipData) {
        return new C3917f0(clipData);
    }

    public static final C3920g0 d(ClipDescription clipDescription) {
        return new C3920g0(clipDescription);
    }
}
