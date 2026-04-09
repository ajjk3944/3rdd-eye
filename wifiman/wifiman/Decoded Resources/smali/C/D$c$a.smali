.class final LC/D$c$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/D$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/K;

.field final synthetic b:Lw/v;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/K;Lw/v;)V
    .locals 0

    iput-object p1, p0, LC/D$c$a;->a:Lkotlin/jvm/internal/K;

    iput-object p2, p0, LC/D$c$a;->b:Lw/v;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(FF)V
    .locals 1

    iget-object p2, p0, LC/D$c$a;->a:Lkotlin/jvm/internal/K;

    iget p2, p2, Lkotlin/jvm/internal/K;->a:F

    sub-float/2addr p1, p2

    iget-object p2, p0, LC/D$c$a;->b:Lw/v;

    invoke-interface {p2, p1}, Lw/v;->a(F)F

    move-result p1

    iget-object p2, p0, LC/D$c$a;->a:Lkotlin/jvm/internal/K;

    iget v0, p2, Lkotlin/jvm/internal/K;->a:F

    add-float/2addr v0, p1

    iput v0, p2, Lkotlin/jvm/internal/K;->a:F

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

    invoke-virtual {p0, p1, p2}, LC/D$c$a;->a(FF)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
