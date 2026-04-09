package u3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC4275d;
import com.google.android.gms.common.api.internal.InterfaceC4282k;
import r3.C7566d;
import s3.AbstractC7892g;
import s3.C7889d;
import s3.C7907w;

/* loaded from: classes.dex */
public final class e extends AbstractC7892g {

    /* renamed from: I, reason: collision with root package name */
    private final C7907w f62677I;

    public e(Context context, Looper looper, C7889d c7889d, C7907w c7907w, InterfaceC4275d interfaceC4275d, InterfaceC4282k interfaceC4282k) {
        super(context, looper, 270, c7889d, interfaceC4275d, interfaceC4282k);
        this.f62677I = c7907w;
    }

    @Override // s3.AbstractC7888c
    protected final String C() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // s3.AbstractC7888c
    protected final String D() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // s3.AbstractC7888c
    protected final boolean G() {
        return true;
    }

    @Override // s3.AbstractC7888c, com.google.android.gms.common.api.a.f
    public final int h() {
        return 203400000;
    }

    @Override // s3.AbstractC7888c
    protected final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C8130a ? (C8130a) iInterfaceQueryLocalInterface : new C8130a(iBinder);
    }

    @Override // s3.AbstractC7888c
    public final C7566d[] t() {
        return A3.d.f278b;
    }

    @Override // s3.AbstractC7888c
    protected final Bundle y() {
        return this.f62677I.b();
    }
}
