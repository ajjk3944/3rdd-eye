package Ne;

import e8.EnumC5428a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6778a;

/* loaded from: classes4.dex */
public abstract class g {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16412a;

        static {
            int[] iArr = new int[EnumC5428a.values().length];
            try {
                iArr[EnumC5428a.WIFIMAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5428a.UISP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5428a.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC5428a.PROTECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC5428a.CONNECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC5428a.ACCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC5428a.AMPLIFI.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC5428a.PLAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f16412a = iArr;
        }
    }

    public static final int a(EnumC5428a enumC5428a) {
        AbstractC6492s.i(enumC5428a, "<this>");
        switch (a.f16412a[enumC5428a.ordinal()]) {
            case 1:
                return AbstractC6778a.f53230h;
            case 2:
                return AbstractC6778a.f53228g;
            case 3:
                return AbstractC6778a.f53222d;
            case 4:
                return AbstractC6778a.f53226f;
            case 5:
                return AbstractC6778a.f53220c;
            case 6:
                return AbstractC6778a.f53216a;
            case 7:
                return AbstractC6778a.f53218b;
            case 8:
                return AbstractC6778a.f53224e;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
