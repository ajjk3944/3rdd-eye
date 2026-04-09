.class public final LK6/S;
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

    iput-object p1, p0, LK6/S;->a:Lz2/a;

    iput-object p2, p0, LK6/S;->b:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;)LK6/S;
    .locals 1

    new-instance v0, LK6/S;

    invoke-direct {v0, p0, p1}, LK6/S;-><init>(Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(LK6/l0;I)LK6/Q;
    .locals 1

    new-instance v0, LK6/Q;

    invoke-direct {v0, p0, p1}, LK6/Q;-><init>(LK6/l0;I)V

    return-object v0
.end method


# virtual methods
.method public b()LK6/Q;
    .locals 2

    iget-object v0, p0, LK6/S;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK6/l0;

    iget-object v1, p0, LK6/S;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, LK6/S;->c(LK6/l0;I)LK6/Q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK6/S;->b()LK6/Q;

    move-result-object v0

    return-object v0
.end method
