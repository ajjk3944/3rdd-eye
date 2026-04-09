package com.google.android.recaptcha.internal;

import Ii.AbstractC3092z;
import Ii.InterfaceC3088x;
import Ii.InterfaceC3091y0;
import Ii.V;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
public final class zzbx {
    public static final V zza(Task task) {
        final InterfaceC3088x interfaceC3088xB = AbstractC3092z.b(null, 1, null);
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                InterfaceC3088x interfaceC3088x = interfaceC3088xB;
                Exception exception = task2.getException();
                if (exception != null) {
                    interfaceC3088x.a(exception);
                } else if (task2.isCanceled()) {
                    InterfaceC3091y0.a.b(interfaceC3088x, null, 1, null);
                } else {
                    interfaceC3088x.S(task2.getResult());
                }
            }
        });
        return new zzbw(interfaceC3088xB);
    }
}
