.class public final LN6/i;
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

    iput-object p1, p0, LN6/i;->a:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;)LN6/i;
    .locals 1

    new-instance v0, LN6/i;

    invoke-direct {v0, p0}, LN6/i;-><init>(Lz2/a;)V

    return-object v0
.end method

.method public static c(LI6/o;)LN6/h;
    .locals 1

    new-instance v0, LN6/h;

    invoke-direct {v0, p0}, LN6/h;-><init>(LI6/o;)V

    return-object v0
.end method


# virtual methods
.method public b()LN6/h;
    .locals 1

    iget-object v0, p0, LN6/i;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI6/o;

    invoke-static {v0}, LN6/i;->c(LI6/o;)LN6/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN6/i;->b()LN6/h;

    move-result-object v0

    return-object v0
.end method
