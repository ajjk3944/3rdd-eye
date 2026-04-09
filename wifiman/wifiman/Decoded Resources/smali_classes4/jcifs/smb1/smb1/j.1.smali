.class public Ljcifs/smb1/smb1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljcifs/smb1/smb1/k;

.field b:I

.field c:Ljava/lang/String;

.field d:Z

.field e:[B

.field f:[B

.field g:Ljava/lang/String;

.field h:I

.field i:LUg/e;


# direct methods
.method public constructor <init>(Ljcifs/smb1/smb1/k;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ljcifs/smb1/smb1/j;->d:Z

    const/4 v0, 0x0

    iput-object v0, p0, Ljcifs/smb1/smb1/j;->e:[B

    iput-object v0, p0, Ljcifs/smb1/smb1/j;->f:[B

    iput-object v0, p0, Ljcifs/smb1/smb1/j;->g:Ljava/lang/String;

    const/4 v0, 0x1

    iput v0, p0, Ljcifs/smb1/smb1/j;->h:I

    iput-object p1, p0, Ljcifs/smb1/smb1/j;->a:Ljcifs/smb1/smb1/k;

    iget p1, p0, Ljcifs/smb1/smb1/j;->b:I

    const v0, 0x20080004

    or-int/2addr v0, p1

    iput v0, p0, Ljcifs/smb1/smb1/j;->b:I

    if-eqz p2, :cond_0

    const p2, 0x60088014

    or-int/2addr p1, p2

    iput p1, p0, Ljcifs/smb1/smb1/j;->b:I

    :cond_0
    invoke-static {}, LTg/b;->k()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ljcifs/smb1/smb1/j;->c:Ljava/lang/String;

    invoke-static {}, LUg/e;->a()LUg/e;

    move-result-object p1

    iput-object p1, p0, Ljcifs/smb1/smb1/j;->i:LUg/e;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljcifs/smb1/smb1/j;->g:Ljava/lang/String;

    return-object v0
.end method

.method public b()[B
    .locals 1

    iget-object v0, p0, Ljcifs/smb1/smb1/j;->f:[B

    return-object v0
.end method

.method public c([BII)[B
    .locals 11

    iget p2, p0, Ljcifs/smb1/smb1/j;->h:I

    const/4 p3, 0x0

    const/4 v0, 0x6

    const/4 v1, 0x4

    const/4 v2, 0x1

    if-eq p2, v2, :cond_4

    const/4 v3, 0x2

    if-ne p2, v3, :cond_3

    :try_start_0
    new-instance v5, LTg/c;

    invoke-direct {v5, p1}, LTg/c;-><init>([B)V

    iget-object p2, p0, Ljcifs/smb1/smb1/j;->i:LUg/e;

    sget v3, LUg/e;->b:I

    if-lt v3, v1, :cond_0

    invoke-virtual {p2, v5}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    iget-object p2, p0, Ljcifs/smb1/smb1/j;->i:LUg/e;

    sget v3, LUg/e;->b:I

    if-lt v3, v0, :cond_0

    array-length v3, p1

    invoke-static {p2, p1, p3, v3}, LUg/d;->a(Ljava/io/PrintStream;[BII)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v5}, LTg/c;->j()[B

    move-result-object p1

    iput-object p1, p0, Ljcifs/smb1/smb1/j;->e:[B

    iget p1, p0, Ljcifs/smb1/smb1/j;->b:I

    invoke-virtual {v5}, LTg/a;->a()I

    move-result p2

    and-int/2addr p1, p2

    iput p1, p0, Ljcifs/smb1/smb1/j;->b:I

    new-instance p1, LTg/d;

    iget-object p2, p0, Ljcifs/smb1/smb1/j;->a:Ljcifs/smb1/smb1/k;

    invoke-virtual {p2}, Ljcifs/smb1/smb1/k;->n()Ljava/lang/String;

    move-result-object v6

    iget-object p2, p0, Ljcifs/smb1/smb1/j;->a:Ljcifs/smb1/smb1/k;

    invoke-virtual {p2}, Ljcifs/smb1/smb1/k;->g()Ljava/lang/String;

    move-result-object v7

    iget-object p2, p0, Ljcifs/smb1/smb1/j;->a:Ljcifs/smb1/smb1/k;

    invoke-virtual {p2}, Ljcifs/smb1/smb1/k;->t()Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Ljcifs/smb1/smb1/j;->c:Ljava/lang/String;

    iget v10, p0, Ljcifs/smb1/smb1/j;->b:I

    move-object v4, p1

    invoke-direct/range {v4 .. v10}, LTg/d;-><init>(LTg/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {p1}, LTg/d;->C()[B

    move-result-object p2

    iget-object v3, p0, Ljcifs/smb1/smb1/j;->i:LUg/e;

    sget v4, LUg/e;->b:I

    if-lt v4, v1, :cond_1

    invoke-virtual {v3, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    iget-object v1, p0, Ljcifs/smb1/smb1/j;->i:LUg/e;

    sget v3, LUg/e;->b:I

    if-lt v3, v0, :cond_1

    array-length v0, p2

    invoke-static {v1, p2, p3, v0}, LUg/d;->a(Ljava/io/PrintStream;[BII)V

    :cond_1
    iget p3, p0, Ljcifs/smb1/smb1/j;->b:I

    and-int/lit8 p3, p3, 0x10

    if-eqz p3, :cond_2

    invoke-virtual {p1}, LTg/d;->p()[B

    move-result-object p1

    iput-object p1, p0, Ljcifs/smb1/smb1/j;->f:[B

    :cond_2
    iput-boolean v2, p0, Ljcifs/smb1/smb1/j;->d:Z

    iget p1, p0, Ljcifs/smb1/smb1/j;->h:I

    add-int/2addr p1, v2

    iput p1, p0, Ljcifs/smb1/smb1/j;->h:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    new-instance p2, Ljcifs/smb1/smb1/SmbException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljcifs/smb1/smb1/SmbException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_3
    new-instance p1, Ljcifs/smb1/smb1/SmbException;

    const-string p2, "Invalid state"

    invoke-direct {p1, p2}, Ljcifs/smb1/smb1/SmbException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, LTg/b;

    iget p2, p0, Ljcifs/smb1/smb1/j;->b:I

    iget-object v3, p0, Ljcifs/smb1/smb1/j;->a:Ljcifs/smb1/smb1/k;

    invoke-virtual {v3}, Ljcifs/smb1/smb1/k;->g()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Ljcifs/smb1/smb1/j;->c:Ljava/lang/String;

    invoke-direct {p1, p2, v3, v4}, LTg/b;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, LTg/b;->p()[B

    move-result-object p2

    iget-object v3, p0, Ljcifs/smb1/smb1/j;->i:LUg/e;

    sget v4, LUg/e;->b:I

    if-lt v4, v1, :cond_5

    invoke-virtual {v3, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    iget-object p1, p0, Ljcifs/smb1/smb1/j;->i:LUg/e;

    sget v1, LUg/e;->b:I

    if-lt v1, v0, :cond_5

    array-length v0, p2

    invoke-static {p1, p2, p3, v0}, LUg/d;->a(Ljava/io/PrintStream;[BII)V

    :cond_5
    iget p1, p0, Ljcifs/smb1/smb1/j;->h:I

    add-int/2addr p1, v2

    iput p1, p0, Ljcifs/smb1/smb1/j;->h:I

    :goto_2
    return-object p2
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Ljcifs/smb1/smb1/j;->d:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NtlmContext[auth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ljcifs/smb1/smb1/j;->a:Ljcifs/smb1/smb1/k;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",ntlmsspFlags=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ljcifs/smb1/smb1/j;->b:I

    const/16 v2, 0x8

    invoke-static {v1, v2}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",workstation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ljcifs/smb1/smb1/j;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",isEstablished="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ljcifs/smb1/smb1/j;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ljcifs/smb1/smb1/j;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",serverChallenge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ljcifs/smb1/smb1/j;->e:[B

    const/4 v2, 0x0

    const-string v3, "null"

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ljcifs/smb1/smb1/j;->e:[B

    array-length v4, v0

    mul-int/lit8 v4, v4, 0x2

    invoke-static {v0, v2, v4}, LUg/d;->d([BII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",signingKey="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ljcifs/smb1/smb1/j;->f:[B

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ljcifs/smb1/smb1/j;->f:[B

    array-length v3, v0

    mul-int/lit8 v3, v3, 0x2

    invoke-static {v0, v2, v3}, LUg/d;->d([BII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
