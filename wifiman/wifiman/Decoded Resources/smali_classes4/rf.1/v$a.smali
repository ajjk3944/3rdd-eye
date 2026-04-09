.class final Lrf/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrf/v;->k(Landroidx/compose/ui/e;Ls9/d;Lrf/b;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrf/v$a$a;
    }
.end annotation


# instance fields
.field final synthetic a:Ls9/d;


# direct methods
.method constructor <init>(Ls9/d;)V
    .locals 0

    iput-object p1, p0, Lrf/v$a;->a:Ls9/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/b;Lrf/b;LT/l;I)V
    .locals 27

    move-object/from16 v2, p3

    const-string v0, "$this$AnimatedContent"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "s"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v3, "com.ui.wifiman.ui.teleport.component.SwitchButton.<anonymous> (TeleportTunnelSwitch.kt:247)"

    const v4, 0x26ee98b3

    move/from16 v5, p4

    invoke-static {v4, v5, v0, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    move-object/from16 v3, p0

    iget-object v0, v3, Lrf/v$a;->a:Ls9/d;

    const/4 v4, 0x0

    invoke-static {v0, v2, v4}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v0

    sget-object v4, LW0/j;->b:LW0/j$a;

    invoke-virtual {v4}, LW0/j$a;->a()I

    move-result v4

    sget-object v5, Lrf/v$a$a;->a:[I

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v5, v6

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eq v6, v9, :cond_2

    if-eq v6, v8, :cond_2

    if-ne v6, v7, :cond_1

    const v6, 0x39a40797

    invoke-interface {v2, v6}, LT/l;->U(I)V

    sget-object v6, Lla/a;->a:Lla/a;

    sget v10, Lla/a;->b:I

    invoke-virtual {v6, v2, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->a()J

    move-result-wide v10

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    :goto_0
    move-wide/from16 v21, v10

    goto :goto_1

    :cond_1
    const v0, 0x39a3f100

    invoke-interface {v2, v0}, LT/l;->U(I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    const v6, 0x39a3ff97

    invoke-interface {v2, v6}, LT/l;->U(I)V

    sget-object v6, Lla/a;->a:Lla/a;

    sget v10, Lla/a;->b:I

    invoke-virtual {v6, v2, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->a()Lma/a$a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v6

    invoke-virtual {v6}, Lr9/a$a;->f()J

    move-result-wide v10

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto :goto_0

    :goto_1
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v5, v1

    if-eq v1, v9, :cond_4

    if-eq v1, v8, :cond_4

    if-ne v1, v7, :cond_3

    const v1, 0x39a4253d

    invoke-interface {v2, v1}, LT/l;->U(I)V

    sget-object v1, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v1, v2, v5}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v1

    invoke-virtual {v1}, Lpa/c;->b()Lpa/b;

    move-result-object v1

    invoke-virtual {v1}, Lpa/b;->b()LL0/U;

    move-result-object v1

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    :goto_2
    move-object/from16 v26, v1

    goto :goto_3

    :cond_3
    const v0, 0x39a40d32

    invoke-interface {v2, v0}, LT/l;->U(I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_4
    const v1, 0x39a41b9d

    invoke-interface {v2, v1}, LT/l;->U(I)V

    sget-object v1, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v1, v2, v5}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v1

    invoke-virtual {v1}, Lpa/c;->a()Lpa/b;

    move-result-object v1

    invoke-virtual {v1}, Lpa/b;->b()LL0/U;

    move-result-object v1

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto :goto_2

    :goto_3
    invoke-static {v4}, LW0/j;->h(I)LW0/j;

    move-result-object v12

    const/16 v24, 0x0

    const v25, 0x1fdfa

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    move-wide/from16 v2, v21

    move-object/from16 v21, v26

    move-object/from16 v22, p3

    invoke-static/range {v0 .. v25}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/b;

    check-cast p2, Lrf/b;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lrf/v$a;->a(Lq/b;Lrf/b;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
