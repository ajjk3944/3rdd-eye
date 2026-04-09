.class final Lbi/o$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbi/o;->r(Ljava/util/Set;)Ljava/util/Set;
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
.method public a(LBh/a;LBh/a;)LYg/s;
    .locals 1

    new-instance v0, LYg/s;

    invoke-direct {v0, p1, p2}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBh/a;

    check-cast p2, LBh/a;

    invoke-virtual {p0, p1, p2}, Lbi/o$b;->a(LBh/a;LBh/a;)LYg/s;

    move-result-object p1

    return-object p1
.end method
