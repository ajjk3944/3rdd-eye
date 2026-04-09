package k8;

import Cc.AbstractC2558b;
import Cc.C2559c;
import com.ubnt.usurvey.R;
import kotlin.jvm.internal.AbstractC6492s;
import s9.InterfaceC7929a;
import s9.b;
import s9.c;
import s9.d;

/* renamed from: k8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6402b {
    public static final s9.d a(AbstractC2558b abstractC2558b) {
        AbstractC6492s.i(abstractC2558b, "<this>");
        Integer numValueOf = abstractC2558b instanceof AbstractC2558b.g.a ? Integer.valueOf(R.string.device_type_ap) : abstractC2558b instanceof AbstractC2558b.g.C0123b ? Integer.valueOf(R.string.device_type_network_gateway) : abstractC2558b instanceof AbstractC2558b.g.c ? Integer.valueOf(R.string.device_type_switch) : abstractC2558b instanceof AbstractC2558b.g ? Integer.valueOf(R.string.device_type_networking) : abstractC2558b instanceof AbstractC2558b.c ? Integer.valueOf(R.string.device_type_camera) : abstractC2558b instanceof AbstractC2558b.AbstractC0120b.a ? Integer.valueOf(R.string.device_type_apple_imac) : abstractC2558b instanceof AbstractC2558b.AbstractC0120b.d ? Integer.valueOf(R.string.device_type_apple_iphone) : abstractC2558b instanceof AbstractC2558b.AbstractC0120b.c ? Integer.valueOf(R.string.device_type_apple_ipad) : abstractC2558b instanceof AbstractC2558b.AbstractC0120b.C0121b ? Integer.valueOf(R.string.device_type_apple_macbook) : abstractC2558b instanceof AbstractC2558b.a.C0118a ? Integer.valueOf(R.string.device_type_phone) : abstractC2558b instanceof AbstractC2558b.a.C0119b ? Integer.valueOf(R.string.device_type_tablet) : ((abstractC2558b instanceof AbstractC2558b.i) || (abstractC2558b instanceof Cc.d)) ? Integer.valueOf(R.string.device_type_phone) : abstractC2558b instanceof C2559c ? Integer.valueOf(R.string.device_type_microsoft_windows10) : abstractC2558b instanceof Cc.f ? Integer.valueOf(R.string.device_type_microsoft_windows_iot) : abstractC2558b instanceof Cc.e ? Integer.valueOf(R.string.device_type_microsoft_surface) : abstractC2558b instanceof AbstractC2558b.d.a ? Integer.valueOf(R.string.device_type_microsoft_xbox) : abstractC2558b instanceof AbstractC2558b.h ? Integer.valueOf(R.string.device_type_computer) : abstractC2558b instanceof AbstractC2558b.j ? Integer.valueOf(R.string.device_type_printer) : abstractC2558b instanceof AbstractC2558b.k ? Integer.valueOf(R.string.device_type_scanner) : abstractC2558b instanceof AbstractC2558b.l ? Integer.valueOf(R.string.device_type_speaker) : abstractC2558b instanceof AbstractC2558b.m ? Integer.valueOf(R.string.device_type_toy) : null;
        if (numValueOf != null) {
            return new d.b(numValueOf.intValue());
        }
        return null;
    }

    public static final InterfaceC7929a.b b(AbstractC2558b abstractC2558b) {
        AbstractC6492s.i(abstractC2558b, "<this>");
        Integer num = ((abstractC2558b instanceof AbstractC2558b.i) || (abstractC2558b instanceof AbstractC2558b.a.C0118a)) ? 2131166181 : abstractC2558b instanceof AbstractC2558b.a.C0119b ? 2131166182 : abstractC2558b instanceof AbstractC2558b.AbstractC0120b.d ? 2131166187 : abstractC2558b instanceof AbstractC2558b.AbstractC0120b.c ? 2131166188 : null;
        if (num != null) {
            return new c.a(num.intValue(), null, 2, null);
        }
        if (!(abstractC2558b instanceof AbstractC2558b.h) && !(abstractC2558b instanceof AbstractC2558b.AbstractC0120b.a)) {
            if (abstractC2558b instanceof AbstractC2558b.AbstractC0120b.C0121b) {
                return new b.a(R.drawable.ic_apple_macbook_48, null, null, 6, null);
            }
            if (abstractC2558b instanceof AbstractC2558b.j) {
                return new b.a(R.drawable.ic_printer_48, null, null, 6, null);
            }
            if (abstractC2558b instanceof AbstractC2558b.k) {
                return new b.a(R.drawable.ic_scanner_48, null, null, 6, null);
            }
            if (abstractC2558b instanceof AbstractC2558b.l) {
                return new b.a(R.drawable.ic_speaker_48, null, null, 6, null);
            }
            if (abstractC2558b instanceof AbstractC2558b.g.C0123b) {
                return Pe.a.f18599a.o();
            }
            if (abstractC2558b instanceof AbstractC2558b.g.a) {
                return Pe.a.f18599a.c();
            }
            if (abstractC2558b instanceof AbstractC2558b.m) {
                return new b.a(R.drawable.ic_outline_toys_24, null, null, 6, null);
            }
            return null;
        }
        return new b.a(R.drawable.ic_apple_imac_48, null, null, 6, null);
    }
}
