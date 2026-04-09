.class final LV8/k$s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k;->L(LG6/N;Lgg/b;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LV8/k;


# direct methods
.method constructor <init>(LV8/k;)V
    .locals 0

    iput-object p1, p0, LV8/k$s;->a:LV8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LG6/P;)Lgg/D;
    .locals 2

    const-string/jumbo v0, "services"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV8/k$s;->a:LV8/k;

    invoke-static {v0}, LV8/k;->r(LV8/k;)Ljava/util/UUID;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LV8/k$s;->a:LV8/k;

    invoke-static {v0}, LV8/k;->r(LV8/k;)Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p1, v0}, LG6/P;->c(Ljava/util/UUID;)Lgg/z;

    move-result-object p1

    new-instance v0, LV8/k$s$a;

    iget-object v1, p0, LV8/k$s;->a:LV8/k;

    invoke-direct {v0, v1}, LV8/k$s$a;-><init>(LV8/k;)V

    invoke-virtual {p1, v0}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object p1

    new-instance v0, LV8/k$s$b;

    iget-object v1, p0, LV8/k$s;->a:LV8/k;

    invoke-direct {v0, v1}, LV8/k$s$b;-><init>(LV8/k;)V

    invoke-virtual {p1, v0}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    new-instance v0, LV8/k$s$c;

    iget-object v1, p0, LV8/k$s;->a:LV8/k;

    invoke-direct {v0, v1}, LV8/k$s$c;-><init>(LV8/k;)V

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v0, LV8/k$s$d;

    iget-object v1, p0, LV8/k$s;->a:LV8/k;

    invoke-direct {v0, v1}, LV8/k$s$d;-><init>(LV8/k;)V

    invoke-virtual {p1, v0}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LV8/k$s;->a:LV8/k;

    invoke-static {v0}, LV8/k;->q(LV8/k;)Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p1, v0}, LG6/P;->b(Ljava/util/UUID;)Lgg/z;

    move-result-object p1

    new-instance v0, LV8/k$s$e;

    iget-object v1, p0, LV8/k$s;->a:LV8/k;

    invoke-direct {v0, v1}, LV8/k$s$e;-><init>(LV8/k;)V

    invoke-virtual {p1, v0}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object p1

    new-instance v0, LV8/k$s$f;

    iget-object v1, p0, LV8/k$s;->a:LV8/k;

    invoke-direct {v0, v1}, LV8/k$s$f;-><init>(LV8/k;)V

    invoke-virtual {p1, v0}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LG6/P;

    invoke-virtual {p0, p1}, LV8/k$s;->a(LG6/P;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
