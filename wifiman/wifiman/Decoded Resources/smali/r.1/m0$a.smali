.class final Lr/m0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/m0;->d(Lr/s0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lr/i;Lmh/p;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/p;

.field final synthetic b:Lr/s0;


# direct methods
.method constructor <init>(Lmh/p;Lr/s0;)V
    .locals 0

    iput-object p1, p0, Lr/m0$a;->a:Lmh/p;

    iput-object p2, p0, Lr/m0$a;->b:Lr/s0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/h;)V
    .locals 3

    iget-object v0, p0, Lr/m0$a;->a:Lmh/p;

    invoke-virtual {p1}, Lr/h;->e()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lr/m0$a;->b:Lr/s0;

    invoke-interface {v2}, Lr/s0;->b()Lmh/l;

    move-result-object v2

    invoke-virtual {p1}, Lr/h;->g()Lr/q;

    move-result-object p1

    invoke-interface {v2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/h;

    invoke-virtual {p0, p1}, Lr/m0$a;->a(Lr/h;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
