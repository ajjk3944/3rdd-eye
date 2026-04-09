.class final Lf2/n$o;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/n;->T(Lf2/r;Landroid/os/Bundle;Lf2/y;Lf2/D$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/J;

.field final synthetic b:Lf2/n;

.field final synthetic c:Lf2/r;

.field final synthetic d:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/J;Lf2/n;Lf2/r;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lf2/n$o;->a:Lkotlin/jvm/internal/J;

    iput-object p2, p0, Lf2/n$o;->b:Lf2/n;

    iput-object p3, p0, Lf2/n$o;->c:Lf2/r;

    iput-object p4, p0, Lf2/n$o;->d:Landroid/os/Bundle;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lf2/k;)V
    .locals 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/n$o;->a:Lkotlin/jvm/internal/J;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkotlin/jvm/internal/J;->a:Z

    iget-object v2, p0, Lf2/n$o;->b:Lf2/n;

    iget-object v3, p0, Lf2/n$o;->c:Lf2/r;

    iget-object v4, p0, Lf2/n$o;->d:Landroid/os/Bundle;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v5, p1

    invoke-static/range {v2 .. v8}, Lf2/n;->q(Lf2/n;Lf2/r;Landroid/os/Bundle;Lf2/k;Ljava/util/List;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf2/k;

    invoke-virtual {p0, p1}, Lf2/n$o;->a(Lf2/k;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
