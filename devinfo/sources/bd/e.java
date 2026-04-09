package bd;

import android.app.job.JobParameters;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
import java.util.function.Consumer;
import p2.k;
import p2.p;
import p2.q;
import p2.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e {
    public static void a(k1.e eVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        q qVar;
        p pVar;
        mk.c cVar;
        int size = longSparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            long jKeyAt = longSparseArray.keyAt(i4);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (qVar = (q) eVar.f().b((int) jKeyAt)) != null && (pVar = qVar.f31107a) != null) {
                Object objG = pVar.f31104d.f31095a.g(k.f31080l);
                if (objG == null) {
                    objG = null;
                }
                p2.a aVar = (p2.a) objG;
                if (aVar != null && (cVar = (mk.c) aVar.f31037b) != null) {
                }
            }
        }
    }

    public static int b(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.f1617e;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static Typeface c(Configuration configuration, Typeface typeface) {
        int i4;
        if (Build.VERSION.SDK_INT < 31 || (i4 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i4 == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, com.bumptech.glide.d.i(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    public static void d(k1.e eVar, long[] jArr, Consumer consumer) {
        p pVar;
        String strA;
        for (long j : jArr) {
            q qVar = (q) eVar.f().b((int) j);
            if (qVar != null && (pVar = qVar.f31107a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(eVar.f27792a.getAutofillId(), pVar.g);
                Object objG = pVar.f31104d.f31095a.g(t.f31137z);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null && (strA = f3.a.a(list, "\n", null, 62)) != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new s2.e(strA)));
                    consumer.n(builder.build());
                }
            }
        }
    }
}
