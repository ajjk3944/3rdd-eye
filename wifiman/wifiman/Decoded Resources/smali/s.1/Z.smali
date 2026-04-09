.class public abstract Ls/Z;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/e;Lw/y;Lw/q;ZZLw/n;Ly/m;Lw/d;LT/l;II)Landroidx/compose/ui/e;
    .locals 9

    move-object v2, p2

    move-object/from16 v0, p8

    and-int/lit8 v1, p10, 0x40

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object v8, v1

    goto :goto_0

    :cond_0
    move-object/from16 v8, p7

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    const-string v3, "androidx.compose.foundation.scrollingContainer (ScrollingContainer.kt:40)"

    const v4, -0x64017657

    move/from16 v5, p9

    invoke-static {v4, v5, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    sget-object v1, Lw/x;->a:Lw/x;

    const/4 v3, 0x6

    invoke-virtual {v1, v0, v3}, Lw/x;->b(LT/l;I)Ls/S;

    move-result-object v3

    move-object v4, p0

    invoke-static {p0, p2}, Ls/l;->a(Landroidx/compose/ui/e;Lw/q;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v4, v3}, Ls/T;->a(Landroidx/compose/ui/e;Ls/S;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {}, Landroidx/compose/ui/platform/k0;->m()LT/H0;

    move-result-object v5

    invoke-interface {v0, v5}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/t;

    move v5, p4

    invoke-virtual {v1, v0, p2, p4}, Lw/x;->c(LY0/t;Lw/q;Z)Z

    move-result v5

    move-object v0, v4

    move-object v1, p1

    move-object v2, p2

    move v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-static/range {v0 .. v8}, Landroidx/compose/foundation/gestures/d;->f(Landroidx/compose/ui/e;Lw/y;Lw/q;Ls/S;ZZLw/n;Ly/m;Lw/d;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    return-object v0
.end method
