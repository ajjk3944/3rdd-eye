package com.staircase3.opensignal.firebase;

import android.content.SharedPreferences;
import as.x;
import br.l;
import com.google.firebase.messaging.FirebaseMessagingService;
import el.c;
import kc.f;
import kotlin.Metadata;
import lq.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/staircase3/opensignal/firebase/OSFirebaseIdService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OSFirebaseIdService extends FirebaseMessagingService {
    public final Object D = f.E(j.SYNCHRONIZED, new x(17, this));

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lq.h] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(String str) {
        l.e(str, "token");
        SharedPreferences.Editor editorEdit = ((c) this.D.getValue()).f8227a.edit();
        editorEdit.putString("preference_firebase_token", str);
        editorEdit.apply();
    }
}
