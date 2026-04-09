.class public final LBe/D0$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBe/D0;->b(Landroidx/compose/ui/e;LBe/B0;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/q0;

.field final synthetic b:Lb1/o;


# direct methods
.method public constructor <init>(LT/q0;Lb1/o;)V
    .locals 0

    iput-object p1, p0, LBe/D0$b;->a:LT/q0;

    iput-object p2, p0, LBe/D0$b;->b:Lb1/o;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, LBe/D0$b;->a:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, LT/q0;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, LBe/D0$b;->b:Lb1/o;

    invoke-virtual {v0, v2}, Lb1/o;->j(Z)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LBe/D0$b;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
