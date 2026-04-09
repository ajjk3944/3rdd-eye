package B8;

import A9.E;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import b9.C1992A;
import b9.n;
import com.zipoapps.premiumhelper.ui.settings.secret.PhSecretSettingsActivity;
import f9.InterfaceC4347e;
import h9.i;
import o8.f;
import p9.p;

/* compiled from: SettingsApi.kt */
@h9.e(c = "com.zipoapps.premiumhelper.ui.settings.SettingsApi$openSecretSettingActivity$1", f = "SettingsApi.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class e extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f590l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f591m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AppCompatActivity appCompatActivity, InterfaceC4347e<? super e> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f591m = appCompatActivity;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new e(this.f591m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((e) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f590l;
        AppCompatActivity appCompatActivity = this.f591m;
        if (i == 0) {
            n.b(obj);
            f fVar = f.f44891a;
            this.f590l = 1;
            obj = fVar.a(appCompatActivity, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            int i10 = PhSecretSettingsActivity.f37161f;
            appCompatActivity.startActivity(new Intent(appCompatActivity, (Class<?>) PhSecretSettingsActivity.class));
        }
        return C1992A.f18074a;
    }
}
