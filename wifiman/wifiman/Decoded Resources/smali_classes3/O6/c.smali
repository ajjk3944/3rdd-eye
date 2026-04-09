.class public final LO6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# instance fields
.field private final a:Lz2/a;


# direct methods
.method public constructor <init>(Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO6/c;->a:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;)LO6/c;
    .locals 1

    new-instance v0, LO6/c;

    invoke-direct {v0, p0}, LO6/c;-><init>(Lz2/a;)V

    return-object v0
.end method

.method public static c(Lgg/y;)LO6/b;
    .locals 1

    new-instance v0, LO6/b;

    invoke-direct {v0, p0}, LO6/b;-><init>(Lgg/y;)V

    return-object v0
.end method


# virtual methods
.method public b()LO6/b;
    .locals 1

    iget-object v0, p0, LO6/c;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgg/y;

    invoke-static {v0}, LO6/c;->c(Lgg/y;)LO6/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LO6/c;->b()LO6/b;

    move-result-object v0

    return-object v0
.end method
