.class public final LIa/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIa/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lspeedtest/SpeedTestApiTestReportClientInfo;

.field private final b:Lspeedtest/Duration;

.field private final c:Lspeedtest/LinkSpeed;

.field private final d:Lspeedtest/LinkSpeed;


# direct methods
.method public constructor <init>(Lspeedtest/SpeedTestApiTestReportClientInfo;Lspeedtest/Duration;Lspeedtest/LinkSpeed;Lspeedtest/LinkSpeed;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIa/b$a;->a:Lspeedtest/SpeedTestApiTestReportClientInfo;

    iput-object p2, p0, LIa/b$a;->b:Lspeedtest/Duration;

    iput-object p3, p0, LIa/b$a;->c:Lspeedtest/LinkSpeed;

    iput-object p4, p0, LIa/b$a;->d:Lspeedtest/LinkSpeed;

    return-void
.end method


# virtual methods
.method public final a()Lspeedtest/SpeedTestApiTestReportClientInfo;
    .locals 1

    iget-object v0, p0, LIa/b$a;->a:Lspeedtest/SpeedTestApiTestReportClientInfo;

    return-object v0
.end method

.method public final b()Lspeedtest/LinkSpeed;
    .locals 1

    iget-object v0, p0, LIa/b$a;->c:Lspeedtest/LinkSpeed;

    return-object v0
.end method

.method public final c()Lspeedtest/Duration;
    .locals 1

    iget-object v0, p0, LIa/b$a;->b:Lspeedtest/Duration;

    return-object v0
.end method

.method public final d()Lspeedtest/LinkSpeed;
    .locals 1

    iget-object v0, p0, LIa/b$a;->d:Lspeedtest/LinkSpeed;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LIa/b$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LIa/b$a;

    iget-object v1, p0, LIa/b$a;->a:Lspeedtest/SpeedTestApiTestReportClientInfo;

    iget-object v3, p1, LIa/b$a;->a:Lspeedtest/SpeedTestApiTestReportClientInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LIa/b$a;->b:Lspeedtest/Duration;

    iget-object v3, p1, LIa/b$a;->b:Lspeedtest/Duration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LIa/b$a;->c:Lspeedtest/LinkSpeed;

    iget-object v3, p1, LIa/b$a;->c:Lspeedtest/LinkSpeed;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LIa/b$a;->d:Lspeedtest/LinkSpeed;

    iget-object p1, p1, LIa/b$a;->d:Lspeedtest/LinkSpeed;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LIa/b$a;->a:Lspeedtest/SpeedTestApiTestReportClientInfo;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LIa/b$a;->b:Lspeedtest/Duration;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lspeedtest/Duration;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LIa/b$a;->c:Lspeedtest/LinkSpeed;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lspeedtest/LinkSpeed;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LIa/b$a;->d:Lspeedtest/LinkSpeed;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lspeedtest/LinkSpeed;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, LIa/b$a;->a:Lspeedtest/SpeedTestApiTestReportClientInfo;

    iget-object v1, p0, LIa/b$a;->b:Lspeedtest/Duration;

    iget-object v2, p0, LIa/b$a;->c:Lspeedtest/LinkSpeed;

    iget-object v3, p0, LIa/b$a;->d:Lspeedtest/LinkSpeed;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ApiReportParams(clientInfo="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", latency="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", download="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", upload="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
