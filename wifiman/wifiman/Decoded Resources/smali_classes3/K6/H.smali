.class public final LK6/H;
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

    iput-object p1, p0, LK6/H;->a:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;)LK6/H;
    .locals 1

    new-instance v0, LK6/H;

    invoke-direct {v0, p0}, LK6/H;-><init>(Lz2/a;)V

    return-object v0
.end method

.method public static c(LP6/i;)LK6/G;
    .locals 1

    new-instance v0, LK6/G;

    invoke-direct {v0, p0}, LK6/G;-><init>(LP6/i;)V

    return-object v0
.end method


# virtual methods
.method public b()LK6/G;
    .locals 1

    iget-object v0, p0, LK6/H;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP6/i;

    invoke-static {v0}, LK6/H;->c(LP6/i;)LK6/G;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK6/H;->b()LK6/G;

    move-result-object v0

    return-object v0
.end method
