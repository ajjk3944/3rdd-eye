package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.em, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4595em implements InterfaceC4673hm {

    /* renamed from: a, reason: collision with root package name */
    public volatile C4544cm f40824a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f40825b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC4673hm
    public final void a(C4544cm c4544cm) {
        this.f40824a = c4544cm;
        Iterator it = this.f40825b.iterator();
        while (it.hasNext()) {
            ((InterfaceC4673hm) it.next()).a(c4544cm);
        }
    }

    public final C4544cm b() {
        C4544cm c4544cm = this.f40824a;
        if (c4544cm != null) {
            return c4544cm;
        }
        kotlin.jvm.internal.l.l("startupState");
        throw null;
    }

    public final void b(InterfaceC4673hm interfaceC4673hm) {
        this.f40825b.remove(interfaceC4673hm);
    }

    public final void a(InterfaceC4673hm interfaceC4673hm) {
        this.f40825b.add(interfaceC4673hm);
        if (this.f40824a != null) {
            C4544cm c4544cm = this.f40824a;
            if (c4544cm != null) {
                interfaceC4673hm.a(c4544cm);
            } else {
                kotlin.jvm.internal.l.l("startupState");
                throw null;
            }
        }
    }

    public final void a(Context context) {
        String strOptStringOrNull;
        ProtobufStateStorage<Object> protobufStateStorageA = Nm.a(C4647gm.class).a(context);
        C4908qo c4908qoA = Ga.j().B().a();
        synchronized (c4908qoA) {
            strOptStringOrNull = JsonUtils.optStringOrNull(c4908qoA.f41502a.a(), "device_id");
        }
        a(new C4544cm(strOptStringOrNull, c4908qoA.a(), (C4647gm) protobufStateStorageA.read()));
    }
}
