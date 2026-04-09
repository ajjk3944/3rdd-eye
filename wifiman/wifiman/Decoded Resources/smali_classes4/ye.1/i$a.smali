.class public final Lye/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lye/i;->a(LT/L;)LT/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/lifecycle/e;

.field final synthetic b:Landroidx/appcompat/app/c;

.field final synthetic c:Landroidx/lifecycle/o;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/e;Landroidx/appcompat/app/c;Landroidx/lifecycle/o;)V
    .locals 0

    iput-object p1, p0, Lye/i$a;->a:Landroidx/lifecycle/e;

    iput-object p2, p0, Lye/i$a;->b:Landroidx/appcompat/app/c;

    iput-object p3, p0, Lye/i$a;->c:Landroidx/lifecycle/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Lye/i$a;->a:Landroidx/lifecycle/e;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lye/i$a;->b:Landroidx/appcompat/app/c;

    invoke-virtual {v0}, Lc/j;->O()Landroidx/lifecycle/k;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->RESUMED:Landroidx/lifecycle/k$b;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lye/i$a;->a:Landroidx/lifecycle/e;

    iget-object v1, p0, Lye/i$a;->c:Landroidx/lifecycle/o;

    invoke-interface {v0, v1}, Landroidx/lifecycle/e;->onStop(Landroidx/lifecycle/o;)V

    :cond_0
    iget-object v0, p0, Lye/i$a;->c:Landroidx/lifecycle/o;

    invoke-interface {v0}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object v0

    iget-object v1, p0, Lye/i$a;->a:Landroidx/lifecycle/e;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->c(Landroidx/lifecycle/n;)V

    :cond_1
    return-void
.end method
