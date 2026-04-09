.class final Lr/m0$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/m0;->c(Lr/k;Lr/d;JLmh/l;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Lr/d;

.field final synthetic d:Lr/q;

.field final synthetic e:Lr/k;

.field final synthetic f:F

.field final synthetic g:Lmh/l;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;Ljava/lang/Object;Lr/d;Lr/q;Lr/k;FLmh/l;)V
    .locals 0

    iput-object p1, p0, Lr/m0$d;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, Lr/m0$d;->b:Ljava/lang/Object;

    iput-object p3, p0, Lr/m0$d;->c:Lr/d;

    iput-object p4, p0, Lr/m0$d;->d:Lr/q;

    iput-object p5, p0, Lr/m0$d;->e:Lr/k;

    iput p6, p0, Lr/m0$d;->f:F

    iput-object p7, p0, Lr/m0$d;->g:Lmh/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 13

    iget-object v0, p0, Lr/m0$d;->a:Lkotlin/jvm/internal/N;

    new-instance v12, Lr/h;

    iget-object v2, p0, Lr/m0$d;->b:Ljava/lang/Object;

    iget-object v1, p0, Lr/m0$d;->c:Lr/d;

    invoke-interface {v1}, Lr/d;->c()Lr/s0;

    move-result-object v3

    iget-object v4, p0, Lr/m0$d;->d:Lr/q;

    iget-object v1, p0, Lr/m0$d;->c:Lr/d;

    invoke-interface {v1}, Lr/d;->g()Ljava/lang/Object;

    move-result-object v7

    new-instance v11, Lr/m0$d$a;

    iget-object v1, p0, Lr/m0$d;->e:Lr/k;

    invoke-direct {v11, v1}, Lr/m0$d$a;-><init>(Lr/k;)V

    const/4 v10, 0x1

    move-object v1, v12

    move-wide v5, p1

    move-wide v8, p1

    invoke-direct/range {v1 .. v11}, Lr/h;-><init>(Ljava/lang/Object;Lr/s0;Lr/q;JLjava/lang/Object;JZLmh/a;)V

    iget v4, p0, Lr/m0$d;->f:F

    iget-object v5, p0, Lr/m0$d;->c:Lr/d;

    iget-object v6, p0, Lr/m0$d;->e:Lr/k;

    iget-object v7, p0, Lr/m0$d;->g:Lmh/l;

    move-wide v2, p1

    invoke-static/range {v1 .. v7}, Lr/m0;->a(Lr/h;JFLr/d;Lr/k;Lmh/l;)V

    iput-object v12, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lr/m0$d;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
