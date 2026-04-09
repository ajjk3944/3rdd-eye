.class public final Lg2/g$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/g$e;->c(LT/L;)LT/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf2/k;

.field final synthetic b:Landroidx/lifecycle/m;


# direct methods
.method public constructor <init>(Lf2/k;Landroidx/lifecycle/m;)V
    .locals 0

    iput-object p1, p0, Lg2/g$e$a;->a:Lf2/k;

    iput-object p2, p0, Lg2/g$e$a;->b:Landroidx/lifecycle/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Lg2/g$e$a;->a:Lf2/k;

    invoke-virtual {v0}, Lf2/k;->O()Landroidx/lifecycle/k;

    move-result-object v0

    iget-object v1, p0, Lg2/g$e$a;->b:Landroidx/lifecycle/m;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->c(Landroidx/lifecycle/n;)V

    return-void
.end method
