.class final Lkd/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkd/g;-><init>(LZc/f;Ltd/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkd/g;


# direct methods
.method constructor <init>(Lkd/g;)V
    .locals 0

    iput-object p1, p0, Lkd/g$c;->a:Lkd/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LZc/e;)LDj/a;
    .locals 2

    const-string v0, "networkConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LZc/e;->f()LZc/e$b;

    move-result-object p1

    sget-object v0, LZc/e$b;->CONNECTED:LZc/e$b;

    if-eq p1, v0, :cond_0

    new-instance p1, LWc/b$c;

    invoke-direct {p1}, LWc/b$c;-><init>()V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lkd/g$c;->a:Lkd/g;

    invoke-static {p1}, Lkd/g;->d(Lkd/g;)Lgg/z;

    move-result-object p1

    new-instance v0, Lkd/g$c$a;

    iget-object v1, p0, Lkd/g$c;->a:Lkd/g;

    invoke-direct {v0, v1}, Lkd/g$c$a;-><init>(Lkd/g;)V

    invoke-virtual {p1, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->W()Lgg/i;

    move-result-object p1

    const-string v0, "toFlowable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Lfe/h;->e(Lgg/i;Lmh/l;ILjava/lang/Object;)Lgg/i;

    move-result-object p1

    sget-object v0, Lkd/g$c$b;->a:Lkd/g$c$b;

    invoke-virtual {p1, v0}, Lgg/i;->n1(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, Lkd/g$c$c;->a:Lkd/g$c$c;

    invoke-virtual {p1, v0}, Lgg/i;->R1(Lkg/p;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc/e;

    invoke-virtual {p0, p1}, Lkd/g$c;->a(LZc/e;)LDj/a;

    move-result-object p1

    return-object p1
.end method
