.class public final Lc3/w;
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

    iput-object p1, p0, Lc3/w;->a:LJg/a;

    iput-object p2, p0, Lc3/w;->b:LJg/a;

    iput-object p3, p0, Lc3/w;->c:LJg/a;

    iput-object p4, p0, Lc3/w;->d:LJg/a;

    iput-object p5, p0, Lc3/w;->e:LJg/a;

    return-void
.end method

.method public static a(LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;)Lc3/w;
    .locals 7

    new-instance v6, Lc3/w;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lc3/w;-><init>(LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;)V

    return-object v6
.end method

.method public static c(Lm3/a;Lm3/a;Li3/e;Lj3/r;Lj3/v;)Lc3/u;
    .locals 7

    new-instance v6, Lc3/u;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lc3/u;-><init>(Lm3/a;Lm3/a;Li3/e;Lj3/r;Lj3/v;)V

    return-object v6
.end method


# virtual methods
.method public b()Lc3/u;
    .locals 5

    iget-object v0, p0, Lc3/w;->a:LJg/a;

    invoke-interface {v0}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm3/a;

    iget-object v1, p0, Lc3/w;->b:LJg/a;

    invoke-interface {v1}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm3/a;

    iget-object v2, p0, Lc3/w;->c:LJg/a;

    invoke-interface {v2}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li3/e;

    iget-object v3, p0, Lc3/w;->d:LJg/a;

    invoke-interface {v3}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj3/r;

    iget-object v4, p0, Lc3/w;->e:LJg/a;

    invoke-interface {v4}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj3/v;

    invoke-static {v0, v1, v2, v3, v4}, Lc3/w;->c(Lm3/a;Lm3/a;Li3/e;Lj3/r;Lj3/v;)Lc3/u;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lc3/w;->b()Lc3/u;

    move-result-object v0

    return-object v0
.end method
