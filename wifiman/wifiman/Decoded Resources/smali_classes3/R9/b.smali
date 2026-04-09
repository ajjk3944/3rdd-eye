.class public final synthetic LR9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LR9/a;

.field public final synthetic b:Landroidx/lifecycle/k;


# direct methods
.method public synthetic constructor <init>(LR9/a;Landroidx/lifecycle/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR9/b;->a:LR9/a;

    iput-object p2, p0, LR9/b;->b:Landroidx/lifecycle/k;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LR9/b;->a:LR9/a;

    iget-object v1, p0, LR9/b;->b:Landroidx/lifecycle/k;

    check-cast p1, LT/L;

    invoke-static {v0, v1, p1}, LR9/e;->c(LR9/a;Landroidx/lifecycle/k;LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
