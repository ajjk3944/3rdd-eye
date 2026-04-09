package xi;

import com.google.android.gms.internal.measurement.e5;
import java.util.List;
import jj.m0;
import jj.o0;

/* loaded from: classes.dex */
public abstract class d extends androidx.lifecycle.o {

    /* renamed from: g, reason: collision with root package name */
    public final al.b f25320g;

    /* renamed from: r, reason: collision with root package name */
    public final m0 f25321r;

    /* renamed from: x, reason: collision with root package name */
    public final List f25322x;

    public d(al.b bVar, bk.f fVar) {
        super(10, false);
        this.f25320g = bVar;
        this.f25321r = m0.NETWORK_CONNECTED_TRIGGER;
        this.f25322x = e5.I(o0.NETWORK_CONNECTED, o0.NETWORK_DISCONNECTED);
        fVar.f2807e = this;
    }

    @Override // androidx.lifecycle.o
    public final m0 h1() {
        return this.f25321r;
    }

    @Override // androidx.lifecycle.o
    public final List i1() {
        return this.f25322x;
    }
}
