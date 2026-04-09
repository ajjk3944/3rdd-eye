package com.mbridge.msdk.dycreator.wrapper;

import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.List;

/* loaded from: classes3.dex */
public class DyOption {

    /* renamed from: a, reason: collision with root package name */
    private List<String> f14622a;

    /* renamed from: b, reason: collision with root package name */
    private File f14623b;

    /* renamed from: c, reason: collision with root package name */
    private CampaignEx f14624c;

    /* renamed from: d, reason: collision with root package name */
    private DyAdType f14625d;

    /* renamed from: e, reason: collision with root package name */
    private String f14626e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14627f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14628g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14629h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14630i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14631j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14632k;

    /* renamed from: l, reason: collision with root package name */
    private int f14633l;

    /* renamed from: m, reason: collision with root package name */
    private int f14634m;

    /* renamed from: n, reason: collision with root package name */
    private int f14635n;

    /* renamed from: o, reason: collision with root package name */
    private int f14636o;

    /* renamed from: p, reason: collision with root package name */
    private int f14637p;

    /* renamed from: q, reason: collision with root package name */
    private int f14638q;

    /* renamed from: r, reason: collision with root package name */
    private DyCountDownListenerWrapper f14639r;

    public static class Builder implements IViewOptionBuilder {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f14640a;

        /* renamed from: b, reason: collision with root package name */
        private File f14641b;

        /* renamed from: c, reason: collision with root package name */
        private CampaignEx f14642c;

        /* renamed from: d, reason: collision with root package name */
        private DyAdType f14643d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f14644e;

        /* renamed from: f, reason: collision with root package name */
        private String f14645f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f14646g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f14647h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f14648i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f14649j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f14650k;

        /* renamed from: l, reason: collision with root package name */
        private int f14651l;

        /* renamed from: m, reason: collision with root package name */
        private int f14652m;

        /* renamed from: n, reason: collision with root package name */
        private int f14653n;

        /* renamed from: o, reason: collision with root package name */
        private int f14654o;

        /* renamed from: p, reason: collision with root package name */
        private int f14655p;

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder adChoiceLink(String str) {
            this.f14645f = str;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public DyOption build() {
            return new DyOption(this);
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder campaignEx(CampaignEx campaignEx) {
            this.f14642c = campaignEx;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder canSkip(boolean z10) {
            this.f14644e = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder countDownTime(int i10) {
            this.f14654o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder dyAdType(DyAdType dyAdType) {
            this.f14643d = dyAdType;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder file(File file) {
            this.f14641b = file;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder fileDirs(List<String> list) {
            this.f14640a = list;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isApkInfoVisible(boolean z10) {
            this.f14649j = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isClickButtonVisible(boolean z10) {
            this.f14647h = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isLogoVisible(boolean z10) {
            this.f14650k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isScreenClick(boolean z10) {
            this.f14646g = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isShakeVisible(boolean z10) {
            this.f14648i = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder orientation(int i10) {
            this.f14653n = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeStrenght(int i10) {
            this.f14651l = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeTime(int i10) {
            this.f14652m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder templateType(int i10) {
            this.f14655p = i10;
            return this;
        }
    }

    public interface IViewOptionBuilder {
        IViewOptionBuilder adChoiceLink(String str);

        DyOption build();

        IViewOptionBuilder campaignEx(CampaignEx campaignEx);

        IViewOptionBuilder canSkip(boolean z10);

        IViewOptionBuilder countDownTime(int i10);

        IViewOptionBuilder dyAdType(DyAdType dyAdType);

        IViewOptionBuilder file(File file);

        IViewOptionBuilder fileDirs(List<String> list);

        IViewOptionBuilder isApkInfoVisible(boolean z10);

        IViewOptionBuilder isClickButtonVisible(boolean z10);

        IViewOptionBuilder isLogoVisible(boolean z10);

        IViewOptionBuilder isScreenClick(boolean z10);

        IViewOptionBuilder isShakeVisible(boolean z10);

        IViewOptionBuilder orientation(int i10);

        IViewOptionBuilder shakeStrenght(int i10);

        IViewOptionBuilder shakeTime(int i10);

        IViewOptionBuilder templateType(int i10);
    }

    public DyOption(Builder builder) {
        this.f14622a = builder.f14640a;
        this.f14623b = builder.f14641b;
        this.f14624c = builder.f14642c;
        this.f14625d = builder.f14643d;
        this.f14628g = builder.f14644e;
        this.f14626e = builder.f14645f;
        this.f14627f = builder.f14646g;
        this.f14629h = builder.f14647h;
        this.f14631j = builder.f14649j;
        this.f14630i = builder.f14648i;
        this.f14632k = builder.f14650k;
        this.f14633l = builder.f14651l;
        this.f14634m = builder.f14652m;
        this.f14635n = builder.f14653n;
        this.f14636o = builder.f14654o;
        this.f14638q = builder.f14655p;
    }

    public String getAdChoiceLink() {
        return this.f14626e;
    }

    public CampaignEx getCampaignEx() {
        return this.f14624c;
    }

    public int getCountDownTime() {
        return this.f14636o;
    }

    public int getCurrentCountDown() {
        return this.f14637p;
    }

    public DyAdType getDyAdType() {
        return this.f14625d;
    }

    public File getFile() {
        return this.f14623b;
    }

    public List<String> getFileDirs() {
        return this.f14622a;
    }

    public int getOrientation() {
        return this.f14635n;
    }

    public int getShakeStrenght() {
        return this.f14633l;
    }

    public int getShakeTime() {
        return this.f14634m;
    }

    public int getTemplateType() {
        return this.f14638q;
    }

    public boolean isApkInfoVisible() {
        return this.f14631j;
    }

    public boolean isCanSkip() {
        return this.f14628g;
    }

    public boolean isClickButtonVisible() {
        return this.f14629h;
    }

    public boolean isClickScreen() {
        return this.f14627f;
    }

    public boolean isLogoVisible() {
        return this.f14632k;
    }

    public boolean isShakeVisible() {
        return this.f14630i;
    }

    public void setDyCountDownListener(int i10) {
        DyCountDownListenerWrapper dyCountDownListenerWrapper = this.f14639r;
        if (dyCountDownListenerWrapper != null) {
            dyCountDownListenerWrapper.getCountDownValue(i10);
        }
        this.f14637p = i10;
    }

    public void setDyCountDownListenerWrapper(DyCountDownListenerWrapper dyCountDownListenerWrapper) {
        this.f14639r = dyCountDownListenerWrapper;
    }
}
