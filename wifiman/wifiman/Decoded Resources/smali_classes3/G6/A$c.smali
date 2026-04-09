.class final LG6/A$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG6/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private A:Lz2/a;

.field private B:Lz2/a;

.field private C:Lz2/a;

.field private D:Lz2/a;

.field private E:Lz2/a;

.field private F:Lz2/a;

.field private G:Lz2/a;

.field private H:Lz2/a;

.field private I:Lz2/a;

.field private J:Lz2/a;

.field private K:Lz2/a;

.field private L:Lz2/a;

.field private M:Lz2/a;

.field private N:Lz2/a;

.field private O:Lz2/a;

.field private P:Lz2/a;

.field private Q:Lz2/a;

.field private R:Lz2/a;

.field private S:Lz2/a;

.field private T:Lz2/a;

.field private U:Lz2/a;

.field private V:Lz2/a;

.field private W:Lz2/a;

.field private final a:Landroid/content/Context;

.field private final b:LG6/A$c;

.field private c:Lz2/a;

.field private d:Lz2/a;

.field private e:Lz2/a;

.field private f:Lz2/a;

.field private g:Lz2/a;

.field private h:Lz2/a;

.field private i:Lz2/a;

.field private j:Lz2/a;

.field private k:Lz2/a;

.field private l:Lz2/a;

.field private m:Lz2/a;

.field private n:Lz2/a;

.field private o:Lz2/a;

.field private p:Lz2/a;

.field private q:Lz2/a;

.field private r:Lz2/a;

.field private s:Lz2/a;

.field private t:Lz2/a;

.field private u:Lz2/a;

.field private v:Lz2/a;

.field private w:Lz2/a;

.field private x:Lz2/a;

.field private y:Lz2/a;

.field private z:Lz2/a;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p0, p0, LG6/A$c;->b:LG6/A$c;

    .line 4
    iput-object p1, p0, LG6/A$c;->a:Landroid/content/Context;

    .line 5
    invoke-direct {p0, p1}, LG6/A$c;->m(Landroid/content/Context;)V

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;LG6/A$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LG6/A$c;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic b(LG6/A$c;)Lz2/a;
    .locals 0

    iget-object p0, p0, LG6/A$c;->s:Lz2/a;

    return-object p0
.end method

.method static synthetic c(LG6/A$c;)Lz2/a;
    .locals 0

    iget-object p0, p0, LG6/A$c;->o:Lz2/a;

    return-object p0
.end method

.method static synthetic d(LG6/A$c;)Lz2/a;
    .locals 0

    iget-object p0, p0, LG6/A$c;->u:Lz2/a;

    return-object p0
.end method

.method static synthetic e(LG6/A$c;)LP6/G;
    .locals 0

    invoke-direct {p0}, LG6/A$c;->n()LP6/G;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f(LG6/A$c;)Lz2/a;
    .locals 0

    iget-object p0, p0, LG6/A$c;->U:Lz2/a;

    return-object p0
.end method

.method static synthetic g(LG6/A$c;)LG6/A$c;
    .locals 0

    iget-object p0, p0, LG6/A$c;->b:LG6/A$c;

    return-object p0
.end method

