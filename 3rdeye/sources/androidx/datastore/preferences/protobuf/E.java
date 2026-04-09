package androidx.datastore.preferences.protobuf;

import java.util.List;

/* compiled from: LazyStringList.java */
/* loaded from: classes.dex */
public interface E extends List {
    void a(AbstractC1730h abstractC1730h);

    Object getRaw(int i);

    List<?> getUnderlyingElements();

    E getUnmodifiableView();
}
