.class final LV8/k$l$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k$l;->a(LYg/s;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LV8/k;

.field final synthetic b:LG6/N;


# direct methods
.method constructor <init>(LV8/k;LG6/N;)V
    .locals 0

    iput-object p1, p0, LV8/k$l$d;->a:LV8/k;

    iput-object p2, p0, LV8/k$l$d;->b:LG6/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/f;
    .locals 6

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LV8/a;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LV8/b;

    invoke-virtual {v0}, LV8/a;->e()Lgg/b;

    move-result-object v1

    invoke-virtual {v1}, Lgg/b;->f0()Lgg/s;

    move-result-object v1

    iget-object v2, p0, LV8/k$l$d;->a:LV8/k;

    invoke-static {v2}, LV8/k;->D(LV8/k;)Lgg/z;

    move-result-object v2

    new-instance v3, LV8/k$l$d$a;

    iget-object v4, p0, LV8/k$l$d;->a:LV8/k;

    iget-object v5, p0, LV8/k$l$d;->b:LG6/N;

    invoke-direct {v3, v4, v0, p1, v5}, LV8/k$l$d$a;-><init>(LV8/k;LV8/a;LV8/b;LG6/N;)V

    invoke-virtual {v2, v3}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->Y()Lgg/s;

    move-result-object p1

    invoke-static {v1, p1}, Lgg/s;->j0(Lgg/v;Lgg/v;)Lgg/s;

    move-result-object p1

    new-instance v0, LV8/k$l$d$b;

    iget-object v1, p0, LV8/k$l$d;->a:LV8/k;

    invoke-direct {v0, v1}, LV8/k$l$d$b;-><init>(LV8/k;)V

    invoke-virtual {p1, v0}, Lgg/s;->G(Lkg/f;)Lgg/s;

    move-result-object p1

    new-instance v0, LV8/k$l$d$c;

    iget-object v1, p0, LV8/k$l$d;->a:LV8/k;

    invoke-direct {v0, v1}, LV8/k$l$d$c;-><init>(LV8/k;)V

    invoke-virtual {p1, v0}, Lgg/s;->F(Lkg/f;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->f0()Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, LV8/k$l$d;->a(LYg/s;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
