.class public final LUe/o$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUe/o;->h(Landroidx/compose/ui/e;LUe/g;ZLT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/q0;

.field final synthetic b:Landroidx/lifecycle/o;

.field final synthetic c:Landroidx/lifecycle/m;


# direct methods
.method public constructor <init>(LT/q0;Landroidx/lifecycle/o;Landroidx/lifecycle/m;)V
    .locals 0

    iput-object p1, p0, LUe/o$c;->a:LT/q0;

    iput-object p2, p0, LUe/o$c;->b:Landroidx/lifecycle/o;

    iput-object p3, p0, LUe/o$c;->c:Landroidx/lifecycle/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, LUe/o$c;->a:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh7/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh7/j;->f()V

    :cond_0
    iget-object v0, p0, LUe/o$c;->b:Landroidx/lifecycle/o;

    invoke-interface {v0}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object v0

    iget-object v1, p0, LUe/o$c;->c:Landroidx/lifecycle/m;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->c(Landroidx/lifecycle/n;)V

    return-void
.end method
