.class Lni/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lni/w$b;

.field private final b:Lni/w;


# direct methods
.method public constructor <init>(Lni/w$b;Lni/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lni/F;->a:Lni/w$b;

    iput-object p2, p0, Lni/F;->b:Lni/w;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lni/F;->a:Lni/w$b;

    iget-object v1, p0, Lni/F;->b:Lni/w;

    invoke-static {v0, v1}, Lni/w$b;->p(Lni/w$b;Lni/w;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
