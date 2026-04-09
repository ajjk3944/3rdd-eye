.class public final LR9/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR9/e;->d(LR9/a;Landroidx/lifecycle/k;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/lifecycle/k;

.field final synthetic b:LR9/a;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/k;LR9/a;)V
    .locals 0

    iput-object p1, p0, LR9/e$a;->a:Landroidx/lifecycle/k;

    iput-object p2, p0, LR9/e$a;->b:LR9/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, LR9/e$a;->a:Landroidx/lifecycle/k;

    iget-object v1, p0, LR9/e$a;->b:LR9/a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->c(Landroidx/lifecycle/n;)V

    iget-object v0, p0, LR9/e$a;->b:LR9/a;

    invoke-virtual {v0}, LR9/a;->a0()V

    iget-object v0, p0, LR9/e$a;->b:LR9/a;

    invoke-virtual {v0}, LR9/a;->Z()V

    return-void
.end method
