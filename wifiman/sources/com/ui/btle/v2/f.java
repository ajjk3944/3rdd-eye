package com.ui.btle.v2;

import gg.AbstractC5912b;
import gg.z;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f41174a;

    public interface a {
        z f();
    }

    public interface b {
        AbstractC5912b a(byte[] bArr);
    }

    private /* synthetic */ f(byte[] bArr) {
        this.f41174a = bArr;
    }

    public static final /* synthetic */ f a(byte[] bArr) {
        return new f(bArr);
    }

    public static byte[] b(byte[] data) {
        AbstractC6492s.i(data, "data");
        return data;
    }

    public static boolean c(byte[] bArr, Object obj) {
        return (obj instanceof f) && AbstractC6492s.d(bArr, ((f) obj).f());
    }

    public static int d(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static String e(byte[] bArr) {
        return "BTLEv2PacketFrame(data=" + Arrays.toString(bArr) + ")";
    }

    public boolean equals(Object obj) {
        return c(this.f41174a, obj);
    }

    public final /* synthetic */ byte[] f() {
        return this.f41174a;
    }

    public int hashCode() {
        return d(this.f41174a);
    }

    public String toString() {
        return e(this.f41174a);
    }
}
