.class final LF/H$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/H;->d(Ly0/G;LF/U;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/U;


# direct methods
.method constructor <init>(LF/U;)V
    .locals 0

    iput-object p1, p0, LF/H$e;->a:LF/U;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly0/y;J)V
    .locals 0

    iget-object p1, p0, LF/H$e;->a:LF/U;

    invoke-interface {p1, p2, p3}, LF/U;->e(J)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ly0/y;

    check-cast p2, Ll0/g;

    invoke-virtual {p2}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LF/H$e;->a(Ly0/y;J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
