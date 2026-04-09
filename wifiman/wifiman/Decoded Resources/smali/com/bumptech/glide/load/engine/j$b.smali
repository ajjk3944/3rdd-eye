.class Lcom/bumptech/glide/load/engine/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/engine/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field final a:LH2/a;

.field final b:LH2/a;

.field final c:LH2/a;

.field final d:LH2/a;

.field final e:Lcom/bumptech/glide/load/engine/l;

.field final f:Lcom/bumptech/glide/load/engine/o$a;

.field final g:LE1/e;


# direct methods
.method constructor <init>(LH2/a;LH2/a;LH2/a;LH2/a;Lcom/bumptech/glide/load/engine/l;Lcom/bumptech/glide/load/engine/o$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/bumptech/glide/load/engine/j$b$a;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/load/engine/j$b$a;-><init>(Lcom/bumptech/glide/load/engine/j$b;)V

    const/16 v1, 0x96

    invoke-static {v1, v0}, LX2/a;->d(ILX2/a$d;)LE1/e;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/engine/j$b;->g:LE1/e;

    iput-object p1, p0, Lcom/bumptech/glide/load/engine/j$b;->a:LH2/a;

    iput-object p2, p0, Lcom/bumptech/glide/load/engine/j$b;->b:LH2/a;

    iput-object p3, p0, Lcom/bumptech/glide/load/engine/j$b;->c:LH2/a;

    iput-object p4, p0, Lcom/bumptech/glide/load/engine/j$b;->d:LH2/a;

    iput-object p5, p0, Lcom/bumptech/glide/load/engine/j$b;->e:Lcom/bumptech/glide/load/engine/l;

    iput-object p6, p0, Lcom/bumptech/glide/load/engine/j$b;->f:Lcom/bumptech/glide/load/engine/o$a;

    return-void
.end method


# virtual methods
.method a(LC2/e;ZZZZ)Lcom/bumptech/glide/load/engine/k;
    .locals 7

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/j$b;->g:LE1/e;

    invoke-interface {v0}, LE1/e;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/engine/k;

    invoke-static {v0}, LW2/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/bumptech/glide/load/engine/k;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/bumptech/glide/load/engine/k;->l(LC2/e;ZZZZ)Lcom/bumptech/glide/load/engine/k;

    move-result-object p1

    return-object p1
.end method
