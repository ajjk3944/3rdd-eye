.class final Lcom/ui/wmw/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/a;-><init>(Landroid/content/Context;Lh9/a;Lh9/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wmw/a;


# direct methods
.method constructor <init>(Lcom/ui/wmw/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/a$b;->a:Lcom/ui/wmw/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/atomic/AtomicInteger;)LDj/a;
    .locals 5

    const-string v0, "tryCounter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v1, Lcom/ui/wmw/a$b$d;

    invoke-direct {v1, p1}, Lcom/ui/wmw/a$b$d;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;)V

    invoke-static {v1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v1

    const-string v2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/ui/wmw/a$b$a;

    iget-object v4, p0, Lcom/ui/wmw/a$b;->a:Lcom/ui/wmw/a;

    invoke-direct {v3, v4, v0}, Lcom/ui/wmw/a$b$a;-><init>(Lcom/ui/wmw/a;Lkotlin/jvm/internal/N;)V

    invoke-virtual {v1, v3}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v1

    new-instance v3, Lcom/ui/wmw/a$b$e;

    invoke-direct {v3, v0}, Lcom/ui/wmw/a$b$e;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {v3}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lgg/i;->y1(Lgg/D;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    new-instance v2, Lcom/ui/wmw/a$b$b;

    invoke-direct {v2, v0, p1}, Lcom/ui/wmw/a$b$b;-><init>(Lkotlin/jvm/internal/N;Ljava/util/concurrent/atomic/AtomicInteger;)V

    invoke-virtual {v1, v2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v0

    const-string v1, "doOnNext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lcom/ui/wmw/f;->e(Lgg/i;ZILjava/lang/Object;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wmw/a$b$c;

    invoke-direct {v1, p1}, Lcom/ui/wmw/a$b$c;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;)V

    invoke-virtual {v0, v1}, Lgg/i;->p1(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/a$b;->a(Ljava/util/concurrent/atomic/AtomicInteger;)LDj/a;

    move-result-object p1

    return-object p1
.end method
