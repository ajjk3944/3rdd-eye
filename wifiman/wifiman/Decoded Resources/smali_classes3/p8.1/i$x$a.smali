.class public final Lp8/i$x$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp8/i$x;->a(Lp8/i$b;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lp8/i$b;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lp8/i$b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lp8/i$x$a;->a:Lp8/i$b;

    iput-object p2, p0, Lp8/i$x$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lp8/i$x$a;->a:Lp8/i$b;

    instance-of v1, v0, Lp8/i$b$a;

    const/4 v2, 0x0

    if-nez v1, :cond_e

    instance-of v1, v0, Lp8/i$b$b;

    if-eqz v1, :cond_0

    goto/16 :goto_7

    :cond_0
    instance-of v1, v0, Lp8/i$b$c;

    if-eqz v1, :cond_d

    check-cast v0, Lp8/i$b$c;

    invoke-virtual {v0}, Lp8/i$b$c;->b()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LCc/a;

    invoke-interface {v1}, LCc/a;->j()LDc/j;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v3}, Lp8/l;->c(LDc/j;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_2
    move-object v3, v2

    :goto_0
    iget-object v4, p0, Lp8/i$x$a;->b:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v1}, LCc/a;->j()LDc/j;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, LDc/j;->F()LMc/a$a;

    move-result-object v3

    goto :goto_1

    :cond_3
    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_4

    sget-object v1, LJe/b$d;->b:LJe/b$d;

    goto :goto_3

    :cond_4
    invoke-interface {v1}, LCc/a;->j()LDc/j;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, LDc/j;->C()LIc/a$a;

    move-result-object v3

    goto :goto_2

    :cond_5
    move-object v3, v2

    :goto_2
    if-eqz v3, :cond_6

    sget-object v1, LJe/b$a;->b:LJe/b$a;

    goto :goto_3

    :cond_6
    invoke-interface {v1}, LCc/k;->getId()La8/b;

    move-result-object v3

    if-eqz v3, :cond_7

    new-instance v1, LJe/b$b;

    invoke-direct {v1, v3}, LJe/b$b;-><init>(La8/b;)V

    goto :goto_3

    :cond_7
    invoke-interface {v1}, LCc/a;->j()LDc/j;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, LDc/j;->w()Linet/ipaddr/g;

    move-result-object v1

    if-eqz v1, :cond_8

    new-instance v3, LJe/b$c;

    invoke-direct {v3, v1}, LJe/b$c;-><init>(Linet/ipaddr/g;)V

    move-object v1, v3

    goto :goto_3

    :cond_8
    move-object v1, v2

    :goto_3
    if-eqz v1, :cond_9

    new-instance v3, Li8/a$b$i;

    invoke-direct {v3, v1}, Li8/a$b$i;-><init>(LJe/b;)V

    goto :goto_6

    :cond_9
    :goto_4
    move-object v3, v2

    goto :goto_6

    :cond_a
    invoke-interface {v1}, LCc/a;->p()Lwc/a;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-static {v3}, Lp8/l;->d(Lwc/a;)Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :cond_b
    move-object v3, v2

    :goto_5
    iget-object v4, p0, Lp8/i$x$a;->b:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v1}, LCc/k;->getId()La8/b;

    move-result-object v1

    if-eqz v1, :cond_9

    new-instance v3, LJe/b$b;

    invoke-direct {v3, v1}, LJe/b$b;-><init>(La8/b;)V

    new-instance v1, Li8/a$b$i;

    invoke-direct {v1, v3}, Li8/a$b$i;-><init>(LJe/b;)V

    move-object v3, v1

    goto :goto_6

    :cond_c
    const-string v1, "Discovery Home - received clicked on unavailable device"

    const/4 v3, 0x6

    invoke-static {v1, v2, v2, v3, v2}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_4

    :goto_6
    if-eqz v3, :cond_1

    move-object v2, v3

    goto :goto_7

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_e
    :goto_7
    if-eqz v2, :cond_f

    invoke-interface {p1, v2}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_9

    :cond_f
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_9

    :goto_8
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_9
    return-void
.end method
