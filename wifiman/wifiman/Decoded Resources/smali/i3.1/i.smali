.class public final Li3/i;
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

    iput-object p1, p0, Li3/i;->a:LJg/a;

    iput-object p2, p0, Li3/i;->b:LJg/a;

    iput-object p3, p0, Li3/i;->c:LJg/a;

    iput-object p4, p0, Li3/i;->d:LJg/a;

    return-void
.end method

.method public static a(LJg/a;LJg/a;LJg/a;LJg/a;)Li3/i;
    .locals 1

    new-instance v0, Li3/i;

    invoke-direct {v0, p0, p1, p2, p3}, Li3/i;-><init>(LJg/a;LJg/a;LJg/a;LJg/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lk3/d;Lj3/f;Lm3/a;)Lj3/x;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Li3/h;->a(Landroid/content/Context;Lk3/d;Lj3/f;Lm3/a;)Lj3/x;

    move-result-object p0

    invoke-static {p0}, Le3/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj3/x;

    return-object p0
.end method


# virtual methods
.method public b()Lj3/x;
    .locals 4

    iget-object v0, p0, Li3/i;->a:LJg/a;

    invoke-interface {v0}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Li3/i;->b:LJg/a;

    invoke-interface {v1}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk3/d;

    iget-object v2, p0, Li3/i;->c:LJg/a;

    invoke-interface {v2}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj3/f;

    iget-object v3, p0, Li3/i;->d:LJg/a;

    invoke-interface {v3}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm3/a;

    invoke-static {v0, v1, v2, v3}, Li3/i;->c(Landroid/content/Context;Lk3/d;Lj3/f;Lm3/a;)Lj3/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li3/i;->b()Lj3/x;

    move-result-object v0

    return-object v0
.end method
