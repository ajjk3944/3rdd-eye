.class Lli/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lli/K;

.field private final b:LUh/n;

.field private final c:Lni/N;


# direct methods
.method public constructor <init>(Lli/K;LUh/n;Lni/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/I;->a:Lli/K;

    iput-object p2, p0, Lli/I;->b:LUh/n;

    iput-object p3, p0, Lli/I;->c:Lni/N;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lli/I;->a:Lli/K;

    iget-object v1, p0, Lli/I;->b:LUh/n;

    iget-object v2, p0, Lli/I;->c:Lni/N;

    invoke-static {v0, v1, v2}, Lli/K;->g(Lli/K;LUh/n;Lni/N;)Ldi/g;

    move-result-object v0

    return-object v0
.end method
