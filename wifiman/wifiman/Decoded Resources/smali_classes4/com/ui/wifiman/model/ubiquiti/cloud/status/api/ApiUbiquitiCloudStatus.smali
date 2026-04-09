.class public final Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u0001\u001eB\u0019\u0012\u0010\u0008\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\"\u0010\u0007\u001a\u00020\u00002\u0010\u0008\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\'\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u00178FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;",
        "",
        "",
        "Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;",
        "_components",
        "<init>",
        "(Ljava/util/List;)V",
        "copy",
        "(Ljava/util/List;)Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;",
        "",
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
        "Ljava/util/List;",
        "f",
        "()Ljava/util/List;",
        "",
        "Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;",
        "b",
        "LYg/m;",
        "e",
        "()Ljava/util/Map;",
        "components",
        "Component",
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
.field private final a:Ljava/util/List;

.field private final b:LYg/m;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "components"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;->a:Ljava/util/List;

    new-instance p1, LPd/a;

    invoke-direct {p1, p0}, LPd/a;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;->b:LYg/m;

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;)Z
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;->d(Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;->c(Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;)Ljava/util/Map;
    .locals 3

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;->a:Ljava/util/List;

    if-eqz p0, :cond_0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, LPd/b;

    invoke-direct {v0}, LPd/b;-><init>()V

    invoke-static {p0, v0}, Lzi/m;->C(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p0}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->c()Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method private static final d(Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->c()Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final copy(Ljava/util/List;)Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "components"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;",
            ">;)",
            "Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;"
        }
    .end annotation

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public final e()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;->a:Ljava/util/List;

    iget-object p1, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;->a:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final f()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;->a:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;->a:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;->a:Ljava/util/List;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ApiUbiquitiCloudStatus(_components="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
