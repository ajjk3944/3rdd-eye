.class public final Lcom/bumptech/glide/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/c$c;,
        Lcom/bumptech/glide/c$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Lcom/bumptech/glide/e$a;

.field private c:Lcom/bumptech/glide/load/engine/j;

.field private d:LF2/d;

.field private e:LF2/b;

.field private f:LG2/h;

.field private g:LH2/a;

.field private h:LH2/a;

.field private i:LG2/a$a;

.field private j:LG2/i;

.field private k:LQ2/c;

.field private l:I

.field private m:Lcom/bumptech/glide/b$a;

.field private n:LQ2/o$b;

.field private o:LH2/a;

.field private p:Z

.field private q:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo/a;

    invoke-direct {v0}, Lo/a;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/c;->a:Ljava/util/Map;

    new-instance v0, Lcom/bumptech/glide/e$a;

    invoke-direct {v0}, Lcom/bumptech/glide/e$a;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/e$a;

    const/4 v0, 0x4

    iput v0, p0, Lcom/bumptech/glide/c;->l:I

    new-instance v0, Lcom/bumptech/glide/c$a;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/c$a;-><init>(Lcom/bumptech/glide/c;)V

    iput-object v0, p0, Lcom/bumptech/glide/c;->m:Lcom/bumptech/glide/b$a;

    return-void
.end method


