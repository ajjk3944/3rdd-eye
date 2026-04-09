.class public final Ly8/m;
.super Ly8/i;
.source "SourceFile"

# interfaces
.implements Ly8/l;


# instance fields
.field private final n:Lgg/i;

.field private final o:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ly8/a$b;Ly8/v;Ljd/b;)V
    .locals 1

    const-string/jumbo v0, "markerManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "latencyOperator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "networkTopologyService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Ly8/i;-><init>(Ly8/a$b;Ly8/r;Ljd/b;)V

    invoke-virtual {p0}, Ly8/i;->o()Lgg/i;

    move-result-object p1

    iput-object p1, p0, Ly8/m;->n:Lgg/i;

    invoke-virtual {p0}, Ly8/i;->n()Lgg/i;

    move-result-object p1

    iput-object p1, p0, Ly8/m;->o:Lgg/i;

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/m;->n:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/m;->o:Lgg/i;

    return-object v0
.end method
