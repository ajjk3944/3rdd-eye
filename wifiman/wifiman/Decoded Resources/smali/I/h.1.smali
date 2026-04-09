.class final LI/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LI/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI/h;

    invoke-direct {v0}, LI/h;-><init>()V

    sput-object v0, LI/h;->a:LI/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/util/function/IntConsumer;I)V
    .locals 0

    invoke-static {p0, p1}, LI/h;->c(Ljava/util/function/IntConsumer;I)V

    return-void
.end method

.method private static final c(Ljava/util/function/IntConsumer;I)V
    .locals 0

    invoke-interface {p0, p1}, Ljava/util/function/IntConsumer;->accept(I)V

    return-void
.end method


# virtual methods
.method public final b(LF/E;LM/G;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/ui/platform/w1;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;Lmh/l;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF/E;",
            "LM/G;",
            "Landroid/view/inputmethod/HandwritingGesture;",
            "Landroidx/compose/ui/platform/w1;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/function/IntConsumer;",
            "Lmh/l;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_0

    sget-object v0, LI/E0;->a:LI/E0;

    move-object v1, p1

    move-object v2, p3

    move-object v3, p2

    move-object v4, p4

    move-object v5, p7

    invoke-virtual/range {v0 .. v5}, LI/E0;->l(LF/E;Landroid/view/inputmethod/HandwritingGesture;LM/G;Landroidx/compose/ui/platform/w1;Lmh/l;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    :goto_0
    if-nez p6, :cond_1

    return-void

    :cond_1
    if-eqz p5, :cond_2

    new-instance p2, LI/g;

    invoke-direct {p2, p6, p1}, LI/g;-><init>(Ljava/util/function/IntConsumer;I)V

    invoke-interface {p5, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_2
    invoke-interface {p6, p1}, Ljava/util/function/IntConsumer;->accept(I)V

    :goto_1
    return-void
.end method

.method public final d(LF/E;LM/G;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, LI/E0;->a:LI/E0;

    invoke-virtual {v0, p1, p3, p2, p4}, LI/E0;->D(LF/E;Landroid/view/inputmethod/PreviewableHandwritingGesture;LM/G;Landroid/os/CancellationSignal;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
