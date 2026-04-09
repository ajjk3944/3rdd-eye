package c2;

import android.app.Application;

/* compiled from: ProcessUtils.kt */
/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2051a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2051a f18407a = new C2051a();

    public final String a() {
        String processName = Application.getProcessName();
        kotlin.jvm.internal.l.e(processName, "getProcessName()");
        return processName;
    }
}
