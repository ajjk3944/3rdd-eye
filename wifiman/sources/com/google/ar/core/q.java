package com.google.ar.core;

import android.media.ImageReader;

/* loaded from: classes3.dex */
final /* synthetic */ class q implements ImageReader.OnImageAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ q f38316a = new q();

    private /* synthetic */ q() {
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final /* synthetic */ void onImageAvailable(ImageReader imageReader) {
        SharedCamera.lambda$setDummyOnImageAvailableListener$0(imageReader);
    }
}
