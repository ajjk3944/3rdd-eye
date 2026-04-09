.class public final Lc9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc9/a;


# instance fields
.field private volatile a:S


# direct methods
.method private constructor <init>(S)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-short p1, p0, Lc9/b;->a:S

    return-void
.end method

.method public synthetic constructor <init>(SILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    const/4 p2, 0x0

    .line 4
    invoke-direct {p0, p1, p2}, Lc9/b;-><init>(SLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(SLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc9/b;-><init>(S)V

    return-void
.end method


# virtual methods
.method public a()S
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-short v0, p0, Lc9/b;->a:S
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-short v1, p0, Lc9/b;->a:S

    add-int/lit8 v1, v1, 0x1

    int-to-short v1, v1

    invoke-static {v1}, LYg/H;->b(S)S

    move-result v1

    iput-short v1, p0, Lc9/b;->a:S
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_2
    iget-short v1, p0, Lc9/b;->a:S

    add-int/lit8 v1, v1, 0x1

    int-to-short v1, v1

    invoke-static {v1}, LYg/H;->b(S)S

    move-result v1

    iput-short v1, p0, Lc9/b;->a:S

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    monitor-exit p0

    throw v0
.end method

.method public b()S
    .locals 1

    iget-short v0, p0, Lc9/b;->a:S

    return v0
.end method
