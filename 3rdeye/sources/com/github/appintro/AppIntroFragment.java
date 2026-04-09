package com.github.appintro;

import com.github.appintro.model.SliderPage;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: AppIntroFragment.kt */
/* loaded from: classes.dex */
public final class AppIntroFragment extends AppIntroBaseFragment {
    public static final Companion Companion = new Companion(null);

    /* compiled from: AppIntroFragment.kt */
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ AppIntroFragment createInstance$default(Companion companion, CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
            if ((i16 & 1) != 0) {
                charSequence = null;
            }
            if ((i16 & 2) != 0) {
                charSequence2 = null;
            }
            if ((i16 & 4) != 0) {
                i = 0;
            }
            if ((i16 & 8) != 0) {
                i10 = 0;
            }
            if ((i16 & 16) != 0) {
                i11 = 0;
            }
            if ((i16 & 32) != 0) {
                i12 = 0;
            }
            if ((i16 & 64) != 0) {
                i13 = 0;
            }
            if ((i16 & 128) != 0) {
                i14 = 0;
            }
            if ((i16 & 256) != 0) {
                i15 = 0;
            }
            return companion.createInstance(charSequence, charSequence2, i, i10, i11, i12, i13, i14, i15);
        }

        public static /* synthetic */ AppIntroFragment newInstance$default(Companion companion, CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
            if ((i16 & 1) != 0) {
                charSequence = null;
            }
            if ((i16 & 2) != 0) {
                charSequence2 = null;
            }
            if ((i16 & 4) != 0) {
                i = 0;
            }
            if ((i16 & 8) != 0) {
                i10 = 0;
            }
            if ((i16 & 16) != 0) {
                i11 = 0;
            }
            if ((i16 & 32) != 0) {
                i12 = 0;
            }
            if ((i16 & 64) != 0) {
                i13 = 0;
            }
            if ((i16 & 128) != 0) {
                i14 = 0;
            }
            if ((i16 & 256) != 0) {
                i15 = 0;
            }
            return companion.newInstance(charSequence, charSequence2, i, i10, i11, i12, i13, i14, i15);
        }

        public final AppIntroFragment createInstance() {
            return createInstance$default(this, null, null, 0, 0, 0, 0, 0, 0, 0, 511, null);
        }

        public final AppIntroFragment newInstance() {
            return newInstance$default(this, null, null, 0, 0, 0, 0, 0, 0, 0, 511, null);
        }

        private Companion() {
        }

        public final AppIntroFragment createInstance(CharSequence charSequence) {
            return createInstance$default(this, charSequence, null, 0, 0, 0, 0, 0, 0, 0, 510, null);
        }

        public final AppIntroFragment newInstance(CharSequence charSequence) {
            return newInstance$default(this, charSequence, null, 0, 0, 0, 0, 0, 0, 0, 510, null);
        }

        public final AppIntroFragment createInstance(CharSequence charSequence, CharSequence charSequence2) {
            return createInstance$default(this, charSequence, charSequence2, 0, 0, 0, 0, 0, 0, 0, 508, null);
        }

        public final AppIntroFragment newInstance(CharSequence charSequence, CharSequence charSequence2) {
            return newInstance$default(this, charSequence, charSequence2, 0, 0, 0, 0, 0, 0, 0, 508, null);
        }

        public final AppIntroFragment createInstance(CharSequence charSequence, CharSequence charSequence2, int i) {
            return createInstance$default(this, charSequence, charSequence2, i, 0, 0, 0, 0, 0, 0, 504, null);
        }

        public final AppIntroFragment newInstance(CharSequence charSequence, CharSequence charSequence2, int i) {
            return newInstance$default(this, charSequence, charSequence2, i, 0, 0, 0, 0, 0, 0, 504, null);
        }

