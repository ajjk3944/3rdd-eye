package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import com.google.ar.core.ImageFormat;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.u3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4736u3 implements InterfaceC4538c2 {

    /* renamed from: a, reason: collision with root package name */
    static final InterfaceC4538c2 f35732a = new C4736u3();

    private C4736u3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4538c2
    public final boolean zza(int i10) {
        if (i10 == 3000 || i10 == 4000 || i10 == 5000 || i10 == 6000 || i10 == 6001 || i10 == 7000 || i10 == 7001) {
            return true;
        }
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                switch (i10) {
                    case 20:
                    case 21:
                    case ImageFormat.RGBA_FP16 /* 22 */:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                        return true;
                    default:
                        switch (i10) {
                            case 40:
                            case 41:
                            case 42:
                                return true;
                            default:
                                switch (i10) {
                                    case 1000:
                                    case 1001:
                                    case 1002:
                                    case 1003:
                                    case 1004:
                                    case 1005:
                                    case 1006:
                                    case 1007:
                                    case 1008:
                                    case 1009:
                                    case 1010:
                                    case 1011:
                                    case 1012:
                                    case 1013:
                                    case 1014:
                                    case 1015:
                                    case 1016:
                                        return true;
                                    default:
                                        switch (i10) {
                                            case 2000:
                                            case 2001:
                                            case 2002:
                                            case 2003:
                                                return true;
                                            default:
                                                return false;
                                        }
                                }
                        }
                }
        }
    }
}
