package Y4;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.lefan.signal.ui.wifi.WifiDetectionActivity;

/* loaded from: classes.dex */
public final class J extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WifiDetectionActivity f4415e;

    /* renamed from: f, reason: collision with root package name */
    public int f4416f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(WifiDetectionActivity wifiDetectionActivity, j5.b bVar) {
        super(bVar);
        this.f4415e = wifiDetectionActivity;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4414d = obj;
        this.f4416f |= LinearLayoutManager.INVALID_OFFSET;
        return WifiDetectionActivity.K(this.f4415e, this);
    }
}
