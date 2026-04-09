.class public final Lk3/N;
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

    iput-object p1, p0, Lk3/N;->a:LJg/a;

    iput-object p2, p0, Lk3/N;->b:LJg/a;

    iput-object p3, p0, Lk3/N;->c:LJg/a;

    iput-object p4, p0, Lk3/N;->d:LJg/a;

    iput-object p5, p0, Lk3/N;->e:LJg/a;

    return-void
.end method

.method public static a(LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;)Lk3/N;
    .locals 7

    new-instance v6, Lk3/N;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lk3/N;-><init>(LJg/a;LJg/a;LJg/a;LJg/a;LJg/a;)V

    return-object v6
.end method

.method public static c(Lm3/a;Lm3/a;Ljava/lang/Object;Ljava/lang/Object;LJg/a;)Lk3/M;
    .locals 7

    new-instance v6, Lk3/M;

    move-object v3, p2

    check-cast v3, Lk3/e;

    move-object v4, p3

    check-cast v4, Lk3/W;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lk3/M;-><init>(Lm3/a;Lm3/a;Lk3/e;Lk3/W;LJg/a;)V

    return-object v6
.end method


# virtual methods
.method public b()Lk3/M;
    .locals 5

    iget-object v0, p0, Lk3/N;->a:LJg/a;

    invoke-interface {v0}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm3/a;

    iget-object v1, p0, Lk3/N;->b:LJg/a;

    invoke-interface {v1}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm3/a;

    iget-object v2, p0, Lk3/N;->c:LJg/a;

    invoke-interface {v2}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lk3/N;->d:LJg/a;

    invoke-interface {v3}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lk3/N;->e:LJg/a;

    invoke-static {v0, v1, v2, v3, v4}, Lk3/N;->c(Lm3/a;Lm3/a;Ljava/lang/Object;Ljava/lang/Object;LJg/a;)Lk3/M;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lk3/N;->b()Lk3/M;

    move-result-object v0

    return-object v0
.end method
