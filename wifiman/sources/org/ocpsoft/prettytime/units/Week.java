package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* loaded from: classes2.dex */
public class Week extends ResourcesTimeUnit {
    public Week() {
        f(604800000L);
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit
    protected String d() {
        return "Week";
    }
}
