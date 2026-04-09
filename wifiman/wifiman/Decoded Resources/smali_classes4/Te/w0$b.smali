.class final LTe/w0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTe/w0;->o(Landroidx/compose/ui/e;LTe/l0;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LCi/c;


# direct methods
.method constructor <init>(LCi/c;)V
    .locals 0

    iput-object p1, p0, LTe/w0$b;->a:LCi/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(FFLT/l;I)V
    .locals 13

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    move v0, p1

    move-object/from16 v9, p3

    invoke-interface {v9, p1}, LT/l;->g(F)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p4, v1

    goto :goto_1

    :cond_1
    move v0, p1

    move-object/from16 v9, p3

    move/from16 v1, p4

    :goto_1
    and-int/lit16 v2, v1, 0x83

    const/16 v3, 0x82

    if-ne v2, v3, :cond_3

    invoke-interface/range {p3 .. p3}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p3 .. p3}, LT/l;->C()V

    move-object v12, p0

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.signal.components.SignalTabConnectionStatsBar.<anonymous>.<anonymous> (SignalTabConnectionStatsBar.kt:129)"

    const v4, -0x43d094e

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v2, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/layout/r;->r(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    new-instance v1, Ls9/d$b;

    sget v2, Lm8/c;->p2:I

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    move-object v12, p0

    iget-object v5, v12, LTe/w0$b;->a:LCi/c;

    const/4 v10, 0x0

    const/16 v11, 0x6c

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    move-object/from16 v9, p3

    invoke-static/range {v0 .. v11}, LTe/w0;->w(Landroidx/compose/ui/e;Ls9/d;LL0/U;JLCi/c;LL0/U;JLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_3
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LY0/h;

    invoke-virtual {p1}, LY0/h;->s()F

    move-result p1

    check-cast p2, LY0/h;

    invoke-virtual {p2}, LY0/h;->s()F

    move-result p2

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LTe/w0$b;->a(FFLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
