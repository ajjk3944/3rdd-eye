.class final LN4/i$b;
.super LN4/F$e$a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LN4/F$e$a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LN4/F$e$a;
    .locals 10

    iget-object v1, p0, LN4/i$b;->a:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v2, p0, LN4/i$b;->b:Ljava/lang/String;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v9, LN4/i;

    iget-object v3, p0, LN4/i$b;->c:Ljava/lang/String;

    iget-object v5, p0, LN4/i$b;->d:Ljava/lang/String;

    iget-object v6, p0, LN4/i$b;->e:Ljava/lang/String;

    iget-object v7, p0, LN4/i$b;->f:Ljava/lang/String;

    const/4 v8, 0x0

    const/4 v4, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, LN4/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LN4/F$e$a$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LN4/i$a;)V

    return-object v9

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LN4/i$b;->a:Ljava/lang/String;

    if-nez v1, :cond_2

    const-string v1, " identifier"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, LN4/i$b;->b:Ljava/lang/String;

    if-nez v1, :cond_3

    const-string v1, " version"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b(Ljava/lang/String;)LN4/F$e$a$a;
    .locals 0

    iput-object p1, p0, LN4/i$b;->e:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)LN4/F$e$a$a;
    .locals 0

    iput-object p1, p0, LN4/i$b;->f:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)LN4/F$e$a$a;
    .locals 0

    iput-object p1, p0, LN4/i$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/String;)LN4/F$e$a$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, LN4/i$b;->a:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "Null identifier"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Ljava/lang/String;)LN4/F$e$a$a;
    .locals 0

    iput-object p1, p0, LN4/i$b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public g(Ljava/lang/String;)LN4/F$e$a$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, LN4/i$b;->b:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "Null version"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
