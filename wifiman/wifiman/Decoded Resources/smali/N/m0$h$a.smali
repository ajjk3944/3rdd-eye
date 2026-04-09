.class final LN/m0$h$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/m0$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/a;


# direct methods
.method constructor <init>(Lmh/a;)V
    .locals 0

    iput-object p1, p0, LN/m0$h$a;->a:Lmh/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 0

    iget-object p1, p0, LN/m0$h$a;->a:Lmh/a;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ll0/g;

    invoke-virtual {p1}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LN/m0$h$a;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
