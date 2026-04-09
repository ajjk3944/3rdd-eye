package D8;

import J8.L;
import android.content.Intent;
import com.zipoapps.premiumhelper.ui.settings.secret.PhSecretSettingsActivity;

/* compiled from: PhSecretScreenManager.kt */
/* loaded from: classes3.dex */
public final class d implements L.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C6.a f1094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.d f1095b;

    public d(C6.a aVar, com.zipoapps.premiumhelper.d dVar) {
        this.f1094a = aVar;
        this.f1095b = dVar;
    }

    @Override // J8.L.a
    public final void a() {
        if (this.f1094a.f927a) {
            com.zipoapps.premiumhelper.d dVar = this.f1095b;
            Intent intent = new Intent(dVar, (Class<?>) PhSecretSettingsActivity.class);
            intent.setFlags(268435456);
            dVar.startActivity(intent);
        }
    }
}
