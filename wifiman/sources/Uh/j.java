package Uh;

import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* loaded from: classes4.dex */
public enum j implements i.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);

    private static i.b internalValueMap = new i.b() { // from class: Uh.j.a
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(int i10) {
            return j.valueOf(i10);
        }
    };
    private final int value;

    j(int i10, int i11) {
        this.value = i11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
    public final int getNumber() {
        return this.value;
    }

    public static j valueOf(int i10) {
        if (i10 == 0) {
            return DECLARATION;
        }
        if (i10 == 1) {
            return FAKE_OVERRIDE;
        }
        if (i10 == 2) {
            return DELEGATION;
        }
        if (i10 != 3) {
            return null;
        }
        return SYNTHESIZED;
    }
}
