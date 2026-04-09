.class public final Lcom/ui/core/ui/sso/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/core/ui/sso/c$a;
    }
.end annotation


# instance fields
.field private final a:LAb/a;

.field private final b:LGb/f;

.field private final c:Lcom/ui/sso/api/UiAccountApi$b;

.field private final d:Lcom/ui/core/ui/sso/UiSSO$d;

.field private final e:Lcom/ui/core/ui/sso/UiSSO$e;

.field private f:Lcom/ui/core/ui/sso/c$a;

.field private g:Lcom/ui/core/ui/sso/UiSSO$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LAb/a;LGb/f;Lcom/ui/sso/api/UiAccountApi$b;Lcom/ui/core/ui/sso/UiSSO$d;Lcom/ui/core/ui/sso/UiSSO$e;Lcom/ui/core/ui/sso/c$a;Lcom/ui/core/ui/sso/UiSSO$a;)V
    .locals 1

    const-string/jumbo v0, "ssoClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "ssoStorage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "uiAccountApiManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "finishDelegate"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ui/core/ui/sso/c;->a:LAb/a;

    .line 3
    iput-object p2, p0, Lcom/ui/core/ui/sso/c;->b:LGb/f;

    .line 4
    iput-object p3, p0, Lcom/ui/core/ui/sso/c;->c:Lcom/ui/sso/api/UiAccountApi$b;

    .line 5
    iput-object p4, p0, Lcom/ui/core/ui/sso/c;->d:Lcom/ui/core/ui/sso/UiSSO$d;

    .line 6
    iput-object p5, p0, Lcom/ui/core/ui/sso/c;->e:Lcom/ui/core/ui/sso/UiSSO$e;

    .line 7
    iput-object p6, p0, Lcom/ui/core/ui/sso/c;->f:Lcom/ui/core/ui/sso/c$a;

    .line 8
    iput-object p7, p0, Lcom/ui/core/ui/sso/c;->g:Lcom/ui/core/ui/sso/UiSSO$a;

    return-void
.end method

.method public synthetic constructor <init>(LAb/a;LGb/f;Lcom/ui/sso/api/UiAccountApi$b;Lcom/ui/core/ui/sso/UiSSO$d;Lcom/ui/core/ui/sso/UiSSO$e;Lcom/ui/core/ui/sso/c$a;Lcom/ui/core/ui/sso/UiSSO$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object/from16 v8, p7

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    .line 9
    invoke-direct/range {v1 .. v8}, Lcom/ui/core/ui/sso/c;-><init>(LAb/a;LGb/f;Lcom/ui/sso/api/UiAccountApi$b;Lcom/ui/core/ui/sso/UiSSO$d;Lcom/ui/core/ui/sso/UiSSO$e;Lcom/ui/core/ui/sso/c$a;Lcom/ui/core/ui/sso/UiSSO$a;)V

    return-void
.end method

.method public static synthetic b(Lcom/ui/core/ui/sso/c;LAb/a;LGb/f;Lcom/ui/sso/api/UiAccountApi$b;Lcom/ui/core/ui/sso/UiSSO$d;Lcom/ui/core/ui/sso/UiSSO$e;Lcom/ui/core/ui/sso/c$a;Lcom/ui/core/ui/sso/UiSSO$a;ILjava/lang/Object;)Lcom/ui/core/ui/sso/c;
    .locals 5

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/ui/core/ui/sso/c;->a:LAb/a;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/ui/core/ui/sso/c;->b:LGb/f;

    :cond_1
    move-object p9, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/ui/core/ui/sso/c;->c:Lcom/ui/sso/api/UiAccountApi$b;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/ui/core/ui/sso/c;->d:Lcom/ui/core/ui/sso/UiSSO$d;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/ui/core/ui/sso/c;->e:Lcom/ui/core/ui/sso/UiSSO$e;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p8, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lcom/ui/core/ui/sso/c;->f:Lcom/ui/core/ui/sso/c$a;

    :cond_5
    move-object v3, p6

    and-int/lit8 p2, p8, 0x40

    if-eqz p2, :cond_6

    iget-object p7, p0, Lcom/ui/core/ui/sso/c;->g:Lcom/ui/core/ui/sso/UiSSO$a;

    :cond_6
    move-object v4, p7

    move-object p2, p0

    move-object p3, p1

    move-object p4, p9

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move-object p8, v3

    move-object p9, v4

    invoke-virtual/range {p2 .. p9}, Lcom/ui/core/ui/sso/c;->a(LAb/a;LGb/f;Lcom/ui/sso/api/UiAccountApi$b;Lcom/ui/core/ui/sso/UiSSO$d;Lcom/ui/core/ui/sso/UiSSO$e;Lcom/ui/core/ui/sso/c$a;Lcom/ui/core/ui/sso/UiSSO$a;)Lcom/ui/core/ui/sso/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LAb/a;LGb/f;Lcom/ui/sso/api/UiAccountApi$b;Lcom/ui/core/ui/sso/UiSSO$d;Lcom/ui/core/ui/sso/UiSSO$e;Lcom/ui/core/ui/sso/c$a;Lcom/ui/core/ui/sso/UiSSO$a;)Lcom/ui/core/ui/sso/c;
    .locals 9

    const-string/jumbo v0, "ssoClient"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "ssoStorage"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "uiAccountApiManager"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "finishDelegate"

    move-object v7, p6

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/core/ui/sso/c;

    move-object v1, v0

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/ui/core/ui/sso/c;-><init>(LAb/a;LGb/f;Lcom/ui/sso/api/UiAccountApi$b;Lcom/ui/core/ui/sso/UiSSO$d;Lcom/ui/core/ui/sso/UiSSO$e;Lcom/ui/core/ui/sso/c$a;Lcom/ui/core/ui/sso/UiSSO$a;)V

    return-object v0
