package Ii;

import dh.AbstractC5382g;
import dh.InterfaceC5380e;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.NoWhenBranchMatchedException;
import mh.InterfaceC6839p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class P {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ P[] $VALUES;
    public static final P DEFAULT = new P("DEFAULT", 0);
    public static final P LAZY = new P("LAZY", 1);
    public static final P ATOMIC = new P("ATOMIC", 2);
    public static final P UNDISPATCHED = new P("UNDISPATCHED", 3);

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9279a;

        static {
            int[] iArr = new int[P.values().length];
            try {
                iArr[P.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[P.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[P.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[P.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f9279a = iArr;
        }
    }

    private static final /* synthetic */ P[] $values() {
        return new P[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    static {
        P[] pArr$values = $values();
        $VALUES = pArr$values;
        $ENTRIES = AbstractC5827b.a(pArr$values);
    }

    private P(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    public static P[] values() {
        return (P[]) $VALUES.clone();
    }

    public final <R, T> void invoke(InterfaceC6839p interfaceC6839p, R r10, InterfaceC5380e<? super T> interfaceC5380e) {
        int i10 = a.f9279a[ordinal()];
        if (i10 == 1) {
            Oi.a.d(interfaceC6839p, r10, interfaceC5380e);
            return;
        }
        if (i10 == 2) {
            AbstractC5382g.b(interfaceC6839p, r10, interfaceC5380e);
        } else if (i10 == 3) {
            Oi.b.a(interfaceC6839p, r10, interfaceC5380e);
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}
