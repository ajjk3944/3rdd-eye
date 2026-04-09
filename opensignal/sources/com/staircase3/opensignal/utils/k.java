package com.staircase3.opensignal.utils;

import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
public final class k {
    public static int a(i.j jVar, r rVar) {
        String networkOperator;
        String simOperator;
        br.l.e(rVar, "telephonyManagerUtils");
        if (jVar == null) {
            return -1;
        }
        try {
            TelephonyManager telephonyManagerA = rVar.a(jVar);
            if (telephonyManagerA != null) {
                networkOperator = telephonyManagerA.getNetworkOperator();
                br.l.d(networkOperator, "getNetworkOperator(...)");
                simOperator = telephonyManagerA.getSimOperator();
                br.l.d(simOperator, "getSimOperator(...)");
            } else {
                networkOperator = "-1";
                simOperator = "-1";
            }
            if ((simOperator.length() != 6 && simOperator.length() != 5) || networkOperator.length() == 6 || networkOperator.length() == 5) {
                simOperator = !xu.d.f25536b ? networkOperator : "- ";
            }
            return Integer.parseInt(simOperator);
        } catch (Exception unused) {
            return -1;
        }
    }
}
