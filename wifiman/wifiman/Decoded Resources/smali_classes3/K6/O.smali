.class public final LK6/O;
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

    iput-object p1, p0, LK6/O;->a:Lz2/a;

    iput-object p2, p0, LK6/O;->b:Lz2/a;

    iput-object p3, p0, LK6/O;->c:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;Lz2/a;)LK6/O;
    .locals 1

    new-instance v0, LK6/O;

    invoke-direct {v0, p0, p1, p2}, LK6/O;-><init>(Lz2/a;Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(LG6/N;II)LK6/N;
    .locals 1

    new-instance v0, LK6/N;

    invoke-direct {v0, p0, p1, p2}, LK6/N;-><init>(LG6/N;II)V

    return-object v0
.end method


# virtual methods
.method public b()LK6/N;
    .locals 3

    iget-object v0, p0, LK6/O;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LG6/N;

    iget-object v1, p0, LK6/O;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, LK6/O;->c:Lz2/a;

    invoke-interface {v2}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v0, v1, v2}, LK6/O;->c(LG6/N;II)LK6/N;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK6/O;->b()LK6/N;

    move-result-object v0

    return-object v0
.end method
