package L1;

import android.animation.TypeEvaluator;
import kotlin.KotlinVersion;

/* compiled from: ArgbEvaluator.java */
/* loaded from: classes.dex */
public final class g implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public static final g f3967a = new g();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f11 = ((iIntValue >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f12 = ((iIntValue >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f13 = ((iIntValue >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f14 = ((iIntValue2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f15 = ((iIntValue2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f16 = ((iIntValue2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float fPow = (float) Math.pow(f12, 2.2d);
        float fPow2 = (float) Math.pow(f13, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(f15, 2.2d);
        float fPow5 = (float) Math.pow(f16, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, 2.2d);
        float fE = com.google.android.gms.measurement.internal.a.e(f14, f11, f10, f11);
        float fE2 = com.google.android.gms.measurement.internal.a.e(fPow4, fPow, f10, fPow);
        float fE3 = com.google.android.gms.measurement.internal.a.e(fPow5, fPow2, f10, fPow2);
        float fE4 = com.google.android.gms.measurement.internal.a.e(fPow6, fPow3, f10, fPow3);
        float fPow7 = ((float) Math.pow(fE2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fE3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fE4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fE * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
