.class public final LE0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LE0/n;

.field private final b:LE0/n;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LE0/n;

    invoke-direct {v0, p1}, LE0/n;-><init>(Z)V

    iput-object v0, p0, LE0/o;->a:LE0/n;

    new-instance v0, LE0/n;

    invoke-direct {v0, p1}, LE0/n;-><init>(Z)V

    iput-object v0, p0, LE0/o;->b:LE0/n;

    return-void
.end method

.method public static final synthetic a(LE0/o;)LE0/n;
    .locals 0

    iget-object p0, p0, LE0/o;->a:LE0/n;

    return-object p0
.end method

.method public static final synthetic b(LE0/o;)LE0/n;
    .locals 0

    iget-object p0, p0, LE0/o;->b:LE0/n;

    return-object p0
.end method


# virtual methods
.method public final c(LE0/G;Z)V
    .locals 0

    if-eqz p2, :cond_0

    iget-object p2, p0, LE0/o;->a:LE0/n;

    invoke-virtual {p2, p1}, LE0/n;->a(LE0/G;)V

    iget-object p2, p0, LE0/o;->b:LE0/n;

    invoke-virtual {p2, p1}, LE0/n;->a(LE0/G;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, LE0/o;->a:LE0/n;

    invoke-virtual {p2, p1}, LE0/n;->b(LE0/G;)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, LE0/o;->b:LE0/n;

    invoke-virtual {p2, p1}, LE0/n;->a(LE0/G;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final d(LE0/G;)Z
    .locals 1

    iget-object v0, p0, LE0/o;->a:LE0/n;

    invoke-virtual {v0, p1}, LE0/n;->b(LE0/G;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LE0/o;->b:LE0/n;

    invoke-virtual {v0, p1}, LE0/n;->b(LE0/G;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final e(LE0/G;Z)Z
    .locals 1

    iget-object v0, p0, LE0/o;->a:LE0/n;

    invoke-virtual {v0, p1}, LE0/n;->b(LE0/G;)Z

    move-result v0

    if-eqz p2, :cond_0

    goto :goto_1

    :cond_0
    if-nez v0, :cond_2

    iget-object p2, p0, LE0/o;->b:LE0/n;

    invoke-virtual {p2, p1}, LE0/n;->b(LE0/G;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, LE0/o;->b:LE0/n;

    invoke-virtual {v0}, LE0/n;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LE0/o;->a:LE0/n;

    invoke-virtual {v0}, LE0/n;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final g(Z)Z
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, LE0/o;->a:LE0/n;

    :goto_0
    invoke-virtual {p1}, LE0/n;->d()Z

    move-result p1

    goto :goto_1

    :cond_0
    iget-object p1, p0, LE0/o;->b:LE0/n;

    goto :goto_0

    :goto_1
    return p1
.end method

.method public final h()Z
    .locals 1

    invoke-virtual {p0}, LE0/o;->f()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final i(LE0/G;)Z
    .locals 2

    iget-object v0, p0, LE0/o;->a:LE0/n;

    invoke-virtual {v0, p1}, LE0/n;->f(LE0/G;)Z

    move-result v0

    iget-object v1, p0, LE0/o;->b:LE0/n;

    invoke-virtual {v1, p1}, LE0/n;->f(LE0/G;)Z

    move-result p1

    if-nez p1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
