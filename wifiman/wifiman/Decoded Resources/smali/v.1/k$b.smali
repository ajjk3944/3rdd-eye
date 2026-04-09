.class final Lv/k$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/k;->b(Ljava/lang/String;ZLv/b;Landroidx/compose/ui/e;Lmh/q;Lmh/a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lmh/a;


# direct methods
.method constructor <init>(ZLmh/a;)V
    .locals 0

    iput-boolean p1, p0, Lv/k$b;->a:Z

    iput-object p2, p0, Lv/k$b;->b:Lmh/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-boolean v0, p0, Lv/k$b;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv/k$b;->b:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lv/k$b;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
