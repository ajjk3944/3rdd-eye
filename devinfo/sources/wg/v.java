package wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v extends a {

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f36720c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f36721d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f36722e;

    /* renamed from: b, reason: collision with root package name */
    public final DeviceInfoApp f36719b = DeviceInfoApp.f21145f;

    /* renamed from: f, reason: collision with root package name */
    public final e f36723f = new e(this, 1);

    @Override // wg.a
    public final void a() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f36719b).inflate(R.layout.monitor_netspeed, (ViewGroup) null);
        this.f36720c = viewGroup;
        this.f36721d = (TextView) viewGroup.findViewById(R.id.upload);
        this.f36722e = (TextView) this.f36720c.findViewById(R.id.download);
    }

    @Override // wg.a
    public final View b() {
        return this.f36720c;
    }

    @Override // wg.a
    public final void c() {
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        int iC = com.liuzh.deviceinfo.utilities.f.c();
        boolean zI = com.liuzh.deviceinfo.utilities.f.i();
        float f10 = iC;
        this.f36721d.setTextSize(f10);
        this.f36721d.setTextColor(zI ? -1 : -16777216);
        this.f36722e.setTextSize(f10);
        this.f36722e.setTextColor(zI ? -1 : -16777216);
    }

    @Override // wg.a
    public final void d() {
        com.liuzh.deviceinfo.utilities.r.f21296f.a(this.f36723f);
    }

    @Override // wg.a
    public final void e() {
        com.liuzh.deviceinfo.utilities.r.f21296f.b(this.f36723f);
    }
}
