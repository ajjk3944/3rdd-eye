.class public Lw4/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Lw4/d;

.field private b:LC4/b;

.field private c:Ljava/lang/Integer;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lw4/a$b;->a:Lw4/d;

    .line 4
    iput-object v0, p0, Lw4/a$b;->b:LC4/b;

    .line 5
    iput-object v0, p0, Lw4/a$b;->c:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Lw4/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lw4/a$b;-><init>()V

    return-void
.end method

.method private b()LC4/a;
    .locals 4

    iget-object v0, p0, Lw4/a$b;->a:Lw4/d;

    invoke-virtual {v0}, Lw4/d;->e()Lw4/d$c;

    move-result-object v0

    sget-object v1, Lw4/d$c;->e:Lw4/d$c;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    new-array v0, v2, [B

    invoke-static {v0}, LC4/a;->a([B)LC4/a;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lw4/a$b;->a:Lw4/d;

    invoke-virtual {v0}, Lw4/d;->e()Lw4/d$c;

    move-result-object v0

    sget-object v1, Lw4/d$c;->d:Lw4/d$c;

    const/4 v3, 0x5

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lw4/a$b;->a:Lw4/d;

    invoke-virtual {v0}, Lw4/d;->e()Lw4/d$c;

    move-result-object v0

    sget-object v1, Lw4/d$c;->c:Lw4/d$c;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lw4/a$b;->a:Lw4/d;

    invoke-virtual {v0}, Lw4/d;->e()Lw4/d$c;

    move-result-object v0

    sget-object v1, Lw4/d$c;->b:Lw4/d$c;

    if-ne v0, v1, :cond_2

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lw4/a$b;->c:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, LC4/a;->a([B)LC4/a;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Unknown AesCmacParametersParameters.Variant: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lw4/a$b;->a:Lw4/d;

    invoke-virtual {v2}, Lw4/d;->e()Lw4/d$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lw4/a$b;->c:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, LC4/a;->a([B)LC4/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lw4/a;
    .locals 8

    iget-object v0, p0, Lw4/a$b;->a:Lw4/d;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lw4/a$b;->b:LC4/b;

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lw4/d;->c()I

    move-result v0

    iget-object v1, p0, Lw4/a$b;->b:LC4/b;

    invoke-virtual {v1}, LC4/b;->b()I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lw4/a$b;->a:Lw4/d;

    invoke-virtual {v0}, Lw4/d;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lw4/a$b;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lw4/a$b;->a:Lw4/d;

    invoke-virtual {v0}, Lw4/d;->f()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lw4/a$b;->c:Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    invoke-direct {p0}, Lw4/a$b;->b()LC4/a;

    move-result-object v5

    new-instance v0, Lw4/a;

    iget-object v3, p0, Lw4/a$b;->a:Lw4/d;

    iget-object v4, p0, Lw4/a$b;->b:LC4/b;

    iget-object v6, p0, Lw4/a$b;->c:Ljava/lang/Integer;

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lw4/a;-><init>(Lw4/d;LC4/b;LC4/a;Ljava/lang/Integer;Lw4/a$a;)V

    return-object v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string/jumbo v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(LC4/b;)Lw4/a$b;
    .locals 0

    iput-object p1, p0, Lw4/a$b;->b:LC4/b;

    return-object p0
.end method

.method public d(Ljava/lang/Integer;)Lw4/a$b;
    .locals 0

    iput-object p1, p0, Lw4/a$b;->c:Ljava/lang/Integer;

    return-object p0
.end method

.method public e(Lw4/d;)Lw4/a$b;
    .locals 0

    iput-object p1, p0, Lw4/a$b;->a:Lw4/d;

    return-object p0
.end method
