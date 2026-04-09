.class public final Lqg/l;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/l$a;
    }
.end annotation


# instance fields
.field final c:Lkg/n;

.field final d:Lkg/q;


# direct methods
.method public constructor <init>(Lgg/i;Lkg/n;Lkg/q;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/l;->c:Lkg/n;

    iput-object p3, p0, Lqg/l;->d:Lkg/q;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lqg/l;->d:Lkg/q;

    invoke-interface {v0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The collectionSupplier returned a null Collection."

    invoke-static {v0, v1}, Lzg/h;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lqg/b;->b:Lgg/i;

    new-instance v2, Lqg/l$a;

    iget-object v3, p0, Lqg/l;->c:Lkg/n;

    invoke-direct {v2, p1, v3, v0}, Lqg/l$a;-><init>(LDj/b;Lkg/n;Ljava/util/Collection;)V

    invoke-virtual {v1, v2}, Lgg/i;->D1(Lgg/l;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    return-void
.end method
