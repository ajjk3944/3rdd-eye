.class final Lx8/j$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx8/j;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lx8/j$l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx8/j$l;

    invoke-direct {v0}, Lx8/j$l;-><init>()V

    sput-object v0, Lx8/j$l;->a:Lx8/j$l;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Lje/r;

    check-cast p3, Ljava/util/List;

    invoke-virtual {p0, p1, p2, p3}, Lx8/j$l;->b(Ll9/a;Lje/r;Ljava/util/List;)LTe/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;Lje/r;Ljava/util/List;)LTe/a;
    .locals 17

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "<destruct>"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "wifiConnectionState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "connectionEvents"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljd/a$b;

    instance-of v3, v0, Lje/r$b$a;

    const/4 v4, 0x1

    if-eqz v3, :cond_6

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljd/a$b;->b()LCc/a;

    move-result-object v3

    if-eqz v3, :cond_1

    sget-object v5, Lcom/ubnt/usurvey/product/m$c;->NORMAL:Lcom/ubnt/usurvey/product/m$c;

    sget-object v6, LPe/a;->a:LPe/a;

    invoke-virtual {v6}, LPe/a;->c()Ls9/b;

    move-result-object v6

    invoke-static {v3, v5, v6}, Ln8/m;->e(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;)Ls9/a;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v7, v3

    goto :goto_2

    :cond_1
    :goto_1
    sget-object v3, LPe/a;->a:LPe/a;

    invoke-virtual {v3}, LPe/a;->c()Ls9/b;

    move-result-object v3

    goto :goto_0

    :goto_2
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljd/a$b;->b()LCc/a;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {v2}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    new-instance v3, Ls9/d$c;

    invoke-direct {v3, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :goto_3
    move-object v9, v3

    goto :goto_4

    :cond_2
    move-object v2, v0

    check-cast v2, Lje/r$b$a;

    invoke-virtual {v2}, Lje/r$b$a;->c()Lh9/a;

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v3, Ls9/d$c;

    const-string v5, ":"

    invoke-virtual {v2, v5}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_3
    new-instance v2, Ls9/d$b;

    const v3, 0x7f110241

    invoke-direct {v2, v3}, Ls9/d$b;-><init>(I)V

    move-object v9, v2

    :goto_4
    new-instance v10, Ls9/d$b;

    const v2, 0x7f11023f

    invoke-direct {v10, v2}, Ls9/d$b;-><init>(I)V

    move-object v2, v0

    check-cast v2, Lje/r$b$a;

    invoke-virtual {v2}, Lje/r$b$a;->h()LS8/l;

    move-result-object v3

    const/4 v5, 0x0

    if-eqz v3, :cond_4

    const/4 v6, 0x2

    invoke-static {v3, v4, v5, v6, v5}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v3

    move-object v11, v3

    goto :goto_5

    :cond_4
    move-object v11, v5

    :goto_5
    invoke-virtual {v2}, Lje/r$b$a;->d()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v2}, Lje/r$b$a;->b()LS8/c;

    move-result-object v2

    if-eqz v2, :cond_5

    new-instance v2, Ls9/d$a;

    new-instance v3, Lx8/j$l$a;

    invoke-direct {v3, v0}, Lx8/j$l$a;-><init>(Lje/r;)V

    const-string v0, ""

    invoke-direct {v2, v0, v3}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    move-object v12, v2

    goto :goto_6

    :cond_5
    move-object v12, v5

    :goto_6
    move-object v0, v1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v14, v0, 0x1

    new-instance v0, LTe/a;

    const/16 v15, 0x80

    const/16 v16, 0x0

    const-string/jumbo v6, "current"

    const/4 v8, 0x0

    const/4 v13, 0x0

    move-object v5, v0

    invoke-direct/range {v5 .. v16}, LTe/a;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;Ls9/d;Ls9/d;Ls9/d;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_8

    :cond_6
    instance-of v2, v0, Lje/r$a;

    if-nez v2, :cond_8

    instance-of v0, v0, Lje/r$b$b;

    if-eqz v0, :cond_7

    goto :goto_7

    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_8
    :goto_7
    sget-object v0, LPe/a;->a:LPe/a;

    invoke-virtual {v0}, LPe/a;->b0()Ls9/b;

    move-result-object v7

    new-instance v9, Ls9/d$b;

    const v0, 0x7f11007e

    invoke-direct {v9, v0}, Ls9/d$b;-><init>(I)V

    move-object v0, v1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v14, v0, 0x1

    new-instance v0, LTe/a;

    const/16 v15, 0x80

    const/16 v16, 0x0

    const-string/jumbo v6, "current"

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v5, v0

    invoke-direct/range {v5 .. v16}, LTe/a;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;Ls9/d;Ls9/d;Ls9/d;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_8
    return-object v0
.end method
