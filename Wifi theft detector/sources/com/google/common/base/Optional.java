package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;

@DoNotMock("Use Optional.of(value) or Optional.absent()")
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public static Optional d() {
        return Absent.j();
    }

    public static Optional h(Object obj) {
        return new Present(g.m(obj));
    }

    public abstract boolean g();

    public abstract Object i(Object obj);
}
