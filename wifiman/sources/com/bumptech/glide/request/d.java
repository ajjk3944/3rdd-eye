package com.bumptech.glide.request;

/* loaded from: classes.dex */
public interface d {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        a(boolean z10) {
            this.isComplete = z10;
        }

        boolean isComplete() {
            return this.isComplete;
        }
    }

    void a(c cVar);

    boolean b();

    boolean c(c cVar);

    boolean f(c cVar);

    d getRoot();

    void h(c cVar);

    boolean j(c cVar);
}
