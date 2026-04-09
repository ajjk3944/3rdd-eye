.class final Lye/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lye/d;->a(Lye/g;Landroidx/lifecycle/k$b;Lmh/a;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/lifecycle/k$b;


# direct methods
.method constructor <init>(Landroidx/lifecycle/k$b;)V
    .locals 0

    iput-object p1, p0, Lye/d$b;->a:Landroidx/lifecycle/k$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/k$b;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lye/d$b;->a:Landroidx/lifecycle/k$b;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/k$b;->isAtLeast(Landroidx/lifecycle/k$b;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/lifecycle/k$b;

    invoke-virtual {p0, p1}, Lye/d$b;->a(Landroidx/lifecycle/k$b;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
