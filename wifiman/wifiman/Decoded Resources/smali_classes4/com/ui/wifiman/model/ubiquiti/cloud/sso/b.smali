.class public final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/UUID;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/Boolean;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:Z

.field private final k:J

.field private final l:LYg/m;


# direct methods
.method private constructor <init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "username"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "email"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->a:Ljava/util/UUID;

    .line 4
    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->d:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->f:Ljava/lang/Boolean;

    .line 9
    iput-object p7, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->g:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->h:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->i:Ljava/lang/String;

    .line 12
    iput-boolean p10, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->j:Z

    .line 13
    iput-wide p11, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->k:J

    .line 14
    new-instance p1, LNd/g;

    invoke-direct {p1, p0}, LNd/g;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->l:LYg/m;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p12}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->n(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->c:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_4

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->c:Ljava/lang/String;

    const-string v2, ""

    if-nez v1, :cond_2

    move-object v1, v2

    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->c:Ljava/lang/String;

    if-eqz v1, :cond_5

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->d:Ljava/lang/String;

    if-eqz v1, :cond_5

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    const-string v1, " "

    goto :goto_2

    :cond_5
    :goto_1
    move-object v1, v2

    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->d:Ljava/lang/String;

    if-nez p0, :cond_6

    goto :goto_3

    :cond_6
    move-object v2, p0

    :goto_3
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_4
    return-object p0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->a:Ljava/util/UUID;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-class v2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccount"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->a:Ljava/util/UUID;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->a:Ljava/util/UUID;

    invoke-static {v1, v3}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->d(Ljava/util/UUID;Ljava/util/UUID;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->f:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->f:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->g:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->h:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->h:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->i:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->i:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->j:Z

    iget-boolean v3, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->j:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-wide v3, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->k:J

    iget-wide v5, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->k:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->h:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->a:Ljava/util/UUID;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->e(Ljava/util/UUID;)I

    move-result v0

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final j()J
    .locals 2

    iget-wide v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->k:J

    return-wide v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final l()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->f:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->j:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->a:Ljava/util/UUID;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e:Ljava/lang/String;

    iget-wide v3, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->k:J

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "UiAccount["

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "](username: "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", email:"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", updated:"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