.end method

.method public final c()Lcom/ui/core/ui/sso/c$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/c;->f:Lcom/ui/core/ui/sso/c$a;

    return-object v0
.end method

.method public final d()Lcom/ui/core/ui/sso/UiSSO$d;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/c;->d:Lcom/ui/core/ui/sso/UiSSO$d;

    return-object v0
.end method

.method public final e()Lcom/ui/core/ui/sso/UiSSO$e;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/c;->e:Lcom/ui/core/ui/sso/UiSSO$e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/core/ui/sso/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/core/ui/sso/c;

    iget-object v1, p0, Lcom/ui/core/ui/sso/c;->a:LAb/a;

    iget-object v3, p1, Lcom/ui/core/ui/sso/c;->a:LAb/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/core/ui/sso/c;->b:LGb/f;

    iget-object v3, p1, Lcom/ui/core/ui/sso/c;->b:LGb/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/core/ui/sso/c;->c:Lcom/ui/sso/api/UiAccountApi$b;

    iget-object v3, p1, Lcom/ui/core/ui/sso/c;->c:Lcom/ui/sso/api/UiAccountApi$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/core/ui/sso/c;->d:Lcom/ui/core/ui/sso/UiSSO$d;

    iget-object v3, p1, Lcom/ui/core/ui/sso/c;->d:Lcom/ui/core/ui/sso/UiSSO$d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/core/ui/sso/c;->e:Lcom/ui/core/ui/sso/UiSSO$e;

    iget-object v3, p1, Lcom/ui/core/ui/sso/c;->e:Lcom/ui/core/ui/sso/UiSSO$e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/core/ui/sso/c;->f:Lcom/ui/core/ui/sso/c$a;

    iget-object v3, p1, Lcom/ui/core/ui/sso/c;->f:Lcom/ui/core/ui/sso/c$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/core/ui/sso/c;->g:Lcom/ui/core/ui/sso/UiSSO$a;

    iget-object p1, p1, Lcom/ui/core/ui/sso/c;->g:Lcom/ui/core/ui/sso/UiSSO$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()Lcom/ui/core/ui/sso/UiSSO$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/c;->g:Lcom/ui/core/ui/sso/UiSSO$a;

    return-object v0
.end method

.method public final g()LAb/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/c;->a:LAb/a;

    return-object v0
.end method

.method public final h()LGb/f;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/c;->b:LGb/f;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/core/ui/sso/c;->a:LAb/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/core/ui/sso/c;->b:LGb/f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/core/ui/sso/c;->c:Lcom/ui/sso/api/UiAccountApi$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/core/ui/sso/c;->d:Lcom/ui/core/ui/sso/UiSSO$d;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/ui/core/ui/sso/UiSSO$d;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/core/ui/sso/c;->e:Lcom/ui/core/ui/sso/UiSSO$e;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/ui/core/ui/sso/UiSSO$e;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/core/ui/sso/c;->f:Lcom/ui/core/ui/sso/c$a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/core/ui/sso/c;->g:Lcom/ui/core/ui/sso/UiSSO$a;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public final i()Lcom/ui/sso/api/UiAccountApi$b;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/c;->c:Lcom/ui/sso/api/UiAccountApi$b;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/ui/core/ui/sso/c;->a:LAb/a;

    iget-object v1, p0, Lcom/ui/core/ui/sso/c;->b:LGb/f;

    iget-object v2, p0, Lcom/ui/core/ui/sso/c;->c:Lcom/ui/sso/api/UiAccountApi$b;

    iget-object v3, p0, Lcom/ui/core/ui/sso/c;->d:Lcom/ui/core/ui/sso/UiSSO$d;

    iget-object v4, p0, Lcom/ui/core/ui/sso/c;->e:Lcom/ui/core/ui/sso/UiSSO$e;

    iget-object v5, p0, Lcom/ui/core/ui/sso/c;->f:Lcom/ui/core/ui/sso/c$a;

    iget-object v6, p0, Lcom/ui/core/ui/sso/c;->g:Lcom/ui/core/ui/sso/UiSSO$a;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v8, "SSOActivitySession(ssoClient="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ssoStorage="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", uiAccountApiManager="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", mfaParams="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pkceParams="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", finishDelegate="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ssoAuthResponse="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
