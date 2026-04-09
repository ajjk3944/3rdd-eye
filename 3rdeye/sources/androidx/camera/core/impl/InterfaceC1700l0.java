package androidx.camera.core.impl;

import android.view.Surface;
import java.util.concurrent.Executor;

/* compiled from: ImageReaderProxy.java */
/* renamed from: androidx.camera.core.impl.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1700l0 {

    /* compiled from: ImageReaderProxy.java */
    /* renamed from: androidx.camera.core.impl.l0$a */
    public interface a {
        void c(InterfaceC1700l0 interfaceC1700l0);
    }

    Surface a();

    androidx.camera.core.c b();

    void close();

    int d();

    void e();

    int f();

    androidx.camera.core.c g();

    int getHeight();

    int getWidth();

    void h(a aVar, Executor executor);
}
