.class final Lcom/ui/wifiman/ui/signal/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/ui/signal/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/ui/signal/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/ui/signal/a$a;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/signal/a$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/signal/a$a;->a:Lcom/ui/wifiman/ui/signal/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LTe/E;LT/l;I)V
    .locals 19

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v15, p3

    const-string v2, "itemModifier"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "item"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_4

    and-int/lit8 v3, p4, 0x40

    if-nez v3, :cond_2

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_2

    :cond_2
    invoke-interface {v15, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    :goto_2
    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v2, v3

    :cond_4
    and-int/lit16 v3, v2, 0x93

    const/16 v4, 0x92

    if-ne v3, v4, :cond_6

    invoke-interface/range {p3 .. p3}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface/range {p3 .. p3}, LT/l;->C()V

    goto :goto_5

    :cond_6
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_7

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.signal.ComposableSingletons$SignalTabPlaceDetailUiKt.lambda-1.<anonymous> (SignalTabPlaceDetailUi.kt:66)"

    const v5, 0x6b6f8b86

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    instance-of v3, v1, LTe/E$a;

    if-eqz v3, :cond_9

    move-object v3, v1

    check-cast v3, LTe/E$a;

    invoke-virtual {v3}, LTe/E$a;->a()Ls9/d;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v1, v15, v4}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, LTe/E$a;->b()Ls9/d;

    move-result-object v3

    invoke-static {v3, v15, v4}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v3

    and-int/lit8 v16, v2, 0xe

    const/16 v17, 0x0

    const/16 v18, 0x7ff4

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v0, p1

    move-object/from16 v15, p3

    invoke-static/range {v0 .. v18}, LF9/r0;->f(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm0/v0;ILs9/b;Lm0/v0;LF9/k;ZLjava/lang/String;Lmh/a;Lmh/a;Lmh/a;Ls9/a;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_5
    return-void

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LTe/E;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/signal/a$a;->a(Landroidx/compose/ui/e;LTe/E;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
