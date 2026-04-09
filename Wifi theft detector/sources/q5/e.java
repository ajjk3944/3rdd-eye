package q5;

import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final w5.a f24059a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24060b;

    /* renamed from: c, reason: collision with root package name */
    public final FriendlyObstructionPurpose f24061c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24062d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f24059a = new w5.a(view);
        this.f24060b = view.getClass().getCanonicalName();
        this.f24061c = friendlyObstructionPurpose;
        this.f24062d = str;
    }

    public String a() {
        return this.f24062d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f24061c;
    }

    public w5.a c() {
        return this.f24059a;
    }

    public String d() {
        return this.f24060b;
    }
}
