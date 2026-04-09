.class final LZi/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/S0;


# instance fields
.field private final a:Lmh/l;

.field private final b:LZi/v;


# direct methods
.method public constructor <init>(Lmh/l;)V
    .locals 1

    const-string v0, "compute"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZi/t;->a:Lmh/l;

    new-instance p1, LZi/v;

    invoke-direct {p1}, LZi/v;-><init>()V

    iput-object p1, p0, LZi/t;->b:LZi/v;

    return-void
.end method


# virtual methods
.method public a(Lth/d;)LVi/b;
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZi/t;->b:LZi/v;

    invoke-static {p1}, Llh/a;->b(Lth/d;)Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1}, LZi/s;->a(LZi/v;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LZi/m0;

    iget-object v1, v0, LZi/m0;->a:Ljava/lang/ref/SoftReference;

    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, LZi/t$a;

    invoke-direct {v1, p0, p1}, LZi/t$a;-><init>(LZi/t;Lth/d;)V

    invoke-virtual {v0, v1}, LZi/m0;->a(Lmh/a;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    check-cast v1, LZi/m;

    iget-object p1, v1, LZi/m;->a:LVi/b;

    return-object p1
.end method

.method public final b()Lmh/l;
    .locals 1

    iget-object v0, p0, LZi/t;->a:Lmh/l;

    return-object v0
.end method
