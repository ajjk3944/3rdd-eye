.class public final Lqg/k0;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/k0$a;
    }
.end annotation


# instance fields
.field final c:Lkg/b;

.field final d:Lkg/q;


# direct methods
.method public constructor <init>(Lgg/i;Lkg/q;Lkg/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p3, p0, Lqg/k0;->c:Lkg/b;

    iput-object p2, p0, Lqg/k0;->d:Lkg/q;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lqg/k0;->d:Lkg/q;

    invoke-interface {v0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The seed supplied is null"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lqg/b;->b:Lgg/i;

    new-instance v2, Lqg/k0$a;

    iget-object v3, p0, Lqg/k0;->c:Lkg/b;

    invoke-static {}, Lgg/i;->i()I

    move-result v4

    invoke-direct {v2, p1, v3, v0, v4}, Lqg/k0$a;-><init>(LDj/b;Lkg/b;Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Lgg/i;->D1(Lgg/l;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    return-void
.end method
