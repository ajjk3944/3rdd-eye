.class final Ly0/s$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/s;->I2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/J;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/J;)V
    .locals 0

    iput-object p1, p0, Ly0/s$b;->a:Lkotlin/jvm/internal/J;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly0/s;)LE0/z0;
    .locals 1

    invoke-static {p1}, Ly0/s;->D2(Ly0/s;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ly0/s$b;->a:Lkotlin/jvm/internal/J;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lkotlin/jvm/internal/J;->a:Z

    sget-object p1, LE0/z0;->CancelTraversal:LE0/z0;

    goto :goto_0

    :cond_0
    sget-object p1, LE0/z0;->ContinueTraversal:LE0/z0;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/s;

    invoke-virtual {p0, p1}, Ly0/s$b;->a(Ly0/s;)LE0/z0;

    move-result-object p1

    return-object p1
.end method
