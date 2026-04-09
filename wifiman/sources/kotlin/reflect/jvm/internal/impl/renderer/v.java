package kotlin.reflect.jvm.internal.impl.renderer;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class v {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final Set<v> ALL;
    public static final Set<v> ALL_EXCEPT_ANNOTATIONS;
    public static final a Companion;
    private final boolean includeByDefault;
    public static final v VISIBILITY = new v("VISIBILITY", 0, true);
    public static final v MODALITY = new v("MODALITY", 1, true);
    public static final v OVERRIDE = new v("OVERRIDE", 2, true);
    public static final v ANNOTATIONS = new v("ANNOTATIONS", 3, false);
    public static final v INNER = new v("INNER", 4, true);
    public static final v MEMBER_KIND = new v("MEMBER_KIND", 5, true);
    public static final v DATA = new v("DATA", 6, true);
    public static final v INLINE = new v("INLINE", 7, true);
    public static final v EXPECT = new v("EXPECT", 8, true);
    public static final v ACTUAL = new v("ACTUAL", 9, true);
    public static final v CONST = new v("CONST", 10, true);
    public static final v LATEINIT = new v("LATEINIT", 11, true);
    public static final v FUN = new v("FUN", 12, true);
    public static final v VALUE = new v("VALUE", 13, true);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final /* synthetic */ v[] $values() {
        return new v[]{VISIBILITY, MODALITY, OVERRIDE, ANNOTATIONS, INNER, MEMBER_KIND, DATA, INLINE, EXPECT, ACTUAL, CONST, LATEINIT, FUN, VALUE};
    }

    static {
        v[] vVarArr$values = $values();
        $VALUES = vVarArr$values;
        $ENTRIES = AbstractC5827b.a(vVarArr$values);
        Companion = new a(null);
        v[] vVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (v vVar : vVarArrValues) {
            if (vVar.includeByDefault) {
                arrayList.add(vVar);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = AbstractC3689v.n1(arrayList);
        ALL = AbstractC3682n.p1(values());
    }

    private v(String str, int i10, boolean z10) {
        this.includeByDefault = z10;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
