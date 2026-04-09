package A2;

import com.google.android.gms.internal.ads.NA;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: A2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0123k implements NA {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C0123k f256b = new C0123k(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C0123k f257c = new C0123k(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258a;

    public /* synthetic */ C0123k(int i) {
        this.f258a = i;
    }

    @Override // com.google.android.gms.internal.ads.NA
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f258a) {
            case 0:
                ArrayList arrayList = BinderC0126n.f267V;
                return ((JSONObject) obj).optString("nas");
            default:
                ArrayList arrayList2 = BinderC0126n.f267V;
                u2.k.f("", (Exception) obj);
                return null;
        }
    }
}
