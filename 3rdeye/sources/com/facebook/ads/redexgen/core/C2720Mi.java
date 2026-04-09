package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Mi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2720Mi extends BroadcastReceiver {
    public static String[] A03 = {"dggRIwntGnoxWZ7BDQUg45Sl6NQgoMuN", "38c9H60yn2P1pt17", "STlEyQPStERy8tSXGvH8F24LWNUxdBhq", "hCwe", "bKRxwQpiW0PmVHVfGUn2RavmyNEFkRji", "VPPe2MO9HED0sxCZzVAB8cvkabJHsXeP", "uH31h0PRXTyVkIOgrCb5PcgaQIfZ1AyX", "pPlbIWWtmQkYN3MHTwcOdVUNUzBLXTby"};
    public AbstractC3555iA A00;
    public InterfaceC2719Mh A01;
    public String A02;

    public C2720Mi(String str, AbstractC3555iA abstractC3555iA, InterfaceC2719Mh interfaceC2719Mh) {
        this.A00 = abstractC3555iA;
        this.A01 = interfaceC2719Mh;
        this.A02 = str;
    }

    public final IntentFilter A00() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(EnumC3294dh.A06.A04(this.A02));
        intentFilter.addAction(EnumC3294dh.A09.A04(this.A02));
        intentFilter.addAction(EnumC3294dh.A04.A04(this.A02));
        intentFilter.addAction(EnumC3294dh.A0A.A04(this.A02));
        intentFilter.addAction(EnumC3294dh.A05.A04(this.A02));
        intentFilter.addAction(EnumC3294dh.A0C.A04(this.A02));
        intentFilter.addAction(EnumC3294dh.A0B.A04(this.A02));
        intentFilter.addAction(EnumC3294dh.A03.A04(this.A02));
        return intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        EnumC3294dh enumC3294dh = EnumC3294dh.A06;
        String action2 = this.A02;
        if (enumC3294dh.A04(action2).equals(action)) {
            this.A01.AF6(this.A00);
            return;
        }
        EnumC3294dh enumC3294dh2 = EnumC3294dh.A09;
        String action3 = this.A02;
        if (enumC3294dh2.A04(action3).equals(action)) {
            if (U7.A1t(context)) {
                this.A01.AF7(this.A00, AdError.AD_PRESENTATION_ERROR);
                return;
            } else {
                this.A01.AF7(this.A00, AdError.INTERNAL_ERROR);
                return;
            }
        }
        EnumC3294dh enumC3294dh3 = EnumC3294dh.A04;
        String action4 = this.A02;
        if (enumC3294dh3.A04(action4).equals(action)) {
            this.A01.AF3(this.A00);
            return;
        }
        EnumC3294dh enumC3294dh4 = EnumC3294dh.A0A;
        String action5 = this.A02;
        if (enumC3294dh4.A04(action5).equals(action)) {
            this.A01.AF5(this.A00);
            return;
        }
        EnumC3294dh enumC3294dh5 = EnumC3294dh.A05;
        String action6 = this.A02;
        boolean zEquals = enumC3294dh5.A04(action6).equals(action);
        if (A03[6].charAt(8) != 'X') {
            throw new RuntimeException();
        }
        A03[6] = "gVjZHTAPXXqW3paCpGTUxeCgOEd4dSxo";
        if (zEquals) {
            this.A01.onRewardedVideoClosed();
            return;
        }
        EnumC3294dh enumC3294dh6 = EnumC3294dh.A0B;
        String action7 = this.A02;
        if (enumC3294dh6.A04(action7).equals(action)) {
            InterfaceC2719Mh interfaceC2719Mh = this.A01;
            AbstractC3555iA abstractC3555iA = this.A00;
            String[] strArr = A03;
            if (strArr[2].charAt(25) != strArr[4].charAt(25)) {
                throw new RuntimeException();
            }
            A03[6] = "QgP7tKiwXm5h6JnagwUE7gN68w8IQRlz";
            interfaceC2719Mh.AF1(abstractC3555iA);
            return;
        }
        EnumC3294dh enumC3294dh7 = EnumC3294dh.A0C;
        String action8 = this.A02;
        if (enumC3294dh7.A04(action8).equals(action)) {
            this.A01.AF2(this.A00);
            return;
        }
        EnumC3294dh enumC3294dh8 = EnumC3294dh.A03;
        String str = this.A02;
        if (A03[0].charAt(19) != 'F') {
            A03[1] = "4VvB4uonEo2HdG2J";
            String action9 = enumC3294dh8.A04(str);
            if (!action9.equals(action)) {
                return;
            }
        } else {
            String action10 = enumC3294dh8.A04(str);
            if (!action10.equals(action)) {
                return;
            }
        }
        this.A01.onRewardedVideoActivityDestroyed();
    }
}
