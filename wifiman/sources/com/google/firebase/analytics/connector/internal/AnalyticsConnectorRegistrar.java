package com.google.firebase.analytics.connector.internal;

import F4.g;
import F4.q;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import m5.h;

@Keep
/* loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<F4.c> getComponents() {
        return Arrays.asList(F4.c.e(D4.a.class).b(q.j(com.google.firebase.f.class)).b(q.j(Context.class)).b(q.j(d5.d.class)).e(new g() { // from class: com.google.firebase.analytics.connector.internal.b
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return D4.b.c((com.google.firebase.f) dVar.a(com.google.firebase.f.class), (Context) dVar.a(Context.class), (d5.d) dVar.a(d5.d.class));
            }
        }).d().c(), h.b("fire-analytics", "22.3.0"));
    }
}
