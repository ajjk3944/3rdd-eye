.class public final Lbj/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LZi/E;

.field private b:Z


# direct methods
.method public constructor <init>(LXi/f;)V
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LZi/E;

    new-instance v1, Lbj/q$a;

    invoke-direct {v1, p0}, Lbj/q$a;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, p1, v1}, LZi/E;-><init>(LXi/f;Lmh/p;)V

    iput-object v0, p0, Lbj/q;->a:LZi/E;

    return-void
.end method

.method public static final synthetic a(Lbj/q;LXi/f;I)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lbj/q;->e(LXi/f;I)Z

    move-result p0

    return p0
.end method

.method private final e(LXi/f;I)Z
    .locals 1

    invoke-interface {p1, p2}, LXi/f;->j(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, LXi/f;->i(I)LXi/f;

    move-result-object p1

    invoke-interface {p1}, LXi/f;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lbj/q;->b:Z

    return p1
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lbj/q;->b:Z

    return v0
.end method

.method public final c(I)V
    .locals 1

    iget-object v0, p0, Lbj/q;->a:LZi/E;

    invoke-virtual {v0, p1}, LZi/E;->a(I)V

    return-void
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, Lbj/q;->a:LZi/E;

    invoke-virtual {v0}, LZi/E;->d()I

    move-result v0

    return v0
.end method
