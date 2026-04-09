.class public final Luj/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luj/e;


# instance fields
.field private final a:Lorg/kodein/type/q;

.field private final b:Lorg/kodein/type/q;

.field private final c:Lorg/kodein/type/q;

.field private final d:Lmh/p;


# direct methods
.method public constructor <init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/p;)V
    .locals 1

    const-string v0, "contextType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "argType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luj/g;->a:Lorg/kodein/type/q;

    iput-object p2, p0, Luj/g;->b:Lorg/kodein/type/q;

    iput-object p3, p0, Luj/g;->c:Lorg/kodein/type/q;

    iput-object p4, p0, Luj/g;->d:Lmh/p;

    return-void
.end method

.method public static final synthetic k(Luj/g;)Lmh/p;
    .locals 0

    iget-object p0, p0, Luj/g;->d:Lmh/p;

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Luj/e$b;->b(Luj/e;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Lorg/kodein/type/q;
    .locals 1

    iget-object v0, p0, Luj/g;->a:Lorg/kodein/type/q;

    return-object v0
.end method

.method public c()Luj/q;
    .locals 1

    invoke-static {p0}, Luj/e$b;->d(Luj/e;)Luj/q;

    move-result-object v0

    return-object v0
.end method

.method public d()Lorg/kodein/type/q;
    .locals 1

    iget-object v0, p0, Luj/g;->b:Lorg/kodein/type/q;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Luj/e$b;->a(Luj/e;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Luj/e$b;->c(Luj/e;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Z
    .locals 1

    invoke-static {p0}, Luj/e$b;->e(Luj/e;)Z

    move-result v0

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "factory"

    return-object v0
.end method

.method public i(Lorg/kodein/di/DI$e;Luj/b;)Lmh/l;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "di"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Luj/g$a;

    invoke-direct {p1, p0, p2}, Luj/g$a;-><init>(Luj/g;Luj/b;)V

    return-object p1
.end method

.method public j()Lorg/kodein/type/q;
    .locals 1

    iget-object v0, p0, Luj/g;->c:Lorg/kodein/type/q;

    return-object v0
.end method
