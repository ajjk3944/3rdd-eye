.class final Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$h;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a(Landroidx/compose/ui/platform/r;Lmh/p;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/o0;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/o0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$h;->a:Landroidx/compose/ui/platform/o0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 1

    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$h;->a:Landroidx/compose/ui/platform/o0;

    new-instance v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$h$a;

    invoke-direct {v0, p1}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$h$a;-><init>(Landroidx/compose/ui/platform/o0;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$h;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
