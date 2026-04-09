package ui;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public abstract class c implements Iterable, InterfaceC6944a {
    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int b();

    public abstract void e(int i10, Object obj);

    public abstract Object get(int i10);

    @Override // java.lang.Iterable
    public abstract Iterator iterator();

    private c() {
    }
}
