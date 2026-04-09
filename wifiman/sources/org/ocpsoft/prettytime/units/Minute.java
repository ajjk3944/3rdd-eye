package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* loaded from: classes2.dex */
public class Minute extends ResourcesTimeUnit {
    public Minute() {
        f(60000L);
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit
    protected String d() {
        return "Minute";
    }
}
