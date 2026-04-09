package xi;

import com.google.android.gms.internal.measurement.e5;
import java.util.List;
import jj.m0;
import jj.o0;

/* loaded from: classes.dex */
public final class i extends androidx.lifecycle.o {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f25335g;

    /* renamed from: r, reason: collision with root package name */
    public final m0 f25336r;

    /* renamed from: x, reason: collision with root package name */
    public final List f25337x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i10) {
        super(10, false);
        this.f25335g = i10;
        switch (i10) {
            case 1:
                super(10, false);
                this.f25336r = m0.DEVICE_SHUTDOWN_TRIGGER;
                this.f25337x = e5.H(o0.DEVICE_SHUTDOWN);
                break;
            case 2:
                super(10, false);
                this.f25336r = m0.WIFI_SCAN_TRIGGER;
                this.f25337x = e5.H(o0.WIFI_SCAN);
                break;
            default:
                this.f25336r = m0.DEVICE_BOOT_TRIGGER;
                this.f25337x = e5.H(o0.DEVICE_BOOT);
                break;
        }
    }

    @Override // androidx.lifecycle.o
    public final m0 h1() {
        switch (this.f25335g) {
        }
        return this.f25336r;
    }

    @Override // androidx.lifecycle.o
    public final List i1() {
        switch (this.f25335g) {
        }
        return this.f25337x;
    }
}
