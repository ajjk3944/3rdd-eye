.class public final Lcom/ui/wifiman/model/speedtest/result/b$b$a;
.super Lcom/ui/wifiman/model/speedtest/result/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/speedtest/result/b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lxa/a$d;

.field private final e:Ljava/lang/String;

.field private final f:LS8/g;

.field private final g:Lrd/b$a$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/String;LS8/g;Lrd/b$a$a;)V
    .locals 1

    const-string v0, "serverAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/speedtest/result/b$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->d:Lxa/a$d;

    iput-object p5, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->f:LS8/g;

    iput-object p7, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->g:Lrd/b$a$a;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Lrd/b$a$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->g:Lrd/b$a$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->d:Lxa/a$d;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->d:Lxa/a$d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->f:LS8/g;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->f:LS8/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->g:Lrd/b$a$a;

    iget-object p1, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->g:Lrd/b$a$a;

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()Lxa/a$d;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->d:Lxa/a$d;

    return-object v0
.end method

.method public final g()LS8/g;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->f:LS8/g;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->c:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->d:Lxa/a$d;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->e:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->f:LS8/g;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, LS8/g;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->g:Lrd/b$a$a;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->d:Lxa/a$d;

    iget-object v4, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->e:Ljava/lang/String;

    iget-object v5, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->f:LS8/g;

    iget-object v6, p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->g:Lrd/b$a$a;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "App2App(serverAddress="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", productImageUrl="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", ubntProduct="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", productModel="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", wifiExperience="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", serverType="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
