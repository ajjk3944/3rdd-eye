package j8;

import A9.E;
import A9.O;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.ActivityC1762o;
import b9.C1992A;
import b9.n;
import com.zipoapps.premiumhelper.e;
import f9.InterfaceC4347e;
import h9.e;
import h9.i;
import java.util.Arrays;
import kotlin.jvm.internal.l;
import p9.p;
import va.a;

/* compiled from: ExternalUtilsImpl.kt */
@e(c = "com.zipoapps.premiumhelper.app_utils.ExternalUtilsImpl$openGooglePlay$1", f = "ExternalUtilsImpl.kt", l = {103}, m = "invokeSuspend")
/* renamed from: j8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5200b extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f43137l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f43138m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C5201c f43139n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ActivityC1762o f43140o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5200b(boolean z10, C5201c c5201c, ActivityC1762o activityC1762o, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f43138m = z10;
        this.f43139n = c5201c;
        this.f43140o = activityC1762o;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new C5200b(this.f43138m, this.f43139n, this.f43140o, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((C5200b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f43137l;
        if (i == 0) {
            n.b(obj);
            if (this.f43138m) {
                this.f43137l = 1;
                if (O.a(500L, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        }
        ActivityC1762o activityC1762o = this.f43140o;
        try {
            try {
                String packageName = activityC1762o.getPackageName();
                l.e(packageName, "getPackageName(...)");
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("%s?id=%s", Arrays.copyOf(new Object[]{"market://details", packageName}, 2))));
                intent.addFlags(1476919296);
                activityC1762o.startActivity(intent);
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                e.a.a().f();
            } catch (Throwable th) {
                a.b bVar = va.a.f47104a;
                bVar.o("PremiumHelper");
                bVar.e(th, "Failed to open google play", new Object[0]);
            }
        } catch (ActivityNotFoundException unused) {
            String packageName2 = activityC1762o.getPackageName();
            l.e(packageName2, "getPackageName(...)");
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(String.format("%s?id=%s", Arrays.copyOf(new Object[]{"https://play.google.com/store/apps/details", packageName2}, 2))));
            intent2.addFlags(1476919296);
            activityC1762o.startActivity(intent2);
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            e.a.a().f();
        }
        return C1992A.f18074a;
    }
}
