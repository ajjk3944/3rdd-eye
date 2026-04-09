.class public final synthetic LBe/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lmh/l;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/g0;->a:Ljava/lang/String;

    iput-object p2, p0, LBe/g0;->b:Ljava/lang/String;

    iput-object p3, p0, LBe/g0;->c:Ljava/lang/String;

    iput-object p4, p0, LBe/g0;->d:Lmh/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LBe/g0;->a:Ljava/lang/String;

    iget-object v1, p0, LBe/g0;->b:Ljava/lang/String;

    iget-object v2, p0, LBe/g0;->c:Ljava/lang/String;

    iget-object v3, p0, LBe/g0;->d:Lmh/l;

    check-cast p1, Ljava/util/Map;

    invoke-static {v0, v1, v2, v3, p1}, LBe/m0;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmh/l;Ljava/util/Map;)LBe/b0;

    move-result-object p1

    return-object p1
.end method
