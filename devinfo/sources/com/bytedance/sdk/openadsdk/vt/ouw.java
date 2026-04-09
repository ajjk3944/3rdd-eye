package com.bytedance.sdk.openadsdk.vt;

import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ra;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ouw {
    protected boolean ouw = false;
    private final ExecutorService vt = Executors.newSingleThreadExecutor();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.vt.ouw$ouw, reason: collision with other inner class name */
    public class CallableC0118ouw implements Callable<Void> {
        private final File vt;

        public /* synthetic */ CallableC0118ouw(ouw ouwVar, File file, byte b10) {
            this(file);
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Void call() throws Exception {
            ouw.ouw(ouw.this, this.vt);
            return null;
        }

        private CallableC0118ouw(File file) {
            this.vt = file;
        }
    }

    public static long vt(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }

    public final void ouw(File file) throws IOException {
        this.vt.submit(new CallableC0118ouw(this, file, (byte) 0));
    }

    public abstract void ouw(List<File> list);

    public abstract boolean ouw(int i4);

    public abstract boolean vt(int i4);

    public static /* synthetic */ void ouw(ouw ouwVar, File file) throws IOException {
        if (ouwVar.ouw) {
            List<File> listOuw = ra.ouw(file);
            ko.ouw("LruDiskFile", "touchInBackground", listOuw.toString());
            ouwVar.ouw(listOuw);
        } else {
            try {
                ra.vt(file);
            } catch (Throwable th2) {
                ko.ouw("LruDiskFile", "setLastModifiedNowError", th2);
            }
            ouwVar.ouw(ra.ouw(file.getParentFile()));
        }
    }
}
