package com.applovin.shadow.okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.util.Arrays;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@yj.a
/* renamed from: com.applovin.shadow.okio.-DeprecatedOkio, reason: invalid class name */
/* loaded from: classes.dex */
public final class DeprecatedOkio {
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    @yj.a
    public final Sink appendingSink(File file) {
        k.e(file, "file");
        return Okio.appendingSink(file);
    }

    @yj.a
    public final Sink blackhole() {
        return Okio.blackhole();
    }

    @yj.a
    public final BufferedSink buffer(Sink sink) {
        k.e(sink, "sink");
        return Okio.buffer(sink);
    }

    @yj.a
    public final Sink sink(File file) {
        k.e(file, "file");
        return Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    @yj.a
    public final Source source(File file) {
        k.e(file, "file");
        return Okio.source(file);
    }

    @yj.a
    public final BufferedSource buffer(Source source) {
        k.e(source, "source");
        return Okio.buffer(source);
    }

    @yj.a
    public final Sink sink(OutputStream outputStream) {
        k.e(outputStream, "outputStream");
        return Okio.sink(outputStream);
    }

    @yj.a
    public final Source source(InputStream inputStream) {
        k.e(inputStream, "inputStream");
        return Okio.source(inputStream);
    }

    @yj.a
    public final Sink sink(java.nio.file.Path path, OpenOption... openOptionArr) {
        k.e(path, "path");
        k.e(openOptionArr, "options");
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @yj.a
    public final Source source(java.nio.file.Path path, OpenOption... openOptionArr) {
        k.e(path, "path");
        k.e(openOptionArr, "options");
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @yj.a
    public final Sink sink(Socket socket) {
        k.e(socket, "socket");
        return Okio.sink(socket);
    }

    @yj.a
    public final Source source(Socket socket) {
        k.e(socket, "socket");
        return Okio.source(socket);
    }
}
