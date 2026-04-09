package l1;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC1790x;
import androidx.lifecycle.j0;

/* compiled from: LoaderManager.java */
/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5266a {

    /* compiled from: LoaderManager.java */
    /* renamed from: l1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0487a<D> {
        androidx.loader.content.b<D> onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(androidx.loader.content.b<D> bVar, D d10);

        void onLoaderReset(androidx.loader.content.b<D> bVar);
    }

    public static C5267b a(InterfaceC1790x interfaceC1790x) {
        return new C5267b(interfaceC1790x, ((j0) interfaceC1790x).getViewModelStore());
    }
}
