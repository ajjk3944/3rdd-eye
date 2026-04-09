package io.sentry.compose;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import br.l;
import ee.f;
import io.sentry.u0;
import java.lang.reflect.Field;
import z0.m;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Field f12164a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f12165b;

    public a(u0 u0Var) {
        this.f12164a = f.o(u0Var, "androidx.compose.ui.platform.TestTagElement");
        this.f12165b = f.o(u0Var, "io.sentry.compose.SentryModifier$SentryTagModifierNodeElement");
    }

    public final String a(m mVar) {
        Field field;
        Field field2;
        l.e(mVar, "modifier");
        String name = mVar.getClass().getName();
        if ("androidx.compose.ui.platform.TestTagElement".equals(name) && (field2 = this.f12164a) != null) {
            return (String) field2.get(mVar);
        }
        if ("io.sentry.compose.SentryModifier$SentryTagModifierNodeElement".equals(name) && (field = this.f12165b) != null) {
            return (String) field.get(mVar);
        }
        if (!(mVar instanceof AppendedSemanticsElement)) {
            return null;
        }
        new SemanticsConfiguration().f1193g = false;
        throw null;
    }
}
