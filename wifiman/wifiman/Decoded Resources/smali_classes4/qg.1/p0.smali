.class public final Lqg/p0;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/p0$a;
    }
.end annotation


# instance fields
.field final c:Lgg/y;

.field final d:Z


# direct methods
.method public constructor <init>(Lgg/i;Lgg/y;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/p0;->c:Lgg/y;

    iput-boolean p3, p0, Lqg/p0;->d:Z

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 4

    iget-object v0, p0, Lqg/p0;->c:Lgg/y;

    invoke-virtual {v0}, Lgg/y;->c()Lgg/y$c;

    move-result-object v0

    new-instance v1, Lqg/p0$a;

    iget-object v2, p0, Lqg/b;->b:Lgg/i;

    iget-boolean v3, p0, Lqg/p0;->d:Z

    invoke-direct {v1, p1, v0, v2, v3}, Lqg/p0$a;-><init>(LDj/b;Lgg/y$c;LDj/a;Z)V

    invoke-interface {p1, v1}, LDj/b;->j(LDj/c;)V

    invoke-virtual {v0, v1}, Lgg/y$c;->b(Ljava/lang/Runnable;)Lhg/c;

    return-void
.end method
