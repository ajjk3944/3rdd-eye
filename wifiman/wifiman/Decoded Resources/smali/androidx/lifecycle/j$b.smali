.class public final Landroidx/lifecycle/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/j;->c(Lq2/d;Landroidx/lifecycle/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/lifecycle/k;

.field final synthetic b:Lq2/d;


# direct methods
.method constructor <init>(Landroidx/lifecycle/k;Lq2/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/j$b;->a:Landroidx/lifecycle/k;

    iput-object p2, p0, Landroidx/lifecycle/j$b;->b:Lq2/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public j(Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/k$a;->ON_START:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Landroidx/lifecycle/j$b;->a:Landroidx/lifecycle/k;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/k;->c(Landroidx/lifecycle/n;)V

    iget-object p1, p0, Landroidx/lifecycle/j$b;->b:Lq2/d;

    const-class p2, Landroidx/lifecycle/j$a;

    invoke-virtual {p1, p2}, Lq2/d;->i(Ljava/lang/Class;)V

    :cond_0
    return-void
.end method
