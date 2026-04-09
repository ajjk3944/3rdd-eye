package com.bytedance.sdk.openadsdk.multipro;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.zin;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    private static boolean ouw = true;
    private static final AtomicBoolean vt = new AtomicBoolean(false);

    public static void ouw(Context context) {
        RandomAccessFile randomAccessFile;
        StringBuilder sb2;
        if (context == null || !ouw || !vt.compareAndSet(false, true)) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28) {
                return;
            }
            FileChannel fileChannel = null;
            FileLock fileLockTryLock = null;
            fileChannel = null;
            fileChannel = null;
            fileChannel = null;
            if (!zin.ouw(context)) {
                String strOuw = zin.ouw();
                try {
                    if (TextUtils.isEmpty(strOuw)) {
                        strOuw = context.getPackageName() + Process.myPid();
                    }
                    WebView.setDataDirectorySuffix(strOuw);
                    return;
                } catch (IllegalStateException unused) {
                    Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
                    Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
                    declaredMethod2.setAccessible(true);
                    Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
                    Field field = (Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix");
                    field.setAccessible(true);
                    if (TextUtils.isEmpty((String) field.get(cls))) {
                        field.set(cls, strOuw);
                        return;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
            String strVt = vt();
            File file = new File(context.getDir(TextUtils.isEmpty(strVt) ? "webview" : "webview_".concat(String.valueOf(strVt)), 0).getPath(), "webview_data.lock");
            ko.lh("TTAD.TTMultiInitHelper", file.getAbsolutePath());
            if (!file.exists()) {
                return;
            }
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    try {
                        FileChannel channel = randomAccessFile.getChannel();
                        if (channel != null) {
                            try {
                                fileLockTryLock = channel.tryLock();
                            } catch (Exception unused3) {
                                fileChannel = channel;
                                ouw(file);
                                if (fileChannel != null) {
                                    try {
                                        fileChannel.close();
                                    } catch (Throwable th2) {
                                        ko.vt("checkWebViewDataLock try close exclusiveFileChannel : " + th2.getMessage());
                                    }
                                }
                                if (randomAccessFile != null) {
                                    try {
                                        randomAccessFile.close();
                                        return;
                                    } catch (Throwable th3) {
                                        sb2 = new StringBuilder("checkWebViewDataLock try close accessFile : ");
                                        sb2.append(th3.getMessage());
                                        ko.vt(sb2.toString());
                                    }
                                }
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                fileChannel = channel;
                                if (fileChannel != null) {
                                    try {
                                        fileChannel.close();
                                    } catch (Throwable th5) {
                                        ko.vt("checkWebViewDataLock try close exclusiveFileChannel : " + th5.getMessage());
                                    }
                                }
                                if (randomAccessFile == null) {
                                    throw th;
                                }
                                try {
                                    randomAccessFile.close();
                                    throw th;
                                } catch (Throwable th6) {
                                    ko.vt("checkWebViewDataLock try close accessFile : " + th6.getMessage());
                                    throw th;
                                }
                            }
                        }
                        if (fileLockTryLock != null) {
                            fileLockTryLock.close();
                        } else {
                            ouw(file);
                        }
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (Throwable th7) {
                                ko.vt("checkWebViewDataLock try close exclusiveFileChannel : " + th7.getMessage());
                            }
                        }
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th8) {
                            sb2 = new StringBuilder("checkWebViewDataLock try close accessFile : ");
                            sb2.append(th8.getMessage());
                            ko.vt(sb2.toString());
                        }
                    } catch (Throwable th9) {
                        th = th9;
                    }
                } catch (Exception unused4) {
                }
            } catch (Exception unused5) {
                randomAccessFile = null;
            } catch (Throwable th10) {
                th = th10;
                randomAccessFile = null;
            }
        } catch (Throwable th11) {
            qbp.yu(th11.getMessage(), new Object[0]);
        }
    }

    private static String vt() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            return (String) ((Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix")).get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void ouw() {
        ouw = false;
    }

    private static void ouw(File file) throws IOException {
        ouw(file, file.exists() ? file.delete() : false);
    }

    private static void ouw(File file, boolean z3) throws IOException {
        if (!z3 || file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e2) {
            qbp.lh("TTAD.TTMultiInitHelper", e2.getMessage());
        }
    }
}
