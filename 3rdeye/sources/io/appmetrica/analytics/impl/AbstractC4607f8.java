package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.f8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4607f8 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40839a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtobufStateStorage f40840b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC4659h8 f40841c;

    /* renamed from: d, reason: collision with root package name */
    public final Vn f40842d;

    /* renamed from: e, reason: collision with root package name */
    public final Gm f40843e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4592ej f40844f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4541cj f40845g;

    /* renamed from: h, reason: collision with root package name */
    public final R6 f40846h;
    public InterfaceC4633g8 i;

    public AbstractC4607f8(Context context, ProtobufStateStorage protobufStateStorage, AbstractC4659h8 abstractC4659h8, Vn vn, Gm gm, InterfaceC4592ej interfaceC4592ej, InterfaceC4541cj interfaceC4541cj, R6 r62, InterfaceC4633g8 interfaceC4633g8) {
        this.f40839a = context;
        this.f40840b = protobufStateStorage;
        this.f40841c = abstractC4659h8;
        this.f40842d = vn;
        this.f40843e = gm;
        this.f40844f = interfaceC4592ej;
        this.f40845g = interfaceC4541cj;
        this.f40846h = r62;
        this.i = interfaceC4633g8;
    }

    public final synchronized InterfaceC4633g8 a() {
        return this.i;
    }

    public final synchronized boolean b(InterfaceC4710j8 interfaceC4710j8) {
        boolean z10;
        try {
            if (interfaceC4710j8.a() == EnumC4685i8.f41059b) {
                return false;
            }
            if (interfaceC4710j8.equals(this.i.b())) {
                return false;
            }
            List listA = (List) this.f40842d.invoke(this.i.a(), interfaceC4710j8);
            boolean z11 = listA != null;
            if (listA == null) {
                listA = this.i.a();
            }
            if (this.f40841c.a(interfaceC4710j8, this.i.b())) {
                z10 = true;
            } else {
                interfaceC4710j8 = (InterfaceC4710j8) this.i.b();
                z10 = false;
            }
            if (z10 || z11) {
                InterfaceC4633g8 interfaceC4633g8 = this.i;
                InterfaceC4633g8 interfaceC4633g82 = (InterfaceC4633g8) this.f40843e.invoke(interfaceC4710j8, listA);
                this.i = interfaceC4633g82;
                this.f40840b.save(interfaceC4633g82);
                AbstractC4877pj.a("Update distribution data: %s -> %s", interfaceC4633g8, this.i);
            }
            return z10;
        } finally {
        }
    }

    public final synchronized InterfaceC4710j8 c() {
        try {
            if (!this.f40845g.a()) {
                InterfaceC4710j8 interfaceC4710j8 = (InterfaceC4710j8) this.f40844f.invoke();
                this.f40845g.b();
                if (interfaceC4710j8 != null) {
                    b(interfaceC4710j8);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC4710j8) this.i.b();
    }

    public final InterfaceC4710j8 a(InterfaceC4710j8 interfaceC4710j8) {
        InterfaceC4710j8 interfaceC4710j8C;
        this.f40846h.a(this.f40839a);
        synchronized (this) {
            b(interfaceC4710j8);
            interfaceC4710j8C = c();
        }
        return interfaceC4710j8C;
    }

    public final InterfaceC4710j8 b() {
        this.f40846h.a(this.f40839a);
        return c();
    }
}
