.class public final LK6/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# instance fields
.field private final a:Lz2/a;

.field private final b:Lz2/a;

.field private final c:Lz2/a;

.field private final d:Lz2/a;


# direct methods
.method public constructor <init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/m0;->a:Lz2/a;

    iput-object p2, p0, LK6/m0;->b:Lz2/a;

    iput-object p3, p0, LK6/m0;->c:Lz2/a;

    iput-object p4, p0, LK6/m0;->d:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LK6/m0;
    .locals 1

    new-instance v0, LK6/m0;

    invoke-direct {v0, p0, p1, p2, p3}, LK6/m0;-><init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(Lgg/y;LK6/a;Ljava/lang/Object;Ljava/lang/Object;)LK6/l0;
    .locals 1

    new-instance v0, LK6/l0;

    check-cast p2, LK6/A;

    check-cast p3, LK6/T;

    invoke-direct {v0, p0, p1, p2, p3}, LK6/l0;-><init>(Lgg/y;LK6/a;LK6/A;LK6/T;)V

    return-object v0
.end method


# virtual methods
.method public b()LK6/l0;
    .locals 4

    iget-object v0, p0, LK6/m0;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgg/y;

    iget-object v1, p0, LK6/m0;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LK6/a;

    iget-object v2, p0, LK6/m0;->c:Lz2/a;

    invoke-interface {v2}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, LK6/m0;->d:Lz2/a;

    invoke-interface {v3}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, LK6/m0;->c(Lgg/y;LK6/a;Ljava/lang/Object;Ljava/lang/Object;)LK6/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK6/m0;->b()LK6/l0;

    move-result-object v0

    return-object v0
.end method
