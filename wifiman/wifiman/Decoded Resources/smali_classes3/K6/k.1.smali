.class public final LK6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# instance fields
.field private final a:Lz2/a;

.field private final b:Lz2/a;


# direct methods
.method public constructor <init>(Lz2/a;Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/k;->a:Lz2/a;

    iput-object p2, p0, LK6/k;->b:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;)LK6/k;
    .locals 1

    new-instance v0, LK6/k;

    invoke-direct {v0, p0, p1}, LK6/k;-><init>(Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(Lgg/y;LG6/S;)LM6/x;
    .locals 0

    invoke-static {p0, p1}, LK6/d;->g(Lgg/y;LG6/S;)LM6/x;

    move-result-object p0

    invoke-static {p0}, Ly2/e;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LM6/x;

    return-object p0
.end method


# virtual methods
.method public b()LM6/x;
    .locals 2

    iget-object v0, p0, LK6/k;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgg/y;

    iget-object v1, p0, LK6/k;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LG6/S;

    invoke-static {v0, v1}, LK6/k;->c(Lgg/y;LG6/S;)LM6/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK6/k;->b()LM6/x;

    move-result-object v0

    return-object v0
.end method
