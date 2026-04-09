package org.checkerframework.checker.i18nformatter.qual;

import ca.b;
import java.util.Date;
import java.util.StringJoiner;

/* loaded from: classes4.dex */
public enum I18nConversionCategory {
    UNUSED(null, null),
    GENERAL(null, null),
    DATE(new Class[]{Date.class, Number.class}, new String[]{"date", "time"}),
    NUMBER(new Class[]{Number.class}, new String[]{"number", "choice"});


    /* renamed from: e, reason: collision with root package name */
    public static I18nConversionCategory[] f23717e = {DATE, NUMBER};
    public final String[] strings;
    public final Class<?>[] types;

    I18nConversionCategory(Class[] clsArr, String[] strArr) {
        this.types = clsArr;
        this.strings = strArr;
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sb = new StringBuilder(name());
        if (this.types == null) {
            sb.append(" conversion category (all types)");
        } else {
            StringJoiner stringJoinerA = b.a(", ", " conversion category (one of: ", ")");
            for (Class<?> cls : this.types) {
                stringJoinerA.add(cls.getCanonicalName());
            }
            sb.append(stringJoinerA);
        }
        return sb.toString();
    }
}
