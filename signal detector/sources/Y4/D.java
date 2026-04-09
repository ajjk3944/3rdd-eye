package Y4;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.lefan.signal.ui.wifi.WifiDetectionActivity;

/* loaded from: classes.dex */
public final class D extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WifiDetectionActivity f4398e;

    /* renamed from: f, reason: collision with root package name */
    public int f4399f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(WifiDetectionActivity wifiDetectionActivity, j5.b bVar) {
        super(bVar);
        this.f4398e = wifiDetectionActivity;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4397d = obj;
        this.f4399f |= LinearLayoutManager.INVALID_OFFSET;
        return WifiDetectionActivity.H(this.f4398e, this);
    }
}
