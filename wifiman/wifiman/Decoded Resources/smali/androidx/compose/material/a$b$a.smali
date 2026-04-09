.class final Landroidx/compose/material/a$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/a;

.field final synthetic b:Lkotlin/jvm/internal/K;


# direct methods
.method constructor <init>(LN/a;Lkotlin/jvm/internal/K;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material/a$b$a;->a:LN/a;

    iput-object p2, p0, Landroidx/compose/material/a$b$a;->b:Lkotlin/jvm/internal/K;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(FF)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/material/a$b$a;->a:LN/a;

    invoke-interface {v0, p1, p2}, LN/a;->a(FF)V

    iget-object p2, p0, Landroidx/compose/material/a$b$a;->b:Lkotlin/jvm/internal/K;

    iput p1, p2, Lkotlin/jvm/internal/K;->a:F

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/a$b$a;->a(FF)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
