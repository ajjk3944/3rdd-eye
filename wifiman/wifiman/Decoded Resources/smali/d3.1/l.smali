.class public final Ld3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le3/b;


# instance fields
.field private final a:LJg/a;

.field private final b:LJg/a;


# direct methods
.method public constructor <init>(LJg/a;LJg/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld3/l;->a:LJg/a;

    iput-object p2, p0, Ld3/l;->b:LJg/a;

    return-void
.end method

.method public static a(LJg/a;LJg/a;)Ld3/l;
    .locals 1

    new-instance v0, Ld3/l;

    invoke-direct {v0, p0, p1}, Ld3/l;-><init>(LJg/a;LJg/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/Object;)Ld3/k;
    .locals 1

    new-instance v0, Ld3/k;

    check-cast p1, Ld3/i;

    invoke-direct {v0, p0, p1}, Ld3/k;-><init>(Landroid/content/Context;Ld3/i;)V

    return-object v0
.end method


# virtual methods
.method public b()Ld3/k;
    .locals 2

    iget-object v0, p0, Ld3/l;->a:LJg/a;

    invoke-interface {v0}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Ld3/l;->b:LJg/a;

    invoke-interface {v1}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ld3/l;->c(Landroid/content/Context;Ljava/lang/Object;)Ld3/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ld3/l;->b()Ld3/k;

    move-result-object v0

    return-object v0
.end method
