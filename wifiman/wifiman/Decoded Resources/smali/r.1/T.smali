.class public final Lr/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/D;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/T$a;,
        Lr/T$b;
    }
.end annotation


# instance fields
.field private final a:Lr/T$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lr/T$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/T;->a:Lr/T$b;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lr/s0;)Lr/v0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lr/T;->f(Lr/s0;)Lr/E0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Lr/s0;)Lr/y0;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lr/T;->f(Lr/s0;)Lr/E0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Lr/s0;)Lr/z0;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lr/T;->f(Lr/s0;)Lr/E0;

    move-result-object p1

    return-object p1
.end method

.method public f(Lr/s0;)Lr/E0;
    .locals 20

    move-object/from16 v0, p0

    new-instance v2, Lo/y;

    iget-object v1, v0, Lr/T;->a:Lr/T$b;

    invoke-virtual {v1}, Lr/U;->c()Lo/z;

    move-result-object v1

    invoke-virtual {v1}, Lo/m;->e()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    invoke-direct {v2, v1}, Lo/y;-><init>(I)V

    new-instance v3, Lo/z;

    iget-object v1, v0, Lr/T;->a:Lr/T$b;

    invoke-virtual {v1}, Lr/U;->c()Lo/z;

    move-result-object v1

    invoke-virtual {v1}, Lo/m;->e()I

    move-result v1

    invoke-direct {v3, v1}, Lo/z;-><init>(I)V

    iget-object v1, v0, Lr/T;->a:Lr/T$b;

    invoke-virtual {v1}, Lr/U;->c()Lo/z;

    move-result-object v1

    iget-object v4, v1, Lo/m;->b:[I

    iget-object v5, v1, Lo/m;->c:[Ljava/lang/Object;

    iget-object v1, v1, Lo/m;->a:[J

    array-length v6, v1

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_3

    const/4 v8, 0x0

    :goto_0
    aget-wide v9, v1, v8

    not-long v11, v9

    const/4 v13, 0x7

    shl-long/2addr v11, v13

    and-long/2addr v11, v9

    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v11, v13

    cmp-long v11, v11, v13

    if-eqz v11, :cond_2

    sub-int v11, v8, v6

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v11, :cond_1

    const-wide/16 v14, 0xff

    and-long/2addr v14, v9

    const-wide/16 v16, 0x80

    cmp-long v14, v14, v16

    if-gez v14, :cond_0

    shl-int/lit8 v14, v8, 0x3

    add-int/2addr v14, v13

    aget v15, v4, v14

    aget-object v14, v5, v14

    check-cast v14, Lr/T$a;

    invoke-virtual {v2, v15}, Lo/y;->h(I)Z

    new-instance v7, Lr/D0;

    invoke-interface/range {p1 .. p1}, Lr/s0;->a()Lmh/l;

    move-result-object v12

    move-object/from16 v18, v1

    invoke-virtual {v14}, Lr/S;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v12, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr/q;

    invoke-virtual {v14}, Lr/S;->a()Lr/E;

    move-result-object v12

    invoke-virtual {v14}, Lr/T$a;->d()I

    move-result v14

    move-object/from16 v19, v4

    const/4 v4, 0x0

    invoke-direct {v7, v1, v12, v14, v4}, Lr/D0;-><init>(Lr/q;Lr/E;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v15, v7}, Lo/z;->t(ILjava/lang/Object;)V

    const/16 v1, 0x8

    goto :goto_2

    :cond_0
    move-object/from16 v18, v1

    move-object/from16 v19, v4

    move v1, v12

    :goto_2
    shr-long/2addr v9, v1

    add-int/lit8 v13, v13, 0x1

    move v12, v1

    move-object/from16 v1, v18

    move-object/from16 v4, v19

    goto :goto_1

    :cond_1
    move-object/from16 v18, v1

    move-object/from16 v19, v4

    move v1, v12

    if-ne v11, v1, :cond_3

    goto :goto_3

    :cond_2
    move-object/from16 v18, v1

    move-object/from16 v19, v4

    :goto_3
    if-eq v8, v6, :cond_3

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v1, v18

    move-object/from16 v4, v19

    goto :goto_0

    :cond_3
    iget-object v1, v0, Lr/T;->a:Lr/T$b;

    invoke-virtual {v1}, Lr/U;->c()Lo/z;

    move-result-object v1

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Lo/m;->a(I)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v2, v4, v4}, Lo/y;->g(II)V

    :cond_4
    iget-object v1, v0, Lr/T;->a:Lr/T$b;

    invoke-virtual {v1}, Lr/U;->c()Lo/z;

    move-result-object v1

    iget-object v4, v0, Lr/T;->a:Lr/T$b;

    invoke-virtual {v4}, Lr/U;->b()I

    move-result v4

    invoke-virtual {v1, v4}, Lo/m;->a(I)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, v0, Lr/T;->a:Lr/T$b;

    invoke-virtual {v1}, Lr/U;->b()I

    move-result v1

    invoke-virtual {v2, v1}, Lo/y;->h(I)Z

    :cond_5
    invoke-virtual {v2}, Lo/y;->n()V

    new-instance v9, Lr/E0;

    iget-object v1, v0, Lr/T;->a:Lr/T$b;

    invoke-virtual {v1}, Lr/U;->b()I

    move-result v4

    iget-object v1, v0, Lr/T;->a:Lr/T$b;

    invoke-virtual {v1}, Lr/U;->a()I

    move-result v5

    invoke-static {}, Lr/G;->d()Lr/E;

    move-result-object v6

    sget-object v1, Lr/t;->a:Lr/t$a;

    invoke-virtual {v1}, Lr/t$a;->a()I

    move-result v7

    const/4 v8, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Lr/E0;-><init>(Lo/k;Lo/m;IILr/E;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9
.end method
