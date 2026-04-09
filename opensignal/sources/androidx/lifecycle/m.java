package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final k Companion;
    public static final m ON_CREATE = new m("ON_CREATE", 0);
    public static final m ON_START = new m("ON_START", 1);
    public static final m ON_RESUME = new m("ON_RESUME", 2);
    public static final m ON_PAUSE = new m("ON_PAUSE", 3);
    public static final m ON_STOP = new m("ON_STOP", 4);
    public static final m ON_DESTROY = new m("ON_DESTROY", 5);
    public static final m ON_ANY = new m("ON_ANY", 6);

    private static final /* synthetic */ m[] $values() {
        return new m[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
    }

    static {
        m[] mVarArr$values = $values();
        $VALUES = mVarArr$values;
        $ENTRIES = a.a.j(mVarArr$values);
        Companion = new k();
    }

    private m(String str, int i10) {
    }

    public static final m downFrom(n nVar) {
        Companion.getClass();
        return k.a(nVar);
    }

    public static final m downTo(n nVar) {
        Companion.getClass();
        br.l.e(nVar, "state");
        int i10 = j.f1499a[nVar.ordinal()];
        if (i10 == 1) {
            return ON_STOP;
        }
        if (i10 == 2) {
            return ON_PAUSE;
        }
        if (i10 != 4) {
            return null;
        }
        return ON_DESTROY;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static final m upFrom(n nVar) {
        Companion.getClass();
        return k.b(nVar);
    }

    public static final m upTo(n nVar) {
        Companion.getClass();
        br.l.e(nVar, "state");
        int i10 = j.f1499a[nVar.ordinal()];
        if (i10 == 1) {
            return ON_CREATE;
        }
        if (i10 == 2) {
            return ON_START;
        }
        if (i10 != 3) {
            return null;
        }
        return ON_RESUME;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final n getTargetState() {
        switch (l.f1502a[ordinal()]) {
            case 1:
            case 2:
                return n.CREATED;
            case 3:
            case 4:
                return n.STARTED;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return n.RESUMED;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return n.DESTROYED;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new bf.n();
        }
    }
}
