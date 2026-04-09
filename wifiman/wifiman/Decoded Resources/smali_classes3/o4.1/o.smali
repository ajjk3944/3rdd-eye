.class public final Lo4/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LA4/C$b;


# direct methods
.method private constructor <init>(LA4/C$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo4/o;->a:LA4/C$b;

    return-void
.end method

.method private declared-synchronized c(LA4/y;LA4/I;)LA4/C$c;
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lo4/o;->g()I

    move-result v0

    sget-object v1, LA4/I;->UNKNOWN_PREFIX:LA4/I;

    if-eq p2, v1, :cond_0

    invoke-static {}, LA4/C$c;->d0()LA4/C$c$a;

    move-result-object v1

    invoke-virtual {v1, p1}, LA4/C$c$a;->t(LA4/y;)LA4/C$c$a;

    move-result-object p1

    invoke-virtual {p1, v0}, LA4/C$c$a;->u(I)LA4/C$c$a;

    move-result-object p1

    sget-object v0, LA4/z;->ENABLED:LA4/z;

    invoke-virtual {p1, v0}, LA4/C$c$a;->x(LA4/z;)LA4/C$c$a;

    move-result-object p1

    invoke-virtual {p1, p2}, LA4/C$c$a;->w(LA4/I;)LA4/C$c$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p1

    check-cast p1, LA4/C$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string/jumbo p2, "unknown output prefix type"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private declared-synchronized e(I)Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lo4/o;->a:LA4/C$b;

    invoke-virtual {v0}, LA4/C$b;->x()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LA4/C$c;

    invoke-virtual {v1}, LA4/C$c;->Z()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, p1, :cond_0

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private declared-synchronized f(LA4/A;)LA4/C$c;
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lo4/x;->k(LA4/A;)LA4/y;

    move-result-object v0

    invoke-virtual {p1}, LA4/A;->Y()LA4/I;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lo4/o;->c(LA4/y;LA4/I;)LA4/C$c;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private declared-synchronized g()I
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lv4/s;->c()I

    move-result v0

    :goto_0
    invoke-direct {p0, v0}, Lo4/o;->e(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lv4/s;->c()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    monitor-exit p0

    return v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static i()Lo4/o;
    .locals 2

    new-instance v0, Lo4/o;

    invoke-static {}, LA4/C;->c0()LA4/C$b;

    move-result-object v1

    invoke-direct {v0, v1}, Lo4/o;-><init>(LA4/C$b;)V

    return-object v0
.end method

.method public static j(Lo4/n;)Lo4/o;
    .locals 1

    new-instance v0, Lo4/o;

    invoke-virtual {p0}, Lo4/n;->h()LA4/C;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w;->S()Lcom/google/crypto/tink/shaded/protobuf/w$a;

    move-result-object p0

    check-cast p0, LA4/C$b;

    invoke-direct {v0, p0}, Lo4/o;-><init>(LA4/C$b;)V

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(Lo4/l;)Lo4/o;
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lo4/l;->b()LA4/A;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo4/o;->b(LA4/A;Z)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized b(LA4/A;Z)I
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lo4/o;->f(LA4/A;)LA4/C$c;

    move-result-object p1

    iget-object v0, p0, Lo4/o;->a:LA4/C$b;

    invoke-virtual {v0, p1}, LA4/C$b;->t(LA4/C$c;)LA4/C$b;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lo4/o;->a:LA4/C$b;

    invoke-virtual {p1}, LA4/C$c;->Z()I

    move-result v0

    invoke-virtual {p2, v0}, LA4/C$b;->z(I)LA4/C$b;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p1}, LA4/C$c;->Z()I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized d()Lo4/n;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lo4/o;->a:LA4/C$b;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v0

    check-cast v0, LA4/C;

    invoke-static {v0}, Lo4/n;->e(LA4/C;)Lo4/n;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized h(I)Lo4/o;
    .locals 3

    monitor-enter p0

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    iget-object v1, p0, Lo4/o;->a:LA4/C$b;

    invoke-virtual {v1}, LA4/C$b;->w()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lo4/o;->a:LA4/C$b;

    invoke-virtual {v1, v0}, LA4/C$b;->u(I)LA4/C$c;

    move-result-object v1

    invoke-virtual {v1}, LA4/C$c;->Z()I

    move-result v2

    if-ne v2, p1, :cond_1

    invoke-virtual {v1}, LA4/C$c;->b0()LA4/z;

    move-result-object v0

    sget-object v1, LA4/z;->ENABLED:LA4/z;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo4/o;->a:LA4/C$b;

    invoke-virtual {v0, p1}, LA4/C$b;->z(I)LA4/C$b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :try_start_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "cannot set key as primary because it\'s not enabled: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "key not found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
