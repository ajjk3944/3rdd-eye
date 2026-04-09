.class final Lg2/m$h$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/m$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LIi/N;

.field final synthetic b:Lr/c0;

.field final synthetic c:Lf2/k;


# direct methods
.method constructor <init>(LIi/N;Lr/c0;Lf2/k;)V
    .locals 0

    iput-object p1, p0, Lg2/m$h$a;->a:LIi/N;

    iput-object p2, p0, Lg2/m$h$a;->b:Lr/c0;

    iput-object p3, p0, Lg2/m$h$a;->c:Lf2/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(FF)V
    .locals 6

    iget-object v0, p0, Lg2/m$h$a;->a:LIi/N;

    new-instance v3, Lg2/m$h$a$a;

    iget-object p2, p0, Lg2/m$h$a;->b:Lr/c0;

    iget-object v1, p0, Lg2/m$h$a;->c:Lf2/k;

    const/4 v2, 0x0

    invoke-direct {v3, p1, p2, v1, v2}, Lg2/m$h$a$a;-><init>(FLr/c0;Lf2/k;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-virtual {p0, p1, p2}, Lg2/m$h$a;->a(FF)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
