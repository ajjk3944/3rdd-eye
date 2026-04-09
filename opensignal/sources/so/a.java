package so;

import android.content.SharedPreferences;
import br.l;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22175b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        super(i10);
        this.f22175b = i11;
    }

    @Override // so.f
    public final void a(SharedPreferences sharedPreferences) {
        switch (this.f22175b) {
            case 0:
                l.e(sharedPreferences, "sharedPrefs");
                sharedPreferences.edit().putString("firstPresentationTimesKey", sharedPreferences.getString("lastPresentationTimesKey", null)).apply();
                break;
            default:
                l.e(sharedPreferences, "sharedPrefs");
                if (sharedPreferences.contains("alreadySendAttributes")) {
                    sharedPreferences.edit().remove("alreadySendAttributes").apply();
                    break;
                }
                break;
        }
    }
}
