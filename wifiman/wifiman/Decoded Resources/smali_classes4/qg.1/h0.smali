.class public final Lqg/h0;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/h0$a;
    }
.end annotation


# instance fields
.field final c:Lkg/n;


# direct methods
.method public constructor <init>(Lgg/i;Lkg/n;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/h0;->c:Lkg/n;

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 5

    new-instance v0, LIg/a;

    invoke-direct {v0, p1}, LIg/a;-><init>(LDj/b;)V

    const/16 v1, 0x8

    invoke-static {v1}, LFg/e;->k2(I)LFg/e;

    move-result-object v1

    invoke-virtual {v1}, LFg/b;->h2()LFg/b;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, Lqg/h0;->c:Lkg/n;

    invoke-interface {v2, v1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "handler returned a null Publisher"

    invoke-static {v2, v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v2, LDj/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v3, Lqg/f0$b;

    iget-object v4, p0, Lqg/b;->b:Lgg/i;

    invoke-direct {v3, v4}, Lqg/f0$b;-><init>(LDj/a;)V

    new-instance v4, Lqg/h0$a;

    invoke-direct {v4, v0, v1, v3}, Lqg/h0$a;-><init>(LDj/b;LFg/b;LDj/c;)V

    iput-object v4, v3, Lqg/f0$b;->d:Lqg/f0$c;

    invoke-interface {p1, v4}, LDj/b;->j(LDj/c;)V

    invoke-interface {v2, v3}, LDj/a;->b(LDj/b;)V

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v3, p1}, Lqg/f0$b;->h(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    return-void
.end method
