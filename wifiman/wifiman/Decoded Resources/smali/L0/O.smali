.class public final LL0/O;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL0/O$a;
    }
.end annotation


# static fields
.field public static final f:LL0/O$a;


# instance fields
.field private final a:LQ0/k$b;

.field private final b:LY0/d;

.field private final c:LY0/t;

.field private final d:I

.field private final e:LL0/K;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LL0/O$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LL0/O$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LL0/O;->f:LL0/O$a;

    return-void
.end method

.method public constructor <init>(LQ0/k$b;LY0/d;LY0/t;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL0/O;->a:LQ0/k$b;

    iput-object p2, p0, LL0/O;->b:LY0/d;

    iput-object p3, p0, LL0/O;->c:LY0/t;

    iput p4, p0, LL0/O;->d:I

    if-lez p4, :cond_0

    new-instance p1, LL0/K;

    invoke-direct {p1, p4}, LL0/K;-><init>(I)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LL0/O;->e:LL0/K;

    return-void
.end method

.method public static synthetic b(LL0/O;Ljava/lang/String;LL0/U;IZIJLY0/t;LY0/d;LQ0/k$b;ZILjava/lang/Object;)LL0/M;
    .locals 12

    move-object v0, p0

    move/from16 v1, p12

    and-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_0

    sget-object v2, LL0/U;->d:LL0/U$a;

    invoke-virtual {v2}, LL0/U$a;->a()LL0/U;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, p2

    :goto_0
    and-int/lit8 v3, v1, 0x4

    if-eqz v3, :cond_1

    sget-object v3, LW0/t;->a:LW0/t$a;

    invoke-virtual {v3}, LW0/t$a;->a()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, p3

    :goto_1
    and-int/lit8 v4, v1, 0x8

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    move/from16 v4, p4

    :goto_2
    and-int/lit8 v5, v1, 0x10

    if-eqz v5, :cond_3

    const v5, 0x7fffffff

    goto :goto_3

    :cond_3
    move/from16 v5, p5

    :goto_3
    and-int/lit8 v6, v1, 0x20

    if-eqz v6, :cond_4

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move p2, v8

    move p3, v9

    move/from16 p4, v10

    move/from16 p5, v11

    move/from16 p6, v6

    move-object/from16 p7, v7

    invoke-static/range {p2 .. p7}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v6

    goto :goto_4

    :cond_4
    move-wide/from16 v6, p6

    :goto_4
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_5

    iget-object v8, v0, LL0/O;->c:LY0/t;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p8

    :goto_5
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_6

    iget-object v9, v0, LL0/O;->b:LY0/d;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p9

    :goto_6
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_7

    iget-object v10, v0, LL0/O;->a:LQ0/k$b;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p10

    :goto_7
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_8

    const/4 v1, 0x0

    goto :goto_8

    :cond_8
    move/from16 v1, p11

    :goto_8
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v2

    move/from16 p5, v3

    move/from16 p6, v4

    move/from16 p7, v5

    move-wide/from16 p8, v6

    move-object/from16 p10, v8

    move-object/from16 p11, v9

    move-object/from16 p12, v10

    move/from16 p13, v1

    invoke-virtual/range {p2 .. p13}, LL0/O;->a(Ljava/lang/String;LL0/U;IZIJLY0/t;LY0/d;LQ0/k$b;Z)LL0/M;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(LL0/O;LL0/d;LL0/U;IZILjava/util/List;JLY0/t;LY0/d;LQ0/k$b;ZILjava/lang/Object;)LL0/M;
    .locals 13

    move-object v0, p0

    move/from16 v1, p13

    and-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_0

    sget-object v2, LL0/U;->d:LL0/U$a;

    invoke-virtual {v2}, LL0/U$a;->a()LL0/U;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, p2

    :goto_0
    and-int/lit8 v3, v1, 0x4

    if-eqz v3, :cond_1

    sget-object v3, LW0/t;->a:LW0/t$a;

    invoke-virtual {v3}, LW0/t$a;->a()I

    move-result v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, v1, 0x8

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    move/from16 v4, p4

    :goto_2
    and-int/lit8 v5, v1, 0x10

    if-eqz v5, :cond_3

    const v5, 0x7fffffff

    goto :goto_3

    :cond_3
    move/from16 v5, p5

    :goto_3
    and-int/lit8 v6, v1, 0x20

    if-eqz v6, :cond_4

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v6

    goto :goto_4

    :cond_4
    move-object/from16 v6, p6

    :goto_4
    and-int/lit8 v7, v1, 0x40

    if-eqz v7, :cond_5

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move p2, v9

    move/from16 p3, v10

    move/from16 p4, v11

    move/from16 p5, v12

    move/from16 p6, v7

    move-object/from16 p7, v8

    invoke-static/range {p2 .. p7}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v7

    goto :goto_5

    :cond_5
    move-wide/from16 v7, p7

    :goto_5
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_6

    iget-object v9, v0, LL0/O;->c:LY0/t;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p9

    :goto_6
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_7

    iget-object v10, v0, LL0/O;->b:LY0/d;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p10

    :goto_7
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_8

    iget-object v11, v0, LL0/O;->a:LQ0/k$b;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p11

    :goto_8
    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_9

    const/4 v1, 0x0

    goto :goto_9

    :cond_9
    move/from16 v1, p12

    :goto_9
    move-object p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v2

    move/from16 p5, v3

    move/from16 p6, v4

    move/from16 p7, v5

    move-object/from16 p8, v6

    move-wide/from16 p9, v7

    move-object/from16 p11, v9

    move-object/from16 p12, v10

    move-object/from16 p13, v11

    move/from16 p14, v1

    invoke-virtual/range {p2 .. p14}, LL0/O;->c(LL0/d;LL0/U;IZILjava/util/List;JLY0/t;LY0/d;LQ0/k$b;Z)LL0/M;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;LL0/U;IZIJLY0/t;LY0/d;LQ0/k$b;Z)LL0/M;
    .locals 15

    new-instance v6, LL0/d;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v5}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v13, 0x20

    const/4 v14, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, v6

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move-object v6, v7

    move-wide/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    invoke-static/range {v0 .. v14}, LL0/O;->d(LL0/O;LL0/d;LL0/U;IZILjava/util/List;JLY0/t;LY0/d;LQ0/k$b;ZILjava/lang/Object;)LL0/M;

    move-result-object v0

    return-object v0
