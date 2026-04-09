.class final Lbf/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbf/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lbf/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbf/b$d;

    invoke-direct {v0}, Lbf/b$d;-><init>()V

    sput-object v0, Lbf/b$d;->a:Lbf/b$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0}, Lbf/b$d;->c(Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljava/lang/String;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 12

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

    const-string v1, "com.ui.wifiman.ui.speed.hosts.ComposableSingletons$NetworkHostListItemKt.lambda-4.<anonymous> (NetworkHostListItem.kt:235)"

    const v2, 0x2f2a0d8f

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const/16 v10, 0x3f

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v11}, Lbf/i;->i(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;ZLb8/b;ILjava/lang/Object;)Lbf/e;

    move-result-object v4

    const p2, 0x44837c0e

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_3

    new-instance p2, Lbf/d;

    invoke-direct {p2}, Lbf/d;-><init>()V

    invoke-interface {p1, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v7, p2

    check-cast v7, Lmh/l;

    invoke-interface {p1}, LT/l;->J()V

    const/16 v9, 0x6186

    const/16 v10, 0x8

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v8, p1

    invoke-static/range {v3 .. v10}, Lbf/i;->e(Landroidx/compose/ui/e;Lbf/e;ZLbf/a;Lmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lbf/b$d;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
