.class Lni/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lni/m$c;


# direct methods
.method public constructor <init>(Lni/m$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lni/p;->a:Lni/m$c;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lni/p;->a:Lni/m$c;

    invoke-static {v0}, Lni/m$c;->b(Lni/m$c;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
