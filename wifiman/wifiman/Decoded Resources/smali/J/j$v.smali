.class final LJ/j$v;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/j;->m0(Ldh/e;)Ljava/lang/Object;
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

    iput-object p1, p0, LJ/j$v;->a:LJ/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LH/h;
    .locals 1

    iget-object v0, p0, LJ/j$v;->a:LJ/j;

    invoke-static {v0}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object v0

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJ/j$v;->a()LH/h;

    move-result-object v0

    return-object v0
.end method
