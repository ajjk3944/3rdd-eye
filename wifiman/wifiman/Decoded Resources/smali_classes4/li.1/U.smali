.class Lli/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lli/X;

.field private final b:LUh/q;


# direct methods
.method public constructor <init>(Lli/X;LUh/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/U;->a:Lli/X;

    iput-object p2, p0, Lli/U;->b:LUh/q;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lli/U;->a:Lli/X;

    iget-object v1, p0, Lli/U;->b:LUh/q;

    invoke-static {v0, v1}, Lli/X;->c(Lli/X;LUh/q;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
