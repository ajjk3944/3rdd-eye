.class final LT/E1$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/E1;->b(LT/l;Lmh/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;


# direct methods
.method constructor <init>(Lmh/l;)V
    .locals 0

    iput-object p1, p0, LT/E1$a;->a:Lmh/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;LYg/J;)V
    .locals 0

    iget-object p2, p0, LT/E1$a;->a:Lmh/l;

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, LYg/J;

    invoke-virtual {p0, p1, p2}, LT/E1$a;->a(Ljava/lang/Object;LYg/J;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
