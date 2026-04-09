package com.bytedance.adsdk.ugeno.msw;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class ypw {
    private final DataSetObservable emc = new DataSetObservable();
    private DataSetObserver ypw;

    public float emc(int i10) {
        return 1.0f;
    }

    public abstract int emc();

    public abstract boolean emc(View view, Object obj);

    public void xq() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.ypw;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.emc.notifyChanged();
    }

    public Parcelable ypw() {
        return null;
    }

    public int emc(Object obj) {
        return -1;
    }

    public Object emc(ViewGroup viewGroup, int i10) {
        return emc((View) viewGroup, i10);
    }

    public void emc(ViewGroup viewGroup, int i10, Object obj) {
        emc((View) viewGroup, i10, obj);
    }

    @Deprecated
    public Object emc(View view, int i10) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void emc(View view, int i10, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void emc(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.ypw = dataSetObserver;
        }
    }
}
