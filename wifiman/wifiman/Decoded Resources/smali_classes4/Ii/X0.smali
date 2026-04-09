.class public final LIi/X0;
.super LIi/J;
.source "SourceFile"


# static fields
.field public static final c:LIi/X0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LIi/X0;

    invoke-direct {v0}, LIi/X0;-><init>()V

    sput-object v0, LIi/X0;->c:LIi/X0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LIi/J;-><init>()V

    return-void
.end method


# virtual methods
.method public Y(Ldh/i;Ljava/lang/Runnable;)V
    .locals 0

    sget-object p2, LIi/b1;->c:LIi/b1$a;

    invoke-interface {p1, p2}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p1

    check-cast p1, LIi/b1;

    if-eqz p1, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p1, LIi/b1;->b:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m0(Ldh/i;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public n0(ILjava/lang/String;)LIi/J;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "limitedParallelism is not supported for Dispatchers.Unconfined"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Unconfined"

    return-object v0
.end method
