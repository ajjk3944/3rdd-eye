.class public final LK6/z;
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

    iput-object p1, p0, LK6/z;->a:Lz2/a;

    iput-object p2, p0, LK6/z;->b:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;)LK6/z;
    .locals 1

    new-instance v0, LK6/z;

    invoke-direct {v0, p0, p1}, LK6/z;-><init>(Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(LO6/a;LM6/g;)LK6/y;
    .locals 1

    new-instance v0, LK6/y;

    invoke-direct {v0, p0, p1}, LK6/y;-><init>(LO6/a;LM6/g;)V

    return-object v0
.end method


# virtual methods
.method public b()LK6/y;
    .locals 2

    iget-object v0, p0, LK6/z;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO6/a;

    iget-object v1, p0, LK6/z;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM6/g;

    invoke-static {v0, v1}, LK6/z;->c(LO6/a;LM6/g;)LK6/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK6/z;->b()LK6/y;

    move-result-object v0

    return-object v0
.end method
