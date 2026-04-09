.class final Ltg/a0$b;
.super Lgg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final a:Ljava/lang/Object;

.field final b:Lkg/n;


# direct methods
.method constructor <init>(Ljava/lang/Object;Lkg/n;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, Ltg/a0$b;->a:Ljava/lang/Object;

    iput-object p2, p0, Ltg/a0$b;->b:Lkg/n;

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Ltg/a0$b;->b:Lkg/n;

    iget-object v1, p0, Ltg/a0$b;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The mapper returned a null ObservableSource"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Lgg/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    instance-of v1, v0, Lkg/q;

    if-eqz v1, :cond_1

    :try_start_1
    check-cast v0, Lkg/q;

    invoke-interface {v0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_0

    invoke-static {p1}, Llg/c;->complete(Lgg/x;)V

    return-void

    :cond_0
    new-instance v1, Ltg/a0$a;

    invoke-direct {v1, p1, v0}, Ltg/a0$a;-><init>(Lgg/x;Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Lgg/x;->c(Lhg/c;)V

    invoke-virtual {v1}, Ltg/a0$a;->run()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/x;)V

    return-void

    :cond_1
    invoke-interface {v0, p1}, Lgg/v;->d(Lgg/x;)V

    :goto_0
    return-void

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/x;)V

    return-void
.end method
