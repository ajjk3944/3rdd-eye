package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.em;

/* loaded from: classes3.dex */
public abstract class en1 implements em {

    /* renamed from: b, reason: collision with root package name */
    public static final em.a<en1> f26928b = new J0(2);

    /* JADX INFO: Access modifiers changed from: private */
    public static en1 a(Bundle bundle) {
        int i = bundle.getInt(Integer.toString(0, 36), -1);
        if (i == 0) {
            return (en1) mf0.f30366e.fromBundle(bundle);
        }
        if (i == 1) {
            return (en1) mg1.f30372d.fromBundle(bundle);
        }
        if (i == 2) {
            return (en1) b22.f25068e.fromBundle(bundle);
        }
        if (i == 3) {
            return (en1) m42.f30204e.fromBundle(bundle);
        }
        throw new IllegalArgumentException(fe.a("Unknown RatingType: ", i));
    }
}
