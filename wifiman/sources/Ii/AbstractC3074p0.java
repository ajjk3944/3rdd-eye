package Ii;

import Ii.AbstractC3074p0;
import dh.AbstractC5377b;
import dh.InterfaceC5384i;
import java.io.Closeable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* renamed from: Ii.p0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3074p0 extends J implements Closeable, AutoCloseable {

    /* renamed from: c, reason: collision with root package name */
    public static final a f9351c = new a(null);

    /* renamed from: Ii.p0$a */
    public static final class a extends AbstractC5377b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC3074p0 d(InterfaceC5384i.b bVar) {
            if (bVar instanceof AbstractC3074p0) {
                return (AbstractC3074p0) bVar;
            }
            return null;
        }

        private a() {
            super(J.f9270b, new InterfaceC6835l() { // from class: Ii.o0
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return AbstractC3074p0.a.d((InterfaceC5384i.b) obj);
                }
            });
        }
    }
}
