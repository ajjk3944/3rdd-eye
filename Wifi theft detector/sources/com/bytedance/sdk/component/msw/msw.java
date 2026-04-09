package com.bytedance.sdk.component.msw;

/* loaded from: classes.dex */
public abstract class msw implements Comparable<msw>, Runnable {
    private int emc;
    private String ypw;

    public msw(String str, int i10) {
        this.emc = 0;
        this.emc = i10 == 0 ? 5 : i10;
        this.ypw = str;
    }

    public String getName() {
        return this.ypw;
    }

    public int getPriority() {
        return this.emc;
    }

    public void setPriority(int i10) {
        this.emc = i10;
    }

    @Override // java.lang.Comparable
    public int compareTo(msw mswVar) {
        if (getPriority() < mswVar.getPriority()) {
            return 1;
        }
        return getPriority() >= mswVar.getPriority() ? -1 : 0;
    }

    public msw(String str) {
        this.emc = 5;
        this.ypw = str;
    }
}
