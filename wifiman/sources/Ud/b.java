package Ud;

import Y6.h;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class b implements n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.ui.wifiman.model.ubiquiti.console.network.api.b f22378a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f22379b;

    public b(com.ui.wifiman.model.ubiquiti.console.network.api.b bVar, h hVar) {
        this.f22378a = bVar;
        this.f22379b = hVar;
    }

    @Override // kg.n
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object apply(byte[] it) {
        AbstractC6492s.i(it, "it");
        return this.f22378a.k(it, this.f22379b);
    }
}
