.class final LT/N0$l;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/N0;->A0(LT/E;Lo/I;)Lmh/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/E;

.field final synthetic b:Lo/I;


# direct methods
.method constructor <init>(LT/E;Lo/I;)V
    .locals 0

    iput-object p1, p0, LT/N0$l;->a:LT/E;

    iput-object p2, p0, LT/N0$l;->b:Lo/I;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LT/N0$l;->a:LT/E;

    invoke-interface {v0, p1}, LT/E;->n(Ljava/lang/Object;)V

    iget-object v0, p0, LT/N0$l;->b:Lo/I;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lo/I;->h(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LT/N0$l;->a(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
