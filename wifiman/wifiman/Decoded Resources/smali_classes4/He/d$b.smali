.class final LHe/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHe/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LHe/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LHe/d$b;

    invoke-direct {v0}, LHe/d$b;-><init>()V

    sput-object v0, LHe/d$b;->a:LHe/d$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 11

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.component.toolbar.ComposableSingletons$WifimanToolbarNetworkKt.lambda-2.<anonymous> (WifimanToolbarNetwork.kt:48)"

    const v2, 0x7aa9f363

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v4, Lof/a;->a:Lof/a;

    const/16 v9, 0xf

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lof/f;->l(Lof/a;Ls9/c;Lof/a$a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lof/a$c;

    move-result-object v4

    sget-object p2, Lcom/ui/wifiman/ui/component/network/c;->a:Lcom/ui/wifiman/ui/component/network/c;

    invoke-static {p2}, Lcom/ui/wifiman/ui/component/network/g;->i(Lcom/ui/wifiman/ui/component/network/c;)Lcom/ui/wifiman/ui/component/network/c$b;

    move-result-object v5

    const/4 v8, 0x6

    const/16 v9, 0x8

    move-object v7, p1

    invoke-static/range {v3 .. v9}, LHe/C;->b(Landroidx/compose/ui/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;Lmh/q;LT/l;II)V

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

    invoke-virtual {p0, p1, p2}, LHe/d$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
