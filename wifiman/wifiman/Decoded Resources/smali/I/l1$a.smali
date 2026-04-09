.class final LI/l1$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/l1;->l(LY0/d;LY0/t;LQ0/k$b;J)LL0/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/l1;


# direct methods
.method constructor <init>(LI/l1;)V
    .locals 0

    iput-object p1, p0, LI/l1$a;->a:LI/l1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LL0/M;
    .locals 1

    iget-object v0, p0, LI/l1$a;->a:LI/l1;

    invoke-static {v0}, LI/l1;->a(LI/l1;)LI/i1;

    move-result-object v0

    invoke-virtual {v0}, LI/i1;->t()LL0/M;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI/l1$a;->a()LL0/M;

    move-result-object v0

    return-object v0
.end method
