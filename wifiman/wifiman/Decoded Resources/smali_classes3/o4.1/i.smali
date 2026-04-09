.class Lo4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo4/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo4/i$a;
    }
.end annotation


# instance fields
.field private final a:Lv4/d;

.field private final b:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Lv4/d;Ljava/lang/Class;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lv4/d;->i()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Ljava/lang/Void;

    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo p2, "Given internalKeyMananger %s does not support primitive class %s"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iput-object p1, p0, Lo4/i;->a:Lv4/d;

    iput-object p2, p0, Lo4/i;->b:Ljava/lang/Class;

    return-void
.end method

.method private e()Lo4/i$a;
    .locals 2

    new-instance v0, Lo4/i$a;

    iget-object v1, p0, Lo4/i;->a:Lv4/d;

    invoke-virtual {v1}, Lv4/d;->f()Lv4/d$a;

    move-result-object v1

    invoke-direct {v0, v1}, Lo4/i$a;-><init>(Lv4/d$a;)V

    return-object v0
.end method

.method private f(Lcom/google/crypto/tink/shaded/protobuf/M;)Ljava/lang/Object;
    .locals 2

    const-class v0, Ljava/lang/Void;

    iget-object v1, p0, Lo4/i;->b:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo4/i;->a:Lv4/d;

    invoke-virtual {v0, p1}, Lv4/d;->j(Lcom/google/crypto/tink/shaded/protobuf/M;)V

    iget-object v0, p0, Lo4/i;->a:Lv4/d;

    iget-object v1, p0, Lo4/i;->b:Ljava/lang/Class;

    invoke-virtual {v0, p1, v1}, Lv4/d;->e(Lcom/google/crypto/tink/shaded/protobuf/M;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Cannot create a primitive for Void"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 3

    :try_start_0
    invoke-direct {p0}, Lo4/i;->e()Lo4/i$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo4/i$a;->a(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Failures parsing proto of type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lo4/i;->a:Lv4/d;

    invoke-virtual {v2}, Lv4/d;->f()Lv4/d$a;

    move-result-object v2

    invoke-virtual {v2}, Lv4/d$a;->b()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final b(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/y;
    .locals 2

    :try_start_0
    invoke-direct {p0}, Lo4/i;->e()Lo4/i$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo4/i$a;->a(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object p1

    invoke-static {}, LA4/y;->b0()LA4/y$b;

    move-result-object v0

    invoke-virtual {p0}, Lo4/i;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LA4/y$b;->u(Ljava/lang/String;)LA4/y$b;

    move-result-object v0

    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/M;->e()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, LA4/y$b;->w(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/y$b;

    move-result-object p1

    iget-object v0, p0, Lo4/i;->a:Lv4/d;

    invoke-virtual {v0}, Lv4/d;->g()LA4/y$c;

    move-result-object v0

    invoke-virtual {p1, v0}, LA4/y$b;->t(LA4/y$c;)LA4/y$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p1

    check-cast p1, LA4/y;
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string/jumbo v1, "Unexpected proto"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo4/i;->a:Lv4/d;

    invoke-virtual {v0}, Lv4/d;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/lang/Object;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lo4/i;->a:Lv4/d;

    invoke-virtual {v0, p1}, Lv4/d;->h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object p1

    invoke-direct {p0, p1}, Lo4/i;->f(Lcom/google/crypto/tink/shaded/protobuf/M;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Failures parsing proto of type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lo4/i;->a:Lv4/d;

    invoke-virtual {v2}, Lv4/d;->c()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
