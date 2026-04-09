package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import r3.C7564b;
import r3.C7567e;

/* loaded from: classes.dex */
public abstract class Z extends AbstractC4278g implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    protected volatile boolean f34796a;

    /* renamed from: b, reason: collision with root package name */
    protected final AtomicReference f34797b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f34798c;

    /* renamed from: d, reason: collision with root package name */
    protected final C7567e f34799d;

    Z(InterfaceC4279h interfaceC4279h, C7567e c7567e) {
        super(interfaceC4279h);
        this.f34797b = new AtomicReference(null);
        this.f34798c = new A3.h(Looper.getMainLooper());
        this.f34799d = c7567e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C7564b c7564b, int i10) {
        this.f34797b.set(null);
        b(c7564b, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        this.f34797b.set(null);
        c();
    }

    private static final int e(W w10) {
        if (w10 == null) {
            return -1;
        }
        return w10.a();
    }

    protected abstract void b(C7564b c7564b, int i10);

    protected abstract void c();

    public final void h(C7564b c7564b, int i10) {
        AtomicReference atomicReference;
        W w10 = new W(c7564b, i10);
        do {
            atomicReference = this.f34797b;
            if (r.Y.a(atomicReference, null, w10)) {
                this.f34798c.post(new Y(this, w10));
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4278g
    public final void onActivityResult(int i10, int i11, Intent intent) {
        W w10 = (W) this.f34797b.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int iG = this.f34799d.g(getActivity());
                if (iG == 0) {
                    d();
                    return;
                } else {
                    if (w10 == null) {
                        return;
                    }
                    if (w10.b().b() == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            d();
            return;
        } else if (i11 == 0) {
            if (w10 != null) {
                a(new C7564b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, w10.b().toString()), e(w10));
                return;
            }
            return;
        }
        if (w10 != null) {
            a(w10.b(), w10.a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new C7564b(13, null), e((W) this.f34797b.get()));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4278g
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f34797b.set(bundle.getBoolean("resolving_error", false) ? new W(new C7564b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4278g
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        W w10 = (W) this.f34797b.get();
        if (w10 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", w10.a());
        bundle.putInt("failed_status", w10.b().b());
        bundle.putParcelable("failed_resolution", w10.b().f());
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4278g
    public void onStart() {
        super.onStart();
        this.f34796a = true;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4278g
    public void onStop() {
        super.onStop();
        this.f34796a = false;
    }
}
