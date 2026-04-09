package or;

import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v0 or.k, still in use, count: 1, list:
  (r4v0 or.k) from 0x006d: FILLED_NEW_ARRAY (r4v0 or.k), (r5v0 or.k), (r6v0 or.k), (r7v0 or.k), (r8v0 or.k), (r9v0 or.k), (r10v0 or.k) A[WRAPPED] (LINE:110) elemType: or.k
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class k {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    public static final Set<k> NUMBER_TYPES = mq.l.B0(new k[]{new k("Char"), new k("Byte"), new k("Short"), new k("Int"), new k("Float"), new k("Long"), new k("Double")});
    private final lq.h arrayTypeFqName$delegate;
    private final qs.g arrayTypeName;
    private final lq.h typeFqName$delegate;
    private final qs.g typeName;
    public static final i Companion = new i();

    static {
    }

    private k(String str) {
        this.typeName = qs.g.e(str);
        this.arrayTypeName = qs.g.e(str.concat("Array"));
        lq.j jVar = lq.j.PUBLICATION;
        this.typeFqName$delegate = kc.f.E(jVar, new j(this, 1));
        this.arrayTypeFqName$delegate = kc.f.E(jVar, new j(this, 0));
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public final qs.c getArrayTypeFqName() {
        return (qs.c) this.arrayTypeFqName$delegate.getValue();
    }

    public final qs.g getArrayTypeName() {
        return this.arrayTypeName;
    }

    public final qs.c getTypeFqName() {
        return (qs.c) this.typeFqName$delegate.getValue();
    }

    public final qs.g getTypeName() {
        return this.typeName;
    }
}
