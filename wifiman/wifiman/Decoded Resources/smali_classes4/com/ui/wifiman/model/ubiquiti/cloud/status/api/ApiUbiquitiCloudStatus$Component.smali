.class public final Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Component"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;,
        Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0002\u0014\u0012B\u001f\u0012\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\t\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0013\u001a\u0004\u0008\u0015\u0010\nR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00168F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001a8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;",
        "",
        "",
        "id",
        "_status",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "b",
        "d",
        "Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;",
        "c",
        "()Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;",
        "type",
        "Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;",
        "()Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;",
        "status",
        "app-model_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "status"
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 4
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a$a;

    invoke-virtual {v1, v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a$a;->a(Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final c()Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;->Companion:Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b$a;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b$a;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "status"
        .end annotation
    .end param

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;

    invoke-direct {v0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->b:Ljava/lang/String;

    iget-object p1, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->b:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->b:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Component(id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", _status="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
