.class public final LG6/s;
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

    iput-object p1, p0, LG6/s;->a:Lz2/a;

    iput-object p2, p0, LG6/s;->b:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;)LG6/s;
    .locals 1

    new-instance v0, LG6/s;

    invoke-direct {v0, p0, p1}, LG6/s;-><init>(Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(ILP6/v;)Lgg/s;
    .locals 0

    invoke-static {p0, p1}, LG6/a$c;->r(ILP6/v;)Lgg/s;

    move-result-object p0

    invoke-static {p0}, Ly2/e;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/s;

    return-object p0
.end method


# virtual methods
.method public b()Lgg/s;
    .locals 2

    iget-object v0, p0, LG6/s;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, LG6/s;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LP6/v;

    invoke-static {v0, v1}, LG6/s;->c(ILP6/v;)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LG6/s;->b()Lgg/s;

    move-result-object v0

    return-object v0
.end method
