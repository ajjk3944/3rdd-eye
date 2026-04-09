.class Lt4/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo4/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Lo4/v;

.field private final b:Ly4/b$a;

.field private final c:Ly4/b$a;


# direct methods
.method public constructor <init>(Lo4/v;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt4/c$a;->a:Lo4/v;

    invoke-virtual {p1}, Lo4/v;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lv4/g;->b()Lv4/g;

    move-result-object v0

    invoke-virtual {v0}, Lv4/g;->a()Ly4/b;

    move-result-object v0

    invoke-static {p1}, Lv4/f;->a(Lo4/v;)Ly4/c;

    move-result-object p1

    const-string/jumbo v1, "encrypt"

    const-string/jumbo v2, "daead"

    invoke-interface {v0, p1, v2, v1}, Ly4/b;->a(Ly4/c;Ljava/lang/String;Ljava/lang/String;)Ly4/b$a;

    move-result-object v1

    iput-object v1, p0, Lt4/c$a;->b:Ly4/b$a;

    const-string/jumbo v1, "decrypt"

    invoke-interface {v0, p1, v2, v1}, Ly4/b;->a(Ly4/c;Ljava/lang/String;Ljava/lang/String;)Ly4/b$a;

    move-result-object p1

    iput-object p1, p0, Lt4/c$a;->c:Ly4/b$a;

    goto :goto_0

    :cond_0
    sget-object p1, Lv4/f;->a:Ly4/b$a;

    iput-object p1, p0, Lt4/c$a;->b:Ly4/b$a;

    iput-object p1, p0, Lt4/c$a;->c:Ly4/b$a;

    :goto_0
    return-void
.end method


# virtual methods
.method public a([B[B)[B
    .locals 4

    :try_start_0
    iget-object v0, p0, Lt4/c$a;->a:Lo4/v;

    invoke-virtual {v0}, Lo4/v;->e()Lo4/v$c;

    move-result-object v0

    invoke-virtual {v0}, Lo4/v$c;->b()[B

    move-result-object v0

    iget-object v1, p0, Lt4/c$a;->a:Lo4/v;

    invoke-virtual {v1}, Lo4/v;->e()Lo4/v$c;

    move-result-object v1

    invoke-virtual {v1}, Lo4/v$c;->g()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo4/e;

    invoke-interface {v1, p1, p2}, Lo4/e;->a([B[B)[B

    move-result-object p2

    filled-new-array {v0, p2}, [[B

    move-result-object p2

    invoke-static {p2}, LB4/f;->a([[B)[B

    move-result-object p2

    iget-object v0, p0, Lt4/c$a;->b:Ly4/b$a;

    iget-object v1, p0, Lt4/c$a;->a:Lo4/v;

    invoke-virtual {v1}, Lo4/v;->e()Lo4/v$c;

    move-result-object v1

    invoke-virtual {v1}, Lo4/v$c;->d()I

    move-result v1

    array-length p1, p1

    int-to-long v2, p1

    invoke-interface {v0, v1, v2, v3}, Ly4/b$a;->b(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    iget-object p2, p0, Lt4/c$a;->b:Ly4/b$a;

    invoke-interface {p2}, Ly4/b$a;->a()V

    throw p1
.end method

.method public b([B[B)[B
    .locals 7

    array-length v0, p1

    const/4 v1, 0x5

    if-le v0, v1, :cond_0

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    array-length v2, p1

    invoke-static {p1, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    iget-object v2, p0, Lt4/c$a;->a:Lo4/v;

    invoke-virtual {v2, v0}, Lo4/v;->f([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo4/v$c;

    :try_start_0
    invoke-virtual {v2}, Lo4/v$c;->g()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo4/e;

    invoke-interface {v3, v1, p2}, Lo4/e;->b([B[B)[B

    move-result-object v3

    iget-object v4, p0, Lt4/c$a;->c:Ly4/b$a;

    invoke-virtual {v2}, Lo4/v$c;->d()I

    move-result v2

    array-length v5, v1

    int-to-long v5, v5

    invoke-interface {v4, v2, v5, v6}, Ly4/b$a;->b(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    :catch_0
    move-exception v2

    invoke-static {}, Lt4/c;->d()Ljava/util/logging/Logger;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "ciphertext prefix matches a key, but cannot decrypt: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/logging/Logger;->info(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt4/c$a;->a:Lo4/v;

    invoke-virtual {v0}, Lo4/v;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo4/v$c;

    :try_start_1
    invoke-virtual {v1}, Lo4/v$c;->g()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo4/e;

    invoke-interface {v2, p1, p2}, Lo4/e;->b([B[B)[B

    move-result-object v2

    iget-object v3, p0, Lt4/c$a;->c:Ly4/b$a;

    invoke-virtual {v1}, Lo4/v$c;->d()I

    move-result v1

    array-length v4, p1

    int-to-long v4, v4

    invoke-interface {v3, v1, v4, v5}, Ly4/b$a;->b(IJ)V
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v2

    :cond_1
    iget-object p1, p0, Lt4/c$a;->c:Ly4/b$a;

    invoke-interface {p1}, Ly4/b$a;->a()V

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string/jumbo p2, "decryption failed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
