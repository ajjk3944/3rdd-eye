package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class CaseFormat {

    /* renamed from: b, reason: collision with root package name */
    public static final CaseFormat f11542b;

    /* renamed from: c, reason: collision with root package name */
    public static final CaseFormat f11543c;

    /* renamed from: d, reason: collision with root package name */
    public static final CaseFormat f11544d;

    /* renamed from: e, reason: collision with root package name */
    public static final CaseFormat f11545e;
    private final a wordBoundary;
    private final String wordSeparator;

    /* renamed from: a, reason: collision with root package name */
    public static final CaseFormat f11541a = new CaseFormat("LOWER_HYPHEN", 0, a.d('-'), "-") { // from class: com.google.common.base.CaseFormat.1
    };

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CaseFormat[] f11546f = d();

    static {
        String str = "_";
        f11542b = new CaseFormat("LOWER_UNDERSCORE", 1, a.d('_'), str) { // from class: com.google.common.base.CaseFormat.2
        };
        String str2 = "";
        f11543c = new CaseFormat("LOWER_CAMEL", 2, a.c('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.3
        };
        f11544d = new CaseFormat("UPPER_CAMEL", 3, a.c('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.4
        };
        f11545e = new CaseFormat("UPPER_UNDERSCORE", 4, a.d('_'), str) { // from class: com.google.common.base.CaseFormat.5
        };
    }

    public static /* synthetic */ CaseFormat[] d() {
        return new CaseFormat[]{f11541a, f11542b, f11543c, f11544d, f11545e};
    }

    public static CaseFormat valueOf(String str) {
        return (CaseFormat) Enum.valueOf(CaseFormat.class, str);
    }

    public static CaseFormat[] values() {
        return (CaseFormat[]) f11546f.clone();
    }

    public CaseFormat(String str, int i10, a aVar, String str2) {
        this.wordBoundary = aVar;
        this.wordSeparator = str2;
    }
}
