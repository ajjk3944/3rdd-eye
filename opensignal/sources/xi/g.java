package xi;

import android.net.Network;
import com.google.android.gms.internal.measurement.e5;
import java.util.List;
import jj.m0;
import jj.o0;

/* loaded from: classes.dex */
public final class g extends androidx.lifecycle.o implements ek.h {
    public final List B;
    public hk.k D;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f25328g;

    /* renamed from: r, reason: collision with root package name */
    public final al.b f25329r;

    /* renamed from: x, reason: collision with root package name */
    public final bk.f f25330x;

    /* renamed from: y, reason: collision with root package name */
    public final m0 f25331y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(al.b bVar, bk.f fVar, int i10) {
        super(10, false);
        this.f25328g = i10;
        switch (i10) {
            case 1:
                super(10, false);
                this.f25329r = bVar;
                this.f25330x = fVar;
                this.f25331y = m0.WIFI_CONNECTED_STATE_TRIGGER;
                this.B = e5.I(o0.WIFI_CONNECTED, o0.WIFI_CONNECTED_TO_SSID, o0.WIFI_DISCONNECTED);
                fVar.f2805c = this;
                break;
            default:
                this.f25329r = bVar;
                this.f25330x = fVar;
                this.f25331y = m0.CELLULAR_CONNECTED_STATE_TRIGGER;
                this.B = e5.I(o0.CELLULAR_CONNECTED, o0.CELLULAR_DISCONNECTED);
                fVar.f2804b = this;
                break;
        }
    }

    @Override // ek.h
    public final void K(Network network) {
        switch (this.f25328g) {
            case 0:
                this.f25330x.d(bk.d.CELLULAR_CONNECTED_STATE_UPDATED);
                break;
            default:
                this.f25330x.d(bk.d.WIFI_CONNECTED_STATE_UPDATED);
                break;
        }
    }

    @Override // androidx.lifecycle.o
    public final hk.k g1() {
        switch (this.f25328g) {
        }
        return this.D;
    }

    @Override // androidx.lifecycle.o
    public final m0 h1() {
        switch (this.f25328g) {
        }
        return this.f25331y;
    }

    @Override // androidx.lifecycle.o
    public final List i1() {
        switch (this.f25328g) {
        }
        return this.B;
    }

    @Override // androidx.lifecycle.o
    public final void r1(hk.k kVar) {
        switch (this.f25328g) {
            case 0:
                bk.c cVar = (bk.c) this.f25329r.f813e;
                this.D = kVar;
                if (kVar != null) {
                    cVar.o(this);
                    break;
                } else {
                    cVar.r(this);
                    break;
                }
            default:
                bk.c cVar2 = (bk.c) this.f25329r.f813e;
                this.D = kVar;
                if (kVar != null) {
                    cVar2.o(this);
                    break;
                } else {
                    cVar2.r(this);
                    break;
                }
        }
    }
}
