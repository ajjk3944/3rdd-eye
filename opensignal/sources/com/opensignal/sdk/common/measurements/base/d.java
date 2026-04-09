package com.opensignal.sdk.common.measurements.base;

/* loaded from: classes.dex */
public enum d {
    NONE(0),
    RESTRICTED(1),
    NOT_RESTRICTED(2),
    CONNECTED(3);

    final Integer value;

    d(Integer num) {
        this.value = num;
    }

    public Integer getValue() {
        return this.value;
    }
}
