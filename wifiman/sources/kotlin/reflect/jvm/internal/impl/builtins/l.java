package kotlin.reflect.jvm.internal.impl.builtins;

import Zg.d0;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l BOOLEAN = new l("BOOLEAN", 0, "Boolean");
    public static final l BYTE;
    public static final l CHAR;
    public static final a Companion;
    public static final l DOUBLE;
    public static final l FLOAT;
    public static final l INT;
    public static final l LONG;
    public static final Set<l> NUMBER_TYPES;
    public static final l SHORT;
    private final Yg.m arrayTypeFqName$delegate;
    private final Zh.f arrayTypeName;
    private final Yg.m typeFqName$delegate;
    private final Zh.f typeName;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final /* synthetic */ l[] $values() {
        return new l[]{BOOLEAN, CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE};
    }

    static {
        l lVar = new l("CHAR", 1, "Char");
        CHAR = lVar;
        l lVar2 = new l("BYTE", 2, "Byte");
        BYTE = lVar2;
        l lVar3 = new l("SHORT", 3, "Short");
        SHORT = lVar3;
        l lVar4 = new l("INT", 4, "Int");
        INT = lVar4;
        l lVar5 = new l("FLOAT", 5, "Float");
        FLOAT = lVar5;
        l lVar6 = new l("LONG", 6, "Long");
        LONG = lVar6;
        l lVar7 = new l("DOUBLE", 7, "Double");
        DOUBLE = lVar7;
        l[] lVarArr$values = $values();
        $VALUES = lVarArr$values;
        $ENTRIES = AbstractC5827b.a(lVarArr$values);
        Companion = new a(null);
        NUMBER_TYPES = d0.i(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7);
    }

    private l(String str, int i10, String str2) {
        Zh.f fVarH = Zh.f.h(str2);
        AbstractC6492s.h(fVarH, "identifier(...)");
        this.typeName = fVarH;
        Zh.f fVarH2 = Zh.f.h(str2 + "Array");
        AbstractC6492s.h(fVarH2, "identifier(...)");
        this.arrayTypeName = fVarH2;
        Yg.q qVar = Yg.q.PUBLICATION;
        this.typeFqName$delegate = Yg.n.a(qVar, new j(this));
        this.arrayTypeFqName$delegate = Yg.n.a(qVar, new k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Zh.c arrayTypeFqName_delegate$lambda$1(l lVar) {
        Zh.c cVarC = o.f51769A.c(lVar.arrayTypeName);
        AbstractC6492s.h(cVarC, "child(...)");
        return cVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Zh.c typeFqName_delegate$lambda$0(l lVar) {
        Zh.c cVarC = o.f51769A.c(lVar.typeName);
        AbstractC6492s.h(cVarC, "child(...)");
        return cVarC;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public final Zh.c getArrayTypeFqName() {
        return (Zh.c) this.arrayTypeFqName$delegate.getValue();
    }

    public final Zh.f getArrayTypeName() {
        return this.arrayTypeName;
    }

    public final Zh.c getTypeFqName() {
        return (Zh.c) this.typeFqName$delegate.getValue();
    }

    public final Zh.f getTypeName() {
        return this.typeName;
    }
}
