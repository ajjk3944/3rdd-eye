.class public final LTe/V$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTe/V;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:J

.field private final b:J

.field private final c:Lo6/d;

.field private final d:Lo6/d;

.field private final e:Lo6/d;

.field private final f:Lo6/d;

.field private final g:Lt6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JJLo6/d;Lo6/d;Lo6/d;Lo6/d;Lt6/b;)V
    .locals 1

    const-string v0, "line"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dot"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labelBackgroundArrow"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labelBackground"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, LTe/V$a;->a:J

    .line 4
    iput-wide p3, p0, LTe/V$a;->b:J

    .line 5
    iput-object p5, p0, LTe/V$a;->c:Lo6/d;

    .line 6
    iput-object p6, p0, LTe/V$a;->d:Lo6/d;

    .line 7
    iput-object p7, p0, LTe/V$a;->e:Lo6/d;

    .line 8
    iput-object p8, p0, LTe/V$a;->f:Lo6/d;

    .line 9
    iput-object p9, p0, LTe/V$a;->g:Lt6/b;

    return-void
.end method

.method public synthetic constructor <init>(JJLo6/d;Lo6/d;Lo6/d;Lo6/d;Lt6/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 22

    and-int/lit8 v0, p10, 0x4

    if-eqz v0, :cond_0

    .line 10
    new-instance v0, Lo6/d;

    .line 11
    new-instance v8, Lo6/a;

    sget-object v1, Lo6/e;->a:Lo6/e;

    invoke-virtual {v1}, Lo6/e;->a()Lp6/d;

    move-result-object v2

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/high16 v3, 0x40a00000    # 5.0f

    const/high16 v4, 0x40a00000    # 5.0f

    const/4 v5, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lo6/a;-><init>(Lo6/c;FFLo6/a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    invoke-static/range {p3 .. p4}, Lm0/x0;->j(J)I

    move-result v3

    const/16 v9, 0x3c

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, v8

    move v8, v9

    move-object v9, v10

    .line 13
    invoke-direct/range {v1 .. v9}, Lo6/d;-><init>(Lo6/c;ILr6/b;Lw6/b;FIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v16, v0

    goto :goto_0

    :cond_0
    move-object/from16 v16, p5

    :goto_0
    and-int/lit8 v0, p10, 0x8

    if-eqz v0, :cond_1

    .line 14
    new-instance v0, Lo6/d;

    .line 15
    sget-object v1, Lo6/e;->a:Lo6/e;

    const/16 v2, 0x64

    invoke-virtual {v1, v2}, Lo6/e;->c(I)Lp6/d;

    move-result-object v2

    .line 16
    invoke-static/range {p3 .. p4}, Lm0/x0;->j(J)I

    move-result v3

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v0

    .line 17
    invoke-direct/range {v1 .. v9}, Lo6/d;-><init>(Lo6/c;ILr6/b;Lw6/b;FIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v17, v0

    goto :goto_1

    :cond_1
    move-object/from16 v17, p6

    :goto_1
    and-int/lit8 v0, p10, 0x10

    const/16 v1, 0xc

    if-eqz v0, :cond_2

    .line 18
    new-instance v0, LTe/F;

    .line 19
    sget-object v2, Lo6/e;->a:Lo6/e;

    invoke-virtual {v2, v1}, Lo6/e;->c(I)Lp6/d;

    move-result-object v2

    const/high16 v3, 0x42340000    # 45.0f

    .line 20
    invoke-static/range {p3 .. p4}, Lm0/x0;->j(J)I

    move-result v4

    .line 21
    invoke-direct {v0, v2, v3, v4}, LTe/F;-><init>(Lo6/c;FI)V

    move-object/from16 v18, v0

    goto :goto_2

    :cond_2
    move-object/from16 v18, p7

    :goto_2
    and-int/lit8 v0, p10, 0x20

    if-eqz v0, :cond_3

    .line 22
    new-instance v0, Lo6/d;

    .line 23
    sget-object v2, Lo6/e;->a:Lo6/e;

    invoke-virtual {v2, v1}, Lo6/e;->c(I)Lp6/d;

    move-result-object v3

    .line 24
    invoke-static/range {p3 .. p4}, Lm0/x0;->j(J)I

    move-result v4

    const/16 v9, 0x3c

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, v0

    .line 25
    invoke-direct/range {v2 .. v10}, Lo6/d;-><init>(Lo6/c;ILr6/b;Lw6/b;FIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v19, v0

    goto :goto_3

    :cond_3
    move-object/from16 v19, p8

    :goto_3
    and-int/lit8 v0, p10, 0x40

    if-eqz v0, :cond_4

    .line 26
    new-instance v0, Lt6/b$a;

    invoke-direct {v0}, Lt6/b$a;-><init>()V

    .line 27
    invoke-static/range {p1 .. p2}, Lm0/x0;->j(J)I

    move-result v1

    invoke-virtual {v0, v1}, Lt6/b$a;->c(I)V

    const/high16 v1, 0x41400000    # 12.0f

    .line 28
    invoke-virtual {v0, v1}, Lt6/b$a;->i(F)V

    .line 29
    invoke-virtual {v0}, Lt6/b$a;->a()Lt6/b;

    move-result-object v0

    move-object/from16 v20, v0

    goto :goto_4

    :cond_4
    move-object/from16 v20, p9

    :goto_4
    const/16 v21, 0x0

    move-object/from16 v11, p0

    move-wide/from16 v12, p1

    move-wide/from16 v14, p3

    .line 30
    invoke-direct/range {v11 .. v21}, LTe/V$a;-><init>(JJLo6/d;Lo6/d;Lo6/d;Lo6/d;Lt6/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(JJLo6/d;Lo6/d;Lo6/d;Lo6/d;Lt6/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, LTe/V$a;-><init>(JJLo6/d;Lo6/d;Lo6/d;Lo6/d;Lt6/b;)V

    return-void
.end method


# virtual methods
.method public final a()Lo6/d;
    .locals 1

    iget-object v0, p0, LTe/V$a;->d:Lo6/d;

    return-object v0
.end method

.method public final b()Lt6/b;
    .locals 1

    iget-object v0, p0, LTe/V$a;->g:Lt6/b;

    return-object v0
.end method

.method public final c()Lo6/d;
    .locals 1

    iget-object v0, p0, LTe/V$a;->f:Lo6/d;

    return-object v0
.end method

.method public final d()Lo6/d;
    .locals 1

    iget-object v0, p0, LTe/V$a;->e:Lo6/d;

    return-object v0
.end method

.method public final e()Lo6/d;
    .locals 1

    iget-object v0, p0, LTe/V$a;->c:Lo6/d;

    return-object v0
.end method
