package com.zipoapps.premiumhelper.toto;

import androidx.work.g;
import androidx.work.p;
import b9.C1992A;
import com.zipoapps.premiumhelper.toto.PostConfigWorker;
import g2.AbstractC4381e;
import java.util.Collections;
import p9.l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37065b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f37066c;

    public /* synthetic */ a(p pVar, int i) {
        this.f37065b = i;
        this.f37066c = pVar;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f37065b) {
            case 0:
                return PostConfigWorker.Companion.scheduleNow$lambda$0(this.f37066c, (AbstractC4381e) obj);
            default:
                AbstractC4381e it = (AbstractC4381e) obj;
                kotlin.jvm.internal.l.f(it, "it");
                it.c("AcknowledgePurchaseWorker", g.KEEP, Collections.singletonList(this.f37066c));
                return C1992A.f18074a;
        }
    }
}
