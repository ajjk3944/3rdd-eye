package bj;

import aj.AbstractC3868b;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class I {
    public static final H a(AbstractC3868b json, String source) {
        AbstractC6492s.i(json, "json");
        AbstractC6492s.i(source, "source");
        return !json.e().a() ? new H(source) : new J(source);
    }
}
