package com.bytedance.sdk.openadsdk.dg.xq;

import com.bytedance.sdk.openadsdk.utils.tp;

/* loaded from: classes.dex */
public class emc {

    /* renamed from: com.bytedance.sdk.openadsdk.dg.xq.emc$emc, reason: collision with other inner class name */
    public interface InterfaceC0088emc {
        public static final String bw;
        public static final String dg;
        public static final String emc;
        public static final String xq;
        public static final String ycc;
        public static final String ypw;

        static {
            CharSequence[] charSequenceArr = {tp.dr(), "load_start"};
            StringBuilder sb = new StringBuilder();
            sb.append(charSequenceArr[0]);
            sb.append((CharSequence) "_");
            sb.append(charSequenceArr[1]);
            emc = sb.toString();
            CharSequence[] charSequenceArr2 = {tp.dr(), "load_finish"};
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequenceArr2[0]);
            sb2.append((CharSequence) "_");
            sb2.append(charSequenceArr2[1]);
            ypw = sb2.toString();
            CharSequence[] charSequenceArr3 = {tp.dr(), "load_url"};
            StringBuilder sb3 = new StringBuilder();
            sb3.append(charSequenceArr3[0]);
            sb3.append((CharSequence) "_");
            sb3.append(charSequenceArr3[1]);
            xq = sb3.toString();
            CharSequence[] charSequenceArr4 = {tp.dr(), tp.sf()};
            StringBuilder sb4 = new StringBuilder();
            sb4.append(charSequenceArr4[0]);
            sb4.append((CharSequence) "_");
            sb4.append(charSequenceArr4[1]);
            dg = sb4.toString();
            CharSequence[] charSequenceArr5 = {tp.dr(), tp.sf(), "show"};
            StringBuilder sb5 = new StringBuilder();
            sb5.append(charSequenceArr5[0]);
            for (int i = 1; i < 3; i++) {
                sb5.append((CharSequence) "_");
                sb5.append(charSequenceArr5[i]);
            }
            bw = sb5.toString();
            CharSequence[] charSequenceArr6 = {tp.dr(), tp.sf(), "progress"};
            StringBuilder sb6 = new StringBuilder();
            sb6.append(charSequenceArr6[0]);
            for (int i3 = 1; i3 < 3; i3++) {
                sb6.append((CharSequence) "_");
                sb6.append(charSequenceArr6[i3]);
            }
            ycc = sb6.toString();
        }
    }
}
