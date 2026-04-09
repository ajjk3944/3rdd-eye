package androidx.emoji2.text;

import android.os.Build;
import androidx.emoji2.text.c;
import b1.f;
import b1.i;
import java.util.ArrayList;

/* compiled from: EmojiCompat.java */
/* loaded from: classes.dex */
public final class b extends c.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.a f15712a;

    public b(c.a aVar) {
        this.f15712a = aVar;
    }

    @Override // androidx.emoji2.text.c.h
    public final void a(Throwable th) {
        this.f15712a.f15725a.d(th);
    }

    @Override // androidx.emoji2.text.c.h
    public final void b(i iVar) {
        c.a aVar = this.f15712a;
        aVar.f15724c = iVar;
        i iVar2 = aVar.f15724c;
        c cVar = aVar.f15725a;
        aVar.f15723b = new f(iVar2, cVar.f15721g, cVar.i, Build.VERSION.SDK_INT >= 34 ? b1.d.a() : b1.e.a());
        c cVar2 = aVar.f15725a;
        cVar2.getClass();
        ArrayList arrayList = new ArrayList();
        cVar2.f15715a.writeLock().lock();
        try {
            cVar2.f15717c = 1;
            arrayList.addAll(cVar2.f15716b);
            cVar2.f15716b.clear();
            cVar2.f15715a.writeLock().unlock();
            cVar2.f15718d.post(new c.f(arrayList, cVar2.f15717c, null));
        } catch (Throwable th) {
            cVar2.f15715a.writeLock().unlock();
            throw th;
        }
    }
}
