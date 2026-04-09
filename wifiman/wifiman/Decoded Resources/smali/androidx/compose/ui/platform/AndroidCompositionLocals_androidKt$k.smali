.class final Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$k;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->m(Landroid/content/Context;Landroid/content/res/Configuration;LT/l;I)LH0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$l;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$k;->a:Landroid/content/Context;

    iput-object p2, p0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$k;->b:Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 2

    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$k;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$k;->b:Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$l;

    invoke-virtual {p1, v0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$k;->a:Landroid/content/Context;

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$k;->b:Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$l;

    new-instance v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$k$a;

    invoke-direct {v1, p1, v0}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$k$a;-><init>(Landroid/content/Context;Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$l;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$k;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
