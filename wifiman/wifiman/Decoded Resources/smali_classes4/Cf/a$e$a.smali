.class public final LCf/a$e$a;
.super LCf/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCf/a$e;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final g:LLi/z;

.field private final h:LLi/z;

.field private final i:LLi/z;

.field private final j:LLi/z;

.field private final k:LLi/N;

.field private final l:LLi/N;


# direct methods
.method constructor <init>(LT/l;)V
    .locals 21

    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p0}, LCf/d;-><init>()V

    new-instance v1, Ls9/d$c;

    const-string v2, "WiFI Home"

    invoke-direct {v1, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v1

    iput-object v1, v0, LCf/a$e$a;->g:LLi/z;

    new-instance v1, LDf/b;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v2, v3, v4, v5, v6}, [Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    sget-object v3, LS8/j;->c:LS8/j$a;

    sget-object v4, LS8/j$b$b;->a:LS8/j$b$b;

    invoke-static {v4}, LZg/d0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-virtual {v3, v4}, LS8/j$a;->a(Ljava/util/Set;)LS8/j;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3}, LAf/y;->c(LS8/j;)Ls9/d;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v1, v2, v3}, LDf/b;-><init>(Ljava/util/List;Ls9/d;)V

    invoke-static {v1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v1

    iput-object v1, v0, LCf/a$e$a;->h:LLi/z;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v1

    iput-object v1, v0, LCf/a$e$a;->i:LLi/z;

    new-instance v1, LBf/b;

    sget-object v3, LS8/c;->GHZ_2_4:LS8/c;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v3, v2}, LBf/b;-><init>(LS8/c;Ljava/util/List;)V

    invoke-static {v1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v1

    iput-object v1, v0, LCf/a$e$a;->j:LLi/z;

    new-instance v1, LAf/B;

    invoke-static {}, LS8/c;->getEntries()Lfh/a;

    move-result-object v2

    invoke-static {v2}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, LAf/B;-><init>(LS8/c;Ljava/util/List;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v1

    iput-object v1, v0, LCf/a$e$a;->k:LLi/N;

    new-instance v1, LEe/g;

    new-instance v9, LEe/g$a$a;

    new-instance v4, Ls9/d$c;

    const-string v2, "Access Points (3)"

    invoke-direct {v4, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v2, LDf/a$a;

    const/16 v19, 0x6

    const/16 v20, 0xfe

    const-string v10, "ap0"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, p1

    invoke-static/range {v10 .. v20}, LAf/l;->o(Ljava/lang/String;Ls9/a;Ls9/d;ZLjava/util/List;LAf/c$a;LAf/c$a;LAf/c$a;LT/l;II)LAf/c;

    move-result-object v3

    invoke-direct {v2, v3}, LDf/a$a;-><init>(LAf/c;)V

    new-instance v3, LDf/a$a;

    const-string v10, "ap1"

    invoke-static/range {v10 .. v20}, LAf/l;->o(Ljava/lang/String;Ls9/a;Ls9/d;ZLjava/util/List;LAf/c$a;LAf/c$a;LAf/c$a;LT/l;II)LAf/c;

    move-result-object v5

    invoke-direct {v3, v5}, LDf/a$a;-><init>(LAf/c;)V

    new-instance v5, LDf/a$a;

    const-string v10, "ap2"

    invoke-static/range {v10 .. v20}, LAf/l;->o(Ljava/lang/String;Ls9/a;Ls9/d;ZLjava/util/List;LAf/c$a;LAf/c$a;LAf/c$a;LT/l;II)LAf/c;

    move-result-object v6

    invoke-direct {v5, v6}, LDf/a$a;-><init>(LAf/c;)V

    filled-new-array {v2, v3, v5}, [LDf/a$a;

    move-result-object v2

    invoke-static {v2}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v3, "accessPoints"

    const/4 v5, 0x0

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v9}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, LEe/g;-><init>(Ljava/util/List;)V

    invoke-static {v1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v1

    iput-object v1, v0, LCf/a$e$a;->l:LLi/N;

    return-void
.end method


# virtual methods
.method public bridge synthetic c()LLi/N;
    .locals 1

    invoke-virtual {p0}, LCf/a$e$a;->z0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LCf/a$e$a;->l:LLi/N;

    return-object v0
.end method

.method public bridge synthetic o0()LLi/N;
    .locals 1

    invoke-virtual {p0}, LCf/a$e$a;->w0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p0()LLi/N;
    .locals 1

    invoke-virtual {p0}, LCf/a$e$a;->x0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic q0()LLi/N;
    .locals 1

    invoke-virtual {p0}, LCf/a$e$a;->y0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public s0()LLi/N;
    .locals 1

    iget-object v0, p0, LCf/a$e$a;->k:LLi/N;

    return-object v0
.end method

.method public t0(Lh9/a;)V
    .locals 1

    const-string v0, "bssid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public u0()V
    .locals 0

    return-void
.end method

.method public v0(LS8/c;)V
    .locals 0

    return-void
.end method

.method public w0()LLi/z;
    .locals 1

    iget-object v0, p0, LCf/a$e$a;->j:LLi/z;

    return-object v0
.end method

.method public x0()LLi/z;
    .locals 1

    iget-object v0, p0, LCf/a$e$a;->i:LLi/z;

    return-object v0
.end method

.method public y0()LLi/z;
    .locals 1

    iget-object v0, p0, LCf/a$e$a;->h:LLi/z;

    return-object v0
.end method

.method public z0()LLi/z;
    .locals 1

    iget-object v0, p0, LCf/a$e$a;->g:LLi/z;

    return-object v0
.end method
