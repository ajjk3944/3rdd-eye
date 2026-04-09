.class final LG6/A$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG6/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field private A:Lz2/a;

.field private B:Lz2/a;

.field private C:Lz2/a;

.field private D:Lz2/a;

.field private final a:Ljava/lang/Boolean;

.field private final b:LG6/A$c;

.field private final c:LG6/A$g;

.field private final d:LG6/A$e;

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
.method private constructor <init>(LG6/A$c;LG6/A$g;Ljava/lang/Boolean;Ljava/lang/Boolean;LG6/S;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p0, p0, LG6/A$e;->d:LG6/A$e;

    .line 4
    iput-object p1, p0, LG6/A$e;->b:LG6/A$c;

    .line 5
    iput-object p2, p0, LG6/A$e;->c:LG6/A$g;

    .line 6
    iput-object p3, p0, LG6/A$e;->a:Ljava/lang/Boolean;

    .line 7
    invoke-direct {p0, p3, p4, p5}, LG6/A$e;->f(Ljava/lang/Boolean;Ljava/lang/Boolean;LG6/S;)V

    return-void
.end method

.method synthetic constructor <init>(LG6/A$c;LG6/A$g;Ljava/lang/Boolean;Ljava/lang/Boolean;LG6/S;LG6/A$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LG6/A$e;-><init>(LG6/A$c;LG6/A$g;Ljava/lang/Boolean;Ljava/lang/Boolean;LG6/S;)V

    return-void
.end method

.method private e()LP6/b;
    .locals 2

    new-instance v0, LP6/b;

    iget-object v1, p0, LG6/A$e;->b:LG6/A$c;

    invoke-static {v1}, LG6/A$c;->h(LG6/A$c;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LP6/b;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private f(Ljava/lang/Boolean;Ljava/lang/Boolean;LG6/S;)V
    .locals 11

    invoke-static {}, LK6/b;->a()LK6/b;

    move-result-object p1

    invoke-static {p1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->e:Lz2/a;

    iget-object p1, p0, LG6/A$e;->c:LG6/A$g;

    invoke-static {p1}, LG6/A$g;->h(LG6/A$g;)Lz2/a;

    move-result-object p1

    iget-object v0, p0, LG6/A$e;->b:LG6/A$c;

    invoke-static {v0}, LG6/A$c;->i(LG6/A$c;)Lz2/a;

    move-result-object v0

    iget-object v1, p0, LG6/A$e;->b:LG6/A$c;

    invoke-static {v1}, LG6/A$c;->j(LG6/A$c;)Lz2/a;

    move-result-object v1

    invoke-static {p1, v0, v1}, LK6/C;->a(Lz2/a;Lz2/a;Lz2/a;)LK6/C;

    move-result-object p1

    invoke-static {p1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->f:Lz2/a;

    iget-object p1, p0, LG6/A$e;->b:LG6/A$c;

    invoke-static {p1}, LG6/A$c;->k(LG6/A$c;)Lz2/a;

    move-result-object p1

    iget-object v0, p0, LG6/A$e;->e:Lz2/a;

    iget-object v1, p0, LG6/A$e;->f:Lz2/a;

    invoke-static {}, LK6/U;->a()LK6/U;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, LK6/m0;->a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LK6/m0;

    move-result-object p1

    invoke-static {p1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->g:Lz2/a;

    iget-object p1, p0, LG6/A$e;->c:LG6/A$g;

    invoke-static {p1}, LG6/A$g;->h(LG6/A$g;)Lz2/a;

    move-result-object p1

    iget-object v0, p0, LG6/A$e;->f:Lz2/a;

    iget-object v1, p0, LG6/A$e;->b:LG6/A$c;

    invoke-static {v1}, LG6/A$c;->l(LG6/A$c;)Lz2/a;

    move-result-object v1

    iget-object v2, p0, LG6/A$e;->b:LG6/A$c;

    invoke-static {v2}, LG6/A$c;->b(LG6/A$c;)Lz2/a;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, LO6/f;->a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LO6/f;

    move-result-object p1

    invoke-static {p1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->h:Lz2/a;

    iget-object p1, p0, LG6/A$e;->e:Lz2/a;

    invoke-static {p1}, LK6/h;->a(Lz2/a;)LK6/h;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->i:Lz2/a;

    invoke-static {}, LK6/i;->a()LK6/i;

    move-result-object p1

    invoke-static {p1}, LL6/d;->a(Lz2/a;)LL6/d;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->j:Lz2/a;

    invoke-static {p3}, Ly2/d;->a(Ljava/lang/Object;)Ly2/c;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->k:Lz2/a;

    invoke-static {}, LG6/g;->a()LG6/g;

    move-result-object p1

    iget-object p3, p0, LG6/A$e;->k:Lz2/a;

    invoke-static {p1, p3}, LK6/k;->a(Lz2/a;Lz2/a;)LK6/k;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->l:Lz2/a;

    iget-object p3, p0, LG6/A$e;->g:Lz2/a;

    iget-object v0, p0, LG6/A$e;->i:Lz2/a;

    invoke-static {p3, v0, p1}, LM6/o;->a(Lz2/a;Lz2/a;Lz2/a;)LM6/o;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->m:Lz2/a;

    iget-object v0, p0, LG6/A$e;->g:Lz2/a;

    iget-object v1, p0, LG6/A$e;->i:Lz2/a;

    iget-object v2, p0, LG6/A$e;->j:Lz2/a;

    iget-object v3, p0, LG6/A$e;->l:Lz2/a;

    iget-object p1, p0, LG6/A$e;->b:LG6/A$c;

    invoke-static {p1}, LG6/A$c;->b(LG6/A$c;)Lz2/a;

    move-result-object v4

    invoke-static {}, LG6/g;->a()LG6/g;

    move-result-object v5

    iget-object v6, p0, LG6/A$e;->m:Lz2/a;

    invoke-static/range {v0 .. v6}, LM6/m;->a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LM6/m;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->n:Lz2/a;

    iget-object p3, p0, LG6/A$e;->h:Lz2/a;

    iget-object v0, p0, LG6/A$e;->i:Lz2/a;

    invoke-static {p3, v0, p1}, LK6/o0;->a(Lz2/a;Lz2/a;Lz2/a;)LK6/o0;

    move-result-object p1

    invoke-static {p1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->o:Lz2/a;

    iget-object p1, p0, LG6/A$e;->h:Lz2/a;

    iget-object p3, p0, LG6/A$e;->n:Lz2/a;

    invoke-static {p1, p3}, LK6/x;->a(Lz2/a;Lz2/a;)LK6/x;

    move-result-object p1

    invoke-static {p1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->p:Lz2/a;

    invoke-static {}, LG6/m;->a()LG6/m;

    move-result-object v0

    invoke-static {}, LG6/l;->a()LG6/l;

    move-result-object v1

    invoke-static {}, LG6/k;->a()LG6/k;

    move-result-object v2

    iget-object v3, p0, LG6/A$e;->i:Lz2/a;

    iget-object v4, p0, LG6/A$e;->g:Lz2/a;

    iget-object v5, p0, LG6/A$e;->p:Lz2/a;

    invoke-static/range {v0 .. v5}, LK6/h0;->a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LK6/h0;

    move-result-object p1

    invoke-static {p1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->q:Lz2/a;

    iget-object p1, p0, LG6/A$e;->g:Lz2/a;

    invoke-static {}, LK6/g;->a()LK6/g;

    move-result-object p3

    invoke-static {p1, p3}, LK6/S;->a(Lz2/a;Lz2/a;)LK6/S;

    move-result-object p1

    invoke-static {p1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->r:Lz2/a;

    new-instance p1, Ly2/a;

    invoke-direct {p1}, Ly2/a;-><init>()V

    iput-object p1, p0, LG6/A$e;->s:Lz2/a;

    invoke-static {}, LG6/j;->a()LG6/j;

    move-result-object p1

    invoke-static {p1}, LK6/f;->a(Lz2/a;)LK6/f;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->t:Lz2/a;

    iget-object p1, p0, LG6/A$e;->s:Lz2/a;

    invoke-static {}, LK6/e;->a()LK6/e;

    move-result-object p3

    iget-object v0, p0, LG6/A$e;->t:Lz2/a;

    invoke-static {p1, p3, v0}, LK6/O;->a(Lz2/a;Lz2/a;Lz2/a;)LK6/O;

    move-result-object p1

    invoke-static {p1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->u:Lz2/a;

    iget-object p3, p0, LG6/A$e;->h:Lz2/a;

    iget-object v0, p0, LG6/A$e;->s:Lz2/a;

    iget-object v1, p0, LG6/A$e;->n:Lz2/a;

    invoke-static {p3, p1, v0, v1}, LK6/M;->a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LK6/M;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->v:Lz2/a;

    invoke-static {p2}, Ly2/d;->a(Ljava/lang/Object;)Ly2/c;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->w:Lz2/a;

    invoke-static {}, LK6/i;->a()LK6/i;

    move-result-object p1

    invoke-static {p1}, LK6/H;->a(Lz2/a;)LK6/H;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->x:Lz2/a;

    invoke-static {p1}, LK6/K;->a(Lz2/a;)LK6/K;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->y:Lz2/a;

    iget-object p1, p0, LG6/A$e;->x:Lz2/a;

    invoke-static {p1}, LK6/q0;->a(Lz2/a;)LK6/q0;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->z:Lz2/a;

    iget-object p2, p0, LG6/A$e;->w:Lz2/a;

    iget-object p3, p0, LG6/A$e;->y:Lz2/a;

    invoke-static {p2, p3, p1}, LK6/j;->a(Lz2/a;Lz2/a;Lz2/a;)LK6/j;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->A:Lz2/a;

    invoke-static {p1}, LK6/E;->a(Lz2/a;)LK6/E;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->B:Lz2/a;

    iget-object p1, p0, LG6/A$e;->s:Lz2/a;

    iget-object v0, p0, LG6/A$e;->h:Lz2/a;

    iget-object v1, p0, LG6/A$e;->g:Lz2/a;

    iget-object v2, p0, LG6/A$e;->i:Lz2/a;

    iget-object v3, p0, LG6/A$e;->o:Lz2/a;

    iget-object v4, p0, LG6/A$e;->q:Lz2/a;

    iget-object v5, p0, LG6/A$e;->r:Lz2/a;

    iget-object v6, p0, LG6/A$e;->p:Lz2/a;

    iget-object v7, p0, LG6/A$e;->n:Lz2/a;

    iget-object v8, p0, LG6/A$e;->v:Lz2/a;

    iget-object p2, p0, LG6/A$e;->b:LG6/A$c;

    invoke-static {p2}, LG6/A$c;->b(LG6/A$c;)Lz2/a;

    move-result-object v9

    iget-object v10, p0, LG6/A$e;->B:Lz2/a;

    invoke-static/range {v0 .. v10}, LK6/k0;->a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LK6/k0;

    move-result-object p2

    invoke-static {p2}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object p2

    invoke-static {p1, p2}, Ly2/a;->a(Lz2/a;Lz2/a;)V

    iget-object v0, p0, LG6/A$e;->g:Lz2/a;

    iget-object v1, p0, LG6/A$e;->e:Lz2/a;

    iget-object p1, p0, LG6/A$e;->c:LG6/A$g;

    invoke-static {p1}, LG6/A$g;->h(LG6/A$g;)Lz2/a;

    move-result-object v2

    iget-object p1, p0, LG6/A$e;->b:LG6/A$c;

    invoke-static {p1}, LG6/A$c;->c(LG6/A$c;)Lz2/a;

    move-result-object v3

    iget-object p1, p0, LG6/A$e;->b:LG6/A$c;

    invoke-static {p1}, LG6/A$c;->b(LG6/A$c;)Lz2/a;

    move-result-object v4

    iget-object p1, p0, LG6/A$e;->c:LG6/A$g;

    invoke-static {p1}, LG6/A$g;->b(LG6/A$g;)Lz2/a;

    move-result-object v5

    iget-object p1, p0, LG6/A$e;->c:LG6/A$g;

    invoke-static {p1}, LG6/A$g;->c(LG6/A$g;)Lz2/a;

    move-result-object v6

    invoke-static/range {v0 .. v6}, LM6/h;->a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LM6/h;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->C:Lz2/a;

    iget-object p1, p0, LG6/A$e;->b:LG6/A$c;

    invoke-static {p1}, LG6/A$c;->d(LG6/A$c;)Lz2/a;

    move-result-object p1

    iget-object p2, p0, LG6/A$e;->C:Lz2/a;

    invoke-static {p1, p2}, LK6/z;->a(Lz2/a;Lz2/a;)LK6/z;

    move-result-object p1

    invoke-static {p1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object p1

    iput-object p1, p0, LG6/A$e;->D:Lz2/a;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 2

    const/4 v0, 0x3

    invoke-static {v0}, Ly2/f;->c(I)Ly2/f;

    move-result-object v0

    iget-object v1, p0, LG6/A$e;->r:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LK6/n;

    invoke-virtual {v0, v1}, Ly2/f;->a(Ljava/lang/Object;)Ly2/f;

    move-result-object v0

    iget-object v1, p0, LG6/A$e;->D:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LK6/n;

    invoke-virtual {v0, v1}, Ly2/f;->a(Ljava/lang/Object;)Ly2/f;

    move-result-object v0

    iget-object v1, p0, LG6/A$e;->h:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LK6/n;

    invoke-virtual {v0, v1}, Ly2/f;->a(Ljava/lang/Object;)Ly2/f;

    move-result-object v0

    invoke-virtual {v0}, Ly2/f;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public b()LM6/c;
    .locals 8

    iget-object v0, p0, LG6/A$e;->c:LG6/A$g;

    invoke-static {v0}, LG6/A$g;->d(LG6/A$g;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-direct {p0}, LG6/A$e;->e()LP6/b;

    move-result-object v2

    iget-object v0, p0, LG6/A$e;->g:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LK6/l0;

    iget-object v0, p0, LG6/A$e;->e:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LK6/a;

    iget-object v0, p0, LG6/A$e;->c:LG6/A$g;

    invoke-static {v0}, LG6/A$g;->e(LG6/A$g;)LM6/x;

    move-result-object v5

    iget-object v0, p0, LG6/A$e;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iget-object v0, p0, LG6/A$e;->c:LG6/A$g;

    invoke-static {v0}, LG6/A$g;->c(LG6/A$g;)Lz2/a;

    move-result-object v0

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LK6/m;

    invoke-static/range {v1 .. v7}, LM6/d;->a(Landroid/bluetooth/BluetoothDevice;LP6/b;LK6/l0;LK6/a;LM6/x;ZLK6/m;)LM6/c;

    move-result-object v0

    return-object v0
.end method

.method public c()LK6/l0;
    .locals 1

    iget-object v0, p0, LG6/A$e;->g:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK6/l0;

    return-object v0
.end method

.method public d()LG6/N;
    .locals 1

    iget-object v0, p0, LG6/A$e;->s:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LG6/N;

    return-object v0
.end method
