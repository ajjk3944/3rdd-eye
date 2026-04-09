.class public final LK6/K;
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

    iput-object p1, p0, LK6/K;->a:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;)LK6/K;
    .locals 1

    new-instance v0, LK6/K;

    invoke-direct {v0, p0}, LK6/K;-><init>(Lz2/a;)V

    return-object v0
.end method

.method public static c(LK6/G;)LK6/J;
    .locals 1

    new-instance v0, LK6/J;

    invoke-direct {v0, p0}, LK6/J;-><init>(LK6/G;)V

    return-object v0
.end method


# virtual methods
.method public b()LK6/J;
    .locals 1

    iget-object v0, p0, LK6/K;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK6/G;

    invoke-static {v0}, LK6/K;->c(LK6/G;)LK6/J;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK6/K;->b()LK6/J;

    move-result-object v0

    return-object v0
.end method
