package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ba {

    /* renamed from: a, reason: collision with root package name */
    private final Z9 f35673a;

    private ba(Z9 z92) {
        S9 s92 = R9.f35631b;
        this.f35673a = z92;
    }

    public static ba a(String str) {
        return new ba(new Z9("#vk "));
    }

    public final List b(CharSequence charSequence) {
        charSequence.getClass();
        Y9 y92 = new Y9(this.f35673a, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (y92.hasNext()) {
            arrayList.add((String) y92.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
