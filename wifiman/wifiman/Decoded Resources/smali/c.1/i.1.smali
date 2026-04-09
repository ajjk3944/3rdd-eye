.class public final synthetic Lc/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/m;


# instance fields
.field public final synthetic a:Lc/G;

.field public final synthetic b:Lc/j;


# direct methods
.method public synthetic constructor <init>(Lc/G;Lc/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/i;->a:Lc/G;

    iput-object p2, p0, Lc/i;->b:Lc/j;

    return-void
.end method


# virtual methods
.method public final j(Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 2

    iget-object v0, p0, Lc/i;->a:Lc/G;

    iget-object v1, p0, Lc/i;->b:Lc/j;

    invoke-static {v0, v1, p1, p2}, Lc/j;->R(Lc/G;Lc/j;Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V

    return-void
.end method
