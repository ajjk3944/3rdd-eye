package nc;

import android.net.Uri;
import ec.AbstractC5452a;
import java.io.File;
import mh.InterfaceC6835l;

/* renamed from: nc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6924a {

    /* renamed from: nc.a$a, reason: collision with other inner class name */
    public static final class C1986a {
        public static /* synthetic */ InterfaceC6835l a(InterfaceC6924a interfaceC6924a, AbstractC5452a abstractC5452a, AbstractC5452a abstractC5452a2, File file, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shareFile");
            }
            if ((i10 & 1) != 0) {
                abstractC5452a = null;
            }
            if ((i10 & 2) != 0) {
                abstractC5452a2 = null;
            }
            return interfaceC6924a.d(abstractC5452a, abstractC5452a2, file);
        }

        public static /* synthetic */ InterfaceC6835l b(InterfaceC6924a interfaceC6924a, AbstractC5452a abstractC5452a, File file, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shareImage");
            }
            if ((i10 & 1) != 0) {
                abstractC5452a = null;
            }
            return interfaceC6924a.b(abstractC5452a, file);
        }
    }

    InterfaceC6835l a(String str);

    InterfaceC6835l b(AbstractC5452a abstractC5452a, File file);

    InterfaceC6835l c(String str);

    InterfaceC6835l d(AbstractC5452a abstractC5452a, AbstractC5452a abstractC5452a2, File file);

    InterfaceC6835l e(AbstractC5452a abstractC5452a);

    InterfaceC6835l f(Uri uri);

    InterfaceC6835l g(AbstractC5452a abstractC5452a, AbstractC5452a abstractC5452a2, AbstractC5452a abstractC5452a3, AbstractC5452a abstractC5452a4, File... fileArr);
}
