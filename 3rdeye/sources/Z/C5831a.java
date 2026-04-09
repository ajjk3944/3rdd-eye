package z;

import android.util.Range;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.impl.C0;

/* compiled from: AeFpsRange.java */
/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5831a {

    /* renamed from: a, reason: collision with root package name */
    public final Range<Integer> f48384a;

    public C5831a(C0 c02) {
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) c02.e(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            this.f48384a = null;
        } else {
            this.f48384a = aeFpsRangeLegacyQuirk.f14802a;
        }
    }
}
