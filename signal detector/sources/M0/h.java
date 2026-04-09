package M0;

import android.animation.TypeEvaluator;
import com.google.android.gms.internal.ads.AbstractC1135f5;

/* loaded from: classes.dex */
public final class h implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public static final h f2643a = new h();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f2, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f5 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f6 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fH = AbstractC1135f5.h(f6, f5, f2, f5);
        float fH2 = AbstractC1135f5.h(fPow4, fPow, f2, fPow);
        float fH3 = AbstractC1135f5.h(fPow5, fPow2, f2, fPow2);
        float fH4 = AbstractC1135f5.h(fPow6, fPow3, f2, fPow3);
        float fPow7 = ((float) Math.pow(fH2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fH3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fH4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fH * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
