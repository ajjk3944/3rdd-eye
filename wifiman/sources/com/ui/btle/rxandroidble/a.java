package com.ui.btle.rxandroidble;

import T8.b;
import android.os.Build;
import com.polidea.rxandroidble3.exceptions.BleException;
import com.ui.btle.v2.BTLEv2$Error;
import gg.y;
import kotlin.jvm.internal.AbstractC6492s;
import m9.C6783c;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f41106b;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f41108d;

    /* renamed from: a, reason: collision with root package name */
    public static final a f41105a = new a();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f41107c = true;

    /* renamed from: com.ui.btle.rxandroidble.a$a, reason: collision with other inner class name */
    public static final class C1281a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1281a f41109a = new C1281a();

        private C1281a() {
        }

        public final y a() {
            y yVarA = Gg.a.a();
            AbstractC6492s.h(yVarA, "computation()");
            return yVarA;
        }

        public final y b(b connection) {
            AbstractC6492s.i(connection, "connection");
            return C6783c.f53633a.h("BTLEv2FrameRead[" + connection.hashCode() + "]");
        }

        public final y c(b connection) {
            AbstractC6492s.i(connection, "connection");
            return C6783c.f53633a.h("BTLEv2FrameWrite[" + connection.hashCode() + "])");
        }
    }

    private a() {
    }

    public final int a() {
        return Build.VERSION.SDK_INT == 33 ? 515 : 517;
    }

    public final boolean b() {
        return f41107c;
    }

    public final boolean c() {
        return f41108d;
    }

    public final boolean d() {
        return f41106b;
    }

    public final boolean e(Throwable error) {
        AbstractC6492s.i(error, "error");
        if (error instanceof BTLEv2$Error) {
            return true;
        }
        return error instanceof BleException;
    }
}
