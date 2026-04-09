.class final LI/e1$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/e1;->q(LJ0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/e1;


# direct methods
.method constructor <init>(LI/e1;)V
    .locals 0

    iput-object p1, p0, LI/e1$d;->a:LI/e1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LL0/d;)Ljava/lang/Boolean;
    .locals 7

    iget-object v0, p0, LI/e1$d;->a:LI/e1;

    invoke-static {v0}, LI/e1;->K2(LI/e1;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    iget-object v0, p0, LI/e1$d;->a:LI/e1;

    invoke-virtual {v0}, LI/e1;->f3()LI/o1;

    move-result-object v1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, LI/o1;->u(LI/o1;Ljava/lang/CharSequence;ZLK/c;ILjava/lang/Object;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LL0/d;

    invoke-virtual {p0, p1}, LI/e1$d;->a(LL0/d;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
