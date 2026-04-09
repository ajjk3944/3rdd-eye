package wh;

import com.google.android.gms.internal.measurement.e5;

/* loaded from: classes.dex */
public final class c extends e5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24527a;

    public /* synthetic */ c(int i10) {
        this.f24527a = i10;
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final String B() {
        switch (this.f24527a) {
            case 0:
                return "\\.";
            default:
                return "\\:";
        }
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final String C() {
        switch (this.f24527a) {
            case 0:
                return ".";
            default:
                return ":";
        }
    }
}
