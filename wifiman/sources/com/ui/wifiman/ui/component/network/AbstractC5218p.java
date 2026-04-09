package com.ui.wifiman.ui.component.network;

import b8.EnumC4076c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import s9.d;

/* renamed from: com.ui.wifiman.ui.component.network.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5218p {

    /* renamed from: com.ui.wifiman.ui.component.network.p$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44517a;

        static {
            int[] iArr = new int[EnumC4076c.values().length];
            try {
                iArr[EnumC4076c.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4076c.ETHERNET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4076c.MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4076c.WIFI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC4076c.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f44517a = iArr;
        }
    }

    public static final s9.b a(EnumC4076c enumC4076c) {
        AbstractC6492s.i(enumC4076c, "<this>");
        int i10 = a.f44517a[enumC4076c.ordinal()];
        if (i10 == 1) {
            return Pe.a.f18599a.b0();
        }
        if (i10 == 2) {
            return Pe.a.f18599a.w();
        }
        if (i10 == 3) {
            return Pe.a.f18599a.g();
        }
        if (i10 == 4 || i10 == 5) {
            return Pe.a.f18599a.d0();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final s9.d b(EnumC4076c enumC4076c, String str) {
        AbstractC6492s.i(enumC4076c, "<this>");
        int i10 = a.f44517a[enumC4076c.ordinal()];
        if (i10 == 1) {
            return new d.b(AbstractC6780c.f53531m);
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return new d.b(AbstractC6780c.f53510j);
            }
            if (i10 == 4) {
                return str != null ? new d.c(str) : new d.b(AbstractC6780c.f53524l);
            }
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new d.b(AbstractC6780c.f53517k);
    }

    public static /* synthetic */ s9.d c(EnumC4076c enumC4076c, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return b(enumC4076c, str);
    }
}
