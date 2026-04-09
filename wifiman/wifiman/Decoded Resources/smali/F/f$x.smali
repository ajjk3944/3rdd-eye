.class final LF/f$x;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/f;->k(LJ/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ/j;


# direct methods
.method constructor <init>(LJ/j;)V
    .locals 0

    iput-object p1, p0, LF/f$x;->a:LJ/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LJ/d;
    .locals 3

    iget-object v0, p0, LF/f$x;->a:LJ/j;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LJ/j;->a0(ZZ)LJ/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF/f$x;->a()LJ/d;

    move-result-object v0

    return-object v0
.end method
