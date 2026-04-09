package io.sentry.cache;

import io.sentry.b5;
import io.sentry.x5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f12121a = Charset.forName("UTF-8");

    public static void a(x5 x5Var, String str, String str2) {
        File fileB = b(x5Var, str);
        if (fileB == null) {
            x5Var.getLogger().m(b5.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileB, str2);
        x5Var.getLogger().m(b5.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        x5Var.getLogger().m(b5.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    public static File b(x5 x5Var, String str) {
        String cacheDirPath = x5Var.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    public static Object c(x5 x5Var, String str, String str2, Class cls) {
        File fileB = b(x5Var, str);
        if (fileB == null) {
            x5Var.getLogger().m(b5.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileB, str2);
        if (!file.exists()) {
            x5Var.getLogger().m(b5.DEBUG, "No entry stored for %s", str2);
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f12121a));
            try {
                Object objB = x5Var.getSerializer().b(bufferedReader, cls);
                bufferedReader.close();
                return objB;
            } finally {
            }
        } catch (Throwable th2) {
            x5Var.getLogger().f(b5.ERROR, th2, "Error reading entity from scope cache: %s", str2);
            return null;
        }
    }

    public static void d(x5 x5Var, Object obj, String str, String str2) {
        File fileB = b(x5Var, str);
        if (fileB == null) {
            x5Var.getLogger().m(b5.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileB, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f12121a));
                try {
                    x5Var.getSerializer().e(obj, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            x5Var.getLogger().f(b5.ERROR, th2, "Error persisting entity: %s", str2);
        }
    }
}
