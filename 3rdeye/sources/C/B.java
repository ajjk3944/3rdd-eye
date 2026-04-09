package C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: CaptureBundles.java */
/* loaded from: classes.dex */
public final class B implements androidx.camera.core.impl.Q {

    /* renamed from: a, reason: collision with root package name */
    public final List<androidx.camera.core.impl.T> f614a;

    public B(List<androidx.camera.core.impl.T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }
        this.f614a = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // androidx.camera.core.impl.Q
    public final List<androidx.camera.core.impl.T> a() {
        return this.f614a;
    }
}
