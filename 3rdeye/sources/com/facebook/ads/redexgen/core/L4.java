package com.facebook.ads.redexgen.core;

import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: assets/audience_network.dex */
public class L4 implements Callable<Void> {
    public final File A00;
    public final /* synthetic */ AbstractC3626jN A01;

    public L4(AbstractC3626jN abstractC3626jN, File file) {
        this.A01 = abstractC3626jN;
        this.A00 = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Void call() throws Exception {
        this.A01.A06(this.A00);
        return null;
    }
}
