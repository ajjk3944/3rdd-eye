package ui;

import com.liuzh.deviceinfo.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f35476a;

    /* renamed from: b, reason: collision with root package name */
    public u f35477b;

    @Override // ui.b0
    public final b5.z a() {
        if (this.f35477b == null) {
            this.f35477b = new u();
        }
        return this.f35477b;
    }

    @Override // ui.b0
    public final String getName() {
        return a.a.f2b.getString(R.string.appi_features);
    }
}
