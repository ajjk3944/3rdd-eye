.class Lli/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lli/u;


# direct methods
.method public constructor <init>(Lli/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/t;->a:Lli/u;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lli/t;->a:Lli/u;

    invoke-static {v0}, Lli/u;->N0(Lli/u;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
