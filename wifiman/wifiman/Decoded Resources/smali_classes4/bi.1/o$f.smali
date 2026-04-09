.class final Lbi/o$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbi/o;->p(LBh/b;Ljava/util/Queue;Lbi/n;)Ljava/util/Collection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LBh/b;)LBh/a;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBh/b;

    invoke-virtual {p0, p1}, Lbi/o$f;->a(LBh/b;)LBh/a;

    move-result-object p1

    return-object p1
.end method
