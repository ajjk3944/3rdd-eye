.class final LMe/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMe/i;->b(Landroidx/compose/ui/e;LMe/g;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMe/i$a$a;
    }
.end annotation


# instance fields
.field final synthetic a:LMe/g;


# direct methods
.method constructor <init>(LMe/g;)V
    .locals 0

    iput-object p1, p0, LMe/i$a;->a:LMe/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/A;LT/l;I)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v3, p2

    move/from16 v1, p3

    const-string v2, "$this$FlowRow"

    move-object/from16 v4, p1

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v4, 0x10

    if-ne v2, v4, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v4, "com.ui.wifiman.ui.discovery.component.DiscoveryResultLan.<anonymous>.<anonymous> (DiscoveryResultLan.kt:76)"

    const v5, 0x2ee49e1b

    invoke-static {v5, v1, v2, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, LMe/i$a;->a:LMe/g;

    invoke-virtual {v1}, LMe/g;->d()Ls9/d;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v1, v3, v4}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    sget-object v2, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v2, v3, v5}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->b()LL0/U;

    move-result-object v22

    iget-object v6, v0, LMe/i$a;->a:LMe/g;

    invoke-virtual {v6}, LMe/g;->e()LMe/g$a;

    move-result-object v6

    sget-object v7, LMe/i$a$a;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v7, v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_4

    const/4 v7, 0x2

    if-ne v6, v7, :cond_3

    const v6, 0x59c5af9f

    invoke-interface {v3, v6}, LT/l;->U(I)V

    invoke-virtual {v2, v3, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->b()J

    move-result-wide v5

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    :goto_1
    move-wide/from16 v27, v5

    goto :goto_2

    :cond_3
    const v1, 0x59c59988

    invoke-interface {v3, v1}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_4
    const v6, 0x59c5a51f

    invoke-interface {v3, v6}, LT/l;->U(I)V

    invoke-virtual {v2, v3, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->a()J

    move-result-wide v5

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    goto :goto_1

    :goto_2
    sget-object v2, LW0/t;->a:LW0/t$a;

    invoke-virtual {v2}, LW0/t$a;->b()I

    move-result v16

    const/16 v25, 0xc30

    const v26, 0x1d7fa

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    move-wide/from16 v3, v27

    move-object/from16 v23, p2

    invoke-static/range {v1 .. v26}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    iget-object v1, v0, LMe/i$a;->a:LMe/g;

    invoke-virtual {v1}, LMe/g;->c()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LDe/g;

    move-object/from16 v3, p2

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, LDe/g;->c(LT/l;I)V

    goto :goto_3

    :cond_5
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    :goto_4
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/A;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LMe/i$a;->a(Lz/A;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
