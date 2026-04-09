package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.cL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0987cL implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1096eL f13550a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC1096eL f13551b;

    public AbstractC0987cL(AbstractC1096eL abstractC1096eL) {
        this.f13550a = abstractC1096eL;
        if (abstractC1096eL.h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f13551b = abstractC1096eL.p();
    }

    public static void f(int i, List list) {
        int size = list.size() - i;
        String strN = A.f.n(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(strN);
            }
            list.remove(size2);
        }
    }

    public final void a(byte[] bArr, XK xk) throws C1636oL {
        int length = bArr.length;
        b();
        try {
            EL.f7942c.a(this.f13551b.getClass()).j(this.f13551b, bArr, 0, length, new KK(xk));
        } catch (C1636oL e6) {
            throw e6;
        } catch (IOException e7) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e7);
        } catch (IndexOutOfBoundsException unused) {
            throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final void b() {
        if (this.f13551b.h()) {
            return;
        }
        AbstractC1096eL abstractC1096eLP = this.f13550a.p();
        EL.f7942c.a(abstractC1096eLP.getClass()).b(abstractC1096eLP, this.f13551b);
        this.f13551b = abstractC1096eLP;
    }

    public final AbstractC1096eL c() {
        if (!this.f13551b.h()) {
            return this.f13551b;
        }
        this.f13551b.q();
        return this.f13551b;
    }

    public final Object clone() {
        AbstractC0987cL abstractC0987cL = (AbstractC0987cL) this.f13550a.w(5, null);
        abstractC0987cL.f13551b = c();
        return abstractC0987cL;
    }

    public final AbstractC1096eL d() {
        AbstractC1096eL abstractC1096eLC = c();
        abstractC1096eLC.getClass();
        if (AbstractC1096eL.x(abstractC1096eLC, true)) {
            return abstractC1096eLC;
        }
        throw new QL();
    }

    public final AbstractC0987cL e(AbstractC1096eL abstractC1096eL) {
        if (this.f13550a.equals(abstractC1096eL)) {
            return this;
        }
        b();
        AbstractC1096eL abstractC1096eL2 = this.f13551b;
        EL.f7942c.a(abstractC1096eL2.getClass()).b(abstractC1096eL2, abstractC1096eL);
        return this;
    }
}
