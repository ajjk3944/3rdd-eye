package kotlin.enums;

import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class a {
    public static final e9.a a(Enum[] entries) {
        p.e(entries, "entries");
        return new EnumEntriesList(entries);
    }
}
