package com.bytedance.sdk.component.adexpress.ypw;

import com.bytedance.sdk.component.adexpress.ypw.ru;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class sup implements ru.emc {
    private AtomicBoolean dg = new AtomicBoolean(false);
    cf emc;
    private zz xq;
    private List<ru> ypw;

    public sup(List<ru> list, zz zzVar) {
        this.ypw = list;
        this.xq = zzVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.ru.emc
    public void emc() {
        this.xq.dg();
        Iterator<ru> it = this.ypw.iterator();
        while (it.hasNext() && !it.next().emc(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.ru.emc
    public boolean xq() {
        return this.dg.get();
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.ru.emc
    public boolean ypw(ru ruVar) {
        int iIndexOf = this.ypw.indexOf(ruVar);
        return iIndexOf < this.ypw.size() - 1 && iIndexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.ru.emc
    public cf ypw() {
        return this.emc;
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.ru.emc
    public void emc(ru ruVar) {
        int iIndexOf = this.ypw.indexOf(ruVar);
        if (iIndexOf < 0) {
            return;
        }
        do {
            iIndexOf++;
            if (iIndexOf >= this.ypw.size()) {
                return;
            }
        } while (!this.ypw.get(iIndexOf).emc(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.ru.emc
    public void emc(cf cfVar) {
        this.emc = cfVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.ru.emc
    public void emc(boolean z6) {
        this.dg.getAndSet(z6);
    }
}
