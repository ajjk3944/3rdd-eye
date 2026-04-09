package xi;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.measurement.e5;
import java.util.List;
import jj.m0;
import jj.o0;

/* loaded from: classes.dex */
public final class e extends androidx.lifecycle.o {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f25323g;

    /* renamed from: r, reason: collision with root package name */
    public final Context f25324r;

    /* renamed from: x, reason: collision with root package name */
    public final m0 f25325x;

    /* renamed from: y, reason: collision with root package name */
    public final List f25326y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, int i10) {
        super(10, false);
        this.f25323g = i10;
        switch (i10) {
            case 1:
                super(10, false);
                this.f25324r = context;
                this.f25325x = m0.POWER_STATE_TRIGGER;
                this.f25326y = e5.I(o0.POWER_CONNECTED, o0.POWER_DISCONNECTED);
                break;
            default:
                this.f25324r = context;
                this.f25325x = m0.BATTERY_STATE_TRIGGER;
                this.f25326y = e5.I(o0.BATTERY_LOW, o0.BATTERY_OK);
                break;
        }
    }

    @Override // androidx.lifecycle.o
    public final m0 h1() {
        switch (this.f25323g) {
        }
        return this.f25325x;
    }

    @Override // androidx.lifecycle.o
    public final List i1() {
        switch (this.f25323g) {
        }
        return this.f25326y;
    }

    public boolean t1() {
        Intent intentRegisterReceiver = this.f25324r.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }
}
