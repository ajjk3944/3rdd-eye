package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class be4 extends AudioDeviceCallback {
    public final /* synthetic */ x03 a;

    public /* synthetic */ be4(x03 x03Var) {
        this.a = x03Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        x03 x03Var = this.a;
        x03Var.b(ae4.a((Context) x03Var.g, (in2) x03Var.o, (AudioDeviceInfo) x03Var.n));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        x03 x03Var;
        String str = v23.a;
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            x03Var = this.a;
            if (i >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i], (AudioDeviceInfo) x03Var.n)) {
                x03Var.n = null;
                break;
            }
            i++;
        }
        x03Var.b(ae4.a((Context) x03Var.g, (in2) x03Var.o, (AudioDeviceInfo) x03Var.n));
    }
}
