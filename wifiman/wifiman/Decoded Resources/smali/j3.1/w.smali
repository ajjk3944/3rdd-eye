.class public final Lj3/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le3/b;


# instance fields
.field private final a:LJg/a;

.field private final b:LJg/a;

.field private final c:LJg/a;

.field private final d:LJg/a;


# direct methods
.method public constructor <init>(LJg/a;LJg/a;LJg/a;LJg/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/w;->a:LJg/a;

    iput-object p2, p0, Lj3/w;->b:LJg/a;

    iput-object p3, p0, Lj3/w;->c:LJg/a;

    iput-object p4, p0, Lj3/w;->d:LJg/a;

    return-void
.end method

.method public static a(LJg/a;LJg/a;LJg/a;LJg/a;)Lj3/w;
    .locals 1

    new-instance v0, Lj3/w;

    invoke-direct {v0, p0, p1, p2, p3}, Lj3/w;-><init>(LJg/a;LJg/a;LJg/a;LJg/a;)V

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/Executor;Lk3/d;Lj3/x;Ll3/a;)Lj3/v;
    .locals 1

    new-instance v0, Lj3/v;

    invoke-direct {v0, p0, p1, p2, p3}, Lj3/v;-><init>(Ljava/util/concurrent/Executor;Lk3/d;Lj3/x;Ll3/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lj3/v;
    .locals 4

    iget-object v0, p0, Lj3/w;->a:LJg/a;

    invoke-interface {v0}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lj3/w;->b:LJg/a;

    invoke-interface {v1}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk3/d;

    iget-object v2, p0, Lj3/w;->c:LJg/a;

    invoke-interface {v2}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj3/x;

    iget-object v3, p0, Lj3/w;->d:LJg/a;

    invoke-interface {v3}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll3/a;

    invoke-static {v0, v1, v2, v3}, Lj3/w;->c(Ljava/util/concurrent/Executor;Lk3/d;Lj3/x;Ll3/a;)Lj3/v;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lj3/w;->b()Lj3/v;

    move-result-object v0

    return-object v0
.end method
