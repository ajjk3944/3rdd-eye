.class final Lw/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/m;


# instance fields
.field private final a:Lmh/l;

.field private final b:Lw/k;

.field private final c:Ls/M;


# direct methods
.method public constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/g;->a:Lmh/l;

    new-instance p1, Lw/g$b;

    invoke-direct {p1, p0}, Lw/g$b;-><init>(Lw/g;)V

    iput-object p1, p0, Lw/g;->b:Lw/k;

    new-instance p1, Ls/M;

    invoke-direct {p1}, Ls/M;-><init>()V

    iput-object p1, p0, Lw/g;->c:Ls/M;

    return-void
.end method

.method public static final synthetic c(Lw/g;)Lw/k;
    .locals 0

    iget-object p0, p0, Lw/g;->b:Lw/k;

    return-object p0
.end method

.method public static final synthetic d(Lw/g;)Ls/M;
    .locals 0

    iget-object p0, p0, Lw/g;->c:Ls/M;

    return-object p0
.end method


# virtual methods
.method public a(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lw/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lw/g$a;-><init>(Lw/g;Ls/L;Lmh/p;Ldh/e;)V

    invoke-static {v0, p3}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final e()Lmh/l;
    .locals 1

    iget-object v0, p0, Lw/g;->a:Lmh/l;

    return-object v0
.end method
