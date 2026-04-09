package W4;

import com.apm.insight.R;
import d2.InterfaceC2265a;

/* loaded from: classes.dex */
public final class e implements InterfaceC2265a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4100a;

    /* renamed from: b, reason: collision with root package name */
    public String f4101b;

    /* renamed from: c, reason: collision with root package name */
    public int f4102c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f4103d = R.drawable.ic_sensor;

    /* renamed from: e, reason: collision with root package name */
    public int f4104e;

    public e(boolean z6) {
        this.f4100a = z6;
    }

    @Override // d2.InterfaceC2265a
    public final int a() {
        return this.f4100a ? -99 : -100;
    }
}
