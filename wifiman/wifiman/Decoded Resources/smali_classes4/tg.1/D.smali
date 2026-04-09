.class public final Ltg/D;
.super Lgg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/D$a;
    }
.end annotation


# instance fields
.field final a:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, Ltg/D;->a:Ljava/lang/Iterable;

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Ltg/D;->a:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_0

    invoke-static {p1}, Llg/c;->complete(Lgg/x;)V

    return-void

    :cond_0
    new-instance v1, Ltg/D$a;

    invoke-direct {v1, p1, v0}, Ltg/D$a;-><init>(Lgg/x;Ljava/util/Iterator;)V

    invoke-interface {p1, v1}, Lgg/x;->c(Lhg/c;)V

    iget-boolean p1, v1, Ltg/D$a;->d:Z

    if-nez p1, :cond_1

    invoke-virtual {v1}, Ltg/D$a;->a()V

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/x;)V

    return-void

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/x;)V

    return-void
.end method
