.class public LM6/r;
.super LM6/p;
.source "SourceFile"


# instance fields
.field final b:LN6/f;

.field private final c:LN6/a;

.field private final d:LQ6/g;

.field final e:LN6/e;

.field private final f:[LQ6/d;

.field private g:Lgg/t;


# direct methods
.method public constructor <init>(LP6/G;LN6/f;LN6/a;LQ6/g;LN6/e;[LQ6/d;)V
    .locals 0

    invoke-direct {p0, p1}, LM6/p;-><init>(LP6/G;)V

    iput-object p2, p0, LM6/r;->b:LN6/f;

    iput-object p4, p0, LM6/r;->d:LQ6/g;

    iput-object p5, p0, LM6/r;->e:LN6/e;

    iput-object p6, p0, LM6/r;->f:[LQ6/d;

    iput-object p3, p0, LM6/r;->c:LN6/a;

    const/4 p1, 0x0

    iput-object p1, p0, LM6/r;->g:Lgg/t;

    return-void
.end method

.method static synthetic j(LM6/r;)Lgg/t;
    .locals 0

    iget-object p0, p0, LM6/r;->g:Lgg/t;

    return-object p0
.end method

.method static n(I)I
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x5

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    if-eq p0, v1, :cond_0

    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/Object;

    const-string/jumbo v0, "Encountered unknown scanning error code: %d -> check android.bluetooth.le.ScanCallback"

    invoke-static {v0, p0}, LI6/q;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    const p0, 0x7fffffff

    return p0

    :cond_0
    const/16 p0, 0x9

    return p0

    :cond_1
    const/16 p0, 0x8

    return p0

    :cond_2
    const/4 p0, 0x7

    return p0

    :cond_3
    const/4 p0, 0x6

    return p0

    :cond_4
    return v1
.end method


# virtual methods
.method bridge synthetic d(Lgg/t;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LM6/r;->l(Lgg/t;)Landroid/bluetooth/le/ScanCallback;

    move-result-object p1

    return-object p1
.end method

.method bridge synthetic g(LP6/G;Ljava/lang/Object;)Z
    .locals 0

    check-cast p2, Landroid/bluetooth/le/ScanCallback;

    invoke-virtual {p0, p1, p2}, LM6/r;->p(LP6/G;Landroid/bluetooth/le/ScanCallback;)Z

    move-result p1

    return p1
.end method

.method bridge synthetic h(LP6/G;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Landroid/bluetooth/le/ScanCallback;

    invoke-virtual {p0, p1, p2}, LM6/r;->r(LP6/G;Landroid/bluetooth/le/ScanCallback;)V

    return-void
.end method

.method l(Lgg/t;)Landroid/bluetooth/le/ScanCallback;
    .locals 0

    iput-object p1, p0, LM6/r;->g:Lgg/t;

    new-instance p1, LM6/r$a;

    invoke-direct {p1, p0}, LM6/r$a;-><init>(LM6/r;)V

    return-object p1
.end method

.method p(LP6/G;Landroid/bluetooth/le/ScanCallback;)Z
    .locals 3

    iget-object v0, p0, LM6/r;->e:LN6/e;

    invoke-virtual {v0}, LN6/e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string/jumbo v1, "No library side filtering \u2014> debug logs of scanned devices disabled"

    invoke-static {v1, v0}, LI6/q;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, LM6/r;->c:LN6/a;

    iget-object v1, p0, LM6/r;->f:[LQ6/d;

    invoke-virtual {v0, v1}, LN6/a;->c([LQ6/d;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, LM6/r;->c:LN6/a;

    iget-object v2, p0, LM6/r;->d:LQ6/g;

    invoke-virtual {v1, v2}, LN6/a;->d(LQ6/g;)Landroid/bluetooth/le/ScanSettings;

    move-result-object v1

    invoke-virtual {p1, v0, v1, p2}, LP6/G;->d(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V

    const/4 p1, 0x1

    return p1
.end method

.method r(LP6/G;Landroid/bluetooth/le/ScanCallback;)V
    .locals 0

    invoke-virtual {p1, p2}, LP6/G;->f(Landroid/bluetooth/le/ScanCallback;)V

    iget-object p1, p0, LM6/r;->g:Lgg/t;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lgg/h;->a()V

    const/4 p1, 0x0

    iput-object p1, p0, LM6/r;->g:Lgg/t;

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, LM6/r;->f:[LQ6/d;

    if-eqz v0, :cond_1

    array-length v0, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iget-object v1, p0, LM6/r;->e:LN6/e;

    invoke-virtual {v1}, LN6/e;->a()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "ScanOperationApi21{"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ""

    if-eqz v0, :cond_2

    move-object v4, v3

    goto :goto_2

    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ANY_MUST_MATCH -> nativeFilters="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, LM6/r;->f:[LQ6/d;

    invoke-static {v5}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_2
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v0, :cond_3

    if-nez v1, :cond_3

    const-string v0, " and then "

    goto :goto_3

    :cond_3
    move-object v0, v3

    :goto_3
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_4

    goto :goto_4

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ANY_MUST_MATCH -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM6/r;->e:LN6/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_4
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
