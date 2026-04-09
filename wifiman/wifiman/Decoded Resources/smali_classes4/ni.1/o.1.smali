.class Lni/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Lni/m$c;

.field private final b:Lni/m;


# direct methods
.method public constructor <init>(Lni/m$c;Lni/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lni/o;->a:Lni/m$c;

    iput-object p2, p0, Lni/o;->b:Lni/m;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lni/o;->a:Lni/m$c;

    iget-object v1, p0, Lni/o;->b:Lni/m;

    check-cast p1, LZh/f;

    invoke-static {v0, v1, p1}, Lni/m$c;->a(Lni/m$c;Lni/m;LZh/f;)LBh/e;

    move-result-object p1

    return-object p1
.end method
