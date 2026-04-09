.class final LRi/k;
.super LIi/J;
.source "SourceFile"


# static fields
.field public static final c:LRi/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LRi/k;

    invoke-direct {v0}, LRi/k;-><init>()V

    sput-object v0, LRi/k;->c:LRi/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LIi/J;-><init>()V

    return-void
.end method


# virtual methods
.method public Y(Ldh/i;Ljava/lang/Runnable;)V
    .locals 2

    sget-object p1, LRi/c;->i:LRi/c;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, LRi/f;->q0(Ljava/lang/Runnable;ZZ)V

    return-void
.end method

.method public b0(Ldh/i;Ljava/lang/Runnable;)V
    .locals 1

    sget-object p1, LRi/c;->i:LRi/c;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0, v0}, LRi/f;->q0(Ljava/lang/Runnable;ZZ)V

    return-void
.end method

.method public n0(ILjava/lang/String;)LIi/J;
    .locals 1

    invoke-static {p1}, LNi/k;->a(I)V

    sget v0, LRi/j;->d:I

    if-lt p1, v0, :cond_0

    invoke-static {p0, p2}, LNi/k;->b(LIi/J;Ljava/lang/String;)LIi/J;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-super {p0, p1, p2}, LIi/J;->n0(ILjava/lang/String;)LIi/J;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.IO"

    return-object v0
.end method
