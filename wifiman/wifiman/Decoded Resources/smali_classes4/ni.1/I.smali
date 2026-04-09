.class Lni/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Lni/w$c;


# direct methods
.method public constructor <init>(Lni/w$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lni/I;->a:Lni/w$c;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lni/I;->a:Lni/w$c;

    check-cast p1, LZh/f;

    invoke-static {v0, p1}, Lni/w$c;->i(Lni/w$c;LZh/f;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
