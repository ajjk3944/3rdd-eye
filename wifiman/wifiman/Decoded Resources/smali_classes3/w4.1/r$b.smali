.class Lw4/r$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo4/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw4/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Lo4/v;

.field private final b:Ly4/b$a;

.field private final c:Ly4/b$a;


# direct methods
.method private constructor <init>(Lo4/v;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lw4/r$b;->a:Lo4/v;

    .line 4
    invoke-virtual {p1}, Lo4/v;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lv4/g;->b()Lv4/g;

    move-result-object v0

    invoke-virtual {v0}, Lv4/g;->a()Ly4/b;

    move-result-object v0

    .line 6
    invoke-static {p1}, Lv4/f;->a(Lo4/v;)Ly4/c;

    move-result-object p1

    .line 7
    const-string/jumbo v1, "compute"

    const-string/jumbo v2, "mac"

    invoke-interface {v0, p1, v2, v1}, Ly4/b;->a(Ly4/c;Ljava/lang/String;Ljava/lang/String;)Ly4/b$a;

    move-result-object v1

    iput-object v1, p0, Lw4/r$b;->b:Ly4/b$a;

    .line 8
    const-string/jumbo v1, "verify"

    invoke-interface {v0, p1, v2, v1}, Ly4/b;->a(Ly4/c;Ljava/lang/String;Ljava/lang/String;)Ly4/b$a;

    move-result-object p1

    iput-object p1, p0, Lw4/r$b;->c:Ly4/b$a;

    goto :goto_0

    .line 9
    :cond_0
    sget-object p1, Lv4/f;->a:Ly4/b$a;

    iput-object p1, p0, Lw4/r$b;->b:Ly4/b$a;

    .line 10
    iput-object p1, p0, Lw4/r$b;->c:Ly4/b$a;

    :goto_0
    return-void
.end method

.method synthetic constructor <init>(Lo4/v;Lw4/r$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lw4/r$b;-><init>(Lo4/v;)V

    return-void
.end method


# virtual methods
.method public a([B[B)V
    .locals 7

    array-length v0, p1

    const/4 v1, 0x5

    if-le v0, v1, :cond_3

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    array-length v2, p1

    invoke-static {p1, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    iget-object v2, p0, Lw4/r$b;->a:Lo4/v;

    invoke-virtual {v2, v0}, Lo4/v;->f([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo4/v$c;

    invoke-virtual {v2}, Lo4/v$c;->f()LA4/I;

    move-result-object v3

    sget-object v4, LA4/I;->LEGACY:LA4/I;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, Lw4/r;->d()[B

    move-result-object v3

    filled-new-array {p2, v3}, [[B

    move-result-object v3

    invoke-static {v3}, LB4/f;->a([[B)[B

    move-result-object v3

    goto :goto_1

    :cond_0
    move-object v3, p2

    :goto_1
    :try_start_0
    invoke-virtual {v2}, Lo4/v$c;->g()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo4/t;

    invoke-interface {v4, v1, v3}, Lo4/t;->a([B[B)V

    iget-object v4, p0, Lw4/r$b;->c:Ly4/b$a;

    invoke-virtual {v2}, Lo4/v$c;->d()I

    move-result v2

    array-length v3, v3

    int-to-long v5, v3

    invoke-interface {v4, v2, v5, v6}, Ly4/b$a;->b(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v2

    invoke-static {}, Lw4/r;->e()Ljava/util/logging/Logger;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "tag prefix matches a key, but cannot verify: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/logging/Logger;->info(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lw4/r$b;->a:Lo4/v;

    invoke-virtual {v0}, Lo4/v;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo4/v$c;

    :try_start_1
    invoke-virtual {v1}, Lo4/v$c;->g()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo4/t;

    invoke-interface {v2, p1, p2}, Lo4/t;->a([B[B)V

    iget-object v2, p0, Lw4/r$b;->c:Ly4/b$a;

    invoke-virtual {v1}, Lo4/v$c;->d()I

    move-result v1

    array-length v3, p2

    int-to-long v3, v3

    invoke-interface {v2, v1, v3, v4}, Ly4/b$a;->b(IJ)V
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :cond_2
    iget-object p1, p0, Lw4/r$b;->c:Ly4/b$a;

    invoke-interface {p1}, Ly4/b$a;->a()V

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string/jumbo p2, "invalid MAC"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-object p1, p0, Lw4/r$b;->c:Ly4/b$a;

    invoke-interface {p1}, Ly4/b$a;->a()V

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string/jumbo p2, "tag too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b([B)[B
    .locals 5

    iget-object v0, p0, Lw4/r$b;->a:Lo4/v;

    invoke-virtual {v0}, Lo4/v;->e()Lo4/v$c;

    move-result-object v0

    invoke-virtual {v0}, Lo4/v$c;->f()LA4/I;

    move-result-object v0

    sget-object v1, LA4/I;->LEGACY:LA4/I;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lw4/r;->d()[B

    move-result-object v0

    filled-new-array {p1, v0}, [[B

    move-result-object p1

    invoke-static {p1}, LB4/f;->a([[B)[B

    move-result-object p1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lw4/r$b;->a:Lo4/v;

    invoke-virtual {v0}, Lo4/v;->e()Lo4/v$c;

    move-result-object v0

    invoke-virtual {v0}, Lo4/v$c;->b()[B

    move-result-object v0

    iget-object v1, p0, Lw4/r$b;->a:Lo4/v;

    invoke-virtual {v1}, Lo4/v;->e()Lo4/v$c;

    move-result-object v1

    invoke-virtual {v1}, Lo4/v$c;->g()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo4/t;

    invoke-interface {v1, p1}, Lo4/t;->b([B)[B

    move-result-object v1

    filled-new-array {v0, v1}, [[B

    move-result-object v0

    invoke-static {v0}, LB4/f;->a([[B)[B

    move-result-object v0

    iget-object v1, p0, Lw4/r$b;->b:Ly4/b$a;

    iget-object v2, p0, Lw4/r$b;->a:Lo4/v;

    invoke-virtual {v2}, Lo4/v;->e()Lo4/v$c;

    move-result-object v2

    invoke-virtual {v2}, Lo4/v$c;->d()I

    move-result v2

    array-length p1, p1

    int-to-long v3, p1

    invoke-interface {v1, v2, v3, v4}, Ly4/b$a;->b(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lw4/r$b;->b:Ly4/b$a;

    invoke-interface {v0}, Ly4/b$a;->a()V

    throw p1
.end method
