package j6;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CompositeDisposable.kt */
/* renamed from: j6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5196a implements d {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f42983b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f42984c;

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() throws Exception {
        ArrayList arrayList = this.f42983b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((d) it.next()).close();
        }
        arrayList.clear();
        this.f42984c = true;
    }
}
