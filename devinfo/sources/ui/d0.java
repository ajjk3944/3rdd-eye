package ui;

import androidx.recyclerview.widget.t0;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class d0 extends e<f0> {

    /* renamed from: c0, reason: collision with root package name */
    public ArrayList f35357c0;

    @Override // ui.e
    public final ej.e c0() {
        return new ej.e(3, this);
    }

    @Override // ui.e
    public final void d0(f0 f0Var) {
        this.f35357c0 = f0Var.f35371b;
        t0 t0Var = this.f35359b0;
        if (t0Var != null) {
            t0Var.notifyDataSetChanged();
        }
    }
}
