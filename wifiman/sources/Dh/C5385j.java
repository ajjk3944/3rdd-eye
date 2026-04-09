package dh;

import dh.InterfaceC5384i;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* renamed from: dh.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5385j implements InterfaceC5384i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final C5385j f46088a = new C5385j();

    private C5385j() {
    }

    @Override // dh.InterfaceC5384i
    public Object fold(Object obj, InterfaceC6839p operation) {
        AbstractC6492s.i(operation, "operation");
        return obj;
    }

    @Override // dh.InterfaceC5384i
    public InterfaceC5384i.b get(InterfaceC5384i.c key) {
        AbstractC6492s.i(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // dh.InterfaceC5384i
    public InterfaceC5384i minusKey(InterfaceC5384i.c key) {
        AbstractC6492s.i(key, "key");
        return this;
    }

    @Override // dh.InterfaceC5384i
    public InterfaceC5384i plus(InterfaceC5384i context) {
        AbstractC6492s.i(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
