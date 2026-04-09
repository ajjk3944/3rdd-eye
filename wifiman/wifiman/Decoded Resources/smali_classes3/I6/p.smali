.class public final LI6/p;
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

    iput-object p1, p0, LI6/p;->a:Lz2/a;

    iput-object p2, p0, LI6/p;->b:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;)LI6/p;
    .locals 1

    new-instance v0, LI6/p;

    invoke-direct {v0, p0, p1}, LI6/p;-><init>(Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(LJ6/b;Lz2/a;)LI6/o;
    .locals 1

    new-instance v0, LI6/o;

    invoke-direct {v0, p0, p1}, LI6/o;-><init>(LJ6/b;Lz2/a;)V

    return-object v0
.end method


# virtual methods
.method public b()LI6/o;
    .locals 2

    iget-object v0, p0, LI6/p;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ6/b;

    iget-object v1, p0, LI6/p;->b:Lz2/a;

    invoke-static {v0, v1}, LI6/p;->c(LJ6/b;Lz2/a;)LI6/o;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI6/p;->b()LI6/o;

    move-result-object v0

    return-object v0
.end method
