.class public final Lj3/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le3/b;


# instance fields
.field private final a:LJg/a;

.field private final b:LJg/a;

.field private final c:LJg/a;

.field private final d:LJg/a;

.field private final e:LJg/a;

.field private final f:LJg/a;

.field private final g:LJg/a;

.field private final h:LJg/a;

.field private final i:LJg/a;


# direct methods
.method public constructor <init>(LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/s;->a:LJg/a;

    iput-object p2, p0, Lj3/s;->b:LJg/a;

    iput-object p3, p0, Lj3/s;->c:LJg/a;

    iput-object p4, p0, Lj3/s;->d:LJg/a;

    iput-object p5, p0, Lj3/s;->e:LJg/a;

    iput-object p6, p0, Lj3/s;->f:LJg/a;

    iput-object p7, p0, Lj3/s;->g:LJg/a;

    iput-object p8, p0, Lj3/s;->h:LJg/a;

    iput-object p9, p0, Lj3/s;->i:LJg/a;

    return-void
.end method

.method public static a(LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;)Lj3/s;
    .locals 11

    new-instance v10, Lj3/s;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lj3/s;-><init>(LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;)V

    return-object v10
.end method

.method public static c(Landroid/content/Context;Ld3/e;Lk3/d;Lj3/x;Ljava/util/concurrent/Executor;Ll3/a;Lm3/a;Lm3/a;Lk3/c;)Lj3/r;
    .locals 11

    new-instance v10, Lj3/r;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lj3/r;-><init>(Landroid/content/Context;Ld3/e;Lk3/d;Lj3/x;Ljava/util/concurrent/Executor;Ll3/a;Lm3/a;Lm3/a;Lk3/c;)V

    return-object v10
.end method


# virtual methods
.method public b()Lj3/r;
    .locals 10

    iget-object v0, p0, Lj3/s;->a:LJg/a;

    invoke-interface {v0}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Lj3/s;->b:LJg/a;

    invoke-interface {v0}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ld3/e;

    iget-object v0, p0, Lj3/s;->c:LJg/a;

    invoke-interface {v0}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lk3/d;

    iget-object v0, p0, Lj3/s;->d:LJg/a;

    invoke-interface {v0}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lj3/x;

    iget-object v0, p0, Lj3/s;->e:LJg/a;

    invoke-interface {v0}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lj3/s;->f:LJg/a;

    invoke-interface {v0}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ll3/a;

    iget-object v0, p0, Lj3/s;->g:LJg/a;

    invoke-interface {v0}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lm3/a;

    iget-object v0, p0, Lj3/s;->h:LJg/a;

    invoke-interface {v0}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lm3/a;

    iget-object v0, p0, Lj3/s;->i:LJg/a;

    invoke-interface {v0}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lk3/c;

    invoke-static/range {v1 .. v9}, Lj3/s;->c(Landroid/content/Context;Ld3/e;Lk3/d;Lj3/x;Ljava/util/concurrent/Executor;Ll3/a;Lm3/a;Lm3/a;Lk3/c;)Lj3/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lj3/s;->b()Lj3/r;

    move-result-object v0

    return-object v0
.end method
