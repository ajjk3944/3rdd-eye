.class Lpi/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Ljava/util/Collection;

.field private final b:Lpi/u0;

.field private final c:Lri/o;

.field private final d:Lri/j;


# direct methods
.method public constructor <init>(Ljava/util/Collection;Lpi/u0;Lri/o;Lri/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpi/e;->a:Ljava/util/Collection;

    iput-object p2, p0, Lpi/e;->b:Lpi/u0;

    iput-object p3, p0, Lpi/e;->c:Lri/o;

    iput-object p4, p0, Lpi/e;->d:Lri/j;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpi/e;->a:Ljava/util/Collection;

    iget-object v1, p0, Lpi/e;->b:Lpi/u0;

    iget-object v2, p0, Lpi/e;->c:Lri/o;

    iget-object v3, p0, Lpi/e;->d:Lri/j;

    check-cast p1, Lpi/u0$a;

    invoke-static {v0, v1, v2, v3, p1}, Lpi/g;->a(Ljava/util/Collection;Lpi/u0;Lri/o;Lri/j;Lpi/u0$a;)LYg/J;

    move-result-object p1

    return-object p1
.end method
