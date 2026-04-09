.class final LEe/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEe/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LEe/a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LEe/a$d;

    invoke-direct {v0}, LEe/a$d;-><init>()V

    sput-object v0, LEe/a$d;->a:LEe/a$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()LYg/J;
    .locals 1

    invoke-static {}, LEe/a$d;->c()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method private static final c()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 4

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

    const-string v1, "com.ui.wifiman.ui.component.list.ComposableSingletons$LazyColumnCardKt.lambda-4.<anonymous> (LazyColumnCard.kt:449)"

    const v2, 0x556cf267

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    new-instance v0, LEe/f$c;

    new-instance v1, Ls9/d$c;

    const-string v2, "Title"

    invoke-direct {v1, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v2, LEe/f$c$a$a;

    sget-object v3, LPe/a;->a:LPe/a;

    invoke-virtual {v3}, LPe/a;->f()Ls9/b;

    move-result-object v3

    invoke-direct {v2, v3}, LEe/f$c$a$a;-><init>(Ls9/b;)V

    const-string v3, ""

    invoke-direct {v0, v3, v1, v2}, LEe/f$c;-><init>(Ljava/lang/String;Ls9/d;LEe/f$c$a;)V

    const v1, -0x77fc47a

    invoke-interface {p1, v1}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_3

    new-instance v1, LEe/b;

    invoke-direct {v1}, LEe/b;-><init>()V

    invoke-interface {p1, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v1, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    const/16 v2, 0x1b6

    invoke-static {p2, v0, v1, p1, v2}, LEe/z;->R(Landroidx/compose/ui/e;LEe/f$c;Lmh/a;LT/l;I)V

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

    invoke-virtual {p0, p1, p2}, LEe/a$d;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
