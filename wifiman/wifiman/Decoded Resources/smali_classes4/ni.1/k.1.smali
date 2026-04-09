.class Lni/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lni/m$a;


# direct methods
.method public constructor <init>(Lni/m$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lni/k;->a:Lni/m$a;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lni/k;->a:Lni/m$a;

    invoke-static {v0}, Lni/m$a;->D(Lni/m$a;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
