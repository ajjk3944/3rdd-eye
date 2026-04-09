.class public final LK6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# instance fields
.field private final a:Lz2/a;

.field private final b:Lz2/a;

.field private final c:Lz2/a;


# direct methods
.method public constructor <init>(Lz2/a;Lz2/a;Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/j;->a:Lz2/a;

    iput-object p2, p0, LK6/j;->b:Lz2/a;

    iput-object p3, p0, LK6/j;->c:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;Lz2/a;)LK6/j;
    .locals 1

    new-instance v0, LK6/j;

    invoke-direct {v0, p0, p1, p2}, LK6/j;-><init>(Lz2/a;Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(ZLz2/a;Lz2/a;)LK6/F;
    .locals 0

    invoke-static {p0, p1, p2}, LK6/d;->f(ZLz2/a;Lz2/a;)LK6/F;

    move-result-object p0

    invoke-static {p0}, Ly2/e;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LK6/F;

    return-object p0
.end method


# virtual methods
.method public b()LK6/F;
    .locals 3

    iget-object v0, p0, LK6/j;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v1, p0, LK6/j;->b:Lz2/a;

    iget-object v2, p0, LK6/j;->c:Lz2/a;

    invoke-static {v0, v1, v2}, LK6/j;->c(ZLz2/a;Lz2/a;)LK6/F;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK6/j;->b()LK6/F;

    move-result-object v0

    return-object v0
.end method
