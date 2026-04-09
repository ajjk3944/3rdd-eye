.class public final Laj/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXi/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laj/s;->f(Lmh/a;)LXi/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:LYg/m;


# direct methods
.method constructor <init>(Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Laj/s$a;->a:LYg/m;

    return-void
.end method

.method private final b()LXi/f;
    .locals 1

    iget-object v0, p0, Laj/s$a;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXi/f;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Laj/s$a;->b()LXi/f;

    move-result-object v0

    invoke-interface {v0}, LXi/f;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;)I
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Laj/s$a;->b()LXi/f;

    move-result-object v0

    invoke-interface {v0, p1}, LXi/f;->d(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public e()I
    .locals 1

    invoke-direct {p0}, Laj/s$a;->b()LXi/f;

    move-result-object v0

    invoke-interface {v0}, LXi/f;->e()I

    move-result v0

    return v0
.end method

.method public f(I)Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Laj/s$a;->b()LXi/f;

    move-result-object v0

    invoke-interface {v0, p1}, LXi/f;->f(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public g(I)Ljava/util/List;
    .locals 1

    invoke-direct {p0}, Laj/s$a;->b()LXi/f;

    move-result-object v0

    invoke-interface {v0, p1}, LXi/f;->g(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public h()LXi/m;
    .locals 1

    invoke-direct {p0}, Laj/s$a;->b()LXi/f;

    move-result-object v0

    invoke-interface {v0}, LXi/f;->h()LXi/m;

    move-result-object v0

    return-object v0
.end method

.method public i(I)LXi/f;
    .locals 1

    invoke-direct {p0}, Laj/s$a;->b()LXi/f;

    move-result-object v0

    invoke-interface {v0, p1}, LXi/f;->i(I)LXi/f;

    move-result-object p1

    return-object p1
.end method

.method public j(I)Z
    .locals 1

    invoke-direct {p0}, Laj/s$a;->b()LXi/f;

    move-result-object v0

    invoke-interface {v0, p1}, LXi/f;->j(I)Z

    move-result p1

    return p1
.end method
