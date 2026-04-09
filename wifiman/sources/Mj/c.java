package Mj;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
class c {

    static final class a extends c {
        a() {
        }

        @Override // Mj.c
        List a(Executor executor) {
            return Arrays.asList(new g(), new i(executor));
        }

        @Override // Mj.c
        List b() {
            return Collections.singletonList(new q());
        }
    }

    c() {
    }

    List a(Executor executor) {
        return Collections.singletonList(new i(executor));
    }

    List b() {
        return Collections.emptyList();
    }
}
