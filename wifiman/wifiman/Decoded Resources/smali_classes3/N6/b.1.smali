.class public final LN6/b;
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

    iput-object p1, p0, LN6/b;->a:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;)LN6/b;
    .locals 1

    new-instance v0, LN6/b;

    invoke-direct {v0, p0}, LN6/b;-><init>(Lz2/a;)V

    return-object v0
.end method

.method public static c(I)LN6/a;
    .locals 1

    new-instance v0, LN6/a;

    invoke-direct {v0, p0}, LN6/a;-><init>(I)V

    return-object v0
.end method


# virtual methods
.method public b()LN6/a;
    .locals 1

    iget-object v0, p0, LN6/b;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, LN6/b;->c(I)LN6/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN6/b;->b()LN6/a;

    move-result-object v0

    return-object v0
.end method
