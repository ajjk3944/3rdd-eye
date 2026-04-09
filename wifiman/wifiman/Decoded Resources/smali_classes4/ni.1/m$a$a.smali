.class public final Lni/m$a$a;
.super Lbi/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lni/m$a;->G(LZh/f;Ljava/util/Collection;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lni/m$a$a;->a:Ljava/util/List;

    invoke-direct {p0}, Lbi/m;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LBh/b;)V
    .locals 1

    const-string v0, "fakeOverride"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lbi/o;->K(LBh/b;Lmh/l;)V

    iget-object v0, p0, Lni/m$a$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected e(LBh/b;LBh/b;)V
    .locals 1

    const-string v0, "fromSuper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fromCurrent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, LDh/s;

    if-eqz v0, :cond_0

    check-cast p2, LDh/s;

    sget-object v0, LBh/v;->a:LBh/v;

    invoke-virtual {p2, v0, p1}, LDh/s;->U0(LBh/a$a;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
