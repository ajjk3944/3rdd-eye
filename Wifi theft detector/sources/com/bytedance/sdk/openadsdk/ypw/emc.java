package com.bytedance.sdk.openadsdk.ypw;

import com.bytedance.sdk.component.utils.uym;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class emc {
    protected boolean emc = false;
    private final ExecutorService ypw = Executors.newSingleThreadExecutor();

    /* renamed from: com.bytedance.sdk.openadsdk.ypw.emc$emc, reason: collision with other inner class name */
    public class CallableC0190emc implements Callable<Void> {
        private final File ypw;

        @Override // java.util.concurrent.Callable
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            emc.this.ypw(this.ypw);
            return null;
        }

        private CallableC0190emc(File file) {
            this.ypw = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(File file) throws IOException {
        if (!this.emc) {
            try {
                uym.ypw(file);
            } catch (Throwable unused) {
            }
            emc(uym.emc(file.getParentFile()));
        } else {
            List<File> listEmc = uym.emc(file);
            listEmc.toString();
            emc(listEmc);
        }
    }

    public abstract void emc(List<File> list);

    public abstract boolean emc(long j10, int i10);

    public abstract boolean emc(File file, long j10, int i10);

    public void emc(File file) throws IOException {
        this.ypw.submit(new CallableC0190emc(file));
    }

    public long ypw(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }
}
