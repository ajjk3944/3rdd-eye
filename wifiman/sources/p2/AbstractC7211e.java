package p2;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: p2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7211e {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f57509a = new String[0];

    public static final void a(StringBuilder builder, int i10) {
        AbstractC6492s.i(builder, "builder");
        for (int i11 = 0; i11 < i10; i11++) {
            builder.append("?");
            if (i11 < i10 - 1) {
                builder.append(",");
            }
        }
    }

    public static final StringBuilder b() {
        return new StringBuilder();
    }
}
