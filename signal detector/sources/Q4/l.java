package Q4;

import com.lefan.signal.ui.bluetooth.BluetoothActivity;

/* loaded from: classes.dex */
public final class l extends q5.j implements p5.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BluetoothActivity f3213c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(BluetoothActivity bluetoothActivity, int i) {
        super(0);
        this.f3212b = i;
        this.f3213c = bluetoothActivity;
    }

    @Override // p5.a
    public final Object b() {
        switch (this.f3212b) {
            case 0:
                return this.f3213c.n();
            case 1:
                return this.f3213c.d();
            default:
                return this.f3213c.c();
        }
    }
}
