.class public final LF3/U;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ls3/v;

.field private final b:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v0, -0x1

    invoke-direct {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p2, p0, LF3/U;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {}, Ls3/w;->a()Ls3/w$a;

    move-result-object p2

    const-string v0, "mlkit:vision"

    invoke-virtual {p2, v0}, Ls3/w$a;->b(Ljava/lang/String;)Ls3/w$a;

    move-result-object p2

    invoke-virtual {p2}, Ls3/w$a;->a()Ls3/w;

    move-result-object p2

    invoke-static {p1, p2}, Ls3/u;->b(Landroid/content/Context;Ls3/w;)Ls3/v;

    move-result-object p1

    iput-object p1, p0, LF3/U;->a:Ls3/v;

    return-void
.end method

.method public static a(Landroid/content/Context;)LF3/U;
    .locals 2

    new-instance v0, LF3/U;

    const-string v1, "mlkit:vision"

    invoke-direct {v0, p0, v1}, LF3/U;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method
