package io.sentry.instrumentation.file;

import java.io.File;
import java.io.OutputStreamWriter;

/* loaded from: classes.dex */
public final class h extends OutputStreamWriter {
    public h(File file) {
        super(new f(f.b(file, null, true)));
    }
}
