package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording;

import android.content.res.Resources;
import com.zipoapps.premiumhelper.d;
import com.zipoapps.premiumhelper.e;
import h.AbstractC4401e;
import java.lang.ref.WeakReference;
import m0.C5309b;

/* loaded from: classes.dex */
public class App extends d {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zipoapps.premiumhelper.d, android.app.Application
    public final void onCreate() throws Resources.NotFoundException, ClassNotFoundException {
        super.onCreate();
        e.f37006D.getClass();
        e.a.a().f37015d.getClass();
        if (AbstractC4401e.f37968c != 1) {
            AbstractC4401e.f37968c = 1;
            synchronized (AbstractC4401e.i) {
                try {
                    C5309b<WeakReference<AbstractC4401e>> c5309b = AbstractC4401e.f37973h;
                    c5309b.getClass();
                    C5309b.a aVar = new C5309b.a();
                    while (aVar.hasNext()) {
                        AbstractC4401e abstractC4401e = (AbstractC4401e) ((WeakReference) aVar.next()).get();
                        if (abstractC4401e != null) {
                            abstractC4401e.d();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
