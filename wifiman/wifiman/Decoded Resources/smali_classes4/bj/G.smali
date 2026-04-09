.class public abstract Lbj/G;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    sget-object v0, LYg/C;->b:LYg/C$a;

    invoke-static {v0}, LWi/a;->y(LYg/C$a;)LVi/b;

    move-result-object v0

    invoke-interface {v0}, LVi/b;->a()LXi/f;

    move-result-object v0

    sget-object v1, LYg/E;->b:LYg/E$a;

    invoke-static {v1}, LWi/a;->z(LYg/E$a;)LVi/b;

    move-result-object v1

    invoke-interface {v1}, LVi/b;->a()LXi/f;

    move-result-object v1

    sget-object v2, LYg/A;->b:LYg/A$a;

    invoke-static {v2}, LWi/a;->x(LYg/A$a;)LVi/b;

    move-result-object v2

    invoke-interface {v2}, LVi/b;->a()LXi/f;

    move-result-object v2

    sget-object v3, LYg/H;->b:LYg/H$a;

    invoke-static {v3}, LWi/a;->A(LYg/H$a;)LVi/b;

    move-result-object v3

    invoke-interface {v3}, LVi/b;->a()LXi/f;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [LXi/f;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    invoke-static {v4}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lbj/G;->a:Ljava/util/Set;

    return-void
.end method

.method public static final a(LXi/f;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LXi/f;->isInline()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Laj/k;->j()LXi/f;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b(LXi/f;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LXi/f;->isInline()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lbj/G;->a:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
