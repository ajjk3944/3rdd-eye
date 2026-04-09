.class public abstract Lspeedtest/Speedtest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lspeedtest/Speedtest$proxyTcpSpeedtestServerApi;,
        Lspeedtest/Speedtest$proxySpeedtestStatusCallback;,
        Lspeedtest/Speedtest$proxySpeedtestParams;,
        Lspeedtest/Speedtest$proxyResult;,
        Lspeedtest/Speedtest$proxyHttpSpeedtestServerApi;,
        Lspeedtest/Speedtest$proxyDirectoryServerApi;,
        Lspeedtest/Speedtest$proxyChangedCallback;
    }
.end annotation


# static fields
.field public static final ErrCancelled:J = 0x2L

.field public static final ErrIO:J = 0x5L

.field public static final ErrRest:J = 0x3L

.field public static final ErrRestUnexpected:J = 0x4L

.field public static final ErrServersUnavailable:J = 0x6L

.field public static final ErrTestInternal:J = 0x7L

.field public static final ErrUnknown:J = 0x1L

.field public static final GoSpeedTestAuthenticateTTLNotSet:I = -0x1

.field public static final InternetServersCheckStateFetch:J = 0x1L

.field public static final InternetServersCheckStateFinished:J = 0x3L

.field public static final InternetServersCheckStateIdle:J = 0x0L

.field public static final InternetServersCheckStateLatencyCheck:J = 0x2L

.field public static final SpeedServerStateActive:J = 0x3L

.field public static final SpeedServerStateIdle:J = 0x2L

.field public static final SpeedServerStateOff:J = 0x0L

.field public static final SpeedServerStateStarting:J = 0x1L

.field public static final SpeedTestEnvDev:Ljava/lang/String; = "dev"

.field public static final SpeedTestEnvProduction:Ljava/lang/String; = "prd"

.field public static final SpeedTestEnvStage:Ljava/lang/String; = "stg"

.field public static final SpeedTestStateFinished:J = 0x2L

.field public static final SpeedTestStateIdle:J = 0x0L

.field public static final SpeedTestStateStarted:J = 0x1L


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lgo/Seq;->touch()V

    invoke-static {}, Lspeedtest/Speedtest;->_init()V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native _init()V
.end method

.method public static native getErrInternal()Ljava/lang/Exception;
.end method

.method public static native getErrNoServers()Ljava/lang/Exception;
.end method

.method public static native newSpeedtestServer(Lspeedtest/SpeedtestServerParams;)Lspeedtest/SpeedtestServer;
.end method

.method public static native newTcpSpeedtestParams(Ljava/lang/String;JJZ)Lspeedtest/TcpSpeedTestParamsLocal;
.end method

.method public static native setDebugLogEnabled(ZLjava/lang/String;)V
.end method

.method public static native setErrInternal(Ljava/lang/Exception;)V
.end method

.method public static native setErrNoServers(Ljava/lang/Exception;)V
.end method

.method public static native setGOMAXPROCS(J)V
.end method

.method public static touch()V
    .locals 0

    return-void
.end method
