.class public final Lx8/j$k$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx8/j$k;->a(LYg/y;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:LTe/a;

.field final synthetic c:Lx8/j;

.field final synthetic d:La8/a;


# direct methods
.method public constructor <init>(Ljava/util/List;LTe/a;Lx8/j;La8/a;)V
    .locals 0

    iput-object p1, p0, Lx8/j$k$c;->a:Ljava/util/List;

    iput-object p2, p0, Lx8/j$k$c;->b:LTe/a;

    iput-object p3, p0, Lx8/j$k$c;->c:Lx8/j;

    iput-object p4, p0, Lx8/j$k$c;->d:La8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 13

    :try_start_0
    iget-object v0, p0, Lx8/j$k$c;->a:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lx8/j$k$c;->b:LTe/a;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lx8/j$k$c;->a:Ljava/util/List;

    invoke-static {v1}, LZg/v;->S(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    if-gez v3, :cond_0

    invoke-static {}, LZg/v;->v()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_0
    :goto_1
    move-object v7, v4

    check-cast v7, Lhd/a;

    invoke-virtual {v7}, Lhd/a;->b()J

    move-result-wide v8

    iget-object v4, p0, Lx8/j$k$c;->a:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/4 v6, 0x1

    sub-int/2addr v4, v6

    if-eq v3, v4, :cond_1

    move v12, v6

    goto :goto_2

    :cond_1
    move v12, v2

    :goto_2
    iget-object v6, p0, Lx8/j$k$c;->c:Lx8/j;

    iget-object v10, p0, Lx8/j$k$c;->d:La8/a;

    const/4 v11, 0x1

    invoke-static/range {v6 .. v12}, Lx8/j;->E0(Lx8/j;Lhd/a;JLa8/a;ZZ)LTe/a;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v3, v5

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LTe/a;

    new-instance v3, LTe/K0$i;

    invoke-direct {v3, v2}, LTe/K0$i;-><init>(LTe/a;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    :goto_4
    move-object v6, v1

    goto :goto_5

    :cond_4
    new-instance v0, LTe/K0$g;

    new-instance v1, Ls9/d$b;

    const v2, 0x7f110240

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-direct {v0, v1}, LTe/K0$g;-><init>(Ls9/d;)V

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_4

    :goto_5
    new-instance v0, LEe/g$a$a;

    const-string/jumbo v3, "roaming"

    new-instance v4, Ls9/d$b;

    const v1, 0x7f110242

    invoke-direct {v4, v1}, Ls9/d$b;-><init>(I)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_7

    :goto_6
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_7
    return-void
.end method
