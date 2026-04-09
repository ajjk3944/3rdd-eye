.class final LN/G$h;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/G;->j(LN/I;Lmh/l;LT/l;II)LN/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/I;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(LN/I;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LN/G$h;->a:LN/I;

    iput-object p2, p0, LN/G$h;->b:Lmh/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LN/H;
    .locals 3

    new-instance v0, LN/H;

    iget-object v1, p0, LN/G$h;->a:LN/I;

    iget-object v2, p0, LN/G$h;->b:Lmh/l;

    invoke-direct {v0, v1, v2}, LN/H;-><init>(LN/I;Lmh/l;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/G$h;->a()LN/H;

    move-result-object v0

    return-object v0
.end method
