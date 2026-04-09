package wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m extends a {

    /* renamed from: b, reason: collision with root package name */
    public View f36685b;

    /* renamed from: d, reason: collision with root package name */
    public TextView f36687d;

    /* renamed from: c, reason: collision with root package name */
    public final DeviceInfoApp f36686c = DeviceInfoApp.f21145f;

    /* renamed from: e, reason: collision with root package name */
    public final l f36688e = new l(this);

    @Override // wg.a
    public final void a() {
        View viewInflate = LayoutInflater.from(this.f36686c).inflate(R.layout.monitor_fps, (ViewGroup) null);
        this.f36685b = viewInflate;
        this.f36687d = (TextView) viewInflate.findViewById(R.id.value);
    }

    @Override // wg.a
    public final View b() {
        return this.f36685b;
    }

    @Override // wg.a
    public final void c() {
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        int iC = com.liuzh.deviceinfo.utilities.f.c();
        boolean zI = com.liuzh.deviceinfo.utilities.f.i();
        this.f36687d.setTextSize(iC);
        this.f36687d.setTextColor(zI ? -1 : -16777216);
    }

    @Override // wg.a
    public final void d() {
        com.liuzh.deviceinfo.utilities.j.f21262h.a(this.f36688e);
    }

    @Override // wg.a
    public final void e() {
        com.liuzh.deviceinfo.utilities.j.f21262h.b(this.f36688e);
    }
}
