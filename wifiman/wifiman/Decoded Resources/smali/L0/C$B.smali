.class final LL0/C$B;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LL0/C$B;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL0/C$B;

    invoke-direct {v0}, LL0/C$B;-><init>()V

    sput-object v0, LL0/C$B;->a:LL0/C$B;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc0/m;LL0/D;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p1

    invoke-virtual/range {p2 .. p2}, LL0/D;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v1

    sget-object v2, Lm0/v0;->b:Lm0/v0$a;

    invoke-static {v2}, LL0/C;->t(Lm0/v0$a;)Lc0/k;

    move-result-object v3

    invoke-static {v1, v3, v0}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, LL0/D;->k()J

    move-result-wide v5

    invoke-static {v5, v6}, LY0/v;->b(J)LY0/v;

    move-result-object v1

    sget-object v3, LY0/v;->b:LY0/v$a;

    invoke-static {v3}, LL0/C;->r(LY0/v$a;)Lc0/k;

    move-result-object v5

    invoke-static {v1, v5, v0}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, LL0/D;->n()LQ0/A;

    move-result-object v1

    sget-object v6, LQ0/A;->b:LQ0/A$a;

    invoke-static {v6}, LL0/C;->k(LQ0/A$a;)Lc0/k;

    move-result-object v6

    invoke-static {v1, v6, v0}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, LL0/D;->l()LQ0/v;

    move-result-object v1

    invoke-static {v1}, LL0/C;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, LL0/D;->m()LQ0/w;

    move-result-object v1

    invoke-static {v1}, LL0/C;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, LL0/C;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual/range {p2 .. p2}, LL0/D;->j()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LL0/C;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual/range {p2 .. p2}, LL0/D;->o()J

    move-result-wide v11

    invoke-static {v11, v12}, LY0/v;->b(J)LY0/v;

    move-result-object v1

    invoke-static {v3}, LL0/C;->r(LY0/v$a;)Lc0/k;

    move-result-object v3

    invoke-static {v1, v3, v0}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual/range {p2 .. p2}, LL0/D;->e()LW0/a;

    move-result-object v1

    sget-object v3, LW0/a;->b:LW0/a$a;

    invoke-static {v3}, LL0/C;->n(LW0/a$a;)Lc0/k;

    move-result-object v3

    invoke-static {v1, v3, v0}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual/range {p2 .. p2}, LL0/D;->u()LW0/o;

    move-result-object v1

    sget-object v3, LW0/o;->c:LW0/o$a;

    invoke-static {v3}, LL0/C;->p(LW0/o$a;)Lc0/k;

    move-result-object v3

    invoke-static {v1, v3, v0}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object v13

    invoke-virtual/range {p2 .. p2}, LL0/D;->p()LS0/e;

    move-result-object v1

    sget-object v3, LS0/e;->c:LS0/e$a;

    invoke-static {v3}, LL0/C;->m(LS0/e$a;)Lc0/k;

    move-result-object v3

    invoke-static {v1, v3, v0}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object v14

    invoke-virtual/range {p2 .. p2}, LL0/D;->d()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v1

    invoke-static {v2}, LL0/C;->t(Lm0/v0$a;)Lc0/k;

    move-result-object v2

    invoke-static {v1, v2, v0}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object v15

    invoke-virtual/range {p2 .. p2}, LL0/D;->s()LW0/k;

    move-result-object v1

    sget-object v2, LW0/k;->b:LW0/k$a;

    invoke-static {v2}, LL0/C;->o(LW0/k$a;)Lc0/k;

    move-result-object v2

    invoke-static {v1, v2, v0}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object v16

    invoke-virtual/range {p2 .. p2}, LL0/D;->r()Lm0/g1;

    move-result-object v1

    sget-object v2, Lm0/g1;->d:Lm0/g1$a;

    invoke-static {v2}, LL0/C;->u(Lm0/g1$a;)Lc0/k;

    move-result-object v2

    invoke-static {v1, v2, v0}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object v17

    filled-new-array/range {v4 .. v17}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LZg/v;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/m;

    check-cast p2, LL0/D;

    invoke-virtual {p0, p1, p2}, LL0/C$B;->a(Lc0/m;LL0/D;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
