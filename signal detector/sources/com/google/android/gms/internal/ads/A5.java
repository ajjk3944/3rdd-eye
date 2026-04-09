package com.google.android.gms.internal.ads;

import j$.util.Optional;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class A5 {

    /* renamed from: a, reason: collision with root package name */
    public final L2.w f6931a;

    /* renamed from: b, reason: collision with root package name */
    public final Nx f6932b = new Nx(4);

    /* renamed from: c, reason: collision with root package name */
    public final C1728q5 f6933c;

    public A5(L2.w wVar, C1728q5 c1728q5) {
        this.f6931a = wVar;
        this.f6933c = c1728q5;
    }

    public final Optional a() {
        EnumC0862a5 enumC0862a5;
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.f6932b.f10110b;
            if (arrayDeque.isEmpty()) {
                throw new C1943u5();
            }
            C1835s5 c1835s5 = (C1835s5) arrayDeque.pop();
            long j6 = c1835s5.f16679a;
            long j7 = c1835s5.f16680b;
            long j8 = c1835s5.f16681c;
            L2.w wVar = this.f6931a;
            if (wVar.f2569b < j7) {
                return Optional.of(EnumC0862a5.f13051V);
            }
            this.f6933c.c(j6);
            if (j8 == 0) {
                while (wVar.f2569b > j7) {
                    wVar.v();
                }
            }
            return Optional.empty();
        } catch (C1620o5 e6) {
            e = e6;
            throw new AssertionError(AbstractC1404k5.a("CEiv6BFfPnitUE+D"), e);
        } catch (C1674p5 e7) {
            e = e7;
            throw new AssertionError(AbstractC1404k5.a("CEiv6BFfPnitUE+D"), e);
        } catch (C1943u5 unused) {
            enumC0862a5 = EnumC0862a5.f13042L;
            return Optional.of(enumC0862a5);
        } catch (C1997v5 unused2) {
            enumC0862a5 = EnumC0862a5.f13051V;
            return Optional.of(enumC0862a5);
        }
    }
}
