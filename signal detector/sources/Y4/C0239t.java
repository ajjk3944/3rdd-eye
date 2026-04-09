package Y4;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.lefan.signal.ui.wifi.WifiDetectionActivity;

/* renamed from: Y4.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239t extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WifiDetectionActivity f4499e;

    /* renamed from: f, reason: collision with root package name */
    public int f4500f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0239t(WifiDetectionActivity wifiDetectionActivity, j5.b bVar) {
        super(bVar);
        this.f4499e = wifiDetectionActivity;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4498d = obj;
        this.f4500f |= LinearLayoutManager.INVALID_OFFSET;
        return WifiDetectionActivity.C(this.f4499e, this);
    }
}
