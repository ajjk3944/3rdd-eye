package speedtest;

/* loaded from: classes2.dex */
public interface TcpSpeedtestServerApi {
    void close();

    SpeedtestServerEvaluation evaluate(SpeedtestServerEvaluationParams speedtestServerEvaluationParams);

    Speedtest_ testDownload(SpeedtestParams speedtestParams);

    Speedtest_ testUpload(SpeedtestParams speedtestParams);
}