.method static synthetic h(LG6/A$c;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, LG6/A$c;->a:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic i(LG6/A$c;)Lz2/a;
    .locals 0

    iget-object p0, p0, LG6/A$c;->q:Lz2/a;

    return-object p0
.end method

.method static synthetic j(LG6/A$c;)Lz2/a;
    .locals 0

    iget-object p0, p0, LG6/A$c;->v:Lz2/a;

    return-object p0
.end method

.method static synthetic k(LG6/A$c;)Lz2/a;
    .locals 0

    iget-object p0, p0, LG6/A$c;->P:Lz2/a;

    return-object p0
.end method

.method static synthetic l(LG6/A$c;)Lz2/a;
    .locals 0

    iget-object p0, p0, LG6/A$c;->Q:Lz2/a;

    return-object p0
.end method

.method private m(Landroid/content/Context;)V
    .locals 18

    move-object/from16 v0, p0

    invoke-static/range {p1 .. p1}, Ly2/d;->a(Ljava/lang/Object;)Ly2/c;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->c:Lz2/a;

    invoke-static {v1}, LG6/i;->a(Lz2/a;)LG6/i;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->d:Lz2/a;

    iget-object v1, v0, LG6/A$c;->c:Lz2/a;

    invoke-static {v1}, LG6/r;->a(Lz2/a;)LG6/r;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->e:Lz2/a;

    iget-object v2, v0, LG6/A$c;->d:Lz2/a;

    invoke-static {v2, v1}, LP6/n;->a(Lz2/a;Lz2/a;)LP6/n;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->f:Lz2/a;

    iget-object v1, v0, LG6/A$c;->c:Lz2/a;

    invoke-static {v1}, LP6/p;->a(Lz2/a;)LP6/p;

    move-result-object v1

    invoke-static {v1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->g:Lz2/a;

    iget-object v1, v0, LG6/A$c;->c:Lz2/a;

    invoke-static {v1}, LG6/y;->a(Lz2/a;)LG6/y;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->h:Lz2/a;

    iget-object v1, v0, LG6/A$c;->c:Lz2/a;

    invoke-static {v1}, LG6/q;->a(Lz2/a;)LG6/q;

    move-result-object v1

    invoke-static {v1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->i:Lz2/a;

    invoke-static {}, LG6/j;->a()LG6/j;

    move-result-object v1

    iget-object v2, v0, LG6/A$c;->h:Lz2/a;

    iget-object v3, v0, LG6/A$c;->i:Lz2/a;

    invoke-static {v1, v2, v3}, LG6/v;->a(Lz2/a;Lz2/a;Lz2/a;)LG6/v;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->j:Lz2/a;

    iget-object v2, v0, LG6/A$c;->g:Lz2/a;

    invoke-static {v2, v1}, LP6/r;->a(Lz2/a;Lz2/a;)LP6/r;

    move-result-object v1

    invoke-static {v1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->k:Lz2/a;

    iget-object v1, v0, LG6/A$c;->c:Lz2/a;

    invoke-static {}, LG6/j;->a()LG6/j;

    move-result-object v2

    invoke-static {v1, v2}, LG6/o;->a(Lz2/a;Lz2/a;)LG6/o;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->l:Lz2/a;

    iget-object v1, v0, LG6/A$c;->f:Lz2/a;

    iget-object v2, v0, LG6/A$c;->k:Lz2/a;

    iget-object v3, v0, LG6/A$c;->h:Lz2/a;

    invoke-static {}, LG6/j;->a()LG6/j;

    move-result-object v4

    iget-object v5, v0, LG6/A$c;->l:Lz2/a;

    invoke-static {v1, v2, v3, v4, v5}, LP6/B;->a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LP6/B;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->m:Lz2/a;

    iget-object v1, v0, LG6/A$c;->f:Lz2/a;

    iget-object v2, v0, LG6/A$c;->k:Lz2/a;

    iget-object v3, v0, LG6/A$c;->l:Lz2/a;

    iget-object v4, v0, LG6/A$c;->i:Lz2/a;

    invoke-static {v1, v2, v3, v4}, LP6/D;->a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LP6/D;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->n:Lz2/a;

    iget-object v1, v0, LG6/A$c;->c:Lz2/a;

    invoke-static {v1}, LG6/f;->a(Lz2/a;)LG6/f;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->o:Lz2/a;

    invoke-static {v1}, LP6/d;->a(Lz2/a;)LP6/d;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->p:Lz2/a;

    invoke-static {}, LG6/b;->a()LG6/b;

    move-result-object v1

    invoke-static {v1}, LP6/H;->a(Lz2/a;)LP6/H;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->q:Lz2/a;

    invoke-static {}, LG6/d;->a()LG6/d;

    move-result-object v1

    invoke-static {v1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->r:Lz2/a;

    invoke-static {v1}, LG6/e;->a(Lz2/a;)LG6/e;

    move-result-object v1

    invoke-static {v1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->s:Lz2/a;

    invoke-static {v1}, LO6/c;->a(Lz2/a;)LO6/c;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->t:Lz2/a;

    invoke-static {v1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->u:Lz2/a;

    iget-object v1, v0, LG6/A$c;->c:Lz2/a;

    invoke-static {v1}, LG6/F;->a(Lz2/a;)LG6/F;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->v:Lz2/a;

    invoke-static {}, LG6/j;->a()LG6/j;

    move-result-object v1

    invoke-static {}, LP6/z;->a()LP6/z;

    move-result-object v2

    iget-object v3, v0, LG6/A$c;->m:Lz2/a;

    iget-object v4, v0, LG6/A$c;->n:Lz2/a;

    invoke-static {v1, v2, v3, v4}, LG6/t;->a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LG6/t;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->w:Lz2/a;

    iget-object v2, v0, LG6/A$c;->c:Lz2/a;

    invoke-static {v2, v1}, LP6/w;->a(Lz2/a;Lz2/a;)LP6/w;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->x:Lz2/a;

    invoke-static {}, LG6/j;->a()LG6/j;

    move-result-object v1

    iget-object v2, v0, LG6/A$c;->x:Lz2/a;

    invoke-static {v1, v2}, LG6/s;->a(Lz2/a;Lz2/a;)LG6/s;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->y:Lz2/a;

    iget-object v2, v0, LG6/A$c;->q:Lz2/a;

    iget-object v3, v0, LG6/A$c;->v:Lz2/a;

    iget-object v4, v0, LG6/A$c;->w:Lz2/a;

    invoke-static {}, LG6/g;->a()LG6/g;

    move-result-object v5

    invoke-static {v2, v3, v1, v4, v5}, LP6/t;->a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LP6/t;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->z:Lz2/a;

    invoke-static {}, LJ6/c;->a()LJ6/c;

    move-result-object v1

    invoke-static {v1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->A:Lz2/a;

    new-instance v1, LG6/A$c$a;

    invoke-direct {v1, v0}, LG6/A$c$a;-><init>(LG6/A$c;)V

    iput-object v1, v0, LG6/A$c;->B:Lz2/a;

    iget-object v2, v0, LG6/A$c;->A:Lz2/a;

    invoke-static {v2, v1}, LI6/p;->a(Lz2/a;Lz2/a;)LI6/p;

    move-result-object v1

    invoke-static {v1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->C:Lz2/a;

    invoke-static {}, LG6/j;->a()LG6/j;

    move-result-object v1

    invoke-static {}, LN6/l;->a()LN6/l;

    move-result-object v2

    invoke-static {}, LN6/n;->a()LN6/n;

    move-result-object v3

    invoke-static {v1, v2, v3}, LG6/p;->a(Lz2/a;Lz2/a;Lz2/a;)LG6/p;

    move-result-object v1

    invoke-static {v1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->D:Lz2/a;

    invoke-static {}, LP6/J;->a()LP6/J;

    move-result-object v1

    iget-object v2, v0, LG6/A$c;->D:Lz2/a;

    invoke-static {v1, v2}, LN6/g;->a(Lz2/a;Lz2/a;)LN6/g;

    move-result-object v1

    invoke-static {v1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->E:Lz2/a;

    invoke-static {}, LG6/g;->a()LG6/g;

    move-result-object v1

    invoke-static {v1}, LN6/z;->a(Lz2/a;)LN6/z;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->F:Lz2/a;

    iget-object v2, v0, LG6/A$c;->q:Lz2/a;

    iget-object v3, v0, LG6/A$c;->E:Lz2/a;

    invoke-static {v2, v3, v1}, LN6/D;->a(Lz2/a;Lz2/a;Lz2/a;)LN6/D;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->G:Lz2/a;

    invoke-static {}, LG6/j;->a()LG6/j;

    move-result-object v1

    invoke-static {v1}, LN6/b;->a(Lz2/a;)LN6/b;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->H:Lz2/a;

    iget-object v2, v0, LG6/A$c;->q:Lz2/a;

    iget-object v3, v0, LG6/A$c;->E:Lz2/a;

    iget-object v4, v0, LG6/A$c;->F:Lz2/a;

    invoke-static {v2, v3, v4, v1}, LN6/F;->a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LN6/F;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->I:Lz2/a;

    iget-object v1, v0, LG6/A$c;->q:Lz2/a;

    iget-object v2, v0, LG6/A$c;->E:Lz2/a;

    iget-object v3, v0, LG6/A$c;->F:Lz2/a;

    iget-object v4, v0, LG6/A$c;->H:Lz2/a;

    invoke-static {v1, v2, v3, v4}, LN6/H;->a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LN6/H;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->J:Lz2/a;

    invoke-static {}, LG6/j;->a()LG6/j;

    move-result-object v1

    iget-object v2, v0, LG6/A$c;->G:Lz2/a;

    iget-object v3, v0, LG6/A$c;->I:Lz2/a;

    iget-object v4, v0, LG6/A$c;->J:Lz2/a;

    invoke-static {v1, v2, v3, v4}, LG6/x;->a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LG6/x;

    move-result-object v1

    invoke-static {v1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->K:Lz2/a;

    iget-object v1, v0, LG6/A$c;->q:Lz2/a;

    iget-object v2, v0, LG6/A$c;->w:Lz2/a;

    invoke-static {v1, v2}, LN6/s;->a(Lz2/a;Lz2/a;)LN6/s;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->L:Lz2/a;

    invoke-static {}, LG6/g;->a()LG6/g;

    move-result-object v2

    invoke-static {v1, v2}, LN6/u;->a(Lz2/a;Lz2/a;)LN6/u;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->M:Lz2/a;

    invoke-static {}, LG6/j;->a()LG6/j;

    move-result-object v1

    iget-object v2, v0, LG6/A$c;->L:Lz2/a;

    iget-object v3, v0, LG6/A$c;->M:Lz2/a;

    invoke-static {v1, v2, v3}, LG6/w;->a(Lz2/a;Lz2/a;Lz2/a;)LG6/w;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->N:Lz2/a;

    iget-object v1, v0, LG6/A$c;->C:Lz2/a;

    invoke-static {v1}, LN6/i;->a(Lz2/a;)LN6/i;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->O:Lz2/a;

    invoke-static {}, LG6/c;->a()LG6/c;

    move-result-object v1

    invoke-static {v1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->P:Lz2/a;

    invoke-static {}, LG6/h;->a()LG6/h;

    move-result-object v1

    invoke-static {v1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->Q:Lz2/a;

    iget-object v2, v0, LG6/A$c;->r:Lz2/a;

    iget-object v3, v0, LG6/A$c;->P:Lz2/a;

    invoke-static {v2, v3, v1}, LG6/n;->a(Lz2/a;Lz2/a;Lz2/a;)LG6/n;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->R:Lz2/a;

    iget-object v1, v0, LG6/A$c;->q:Lz2/a;

    iget-object v2, v0, LG6/A$c;->H:Lz2/a;

    iget-object v3, v0, LG6/A$c;->E:Lz2/a;

    iget-object v4, v0, LG6/A$c;->O:Lz2/a;

    invoke-static {v1, v2, v3, v4}, LN6/d;->a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LN6/d;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->S:Lz2/a;

    invoke-static {}, LG6/j;->a()LG6/j;

    move-result-object v1

    iget-object v2, v0, LG6/A$c;->h:Lz2/a;

    invoke-static {v1, v2}, LG6/u;->a(Lz2/a;Lz2/a;)LG6/u;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->T:Lz2/a;

    iget-object v2, v0, LG6/A$c;->g:Lz2/a;

    invoke-static {v2, v1}, LP6/k;->a(Lz2/a;Lz2/a;)LP6/k;

    move-result-object v1

    invoke-static {v1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->U:Lz2/a;

    iget-object v2, v0, LG6/A$c;->p:Lz2/a;

    iget-object v3, v0, LG6/A$c;->q:Lz2/a;

    iget-object v4, v0, LG6/A$c;->u:Lz2/a;

    iget-object v5, v0, LG6/A$c;->v:Lz2/a;

    invoke-static {}, LP6/J;->a()LP6/J;

    move-result-object v6

    iget-object v7, v0, LG6/A$c;->w:Lz2/a;

    iget-object v8, v0, LG6/A$c;->z:Lz2/a;

    iget-object v9, v0, LG6/A$c;->C:Lz2/a;

    iget-object v10, v0, LG6/A$c;->K:Lz2/a;

    iget-object v11, v0, LG6/A$c;->N:Lz2/a;

    iget-object v12, v0, LG6/A$c;->O:Lz2/a;

    iget-object v13, v0, LG6/A$c;->s:Lz2/a;

    iget-object v14, v0, LG6/A$c;->R:Lz2/a;

    iget-object v15, v0, LG6/A$c;->S:Lz2/a;

    iget-object v1, v0, LG6/A$c;->k:Lz2/a;

    move-object/from16 v16, v1

    iget-object v1, v0, LG6/A$c;->U:Lz2/a;

    move-object/from16 v17, v1

    invoke-static/range {v2 .. v17}, LG6/M;->a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LG6/M;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->V:Lz2/a;

    invoke-static {v1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object v1

    iput-object v1, v0, LG6/A$c;->W:Lz2/a;

    return-void
.end method

.method private n()LP6/G;
    .locals 2

    new-instance v0, LP6/G;

    invoke-static {}, LG6/a$c;->a()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v1

    invoke-direct {v0, v1}, LP6/G;-><init>(Landroid/bluetooth/BluetoothAdapter;)V

    return-object v0
.end method


# virtual methods
.method public a()LG6/G;
    .locals 1

    iget-object v0, p0, LG6/A$c;->W:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LG6/G;

    return-object v0
.end method
