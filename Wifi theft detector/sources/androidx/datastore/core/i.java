package androidx.datastore.core;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public interface i {
    Object getDefaultValue();

    Object readFrom(InputStream inputStream, c9.c cVar);

    Object writeTo(Object obj, OutputStream outputStream, c9.c cVar);
}
