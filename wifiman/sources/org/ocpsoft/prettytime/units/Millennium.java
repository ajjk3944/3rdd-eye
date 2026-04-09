package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* loaded from: classes2.dex */
public class Millennium extends ResourcesTimeUnit {
    public Millennium() {
        f(31556926000000L);
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit
    protected String d() {
        return "Millennium";
    }
}
