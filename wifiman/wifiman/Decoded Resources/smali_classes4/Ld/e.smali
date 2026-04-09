.class public final LLd/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/UUID;

.field private final b:Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;

.field private final c:Lcom/ui/wifiman/model/ubiquiti/console/b;

.field private final d:Lcom/ui/wifiman/model/ubiquiti/console/f;

.field private final e:Lcb/c;


# direct methods
.method private constructor <init>(Ljava/util/UUID;Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;Lcom/ui/wifiman/model/ubiquiti/console/b;Lcom/ui/wifiman/model/ubiquiti/console/f;Lcb/c;)V
    .locals 1

    const-string v0, "accountId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "client"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoles"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoleConnectionService"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unifiCore"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LLd/e;->a:Ljava/util/UUID;

    .line 4
    iput-object p2, p0, LLd/e;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;

    .line 5
    iput-object p3, p0, LLd/e;->c:Lcom/ui/wifiman/model/ubiquiti/console/b;

    .line 6
    iput-object p4, p0, LLd/e;->d:Lcom/ui/wifiman/model/ubiquiti/console/f;

    .line 7
    iput-object p5, p0, LLd/e;->e:Lcb/c;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/UUID;Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;Lcom/ui/wifiman/model/ubiquiti/console/b;Lcom/ui/wifiman/model/ubiquiti/console/f;Lcb/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LLd/e;-><init>(Ljava/util/UUID;Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;Lcom/ui/wifiman/model/ubiquiti/console/b;Lcom/ui/wifiman/model/ubiquiti/console/f;Lcb/c;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, LLd/e;->a:Ljava/util/UUID;

    return-object v0
.end method

.method public final b()Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;
    .locals 1

    iget-object v0, p0, LLd/e;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;

    return-object v0
.end method

.method public final c()Lcom/ui/wifiman/model/ubiquiti/console/f;
    .locals 1

    iget-object v0, p0, LLd/e;->d:Lcom/ui/wifiman/model/ubiquiti/console/f;

    return-object v0
.end method

.method public final d()Lcom/ui/wifiman/model/ubiquiti/console/b;
    .locals 1

    iget-object v0, p0, LLd/e;->c:Lcom/ui/wifiman/model/ubiquiti/console/b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LLd/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LLd/e;

    iget-object v1, p0, LLd/e;->a:Ljava/util/UUID;

    iget-object v3, p1, LLd/e;->a:Ljava/util/UUID;

    invoke-static {v1, v3}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->d(Ljava/util/UUID;Ljava/util/UUID;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LLd/e;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;

    iget-object v3, p1, LLd/e;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LLd/e;->c:Lcom/ui/wifiman/model/ubiquiti/console/b;

    iget-object v3, p1, LLd/e;->c:Lcom/ui/wifiman/model/ubiquiti/console/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LLd/e;->d:Lcom/ui/wifiman/model/ubiquiti/console/f;

    iget-object v3, p1, LLd/e;->d:Lcom/ui/wifiman/model/ubiquiti/console/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LLd/e;->e:Lcb/c;

    iget-object p1, p1, LLd/e;->e:Lcb/c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LLd/e;->a:Ljava/util/UUID;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->e(Ljava/util/UUID;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LLd/e;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LLd/e;->c:Lcom/ui/wifiman/model/ubiquiti/console/b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LLd/e;->d:Lcom/ui/wifiman/model/ubiquiti/console/f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LLd/e;->e:Lcb/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, LLd/e;->a:Ljava/util/UUID;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->f(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LLd/e;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;

    iget-object v2, p0, LLd/e;->c:Lcom/ui/wifiman/model/ubiquiti/console/b;

    iget-object v3, p0, LLd/e;->d:Lcom/ui/wifiman/model/ubiquiti/console/f;

    iget-object v4, p0, LLd/e;->e:Lcb/c;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "UbiquitiSsoAccountSession(accountId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", client="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", consoles="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", consoleConnectionService="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", unifiCore="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
