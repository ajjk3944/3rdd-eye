package com.google.firebase.remoteconfig.ktx;

import E.u;
import I4.a;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import q5.e;

/* compiled from: Logging.kt */
@Keep
/* loaded from: classes2.dex */
public final class FirebaseConfigLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a<?>> getComponents() {
        return u.G(e.a("fire-cfg-ktx", "22.0.0"));
    }
}
