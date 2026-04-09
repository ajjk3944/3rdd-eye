.class Lni/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lni/w$b;


# direct methods
.method public constructor <init>(Lni/w$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lni/B;->a:Lni/w$b;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lni/B;->a:Lni/w$b;

    invoke-static {v0}, Lni/w$b;->l(Lni/w$b;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
