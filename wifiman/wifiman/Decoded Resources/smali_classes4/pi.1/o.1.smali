.class Lpi/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lpi/p$a;

.field private final b:Lpi/p;


# direct methods
.method public constructor <init>(Lpi/p$a;Lpi/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpi/o;->a:Lpi/p$a;

    iput-object p2, p0, Lpi/o;->b:Lpi/p;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpi/o;->a:Lpi/p$a;

    iget-object v1, p0, Lpi/o;->b:Lpi/p;

    invoke-static {v0, v1}, Lpi/p$a;->f(Lpi/p$a;Lpi/p;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
