.class public final Ltg/T;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/T$b;,
        Ltg/T$a;
    }
.end annotation


# instance fields
.field final b:Lkg/n;


# direct methods
.method public constructor <init>(Lgg/v;Lkg/n;)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/T;->b:Lkg/n;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 3

    invoke-static {}, LHg/b;->k1()LHg/b;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Ltg/T;->b:Lkg/n;

    invoke-interface {v1, v0}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "The selector returned a null ObservableSource"

    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v1, Lgg/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v2, Ltg/T$b;

    invoke-direct {v2, p1}, Ltg/T$b;-><init>(Lgg/x;)V

    invoke-interface {v1, v2}, Lgg/v;->d(Lgg/x;)V

    iget-object p1, p0, Ltg/a;->a:Lgg/v;

    new-instance v1, Ltg/T$a;

    invoke-direct {v1, v0, v2}, Ltg/T$a;-><init>(LHg/b;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-interface {p1, v1}, Lgg/v;->d(Lgg/x;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/x;)V

    return-void
.end method
