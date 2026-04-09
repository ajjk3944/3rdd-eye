.class final LN4/b$b;
.super LN4/F$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:LN4/F$e;

.field private k:LN4/F$d;

.field private l:LN4/F$a;

.field private m:B


# direct methods
.method constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, LN4/F$b;-><init>()V

    return-void
.end method

.method private constructor <init>(LN4/F;)V
    .locals 1

    .line 3
    invoke-direct {p0}, LN4/F$b;-><init>()V

    .line 4
    invoke-virtual {p1}, LN4/F;->m()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LN4/b$b;->a:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, LN4/F;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LN4/b$b;->b:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, LN4/F;->l()I

    move-result v0

    iput v0, p0, LN4/b$b;->c:I

    .line 7
    invoke-virtual {p1}, LN4/F;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LN4/b$b;->d:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, LN4/F;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LN4/b$b;->e:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, LN4/F;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LN4/b$b;->f:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, LN4/F;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LN4/b$b;->g:Ljava/lang/String;

    .line 11
    invoke-virtual {p1}, LN4/F;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LN4/b$b;->h:Ljava/lang/String;

    .line 12
    invoke-virtual {p1}, LN4/F;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LN4/b$b;->i:Ljava/lang/String;

    .line 13
    invoke-virtual {p1}, LN4/F;->n()LN4/F$e;

    move-result-object v0

    iput-object v0, p0, LN4/b$b;->j:LN4/F$e;

    .line 14
    invoke-virtual {p1}, LN4/F;->k()LN4/F$d;

    move-result-object v0

    iput-object v0, p0, LN4/b$b;->k:LN4/F$d;

    .line 15
    invoke-virtual {p1}, LN4/F;->c()LN4/F$a;

    move-result-object p1

    iput-object p1, p0, LN4/b$b;->l:LN4/F$a;

    const/4 p1, 0x1

    .line 16
    iput-byte p1, p0, LN4/b$b;->m:B

    return-void
.end method

.method synthetic constructor <init>(LN4/F;LN4/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LN4/b$b;-><init>(LN4/F;)V

    return-void
.end method


# virtual methods
.method public a()LN4/F;
    .locals 17

    move-object/from16 v0, p0

    iget-byte v1, v0, LN4/b$b;->m:B

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget-object v1, v0, LN4/b$b;->a:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, v0, LN4/b$b;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, v0, LN4/b$b;->d:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, v0, LN4/b$b;->h:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, v0, LN4/b$b;->i:Ljava/lang/String;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, LN4/b;

    iget-object v4, v0, LN4/b$b;->a:Ljava/lang/String;

    iget-object v5, v0, LN4/b$b;->b:Ljava/lang/String;

    iget v6, v0, LN4/b$b;->c:I

    iget-object v7, v0, LN4/b$b;->d:Ljava/lang/String;

    iget-object v8, v0, LN4/b$b;->e:Ljava/lang/String;

    iget-object v9, v0, LN4/b$b;->f:Ljava/lang/String;

    iget-object v10, v0, LN4/b$b;->g:Ljava/lang/String;

    iget-object v11, v0, LN4/b$b;->h:Ljava/lang/String;

    iget-object v12, v0, LN4/b$b;->i:Ljava/lang/String;

    iget-object v13, v0, LN4/b$b;->j:LN4/F$e;

    iget-object v14, v0, LN4/b$b;->k:LN4/F$d;

    iget-object v15, v0, LN4/b$b;->l:LN4/F$a;

    const/16 v16, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v16}, LN4/b;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LN4/F$e;LN4/F$d;LN4/F$a;LN4/b$a;)V

    return-object v1

    :cond_1
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, LN4/b$b;->a:Ljava/lang/String;

    if-nez v3, :cond_2

    const-string v3, " sdkVersion"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v3, v0, LN4/b$b;->b:Ljava/lang/String;

    if-nez v3, :cond_3

    const-string v3, " gmpAppId"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-byte v3, v0, LN4/b$b;->m:B

    and-int/2addr v2, v3

    if-nez v2, :cond_4

    const-string v2, " platform"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-object v2, v0, LN4/b$b;->d:Ljava/lang/String;

    if-nez v2, :cond_5

    const-string v2, " installationUuid"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget-object v2, v0, LN4/b$b;->h:Ljava/lang/String;

    if-nez v2, :cond_6

    const-string v2, " buildVersion"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-object v2, v0, LN4/b$b;->i:Ljava/lang/String;

    if-nez v2, :cond_7

    const-string v2, " displayVersion"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "Missing required properties:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public b(LN4/F$a;)LN4/F$b;
    .locals 0

    iput-object p1, p0, LN4/b$b;->l:LN4/F$a;

    return-object p0
.end method

.method public c(Ljava/lang/String;)LN4/F$b;
    .locals 0

    iput-object p1, p0, LN4/b$b;->g:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)LN4/F$b;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, LN4/b$b;->h:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "Null buildVersion"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Ljava/lang/String;)LN4/F$b;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, LN4/b$b;->i:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "Null displayVersion"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Ljava/lang/String;)LN4/F$b;
    .locals 0

    iput-object p1, p0, LN4/b$b;->f:Ljava/lang/String;

    return-object p0
.end method

.method public g(Ljava/lang/String;)LN4/F$b;
    .locals 0

    iput-object p1, p0, LN4/b$b;->e:Ljava/lang/String;

    return-object p0
.end method

.method public h(Ljava/lang/String;)LN4/F$b;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, LN4/b$b;->b:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "Null gmpAppId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public i(Ljava/lang/String;)LN4/F$b;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, LN4/b$b;->d:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "Null installationUuid"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j(LN4/F$d;)LN4/F$b;
    .locals 0

    iput-object p1, p0, LN4/b$b;->k:LN4/F$d;

    return-object p0
.end method

.method public k(I)LN4/F$b;
    .locals 0

    iput p1, p0, LN4/b$b;->c:I

    iget-byte p1, p0, LN4/b$b;->m:B

    or-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-byte p1, p0, LN4/b$b;->m:B

    return-object p0
.end method

.method public l(Ljava/lang/String;)LN4/F$b;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, LN4/b$b;->a:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "Null sdkVersion"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m(LN4/F$e;)LN4/F$b;
    .locals 0

    iput-object p1, p0, LN4/b$b;->j:LN4/F$e;

    return-object p0
.end method
