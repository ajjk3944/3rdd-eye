.class public final Ls8/f$f$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls8/f$f$a;->a(La8/a;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lhd/a;

.field final synthetic b:Ls8/f;

.field final synthetic c:La8/a;


# direct methods
.method public constructor <init>(Lhd/a;Ls8/f;La8/a;)V
    .locals 0

    iput-object p1, p0, Ls8/f$f$a$a;->a:Lhd/a;

    iput-object p2, p0, Ls8/f$f$a$a;->b:Ls8/f;

    iput-object p3, p0, Ls8/f$f$a$a;->c:La8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Ls8/f$f$a$a;->a:Lhd/a;

    instance-of v1, v0, Lhd/a$a$b;

    if-eqz v1, :cond_0

    new-instance v0, LGe/a;

    iget-object v1, p0, Ls8/f$f$a$a;->b:Ls8/f;

    iget-object v2, p0, Ls8/f$f$a$a;->a:Lhd/a;

    invoke-static {v1, v2}, Ls8/f;->e(Ls8/f;Lhd/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ls9/d$b;

    const v3, 0x7f1101f3

    invoke-direct {v2, v3}, Ls9/d$b;-><init>(I)V

    iget-object v3, p0, Ls8/f$f$a$a;->b:Ls8/f;

    iget-object v4, p0, Ls8/f$f$a$a;->a:Lhd/a;

    iget-object v5, p0, Ls8/f$f$a$a;->c:La8/a;

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v5, p0, Ls8/f$f$a$a;->c:La8/a;

    invoke-static {v3, v4, v5}, Ls8/f;->c(Ls8/f;Lhd/a;La8/a;)Ls9/d;

    move-result-object v3

    iget-object v4, p0, Ls8/f$f$a$a;->b:Ls8/f;

    iget-object v5, p0, Ls8/f$f$a$a;->a:Lhd/a;

    invoke-static {v4, v5}, Ls8/f;->b(Ls8/f;Lhd/a;)Ls9/d;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, LGe/a;-><init>(Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;)V

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_0
    instance-of v1, v0, Lhd/a$a$c;

    if-eqz v1, :cond_1

    new-instance v0, LGe/a;

    iget-object v1, p0, Ls8/f$f$a$a;->b:Ls8/f;

    iget-object v2, p0, Ls8/f$f$a$a;->a:Lhd/a;

    invoke-static {v1, v2}, Ls8/f;->e(Ls8/f;Lhd/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ls9/d$b;

    const v3, 0x7f1101f2

    invoke-direct {v2, v3}, Ls9/d$b;-><init>(I)V

    iget-object v3, p0, Ls8/f$f$a$a;->b:Ls8/f;

    iget-object v4, p0, Ls8/f$f$a$a;->a:Lhd/a;

    iget-object v5, p0, Ls8/f$f$a$a;->c:La8/a;

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v5, p0, Ls8/f$f$a$a;->c:La8/a;

    invoke-static {v3, v4, v5}, Ls8/f;->c(Ls8/f;Lhd/a;La8/a;)Ls9/d;

    move-result-object v3

    iget-object v4, p0, Ls8/f$f$a$a;->b:Ls8/f;

    iget-object v5, p0, Ls8/f$f$a$a;->a:Lhd/a;

    invoke-static {v4, v5}, Ls8/f;->b(Ls8/f;Lhd/a;)Ls9/d;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, LGe/a;-><init>(Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;)V

    goto :goto_2

    :cond_1
    instance-of v1, v0, Lhd/a$a$a;

    if-nez v1, :cond_3

    instance-of v1, v0, Lhd/a$b;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3
    :goto_0
    invoke-virtual {v0}, Lhd/a;->a()Lhd/a$d;

    move-result-object v0

    instance-of v1, v0, Lhd/a$d$a$b;

    if-eqz v1, :cond_4

    new-instance v0, LGe/a;

    iget-object v1, p0, Ls8/f$f$a$a;->b:Ls8/f;

    iget-object v2, p0, Ls8/f$f$a$a;->a:Lhd/a;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v2, p0, Ls8/f$f$a$a;->a:Lhd/a;

    invoke-static {v1, v2}, Ls8/f;->e(Ls8/f;Lhd/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ls9/d$b;

    const v3, 0x7f1101f4

    invoke-direct {v2, v3}, Ls9/d$b;-><init>(I)V

    iget-object v3, p0, Ls8/f$f$a$a;->b:Ls8/f;

    iget-object v4, p0, Ls8/f$f$a$a;->a:Lhd/a;

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v4, p0, Ls8/f$f$a$a;->a:Lhd/a;

    iget-object v5, p0, Ls8/f$f$a$a;->c:La8/a;

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v5, p0, Ls8/f$f$a$a;->c:La8/a;

    invoke-static {v3, v4, v5}, Ls8/f;->c(Ls8/f;Lhd/a;La8/a;)Ls9/d;

    move-result-object v3

    iget-object v4, p0, Ls8/f$f$a$a;->b:Ls8/f;

    iget-object v5, p0, Ls8/f$f$a$a;->a:Lhd/a;

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v5, p0, Ls8/f$f$a$a;->a:Lhd/a;

    invoke-static {v4, v5}, Ls8/f;->b(Ls8/f;Lhd/a;)Ls9/d;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, LGe/a;-><init>(Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;)V

    goto :goto_2

    :cond_4
    instance-of v1, v0, Lhd/a$d$b;

    if-nez v1, :cond_6

    instance-of v0, v0, Lhd/a$d$a$a;

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_6
    :goto_1
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_7

    invoke-interface {p1, v0}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :goto_3
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_4
    return-void
.end method
