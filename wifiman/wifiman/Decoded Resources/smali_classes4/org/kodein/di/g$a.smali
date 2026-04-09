.class final Lorg/kodein/di/g$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/kodein/di/g;->a(Ljava/lang/Object;Lth/l;)LYg/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lorg/kodein/di/g;

.field final synthetic c:Lth/l;


# direct methods
.method constructor <init>(Ljava/lang/Object;Lorg/kodein/di/g;Lth/l;)V
    .locals 0

    iput-object p1, p0, Lorg/kodein/di/g$a;->a:Ljava/lang/Object;

    iput-object p2, p0, Lorg/kodein/di/g$a;->b:Lorg/kodein/di/g;

    iput-object p3, p0, Lorg/kodein/di/g$a;->c:Lth/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lorg/kodein/di/g$a;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/kodein/di/g$a;->b:Lorg/kodein/di/g;

    invoke-virtual {v0}, Lorg/kodein/di/g;->c()Lorg/kodein/di/f;

    move-result-object v0

    invoke-static {}, Lorg/kodein/di/d;->e()Lorg/kodein/di/f;

    move-result-object v1

    if-ne v0, v1, :cond_0

    sget-object v0, Lorg/kodein/di/f;->a:Lorg/kodein/di/f$a;

    iget-object v1, p0, Lorg/kodein/di/g$a;->a:Ljava/lang/Object;

    invoke-static {v1}, Lorg/kodein/type/s;->c(Ljava/lang/Object;)Lorg/kodein/type/q;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.TypeToken<in kotlin.Any>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lorg/kodein/di/g$a;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lorg/kodein/di/f$a;->a(Lorg/kodein/type/q;Ljava/lang/Object;)Lorg/kodein/di/f;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/kodein/di/g$a;->b:Lorg/kodein/di/g;

    invoke-virtual {v0}, Lorg/kodein/di/g;->c()Lorg/kodein/di/f;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lorg/kodein/di/g$a;->b:Lorg/kodein/di/g;

    invoke-static {v1}, Lorg/kodein/di/g;->b(Lorg/kodein/di/g;)Lmh/p;

    move-result-object v1

    iget-object v2, p0, Lorg/kodein/di/g$a;->c:Lth/l;

    invoke-interface {v2}, Lth/c;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
