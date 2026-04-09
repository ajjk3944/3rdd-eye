package sh;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.liuzh.deviceinfo.card.SensorAppCard;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f33681b;

    public /* synthetic */ g(l lVar, int i4) {
        this.f33680a = i4;
        this.f33681b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.f33680a) {
            case 0:
                SensorAppCard sensorAppCard = this.f33681b.f33723g0;
                sensorAppCard.getClass();
                bi.d.c(new ig.k(sensorAppCard, 1));
                return;
            default:
                if (kh.a.f28295b != null) {
                    String strX = ja.c.x("home_banner_push");
                    if (!TextUtils.isEmpty(strX) && !JsonUtils.EMPTY_JSON.equals(strX)) {
                        try {
                            com.google.gson.j jVar = (com.google.gson.j) kh.a.f28294a.getValue();
                            jVar.getClass();
                            if (jVar.c(strX, new xf.a(nh.a.class)) != null) {
                                throw new ClassCastException();
                            }
                            com.liuzh.deviceinfo.utilities.f.f21257c.getString("last_home_banner_push_id", null);
                            throw null;
                        } catch (com.google.gson.q unused) {
                        }
                    }
                }
                this.f33681b.c0();
                return;
        }
    }
}
