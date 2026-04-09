.class final Lz/g0$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/g0$a;->c(LT/l;I)Lz/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/g0;

.field final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Lz/g0;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lz/g0$a$a;->a:Lz/g0;

    iput-object p2, p0, Lz/g0$a$a;->b:Landroid/view/View;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 2

    iget-object p1, p0, Lz/g0$a$a;->a:Lz/g0;

    iget-object v0, p0, Lz/g0$a$a;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Lz/g0;->h(Landroid/view/View;)V

    iget-object p1, p0, Lz/g0$a$a;->a:Lz/g0;

    iget-object v0, p0, Lz/g0$a$a;->b:Landroid/view/View;

    new-instance v1, Lz/g0$a$a$a;

    invoke-direct {v1, p1, v0}, Lz/g0$a$a$a;-><init>(Lz/g0;Landroid/view/View;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, Lz/g0$a$a;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
