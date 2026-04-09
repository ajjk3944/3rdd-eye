package P1;

import androidx.datastore.core.CorruptionException;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class b implements O1.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f18009a;

    public b(InterfaceC6835l produceNewData) {
        AbstractC6492s.i(produceNewData, "produceNewData");
        this.f18009a = produceNewData;
    }

    @Override // O1.a
    public Object a(CorruptionException corruptionException, InterfaceC5380e interfaceC5380e) {
        return this.f18009a.invoke(corruptionException);
    }
}
