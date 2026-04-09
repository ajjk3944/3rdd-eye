package Zc;

import dd.InterfaceC5347a;
import gg.i;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;

/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f25270b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final i f25271a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(InterfaceC5347a latencyService) {
        AbstractC6492s.i(latencyService, "latencyService");
        i iVarI2 = latencyService.a("8.8.8.8", DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT, 300).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f25271a = iVarI2;
    }

    @Override // Zc.c
    public i a() {
        return this.f25271a;
    }
}
