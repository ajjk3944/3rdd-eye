package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class I7 extends AbstractC4410n {

    /* renamed from: c, reason: collision with root package name */
    private final P4 f35044c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f35045d;

    public I7(P4 p42) {
        super("require");
        this.f35045d = new HashMap();
        this.f35044c = p42;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4410n
    public final InterfaceC4449s a(Z2 z22, List list) {
        AbstractC4354g2.g("require", 1, list);
        String strZzf = z22.b((InterfaceC4449s) list.get(0)).zzf();
        if (this.f35045d.containsKey(strZzf)) {
            return (InterfaceC4449s) this.f35045d.get(strZzf);
        }
        InterfaceC4449s interfaceC4449sA = this.f35044c.a(strZzf);
        if (interfaceC4449sA instanceof AbstractC4410n) {
            this.f35045d.put(strZzf, (AbstractC4410n) interfaceC4449sA);
        }
        return interfaceC4449sA;
    }
}
