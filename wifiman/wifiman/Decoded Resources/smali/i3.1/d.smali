.class public final Li3/d;
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


# direct methods
.method public constructor <init>(LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/d;->a:LJg/a;

    iput-object p2, p0, Li3/d;->b:LJg/a;

    iput-object p3, p0, Li3/d;->c:LJg/a;

    iput-object p4, p0, Li3/d;->d:LJg/a;

    iput-object p5, p0, Li3/d;->e:LJg/a;

    return-void
.end method

.method public static a(LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;)Li3/d;
    .locals 7

    new-instance v6, Li3/d;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Li3/d;-><init>(LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;)V

    return-object v6
.end method

.method public static c(Ljava/util/concurrent/Executor;Ld3/e;Lj3/x;Lk3/d;Ll3/a;)Li3/c;
    .locals 7

    new-instance v6, Li3/c;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Li3/c;-><init>(Ljava/util/concurrent/Executor;Ld3/e;Lj3/x;Lk3/d;Ll3/a;)V

    return-object v6
.end method


# virtual methods
.method public b()Li3/c;
    .locals 5

    iget-object v0, p0, Li3/d;->a:LJg/a;

    invoke-interface {v0}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Li3/d;->b:LJg/a;

    invoke-interface {v1}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld3/e;

    iget-object v2, p0, Li3/d;->c:LJg/a;

    invoke-interface {v2}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj3/x;

    iget-object v3, p0, Li3/d;->d:LJg/a;

    invoke-interface {v3}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk3/d;

    iget-object v4, p0, Li3/d;->e:LJg/a;

    invoke-interface {v4}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll3/a;

    invoke-static {v0, v1, v2, v3, v4}, Li3/d;->c(Ljava/util/concurrent/Executor;Ld3/e;Lj3/x;Lk3/d;Ll3/a;)Li3/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li3/d;->b()Li3/c;

    move-result-object v0

    return-object v0
.end method
