package com.ubnt.usurvey.speedtest.model;

import Y6.h;
import Y6.k;
import Y6.o;
import Y6.r;
import Y6.v;
import Zg.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006\""}, d2 = {"Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvJsonAdapter;", "LY6/h;", "Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;", "LY6/r;", "moshi", "<init>", "(LY6/r;)V", "", "toString", "()Ljava/lang/String;", "LY6/k;", "reader", "l", "(LY6/k;)Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;", "LY6/o;", "writer", "value_", "LYg/J;", "m", "(LY6/o;Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;)V", "LY6/k$b;", SnmpConfigurator.O_AUTH_PROTOCOL, "LY6/k$b;", "options", SnmpConfigurator.O_BIND_ADDRESS, "LY6/h;", "nullableStringAdapter", "Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;", SnmpConfigurator.O_COMMUNITY, "nullableSpeedTestReportEnvUnifiAdapter", "", "Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvConnection;", "d", "nullableListOfSpeedTestReportEnvConnectionAdapter", "speedtest-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.ubnt.usurvey.speedtest.model.SpeedTestReportEnvJsonAdapter, reason: from toString */
/* loaded from: classes3.dex */
public final class GeneratedJsonAdapter extends h<SpeedTestReportEnv> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.b options;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h nullableStringAdapter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h nullableSpeedTestReportEnvUnifiAdapter;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h nullableListOfSpeedTestReportEnvConnectionAdapter;

    public GeneratedJsonAdapter(r moshi) {
        AbstractC6492s.i(moshi, "moshi");
        k.b bVarA = k.b.a("appName", "appVersion", "deviceModel", "deviceManufacturer", "os", "osVersion", "util", "utilArch", "utilVersion", "unifiInfo", "connection");
        AbstractC6492s.h(bVarA, "of(...)");
        this.options = bVarA;
        h hVarF = moshi.f(String.class, d0.e(), "appName");
        AbstractC6492s.h(hVarF, "adapter(...)");
        this.nullableStringAdapter = hVarF;
        h hVarF2 = moshi.f(SpeedTestReportEnvUnifi.class, d0.e(), "unifiInfo");
        AbstractC6492s.h(hVarF2, "adapter(...)");
        this.nullableSpeedTestReportEnvUnifiAdapter = hVarF2;
        h hVarF3 = moshi.f(v.j(List.class, SpeedTestReportEnvConnection.class), d0.e(), "connection");
        AbstractC6492s.h(hVarF3, "adapter(...)");
        this.nullableListOfSpeedTestReportEnvConnectionAdapter = hVarF3;
    }

    @Override // Y6.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public SpeedTestReportEnv b(k reader) {
        AbstractC6492s.i(reader, "reader");
        reader.g();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        SpeedTestReportEnvUnifi speedTestReportEnvUnifi = null;
        List list = null;
        while (reader.s()) {
            switch (reader.p0(this.options)) {
                case -1:
                    reader.t0();
                    reader.u0();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.b(reader);
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.b(reader);
                    break;
                case 2:
                    str3 = (String) this.nullableStringAdapter.b(reader);
                    break;
                case 3:
                    str4 = (String) this.nullableStringAdapter.b(reader);
                    break;
                case 4:
                    str5 = (String) this.nullableStringAdapter.b(reader);
                    break;
                case 5:
                    str6 = (String) this.nullableStringAdapter.b(reader);
                    break;
                case 6:
                    str7 = (String) this.nullableStringAdapter.b(reader);
                    break;
                case 7:
                    str8 = (String) this.nullableStringAdapter.b(reader);
                    break;
                case 8:
                    str9 = (String) this.nullableStringAdapter.b(reader);
                    break;
                case 9:
                    speedTestReportEnvUnifi = (SpeedTestReportEnvUnifi) this.nullableSpeedTestReportEnvUnifiAdapter.b(reader);
                    break;
                case 10:
                    list = (List) this.nullableListOfSpeedTestReportEnvConnectionAdapter.b(reader);
                    break;
            }
        }
        reader.j();
        return new SpeedTestReportEnv(str, str2, str3, str4, str5, str6, str7, str8, str9, speedTestReportEnvUnifi, list);
    }

    @Override // Y6.h
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(o writer, SpeedTestReportEnv value_) {
        AbstractC6492s.i(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.h();
        writer.J("appName");
        this.nullableStringAdapter.j(writer, value_.getAppName());
        writer.J("appVersion");
        this.nullableStringAdapter.j(writer, value_.getAppVersion());
        writer.J("deviceModel");
        this.nullableStringAdapter.j(writer, value_.getDeviceModel());
        writer.J("deviceManufacturer");
        this.nullableStringAdapter.j(writer, value_.getDeviceManufacturer());
        writer.J("os");
        this.nullableStringAdapter.j(writer, value_.getOs());
        writer.J("osVersion");
        this.nullableStringAdapter.j(writer, value_.getOsVersion());
        writer.J("util");
        this.nullableStringAdapter.j(writer, value_.getUtil());
        writer.J("utilArch");
        this.nullableStringAdapter.j(writer, value_.getUtilArch());
        writer.J("utilVersion");
        this.nullableStringAdapter.j(writer, value_.getUtilVersion());
        writer.J("unifiInfo");
        this.nullableSpeedTestReportEnvUnifiAdapter.j(writer, value_.getUnifiInfo());
        writer.J("connection");
        this.nullableListOfSpeedTestReportEnvConnectionAdapter.j(writer, value_.getConnection());
        writer.v();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SpeedTestReportEnv");
        sb2.append(')');
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }
}
