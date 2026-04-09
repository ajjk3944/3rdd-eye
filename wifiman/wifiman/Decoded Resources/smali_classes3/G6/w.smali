.class public final LG6/w;
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

    iput-object p1, p0, LG6/w;->a:Lz2/a;

    iput-object p2, p0, LG6/w;->b:Lz2/a;

    iput-object p3, p0, LG6/w;->c:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;Lz2/a;)LG6/w;
    .locals 1

    new-instance v0, LG6/w;

    invoke-direct {v0, p0, p1, p2}, LG6/w;-><init>(Lz2/a;Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(ILz2/a;Lz2/a;)LN6/q;
    .locals 0

    invoke-static {p0, p1, p2}, LG6/a$c;->v(ILz2/a;Lz2/a;)LN6/q;

    move-result-object p0

    invoke-static {p0}, Ly2/e;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LN6/q;

    return-object p0
.end method


# virtual methods
.method public b()LN6/q;
    .locals 3

    iget-object v0, p0, LG6/w;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, LG6/w;->b:Lz2/a;

    iget-object v2, p0, LG6/w;->c:Lz2/a;

    invoke-static {v0, v1, v2}, LG6/w;->c(ILz2/a;Lz2/a;)LN6/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LG6/w;->b()LN6/q;

    move-result-object v0

    return-object v0
.end method
