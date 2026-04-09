package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes.dex */
final class G4 extends A {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f35880e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G4(C4945r4 c4945r4, InterfaceC4821c4 interfaceC4821c4) {
        super(interfaceC4821c4);
        this.f35880e = c4945r4;
    }

    @Override // com.google.android.gms.measurement.internal.A
    public final void d() {
        final C4945r4 c4945r4N = this.f35880e.n();
        Objects.requireNonNull(c4945r4N);
        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.F4
            @Override // java.lang.Runnable
            public final void run() {
                c4945r4N.F0();
            }
        }).start();
    }
}
