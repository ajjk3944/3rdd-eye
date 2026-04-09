package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* loaded from: classes2.dex */
public class Year extends ResourcesTimeUnit {
    public Year() {
        f(31556925960L);
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit
    protected String d() {
        return "Year";
    }
}
