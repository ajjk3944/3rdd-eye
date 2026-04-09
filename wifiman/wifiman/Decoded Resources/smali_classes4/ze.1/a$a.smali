.class public final Lze/a$a;
.super Landroidx/lifecycle/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lze/a;->a(Lorg/kodein/di/DI;Lq2/f;Landroid/os/Bundle;Ljava/lang/String;)Landroidx/lifecycle/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Lorg/kodein/di/DI;

.field final synthetic f:Ljava/lang/String;


# direct methods
.method constructor <init>(Lq2/f;Landroid/os/Bundle;Lorg/kodein/di/DI;Ljava/lang/String;)V
    .locals 0

    iput-object p3, p0, Lze/a$a;->e:Lorg/kodein/di/DI;

    iput-object p4, p0, Lze/a$a;->f:Ljava/lang/String;

    invoke-direct {p0, p1, p2}, Landroidx/lifecycle/a;-><init>(Lq2/f;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method protected f(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/E;)Landroidx/lifecycle/N;
    .locals 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "modelClass"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "handle"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lze/a$a;->e:Lorg/kodein/di/DI;

    invoke-static {p1}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object p1

    invoke-static {p2}, Lorg/kodein/type/s;->a(Ljava/lang/Class;)Lorg/kodein/type/q;

    move-result-object p2

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lze/a$a$a;

    invoke-direct {v1}, Lze/a$a$a;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Landroidx/lifecycle/E;

    invoke-direct {v0, v1, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    iget-object v1, p0, Lze/a$a;->f:Ljava/lang/String;

    invoke-interface {p1, v0, p2, v1}, Lrj/o2;->c(Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;)Lmh/l;

    move-result-object p1

    invoke-interface {p1, p3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/N;

    return-object p1
.end method
