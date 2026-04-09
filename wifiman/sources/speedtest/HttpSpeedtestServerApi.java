package speedtest;

/* loaded from: classes2.dex */
public interface HttpSpeedtestServerApi extends TcpSpeedtestServerApi {
    @Override // speedtest.TcpSpeedtestServerApi
    void close();

    @Override // speedtest.TcpSpeedtestServerApi
    SpeedtestServerEvaluation evaluate(SpeedtestServerEvaluationParams speedtestServerEvaluationParams);

    SpeedServerHandshakeResult serverHandshake(String str);

    @Override // speedtest.TcpSpeedtestServerApi
    Speedtest_ testDownload(SpeedtestParams speedtestParams);

    @Override // speedtest.TcpSpeedtestServerApi
    Speedtest_ testUpload(SpeedtestParams speedtestParams);
}
