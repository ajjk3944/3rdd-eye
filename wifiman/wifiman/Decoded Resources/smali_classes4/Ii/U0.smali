.class public final LIi/U0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LIi/U0;

.field private static final b:Ljava/lang/ThreadLocal;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LIi/U0;

    invoke-direct {v0}, LIi/U0;-><init>()V

    sput-object v0, LIi/U0;->a:LIi/U0;

    new-instance v0, LNi/C;

    const-string v1, "ThreadLocalEventLoop"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, LNi/K;->a(LNi/C;)Ljava/lang/ThreadLocal;

    move-result-object v0

    sput-object v0, LIi/U0;->b:Ljava/lang/ThreadLocal;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LIi/i0;
    .locals 1

    sget-object v0, LIi/U0;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LIi/i0;

    return-object v0
.end method

.method public final b()LIi/i0;
    .locals 2

    sget-object v0, LIi/U0;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LIi/i0;

    if-nez v1, :cond_0

    invoke-static {}, LIi/l0;->a()LIi/i0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public final c()V
    .locals 2

    sget-object v0, LIi/U0;->b:Ljava/lang/ThreadLocal;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final d(LIi/i0;)V
    .locals 1

    sget-object v0, LIi/U0;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
