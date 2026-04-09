package androidx.emoji2.text;

import androidx.emoji2.text.c;
import b1.i;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: EmojiCompatInitializer.java */
/* loaded from: classes.dex */
public final class d extends c.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.h f15731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f15732b;

    public d(c.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f15731a = hVar;
        this.f15732b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.c.h
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f15732b;
        try {
            this.f15731a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.c.h
    public final void b(i iVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f15732b;
        try {
            this.f15731a.b(iVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
