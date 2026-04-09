package Y4;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.lefan.signal.ui.wifi.WifiDetectionActivity;

/* loaded from: classes.dex */
public final class x extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WifiDetectionActivity f4507e;

    /* renamed from: f, reason: collision with root package name */
    public int f4508f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(WifiDetectionActivity wifiDetectionActivity, j5.b bVar) {
        super(bVar);
        this.f4507e = wifiDetectionActivity;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4506d = obj;
        this.f4508f |= LinearLayoutManager.INVALID_OFFSET;
        return WifiDetectionActivity.D(this.f4507e, this);
    }
}
