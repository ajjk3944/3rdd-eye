.class public abstract LI/f1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmh/a;Lmh/p;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;)Li0/d;
    .locals 11

    new-instance v0, LI/f1$a;

    move-object v1, p0

    invoke-direct {v0, p0}, LI/f1$a;-><init>(Lmh/a;)V

    new-instance v10, LI/f1$b;

    move-object v1, v10

    move-object v2, p2

    move-object v3, p1

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p7

    move-object/from16 v8, p6

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, LI/f1$b;-><init>(Lmh/l;Lmh/p;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;)V

    invoke-static {v0, v10}, Li0/f;->a(Lmh/l;Li0/g;)Li0/d;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lmh/a;Lmh/p;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;ILjava/lang/Object;)Li0/d;
    .locals 12

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    move-object v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    move-object v7, v2

    goto :goto_1

    :cond_1
    move-object/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move-object v9, v2

    goto :goto_3

    :cond_3
    move-object/from16 v9, p6

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move-object v10, v2

    goto :goto_4

    :cond_4
    move-object/from16 v10, p7

    :goto_4
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_5

    move-object v11, v2

    goto :goto_5

    :cond_5
    move-object/from16 v11, p8

    :goto_5
    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v3 .. v11}, LI/f1;->a(Lmh/a;Lmh/p;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;)Li0/d;

    move-result-object v0

    return-object v0
.end method
