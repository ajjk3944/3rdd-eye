.class Loi/f$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loi/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loi/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "h"
.end annotation


# instance fields
.field private final a:Loi/f;

.field private final b:Lmh/a;

.field private volatile c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Loi/f;Lmh/a;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Loi/f$h;->a(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, Loi/f$h;->a(I)V

    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Loi/f$n;->NOT_COMPUTED:Loi/f$n;

    iput-object v0, p0, Loi/f$h;->c:Ljava/lang/Object;

    iput-object p1, p0, Loi/f$h;->a:Loi/f;

    iput-object p2, p0, Loi/f$h;->b:Lmh/a;

    return-void
.end method

.method private static synthetic a(I)V
    .locals 8

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v2, "@NotNull method %s.%s must not return null"

    :goto_0
    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue"

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq p0, v6, :cond_3

    if-eq p0, v1, :cond_2

    if-eq p0, v0, :cond_2

    const-string v7, "storageManager"

    aput-object v7, v3, v5

    goto :goto_2

    :cond_2
    aput-object v4, v3, v5

    goto :goto_2

    :cond_3
    const-string v7, "computable"

    aput-object v7, v3, v5

    :goto_2
    if-eq p0, v1, :cond_5

    if-eq p0, v0, :cond_4

    aput-object v4, v3, v6

    goto :goto_3

    :cond_4
    const-string v4, "renderDebugInformation"

    aput-object v4, v3, v6

    goto :goto_3

    :cond_5
    const-string v4, "recursionDetected"

    aput-object v4, v3, v6

    :goto_3
    if-eq p0, v1, :cond_6

    if-eq p0, v0, :cond_6

    const-string v4, "<init>"

    aput-object v4, v3, v1

    :cond_6
    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_7

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_4
    throw p0
.end method


# virtual methods
.method protected b(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method protected c(Z)Loi/f$o;
    .locals 2

    iget-object p1, p0, Loi/f$h;->a:Loi/f;

    const-string v0, "in a lazy value"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Loi/f;->p(Ljava/lang/String;Ljava/lang/Object;)Loi/f$o;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 v0, 0x2

    invoke-static {v0}, Loi/f$h;->a(I)V

    :cond_0
    return-object p1
.end method

.method public invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Loi/f$h;->c:Ljava/lang/Object;

    instance-of v1, v0, Loi/f$n;

    if-nez v1, :cond_0

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/utils/WrappedValues;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Loi/f$h;->a:Loi/f;

    iget-object v0, v0, Loi/f;->a:Loi/k;

    invoke-interface {v0}, Loi/k;->lock()V

    :try_start_0
    iget-object v0, p0, Loi/f$h;->c:Ljava/lang/Object;

    instance-of v1, v0, Loi/f$n;

    if-nez v1, :cond_1

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/utils/WrappedValues;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object v1, p0, Loi/f$h;->a:Loi/f;

    iget-object v1, v1, Loi/f;->a:Loi/k;

    invoke-interface {v1}, Loi/k;->unlock()V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :try_start_1
    sget-object v1, Loi/f$n;->COMPUTING:Loi/f$n;

    if-ne v0, v1, :cond_2

    sget-object v2, Loi/f$n;->RECURSION_WAS_DETECTED:Loi/f$n;

    iput-object v2, p0, Loi/f$h;->c:Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Loi/f$h;->c(Z)Loi/f$o;

    move-result-object v2

    invoke-virtual {v2}, Loi/f$o;->c()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v2}, Loi/f$o;->b()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_2
    sget-object v2, Loi/f$n;->RECURSION_WAS_DETECTED:Loi/f$n;

    if-ne v0, v2, :cond_3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Loi/f$h;->c(Z)Loi/f$o;

    move-result-object v0

    invoke-virtual {v0}, Loi/f$o;->c()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v0}, Loi/f$o;->b()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_3
    iput-object v1, p0, Loi/f$h;->c:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v0, p0, Loi/f$h;->b:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Loi/f$h;->b(Ljava/lang/Object;)V

    iput-object v0, p0, Loi/f$h;->c:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    invoke-static {v0}, Lxi/d;->a(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, Loi/f$h;->c:Ljava/lang/Object;

    sget-object v2, Loi/f$n;->COMPUTING:Loi/f$n;

    if-ne v1, v2, :cond_4

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/utils/WrappedValues;->c(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Loi/f$h;->c:Ljava/lang/Object;

    :cond_4
    iget-object v1, p0, Loi/f$h;->a:Loi/f;

    invoke-static {v1}, Loi/f;->k(Loi/f;)Loi/f$f;

    move-result-object v1

    invoke-interface {v1, v0}, Loi/f$f;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_5
    sget-object v1, Loi/f$n;->NOT_COMPUTED:Loi/f$n;

    iput-object v1, p0, Loi/f$h;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/RuntimeException;

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    iget-object v1, p0, Loi/f$h;->a:Loi/f;

    iget-object v1, v1, Loi/f;->a:Loi/k;

    invoke-interface {v1}, Loi/k;->unlock()V

    throw v0
.end method

.method public m()Z
    .locals 2

    iget-object v0, p0, Loi/f$h;->c:Ljava/lang/Object;

    sget-object v1, Loi/f$n;->NOT_COMPUTED:Loi/f$n;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Loi/f$h;->c:Ljava/lang/Object;

    sget-object v1, Loi/f$n;->COMPUTING:Loi/f$n;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
