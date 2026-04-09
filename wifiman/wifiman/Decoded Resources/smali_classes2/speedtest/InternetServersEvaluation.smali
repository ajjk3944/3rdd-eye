.class public final Lspeedtest/InternetServersEvaluation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgo/Seq$Proxy;


# instance fields
.field private final refnum:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lspeedtest/Speedtest;->touch()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lspeedtest/InternetServersEvaluation;->__New()I

    move-result v0

    iput v0, p0, Lspeedtest/InternetServersEvaluation;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lspeedtest/InternetServersEvaluation;->refnum:I

    invoke-static {p1, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method

.method private static native __New()I
.end method


# virtual methods
.method public native cancel()V
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_6

    instance-of v1, p1, Lspeedtest/InternetServersEvaluation;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lspeedtest/InternetServersEvaluation;

    invoke-virtual {p0}, Lspeedtest/InternetServersEvaluation;->getParams()Lspeedtest/InternetServersEvaluationParams;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/InternetServersEvaluation;->getParams()Lspeedtest/InternetServersEvaluationParams;

    move-result-object v2

    if-nez v1, :cond_1

    if-eqz v2, :cond_2

    return v0

    :cond_1
    invoke-virtual {v1, v2}, Lspeedtest/InternetServersEvaluationParams;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    invoke-virtual {p0}, Lspeedtest/InternetServersEvaluation;->getError()Lspeedtest/SpeedtestError;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/InternetServersEvaluation;->getError()Lspeedtest/SpeedtestError;

    move-result-object v2

    if-nez v1, :cond_3

    if-eqz v2, :cond_4

    return v0

    :cond_3
    invoke-virtual {v1, v2}, Lspeedtest/SpeedtestError;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v0

    :cond_4
    invoke-virtual {p0}, Lspeedtest/InternetServersEvaluation;->getState()J

    move-result-wide v1

    invoke-virtual {p1}, Lspeedtest/InternetServersEvaluation;->getState()J

    move-result-wide v3

    cmp-long p1, v1, v3

    if-eqz p1, :cond_5

    return v0

    :cond_5
    const/4 p1, 0x1

    return p1

    :cond_6
    :goto_0
    return v0
.end method

.method public native get(J)Lspeedtest/SpeedServerStatus;
.end method

.method public final native getError()Lspeedtest/SpeedtestError;
.end method

.method public final native getParams()Lspeedtest/InternetServersEvaluationParams;
.end method

.method public final native getState()J
.end method

.method public hashCode()I
    .locals 4

    invoke-virtual {p0}, Lspeedtest/InternetServersEvaluation;->getParams()Lspeedtest/InternetServersEvaluationParams;

    move-result-object v0

    invoke-virtual {p0}, Lspeedtest/InternetServersEvaluation;->getError()Lspeedtest/SpeedtestError;

    move-result-object v1

    invoke-virtual {p0}, Lspeedtest/InternetServersEvaluation;->getState()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final incRefnum()I
    .locals 1

    iget v0, p0, Lspeedtest/InternetServersEvaluation;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq;->incGoRef(ILgo/Seq$GoObject;)V

    iget v0, p0, Lspeedtest/InternetServersEvaluation;->refnum:I

    return v0
.end method

.method public final native setError(Lspeedtest/SpeedtestError;)V
.end method

.method public final native setParams(Lspeedtest/InternetServersEvaluationParams;)V
.end method

.method public final native setState(J)V
.end method

.method public native size()J
.end method

.method public native start(Lspeedtest/ChangedCallback;)V
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InternetServersEvaluation"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Params:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/InternetServersEvaluation;->getParams()Lspeedtest/InternetServersEvaluationParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Error:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/InternetServersEvaluation;->getError()Lspeedtest/SpeedtestError;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "State:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/InternetServersEvaluation;->getState()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
