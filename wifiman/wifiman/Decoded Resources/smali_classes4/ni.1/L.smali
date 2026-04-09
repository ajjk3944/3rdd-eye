.class Lni/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lni/w$c;

.field private final b:Lni/w;


# direct methods
.method public constructor <init>(Lni/w$c;Lni/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lni/L;->a:Lni/w$c;

    iput-object p2, p0, Lni/L;->b:Lni/w;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lni/L;->a:Lni/w$c;

    iget-object v1, p0, Lni/L;->b:Lni/w;

    invoke-static {v0, v1}, Lni/w$c;->l(Lni/w$c;Lni/w;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
