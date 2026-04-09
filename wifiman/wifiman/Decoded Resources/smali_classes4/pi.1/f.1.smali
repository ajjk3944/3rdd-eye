.class Lpi/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lpi/u0;

.field private final b:Lri/o;

.field private final c:Lri/j;

.field private final d:Lri/j;


# direct methods
.method public constructor <init>(Lpi/u0;Lri/o;Lri/j;Lri/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpi/f;->a:Lpi/u0;

    iput-object p2, p0, Lpi/f;->b:Lri/o;

    iput-object p3, p0, Lpi/f;->c:Lri/j;

    iput-object p4, p0, Lpi/f;->d:Lri/j;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpi/f;->a:Lpi/u0;

    iget-object v1, p0, Lpi/f;->b:Lri/o;

    iget-object v2, p0, Lpi/f;->c:Lri/j;

    iget-object v3, p0, Lpi/f;->d:Lri/j;

    invoke-static {v0, v1, v2, v3}, Lpi/g;->b(Lpi/u0;Lri/o;Lri/j;Lri/j;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
