.class public final Ld3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le3/b;


# instance fields
.field private final a:LJg/a;

.field private final b:LJg/a;

.field private final c:LJg/a;


# direct methods
.method public constructor <init>(LJg/a;LJg/a;LJg/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld3/j;->a:LJg/a;

    iput-object p2, p0, Ld3/j;->b:LJg/a;

    iput-object p3, p0, Ld3/j;->c:LJg/a;

    return-void
.end method

.method public static a(LJg/a;LJg/a;LJg/a;)Ld3/j;
    .locals 1

    new-instance v0, Ld3/j;

    invoke-direct {v0, p0, p1, p2}, Ld3/j;-><init>(LJg/a;LJg/a;LJg/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lm3/a;Lm3/a;)Ld3/i;
    .locals 1

    new-instance v0, Ld3/i;

    invoke-direct {v0, p0, p1, p2}, Ld3/i;-><init>(Landroid/content/Context;Lm3/a;Lm3/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Ld3/i;
    .locals 3

    iget-object v0, p0, Ld3/j;->a:LJg/a;

    invoke-interface {v0}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Ld3/j;->b:LJg/a;

    invoke-interface {v1}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm3/a;

    iget-object v2, p0, Ld3/j;->c:LJg/a;

    invoke-interface {v2}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm3/a;

    invoke-static {v0, v1, v2}, Ld3/j;->c(Landroid/content/Context;Lm3/a;Lm3/a;)Ld3/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ld3/j;->b()Ld3/i;

    move-result-object v0

    return-object v0
.end method
