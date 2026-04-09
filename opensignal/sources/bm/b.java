package bm;

import br.l;
import com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase_Impl;
import com.staircase3.opensignal.goldstar.persistence.VideoTestResult;
import com.staircase3.opensignal.goldstar.speedtest.result.SpeedTestResult;
import dt.w;

/* loaded from: classes.dex */
public final class b extends w {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2823e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(OpensignalDatabase_Impl opensignalDatabase_Impl, int i10) {
        super(opensignalDatabase_Impl);
        this.f2823e = i10;
    }

    @Override // dt.w
    public final String a() {
        switch (this.f2823e) {
            case 0:
                return "INSERT OR ABORT INTO `speed_test` (`id`,`time`,`dl_speed`,`ul_speed`,`latency`,`network_type`,`connection_type`,`network_name`,`ssid`,`latitude`,`longitude`,`place_type`,`seen`,`network_provider`,`network_generation`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR ABORT INTO `video_test` (`id`,`time`,`bufferingTime`,`loadingTime`,`playbackTime`,`videoResolution`,`videoLength`,`testLength`,`latitude`,`longitude`,`networkType`,`networkProvider`,`networkSubtype`,`seen`,`network_generation`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public final void g(o7.e eVar, Object obj) {
        switch (this.f2823e) {
            case 0:
                SpeedTestResult speedTestResult = (SpeedTestResult) obj;
                eVar.A(1, speedTestResult.f6095a);
                eVar.A(2, speedTestResult.f6096d);
                eVar.A(3, speedTestResult.f6097g);
                eVar.A(4, speedTestResult.f6098r);
                eVar.A(5, speedTestResult.f6099x);
                String str = speedTestResult.f6100y;
                if (str == null) {
                    eVar.U(6);
                } else {
                    eVar.m(6, str);
                }
                eVar.A(7, speedTestResult.B);
                String str2 = speedTestResult.D;
                if (str2 == null) {
                    eVar.U(8);
                } else {
                    eVar.m(8, str2);
                }
                String str3 = speedTestResult.E;
                if (str3 == null) {
                    eVar.U(9);
                } else {
                    eVar.m(9, str3);
                }
                eVar.T(speedTestResult.F, 10);
                eVar.T(speedTestResult.G, 11);
                l.e(speedTestResult.H, "placeType");
                eVar.A(12, r0.getIntValue());
                eVar.A(13, speedTestResult.I ? 1L : 0L);
                eVar.m(14, speedTestResult.J);
                com.staircase3.opensignal.utils.l lVar = speedTestResult.K;
                l.e(lVar, "networkGeneration");
                eVar.m(15, lVar.name());
                break;
            default:
                VideoTestResult videoTestResult = (VideoTestResult) obj;
                eVar.A(1, videoTestResult.f6086a);
                eVar.A(2, videoTestResult.f6087d);
                eVar.A(3, videoTestResult.f6088g);
                eVar.A(4, videoTestResult.f6089r);
                eVar.T(videoTestResult.f6090x, 5);
                String str4 = videoTestResult.f6091y;
                if (str4 == null) {
                    eVar.U(6);
                } else {
                    eVar.m(6, str4);
                }
                eVar.A(7, videoTestResult.B);
                eVar.A(8, videoTestResult.D);
                eVar.T(videoTestResult.E, 9);
                eVar.T(videoTestResult.F, 10);
                um.a aVar = videoTestResult.G;
                String strName = aVar == null ? null : aVar.name();
                if (strName == null) {
                    eVar.U(11);
                } else {
                    eVar.m(11, strName);
                }
                String str5 = videoTestResult.H;
                if (str5 == null) {
                    eVar.U(12);
                } else {
                    eVar.m(12, str5);
                }
                String str6 = videoTestResult.I;
                if (str6 == null) {
                    eVar.U(13);
                } else {
                    eVar.m(13, str6);
                }
                eVar.A(14, videoTestResult.J ? 1L : 0L);
                com.staircase3.opensignal.utils.l lVar2 = videoTestResult.K;
                l.e(lVar2, "networkGeneration");
                eVar.m(15, lVar2.name());
                break;
        }
    }
}
