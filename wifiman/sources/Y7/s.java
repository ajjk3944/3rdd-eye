package y7;

import kotlin.jvm.internal.DefaultConstructorMarker;
import s7.InterfaceC7921h;

/* loaded from: classes3.dex */
public enum s implements InterfaceC7921h {
    UNDEFINED(-1),
    AUTO(0),
    ADHOC(1),
    MANAGED(2),
    MASTER(3),
    REPEATER(4),
    SECONDARY(5),
    MONITOR(6);

    public static final a Companion = new a(null);
    private final int code;
    private final boolean isSingle;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s a(int i10) {
            s sVar;
            s[] sVarArrValues = s.values();
            int length = sVarArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    sVar = null;
                    break;
                }
                sVar = sVarArrValues[i11];
                if (sVar.getCode() == i10) {
                    break;
                }
                i11++;
            }
            return sVar == null ? s.UNDEFINED : sVar;
        }

        private a() {
        }
    }

    s(int i10) {
        this.code = i10;
    }

    public final int getCode() {
        return this.code;
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.isSingle;
    }
}
