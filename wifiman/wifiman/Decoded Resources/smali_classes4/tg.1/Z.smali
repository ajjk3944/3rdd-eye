.class public final Ltg/Z;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/Z$a;
    }
.end annotation


# instance fields
.field final b:Lkg/n;


# direct methods
.method public constructor <init>(Lgg/v;Lkg/n;)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/Z;->b:Lkg/n;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 4

    invoke-static {}, LHg/b;->k1()LHg/b;

    move-result-object v0

    invoke-virtual {v0}, LHg/d;->i1()LHg/d;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Ltg/Z;->b:Lkg/n;

    invoke-interface {v1, v0}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "The handler returned a null ObservableSource"

    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v1, Lgg/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v2, Ltg/Z$a;

    iget-object v3, p0, Ltg/a;->a:Lgg/v;

    invoke-direct {v2, p1, v0, v3}, Ltg/Z$a;-><init>(Lgg/x;LHg/d;Lgg/v;)V

    invoke-interface {p1, v2}, Lgg/x;->c(Lhg/c;)V

    iget-object p1, v2, Ltg/Z$a;->e:Ltg/Z$a$a;

    invoke-interface {v1, p1}, Lgg/v;->d(Lgg/x;)V

    invoke-virtual {v2}, Ltg/Z$a;->m()V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/x;)V

    return-void
.end method
