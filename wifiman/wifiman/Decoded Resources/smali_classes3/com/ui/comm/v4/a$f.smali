.class public final Lcom/ui/comm/v4/a$f;
.super Lcom/ui/comm/v4/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/comm/v4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/util/Map;

.field private final f:Lcom/ui/comm/v4/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ui/comm/v4/b;)V
    .locals 1

    const-string/jumbo v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "headers"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "body"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/comm/v4/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/comm/v4/a$f;->c:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/comm/v4/a$f;->d:Ljava/lang/String;

    iput-object p3, p0, Lcom/ui/comm/v4/a$f;->e:Ljava/util/Map;

    iput-object p4, p0, Lcom/ui/comm/v4/a$f;->f:Lcom/ui/comm/v4/b;

    return-void
.end method


# virtual methods
.method public a()Lcom/ui/comm/v4/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/a$f;->f:Lcom/ui/comm/v4/b;

    return-object v0
.end method

.method public final f()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/a$f;->e:Ljava/util/Map;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/a$f;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/a$f;->d:Ljava/lang/String;

    return-object v0
.end method
