.class public abstract Lpi/G;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lpi/I0;

.field private final b:Ljava/util/Set;

.field private final c:Lpi/d0;


# direct methods
.method public constructor <init>(Lpi/I0;Ljava/util/Set;Lpi/d0;)V
    .locals 1

    const-string v0, "howThisTypeIsUsed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpi/G;->a:Lpi/I0;

    iput-object p2, p0, Lpi/G;->b:Ljava/util/Set;

    iput-object p3, p0, Lpi/G;->c:Lpi/d0;

    return-void
.end method


# virtual methods
.method public abstract a()Lpi/d0;
.end method

.method public abstract b()Lpi/I0;
.end method

.method public abstract c()Ljava/util/Set;
.end method

.method public abstract d(LBh/l0;)Lpi/G;
.end method

.method public abstract hashCode()I
.end method
