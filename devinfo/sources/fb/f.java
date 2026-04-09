package fb;

import com.google.android.gms.internal.ads.z21;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements z21 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f f23898b = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f f23899c = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23900a;

    public /* synthetic */ f(int i4) {
        this.f23900a = i4;
    }

    @Override // com.google.android.gms.internal.ads.z21
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f23900a) {
            case 0:
                ArrayList arrayList = h.H;
                return ((JSONObject) obj).optString("nas");
            default:
                ArrayList arrayList2 = h.H;
                za.i.f("", (Exception) obj);
                return null;
        }
    }
}