# virtual methods
.method a(Landroid/content/Context;Ljava/util/List;LR2/a;)Lcom/bumptech/glide/b;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    iget-object v1, v0, Lcom/bumptech/glide/c;->g:LH2/a;

    if-nez v1, :cond_0

    invoke-static {}, LH2/a;->i()LH2/a;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/c;->g:LH2/a;

    :cond_0
    iget-object v1, v0, Lcom/bumptech/glide/c;->h:LH2/a;

    if-nez v1, :cond_1

    invoke-static {}, LH2/a;->f()LH2/a;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/c;->h:LH2/a;

    :cond_1
    iget-object v1, v0, Lcom/bumptech/glide/c;->o:LH2/a;

    if-nez v1, :cond_2

    invoke-static {}, LH2/a;->d()LH2/a;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/c;->o:LH2/a;

    :cond_2
    iget-object v1, v0, Lcom/bumptech/glide/c;->j:LG2/i;

    if-nez v1, :cond_3

    new-instance v1, LG2/i$a;

    invoke-direct {v1, v2}, LG2/i$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, LG2/i$a;->a()LG2/i;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/c;->j:LG2/i;

    :cond_3
    iget-object v1, v0, Lcom/bumptech/glide/c;->k:LQ2/c;

    if-nez v1, :cond_4

    new-instance v1, LQ2/e;

    invoke-direct {v1}, LQ2/e;-><init>()V

    iput-object v1, v0, Lcom/bumptech/glide/c;->k:LQ2/c;

    :cond_4
    iget-object v1, v0, Lcom/bumptech/glide/c;->d:LF2/d;

    if-nez v1, :cond_6

    iget-object v1, v0, Lcom/bumptech/glide/c;->j:LG2/i;

    invoke-virtual {v1}, LG2/i;->b()I

    move-result v1

    if-lez v1, :cond_5

    new-instance v3, LF2/j;

    int-to-long v4, v1

    invoke-direct {v3, v4, v5}, LF2/j;-><init>(J)V

    iput-object v3, v0, Lcom/bumptech/glide/c;->d:LF2/d;

    goto :goto_0

    :cond_5
    new-instance v1, LF2/e;

    invoke-direct {v1}, LF2/e;-><init>()V

    iput-object v1, v0, Lcom/bumptech/glide/c;->d:LF2/d;

    :cond_6
    :goto_0
    iget-object v1, v0, Lcom/bumptech/glide/c;->e:LF2/b;

    if-nez v1, :cond_7

    new-instance v1, LF2/i;

    iget-object v3, v0, Lcom/bumptech/glide/c;->j:LG2/i;

    invoke-virtual {v3}, LG2/i;->a()I

    move-result v3

    invoke-direct {v1, v3}, LF2/i;-><init>(I)V

    iput-object v1, v0, Lcom/bumptech/glide/c;->e:LF2/b;

    :cond_7
    iget-object v1, v0, Lcom/bumptech/glide/c;->f:LG2/h;

    if-nez v1, :cond_8

    new-instance v1, LG2/g;

    iget-object v3, v0, Lcom/bumptech/glide/c;->j:LG2/i;

    invoke-virtual {v3}, LG2/i;->d()I

    move-result v3

    int-to-long v3, v3

    invoke-direct {v1, v3, v4}, LG2/g;-><init>(J)V

    iput-object v1, v0, Lcom/bumptech/glide/c;->f:LG2/h;

    :cond_8
    iget-object v1, v0, Lcom/bumptech/glide/c;->i:LG2/a$a;

    if-nez v1, :cond_9

    new-instance v1, LG2/f;

    invoke-direct {v1, v2}, LG2/f;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lcom/bumptech/glide/c;->i:LG2/a$a;

    :cond_9
    iget-object v1, v0, Lcom/bumptech/glide/c;->c:Lcom/bumptech/glide/load/engine/j;

    if-nez v1, :cond_a

    new-instance v1, Lcom/bumptech/glide/load/engine/j;

    iget-object v4, v0, Lcom/bumptech/glide/c;->f:LG2/h;

    iget-object v5, v0, Lcom/bumptech/glide/c;->i:LG2/a$a;

    iget-object v6, v0, Lcom/bumptech/glide/c;->h:LH2/a;

    iget-object v7, v0, Lcom/bumptech/glide/c;->g:LH2/a;

    invoke-static {}, LH2/a;->j()LH2/a;

    move-result-object v8

    iget-object v9, v0, Lcom/bumptech/glide/c;->o:LH2/a;

    iget-boolean v10, v0, Lcom/bumptech/glide/c;->p:Z

    move-object v3, v1

    invoke-direct/range {v3 .. v10}, Lcom/bumptech/glide/load/engine/j;-><init>(LG2/h;LG2/a$a;LH2/a;LH2/a;LH2/a;LH2/a;Z)V

    iput-object v1, v0, Lcom/bumptech/glide/c;->c:Lcom/bumptech/glide/load/engine/j;

    :cond_a
    iget-object v1, v0, Lcom/bumptech/glide/c;->q:Ljava/util/List;

    if-nez v1, :cond_b

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/c;->q:Ljava/util/List;

    goto :goto_1

    :cond_b
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/c;->q:Ljava/util/List;

    :goto_1
    iget-object v1, v0, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/e$a;

    invoke-virtual {v1}, Lcom/bumptech/glide/e$a;->b()Lcom/bumptech/glide/e;

    move-result-object v15

    new-instance v7, LQ2/o;

    iget-object v1, v0, Lcom/bumptech/glide/c;->n:LQ2/o$b;

    invoke-direct {v7, v1}, LQ2/o;-><init>(LQ2/o$b;)V

    new-instance v16, Lcom/bumptech/glide/b;

    iget-object v3, v0, Lcom/bumptech/glide/c;->c:Lcom/bumptech/glide/load/engine/j;

    iget-object v4, v0, Lcom/bumptech/glide/c;->f:LG2/h;

    iget-object v5, v0, Lcom/bumptech/glide/c;->d:LF2/d;

    iget-object v6, v0, Lcom/bumptech/glide/c;->e:LF2/b;

    iget-object v8, v0, Lcom/bumptech/glide/c;->k:LQ2/c;

    iget v9, v0, Lcom/bumptech/glide/c;->l:I

    iget-object v10, v0, Lcom/bumptech/glide/c;->m:Lcom/bumptech/glide/b$a;

    iget-object v11, v0, Lcom/bumptech/glide/c;->a:Ljava/util/Map;

    iget-object v12, v0, Lcom/bumptech/glide/c;->q:Ljava/util/List;

    move-object/from16 v1, v16

    move-object/from16 v2, p1

    move-object/from16 v13, p2

    move-object/from16 v14, p3

    invoke-direct/range {v1 .. v15}, Lcom/bumptech/glide/b;-><init>(Landroid/content/Context;Lcom/bumptech/glide/load/engine/j;LG2/h;LF2/d;LF2/b;LQ2/o;LQ2/c;ILcom/bumptech/glide/b$a;Ljava/util/Map;Ljava/util/List;Ljava/util/List;LR2/a;Lcom/bumptech/glide/e;)V

    return-object v16
.end method

.method b(LQ2/o$b;)V
    .locals 0

    iput-object p1, p0, Lcom/bumptech/glide/c;->n:LQ2/o$b;

    return-void
.end method
