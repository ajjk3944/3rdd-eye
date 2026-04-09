.class public final LRi/c;
.super LRi/f;
.source "SourceFile"


# static fields
.field public static final i:LRi/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LRi/c;

    invoke-direct {v0}, LRi/c;-><init>()V

    sput-object v0, LRi/c;->i:LRi/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 6

    sget v1, LRi/j;->c:I

    sget v2, LRi/j;->d:I

    sget-wide v3, LRi/j;->e:J

    sget-object v5, LRi/j;->a:Ljava/lang/String;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, LRi/f;-><init>(IIJLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Dispatchers.Default cannot be closed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public n0(ILjava/lang/String;)LIi/J;
    .locals 1

    invoke-static {p1}, LNi/k;->a(I)V

    sget v0, LRi/j;->c:I

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

    const-string v0, "Dispatchers.Default"

    return-object v0
.end method
