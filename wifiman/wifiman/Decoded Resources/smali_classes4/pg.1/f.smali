.class public final Lpg/f;
.super Lgg/b;
.source "SourceFile"


# instance fields
.field final a:Lkg/q;


# direct methods
.method public constructor <init>(Lkg/q;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/f;->a:Lkg/q;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lpg/f;->a:Lkg/q;

    invoke-interface {v0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The completableSupplier returned a null CompletableSource"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Lgg/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, p1}, Lgg/f;->e(Lgg/d;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/d;)V

    return-void
.end method
