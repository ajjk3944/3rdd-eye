.class LO6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO6/b;-><init>(Lgg/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgg/y;

.field final synthetic b:LO6/b;


# direct methods
.method constructor <init>(LO6/b;Lgg/y;)V
    .locals 0

    iput-object p1, p0, LO6/b$a;->b:LO6/b;

    iput-object p2, p0, LO6/b$a;->a:Lgg/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    :goto_0
    :try_start_0
    iget-object v0, p0, LO6/b$a;->b:LO6/b;

    iget-object v0, v0, LO6/b;->a:LO6/h;

    invoke-virtual {v0}, LO6/h;->d()LO6/g;

    move-result-object v0

    iget-object v1, v0, LO6/g;->b:LM6/j;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v1}, LL6/b;->t(LM6/j;)V

    invoke-static {v1}, LL6/b;->r(LM6/j;)V

    new-instance v4, LO6/j;

    invoke-direct {v4}, LO6/j;-><init>()V

    iget-object v5, p0, LO6/b$a;->a:Lgg/y;

    invoke-virtual {v0, v4, v5}, LO6/g;->b(LO6/j;Lgg/y;)V

    invoke-virtual {v4}, LO6/j;->a()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v1, v2, v3, v4, v5}, LL6/b;->o(LM6/j;JJ)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string/jumbo v2, "Error while processing client operation queue"

    invoke-static {v0, v2, v1}, LI6/q;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
