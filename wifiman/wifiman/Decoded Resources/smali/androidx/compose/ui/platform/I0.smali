.class final Landroidx/compose/ui/platform/I0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:J

.field private c:LQ0/A;

.field private d:LQ0/v;

.field private e:LQ0/w;

.field private f:LQ0/k;

.field private g:Ljava/lang/String;

.field private h:J

.field private i:LW0/a;

.field private j:LW0/o;

.field private k:LS0/e;

.field private l:J

.field private m:LW0/k;

.field private n:Lm0/g1;


# direct methods
.method private constructor <init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;)V
    .locals 3

    move-object v0, p0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-wide v1, p1

    .line 3
    iput-wide v1, v0, Landroidx/compose/ui/platform/I0;->a:J

    move-wide v1, p3

    .line 4
    iput-wide v1, v0, Landroidx/compose/ui/platform/I0;->b:J

    move-object v1, p5

    .line 5
    iput-object v1, v0, Landroidx/compose/ui/platform/I0;->c:LQ0/A;

    move-object v1, p6

    .line 6
    iput-object v1, v0, Landroidx/compose/ui/platform/I0;->d:LQ0/v;

    move-object v1, p7

    .line 7
    iput-object v1, v0, Landroidx/compose/ui/platform/I0;->e:LQ0/w;

    move-object v1, p8

    .line 8
    iput-object v1, v0, Landroidx/compose/ui/platform/I0;->f:LQ0/k;

    move-object v1, p9

    .line 9
    iput-object v1, v0, Landroidx/compose/ui/platform/I0;->g:Ljava/lang/String;

    move-wide v1, p10

    .line 10
    iput-wide v1, v0, Landroidx/compose/ui/platform/I0;->h:J

    move-object v1, p12

    .line 11
    iput-object v1, v0, Landroidx/compose/ui/platform/I0;->i:LW0/a;

    move-object/from16 v1, p13

    .line 12
    iput-object v1, v0, Landroidx/compose/ui/platform/I0;->j:LW0/o;

    move-object/from16 v1, p14

    .line 13
    iput-object v1, v0, Landroidx/compose/ui/platform/I0;->k:LS0/e;

    move-wide/from16 v1, p15

    .line 14
    iput-wide v1, v0, Landroidx/compose/ui/platform/I0;->l:J

    move-object/from16 v1, p17

    .line 15
    iput-object v1, v0, Landroidx/compose/ui/platform/I0;->m:LW0/k;

    move-object/from16 v1, p18

    .line 16
    iput-object v1, v0, Landroidx/compose/ui/platform/I0;->n:Lm0/g1;

    return-void
.end method

.method public synthetic constructor <init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p19

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 17
    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v1}, Lm0/v0$a;->e()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    move-wide/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    .line 18
    sget-object v3, LY0/v;->b:LY0/v$a;

    invoke-virtual {v3}, LY0/v$a;->a()J

    move-result-wide v3

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p3

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v5, p5

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    const/4 v7, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v7, p6

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    const/4 v8, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    const/4 v9, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    const/4 v10, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    .line 19
    sget-object v11, LY0/v;->b:LY0/v$a;

    invoke-virtual {v11}, LY0/v$a;->a()J

    move-result-wide v11

    goto :goto_7

    :cond_7
    move-wide/from16 v11, p10

    :goto_7
    and-int/lit16 v13, v0, 0x100

    if-eqz v13, :cond_8

    const/4 v13, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v13, p12

    :goto_8
    and-int/lit16 v14, v0, 0x200

    if-eqz v14, :cond_9

    const/4 v14, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v14, p13

    :goto_9
    and-int/lit16 v15, v0, 0x400

    if-eqz v15, :cond_a

    const/4 v15, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v15, p14

    :goto_a
    and-int/lit16 v6, v0, 0x800

    if-eqz v6, :cond_b

    .line 20
    sget-object v6, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v6}, Lm0/v0$a;->e()J

    move-result-wide v16

    goto :goto_b

    :cond_b
    move-wide/from16 v16, p15

    :goto_b
    and-int/lit16 v6, v0, 0x1000

    if-eqz v6, :cond_c

    const/4 v6, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v6, p17

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    const/4 v0, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v0, p18

    :goto_d
    const/16 v18, 0x0

    move-object/from16 p20, v18

    move-object/from16 p1, p0

    move-wide/from16 p2, v1

    move-wide/from16 p4, v3

    move-object/from16 p6, v5

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-wide/from16 p11, v11

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-wide/from16 p16, v16

    move-object/from16 p18, v6

    move-object/from16 p19, v0

    .line 21
    invoke-direct/range {p1 .. p20}, Landroidx/compose/ui/platform/I0;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p18}, Landroidx/compose/ui/platform/I0;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/platform/I0;->l:J

    return-void
.end method

.method public final b(LW0/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/I0;->i:LW0/a;

    return-void
.end method

.method public final c(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/platform/I0;->a:J

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/I0;->g:Ljava/lang/String;

    return-void
.end method

.method public final e(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/platform/I0;->b:J

    return-void
.end method

.method public final f(LQ0/v;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/I0;->d:LQ0/v;

    return-void
.end method

.method public final g(LQ0/w;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/I0;->e:LQ0/w;

    return-void
.end method

.method public final h(LQ0/A;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/I0;->c:LQ0/A;

    return-void
.end method

.method public final i(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/platform/I0;->h:J

    return-void
.end method

.method public final j(Lm0/g1;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/I0;->n:Lm0/g1;

    return-void
.end method

.method public final k(LW0/k;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/I0;->m:LW0/k;

    return-void
.end method

.method public final l(LW0/o;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/I0;->j:LW0/o;

    return-void
.end method

.method public final m()LL0/D;
    .locals 28

    move-object/from16 v0, p0

    new-instance v24, LL0/D;

    move-object/from16 v1, v24

    iget-wide v2, v0, Landroidx/compose/ui/platform/I0;->a:J

    iget-wide v4, v0, Landroidx/compose/ui/platform/I0;->b:J

    iget-object v6, v0, Landroidx/compose/ui/platform/I0;->c:LQ0/A;

    iget-object v7, v0, Landroidx/compose/ui/platform/I0;->d:LQ0/v;

    iget-object v8, v0, Landroidx/compose/ui/platform/I0;->e:LQ0/w;

    iget-object v9, v0, Landroidx/compose/ui/platform/I0;->f:LQ0/k;

    iget-object v10, v0, Landroidx/compose/ui/platform/I0;->g:Ljava/lang/String;

    iget-wide v11, v0, Landroidx/compose/ui/platform/I0;->h:J

    iget-object v13, v0, Landroidx/compose/ui/platform/I0;->i:LW0/a;

    iget-object v14, v0, Landroidx/compose/ui/platform/I0;->j:LW0/o;

    iget-object v15, v0, Landroidx/compose/ui/platform/I0;->k:LS0/e;

    move-object/from16 v25, v1

    move-wide/from16 v26, v2

    iget-wide v1, v0, Landroidx/compose/ui/platform/I0;->l:J

    move-wide/from16 v16, v1

    iget-object v1, v0, Landroidx/compose/ui/platform/I0;->m:LW0/k;

    move-object/from16 v18, v1

    iget-object v1, v0, Landroidx/compose/ui/platform/I0;->n:Lm0/g1;

    move-object/from16 v19, v1

    const v22, 0xc000

    const/16 v23, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v1, v25

    move-wide/from16 v2, v26

    invoke-direct/range {v1 .. v23}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v24
.end method