.end method

.method public final c(LL0/d;LL0/U;IZILjava/util/List;JLY0/t;LY0/d;LQ0/k$b;Z)LL0/M;
    .locals 15

    move-object v0, p0

    new-instance v14, LL0/L;

    const/4 v13, 0x0

    move-object v1, v14

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p6

    move/from16 v5, p5

    move/from16 v6, p4

    move/from16 v7, p3

    move-object/from16 v8, p10

    move-object/from16 v9, p9

    move-object/from16 v10, p11

    move-wide/from16 v11, p7

    invoke-direct/range {v1 .. v13}, LL0/L;-><init>(LL0/d;LL0/U;Ljava/util/List;IZILY0/d;LY0/t;LQ0/k$b;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-nez p12, :cond_0

    iget-object v1, v0, LL0/O;->e:LL0/K;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v14}, LL0/K;->a(LL0/L;)LL0/M;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, LL0/M;->w()LL0/k;

    move-result-object v2

    invoke-virtual {v2}, LL0/k;->A()F

    move-result v2

    invoke-static {v2}, LL0/u;->d(F)I

    move-result v2

    invoke-virtual {v1}, LL0/M;->w()LL0/k;

    move-result-object v3

    invoke-virtual {v3}, LL0/k;->h()F

    move-result v3

    invoke-static {v3}, LL0/u;->d(F)I

    move-result v3

    invoke-static {v2, v3}, LY0/s;->a(II)J

    move-result-wide v2

    move-wide/from16 v4, p7

    invoke-static {v4, v5, v2, v3}, LY0/c;->f(JJ)J

    move-result-wide v2

    invoke-virtual {v1, v14, v2, v3}, LL0/M;->a(LL0/L;J)LL0/M;

    move-result-object v1

    goto :goto_1

    :cond_1
    sget-object v1, LL0/O;->f:LL0/O$a;

    invoke-static {v1, v14}, LL0/O$a;->a(LL0/O$a;LL0/L;)LL0/M;

    move-result-object v1

    iget-object v2, v0, LL0/O;->e:LL0/K;

    if-eqz v2, :cond_2

    invoke-virtual {v2, v14, v1}, LL0/K;->b(LL0/L;LL0/M;)LL0/M;

    :cond_2
    :goto_1
    return-object v1
.end method
