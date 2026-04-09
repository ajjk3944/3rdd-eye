package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.eh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1110eh {

    /* renamed from: a, reason: collision with root package name */
    public final LB f13923a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13924b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f13925c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f13926d;

    public C1110eh(LB lb) {
        this.f13923a = lb;
        C1703ph c1703ph = C1703ph.f16196e;
        this.f13926d = false;
    }

    public final C1703ph a(C1703ph c1703ph) {
        if (c1703ph.equals(C1703ph.f16196e)) {
            throw new C0625Mh("Unhandled input format:", c1703ph);
        }
        int i = 0;
        while (true) {
            LB lb = this.f13923a;
            if (i >= lb.size()) {
                return c1703ph;
            }
            InterfaceC0812Xh interfaceC0812Xh = (InterfaceC0812Xh) lb.get(i);
            C1703ph c1703phC = interfaceC0812Xh.c(c1703ph);
            if (interfaceC0812Xh.f()) {
                AbstractC0582Jp.h0(!c1703phC.equals(r0));
                c1703ph = c1703phC;
            }
            i++;
        }
    }

    public final void b(C0455Ch c0455Ch) {
        ArrayList arrayList = this.f13924b;
        arrayList.clear();
        this.f13926d = false;
        long jG = c0455Ch.f7638a;
        int i = 0;
        while (true) {
            LB lb = this.f13923a;
            if (i >= lb.size()) {
                break;
            }
            InterfaceC0812Xh interfaceC0812Xh = (InterfaceC0812Xh) lb.get(i);
            new C0455Ch(jG);
            interfaceC0812Xh.j();
            if (interfaceC0812Xh.f()) {
                jG = interfaceC0812Xh.g(jG);
                AbstractC0582Jp.h0(jG >= 0);
                arrayList.add(interfaceC0812Xh);
            }
            i++;
        }
        this.f13925c = new ByteBuffer[arrayList.size()];
        for (int i3 = 0; i3 <= f(); i3++) {
            this.f13925c[i3] = ((InterfaceC0812Xh) arrayList.get(i3)).d();
        }
    }

    public final boolean c() {
        return !this.f13924b.isEmpty();
    }

    public final boolean d() {
        return this.f13926d && ((InterfaceC0812Xh) this.f13924b.get(f())).e() && !this.f13925c[f()].hasRemaining();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z6;
        do {
            int i = 0;
            z6 = false;
            while (i <= f()) {
                if (!this.f13925c[i].hasRemaining()) {
                    ArrayList arrayList = this.f13924b;
                    InterfaceC0812Xh interfaceC0812Xh = (InterfaceC0812Xh) arrayList.get(i);
                    if (!interfaceC0812Xh.e()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f13925c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC0812Xh.f12436a;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC0812Xh.a(byteBuffer2);
                        this.f13925c[i] = interfaceC0812Xh.d();
                        boolean z7 = true;
                        if (jRemaining - byteBuffer2.remaining() <= 0 && !this.f13925c[i].hasRemaining()) {
                            z7 = false;
                        }
                        z6 |= z7;
                    } else if (!this.f13925c[i].hasRemaining() && i < f()) {
                        ((InterfaceC0812Xh) arrayList.get(i + 1)).b();
                    }
                }
                i++;
            }
        } while (z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1110eh)) {
            return false;
        }
        LB lb = this.f13923a;
        int size = lb.size();
        LB lb2 = ((C1110eh) obj).f13923a;
        if (size != lb2.size()) {
            return false;
        }
        for (int i = 0; i < lb.size(); i++) {
            if (lb.get(i) != lb2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int f() {
        return this.f13925c.length - 1;
    }

    public final int hashCode() {
        return this.f13923a.hashCode();
    }
}