        public final AppIntroFragment createInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10) {
            return createInstance$default(this, charSequence, charSequence2, i, i10, 0, 0, 0, 0, 0, 496, null);
        }

        public final AppIntroFragment newInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10) {
            return newInstance$default(this, charSequence, charSequence2, i, i10, 0, 0, 0, 0, 0, 496, null);
        }

        public final AppIntroFragment createInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11) {
            return createInstance$default(this, charSequence, charSequence2, i, i10, i11, 0, 0, 0, 0, 480, null);
        }

        public final AppIntroFragment newInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11) {
            return newInstance$default(this, charSequence, charSequence2, i, i10, i11, 0, 0, 0, 0, 480, null);
        }

        public final AppIntroFragment createInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12) {
            return createInstance$default(this, charSequence, charSequence2, i, i10, i11, i12, 0, 0, 0, 448, null);
        }

        public final AppIntroFragment newInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12) {
            return newInstance$default(this, charSequence, charSequence2, i, i10, i11, i12, 0, 0, 0, 448, null);
        }

        public final AppIntroFragment createInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13) {
            return createInstance$default(this, charSequence, charSequence2, i, i10, i11, i12, i13, 0, 0, 384, null);
        }

        public final AppIntroFragment newInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13) {
            return newInstance$default(this, charSequence, charSequence2, i, i10, i11, i12, i13, 0, 0, 384, null);
        }

        public final AppIntroFragment createInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14) {
            return createInstance$default(this, charSequence, charSequence2, i, i10, i11, i12, i13, i14, 0, 256, null);
        }

        public final AppIntroFragment newInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14) {
            return newInstance$default(this, charSequence, charSequence2, i, i10, i11, i12, i13, i14, 0, 256, null);
        }

        public final AppIntroFragment createInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14, int i15) {
            return createInstance(new SliderPage(charSequence, charSequence2, i, 0, 0, 0, i10, i11, i12, i13, i14, null, null, i15, 6200, null));
        }

        public final AppIntroFragment newInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14, int i15) {
            return createInstance(new SliderPage(charSequence, charSequence2, i, i10, i11, i12, 0, 0, 0, i13, i14, null, null, i15, 6592, null));
        }

        public final AppIntroFragment createInstance(SliderPage sliderPage) {
            l.f(sliderPage, "sliderPage");
            AppIntroFragment appIntroFragment = new AppIntroFragment();
            appIntroFragment.setArguments(sliderPage.toBundle());
            return appIntroFragment;
        }

        public final AppIntroFragment newInstance(SliderPage sliderPage) {
            l.f(sliderPage, "sliderPage");
            return createInstance(sliderPage);
        }
    }

    public static final AppIntroFragment createInstance() {
        return Companion.createInstance();
    }

    public static final AppIntroFragment newInstance() {
        return Companion.newInstance();
    }

    @Override // com.github.appintro.AppIntroBaseFragment
    public int getLayoutId() {
        return R.layout.appintro_fragment_intro;
    }

    public static final AppIntroFragment createInstance(SliderPage sliderPage) {
        return Companion.createInstance(sliderPage);
    }

    public static final AppIntroFragment newInstance(SliderPage sliderPage) {
        return Companion.newInstance(sliderPage);
    }

    public static final AppIntroFragment createInstance(CharSequence charSequence) {
        return Companion.createInstance(charSequence);
    }

    public static final AppIntroFragment newInstance(CharSequence charSequence) {
        return Companion.newInstance(charSequence);
    }

    public static final AppIntroFragment createInstance(CharSequence charSequence, CharSequence charSequence2) {
        return Companion.createInstance(charSequence, charSequence2);
    }

    public static final AppIntroFragment newInstance(CharSequence charSequence, CharSequence charSequence2) {
        return Companion.newInstance(charSequence, charSequence2);
    }

    public static final AppIntroFragment createInstance(CharSequence charSequence, CharSequence charSequence2, int i) {
        return Companion.createInstance(charSequence, charSequence2, i);
    }

    public static final AppIntroFragment newInstance(CharSequence charSequence, CharSequence charSequence2, int i) {
        return Companion.newInstance(charSequence, charSequence2, i);
    }

    public static final AppIntroFragment createInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10) {
        return Companion.createInstance(charSequence, charSequence2, i, i10);
    }

    public static final AppIntroFragment newInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10) {
        return Companion.newInstance(charSequence, charSequence2, i, i10);
    }

    public static final AppIntroFragment createInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11) {
        return Companion.createInstance(charSequence, charSequence2, i, i10, i11);
    }

    public static final AppIntroFragment newInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11) {
        return Companion.newInstance(charSequence, charSequence2, i, i10, i11);
    }

    public static final AppIntroFragment createInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12) {
        return Companion.createInstance(charSequence, charSequence2, i, i10, i11, i12);
    }

    public static final AppIntroFragment newInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12) {
        return Companion.newInstance(charSequence, charSequence2, i, i10, i11, i12);
    }

    public static final AppIntroFragment createInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13) {
        return Companion.createInstance(charSequence, charSequence2, i, i10, i11, i12, i13);
    }

    public static final AppIntroFragment newInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13) {
        return Companion.newInstance(charSequence, charSequence2, i, i10, i11, i12, i13);
    }

    public static final AppIntroFragment createInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14) {
        return Companion.createInstance(charSequence, charSequence2, i, i10, i11, i12, i13, i14);
    }

    public static final AppIntroFragment newInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14) {
        return Companion.newInstance(charSequence, charSequence2, i, i10, i11, i12, i13, i14);
    }

    public static final AppIntroFragment createInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14, int i15) {
        return Companion.createInstance(charSequence, charSequence2, i, i10, i11, i12, i13, i14, i15);
    }

    public static final AppIntroFragment newInstance(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14, int i15) {
        return Companion.newInstance(charSequence, charSequence2, i, i10, i11, i12, i13, i14, i15);
    }
}
