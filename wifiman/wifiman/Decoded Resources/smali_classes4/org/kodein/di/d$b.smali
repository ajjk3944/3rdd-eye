.class final Lorg/kodein/di/d$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/kodein/di/d;->b(Lorg/kodein/di/c;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Lmh/a;)Lrj/x2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/kodein/di/c;

.field final synthetic b:Lorg/kodein/type/q;

.field final synthetic c:Lorg/kodein/type/q;

.field final synthetic d:Ljava/lang/Object;

.field final synthetic e:Lmh/a;


# direct methods
.method constructor <init>(Lorg/kodein/di/c;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Lmh/a;)V
    .locals 0

    iput-object p1, p0, Lorg/kodein/di/d$b;->a:Lorg/kodein/di/c;

    iput-object p2, p0, Lorg/kodein/di/d$b;->b:Lorg/kodein/type/q;

    iput-object p3, p0, Lorg/kodein/di/d$b;->c:Lorg/kodein/type/q;

    iput-object p4, p0, Lorg/kodein/di/d$b;->d:Ljava/lang/Object;

    iput-object p5, p0, Lorg/kodein/di/d$b;->e:Lmh/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lorg/kodein/di/f;Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<anonymous parameter 1>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lorg/kodein/di/d$b;->a:Lorg/kodein/di/c;

    invoke-interface {p2}, Lorg/kodein/di/c;->d()Lorg/kodein/di/DI;

    move-result-object p2

    invoke-interface {p2}, Lorg/kodein/di/DI;->y()Lorg/kodein/di/e;

    move-result-object v0

    new-instance v1, Lorg/kodein/di/DI$e;

    invoke-interface {p1}, Lorg/kodein/di/f;->getType()Lorg/kodein/type/q;

    move-result-object p2

    const-string v2, "null cannot be cast to non-null type org.kodein.type.TypeToken<in kotlin.Any>"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lorg/kodein/di/d$b;->b:Lorg/kodein/type/q;

    iget-object v3, p0, Lorg/kodein/di/d$b;->c:Lorg/kodein/type/q;

    iget-object v4, p0, Lorg/kodein/di/d$b;->d:Ljava/lang/Object;

    invoke-direct {v1, p2, v2, v3, v4}, Lorg/kodein/di/DI$e;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;)V

    invoke-interface {p1}, Lorg/kodein/di/f;->getValue()Ljava/lang/Object;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lorg/kodein/di/e$b;->a(Lorg/kodein/di/e;Lorg/kodein/di/DI$e;Ljava/lang/Object;IILjava/lang/Object;)Lmh/l;

    move-result-object p1

    iget-object p2, p0, Lorg/kodein/di/d$b;->e:Lmh/a;

    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lorg/kodein/di/f;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lorg/kodein/di/d$b;->a(Lorg/kodein/di/f;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
