.class Lni/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lni/j;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lni/j;->a:Ljava/util/List;

    invoke-static {v0}, Lni/m$a;->C(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
