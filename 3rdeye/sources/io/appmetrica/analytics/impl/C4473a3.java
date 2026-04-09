package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.a3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4473a3 implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4499b3 f40507a;

    public C4473a3(C4499b3 c4499b3) {
        this.f40507a = c4499b3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiConsumer
    public final void consume(Object obj, Object obj2) {
        Intent intent = (Intent) obj2;
        synchronized (this.f40507a) {
            try {
                C4499b3 c4499b3 = this.f40507a;
                c4499b3.f40574b = intent;
                Iterator it = c4499b3.f40573a.iterator();
                while (it.hasNext()) {
                    ((Consumer) it.next()).consume(intent);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
