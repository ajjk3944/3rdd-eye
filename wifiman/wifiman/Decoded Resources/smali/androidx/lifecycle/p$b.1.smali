.class public final Landroidx/lifecycle/p$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Landroidx/lifecycle/k$b;

.field private b:Landroidx/lifecycle/m;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/n;Landroidx/lifecycle/k$b;)V
    .locals 1

    const-string v0, "initialState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p1}, Landroidx/lifecycle/r;->f(Ljava/lang/Object;)Landroidx/lifecycle/m;

    move-result-object p1

    iput-object p1, p0, Landroidx/lifecycle/p$b;->b:Landroidx/lifecycle/m;

    iput-object p2, p0, Landroidx/lifecycle/p$b;->a:Landroidx/lifecycle/k$b;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroidx/lifecycle/k$a;->getTargetState()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/p;->k:Landroidx/lifecycle/p$a;

    iget-object v2, p0, Landroidx/lifecycle/p$b;->a:Landroidx/lifecycle/k$b;

    invoke-virtual {v1, v2, v0}, Landroidx/lifecycle/p$a;->a(Landroidx/lifecycle/k$b;Landroidx/lifecycle/k$b;)Landroidx/lifecycle/k$b;

    move-result-object v1

    iput-object v1, p0, Landroidx/lifecycle/p$b;->a:Landroidx/lifecycle/k$b;

    iget-object v1, p0, Landroidx/lifecycle/p$b;->b:Landroidx/lifecycle/m;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v1, p1, p2}, Landroidx/lifecycle/m;->j(Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V

    iput-object v0, p0, Landroidx/lifecycle/p$b;->a:Landroidx/lifecycle/k$b;

    return-void
.end method

.method public final b()Landroidx/lifecycle/k$b;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/p$b;->a:Landroidx/lifecycle/k$b;

    return-object v0
.end method
