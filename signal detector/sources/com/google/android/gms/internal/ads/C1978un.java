package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.un, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1978un extends C0697Ql {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17166d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1978un(InterfaceC0595Kl interfaceC0595Kl, InterfaceC0828Yg interfaceC0828Yg, int i) {
        super(interfaceC0595Kl, 16, interfaceC0828Yg);
        this.f17166d = i;
    }

    @Override // com.google.android.gms.internal.ads.C0697Ql
    public Set t(C0695Qj c0695Qj) {
        switch (this.f17166d) {
            case 1:
                return Collections.EMPTY_SET;
            default:
                return super.t(c0695Qj);
        }
    }

    @Override // com.google.android.gms.internal.ads.C0697Ql
    public Set w(C0695Qj c0695Qj) {
        switch (this.f17166d) {
            case 1:
                return Collections.EMPTY_SET;
            default:
                return super.w(c0695Qj);
        }
    }
}
