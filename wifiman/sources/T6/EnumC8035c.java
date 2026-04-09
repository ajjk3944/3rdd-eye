package t6;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: t6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC8035c {
    Top,
    Center,
    Bottom;

    /* renamed from: t6.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61828a;

        static {
            int[] iArr = new int[EnumC8035c.values().length];
            try {
                iArr[EnumC8035c.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8035c.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8035c.Bottom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f61828a = iArr;
        }
    }

    public final EnumC8035c negative() {
        int i10 = a.f61828a[ordinal()];
        if (i10 == 1) {
            return Bottom;
        }
        if (i10 == 2) {
            return Center;
        }
        if (i10 == 3) {
            return Top;
        }
        throw new NoWhenBranchMatchedException();
    }
}
