.class Lbg/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field static e:Z

.field static final f:Lbg/f$c;


# instance fields
.field a:[[Lbg/f$b;

.field b:Lbg/f$b;

.field c:Lbg/f$c;

.field d:Lbg/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbg/f$c;

    const/4 v1, 0x0

    new-array v1, v1, [Lbg/f$a;

    invoke-direct {v0, v1}, Lbg/f$c;-><init>([Lbg/f$a;)V

    sput-object v0, Lbg/f$b;->f:Lbg/f$c;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x8

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lbg/f$b;-><init>(Lbg/f$b;ILbg/f$a;)V

    .line 2
    sget-object v0, Lbg/f$b;->f:Lbg/f$c;

    iput-object v0, p0, Lbg/f$b;->c:Lbg/f$c;

    return-void
.end method

.method private constructor <init>(Lbg/f$b;ILbg/f$a;)V
    .locals 3

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p2, :cond_0

    .line 4
    new-array v0, p2, [[Lbg/f$b;

    iput-object v0, p0, Lbg/f$b;->a:[[Lbg/f$b;

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    .line 5
    iget-object v1, p0, Lbg/f$b;->a:[[Lbg/f$b;

    sub-int v2, p2, v0

    new-array v2, v2, [Lbg/f$b;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6
    :cond_0
    iput-object p1, p0, Lbg/f$b;->b:Lbg/f$b;

    .line 7
    iput-object p3, p0, Lbg/f$b;->d:Lbg/f$a;

    return-void
.end method

.method private c([Lbg/f$a;I)V
    .locals 1

    add-int/lit8 p2, p2, -0x1

    iget-object v0, p0, Lbg/f$b;->d:Lbg/f$a;

    aput-object v0, p1, p2

    if-lez p2, :cond_0

    iget-object v0, p0, Lbg/f$b;->b:Lbg/f$b;

    invoke-direct {v0, p1, p2}, Lbg/f$b;->c([Lbg/f$a;I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(III)Lbg/f$b;
    .locals 7

    sub-int v0, p1, p2

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v1, p3, -0x1

    iget-object v2, p0, Lbg/f$b;->a:[[Lbg/f$b;

    aget-object v2, v2, v0

    aget-object v2, v2, v1

    if-nez v2, :cond_3

    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lbg/f$b;->a:[[Lbg/f$b;

    aget-object v2, v2, v0

    aget-object v2, v2, v1

    if-nez v2, :cond_2

    add-int/lit8 p2, p2, 0x1

    const/16 v2, 0x8

    rsub-int/lit8 p2, p2, 0x8

    sget-object v3, Lbg/f;->l:Lbg/f$b;

    if-ne p0, v3, :cond_0

    new-instance v2, Lbg/f$a;

    invoke-direct {v2, p1, p3}, Lbg/f$a;-><init>(II)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v4, v3, Lbg/f$b;->a:[[Lbg/f$b;

    aget-object v4, v4, p1

    aget-object v5, v4, v1

    if-nez v5, :cond_1

    new-instance v5, Lbg/f$b;

    new-instance v6, Lbg/f$a;

    invoke-direct {v6, p1, p3}, Lbg/f$a;-><init>(II)V

    invoke-direct {v5, v3, v2, v6}, Lbg/f$b;-><init>(Lbg/f$b;ILbg/f$a;)V

    aput-object v5, v4, v1

    move-object v2, v6

    goto :goto_0

    :cond_1
    iget-object v2, v5, Lbg/f$b;->d:Lbg/f$a;

    :goto_0
    iget-object p1, p0, Lbg/f$b;->a:[[Lbg/f$b;

    aget-object p1, p1, v0

    new-instance p3, Lbg/f$b;

    invoke-direct {p3, p0, p2, v2}, Lbg/f$b;-><init>(Lbg/f$b;ILbg/f$a;)V

    aput-object p3, p1, v1

    move-object v2, p3

    :cond_2
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_3
    :goto_2
    return-object v2
.end method

.method public b()Lbg/f$c;
    .locals 3

    iget-object v0, p0, Lbg/f$b;->c:Lbg/f$c;

    if-nez v0, :cond_2

    iget-object v0, p0, Lbg/f$b;->b:Lbg/f$b;

    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_0

    add-int/lit8 v1, v1, 0x1

    iget-object v0, v0, Lbg/f$b;->b:Lbg/f$b;

    goto :goto_0

    :cond_0
    new-array v0, v1, [Lbg/f$a;

    if-lez v1, :cond_1

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lbg/f$b;->d:Lbg/f$a;

    aput-object v2, v0, v1

    if-lez v1, :cond_1

    iget-object v2, p0, Lbg/f$b;->b:Lbg/f$b;

    invoke-direct {v2, v0, v1}, Lbg/f$b;->c([Lbg/f$a;I)V

    :cond_1
    new-instance v1, Lbg/f$c;

    invoke-direct {v1, v0}, Lbg/f$c;-><init>([Lbg/f$a;)V

    iput-object v1, p0, Lbg/f$b;->c:Lbg/f$c;

    move-object v0, v1

    :cond_2
    return-object v0
.end method

.method d(I)V
    .locals 7

    iget-object v0, p0, Lbg/f$b;->a:[[Lbg/f$b;

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lbg/f$b;->a:[[Lbg/f$b;

    array-length v3, v2

    if-ge v1, v3, :cond_2

    aget-object v2, v2, v1

    move v3, v0

    :goto_1
    array-length v4, v2

    if-ge v3, v4, :cond_1

    const/4 v4, -0x1

    if-ne p1, v4, :cond_0

    new-instance v4, Lbg/f$a;

    add-int v5, v1, p1

    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v6, v3, 0x1

    invoke-direct {v4, v5, v6}, Lbg/f$a;-><init>(II)V

    goto :goto_2

    :cond_0
    sget-object v4, Lbg/f;->l:Lbg/f$b;

    iget-object v4, v4, Lbg/f$b;->a:[[Lbg/f$b;

    add-int v5, v1, p1

    add-int/lit8 v5, v5, 0x1

    aget-object v4, v4, v5

    aget-object v4, v4, v3

    iget-object v4, v4, Lbg/f$b;->d:Lbg/f$a;

    :goto_2
    add-int v5, v1, p1

    add-int/2addr v5, v3

    add-int/lit8 v5, v5, 0x3

    rsub-int/lit8 v5, v5, 0x8

    new-instance v6, Lbg/f$b;

    invoke-direct {v6, p0, v5, v4}, Lbg/f$b;-><init>(Lbg/f$b;ILbg/f$a;)V

    invoke-virtual {v6}, Lbg/f$b;->b()Lbg/f$c;

    aput-object v6, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    move p1, v0

    :goto_3
    iget-object v1, p0, Lbg/f$b;->a:[[Lbg/f$b;

    array-length v2, v1

    if-ge p1, v2, :cond_4

    aget-object v1, v1, p1

    move v2, v0

    :goto_4
    array-length v3, v1

    if-ge v2, v3, :cond_3

    aget-object v3, v1, v2

    iget-object v4, v3, Lbg/f$b;->d:Lbg/f$a;

    iget v5, v4, Lbg/f$a;->a:I

    iget v4, v4, Lbg/f$a;->b:I

    add-int/2addr v5, v4

    invoke-virtual {v3, v5}, Lbg/f$b;->d(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_3
    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_4
    return-void
.end method
