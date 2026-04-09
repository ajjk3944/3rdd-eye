.class Lni/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lni/m;

.field private final b:LUh/g;


# direct methods
.method public constructor <init>(Lni/m;LUh/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lni/q;->a:Lni/m;

    iput-object p2, p0, Lni/q;->b:LUh/g;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lni/q;->a:Lni/m;

    iget-object v1, p0, Lni/q;->b:LUh/g;

    invoke-static {v0, v1}, Lni/m$c;->c(Lni/m;LUh/g;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
