.class public final Landroidx/compose/ui/platform/I1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/compose/ui/platform/I1;

.field private static final b:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/platform/I1;

    invoke-direct {v0}, Landroidx/compose/ui/platform/I1;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/I1;->a:Landroidx/compose/ui/platform/I1;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Landroidx/compose/ui/platform/H1;->a:Landroidx/compose/ui/platform/H1$a;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/H1$a;->c()Landroidx/compose/ui/platform/H1;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Landroidx/compose/ui/platform/I1;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/platform/I1;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)LT/N0;
    .locals 7

    sget-object v0, Landroidx/compose/ui/platform/I1;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/H1;

    invoke-interface {v0, p1}, Landroidx/compose/ui/platform/H1;->a(Landroid/view/View;)LT/N0;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/compose/ui/platform/J1;->i(Landroid/view/View;LT/q;)V

    sget-object v1, LIi/s0;->a:LIi/s0;

    invoke-virtual {p1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v2

    const-string v3, "windowRecomposer cleanup"

    invoke-static {v2, v3}, LJi/i;->g(Landroid/os/Handler;Ljava/lang/String;)LJi/g;

    move-result-object v2

    invoke-virtual {v2}, LJi/g;->r0()LJi/g;

    move-result-object v2

    new-instance v4, Landroidx/compose/ui/platform/I1$b;

    const/4 v3, 0x0

    invoke-direct {v4, v0, p1, v3}, Landroidx/compose/ui/platform/I1$b;-><init>(LT/N0;Landroid/view/View;Ldh/e;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object v1

    new-instance v2, Landroidx/compose/ui/platform/I1$a;

    invoke-direct {v2, v1}, Landroidx/compose/ui/platform/I1$a;-><init>(LIi/y0;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-object v0
.end method
