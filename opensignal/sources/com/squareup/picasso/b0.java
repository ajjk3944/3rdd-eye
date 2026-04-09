package com.squareup.picasso;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes.dex */
public final class b0 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5877a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5878d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5879g;

    public b0(ReferenceQueue referenceQueue, Handler handler) {
        this.f5878d = referenceQueue;
        this.f5879g = handler;
        setDaemon(true);
        setName("Picasso-refQueue");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.f5877a) {
            case 0:
                Handler handler = (Handler) this.f5879g;
                Process.setThreadPriority(10);
                while (true) {
                    try {
                        a aVar = (a) ((ReferenceQueue) this.f5878d).remove(1000L);
                        Message messageObtainMessage = handler.obtainMessage();
                        if (aVar != null) {
                            messageObtainMessage.what = 3;
                            messageObtainMessage.obj = aVar.f5867a;
                            handler.sendMessage(messageObtainMessage);
                        } else {
                            messageObtainMessage.recycle();
                        }
                    } catch (InterruptedException unused) {
                        return;
                    } catch (Exception e4) {
                        handler.post(new k(2, e4));
                        return;
                    }
                }
            default:
                y9.s sVar = (y9.s) this.f5879g;
                AudioTrack audioTrack = (AudioTrack) this.f5878d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    return;
                } finally {
                    sVar.f25977h.open();
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(y9.s sVar, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.f5879g = sVar;
        this.f5878d = audioTrack;
    }
}
