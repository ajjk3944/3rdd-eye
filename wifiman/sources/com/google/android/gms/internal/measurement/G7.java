package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class G7 extends AbstractC4410n {

    /* renamed from: c, reason: collision with root package name */
    private final Callable f35029c;

    public G7(String str, Callable callable) {
        super(str);
        this.f35029c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4410n
    public final InterfaceC4449s a(Z2 z22, List list) {
        try {
            return W3.b(this.f35029c.call());
        } catch (Exception unused) {
            return InterfaceC4449s.f35450e0;
        }
    }
}
