.class public final synthetic LBe/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/f0;->a:Ljava/lang/String;

    iput-object p2, p0, LBe/f0;->b:Ljava/lang/String;

    iput-object p3, p0, LBe/f0;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LBe/f0;->a:Ljava/lang/String;

    iget-object v1, p0, LBe/f0;->b:Ljava/lang/String;

    iget-object v2, p0, LBe/f0;->c:Ljava/lang/String;

    check-cast p1, Lc0/m;

    check-cast p2, LBe/b0;

    invoke-static {v0, v1, v2, p1, p2}, LBe/m0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc0/m;LBe/b0;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
