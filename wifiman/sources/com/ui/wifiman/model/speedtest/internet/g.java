package com.ui.wifiman.model.speedtest.internet;

import com.ui.wifiman.model.speedtest.Speedtest;
import com.ui.wifiman.model.speedtest.internet.InternetSpeedtest;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class g {
    public static final InternetSpeedtest.b a(f fVar) {
        AbstractC6492s.i(fVar, "<this>");
        InternetSpeedtest.d.a aVar = (InternetSpeedtest.d.a) fVar.o().b();
        if (aVar == null) {
            return null;
        }
        if (aVar instanceof InternetSpeedtest.d.a.b) {
            return ((InternetSpeedtest.d.a.b) aVar).a();
        }
        if ((aVar instanceof InternetSpeedtest.d.a.C1422a) || (aVar instanceof InternetSpeedtest.d.a.c)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final List b(f fVar) {
        AbstractC6492s.i(fVar, "<this>");
        InternetSpeedtest.d.a aVar = (InternetSpeedtest.d.a) fVar.o().b();
        if (aVar == null) {
            return null;
        }
        if (aVar instanceof InternetSpeedtest.d.a.b) {
            return ((InternetSpeedtest.d.a.b) aVar).b();
        }
        if ((aVar instanceof InternetSpeedtest.d.a.C1422a) || (aVar instanceof InternetSpeedtest.d.a.c)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Integer c(Speedtest.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        return (Integer) dVar.d().b();
    }

    public static final Integer d(Speedtest.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        return (Integer) dVar.e().b();
    }
}
