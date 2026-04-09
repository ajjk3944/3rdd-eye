package ui;

import com.liuzh.deviceinfo.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public String f35395a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f35396b;

    /* renamed from: c, reason: collision with root package name */
    public h0 f35397c;

    @Override // ui.b0
    public final b5.z a() {
        if (this.f35397c == null) {
            this.f35397c = new h0();
        }
        return this.f35397c;
    }

    @Override // ui.b0
    public final String getName() {
        return a.a.f2b.getString(R.string.appi_required_permissions);
    }
}
