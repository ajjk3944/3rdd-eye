.class public LN6/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN6/B;


# instance fields
.field private final a:LP6/G;

.field private final b:LN6/f;

.field private final c:LN6/y;

.field private final d:LN6/a;


# direct methods
.method constructor <init>(LP6/G;LN6/f;LN6/y;LN6/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN6/G;->a:LP6/G;

    iput-object p2, p0, LN6/G;->b:LN6/f;

    iput-object p3, p0, LN6/G;->c:LN6/y;

    iput-object p4, p0, LN6/G;->d:LN6/a;

    return-void
.end method

.method private static b([LQ6/d;)Z
    .locals 5

    array-length v0, p0

    const/4 v1, 0x1

    const/4 v2, 0x0

    move v3, v1

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v4, p0, v2

    invoke-virtual {v4}, LQ6/d;->b()Z

    move-result v4

    and-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    xor-int/lit8 p0, v3, 0x1

    return p0
.end method


# virtual methods
.method public varargs a(LQ6/g;[LQ6/d;)LN6/A;
    .locals 12

    invoke-static {p2}, LN6/G;->b([LQ6/d;)Z

    move-result v0

    invoke-virtual {p1}, LQ6/g;->b()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-static {}, LP6/E;->a()Lgg/w;

    move-result-object v4

    if-eqz v1, :cond_1

    if-nez v0, :cond_1

    const-string/jumbo v0, "ScanSettings.callbackType != CALLBACK_TYPE_ALL_MATCHES but no (or only empty) filters are specified. Falling back to callbackType emulation."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, v1}, LI6/q;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LN6/G;->c:LN6/y;

    invoke-virtual {p1}, LQ6/g;->b()I

    move-result v1

    invoke-virtual {v0, v1}, LN6/y;->a(I)Lgg/w;

    move-result-object v4

    invoke-virtual {p1, v3}, LQ6/g;->a(I)LQ6/g;

    move-result-object p1

    :cond_1
    move-object v9, p1

    new-instance p1, LN6/A;

    new-instance v0, LM6/r;

    iget-object v6, p0, LN6/G;->a:LP6/G;

    iget-object v7, p0, LN6/G;->b:LN6/f;

    iget-object v8, p0, LN6/G;->d:LN6/a;

    new-instance v10, LN6/e;

    new-array v1, v2, [LN6/p;

    invoke-direct {v10, v1}, LN6/e;-><init>([LN6/p;)V

    move-object v5, v0

    move-object v11, p2

    invoke-direct/range {v5 .. v11}, LM6/r;-><init>(LP6/G;LN6/f;LN6/a;LQ6/g;LN6/e;[LQ6/d;)V

    invoke-direct {p1, v0, v4}, LN6/A;-><init>(LM6/j;Lgg/w;)V

    return-object p1
.end method
