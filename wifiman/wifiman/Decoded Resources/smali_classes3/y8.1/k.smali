.class public final Ly8/k;
.super Ly8/i;
.source "SourceFile"

# interfaces
.implements Ly8/j;


# instance fields
.field private final n:Lgg/i;

.field private final o:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ly8/u;Ljd/b;)V
    .locals 1

    const-string/jumbo v0, "latencyOperator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "networkTopologyService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Ly8/i;-><init>(Ly8/a$b;Ly8/r;Ljd/b;)V

    invoke-virtual {p0}, Ly8/i;->o()Lgg/i;

    move-result-object p1

    iput-object p1, p0, Ly8/k;->n:Lgg/i;

    invoke-virtual {p0}, Ly8/i;->n()Lgg/i;

    move-result-object p1

    iput-object p1, p0, Ly8/k;->o:Lgg/i;

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/k;->n:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/k;->o:Lgg/i;

    return-object v0
.end method
