.class public final Lk3/X;
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

    iput-object p1, p0, Lk3/X;->a:LJg/a;

    iput-object p2, p0, Lk3/X;->b:LJg/a;

    iput-object p3, p0, Lk3/X;->c:LJg/a;

    return-void
.end method

.method public static a(LJg/a;LJg/a;LJg/a;)Lk3/X;
    .locals 1

    new-instance v0, Lk3/X;

    invoke-direct {v0, p0, p1, p2}, Lk3/X;-><init>(LJg/a;LJg/a;LJg/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;I)Lk3/W;
    .locals 1

    new-instance v0, Lk3/W;

    invoke-direct {v0, p0, p1, p2}, Lk3/W;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public b()Lk3/W;
    .locals 3

    iget-object v0, p0, Lk3/X;->a:LJg/a;

    invoke-interface {v0}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lk3/X;->b:LJg/a;

    invoke-interface {v1}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lk3/X;->c:LJg/a;

    invoke-interface {v2}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v0, v1, v2}, Lk3/X;->c(Landroid/content/Context;Ljava/lang/String;I)Lk3/W;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lk3/X;->b()Lk3/W;

    move-result-object v0

    return-object v0
.end method
