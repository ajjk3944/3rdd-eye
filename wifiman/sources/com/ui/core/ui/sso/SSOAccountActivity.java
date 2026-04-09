package com.ui.core.ui.sso;

import F1.AbstractC2753i0;
import F1.V0;
import Yg.J;
import android.R;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.ui.core.ui.sso.UiSSO;
import com.ui.core.ui.sso.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u0019\u0010\u0015\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\tJ\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0004R\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/ui/core/ui/sso/SSOAccountActivity;", "Landroidx/appcompat/app/c;", "Lcom/ui/core/ui/sso/d$b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "LYg/J;", "W0", "(Landroid/os/Bundle;)V", "Lcom/ui/core/ui/sso/UiSSO$a;", "authResponse", "Z0", "(Lcom/ui/core/ui/sso/UiSSO$a;)V", "result", "V0", "(Lcom/ui/core/ui/sso/UiSSO$a;)Landroid/os/Bundle;", "X0", "Y0", "a1", "d1", "onCreate", "w", "C", "H", "LP9/k;", SnmpConfigurator.O_AUTH_PASSPHRASE, "()LP9/k;", "finish", "Landroid/accounts/AccountAuthenticatorResponse;", "D", "Landroid/accounts/AccountAuthenticatorResponse;", "accountAuthenticatorResponse", SnmpConfigurator.O_CONTEXT_ENGINE_ID, "Landroid/os/Bundle;", "authResponseBundle", "Lcom/ui/core/ui/sso/UiSSO$f;", "T0", "()Lcom/ui/core/ui/sso/UiSSO$f;", "screen", "Lcom/ui/core/ui/sso/UiSSO$g;", "U0", "()Lcom/ui/core/ui/sso/UiSSO$g;", "theme", "core-ui-sso_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SSOAccountActivity extends androidx.appcompat.app.c implements d.b {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private AccountAuthenticatorResponse accountAuthenticatorResponse;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Bundle authResponseBundle;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41348a;

        static {
            int[] iArr = new int[UiSSO.g.values().length];
            try {
                iArr[UiSSO.g.FOLLOW_SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UiSSO.g.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UiSSO.g.LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41348a = iArr;
        }
    }

    private final UiSSO.f T0() {
        Intent intent = getIntent();
        AbstractC6492s.h(intent, "getIntent(...)");
        UiSSO.f fVar = (UiSSO.f) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("screen", UiSSO.f.class) : intent.getParcelableExtra("screen"));
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException("Screen in bundle not found!");
    }

    private final UiSSO.g U0() {
        Intent intent = getIntent();
        AbstractC6492s.h(intent, "getIntent(...)");
        UiSSO.g gVar = (UiSSO.g) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("theme", UiSSO.g.class) : intent.getParcelableExtra("theme"));
        return gVar == null ? UiSSO.g.FOLLOW_SYSTEM : gVar;
    }

    private final Bundle V0(UiSSO.a result) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", result.getUser().getEmail());
        bundle.putString("accountType", getString(Na.a.f16328c));
        result.d(bundle);
        return bundle;
    }

    private final void W0(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            v0().m().b(R.id.content, d.INSTANCE.a(T0(), getIntent().getExtras())).g();
        }
    }

    private final void X0() {
        getWindow().setSoftInputMode(16);
    }

    private final void Y0() {
        AbstractC2753i0.b(getWindow(), false);
    }

    private final void Z0(UiSSO.a authResponse) {
        Bundle bundleV0 = V0(authResponse);
        this.authResponseBundle = bundleV0;
        Intent intent = new Intent();
        intent.putExtras(bundleV0);
        J j10 = J.f24997a;
        setResult(-1, intent);
        finish();
    }

    private final void a1() {
        int i10 = a.f41348a[U0().ordinal()];
        boolean z10 = false;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = true;
            }
        } else if (!c1() || !b1(this)) {
            z10 = true;
        }
        V0 v0A = AbstractC2753i0.a(getWindow(), getWindow().getDecorView());
        AbstractC6492s.h(v0A, "getInsetsController(...)");
        v0A.b(z10);
        v0A.a(z10);
    }

    private static final boolean b1(SSOAccountActivity sSOAccountActivity) {
        return (sSOAccountActivity.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static final boolean c1() {
        return Build.VERSION.SDK_INT >= 29;
    }

    private final void d1() {
        Intent intent = getIntent();
        AbstractC6492s.h(intent, "getIntent(...)");
        AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("accountAuthenticatorResponse", AccountAuthenticatorResponse.class) : intent.getParcelableExtra("accountAuthenticatorResponse"));
        this.accountAuthenticatorResponse = accountAuthenticatorResponse;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onRequestContinued();
        }
    }

    @Override // com.ui.core.ui.sso.d.b
    public P9.k A() {
        return null;
    }

    @Override // com.ui.core.ui.sso.d.b
    public void C() {
        throw new Error("Not supported opening of login extra button, use UiSSOAccountFragment");
    }

    @Override // com.ui.core.ui.sso.d.b
    public void H() {
        throw new Error("Not supported opening of login extra button, use UiSSOAccountFragment");
    }

    @Override // android.app.Activity
    public void finish() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.accountAuthenticatorResponse;
        if (accountAuthenticatorResponse != null) {
            Bundle bundle = this.authResponseBundle;
            if (bundle != null) {
                accountAuthenticatorResponse.onResult(bundle);
            } else {
                accountAuthenticatorResponse.onError(4, "canceled");
            }
            this.accountAuthenticatorResponse = null;
        }
        super.finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC3999j, c.AbstractActivityC4155j, s1.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        d1();
        W0(savedInstanceState);
        X0();
        Y0();
        a1();
    }

    @Override // com.ui.core.ui.sso.d.b
    public void w(UiSSO.a authResponse) {
        AbstractC6492s.i(authResponse, "authResponse");
        Z0(authResponse);
    }
}
