.class final Lr/m0$f;
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

.field final synthetic b:F

.field final synthetic c:Lr/d;

.field final synthetic d:Lr/k;

.field final synthetic e:Lmh/l;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;FLr/d;Lr/k;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lr/m0$f;->a:Lkotlin/jvm/internal/N;

    iput p2, p0, Lr/m0$f;->b:F

    iput-object p3, p0, Lr/m0$f;->c:Lr/d;

    iput-object p4, p0, Lr/m0$f;->d:Lr/k;

    iput-object p5, p0, Lr/m0$f;->e:Lmh/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 8

    iget-object v0, p0, Lr/m0$f;->a:Lkotlin/jvm/internal/N;

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object v1, v0

    check-cast v1, Lr/h;

    iget v4, p0, Lr/m0$f;->b:F

    iget-object v5, p0, Lr/m0$f;->c:Lr/d;

    iget-object v6, p0, Lr/m0$f;->d:Lr/k;

    iget-object v7, p0, Lr/m0$f;->e:Lmh/l;

    move-wide v2, p1

    invoke-static/range {v1 .. v7}, Lr/m0;->a(Lr/h;JFLr/d;Lr/k;Lmh/l;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lr/m0$f;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
