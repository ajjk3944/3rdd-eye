package ss;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public enum l {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);

    public static final Set<l> ALL;
    public static final Set<l> ALL_EXCEPT_ANNOTATIONS;
    public static final k Companion = new k();
    private final boolean includeByDefault;

    static {
        l[] lVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (l lVar : lVarArrValues) {
            if (lVar.includeByDefault) {
                arrayList.add(lVar);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = mq.o.U0(arrayList);
        ALL = mq.l.B0(values());
    }

    l(boolean z10) {
        this.includeByDefault = z10;
    }
}
