package w8;

import androidx.appcompat.app.AppCompatActivity;
import com.zipoapps.premiumhelper.ui.rate.f;
import kotlin.jvm.internal.l;

/* compiled from: HappyMoment.kt */
/* loaded from: classes3.dex */
public final class j implements f.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f47589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f47590b;

    public j(i iVar, AppCompatActivity appCompatActivity) {
        this.f47589a = iVar;
        this.f47590b = appCompatActivity;
    }

    @Override // com.zipoapps.premiumhelper.ui.rate.f.a
    public final void a(f.c reviewUiShown) throws Throwable {
        l.f(reviewUiShown, "reviewUiShown");
        if (reviewUiShown == f.c.NONE) {
            this.f47589a.b(this.f47590b, null);
        }
    }
}
