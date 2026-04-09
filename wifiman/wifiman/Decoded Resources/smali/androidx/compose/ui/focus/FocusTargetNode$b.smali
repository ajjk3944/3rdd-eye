.class final Landroidx/compose/ui/focus/FocusTargetNode$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/focus/FocusTargetNode;->P2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:Landroidx/compose/ui/focus/FocusTargetNode;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusTargetNode$b;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, Landroidx/compose/ui/focus/FocusTargetNode$b;->b:Landroidx/compose/ui/focus/FocusTargetNode;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTargetNode$b;->a:Lkotlin/jvm/internal/N;

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusTargetNode$b;->b:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusTargetNode;->I2()Landroidx/compose/ui/focus/k;

    move-result-object v1

    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode$b;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
