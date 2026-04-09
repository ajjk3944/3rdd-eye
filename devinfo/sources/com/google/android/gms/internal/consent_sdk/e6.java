package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e6 implements UserMessagingPlatform.OnConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener, i7, i6 {

    /* renamed from: c, reason: collision with root package name */
    public static final q4 f19333c = new q4(27);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19334a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19335b;

    public /* synthetic */ e6(int i4, Object obj) {
        this.f19334a = i4;
        this.f19335b = obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j7
    public Object a() {
        switch (this.f19334a) {
            case 3:
                i0 i0Var = j0.f19384b;
                l0.c(i0Var);
                return new q((c) this.f19335b, i0Var);
            case 4:
                return new v((Application) ((j7) this.f19335b).a());
            case 5:
            case 6:
            default:
                return this.f19335b;
            case 7:
                h7 h7Var = (h7) this.f19335b;
                if (h7Var != null) {
                    return h7Var.a();
                }
                throw new IllegalStateException();
        }
    }

    public void b(int i4, Object obj, q6 q6Var) {
        q5 q5Var = (q5) this.f19335b;
        l5 l5Var = (l5) obj;
        q5Var.y(i4, 2);
        q5Var.A(l5Var.b(q6Var));
        q6Var.d(l5Var, this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.i6
    public p6 d(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            i6 i6Var = ((i6[]) this.f19335b)[i4];
            if (i6Var.e(cls)) {
                return i6Var.d(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.consent_sdk.i6
    public boolean e(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            if (((i6[]) this.f19335b)[i4].e(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        ((ConsentForm.OnConsentFormDismissedListener) this.f19335b).onConsentFormDismissed(formError);
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        ((AtomicReference) this.f19335b).set(consentForm);
    }

    public e6(int i4) {
        this.f19334a = i4;
        switch (i4) {
            case 7:
                break;
            default:
                int i10 = n5.f19444a;
                e6 e6Var = new e6(6, new i6[]{q4.f19492v, f19333c});
                Charset charset = a6.f19264a;
                this.f19335b = e6Var;
                break;
        }
    }

    public e6(q5 q5Var) {
        this.f19334a = 5;
        Charset charset = a6.f19264a;
        this.f19335b = q5Var;
        q5Var.f19495b = this;
    }
}
