.class final LTe/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTe/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LTe/j$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LTe/j$b;

    invoke-direct {v0}, LTe/j$b;-><init>()V

    sput-object v0, LTe/j$b;->a:LTe/j$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.signal.components.ComposableSingletons$SignalTabConnectionStatsBarKt.lambda-2.<anonymous> (SignalTabConnectionStatsBar.kt:219)"

    const v2, -0x59fd3276

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p2, v0, v1, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    new-instance v0, LTe/l0;

    sget-object v1, LS8/c;->GHZ_2_4:LS8/c;

    sget-object v3, LS8/l;->f:LS8/l$a;

    const/16 v4, -0x2a

    invoke-virtual {v3, v4}, LS8/l$a;->a(I)LS8/l;

    move-result-object v4

    new-instance v5, LW7/b;

    sget-object v6, LW7/a;->b:LW7/a$a;

    const/16 v7, 0x64

    invoke-virtual {v6, v7}, LW7/a$a;->d(I)LW7/a;

    move-result-object v8

    invoke-virtual {v6, v7}, LW7/a$a;->d(I)LW7/a;

    move-result-object v9

    invoke-direct {v5, v8, v9}, LW7/b;-><init>(LW7/a;LW7/a;)V

    new-instance v8, LTe/l0$a;

    invoke-direct {v8, v1, v4, v2, v5}, LTe/l0$a;-><init>(LS8/c;LS8/l;LS8/d;LW7/b;)V

    invoke-static {v1, v8}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    sget-object v4, LS8/c;->GHZ_5:LS8/c;

    const/16 v5, -0x63

    invoke-virtual {v3, v5}, LS8/l$a;->a(I)LS8/l;

    move-result-object v3

    new-instance v5, LW7/b;

    invoke-virtual {v6, v7}, LW7/a$a;->d(I)LW7/a;

    move-result-object v8

    invoke-virtual {v6, v7}, LW7/a$a;->d(I)LW7/a;

    move-result-object v9

    invoke-direct {v5, v8, v9}, LW7/b;-><init>(LW7/a;LW7/a;)V

    sget-object v8, LS8/d;->MHZ_160:LS8/d;

    new-instance v9, LTe/l0$a;

    invoke-direct {v9, v4, v3, v8, v5}, LTe/l0$a;-><init>(LS8/c;LS8/l;LS8/d;LW7/b;)V

    invoke-static {v4, v9}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v3

    sget-object v4, LS8/c;->GHZ_6:LS8/c;

    new-instance v5, LW7/b;

    invoke-virtual {v6, v7}, LW7/a$a;->d(I)LW7/a;

    move-result-object v8

    invoke-virtual {v6, v7}, LW7/a$a;->d(I)LW7/a;

    move-result-object v6

    invoke-direct {v5, v8, v6}, LW7/b;-><init>(LW7/a;LW7/a;)V

    sget-object v6, LS8/d;->MHZ_20:LS8/d;

    new-instance v7, LTe/l0$a;

    invoke-direct {v7, v4, v2, v6, v5}, LTe/l0$a;-><init>(LS8/c;LS8/l;LS8/d;LW7/b;)V

    invoke-static {v4, v7}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v2

    filled-new-array {v1, v3, v2}, [LYg/s;

    move-result-object v1

    invoke-static {v1}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, LCi/a;->j(Ljava/util/Map;)LCi/d;

    move-result-object v1

    invoke-direct {v0, v1}, LTe/l0;-><init>(LCi/d;)V

    const/4 v1, 0x6

    invoke-static {p2, v0, p1, v1}, LTe/w0;->o(Landroidx/compose/ui/e;LTe/l0;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LTe/j$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
