.class public final Lcom/ui/wifiman/model/ubiquiti/cloud/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/cloud/a$a;
    }
.end annotation


# instance fields
.field private final a:Lcb/c;

.field private final b:Lxa/o;

.field private final c:Lcom/ui/common/semver/SemVer;


# direct methods
.method public constructor <init>(Lcb/c;Lxa/o;)V
    .locals 1

    const-string v0, "uniFiCore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productCatalog"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/a;->a:Lcb/c;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/a;->b:Lxa/o;

    sget-object p1, Lcom/ui/common/semver/SemVer;->i:Lcom/ui/common/semver/SemVer$a;

    const-string p2, "7.1.55"

    invoke-virtual {p1, p2}, Lcom/ui/common/semver/SemVer$a;->a(Ljava/lang/String;)Lcom/ui/common/semver/SemVer;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/a;->c:Lcom/ui/common/semver/SemVer;

    return-void
.end method

.method public static final synthetic b(Lcom/ui/wifiman/model/ubiquiti/cloud/a;Lmb/l;)Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/a;->d(Lmb/l;)Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lcom/ui/wifiman/model/ubiquiti/cloud/a;)Lcb/c;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/a;->a:Lcb/c;

    return-object p0
.end method

.method private final d(Lmb/l;)Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;
    .locals 6

    invoke-virtual {p1}, Lmb/l;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lmb/x;

    instance-of v3, v3, Lmb/r;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Lmb/x;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lmb/x;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    :try_start_0
    sget-object v1, Lcom/ui/common/semver/SemVer;->i:Lcom/ui/common/semver/SemVer$a;

    invoke-virtual {v1, v0}, Lcom/ui/common/semver/SemVer$a;->a(Ljava/lang/String;)Lcom/ui/common/semver/SemVer;

    move-result-object v0
    :try_end_0
    .catch Lcom/ui/common/semver/SemVer$FormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid FW version obtained for network controller- "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v2, v2, v1, v2}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_2
    move-object v0, v2

    :goto_1
    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    invoke-virtual {p1}, Lmb/l;->d()Lmb/f;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lmb/f;->b()Lmb/v;

    move-result-object v3

    goto :goto_2

    :cond_3
    move-object v3, v2

    :goto_2
    const/4 v4, -0x1

    if-nez v3, :cond_4

    move v3, v4

    goto :goto_3

    :cond_4
    sget-object v5, Lcom/ui/wifiman/model/ubiquiti/cloud/a$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v5, v3

    :goto_3
    if-eq v3, v4, :cond_a

    const/4 v4, 0x1

    if-eq v3, v4, :cond_8

    const/4 v4, 0x2

    if-eq v3, v4, :cond_7

    const/4 v4, 0x3

    if-eq v3, v4, :cond_6

    const/4 v4, 0x4

    if-ne v3, v4, :cond_5

    goto :goto_4

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    sget-object p1, LRd/a$c;->a:LRd/a$c;

    goto :goto_6

    :cond_7
    sget-object p1, LRd/a$a;->a:LRd/a$a;

    goto :goto_6

    :cond_8
    invoke-virtual {p1}, Lmb/l;->k()Z

    move-result p1

    if-eqz p1, :cond_9

    sget-object p1, LRd/a$b$a;->a:LRd/a$b$a;

    goto :goto_6

    :cond_9
    sget-object p1, LRd/a$b$b$a;->a:LRd/a$b$b$a;

    goto :goto_6

    :cond_a
    :goto_4
    invoke-virtual {p1}, Lmb/l;->d()Lmb/f;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Lmb/f;->a()Ljava/lang/Boolean;

    move-result-object v2

    :cond_b
    if-nez v2, :cond_c

    sget-object p1, LRd/a$c;->a:LRd/a$c;

    goto :goto_6

    :cond_c
    invoke-virtual {p1}, Lmb/l;->d()Lmb/f;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Lmb/f;->a()Ljava/lang/Boolean;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    goto :goto_5

    :cond_d
    const/4 v2, 0x0

    :goto_5
    if-nez v2, :cond_e

    sget-object p1, LRd/a$a;->a:LRd/a$a;

    goto :goto_6

    :cond_e
    if-eqz v0, :cond_f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/a;->c:Lcom/ui/common/semver/SemVer;

    invoke-virtual {v0, v2}, Lcom/ui/common/semver/SemVer;->a(Lcom/ui/common/semver/SemVer;)I

    move-result v2

    if-gez v2, :cond_f

    new-instance p1, LRd/a$b$b$b;

    invoke-direct {p1, v0}, LRd/a$b$b$b;-><init>(Lcom/ui/common/semver/SemVer;)V

    goto :goto_6

    :cond_f
    invoke-virtual {p1}, Lmb/l;->k()Z

    move-result p1

    if-nez p1, :cond_10

    sget-object p1, LRd/a$b$b$a;->a:LRd/a$b$b$a;

    goto :goto_6

    :cond_10
    sget-object p1, LRd/a$b$a;->a:LRd/a$b$a;

    :goto_6
    invoke-direct {v1, v0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;-><init>(Lcom/ui/common/semver/SemVer;LRd/a;)V

    return-object v1
.end method


# virtual methods
.method public a()Lgg/z;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/a;->b:Lxa/o;

    invoke-interface {v0}, Lxa/o;->b()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/cloud/a$b;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/a$b;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/a;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/cloud/a$c;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/a$c;

    invoke-virtual {v0, v1}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object v0

    const-string v1, "onErrorResumeNext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
