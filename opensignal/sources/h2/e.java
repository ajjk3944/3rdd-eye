package h2;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class e implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9808a;

    public /* synthetic */ e(int i10) {
        this.f9808a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f9808a) {
        }
        return se.b.n(Integer.valueOf(((d) obj).f9801b), Integer.valueOf(((d) obj2).f9801b));
    }
}
