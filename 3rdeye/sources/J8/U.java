package J8;

import android.content.SharedPreferences;
import c8.C2075b;
import i8.C4461a;
import l8.a;
import va.a;

/* compiled from: UserTypeEvaluator.kt */
/* loaded from: classes3.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final l8.b f2848a;

    /* renamed from: b, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.c f2849b;

    /* renamed from: c, reason: collision with root package name */
    public final C4461a f2850c;

    public U(l8.b bVar, com.zipoapps.premiumhelper.c cVar, C4461a c4461a) {
        this.f2848a = bVar;
        this.f2849b = cVar;
        this.f2850c = c4461a;
    }

    public final void a() {
        a.b bVar = va.a.f47104a;
        bVar.o("PremiumHelper");
        bVar.a("Evaluating user type..user is playpass owner!", new Object[0]);
        Boolean bool = Boolean.TRUE;
        C4461a c4461a = this.f2850c;
        c4461a.t(bool, "Playpass_user");
        com.zipoapps.premiumhelper.c cVar = this.f2849b;
        if (a.C0491a.a(cVar, "play_pass_user_tracked", false)) {
            return;
        }
        c4461a.r(new C2075b());
        SharedPreferences.Editor editorEdit = cVar.f37004a.edit();
        editorEdit.putBoolean("play_pass_user_tracked", true);
        editorEdit.apply();
    }
}
