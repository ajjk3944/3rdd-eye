.class public abstract Lra/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lra/c$a;
    }
.end annotation


# direct methods
.method public static final a(Lra/d;)Lra/b;
    .locals 17

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lra/c$a;->a:[I

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/16 v2, 0x18

    const/16 v3, 0x10

    const/16 v4, 0x8

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    new-instance v0, Lra/b;

    int-to-float v1, v4

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v6

    int-to-float v1, v3

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v7

    const/16 v2, 0x20

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v8

    new-instance v3, Lra/b$a$b;

    const/high16 v5, 0x40000000    # 2.0f

    const/4 v9, 0x0

    move-object v4, v3

    invoke-direct/range {v4 .. v9}, Lra/b$a$b;-><init>(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v12

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v13

    const/16 v1, 0x30

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v14

    new-instance v1, Lra/b$a$a;

    const/high16 v11, 0x40000000    # 2.0f

    const/4 v15, 0x0

    move-object v10, v1

    invoke-direct/range {v10 .. v15}, Lra/b$a$a;-><init>(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v3, v1}, Lra/b;-><init>(Lra/b$a$b;Lra/b$a$a;)V

    goto/16 :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Lra/b;

    const/4 v1, 0x6

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v5

    const/16 v1, 0xc

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v6

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v7

    new-instance v9, Lra/b$a$b;

    const/high16 v4, 0x3fc00000    # 1.5f

    const/4 v8, 0x0

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Lra/b$a$b;-><init>(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v12

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v13

    const/16 v1, 0x24

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v14

    new-instance v1, Lra/b$a$a;

    const/high16 v11, 0x3fc00000    # 1.5f

    const/4 v15, 0x0

    move-object v10, v1

    invoke-direct/range {v10 .. v15}, Lra/b$a$a;-><init>(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v9, v1}, Lra/b;-><init>(Lra/b$a$b;Lra/b$a$a;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lra/b;

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v7

    int-to-float v1, v4

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v8

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v9

    new-instance v4, Lra/b$a$b;

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v10, 0x0

    move-object v5, v4

    invoke-direct/range {v5 .. v10}, Lra/b$a$b;-><init>(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v13

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v14

    int-to-float v1, v2

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v15

    new-instance v1, Lra/b$a$a;

    const/high16 v12, 0x3f800000    # 1.0f

    const/16 v16, 0x0

    move-object v11, v1

    invoke-direct/range {v11 .. v16}, Lra/b$a$a;-><init>(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v4, v1}, Lra/b;-><init>(Lra/b$a$b;Lra/b$a$a;)V

    invoke-virtual {v0}, Lra/b;->b()Lra/b$a$b;

    :goto_0
    return-object v0
.end method
