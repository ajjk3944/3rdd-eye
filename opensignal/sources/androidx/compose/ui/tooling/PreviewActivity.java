package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import c.l;
import d.a;
import io.sentry.android.core.e0;
import java.lang.reflect.Constructor;
import k0.i;
import kotlin.Metadata;
import v0.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Lc/l;", "<init>", "()V", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PreviewActivity extends l {
    @Override // c.l, g3.g, android.app.Activity
    public final void onCreate(Bundle bundle) throws ClassNotFoundException, SecurityException {
        String stringExtra;
        Class<?> cls;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        String strX0 = tt.l.X0(stringExtra, '.');
        String strT0 = tt.l.T0('.', stringExtra, stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            a.a(this, new d(new i(strX0, 1, strT0), -840626948, true));
            return;
        }
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException e4) {
            e0.c("PreviewLogger", "Unable to find PreviewProvider '" + stringExtra2 + '\'', e4);
            cls = null;
        }
        getIntent().getIntExtra("parameterProviderIndex", -1);
        int i10 = 0;
        if (cls == null) {
            a.a(this, new d(new s2.a(strX0, strT0, new Object[0]), -1901447514, true));
            return;
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            Constructor<?> constructor = null;
            boolean z10 = false;
            while (true) {
                if (i10 < length) {
                    Constructor<?> constructor2 = constructors[i10];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        constructor = constructor2;
                    }
                    i10++;
                } else if (!z10) {
                }
            }
            constructor = null;
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            br.l.c(constructor.newInstance(null), "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
            throw new ClassCastException();
        } catch (zq.a unused) {
            throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }
}
