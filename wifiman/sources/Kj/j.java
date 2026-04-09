package kj;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private File f51627a;

    /* renamed from: b, reason: collision with root package name */
    private RandomAccessFile f51628b;

    /* renamed from: c, reason: collision with root package name */
    private Object f51629c;

    public j(File file, String str) throws Exception {
        this.f51627a = new File(file, str);
        if (i.c("java.nio.channels.FileLock")) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f51627a, "rw");
                this.f51628b = randomAccessFile;
                Object objInvoke = randomAccessFile.getClass().getMethod("getChannel", null).invoke(this.f51628b, null);
                this.f51629c = objInvoke.getClass().getMethod("tryLock", null).invoke(objInvoke, null);
            } catch (IllegalAccessException unused) {
                this.f51629c = null;
            } catch (IllegalArgumentException unused2) {
                this.f51629c = null;
            } catch (NoSuchMethodException unused3) {
                this.f51629c = null;
            }
            if (this.f51629c != null) {
                return;
            }
            a();
            throw new Exception("Problem obtaining file lock");
        }
    }

    public void a() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        try {
            Object obj = this.f51629c;
            if (obj != null) {
                obj.getClass().getMethod("release", null).invoke(this.f51629c, null);
                this.f51629c = null;
            }
        } catch (Exception unused) {
        }
        RandomAccessFile randomAccessFile = this.f51628b;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            this.f51628b = null;
        }
        File file = this.f51627a;
        if (file != null && file.exists()) {
            this.f51627a.delete();
        }
        this.f51627a = null;
    }
}
