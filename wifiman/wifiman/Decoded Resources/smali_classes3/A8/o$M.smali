.class final LA8/o$M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/o;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LA8/o$M;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LA8/o$M;

    invoke-direct {v0}, LA8/o$M;-><init>()V

    sput-object v0, LA8/o$M;->a:LA8/o$M;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LA8/o$c;La8/a;)LTe/B0;
    .locals 17

    move-object/from16 v0, p2

    const-string/jumbo v1, "signal"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "devices"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LA8/o$c;->b()Lh9/a;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    sget-object v4, La8/b;->c:La8/b$a;

    invoke-virtual {v4, v1}, La8/b$a;->b(Lh9/a;)La8/b;

    move-result-object v1

    invoke-virtual {v0, v1}, La8/a;->a(La8/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCc/a$b;

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_1

    sget-object v1, Lcom/ubnt/usurvey/product/m$c;->NORMAL:Lcom/ubnt/usurvey/product/m$c;

    sget-object v4, LPe/a;->a:LPe/a;

    invoke-virtual {v4}, LPe/a;->c()Ls9/b;

    move-result-object v4

    invoke-static {v0, v1, v4}, Ln8/m;->e(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;)Ls9/a;

    move-result-object v1

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object v7, v3

    :goto_1
    invoke-virtual/range {p1 .. p1}, LA8/o$c;->c()LS8/l;

    move-result-object v1

    if-eqz v1, :cond_3

    if-eqz v0, :cond_2

    invoke-interface {v0}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v4, Ls9/d$c;

    invoke-direct {v4, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v8, v4

    goto :goto_3

    :cond_2
    new-instance v1, Ls9/d$b;

    const v4, 0x7f1103ee

    invoke-direct {v1, v4}, Ls9/d$b;-><init>(I)V

    :goto_2
    move-object v8, v1

    goto :goto_3

    :cond_3
    new-instance v1, Ls9/d$b;

    const v4, 0x7f11007e

    invoke-direct {v1, v4}, Ls9/d$b;-><init>(I)V

    goto :goto_2

    :goto_3
    const-string v1, ":"

    if-eqz v0, :cond_6

    invoke-interface {v0}, LCc/a;->b()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-static {v4}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_4

    :cond_4
    new-instance v4, Ls9/d$b;

    invoke-virtual/range {p1 .. p1}, LA8/o$c;->b()Lh9/a;

    move-result-object v5

    invoke-virtual {v5, v1}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, LCc/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const v1, 0x7f1103c3

    invoke-direct {v4, v1, v0}, Ls9/d$b;-><init>(ILjava/util/List;)V

    goto :goto_5

    :cond_5
    :goto_4
    new-instance v4, Ls9/d$c;

    invoke-virtual/range {p1 .. p1}, LA8/o$c;->b()Lh9/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :goto_5
    move-object v11, v4

    goto :goto_6

    :cond_6
    invoke-virtual/range {p1 .. p1}, LA8/o$c;->b()Lh9/a;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0, v1}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance v1, Ls9/d$c;

    invoke-direct {v1, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v11, v1

    goto :goto_6

    :cond_7
    move-object v11, v3

    :goto_6
    invoke-virtual/range {p1 .. p1}, LA8/o$c;->c()LS8/l;

    move-result-object v0

    const/4 v1, 0x2

    if-eqz v0, :cond_9

    const/4 v4, 0x1

    invoke-static {v0, v4, v3, v1, v3}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v0

    if-nez v0, :cond_8

    goto :goto_8

    :cond_8
    :goto_7
    move-object v12, v0

    goto :goto_9

    :cond_9
    :goto_8
    new-instance v0, Ls9/d$b;

    const v4, 0x7f1103c6

    invoke-direct {v0, v4}, Ls9/d$b;-><init>(I)V

    goto :goto_7

    :goto_9
    invoke-virtual/range {p1 .. p1}, LA8/o$c;->c()LS8/l;

    move-result-object v0

    if-eqz v0, :cond_a

    const/4 v2, 0x0

    invoke-static {v0, v2, v3, v1, v3}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v3

    :cond_a
    move-object v14, v3

    new-instance v0, LTe/B0;

    const-string v5, ""

    const/4 v6, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/16 v15, 0x120

    const/16 v16, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v16}, LTe/B0;-><init>(Ljava/lang/String;LTe/N;Ls9/a;Ls9/d;ZLDe/a;Ls9/d;Ls9/d;ZLs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA8/o$c;

    check-cast p2, La8/a;

    invoke-virtual {p0, p1, p2}, LA8/o$M;->a(LA8/o$c;La8/a;)LTe/B0;

    move-result-object p1

    return-object p1
.end method
