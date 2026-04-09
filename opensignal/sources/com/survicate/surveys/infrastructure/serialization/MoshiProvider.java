package com.survicate.surveys.infrastructure.serialization;

import java.util.ArrayList;
import kf.n;
import kotlin.Metadata;
import nk.f;
import nk.j0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/survicate/surveys/infrastructure/serialization/MoshiProvider;", "", "<init>", "()V", "Lnk/j0;", "provideMoshi", "()Lnk/j0;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MoshiProvider {
    public static final MoshiProvider INSTANCE = new MoshiProvider();

    private MoshiProvider() {
    }

    public static final j0 provideMoshi() throws SecurityException {
        n nVar = new n(1);
        SurvicateJsonAdapterFactory survicateJsonAdapterFactory = new SurvicateJsonAdapterFactory();
        int i10 = nVar.f14329b;
        nVar.f14329b = i10 + 1;
        ArrayList arrayList = nVar.f14328a;
        arrayList.add(i10, survicateJsonAdapterFactory);
        nVar.a(new MoshiColorAdapter());
        nVar.a(new MoshiTranslationsAdapter());
        arrayList.add(new f(6));
        return new j0(nVar);
    }
}
