.class final Lbi/o$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbi/o;->t(LBh/e;Ljava/util/Collection;)Ljava/util/Collection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:LBh/e;


# direct methods
.method constructor <init>(LBh/e;)V
    .locals 0

    iput-object p1, p0, Lbi/o$e;->a:LBh/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LBh/b;)Ljava/lang/Boolean;
    .locals 2

    invoke-interface {p1}, LBh/C;->getVisibility()LBh/u;

    move-result-object v0

    invoke-static {v0}, LBh/t;->g(LBh/u;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbi/o$e;->a:LBh/e;

    invoke-static {p1, v0, v1}, LBh/t;->h(LBh/q;LBh/m;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBh/b;

    invoke-virtual {p0, p1}, Lbi/o$e;->a(LBh/b;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
