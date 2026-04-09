package io.sentry;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.Reader;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public interface g1 {
    String a(ConcurrentHashMap concurrentHashMap);

    Object b(Reader reader, Class cls);

    i4.b c(BufferedInputStream bufferedInputStream);

    void d(i4.b bVar, OutputStream outputStream);

    void e(Object obj, BufferedWriter bufferedWriter);
}
