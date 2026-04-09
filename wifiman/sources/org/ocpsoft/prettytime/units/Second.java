package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* loaded from: classes2.dex */
public class Second extends ResourcesTimeUnit {
    public Second() {
        f(1000L);
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit
    protected String d() {
        return "Second";
    }
}
