package com.github.appintro;

import kotlin.jvm.internal.g;

/* compiled from: AppIntroPageTransformerType.kt */
/* loaded from: classes.dex */
public abstract class AppIntroPageTransformerType {

    /* compiled from: AppIntroPageTransformerType.kt */
    public static final class Depth extends AppIntroPageTransformerType {
        public static final Depth INSTANCE = new Depth();

        private Depth() {
            super(null);
        }
    }

    /* compiled from: AppIntroPageTransformerType.kt */
    public static final class Fade extends AppIntroPageTransformerType {
        public static final Fade INSTANCE = new Fade();

        private Fade() {
            super(null);
        }
    }

    /* compiled from: AppIntroPageTransformerType.kt */
    public static final class Flow extends AppIntroPageTransformerType {
        public static final Flow INSTANCE = new Flow();

        private Flow() {
            super(null);
        }
    }

    /* compiled from: AppIntroPageTransformerType.kt */
    public static final class Parallax extends AppIntroPageTransformerType {
        private final double descriptionParallaxFactor;
        private final double imageParallaxFactor;
        private final double titleParallaxFactor;

        public Parallax() {
            this(0.0d, 0.0d, 0.0d, 7, null);
        }

        public final double getDescriptionParallaxFactor() {
            return this.descriptionParallaxFactor;
        }

        public final double getImageParallaxFactor() {
            return this.imageParallaxFactor;
        }

        public final double getTitleParallaxFactor() {
            return this.titleParallaxFactor;
        }

        public /* synthetic */ Parallax(double d10, double d11, double d12, int i, g gVar) {
            this((i & 1) != 0 ? 1.0d : d10, (i & 2) != 0 ? -1.0d : d11, (i & 4) != 0 ? 2.0d : d12);
        }

        public Parallax(double d10, double d11, double d12) {
            super(null);
            this.titleParallaxFactor = d10;
            this.imageParallaxFactor = d11;
            this.descriptionParallaxFactor = d12;
        }
    }

    /* compiled from: AppIntroPageTransformerType.kt */
    public static final class SlideOver extends AppIntroPageTransformerType {
        public static final SlideOver INSTANCE = new SlideOver();

        private SlideOver() {
            super(null);
        }
    }

    /* compiled from: AppIntroPageTransformerType.kt */
    public static final class Zoom extends AppIntroPageTransformerType {
        public static final Zoom INSTANCE = new Zoom();

        private Zoom() {
            super(null);
        }
    }

    public /* synthetic */ AppIntroPageTransformerType(g gVar) {
        this();
    }

    private AppIntroPageTransformerType() {
    }
}
