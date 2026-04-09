package k7;

import java.util.Arrays;
import kotlin.jvm.internal.l;

/* compiled from: Colormap.kt */
/* renamed from: k7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5248a {

    /* renamed from: c, reason: collision with root package name */
    public static final C5248a f43427c = new C5248a(null, new int[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f43428a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f43429b;

    public C5248a(float[] fArr, int[] iArr) {
        this.f43428a = iArr;
        this.f43429b = fArr;
        if (iArr.length != (fArr != null ? fArr.length : iArr.length)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5248a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d(obj, "null cannot be cast to non-null type com.yandex.div.internal.graphics.Colormap");
        C5248a c5248a = (C5248a) obj;
        return Arrays.equals(this.f43428a, c5248a.f43428a) && Arrays.equals(this.f43429b, c5248a.f43429b);
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f43428a) * 31;
        float[] fArr = this.f43429b;
        return iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0);
    }
}
