.class public final Lqg/G;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/G$a;
    }
.end annotation


# instance fields
.field final b:Lkg/q;

.field final c:Lkg/b;

.field final d:Lkg/f;


# direct methods
.method public constructor <init>(Lkg/q;Lkg/b;Lkg/f;)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, Lqg/G;->b:Lkg/q;

    iput-object p2, p0, Lqg/G;->c:Lkg/b;

    iput-object p3, p0, Lqg/G;->d:Lkg/f;

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lqg/G;->b:Lkg/q;

    invoke-interface {v0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v1, Lqg/G$a;

    iget-object v2, p0, Lqg/G;->c:Lkg/b;

    iget-object v3, p0, Lqg/G;->d:Lkg/f;

    invoke-direct {v1, p1, v2, v3, v0}, Lqg/G$a;-><init>(LDj/b;Lkg/b;Lkg/f;Ljava/lang/Object;)V

    invoke-interface {p1, v1}, LDj/b;->j(LDj/c;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    return-void
.end method
