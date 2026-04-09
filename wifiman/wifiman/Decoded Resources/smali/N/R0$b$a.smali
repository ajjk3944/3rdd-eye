.class final LN/R0$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/R0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/k;

.field final synthetic b:Lkotlin/jvm/internal/K;


# direct methods
.method constructor <init>(Lw/k;Lkotlin/jvm/internal/K;)V
    .locals 0

    iput-object p1, p0, LN/R0$b$a;->a:Lw/k;

    iput-object p2, p0, LN/R0$b$a;->b:Lkotlin/jvm/internal/K;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/a;)V
    .locals 3

    iget-object v0, p0, LN/R0$b$a;->a:Lw/k;

    invoke-virtual {p1}, Lr/a;->m()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget-object v2, p0, LN/R0$b$a;->b:Lkotlin/jvm/internal/K;

    iget v2, v2, Lkotlin/jvm/internal/K;->a:F

    sub-float/2addr v1, v2

    invoke-interface {v0, v1}, Lw/k;->a(F)V

    iget-object v0, p0, LN/R0$b$a;->b:Lkotlin/jvm/internal/K;

    invoke-virtual {p1}, Lr/a;->m()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iput p1, v0, Lkotlin/jvm/internal/K;->a:F

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/a;

    invoke-virtual {p0, p1}, LN/R0$b$a;->a(Lr/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
